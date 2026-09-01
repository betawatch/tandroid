package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class az0 extends org.telegram.ui.Components.b90 {
    public final /* synthetic */ ProfileActivity M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(ProfileActivity profileActivity, Context context) {
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
        t01 t01Var = profileActivity.Y5;
        if (t01Var == null || t01Var.c == (l1 = org.telegram.ui.ActionBar.k6.l1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        t01Var.c = l1;
        t01Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        ProfileActivity profileActivity = this.M0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f10);
        profileActivity.r[3].setTranslationX(f10);
        org.telegram.ui.Components.kw0 kw0Var = profileActivity.Q;
        if (kw0Var != null) {
            kw0Var.setTranslationX(f10 - profileActivity.Z3());
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
        org.telegram.ui.Components.kw0 kw0Var = profileActivity.Q;
        if (kw0Var != null) {
            kw0Var.setTranslationY(f10 - AndroidUtilities.dp(5.0f));
        }
    }
}
