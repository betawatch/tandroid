package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l01 implements di.gc {
    public final /* synthetic */ ProfileActivity a;

    public l01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // di.gc
    public final di.kc a(long j3) {
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
        di.ic icVar = new di.ic(pz0Var, 0);
        float[] fArr = new float[2];
        pz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(pz0Var, (ViewGroup) pz0Var.getRootView(), fArr);
        float imageX = (pz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (pz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        icVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        icVar.e = pz0Var.getImageReceiver();
        icVar.b = f7;
        return icVar;
    }

    @Override // di.gc
    public final void b(long j3, bi.g gVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new yb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(gVar, 30L);
    }
}
