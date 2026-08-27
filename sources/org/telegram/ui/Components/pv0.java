package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ pv0(sv0 sv0Var, int i10) {
        this.a = i10;
        this.b = sv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sv0 sv0Var = this.b;
                sv0Var.invalidate();
                AndroidUtilities.runOnUIThread(new pv0(sv0Var, 1));
                break;
            default:
                sv0 sv0Var2 = this.b;
                rv0 rv0Var = sv0Var2.e;
                if (rv0Var != null) {
                    sv0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.gx0) rv0Var).b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.V5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.W5));
                    break;
                }
                break;
        }
    }
}
