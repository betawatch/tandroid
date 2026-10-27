package com.google.android.recaptcha.internal;

import a8.yd;
import ce.b0;
import ce.b1;
import ce.g1;
import ce.h1;
import ce.i0;
import ce.p;
import ce.p0;
import ce.r;
import ce.s;
import ce.s1;
import ce.t;
import ce.t1;
import ce.u1;
import ce.v1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import ld.c;
import ld.f;
import ld.g;
import ld.h;
import md.a;
import ud.l;
import zd.b;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzde implements i0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // ce.g1
    public final p attachChild(r rVar) {
        return ((v1) this.zza).attachChild(rVar);
    }

    @Override // ce.i0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        a aVar = a.a;
        return h;
    }

    @Override // ce.g1
    public final void cancel(CancellationException cancellationException) {
        ((v1) this.zza).cancel(cancellationException);
    }

    @Override // ld.h
    public final Object fold(Object obj, ud.p operation) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        i.e(operation, "operation");
        return operation.invoke(obj, v1Var);
    }

    @Override // ld.h
    public final f get(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return yd.a(v1Var, gVar);
    }

    @Override // ce.g1
    public final CancellationException getCancellationException() {
        return ((v1) this.zza).getCancellationException();
    }

    @Override // ce.g1
    public final b getChildren() {
        return ((v1) this.zza).getChildren();
    }

    @Override // ce.i0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // ce.i0
    public final Throwable getCompletionExceptionOrNull() {
        return ((v1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // ld.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final ke.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.s.a(3, s1.a);
        kotlin.jvm.internal.s.a(3, t1.a);
        return new ke.c(tVar);
    }

    public final ke.a getOnJoin() {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        kotlin.jvm.internal.s.a(3, u1.a);
        return new b9.p(v1Var);
    }

    @Override // ce.g1
    public final g1 getParent() {
        return ((v1) this.zza).getParent();
    }

    @Override // ce.g1
    public final p0 invokeOnCompletion(l lVar) {
        return ((v1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // ce.g1
    public final boolean isActive() {
        return ((v1) this.zza).isActive();
    }

    @Override // ce.g1
    public final boolean isCancelled() {
        return ((v1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((v1) this.zza).u() instanceof b1);
    }

    @Override // ce.g1
    public final Object join(c cVar) {
        return ((v1) this.zza).join(cVar);
    }

    @Override // ld.h
    public final h minusKey(g gVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return yd.b(v1Var, gVar);
    }

    public final g1 plus(g1 g1Var) {
        ((v1) this.zza).getClass();
        return g1Var;
    }

    @Override // ce.g1
    public final boolean start() {
        return ((v1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((v1) this.zza).cancel(null);
    }

    @Override // ce.g1
    public final p0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((v1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // ld.h
    public final h plus(h hVar) {
        v1 v1Var = (v1) this.zza;
        v1Var.getClass();
        return yd.c(v1Var, hVar);
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
