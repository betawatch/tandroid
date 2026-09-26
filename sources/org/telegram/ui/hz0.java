package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hz0 extends org.telegram.ui.Components.i90 {
    public final /* synthetic */ ProfileActivity P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.B3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[2];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[3].setTextColor(i10);
        }
        b11 b11Var = profileActivity.b6;
        if (b11Var == null || b11Var.c == (l1 = org.telegram.ui.ActionBar.h6.l1(1.4f, org.telegram.ui.ActionBar.h6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        b11Var.c = l1;
        b11Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f7);
        profileActivity.r[3].setTranslationX(f7);
        org.telegram.ui.Components.tw0 tw0Var = profileActivity.T;
        if (tw0Var != null) {
            tw0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        h5VarArr[2].setTranslationY(f7);
        h5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.tw0 tw0Var = profileActivity.T;
        if (tw0Var != null) {
            tw0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
