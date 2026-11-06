package com.google.android.recaptcha.internal;

import c8.m0;
import d9.o;
import id.c;
import id.f;
import id.g;
import id.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.l;
import wd.b;
import zd.a1;
import zd.b1;
import zd.e0;
import zd.k1;
import zd.l0;
import zd.l1;
import zd.m1;
import zd.n1;
import zd.p;
import zd.r;
import zd.s;
import zd.t;
import zd.y;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzde implements e0 {
    private final /* synthetic */ s zza;

    public zzde(s sVar) {
        this.zza = sVar;
    }

    @Override // zd.a1
    public final p attachChild(r rVar) {
        return ((n1) this.zza).attachChild(rVar);
    }

    @Override // zd.e0
    public final Object await(c cVar) {
        Object i7 = ((t) this.zza).i(cVar);
        jd.a aVar = jd.a.a;
        return i7;
    }

    @Override // zd.a1, be.t
    public final void cancel(CancellationException cancellationException) {
        ((n1) this.zza).cancel(cancellationException);
    }

    @Override // id.h
    public final Object fold(Object obj, rd.p operation) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        j.e(operation, "operation");
        return operation.invoke(obj, n1Var);
    }

    @Override // id.h
    public final f get(g gVar) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        return m0.a(n1Var, gVar);
    }

    @Override // zd.a1
    public final CancellationException getCancellationException() {
        return ((n1) this.zza).getCancellationException();
    }

    @Override // zd.a1
    public final b getChildren() {
        return ((n1) this.zza).getChildren();
    }

    @Override // zd.e0
    public final Object getCompleted() {
        return ((t) this.zza).r();
    }

    @Override // zd.e0
    public final Throwable getCompletionExceptionOrNull() {
        return ((n1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // id.f
    public final g getKey() {
        this.zza.getClass();
        return y.b;
    }

    public final he.b getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        u.a(3, k1.a);
        u.a(3, l1.a);
        return new e.a(tVar);
    }

    public final he.a getOnJoin() {
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

    @Override // zd.a1
    public final l0 invokeOnCompletion(l lVar) {
        return ((n1) this.zza).invokeOnCompletion(lVar);
    }

    @Override // zd.a1
    public final boolean isActive() {
        return ((n1) this.zza).isActive();
    }

    @Override // zd.a1
    public final boolean isCancelled() {
        return ((n1) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return ((n1) this.zza).A();
    }

    @Override // zd.a1
    public final Object join(c cVar) {
        return ((n1) this.zza).join(cVar);
    }

    @Override // id.h
    public final h minusKey(g gVar) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        return m0.b(n1Var, gVar);
    }

    public final a1 plus(a1 a1Var) {
        ((n1) this.zza).getClass();
        return a1Var;
    }

    @Override // zd.a1
    public final boolean start() {
        return ((n1) this.zza).start();
    }

    public final /* synthetic */ void cancel() {
        ((n1) this.zza).cancel(null);
    }

    @Override // zd.a1
    public final l0 invokeOnCompletion(boolean z9, boolean z10, l lVar) {
        return ((n1) this.zza).invokeOnCompletion(z9, z10, lVar);
    }

    @Override // id.h
    public final h plus(h hVar) {
        n1 n1Var = (n1) this.zza;
        n1Var.getClass();
        return m0.c(n1Var, hVar);
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
