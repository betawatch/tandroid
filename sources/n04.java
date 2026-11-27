// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
