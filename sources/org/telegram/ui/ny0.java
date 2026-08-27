package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ny0 extends org.telegram.ui.Components.k80 {
    public final /* synthetic */ ProfileActivity L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.L0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.L0.B3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.L0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[2];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[3].setTextColor(i10);
        }
        h01 h01Var = profileActivity.X5;
        if (h01Var == null || h01Var.c == (l1 = org.telegram.ui.ActionBar.g6.l1(1.4f, org.telegram.ui.ActionBar.g6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        h01Var.c = l1;
        h01Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        ProfileActivity profileActivity = this.L0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f10);
        profileActivity.r[3].setTranslationX(f10);
        org.telegram.ui.Components.sv0 sv0Var = profileActivity.P;
        if (sv0Var != null) {
            sv0Var.setTranslationX(f10 - profileActivity.Z3());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ProfileActivity profileActivity = this.L0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        if (profileActivity.P != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.P.getVisibilityFactor();
        }
        h5VarArr[2].setTranslationY(f10);
        h5VarArr[3].setTranslationY(f10);
        org.telegram.ui.Components.sv0 sv0Var = profileActivity.P;
        if (sv0Var != null) {
            sv0Var.setTranslationY(f10 - AndroidUtilities.dp(5.0f));
        }
    }
}
