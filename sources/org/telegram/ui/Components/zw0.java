package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;

    public /* synthetic */ zw0(cx0 cx0Var, int i10) {
        this.a = i10;
        this.b = cx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cx0 cx0Var = this.b;
                cx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new zw0(cx0Var, 1));
                break;
            default:
                cx0 cx0Var2 = this.b;
                bx0 bx0Var = cx0Var2.e;
                if (bx0Var != null) {
                    cx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ox0) bx0Var).b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.b6));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.c6));
                    break;
                }
                break;
        }
    }
}
