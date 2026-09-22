package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class k01 implements ci.fc {
    public final /* synthetic */ ProfileActivity a;

    public k01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ci.fc
    public final ci.jc a(long j3) {
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
        ci.hc hcVar = new ci.hc(oz0Var, 0);
        float[] fArr = new float[2];
        oz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(oz0Var, (ViewGroup) oz0Var.getRootView(), fArr);
        float imageX = (oz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (oz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        hcVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        hcVar.e = oz0Var.getImageReceiver();
        hcVar.b = f7;
        return hcVar;
    }

    @Override // ci.fc
    public final void d(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new ac0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
