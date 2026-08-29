package com.google.android.recaptcha.internal;

import bd.l;
import gd.b;
import i7.s7;
import java.util.concurrent.CancellationException;
import jd.a1;
import jd.b0;
import jd.f1;
import jd.g1;
import jd.h0;
import jd.o0;
import jd.p;
import jd.r;
import jd.r1;
import jd.s;
import jd.s1;
import jd.t;
import jd.t1;
import jd.u1;
import kotlin.jvm.internal.j;
import m8.o;
import org.telegram.ui.Components.n;
import sc.c;
import sc.f;
import sc.g;
import sc.h;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class zzde implements h0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // jd.f1
    public final p attachChild(r rVar) {
        return ((u1) this.zza).attachChild(rVar);
    }

    @Override // jd.h0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        tc.a aVar = tc.a.a;
        return h;
    }

    @Override // jd.f1
    public final void cancel(CancellationException cancellationException) {
        ((u1) this.zza).cancel(cancellationException);
    }

    @Override // sc.h
    public final Object fold(Object obj, bd.p operation) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        j.e(operation, "operation");
        return operation.invoke(obj, u1Var);
    }

    @Override // sc.h
    public final f get(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return s7.a(u1Var, gVar);
    }

    @Override // jd.f1
    public final CancellationException getCancellationException() {
        return ((u1) this.zza).getCancellationException();
    }

    @Override // jd.f1
    public final b getChildren() {
        return ((u1) this.zza).getChildren();
    }

    @Override // jd.h0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // jd.h0
    public final Throwable getCompletionExceptionOrNull() {
        return ((u1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // sc.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final rd.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.t.a(3, r1.a);
        kotlin.jvm.internal.t.a(3, s1.a);
        return new n(tVar, 14);
    }

    public final rd.a getOnJoin() {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        kotlin.jvm.internal.t.a(3, t1.a);
        return new o(u1Var);
    }

    @Override // jd.f1
    public final f1 getParent() {
        return ((u1) this.zza).getParent();
    }

    @Override // jd.f1
    public final o0 invokeOnCompletion(l lVar) {
        return ((u1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // jd.f1
    public final boolean isActive() {
        return ((u1) this.zza).isActive();
    }

    @Override // jd.f1
    public final boolean isCancelled() {
        return ((u1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((u1) this.zza).u() instanceof a1);
    }

    @Override // jd.f1
    public final Object join(c cVar) {
        return ((u1) this.zza).join(cVar);
    }

    @Override // sc.h
    public final h minusKey(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return s7.b(u1Var, gVar);
    }

    public final f1 plus(f1 f1Var) {
        ((u1) this.zza).getClass();
        return f1Var;
    }

    @Override // jd.f1
    public final boolean start() {
        return ((u1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((u1) this.zza).cancel(null);
    }

    @Override // jd.f1
    public final o0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((u1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // sc.h
    public final h plus(h hVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return s7.c(u1Var, hVar);
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
