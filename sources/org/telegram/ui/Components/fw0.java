package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw0 b;

    public /* synthetic */ fw0(iw0 iw0Var, int i10) {
        this.a = i10;
        this.b = iw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iw0 iw0Var = this.b;
                iw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new fw0(iw0Var, 1));
                break;
            default:
                iw0 iw0Var2 = this.b;
                hw0 hw0Var = iw0Var2.e;
                if (hw0Var != null) {
                    iw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ky0) hw0Var).b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
