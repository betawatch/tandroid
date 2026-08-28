package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gz0 implements kh.nb {
    public final /* synthetic */ ProfileActivity a;

    public gz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // kh.nb
    public final kh.rb a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.g2));
        ly0 ly0Var = profileActivity.a0;
        boolean isForum = ChatObject.isForum(profileActivity.A2);
        if (ly0Var == null || ly0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) ly0Var.getParent()).getScaleX();
        float imageWidth = ly0Var.getImageReceiver().getImageWidth() * scaleX;
        float f10 = isForum ? 0.32f * imageWidth : imageWidth;
        kh.pb pbVar = new kh.pb(ly0Var, 0);
        float[] fArr = new float[2];
        ly0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(ly0Var, (ViewGroup) ly0Var.getRootView(), fArr);
        float imageX = (ly0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (ly0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        pbVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        pbVar.e = ly0Var.getImageReceiver();
        pbVar.b = f10;
        return pbVar;
    }

    @Override // kh.nb
    public final void b(long j10, bg.i2 i2Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.k2 && profileActivity.g2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new cb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(i2Var, 30L);
    }
}
