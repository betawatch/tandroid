package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;

    public /* synthetic */ xv0(aw0 aw0Var, int i10) {
        this.a = i10;
        this.b = aw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aw0 aw0Var = this.b;
                aw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new xv0(aw0Var, 1));
                break;
            default:
                aw0 aw0Var2 = this.b;
                zv0 zv0Var = aw0Var2.e;
                if (zv0Var != null) {
                    aw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ex0) zv0Var).b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.V5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.W5));
                    break;
                }
                break;
        }
    }
}
