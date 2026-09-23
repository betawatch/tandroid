package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw0 b;

    public /* synthetic */ fw0(iw0 iw0Var, int i10) {
        this.a = i10;
        this.b = iw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iw0 iw0Var = this.b;
                iw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new fw0(iw0Var, 1));
                break;
            default:
                iw0 iw0Var2 = this.b;
                hw0 hw0Var = iw0Var2.e;
                if (hw0Var != null) {
                    iw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.dy0) hw0Var).b;
                    org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.r;
                    i5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    i5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
