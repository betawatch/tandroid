package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx0 b;

    public /* synthetic */ ex0(hx0 hx0Var, int i10) {
        this.a = i10;
        this.b = hx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hx0 hx0Var = this.b;
                hx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ex0(hx0Var, 1));
                break;
            default:
                hx0 hx0Var2 = this.b;
                gx0 gx0Var = hx0Var2.e;
                if (gx0Var != null) {
                    hx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.qx0) gx0Var).b;
                    org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.r;
                    n5VarArr[1].setTranslationX(profileActivity.Y3(profileActivity.d6, profileActivity.f6));
                    n5VarArr[1].setTranslationY(profileActivity.Z3(profileActivity.g6));
                    break;
                }
                break;
        }
    }
}
