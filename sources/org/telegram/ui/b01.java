package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class b01 implements ci.cc {
    public final /* synthetic */ ProfileActivity a;

    public b01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ci.cc
    public final ci.gc a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        fz0 fz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (fz0Var == null || fz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) fz0Var.getParent()).getScaleX();
        float imageWidth = fz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ci.ec ecVar = new ci.ec(fz0Var, 0);
        float[] fArr = new float[2];
        fz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(fz0Var, (ViewGroup) fz0Var.getRootView(), fArr);
        float imageX = (fz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (fz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        ecVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        ecVar.e = fz0Var.getImageReceiver();
        ecVar.b = f7;
        return ecVar;
    }

    @Override // ci.cc
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new sb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
