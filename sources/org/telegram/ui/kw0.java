package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kw0 extends org.telegram.ui.Components.v4 {
    public final /* synthetic */ ProfileActivity U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.U0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        RectF rectF = ProfileActivity.S6;
        this.U0.Q3();
    }

    @Override // org.telegram.ui.ActionBar.u5
    public final void setTextColor(int i10) {
        int r12;
        ProfileActivity profileActivity = this.U0;
        profileActivity.E5 = i10;
        int f7 = i0.b.f(profileActivity.A5, i10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, profileActivity.z0));
        super.setTextColor(f7);
        hy0 hy0Var = profileActivity.y6;
        if (hy0Var == null || hy0Var.c == (r12 = org.telegram.ui.ActionBar.t6.r1(1.4f, org.telegram.ui.ActionBar.t6.b(-0.02f, 0.15f, f7)))) {
            return;
        }
        hy0Var.c = r12;
        hy0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.U0;
        profileActivity.p4();
        profileActivity.getClass();
        org.telegram.ui.Components.ov0 ov0Var = profileActivity.S;
        if (ov0Var != null) {
            ov0Var.setTranslationX(f7 - profileActivity.p4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.U0;
        if (profileActivity.S != null) {
            org.telegram.messenger.i0.L(3.0f);
            profileActivity.S.getVisibilityFactor();
        }
        org.telegram.ui.Components.ov0 ov0Var = profileActivity.S;
        if (ov0Var != null) {
            ov0Var.setTranslationY(f7 - org.telegram.messenger.i0.L(5.0f));
        }
    }
}
