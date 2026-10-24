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
import m.s3;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class l0 implements w0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final k6.e d;
    public final g0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final s3 j;
    public final Map k;
    public final a8.d l;
    public volatile j0 m;
    public int n;
    public final i0 o;
    public final u0 p;

    public l0(Context context, i0 i0Var, Lock lock, Looper looper, k6.e eVar, a0.f fVar, s3 s3Var, a0.f fVar2, a8.d dVar, ArrayList arrayList, u0 u0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = s3Var;
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
        this.m = new ya.c(this, 10);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a() {
        this.m.b();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean b() {
        return this.m instanceof z;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final e c(e eVar) {
        eVar.l();
        return this.m.D(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean d(a6.d dVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void f() {
        if (this.m.A()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            n6.l.h(cVar);
            cVar.g(valueOf.concat("  "), printWriter);
        }
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new ya.c(this, 10);
            this.m.y();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        this.a.lock();
        try {
            this.m.w(i10);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void e() {
    }
}
