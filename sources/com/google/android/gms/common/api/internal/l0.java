package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import m.r3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l0 implements w0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final l6.e d;
    public final g0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final r3 j;
    public final Map k;
    public final b8.d l;
    public volatile j0 m;
    public int n;
    public final i0 o;
    public final u0 p;

    public l0(Context context, i0 i0Var, Lock lock, Looper looper, l6.e eVar, a0.f fVar, r3 r3Var, a0.f fVar2, b8.d dVar, ArrayList arrayList, u0 u0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = r3Var;
        this.k = fVar2;
        this.l = dVar;
        this.o = i0Var;
        this.p = u0Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o1) arrayList.get(i10)).c = this;
        }
        this.e = new g0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new b6.i(this, 10);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a() {
        this.m.k();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean b() {
        return this.m instanceof z;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final e c(e eVar) {
        eVar.l();
        return this.m.G(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void e() {
        if (this.m.F()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean f(b6.d dVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            o6.l.h(cVar);
            cVar.e(valueOf.concat("  "), printWriter);
        }
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new b6.i(this, 10);
            this.m.u();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.c(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        this.a.lock();
        try {
            this.m.o(i10);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void d() {
    }
}
