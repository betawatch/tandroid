package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q01 implements bi.sd {
    public final /* synthetic */ ProfileActivity a;

    public q01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // bi.sd
    public final bi.xd a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        sz0 sz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (sz0Var == null || sz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) sz0Var.getParent()).getScaleX();
        float imageWidth = sz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        bi.ud udVar = new bi.ud(sz0Var, 0);
        float[] fArr = new float[2];
        sz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(sz0Var, (ViewGroup) sz0Var.getRootView(), fArr);
        float imageX = (sz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (sz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        udVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        udVar.e = sz0Var.getImageReceiver();
        udVar.b = f7;
        return udVar;
    }

    @Override // bi.sd
    public final void b(long j3, bi.va vaVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new yb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(vaVar, 30L);
    }
}
