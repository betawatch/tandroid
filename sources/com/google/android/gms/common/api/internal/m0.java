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
import m.t3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 implements x0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final u5.e d;
    public final h0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final t3 j;
    public final Map k;
    public final b7.d l;
    public volatile k0 m;
    public int n;
    public final j0 o;
    public final v0 p;

    public m0(Context context, j0 j0Var, Lock lock, Looper looper, u5.e eVar, a0.f fVar, t3 t3Var, a0.f fVar2, b7.d dVar, ArrayList arrayList, v0 v0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = t3Var;
        this.k = fVar2;
        this.l = dVar;
        this.o = j0Var;
        this.p = v0Var;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((o1) arrayList.get(i9)).c = this;
        }
        this.e = new h0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new k5.i(this, 8);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void a() {
        this.m.j();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean b() {
        return this.m instanceof a0;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final e c(e eVar) {
        eVar.l();
        return this.m.C(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean d(k5.d dVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void f() {
        if (this.m.A()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            x5.l.h(cVar);
            cVar.g(valueOf.concat("  "), printWriter);
        }
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new k5.i(this, 8);
            this.m.v();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.b(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i9) {
        this.a.lock();
        try {
            this.m.r(i9);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void e() {
    }
}
