package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q01 implements di.bc {
    public final /* synthetic */ ProfileActivity a;

    public q01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // di.bc
    public final di.fc a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        vz0 vz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (vz0Var == null || vz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) vz0Var.getParent()).getScaleX();
        float imageWidth = vz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        di.dc dcVar = new di.dc(vz0Var, 0);
        float[] fArr = new float[2];
        vz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(vz0Var, (ViewGroup) vz0Var.getRootView(), fArr);
        float imageX = (vz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (vz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        dcVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        dcVar.e = vz0Var.getImageReceiver();
        dcVar.b = f7;
        return dcVar;
    }

    @Override // di.bc
    public final void b(long j10, bi.g gVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new cc0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(gVar, 30L);
    }
}
