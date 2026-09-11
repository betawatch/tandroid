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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m0 implements x0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final k6.e d;
    public final h0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final p3 j;
    public final Map k;
    public final a8.d l;
    public volatile k0 m;
    public int n;
    public final j0 o;
    public final v0 p;

    public m0(Context context, j0 j0Var, Lock lock, Looper looper, k6.e eVar, a0.f fVar, p3 p3Var, a0.f fVar2, a8.d dVar, ArrayList arrayList, v0 v0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = p3Var;
        this.k = fVar2;
        this.l = dVar;
        this.o = j0Var;
        this.p = v0Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p1) arrayList.get(i10)).c = this;
        }
        this.e = new h0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new xa.c(this, 10);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void a() {
        this.m.f();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean b() {
        return this.m instanceof a0;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final e c(e eVar) {
        eVar.l();
        return this.m.A(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean d(a6.d dVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void f() {
        if (this.m.z()) {
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
            n6.l.h(cVar);
            cVar.g(valueOf.concat("  "), printWriter);
        }
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new xa.c(this, 10);
            this.m.x();
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
            this.m.w(i10);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void e() {
    }
}
