// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cf2 extends wv4 {
    public final /* synthetic */ kf2 m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf2(kf2 kf2Var, Activity activity, kf2 kf2Var2) {
        super(activity, kf2Var2);
        this.m1 = kf2Var;
    }

    @Override // wv4
    public final void E0() {
        kf2 kf2Var = this.m1;
        kf2Var.getMessagesController().O(kf2Var.getParentActivity(), kf2Var.n, kf2Var, new rh1(this, (byte) 25));
    }
}
