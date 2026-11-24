// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iv9 extends a1b {
    public final /* synthetic */ byte L;
    public final /* synthetic */ sj3 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv9(sj3 sj3Var, Activity activity, tk4 tk4Var, byte b) {
        super(activity, tk4Var, 1, null);
        this.L = b;
        this.M = sj3Var;
    }

    @Override // a1b, android.view.View
    public final void setVisibility(int i) {
        byte b = this.L;
        sj3 sj3Var = this.M;
        switch (b) {
            case 0:
                if (sj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (sj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (sj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (sj3Var.P0.getTag() == null) {
                    super.setVisibility(i);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
