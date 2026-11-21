package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.Components.f5 {
    public final /* synthetic */ ProfileActivity V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        RectF rectF = ProfileActivity.Z6;
        this.V0.Q3();
    }

    @Override // org.telegram.ui.ActionBar.m5
    public final void setTextColor(int i7) {
        int r12;
        ProfileActivity profileActivity = this.V0;
        profileActivity.K5 = i7;
        int f10 = i0.a.f(profileActivity.G5, i7, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, profileActivity.A0));
        super.setTextColor(f10);
        xw0 xw0Var = profileActivity.F6;
        if (xw0Var == null || xw0Var.c == (r12 = org.telegram.ui.ActionBar.m6.r1(1.4f, org.telegram.ui.ActionBar.m6.b(-0.02f, 0.15f, f10)))) {
            return;
        }
        xw0Var.c = r12;
        xw0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        profileActivity.r4();
        profileActivity.getClass();
        org.telegram.ui.Components.xu0 xu0Var = profileActivity.T;
        if (xu0Var != null) {
            xu0Var.setTranslationX(f10 - profileActivity.r4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            org.telegram.messenger.g0.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        org.telegram.ui.Components.xu0 xu0Var = profileActivity.T;
        if (xu0Var != null) {
            xu0Var.setTranslationY(f10 - org.telegram.messenger.g0.L(5.0f));
        }
    }
}
