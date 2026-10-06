package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class d01 implements ci.bc {
    public final /* synthetic */ ProfileActivity a;

    public d01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ci.bc
    public final ci.fc a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        iz0 iz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (iz0Var == null || iz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) iz0Var.getParent()).getScaleX();
        float imageWidth = iz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ci.dc dcVar = new ci.dc(iz0Var, 0);
        float[] fArr = new float[2];
        iz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(iz0Var, (ViewGroup) iz0Var.getRootView(), fArr);
        float imageX = (iz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (iz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        dcVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        dcVar.e = iz0Var.getImageReceiver();
        dcVar.b = f7;
        return dcVar;
    }

    @Override // ci.bc
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new wb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
