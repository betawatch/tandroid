package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Components.y4 {
    public final /* synthetic */ ProfileActivity U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.U0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        RectF rectF = ProfileActivity.V6;
        this.U0.Q3();
    }

    @Override // org.telegram.ui.ActionBar.l5
    public final void setTextColor(int i7) {
        int r12;
        ProfileActivity profileActivity = this.U0;
        profileActivity.G5 = i7;
        int f10 = i0.a.f(profileActivity.C5, i7, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.y6, profileActivity.z0));
        super.setTextColor(f10);
        xw0 xw0Var = profileActivity.B6;
        if (xw0Var == null || xw0Var.c == (r12 = org.telegram.ui.ActionBar.l6.r1(1.4f, org.telegram.ui.ActionBar.l6.b(-0.02f, 0.15f, f10)))) {
            return;
        }
        xw0Var.c = r12;
        xw0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        RectF rectF = ProfileActivity.V6;
        ProfileActivity profileActivity = this.U0;
        profileActivity.r4();
        profileActivity.getClass();
        org.telegram.ui.Components.nu0 nu0Var = profileActivity.S;
        if (nu0Var != null) {
            nu0Var.setTranslationX(f10 - profileActivity.r4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        RectF rectF = ProfileActivity.V6;
        ProfileActivity profileActivity = this.U0;
        if (profileActivity.S != null) {
            org.telegram.messenger.g0.L(3.0f);
            profileActivity.S.getVisibilityFactor();
        }
        org.telegram.ui.Components.nu0 nu0Var = profileActivity.S;
        if (nu0Var != null) {
            nu0Var.setTranslationY(f10 - org.telegram.messenger.g0.L(5.0f));
        }
    }
}
