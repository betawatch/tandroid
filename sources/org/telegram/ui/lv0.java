package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lv0 implements gi.ma {
    public final /* synthetic */ ProfileActivity a;

    public lv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // gi.ma
    public final void a(long j10, ci.e3 e3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.x4());
        if (j10 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.j4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new g90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(e3Var, 30L);
    }

    @Override // gi.ma
    public final gi.qa c(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.q4(), 0.0f, profileActivity.k2));
        qu0 qu0Var = profileActivity.f0;
        boolean c02 = org.telegram.messenger.t3.c0(profileActivity.E2);
        if (qu0Var == null || qu0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) qu0Var.getParent()).getScaleX();
        float f10 = qu0Var.getImageReceiver().N0 * scaleX;
        float f11 = c02 ? 0.32f * f10 : f10;
        gi.oa oaVar = new gi.oa(qu0Var, 0);
        float[] fArr = new float[2];
        qu0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(qu0Var, (ViewGroup) qu0Var.getRootView(), fArr);
        float f12 = (qu0Var.getImageReceiver().L0 * scaleX) + r4[0] + fArr[0];
        float f13 = (qu0Var.getImageReceiver().M0 * scaleX) + r4[1] + fArr[1];
        oaVar.c.set(f12, f13, f12 + f10, f10 + f13);
        oaVar.e = qu0Var.getImageReceiver();
        oaVar.b = f11;
        return oaVar;
    }
}
