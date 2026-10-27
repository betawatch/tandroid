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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jh1 extends org.telegram.ui.Components.voip.x2 {
    public final Path s;
    public final RectF v;
    public final /* synthetic */ rh1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh1(Activity activity, boolean z10, rh1 rh1Var) {
        super(activity);
        this.w = rh1Var;
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
        rh1 rh1Var = this.w;
        if (!rh1Var.E0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = rh1Var.c0.getScaleX() * rh1Var.c0.getWidth();
        float scaleY = rh1Var.c0.getScaleY() * rh1Var.c0.getHeight();
        float x9 = rh1Var.c0.getX() + ((rh1Var.c0.getWidth() - scaleX) / 2.0f);
        float y3 = rh1Var.c0.getY() + ((rh1Var.c0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.v;
        rectF.set(x9, y3, scaleX + x9, scaleY + y3);
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
        rh1 rh1Var = this.w;
        if (rh1Var.G0 || rh1Var.E0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            rh1Var.o();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || rh1Var.p0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.w.m1) {
            return;
        }
        super.draw(canvas);
    }
}
