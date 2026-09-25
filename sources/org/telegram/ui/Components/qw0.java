package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw0 b;

    public /* synthetic */ qw0(tw0 tw0Var, int i10) {
        this.a = i10;
        this.b = tw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tw0 tw0Var = this.b;
                tw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new qw0(tw0Var, 1));
                break;
            default:
                tw0 tw0Var2 = this.b;
                sw0 sw0Var = tw0Var2.e;
                if (sw0Var != null) {
                    tw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.by0) sw0Var).b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
