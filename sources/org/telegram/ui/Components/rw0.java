package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw0 b;

    public /* synthetic */ rw0(uw0 uw0Var, int i10) {
        this.a = i10;
        this.b = uw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uw0 uw0Var = this.b;
                uw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new rw0(uw0Var, 1));
                break;
            default:
                uw0 uw0Var2 = this.b;
                tw0 tw0Var = uw0Var2.e;
                if (tw0Var != null) {
                    uw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ky0) tw0Var).b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
