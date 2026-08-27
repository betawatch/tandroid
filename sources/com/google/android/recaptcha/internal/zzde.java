package com.google.android.recaptcha.internal;

import ad.l;
import fd.b;
import h7.y6;
import id.b0;
import id.b1;
import id.g1;
import id.h1;
import id.i0;
import id.p;
import id.p0;
import id.r;
import id.s;
import id.s1;
import id.t;
import id.t1;
import id.u1;
import id.v1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import rc.c;
import rc.f;
import rc.g;
import rc.h;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzde implements i0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // id.g1
    public final p attachChild(r rVar) {
        return ((v1) this.zza).attachChild(rVar);
    }

    @Override // id.i0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        sc.a aVar = sc.a.a;
        return h;
    }

    @Override // id.g1
    public final void cancel(CancellationException cancellationException) {
        ((v1) this.zza).cancel(cancellationException);
    }

    @Override // rc.h
    public final Object fold(Object obj, ad.p operation) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        j.e(operation, "operation");
        return operation.invoke(obj, v1Var);
    }

    @Override // rc.h
    public final f get(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return y6.a(v1Var, gVar);
    }

    @Override // id.g1
    public final CancellationException getCancellationException() {
        return ((v1) this.zza).getCancellationException();
    }

    @Override // id.g1
    public final b getChildren() {
        return ((v1) this.zza).getChildren();
    }

    @Override // id.i0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // id.i0
    public final Throwable getCompletionExceptionOrNull() {
        return ((v1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // rc.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final qd.c getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.t.a(3, s1.a);
        kotlin.jvm.internal.t.a(3, t1.a);
        return new e.a(tVar);
    }

    public final qd.a getOnJoin() {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        kotlin.jvm.internal.t.a(3, u1.a);
        return new qd.b(v1Var);
    }

    @Override // id.g1
    public final g1 getParent() {
        return ((v1) this.zza).getParent();
    }

    @Override // id.g1
    public final p0 invokeOnCompletion(l lVar) {
        return ((v1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // id.g1
    public final boolean isActive() {
        return ((v1) this.zza).isActive();
    }

    @Override // id.g1
    public final boolean isCancelled() {
        return ((v1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((v1) this.zza).u() instanceof b1);
    }

    @Override // id.g1
    public final Object join(c cVar) {
        return ((v1) this.zza).join(cVar);
    }

    @Override // rc.h
    public final h minusKey(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return y6.b(v1Var, gVar);
    }

    public final g1 plus(g1 g1Var) {
        ((v1) this.zza).getClass();
        return g1Var;
    }

    @Override // id.g1
    public final boolean start() {
        return ((v1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((v1) this.zza).cancel(null);
    }

    @Override // id.g1
    public final p0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((v1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // rc.h
    public final h plus(h hVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return y6.c(v1Var, hVar);
    }

    public final boolean cancel(Throwable th) {
        CancellationException h1Var;
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        if (th != null) {
            h1Var = th instanceof CancellationException ? (CancellationException) th : null;
            if (h1Var == null) {
                h1Var = new h1(v1Var.k(), th, v1Var);
            }
        } else {
            h1Var = new h1(v1Var.k(), null, v1Var);
        }
        v1Var.i(h1Var);
        return true;
    }
}
