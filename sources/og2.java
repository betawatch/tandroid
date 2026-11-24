// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class og2 extends yx4 {
    public final /* synthetic */ wg2 m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og2(wg2 wg2Var, Activity activity, wg2 wg2Var2) {
        super(activity, wg2Var2);
        this.m1 = wg2Var;
    }

    @Override // yx4
    public final void E0() {
        wg2 wg2Var = this.m1;
        wg2Var.getMessagesController().O(wg2Var.getParentActivity(), wg2Var.n, wg2Var, new cd1(this, (byte) 28));
    }
}
