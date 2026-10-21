package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class mz0 implements ei.mb {
    public final /* synthetic */ ProfileActivity a;

    public mz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ei.mb
    public final ei.qb a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.l2));
        ry0 ry0Var = profileActivity.f0;
        boolean isForum = ChatObject.isForum(profileActivity.F2);
        if (ry0Var == null || ry0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) ry0Var.getParent()).getScaleX();
        float imageWidth = ry0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ei.ob obVar = new ei.ob(ry0Var, 0);
        float[] fArr = new float[2];
        ry0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(ry0Var, (ViewGroup) ry0Var.getRootView(), fArr);
        float imageX = (ry0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (ry0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        obVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        obVar.e = ry0Var.getImageReceiver();
        obVar.b = f7;
        return obVar;
    }

    @Override // ei.mb
    public final void c(long j10, ai.v3 v3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new cb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(v3Var, 30L);
    }
}
