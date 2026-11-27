// default package

import android.app.Activity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ax9 extends z2b {
    public final /* synthetic */ byte L;
    public final /* synthetic */ bj3 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax9(bj3 bj3Var, Activity activity, tk4 tk4Var, byte b) {
        super(activity, tk4Var, 1, null);
        this.L = b;
        this.M = bj3Var;
    }

    @Override // z2b, android.view.View
    public final void setVisibility(int i) {
        byte b = this.L;
        bj3 bj3Var = this.M;
        switch (b) {
            case 0:
                if (bj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (bj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (bj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (bj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
