package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzde implements le3 {
    private final /* synthetic */ mq2 zza;

    public zzde(mq2 mq2Var) {
        this.zza = mq2Var;
    }

    @Override // av5
    public final th2 attachChild(wh2 wh2Var) {
        return ((ov5) this.zza).attachChild(wh2Var);
    }

    @Override // le3
    public final Object await(px2 px2Var) {
        return ((nq2) this.zza).h(px2Var);
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        CancellationException bv5Var;
        ov5 ov5Var = (ov5) this.zza;
        if (th != null) {
            ov5Var.getClass();
            bv5Var = ov5.M(ov5Var, th);
        } else {
            bv5Var = new bv5(ov5Var.l(), null, ov5Var);
        }
        ov5Var.j(bv5Var);
        return true;
    }

    @Override // cy2
    public final Object fold(Object obj, fs4 fs4Var) {
        ov5 ov5Var = (ov5) this.zza;
        ov5Var.getClass();
        fs4Var.getClass();
        return fs4Var.invoke(obj, ov5Var);
    }

    @Override // cy2
    public final ay2 get(by2 by2Var) {
        ov5 ov5Var = (ov5) this.zza;
        ov5Var.getClass();
        return nwd.a(ov5Var, by2Var);
    }

    @Override // av5
    public final CancellationException getCancellationException() {
        return ((ov5) this.zza).getCancellationException();
    }

    @Override // av5
    public final p6a getChildren() {
        return ((ov5) this.zza).getChildren();
    }

    @Override // le3
    public final Object getCompleted() {
        return ((nq2) this.zza).q();
    }

    @Override // le3
    public final Throwable getCompletionExceptionOrNull() {
        return ((ov5) this.zza).getCompletionExceptionOrNull();
    }

    @Override // ay2
    public final by2 getKey() {
        this.zza.getClass();
        return nf5.c;
    }

    public final m0a getOnAwait() {
        nq2 nq2Var = (nq2) this.zza;
        nq2Var.getClass();
        r5c.a(3, lv5.a);
        r5c.a(3, mv5.a);
        return new mq5(nq2Var);
    }

    public final l0a getOnJoin() {
        ov5 ov5Var = (ov5) this.zza;
        ov5Var.getClass();
        r5c.a(3, nv5.a);
        return new lq5(ov5Var);
    }

    public final av5 getParent() {
        ov5 ov5Var = (ov5) this.zza;
        ov5Var.getClass();
        th2 th2Var = (th2) fy.a.getObjectVolatile(ov5Var, ov5.a);
        if (th2Var != null) {
            return th2Var.getParent();
        }
        return null;
    }

    @Override // av5
    public final xp3 invokeOnCompletion(rr4 rr4Var) {
        return ((ov5) this.zza).invokeOnCompletion(rr4Var);
    }

    @Override // av5
    public final boolean isActive() {
        return ((ov5) this.zza).isActive();
    }

    @Override // av5
    public final boolean isCancelled() {
        return ((ov5) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((ov5) this.zza).v() instanceof ep5);
    }

    @Override // av5
    public final Object join(px2 px2Var) {
        return ((ov5) this.zza).join(px2Var);
    }

    @Override // cy2
    public final cy2 minusKey(by2 by2Var) {
        ov5 ov5Var = (ov5) this.zza;
        ov5Var.getClass();
        return nwd.b(ov5Var, by2Var);
    }

    @Override // cy2
    public final cy2 plus(cy2 cy2Var) {
        ov5 ov5Var = (ov5) this.zza;
        ov5Var.getClass();
        return nwd.c(ov5Var, cy2Var);
    }

    @Override // av5
    public final boolean start() {
        return ((ov5) this.zza).start();
    }

    @Override // av5
    public final xp3 invokeOnCompletion(boolean z, boolean z2, rr4 rr4Var) {
        return ((ov5) this.zza).invokeOnCompletion(z, z2, rr4Var);
    }

    public final av5 plus(av5 av5Var) {
        ((ov5) this.zza).getClass();
        return av5Var;
    }

    @Override // av5
    public final void cancel(CancellationException cancellationException) {
        ((ov5) this.zza).cancel(cancellationException);
    }

    public final /* synthetic */ void cancel() {
        ((ov5) this.zza).cancel(null);
    }
}
