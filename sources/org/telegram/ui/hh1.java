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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hh1 extends org.telegram.ui.Components.voip.x2 {
    public final Path s;
    public final RectF v;
    public final /* synthetic */ ph1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(Activity activity, boolean z10, ph1 ph1Var) {
        super(activity);
        this.w = ph1Var;
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
        ph1 ph1Var = this.w;
        if (!ph1Var.E0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = ph1Var.c0.getScaleX() * ph1Var.c0.getWidth();
        float scaleY = ph1Var.c0.getScaleY() * ph1Var.c0.getHeight();
        float x9 = ph1Var.c0.getX() + ((ph1Var.c0.getWidth() - scaleX) / 2.0f);
        float y3 = ph1Var.c0.getY() + ((ph1Var.c0.getHeight() - scaleY) / 2.0f);
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
        ph1 ph1Var = this.w;
        if (ph1Var.G0 || ph1Var.E0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            ph1Var.o();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || ph1Var.p0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
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
