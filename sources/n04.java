// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n04 extends zu1 {
    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        nr1 nr1Var;
        super.onTransitionAnimationEnd(z, z2);
        if (!z || (nr1Var = this.a0) == null) {
            return;
        }
        nr1Var.h2();
        this.a0.postDelayed(new lw3(this, (byte) 4), 100L);
    }
}
