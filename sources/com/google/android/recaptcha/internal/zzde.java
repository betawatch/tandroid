package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzde implements zc3 {
    private final /* synthetic */ bp2 zza;

    public zzde(bp2 bp2Var) {
        this.zza = bp2Var;
    }

    @Override // bt5
    public final fg2 attachChild(ig2 ig2Var) {
        return ((pt5) this.zza).attachChild(ig2Var);
    }

    @Override // zc3
    public final Object await(fw2 fw2Var) {
        return ((cp2) this.zza).h(fw2Var);
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        CancellationException ct5Var;
        pt5 pt5Var = (pt5) this.zza;
        if (th != null) {
            pt5Var.getClass();
            ct5Var = pt5.M(pt5Var, th);
        } else {
            ct5Var = new ct5(pt5Var.l(), null, pt5Var);
        }
        pt5Var.j(ct5Var);
        return true;
    }

    @Override // sw2
    public final Object fold(Object obj, eq4 eq4Var) {
        pt5 pt5Var = (pt5) this.zza;
        pt5Var.getClass();
        eq4Var.getClass();
        return eq4Var.invoke(obj, pt5Var);
    }

    @Override // sw2
    public final qw2 get(rw2 rw2Var) {
        pt5 pt5Var = (pt5) this.zza;
        pt5Var.getClass();
        return kud.a(pt5Var, rw2Var);
    }

    @Override // bt5
    public final CancellationException getCancellationException() {
        return ((pt5) this.zza).getCancellationException();
    }

    @Override // bt5
    public final n4a getChildren() {
        return ((pt5) this.zza).getChildren();
    }

    @Override // zc3
    public final Object getCompleted() {
        return ((cp2) this.zza).q();
    }

    @Override // zc3
    public final Throwable getCompletionExceptionOrNull() {
        return ((pt5) this.zza).getCompletionExceptionOrNull();
    }

    @Override // qw2
    public final rw2 getKey() {
        this.zza.getClass();
        return pd5.c;
    }

    public final ky9 getOnAwait() {
        cp2 cp2Var = (cp2) this.zza;
        cp2Var.getClass();
        r3c.a(3, mt5.a);
        r3c.a(3, nt5.a);
        return new mo5(cp2Var);
    }

    public final jy9 getOnJoin() {
        pt5 pt5Var = (pt5) this.zza;
        pt5Var.getClass();
        r3c.a(3, ot5.a);
        return new v39(pt5Var, (byte) 7);
    }

    public final bt5 getParent() {
        pt5 pt5Var = (pt5) this.zza;
        pt5Var.getClass();
        fg2 fg2Var = (fg2) ex.a.getObjectVolatile(pt5Var, pt5.a);
        if (fg2Var != null) {
            return fg2Var.getParent();
        }
        return null;
    }

    @Override // bt5
    public final no3 invokeOnCompletion(qp4 qp4Var) {
        return ((pt5) this.zza).invokeOnCompletion(qp4Var);
    }

    @Override // bt5
    public final boolean isActive() {
        return ((pt5) this.zza).isActive();
    }

    @Override // bt5
    public final boolean isCancelled() {
        return ((pt5) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return !(((pt5) this.zza).v() instanceof en5);
    }

    @Override // bt5
    public final Object join(fw2 fw2Var) {
        return ((pt5) this.zza).join(fw2Var);
    }

    @Override // sw2
    public final sw2 minusKey(rw2 rw2Var) {
        pt5 pt5Var = (pt5) this.zza;
        pt5Var.getClass();
        return kud.b(pt5Var, rw2Var);
    }

    @Override // sw2
    public final sw2 plus(sw2 sw2Var) {
        pt5 pt5Var = (pt5) this.zza;
        pt5Var.getClass();
        return kud.c(pt5Var, sw2Var);
    }

    @Override // bt5
    public final boolean start() {
        return ((pt5) this.zza).start();
    }

    @Override // bt5
    public final no3 invokeOnCompletion(boolean z, boolean z2, qp4 qp4Var) {
        return ((pt5) this.zza).invokeOnCompletion(z, z2, qp4Var);
    }

    public final bt5 plus(bt5 bt5Var) {
        ((pt5) this.zza).getClass();
        return bt5Var;
    }

    @Override // bt5
    public final void cancel(CancellationException cancellationException) {
        ((pt5) this.zza).cancel(cancellationException);
    }

    public final /* synthetic */ void cancel() {
        ((pt5) this.zza).cancel(null);
    }
}
