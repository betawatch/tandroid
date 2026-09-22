package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l01 implements ci.fc {
    public final /* synthetic */ ProfileActivity a;

    public l01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ci.fc
    public final ci.jc a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        pz0 pz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (pz0Var == null || pz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) pz0Var.getParent()).getScaleX();
        float imageWidth = pz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ci.hc hcVar = new ci.hc(pz0Var, 0);
        float[] fArr = new float[2];
        pz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(pz0Var, (ViewGroup) pz0Var.getRootView(), fArr);
        float imageX = (pz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (pz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        hcVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        hcVar.e = pz0Var.getImageReceiver();
        hcVar.b = f7;
        return hcVar;
    }

    @Override // ci.fc
    public final void d(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new yb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
