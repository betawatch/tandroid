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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h0 implements q0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final n6.e d;
    public final d0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final ga.d j;
    public final Map k;
    public final a9.e l;
    public volatile f0 m;
    public int n;
    public final e0 o;
    public final p0 p;

    public h0(Context context, e0 e0Var, Lock lock, Looper looper, n6.e eVar, a0.f fVar, ga.d dVar, a0.f fVar2, a9.e eVar2, ArrayList arrayList, p0 p0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = dVar;
        this.k = fVar2;
        this.l = eVar2;
        this.o = e0Var;
        this.p = p0Var;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((f1) arrayList.get(i7)).c = this;
        }
        this.e = new d0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new ob.c(this, 12);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void a() {
        this.m.a();
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final d b(d dVar) {
        dVar.l();
        return this.m.b(dVar);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void c() {
        if (this.m.p()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            q6.m.h(cVar);
            cVar.b(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final boolean e(d6.d dVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final boolean g() {
        return this.m instanceof w;
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new ob.c(this, 12);
            this.m.s();
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
            this.m.o(i7);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void f() {
    }
}
