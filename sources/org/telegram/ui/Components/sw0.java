package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw0 b;

    public /* synthetic */ sw0(vw0 vw0Var, int i10) {
        this.a = i10;
        this.b = vw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vw0 vw0Var = this.b;
                vw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new sw0(vw0Var, 1));
                break;
            default:
                vw0 vw0Var2 = this.b;
                uw0 uw0Var = vw0Var2.e;
                if (uw0Var != null) {
                    vw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.by0) uw0Var).b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
