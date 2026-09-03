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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m0 implements x0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final y5.e d;
    public final h0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final s3 j;
    public final Map k;
    public final a8.j l;
    public volatile k0 m;
    public int n;
    public final j0 o;
    public final v0 p;

    public m0(Context context, j0 j0Var, Lock lock, Looper looper, y5.e eVar, a0.f fVar, s3 s3Var, a0.f fVar2, a8.j jVar, ArrayList arrayList, v0 v0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = s3Var;
        this.k = fVar2;
        this.l = jVar;
        this.o = j0Var;
        this.p = v0Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q1) arrayList.get(i10)).c = this;
        }
        this.e = new h0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new bb.b(this, 6);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void a() {
        this.m.h();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean b() {
        return this.m instanceof a0;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final e c(e eVar) {
        eVar.l();
        return this.m.H(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void e() {
        if (this.m.D()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            b6.m.h(cVar);
            cVar.f(valueOf.concat("  "), printWriter);
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean g(o5.d dVar) {
        return false;
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new bb.b(this, 6);
            this.m.w();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.d(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        this.a.lock();
        try {
            this.m.t(i10);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void d() {
    }
}
