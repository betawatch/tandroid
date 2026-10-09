package com.google.android.recaptcha.internal;

import ae.c0;
import ae.c1;
import ae.h1;
import ae.i1;
import ae.j0;
import ae.p;
import ae.q0;
import ae.r;
import ae.s;
import ae.t;
import ae.t1;
import ae.u1;
import ae.v1;
import ae.w1;
import java.util.concurrent.CancellationException;
import jd.c;
import jd.f;
import jd.g;
import jd.h;
import kd.a;
import kotlin.jvm.internal.i;
import sd.l;
import v7.v8;
import xd.b;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class zzde implements j0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // ae.h1
    public final p attachChild(r rVar) {
        return ((w1) this.zza).attachChild(rVar);
    }

    @Override // ae.j0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        a aVar = a.a;
        return h;
    }

    @Override // ae.h1
    public final void cancel(CancellationException cancellationException) {
        ((w1) this.zza).cancel(cancellationException);
    }

    @Override // jd.h
    public final Object fold(Object obj, sd.p operation) {
        w1 w1Var = (w1) this.zza;
        w1Var.getClass();
        i.e(operation, "operation");
        return operation.invoke(obj, w1Var);
    }

    @Override // jd.h
    public final f get(g gVar) {
        w1 w1Var = (w1) this.zza;
        w1Var.getClass();
        return v8.a(w1Var, gVar);
    }

    @Override // ae.h1
    public final CancellationException getCancellationException() {
        return ((w1) this.zza).getCancellationException();
    }

    @Override // ae.h1
    public final b getChildren() {
        return ((w1) this.zza).getChildren();
    }

    @Override // ae.j0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // ae.j0
    public final Throwable getCompletionExceptionOrNull() {
        return ((w1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // jd.f
    public final g getKey() {
        this.zza.getClass();
        return c0.b;
    }

    public final ie.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.s.a(3, t1.a);
        kotlin.jvm.internal.s.a(3, u1.a);
        return new e.a(tVar);
    }

    public final ie.a getOnJoin() {
        w1 w1Var = (w1) this.zza;
        w1Var.getClass();
        kotlin.jvm.internal.s.a(3, v1.a);
        return new a9.r(w1Var);
    }

    @Override // ae.h1
    public final h1 getParent() {
        return ((w1) this.zza).getParent();
    }

    @Override // ae.h1
    public final q0 invokeOnCompletion(l lVar) {
        return ((w1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // ae.h1
    public final boolean isActive() {
        return ((w1) this.zza).isActive();
    }

    @Override // ae.h1
    public final boolean isCancelled() {
        return ((w1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((w1) this.zza).u() instanceof c1);
    }

    @Override // ae.h1
    public final Object join(c cVar) {
        return ((w1) this.zza).join(cVar);
    }

    @Override // jd.h
    public final h minusKey(g gVar) {
        w1 w1Var = (w1) this.zza;
        w1Var.getClass();
        return v8.b(w1Var, gVar);
    }

    public final h1 plus(h1 h1Var) {
        ((w1) this.zza).getClass();
        return h1Var;
    }

    @Override // ae.h1
    public final boolean start() {
        return ((w1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((w1) this.zza).cancel(null);
    }

    @Override // ae.h1
    public final q0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((w1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // jd.h
    public final h plus(h hVar) {
        w1 w1Var = (w1) this.zza;
        w1Var.getClass();
        return v8.c(w1Var, hVar);
    }

    public final boolean cancel(Throwable th2) {
        CancellationException i1Var;
        w1 w1Var = (w1) this.zza;
        w1Var.getClass();
        if (th2 != null) {
            i1Var = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (i1Var == null) {
                i1Var = new i1(w1Var.k(), th2, w1Var);
            }
        } else {
            i1Var = new i1(w1Var.k(), null, w1Var);
        }
        w1Var.i(i1Var);
        return true;
    }
}
