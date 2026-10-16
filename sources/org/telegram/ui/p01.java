package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class p01 implements di.bc {
    public final /* synthetic */ ProfileActivity a;

    public p01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // di.bc
    public final di.fc a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        uz0 uz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (uz0Var == null || uz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) uz0Var.getParent()).getScaleX();
        float imageWidth = uz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        di.dc dcVar = new di.dc(uz0Var, 0);
        float[] fArr = new float[2];
        uz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(uz0Var, (ViewGroup) uz0Var.getRootView(), fArr);
        float imageX = (uz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (uz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        dcVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        dcVar.e = uz0Var.getImageReceiver();
        dcVar.b = f7;
        return dcVar;
    }

    @Override // di.bc
    public final void b(long j10, bi.g gVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new bc0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(gVar, 30L);
    }
}
