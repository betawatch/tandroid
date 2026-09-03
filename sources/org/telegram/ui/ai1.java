package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ai1 extends org.telegram.ui.Components.voip.w2 {
    public final Path s;
    public final RectF v;
    public final /* synthetic */ ii1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai1(Activity activity, boolean z4, ii1 ii1Var) {
        super(activity);
        this.w = ii1Var;
        this.c = new AnimationNotificationsLocker();
        this.a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z4) {
            this.e = true;
        }
        this.s = new Path();
        this.v = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ii1 ii1Var = this.w;
        if (!ii1Var.B0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = ii1Var.Z.getScaleX() * ii1Var.Z.getWidth();
        float scaleY = ii1Var.Z.getScaleY() * ii1Var.Z.getHeight();
        float x10 = ii1Var.Z.getX() + ((ii1Var.Z.getWidth() - scaleX) / 2.0f);
        float y10 = ii1Var.Z.getY() + ((ii1Var.Z.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.v;
        rectF.set(x10, y10, scaleX + x10, scaleY + y10);
        float dp = AndroidUtilities.dp(4.0f);
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        ii1 ii1Var = this.w;
        if (ii1Var.D0 || ii1Var.B0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            ii1Var.p();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || ii1Var.m0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.w.j1) {
            return;
        }
        super.draw(canvas);
    }
}
