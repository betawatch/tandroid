// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ks1 extends je5 {
    public final /* synthetic */ mu1 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(mu1 mu1Var, Activity activity) {
        super(activity, 3);
        this.X0 = mu1Var;
    }

    @Override // je5, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTranslationY(((-getTop()) - gl.L(120.0f)) + this.X0.R1);
    }
}
