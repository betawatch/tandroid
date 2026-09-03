package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ez0 extends org.telegram.ui.Components.a90 {
    public final /* synthetic */ ProfileActivity M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.M0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.M0.B3();
    }

    @Override // org.telegram.ui.ActionBar.l5
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.M0;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[2];
        if (l5Var != null) {
            l5Var.setTextColor(i10);
            l5VarArr[3].setTextColor(i10);
        }
        y01 y01Var = profileActivity.Y5;
        if (y01Var == null || y01Var.c == (l1 = org.telegram.ui.ActionBar.k6.l1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        y01Var.c = l1;
        y01Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        ProfileActivity profileActivity = this.M0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f10);
        profileActivity.r[3].setTranslationX(f10);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.Q;
        if (jw0Var != null) {
            jw0Var.setTranslationX(f10 - profileActivity.Z3());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ProfileActivity profileActivity = this.M0;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.r;
        if (profileActivity.Q != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.Q.getVisibilityFactor();
        }
        l5VarArr[2].setTranslationY(f10);
        l5VarArr[3].setTranslationY(f10);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.Q;
        if (jw0Var != null) {
            jw0Var.setTranslationY(f10 - AndroidUtilities.dp(5.0f));
        }
    }
}
