package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ ax0(dx0 dx0Var, int i10) {
        this.a = i10;
        this.b = dx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dx0 dx0Var = this.b;
                dx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ax0(dx0Var, 1));
                break;
            default:
                dx0 dx0Var2 = this.b;
                cx0 cx0Var = dx0Var2.e;
                if (cx0Var != null) {
                    dx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.mx0) cx0Var).b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.b6, profileActivity.d6));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.e6));
                    break;
                }
                break;
        }
    }
}
