// default package

import android.app.Activity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gt9 extends zya {
    public final /* synthetic */ byte L;
    public final /* synthetic */ hi3 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt9(hi3 hi3Var, Activity activity, pi4 pi4Var, byte b) {
        super(activity, pi4Var, 1, null);
        this.L = b;
        this.M = hi3Var;
    }

    @Override // zya, android.view.View
    public final void setVisibility(int i) {
        byte b = this.L;
        hi3 hi3Var = this.M;
        switch (b) {
            case 0:
                if (hi3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (hi3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (hi3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (hi3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
