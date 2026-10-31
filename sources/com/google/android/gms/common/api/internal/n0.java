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
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 implements y0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final k6.e d;
    public final i0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final p3 j;
    public final Map k;
    public final a8.d l;
    public volatile l0 m;
    public int n;
    public final k0 o;
    public final w0 p;

    public n0(Context context, k0 k0Var, Lock lock, Looper looper, k6.e eVar, a0.f fVar, p3 p3Var, a0.f fVar2, a8.d dVar, ArrayList arrayList, w0 w0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = p3Var;
        this.k = fVar2;
        this.l = dVar;
        this.o = k0Var;
        this.p = w0Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p1) arrayList.get(i10)).c = this;
        }
        this.e = new i0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new a6.i(this, 15);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a() {
        this.m.q();
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final boolean b() {
        return this.m instanceof a0;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final e c(e eVar) {
        eVar.l();
        return this.m.j0(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final boolean d(a6.d dVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void f() {
        if (this.m.b0()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            n6.l.g(cVar);
            cVar.h(valueOf.concat("  "), printWriter);
        }
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new a6.i(this, 15);
            this.m.Q();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.l(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        this.a.lock();
        try {
            this.m.K(i10);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void e() {
    }
}
