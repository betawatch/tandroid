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
import m.q3;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g0 implements p0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final n6.e d;
    public final c0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final q3 j;
    public final Map k;
    public final a9.e l;
    public volatile e0 m;
    public int n;
    public final d0 o;
    public final o0 p;

    public g0(Context context, d0 d0Var, Lock lock, Looper looper, n6.e eVar, a0.f fVar, q3 q3Var, a0.f fVar2, a9.e eVar2, ArrayList arrayList, o0 o0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = q3Var;
        this.k = fVar2;
        this.l = eVar2;
        this.o = d0Var;
        this.p = o0Var;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e1) arrayList.get(i7)).c = this;
        }
        this.e = new c0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new d6.i(this, 14);
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void a() {
        this.m.a();
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final d b(d dVar) {
        dVar.l();
        return this.m.b(dVar);
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void c() {
        if (this.m.I()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            q6.m.g(cVar);
            cVar.b(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final boolean e(d6.d dVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final boolean g() {
        return this.m instanceof v;
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new d6.i(this, 14);
            this.m.R();
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
    public final void onConnectionSuspended(int i7) {
        this.a.lock();
        try {
            this.m.A(i7);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void f() {
    }
}
