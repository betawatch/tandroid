package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lw0 extends org.telegram.ui.Components.v4 {
    public final /* synthetic */ ProfileActivity U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.U0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        RectF rectF = ProfileActivity.R6;
        this.U0.P3();
    }

    @Override // org.telegram.ui.ActionBar.u5
    public final void setTextColor(int i10) {
        int r12;
        ProfileActivity profileActivity = this.U0;
        profileActivity.E5 = i10;
        int f7 = i0.b.f(profileActivity.A5, i10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, profileActivity.z0));
        super.setTextColor(f7);
        iy0 iy0Var = profileActivity.x6;
        if (iy0Var == null || iy0Var.c == (r12 = org.telegram.ui.ActionBar.t6.r1(1.4f, org.telegram.ui.ActionBar.t6.b(-0.02f, 0.15f, f7)))) {
            return;
        }
        iy0Var.c = r12;
        iy0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        RectF rectF = ProfileActivity.R6;
        ProfileActivity profileActivity = this.U0;
        profileActivity.o4();
        profileActivity.getClass();
        org.telegram.ui.Components.nv0 nv0Var = profileActivity.S;
        if (nv0Var != null) {
            nv0Var.setTranslationX(f7 - profileActivity.o4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        RectF rectF = ProfileActivity.R6;
        ProfileActivity profileActivity = this.U0;
        if (profileActivity.S != null) {
            org.telegram.messenger.i0.L(3.0f);
            profileActivity.S.getVisibilityFactor();
        }
        org.telegram.ui.Components.nv0 nv0Var = profileActivity.S;
        if (nv0Var != null) {
            nv0Var.setTranslationY(f7 - org.telegram.messenger.i0.L(5.0f));
        }
    }
}
