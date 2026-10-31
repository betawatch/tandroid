package com.google.android.recaptcha.internal;

import cd.c;
import cd.f;
import cd.g;
import cd.h;
import dd.a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import ld.l;
import qd.b;
import td.a1;
import td.b0;
import td.f1;
import td.g1;
import td.h0;
import td.o0;
import td.p;
import td.r;
import td.r1;
import td.s;
import td.s1;
import td.t;
import td.t1;
import td.u1;
import v7.g5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzde implements h0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // td.f1
    public final p attachChild(r rVar) {
        return ((u1) this.zza).attachChild(rVar);
    }

    @Override // td.h0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        a aVar = a.a;
        return h;
    }

    @Override // td.f1
    public final void cancel(CancellationException cancellationException) {
        ((u1) this.zza).cancel(cancellationException);
    }

    @Override // cd.h
    public final Object fold(Object obj, ld.p operation) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        i.e(operation, "operation");
        return operation.invoke(obj, u1Var);
    }

    @Override // cd.h
    public final f get(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return g5.a(u1Var, gVar);
    }

    @Override // td.f1
    public final CancellationException getCancellationException() {
        return ((u1) this.zza).getCancellationException();
    }

    @Override // td.f1
    public final b getChildren() {
        return ((u1) this.zza).getChildren();
    }

    @Override // td.h0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // td.h0
    public final Throwable getCompletionExceptionOrNull() {
        return ((u1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // cd.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final be.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.s.a(3, r1.a);
        kotlin.jvm.internal.s.a(3, s1.a);
        return new a9.r(tVar);
    }

    public final be.a getOnJoin() {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        kotlin.jvm.internal.s.a(3, t1.a);
        return new a6.i(u1Var, 8);
    }

    @Override // td.f1
    public final f1 getParent() {
        return ((u1) this.zza).getParent();
    }

    @Override // td.f1
    public final o0 invokeOnCompletion(l lVar) {
        return ((u1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // td.f1
    public final boolean isActive() {
        return ((u1) this.zza).isActive();
    }

    @Override // td.f1
    public final boolean isCancelled() {
        return ((u1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((u1) this.zza).u() instanceof a1);
    }

    @Override // td.f1
    public final Object join(c cVar) {
        return ((u1) this.zza).join(cVar);
    }

    @Override // cd.h
    public final h minusKey(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return g5.b(u1Var, gVar);
    }

    public final f1 plus(f1 f1Var) {
        ((u1) this.zza).getClass();
        return f1Var;
    }

    @Override // td.f1
    public final boolean start() {
        return ((u1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((u1) this.zza).cancel(null);
    }

    @Override // td.f1
    public final o0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((u1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // cd.h
    public final h plus(h hVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return g5.c(u1Var, hVar);
    }

    public final boolean cancel(Throwable th2) {
        CancellationException g1Var;
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        if (th2 != null) {
            g1Var = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (g1Var == null) {
                g1Var = new g1(u1Var.k(), th2, u1Var);
            }
        } else {
            g1Var = new g1(u1Var.k(), null, u1Var);
        }
        u1Var.i(g1Var);
        return true;
    }
}
