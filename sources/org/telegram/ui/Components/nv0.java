package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ nv0(qv0 qv0Var, int i9) {
        this.a = i9;
        this.b = qv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qv0 qv0Var = this.b;
                qv0Var.invalidate();
                AndroidUtilities.runOnUIThread(new nv0(qv0Var, 1));
                break;
            default:
                qv0 qv0Var2 = this.b;
                pv0 pv0Var = qv0Var2.e;
                if (pv0Var != null) {
                    qv0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.fx0) pv0Var).b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.V5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.W5));
                    break;
                }
                break;
        }
    }
}
