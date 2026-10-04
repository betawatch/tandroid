package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class bx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex0 b;

    public /* synthetic */ bx0(ex0 ex0Var, int i10) {
        this.a = i10;
        this.b = ex0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ex0 ex0Var = this.b;
                ex0Var.invalidate();
                AndroidUtilities.runOnUIThread(new bx0(ex0Var, 1));
                break;
            default:
                ex0 ex0Var2 = this.b;
                dx0 dx0Var = ex0Var2.e;
                if (dx0Var != null) {
                    ex0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ey0) dx0Var).b;
                    org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.r;
                    i5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    i5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.a6));
                    break;
                }
                break;
        }
    }
}
