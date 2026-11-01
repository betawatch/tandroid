package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gx0 implements vh.f8 {
    public final /* synthetic */ ProfileActivity a;

    public gx0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // vh.f8
    public final vh.j8 c(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(profileActivity.q4(), 0.0f, profileActivity.j2));
        iw0 iw0Var = profileActivity.e0;
        boolean c02 = org.telegram.messenger.w3.c0(profileActivity.D2);
        if (iw0Var == null || iw0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) iw0Var.getParent()).getScaleX();
        float f7 = iw0Var.getImageReceiver().M0 * scaleX;
        float f10 = c02 ? 0.32f * f7 : f7;
        vh.h8 h8Var = new vh.h8(iw0Var, 0);
        float[] fArr = new float[2];
        iw0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.i0.r1(iw0Var, (ViewGroup) iw0Var.getRootView(), fArr);
        float f11 = (iw0Var.getImageReceiver().K0 * scaleX) + r4[0] + fArr[0];
        float f12 = (iw0Var.getImageReceiver().L0 * scaleX) + r4[1] + fArr[1];
        h8Var.c.set(f11, f12, f11 + f7, f7 + f12);
        h8Var.e = iw0Var.getImageReceiver();
        h8Var.b = f10;
        return h8Var;
    }

    @Override // vh.f8
    public final void d(long j10, bi.e eVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.x4());
        if (j10 == profileActivity.a() && profileActivity.n2 && profileActivity.j2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.j4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new na0(profileActivity, 16));
        }
        org.telegram.messenger.i0.h3(eVar, 30L);
    }
}
