package com.google.android.recaptcha.internal;

import id.c;
import id.f;
import id.g;
import id.h;
import java.util.concurrent.CancellationException;
import jd.a;
import kotlin.jvm.internal.i;
import rd.l;
import v7.n8;
import wd.b;
import zd.a1;
import zd.b0;
import zd.f1;
import zd.g1;
import zd.h0;
import zd.o0;
import zd.p;
import zd.r;
import zd.r1;
import zd.s;
import zd.s1;
import zd.t;
import zd.t1;
import zd.u1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class zzde implements h0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // zd.f1
    public final p attachChild(r rVar) {
        return ((u1) this.zza).attachChild(rVar);
    }

    @Override // zd.h0
    public final Object await(c cVar) {
        Object h = ((t) this.zza).h(cVar);
        a aVar = a.a;
        return h;
    }

    @Override // zd.f1
    public final void cancel(CancellationException cancellationException) {
        ((u1) this.zza).cancel(cancellationException);
    }

    @Override // id.h
    public final Object fold(Object obj, rd.p operation) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        i.e(operation, "operation");
        return operation.invoke(obj, u1Var);
    }

    @Override // id.h
    public final f get(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return n8.a(u1Var, gVar);
    }

    @Override // zd.f1
    public final CancellationException getCancellationException() {
        return ((u1) this.zza).getCancellationException();
    }

    @Override // zd.f1
    public final b getChildren() {
        return ((u1) this.zza).getChildren();
    }

    @Override // zd.h0
    public final Object getCompleted() {
        return ((t) this.zza).p();
    }

    @Override // zd.h0
    public final Throwable getCompletionExceptionOrNull() {
        return ((u1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // id.f
    public final g getKey() {
        this.zza.getClass();
        return b0.b;
    }

    public final he.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        kotlin.jvm.internal.s.a(3, r1.a);
        kotlin.jvm.internal.s.a(3, s1.a);
        return new he.c(tVar);
    }

    public final he.a getOnJoin() {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        kotlin.jvm.internal.s.a(3, t1.a);
        return new e.a(u1Var);
    }

    @Override // zd.f1
    public final f1 getParent() {
        return ((u1) this.zza).getParent();
    }

    @Override // zd.f1
    public final o0 invokeOnCompletion(l lVar) {
        return ((u1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // zd.f1
    public final boolean isActive() {
        return ((u1) this.zza).isActive();
    }

    @Override // zd.f1
    public final boolean isCancelled() {
        return ((u1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((u1) this.zza).u() instanceof a1);
    }

    @Override // zd.f1
    public final Object join(c cVar) {
        return ((u1) this.zza).join(cVar);
    }

    @Override // id.h
    public final h minusKey(g gVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return n8.b(u1Var, gVar);
    }

    public final f1 plus(f1 f1Var) {
        ((u1) this.zza).getClass();
        return f1Var;
    }

    @Override // zd.f1
    public final boolean start() {
        return ((u1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((u1) this.zza).cancel(null);
    }

    @Override // zd.f1
    public final o0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return ((u1) this.zza).invokeOnCompletion(z10, z11, lVar);
    }

    @Override // id.h
    public final h plus(h hVar) {
        u1 u1Var = (u1) this.zza;
        u1Var.getClass();
        return n8.c(u1Var, hVar);
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
