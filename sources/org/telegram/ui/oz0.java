package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class oz0 implements ei.mb {
    public final /* synthetic */ ProfileActivity a;

    public oz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ei.mb
    public final ei.qb a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.l2));
        ty0 ty0Var = profileActivity.f0;
        boolean isForum = ChatObject.isForum(profileActivity.F2);
        if (ty0Var == null || ty0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) ty0Var.getParent()).getScaleX();
        float imageWidth = ty0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ei.ob obVar = new ei.ob(ty0Var, 0);
        float[] fArr = new float[2];
        ty0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(ty0Var, (ViewGroup) ty0Var.getRootView(), fArr);
        float imageX = (ty0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (ty0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        obVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        obVar.e = ty0Var.getImageReceiver();
        obVar.b = f7;
        return obVar;
    }

    @Override // ei.mb
    public final void b(long j10, ai.r3 r3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new eb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(r3Var, 30L);
    }
}
