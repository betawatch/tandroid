package com.google.android.recaptcha.internal;

import be.b0;
import be.b1;
import be.g1;
import be.h1;
import be.i0;
import be.p;
import be.p0;
import be.r;
import be.s;
import be.s1;
import be.t;
import be.t1;
import be.u1;
import be.v1;
import java.util.concurrent.CancellationException;
import kd.c;
import kd.f;
import kd.g;
import kotlin.jvm.internal.i;
import ld.a;
import td.l;
import w7.h;
import yd.b;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class zzde implements i0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // be.g1
    public final p attachChild(r rVar) {
        return ((v1) this.zza).attachChild(rVar);
    }

    @Override // be.i0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        a aVar = a.a;
        return h;
    }

    @Override // be.g1
    public final void cancel(CancellationException cancellationException) {
        ((v1) this.zza).cancel(cancellationException);
    }

    @Override // kd.h
    public final Object fold(Object obj, td.p operation) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        i.e(operation, "operation");
        return operation.invoke(obj, v1Var);
    }

    @Override // kd.h
    public final f get(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return h.a(v1Var, gVar);
    }

    @Override // be.g1
    public final CancellationException getCancellationException() {
        return ((v1) this.zza).getCancellationException();
    }

    @Override // be.g1
    public final b getChildren() {
        return ((v1) this.zza).getChildren();
    }

    @Override // be.i0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // be.i0
    public final Throwable getCompletionExceptionOrNull() {
        return ((v1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // kd.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final je.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.s.a(3, s1.a);
        kotlin.jvm.internal.s.a(3, t1.a);
        return new a9.r(tVar);
    }

    public final je.a getOnJoin() {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        kotlin.jvm.internal.s.a(3, u1.a);
        return new a6.i(v1Var, 27);
    }

    @Override // be.g1
    public final g1 getParent() {
        return ((v1) this.zza).getParent();
    }

    @Override // be.g1
    public final p0 invokeOnCompletion(l lVar) {
        return ((v1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // be.g1
    public final boolean isActive() {
        return ((v1) this.zza).isActive();
    }

    @Override // be.g1
    public final boolean isCancelled() {
        return ((v1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((v1) this.zza).u() instanceof b1);
    }

    @Override // be.g1
    public final Object join(c cVar) {
        return ((v1) this.zza).join(cVar);
    }

    @Override // kd.h
    public final kd.h minusKey(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return h.b(v1Var, gVar);
    }

    public final g1 plus(g1 g1Var) {
        ((v1) this.zza).getClass();
        return g1Var;
    }

    @Override // be.g1
    public final boolean start() {
        return ((v1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((v1) this.zza).cancel(null);
    }

    @Override // be.g1
    public final p0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((v1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // kd.h
    public final kd.h plus(kd.h hVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return h.c(v1Var, hVar);
    }

    public final boolean cancel(Throwable th2) {
        CancellationException h1Var;
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        if (th2 != null) {
            h1Var = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (h1Var == null) {
                h1Var = new h1(v1Var.k(), th2, v1Var);
            }
        } else {
            h1Var = new h1(v1Var.k(), null, v1Var);
        }
        v1Var.i(h1Var);
        return true;
    }
}
