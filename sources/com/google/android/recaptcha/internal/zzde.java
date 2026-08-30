package com.google.android.recaptcha.internal;

import dd.l;
import id.b;
import java.util.concurrent.CancellationException;
import k7.b8;
import kotlin.jvm.internal.j;
import ld.a1;
import ld.b0;
import ld.f1;
import ld.g1;
import ld.h0;
import ld.o0;
import ld.p;
import ld.r;
import ld.r1;
import ld.s;
import ld.s1;
import ld.t;
import ld.t1;
import ld.u1;
import o2.o;
import s0.d;
import uc.c;
import uc.f;
import uc.g;
import uc.h;
import vc.a;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzde implements h0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // ld.f1
    public final p attachChild(r rVar) {
        return ((u1) this.zza).attachChild(rVar);
    }

    @Override // ld.h0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        a aVar = a.a;
        return h;
    }

    @Override // ld.f1
    public final void cancel(CancellationException cancellationException) {
        ((u1) this.zza).cancel(cancellationException);
    }

    @Override // uc.h
    public final Object fold(Object obj, dd.p operation) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        j.e(operation, "operation");
        return operation.invoke(obj, u1Var);
    }

    @Override // uc.h
    public final f get(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return b8.a(u1Var, gVar);
    }

    @Override // ld.f1
    public final CancellationException getCancellationException() {
        return ((u1) this.zza).getCancellationException();
    }

    @Override // ld.f1
    public final b getChildren() {
        return ((u1) this.zza).getChildren();
    }

    @Override // ld.h0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // ld.h0
    public final Throwable getCompletionExceptionOrNull() {
        return ((u1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // uc.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final td.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.t.a(3, r1.a);
        kotlin.jvm.internal.t.a(3, s1.a);
        return new d(tVar);
    }

    public final td.a getOnJoin() {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        kotlin.jvm.internal.t.a(3, t1.a);
        return new o(u1Var, 24);
    }

    @Override // ld.f1
    public final f1 getParent() {
        return ((u1) this.zza).getParent();
    }

    @Override // ld.f1
    public final o0 invokeOnCompletion(l lVar) {
        return ((u1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // ld.f1
    public final boolean isActive() {
        return ((u1) this.zza).isActive();
    }

    @Override // ld.f1
    public final boolean isCancelled() {
        return ((u1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((u1) this.zza).u() instanceof a1);
    }

    @Override // ld.f1
    public final Object join(c cVar) {
        return ((u1) this.zza).join(cVar);
    }

    @Override // uc.h
    public final h minusKey(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return b8.b(u1Var, gVar);
    }

    public final f1 plus(f1 f1Var) {
        ((u1) this.zza).getClass();
        return f1Var;
    }

    @Override // ld.f1
    public final boolean start() {
        return ((u1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((u1) this.zza).cancel(null);
    }

    @Override // ld.f1
    public final o0 invokeOnCompletion(boolean z4, boolean z10, l lVar) {
        return ((u1) this.zza).invokeOnCompletion(z4, z10, lVar);
    }

    @Override // uc.h
    public final h plus(h hVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return b8.c(u1Var, hVar);
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
