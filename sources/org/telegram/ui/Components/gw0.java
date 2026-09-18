package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                    ProfileActivity profileActivity = ((org.telegram.ui.my0) iw0Var).b;
                    org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
                    k5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    k5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
