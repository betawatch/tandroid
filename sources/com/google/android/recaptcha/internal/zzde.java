package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzde implements rd3 {
    private final /* synthetic */ up2 zza;

    public zzde(up2 up2Var) {
        this.zza = up2Var;
    }

    @Override // ev5
    public final xg2 attachChild(ah2 ah2Var) {
        return ((sv5) this.zza).attachChild(ah2Var);
    }

    @Override // rd3
    public final Object await(zw2 zw2Var) {
        return ((vp2) this.zza).h(zw2Var);
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        CancellationException fv5Var;
        sv5 sv5Var = (sv5) this.zza;
        if (th != null) {
            sv5Var.getClass();
            fv5Var = sv5.M(sv5Var, th);
        } else {
            fv5Var = new fv5(sv5Var.l(), null, sv5Var);
        }
        sv5Var.j(fv5Var);
        return true;
    }

    @Override // mx2
    public final Object fold(Object obj, is4 is4Var) {
        sv5 sv5Var = (sv5) this.zza;
        sv5Var.getClass();
        is4Var.getClass();
        return is4Var.invoke(obj, sv5Var);
    }

    @Override // mx2
    public final kx2 get(lx2 lx2Var) {
        sv5 sv5Var = (sv5) this.zza;
        sv5Var.getClass();
        return azd.a(sv5Var, lx2Var);
    }

    @Override // ev5
    public final CancellationException getCancellationException() {
        return ((sv5) this.zza).getCancellationException();
    }

    @Override // ev5
    public final f8a getChildren() {
        return ((sv5) this.zza).getChildren();
    }

    @Override // rd3
    public final Object getCompleted() {
        return ((vp2) this.zza).q();
    }

    @Override // rd3
    public final Throwable getCompletionExceptionOrNull() {
        return ((sv5) this.zza).getCompletionExceptionOrNull();
    }

    @Override // kx2
    public final lx2 getKey() {
        this.zza.getClass();
        return qf5.c;
    }

    public final d2a getOnAwait() {
        vp2 vp2Var = (vp2) this.zza;
        vp2Var.getClass();
        q7c.a(3, pv5.a);
        q7c.a(3, qv5.a);
        return new e2a(vp2Var);
    }

    public final c2a getOnJoin() {
        sv5 sv5Var = (sv5) this.zza;
        sv5Var.getClass();
        q7c.a(3, rv5.a);
        return new pq5(sv5Var);
    }

    public final ev5 getParent() {
        sv5 sv5Var = (sv5) this.zza;
        sv5Var.getClass();
        xg2 xg2Var = (xg2) fx.a.getObjectVolatile(sv5Var, sv5.a);
        if (xg2Var != null) {
            return xg2Var.getParent();
        }
        return null;
    }

    @Override // ev5
    public final ep3 invokeOnCompletion(ur4 ur4Var) {
        return ((sv5) this.zza).invokeOnCompletion(ur4Var);
    }

    @Override // ev5
    public final boolean isActive() {
        return ((sv5) this.zza).isActive();
    }

    @Override // ev5
    public final boolean isCancelled() {
        return ((sv5) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((sv5) this.zza).v() instanceof hp5);
    }

    @Override // ev5
    public final Object join(zw2 zw2Var) {
        return ((sv5) this.zza).join(zw2Var);
    }

    @Override // mx2
    public final mx2 minusKey(lx2 lx2Var) {
        sv5 sv5Var = (sv5) this.zza;
        sv5Var.getClass();
        return azd.b(sv5Var, lx2Var);
    }

    @Override // mx2
    public final mx2 plus(mx2 mx2Var) {
        sv5 sv5Var = (sv5) this.zza;
        sv5Var.getClass();
        return azd.c(sv5Var, mx2Var);
    }

    @Override // ev5
    public final boolean start() {
        return ((sv5) this.zza).start();
    }

    @Override // ev5
    public final ep3 invokeOnCompletion(boolean z, boolean z2, ur4 ur4Var) {
        return ((sv5) this.zza).invokeOnCompletion(z, z2, ur4Var);
    }

    public final ev5 plus(ev5 ev5Var) {
        ((sv5) this.zza).getClass();
        return ev5Var;
    }

    @Override // ev5
    public final void cancel(CancellationException cancellationException) {
        ((sv5) this.zza).cancel(cancellationException);
    }

    public final /* synthetic */ void cancel() {
        ((sv5) this.zza).cancel(null);
    }
}
