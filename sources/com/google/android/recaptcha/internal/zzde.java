package com.google.android.recaptcha.internal;

import b8.cc;
import c9.o;
import fd.c;
import fd.f;
import fd.g;
import fd.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import od.l;
import td.b;
import wd.a1;
import wd.b1;
import wd.e0;
import wd.k1;
import wd.l0;
import wd.l1;
import wd.m1;
import wd.n1;
import wd.p;
import wd.r;
import wd.s;
import wd.t;
import wd.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzde implements e0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // wd.a1
    public final p attachChild(r rVar) {
        return ((n1) this.zza).attachChild(rVar);
    }

    @Override // wd.e0
    public final Object await(c cVar) {
        Object i3 = ((t) this.zza).i(cVar);
        gd.a aVar = gd.a.a;
        return i3;
    }

    @Override // wd.a1
    public final void cancel(CancellationException cancellationException) {
        ((n1) this.zza).cancel(cancellationException);
    }

    @Override // fd.h
    public final Object fold(Object obj, od.p operation) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        j.e(operation, "operation");
        return operation.invoke(obj, n1Var);
    }

    @Override // fd.h
    public final f get(g gVar) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        return cc.a(n1Var, gVar);
    }

    @Override // wd.a1
    public final CancellationException getCancellationException() {
        return ((n1) this.zza).getCancellationException();
    }

    @Override // wd.a1
    public final b getChildren() {
        return ((n1) this.zza).getChildren();
    }

    @Override // wd.e0
    public final Object getCompleted() {
        return ((t) this.zza).r();
    }

    @Override // wd.e0
    public final Throwable getCompletionExceptionOrNull() {
        return ((n1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // fd.f
    public final g getKey() {
        this.zza.getClass();
        return y.b;
    }

    public final ee.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        u.a(3, k1.a);
        u.a(3, l1.a);
        return new e.a(tVar);
    }

    public final ee.a getOnJoin() {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        u.a(3, m1.a);
        return new o(n1Var);
    }

    public final a1 getParent() {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        p pVar = (p) n1.b.get(n1Var);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    @Override // wd.a1
    public final l0 invokeOnCompletion(l lVar) {
        return ((n1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // wd.a1
    public final boolean isActive() {
        return ((n1) this.zza).isActive();
    }

    @Override // wd.a1
    public final boolean isCancelled() {
        return ((n1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return ((n1) this.zza).A();
    }

    @Override // wd.a1
    public final Object join(c cVar) {
        return ((n1) this.zza).join(cVar);
    }

    @Override // fd.h
    public final h minusKey(g gVar) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        return cc.b(n1Var, gVar);
    }

    public final a1 plus(a1 a1Var) {
        ((n1) this.zza).getClass();
        return a1Var;
    }

    @Override // wd.a1
    public final boolean start() {
        return ((n1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((n1) this.zza).cancel(null);
    }

    @Override // wd.a1
    public final l0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((n1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // fd.h
    public final h plus(h hVar) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        return cc.c(n1Var, hVar);
    }

    public final /* synthetic */ boolean cancel(Throwable th2) {
        CancellationException b1Var;
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        if (th2 != null) {
            b1Var = n1.N(n1Var, th2);
        } else {
            b1Var = new b1(n1Var.m(), null, n1Var);
        }
        n1Var.k(b1Var);
        return true;
    }
}
