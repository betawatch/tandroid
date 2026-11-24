// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ip1 extends uk1 {
    public final /* synthetic */ mu1 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip1(mu1 mu1Var, wjb wjbVar, Activity activity) {
        super(wjbVar, activity, false);
        this.z2 = mu1Var;
    }

    @Override // uk1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        mu1 mu1Var = this.z2;
        k0(mu1Var.g1.getY() + y, mu1Var.m1.getBackgroundSizeY());
    }
}
