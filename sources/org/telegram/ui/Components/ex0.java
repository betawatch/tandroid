package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                    ProfileActivity profileActivity = ((org.telegram.ui.py0) gx0Var).b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
