package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fx0 b;

    public /* synthetic */ cx0(fx0 fx0Var, int i10) {
        this.a = i10;
        this.b = fx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fx0 fx0Var = this.b;
                fx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new cx0(fx0Var, 1));
                break;
            default:
                fx0 fx0Var2 = this.b;
                ex0 ex0Var = fx0Var2.e;
                if (ex0Var != null) {
                    fx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ey0) ex0Var).b;
                    org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.r;
                    i5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    i5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
