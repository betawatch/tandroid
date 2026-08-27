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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dh1 extends org.telegram.ui.Components.voip.v2 {
    public final Path s;
    public final RectF v;
    public final /* synthetic */ lh1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh1(Activity activity, boolean z10, lh1 lh1Var) {
        super(activity);
        this.w = lh1Var;
        this.c = new AnimationNotificationsLocker();
        this.a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.s = new Path();
        this.v = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lh1 lh1Var = this.w;
        if (!lh1Var.A0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = lh1Var.Y.getScaleX() * lh1Var.Y.getWidth();
        float scaleY = lh1Var.Y.getScaleY() * lh1Var.Y.getHeight();
        float x8 = lh1Var.Y.getX() + ((lh1Var.Y.getWidth() - scaleX) / 2.0f);
        float y10 = lh1Var.Y.getY() + ((lh1Var.Y.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.v;
        rectF.set(x8, y10, scaleX + x8, scaleY + y10);
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
        lh1 lh1Var = this.w;
        if (lh1Var.C0 || lh1Var.A0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            lh1Var.p();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || lh1Var.l0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.w.i1) {
            return;
        }
        super.draw(canvas);
    }
}
