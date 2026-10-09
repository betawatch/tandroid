package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lx0 b;

    public /* synthetic */ ix0(lx0 lx0Var, int i10) {
        this.a = i10;
        this.b = lx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lx0 lx0Var = this.b;
                lx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ix0(lx0Var, 1));
                break;
            default:
                lx0 lx0Var2 = this.b;
                kx0 kx0Var = lx0Var2.e;
                if (kx0Var != null) {
                    lx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.jy0) kx0Var).b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
