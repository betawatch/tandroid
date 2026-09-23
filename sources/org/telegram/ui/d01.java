package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d01 implements ci.cc {
    public final /* synthetic */ ProfileActivity a;

    public d01(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ci.cc
    public final ci.gc a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.k2));
        hz0 hz0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (hz0Var == null || hz0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) hz0Var.getParent()).getScaleX();
        float imageWidth = hz0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ci.ec ecVar = new ci.ec(hz0Var, 0);
        float[] fArr = new float[2];
        hz0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(hz0Var, (ViewGroup) hz0Var.getRootView(), fArr);
        float imageX = (hz0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (hz0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        ecVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        ecVar.e = hz0Var.getImageReceiver();
        ecVar.b = f7;
        return ecVar;
    }

    @Override // ci.cc
    public final void d(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new tb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
