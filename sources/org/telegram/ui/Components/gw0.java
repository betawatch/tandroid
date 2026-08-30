package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw0 b;

    public /* synthetic */ gw0(jw0 jw0Var, int i10) {
        this.a = i10;
        this.b = jw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jw0 jw0Var = this.b;
                jw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new gw0(jw0Var, 1));
                break;
            default:
                jw0 jw0Var2 = this.b;
                iw0 iw0Var = jw0Var2.e;
                if (iw0Var != null) {
                    jw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.px0) iw0Var).b;
                    org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
                    k5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.W5));
                    k5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.X5));
                    break;
                }
                break;
        }
    }
}
