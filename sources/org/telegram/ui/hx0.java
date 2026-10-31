package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hx0 implements vh.f8 {
    public final /* synthetic */ ProfileActivity a;

    public hx0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // vh.f8
    public final vh.j8 c(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(profileActivity.p4(), 0.0f, profileActivity.j2));
        jw0 jw0Var = profileActivity.e0;
        boolean c02 = org.telegram.messenger.w3.c0(profileActivity.D2);
        if (jw0Var == null || jw0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) jw0Var.getParent()).getScaleX();
        float f7 = jw0Var.getImageReceiver().M0 * scaleX;
        float f10 = c02 ? 0.32f * f7 : f7;
        vh.h8 h8Var = new vh.h8(jw0Var, 0);
        float[] fArr = new float[2];
        jw0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.i0.r1(jw0Var, (ViewGroup) jw0Var.getRootView(), fArr);
        float f11 = (jw0Var.getImageReceiver().K0 * scaleX) + r4[0] + fArr[0];
        float f12 = (jw0Var.getImageReceiver().L0 * scaleX) + r4[1] + fArr[1];
        h8Var.c.set(f11, f12, f11 + f7, f7 + f12);
        h8Var.e = jw0Var.getImageReceiver();
        h8Var.b = f10;
        return h8Var;
    }

    @Override // vh.f8
    public final void d(long j10, bi.e eVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.w4());
        if (j10 == profileActivity.a() && profileActivity.n2 && profileActivity.j2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.i4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new oa0(profileActivity, 16));
        }
        org.telegram.messenger.i0.h3(eVar, 30L);
    }
}
