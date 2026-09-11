package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hw0 b;

    public /* synthetic */ ew0(hw0 hw0Var, int i10) {
        this.a = i10;
        this.b = hw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hw0 hw0Var = this.b;
                hw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ew0(hw0Var, 1));
                break;
            default:
                hw0 hw0Var2 = this.b;
                gw0 gw0Var = hw0Var2.e;
                if (gw0Var != null) {
                    hw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ky0) gw0Var).b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
