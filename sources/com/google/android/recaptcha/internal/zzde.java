package com.google.android.recaptcha.internal;

import ed.b;
import g7.u6;
import hd.b0;
import hd.b1;
import hd.g1;
import hd.h1;
import hd.i0;
import hd.p;
import hd.p0;
import hd.r;
import hd.s;
import hd.s1;
import hd.t;
import hd.t1;
import hd.u1;
import hd.v1;
import java.util.concurrent.CancellationException;
import k8.o;
import kotlin.jvm.internal.i;
import qc.c;
import qc.f;
import qc.g;
import qc.h;
import rc.a;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzde implements i0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // hd.g1
    public final p attachChild(r rVar) {
        return ((v1) this.zza).attachChild(rVar);
    }

    @Override // hd.i0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        a aVar = a.a;
        return h;
    }

    @Override // hd.g1
    public final void cancel(CancellationException cancellationException) {
        ((v1) this.zza).cancel(cancellationException);
    }

    @Override // qc.h
    public final Object fold(Object obj, zc.p operation) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        i.e(operation, "operation");
        return operation.invoke(obj, v1Var);
    }

    @Override // qc.h
    public final f get(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return u6.a(v1Var, gVar);
    }

    @Override // hd.g1
    public final CancellationException getCancellationException() {
        return ((v1) this.zza).getCancellationException();
    }

    @Override // hd.g1
    public final b getChildren() {
        return ((v1) this.zza).getChildren();
    }

    @Override // hd.i0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // hd.i0
    public final Throwable getCompletionExceptionOrNull() {
        return ((v1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // qc.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final pd.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.s.a(3, s1.a);
        kotlin.jvm.internal.s.a(3, t1.a);
        return new o(tVar);
    }

    public final pd.a getOnJoin() {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        kotlin.jvm.internal.s.a(3, u1.a);
        return new e.a(v1Var);
    }

    @Override // hd.g1
    public final g1 getParent() {
        return ((v1) this.zza).getParent();
    }

    @Override // hd.g1
    public final p0 invokeOnCompletion(l lVar) {
        return ((v1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // hd.g1
    public final boolean isActive() {
        return ((v1) this.zza).isActive();
    }

    @Override // hd.g1
    public final boolean isCancelled() {
        return ((v1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((v1) this.zza).u() instanceof b1);
    }

    @Override // hd.g1
    public final Object join(c cVar) {
        return ((v1) this.zza).join(cVar);
    }

    @Override // qc.h
    public final h minusKey(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return u6.b(v1Var, gVar);
    }

    public final g1 plus(g1 g1Var) {
        ((v1) this.zza).getClass();
        return g1Var;
    }

    @Override // hd.g1
    public final boolean start() {
        return ((v1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((v1) this.zza).cancel(null);
    }

    @Override // hd.g1
    public final p0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((v1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // qc.h
    public final h plus(h hVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return u6.c(v1Var, hVar);
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
