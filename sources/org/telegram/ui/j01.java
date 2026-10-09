package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j01 implements ci.cc {
    public final /* synthetic */ ProfileActivity a;

    public j01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ci.cc
    public final ci.gc a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        oz0 oz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (oz0Var == null || oz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) oz0Var.getParent()).getScaleX();
        float imageWidth = oz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ci.ec ecVar = new ci.ec(oz0Var, 0);
        float[] fArr = new float[2];
        oz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(oz0Var, (ViewGroup) oz0Var.getRootView(), fArr);
        float imageX = (oz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (oz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        ecVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        ecVar.e = oz0Var.getImageReceiver();
        ecVar.b = f7;
        return ecVar;
    }

    @Override // ci.cc
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new xb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
