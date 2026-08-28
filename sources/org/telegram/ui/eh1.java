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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class eh1 extends org.telegram.ui.Components.voip.v2 {
    public final Path s;
    public final RectF v;
    public final /* synthetic */ mh1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(Activity activity, boolean z10, mh1 mh1Var) {
        super(activity);
        this.w = mh1Var;
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
        mh1 mh1Var = this.w;
        if (!mh1Var.A0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = mh1Var.Y.getScaleX() * mh1Var.Y.getWidth();
        float scaleY = mh1Var.Y.getScaleY() * mh1Var.Y.getHeight();
        float x10 = mh1Var.Y.getX() + ((mh1Var.Y.getWidth() - scaleX) / 2.0f);
        float y10 = mh1Var.Y.getY() + ((mh1Var.Y.getHeight() - scaleY) / 2.0f);
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
        mh1 mh1Var = this.w;
        if (mh1Var.C0 || mh1Var.A0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            mh1Var.p();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || mh1Var.l0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
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
