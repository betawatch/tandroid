package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.Components.y4 {
    public final /* synthetic */ ProfileActivity U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.U0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        RectF rectF = ProfileActivity.S6;
        this.U0.Q3();
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void setTextColor(int i7) {
        int r12;
        ProfileActivity profileActivity = this.U0;
        profileActivity.E5 = i7;
        int f10 = i0.a.f(profileActivity.A5, i7, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, profileActivity.z0));
        super.setTextColor(f10);
        uw0 uw0Var = profileActivity.y6;
        if (uw0Var == null || uw0Var.c == (r12 = org.telegram.ui.ActionBar.k6.r1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, f10)))) {
            return;
        }
        uw0Var.c = r12;
        uw0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.U0;
        profileActivity.p4();
        profileActivity.getClass();
        org.telegram.ui.Components.lu0 lu0Var = profileActivity.S;
        if (lu0Var != null) {
            lu0Var.setTranslationX(f10 - profileActivity.p4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.U0;
        if (profileActivity.S != null) {
            org.telegram.messenger.g0.L(3.0f);
            profileActivity.S.getVisibilityFactor();
        }
        org.telegram.ui.Components.lu0 lu0Var = profileActivity.S;
        if (lu0Var != null) {
            lu0Var.setTranslationY(f10 - org.telegram.messenger.g0.L(5.0f));
        }
    }
}
