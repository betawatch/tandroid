// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d14 extends yv1 {
    @Override // yv1, org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        ms1 ms1Var;
        super.onTransitionAnimationEnd(z, z2);
        if (!z || (ms1Var = this.a0) == null) {
            return;
        }
        ms1Var.Y1();
        this.a0.postDelayed(new a14(this, (byte) 0), 100L);
    }
}
