package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ac1 extends org.telegram.ui.Components.voip.r2 {
    public final Path s;
    public final RectF w;
    public wn0 x;
    public final /* synthetic */ hc1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(Activity activity, boolean z10, hc1 hc1Var) {
        super(activity);
        this.y = hc1Var;
        this.c = new h2.f((int[]) null);
        this.a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        hc1 hc1Var = this.y;
        if (!hc1Var.E0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = hc1Var.d0.getScaleX() * hc1Var.d0.getWidth();
        float scaleY = hc1Var.d0.getScaleY() * hc1Var.d0.getHeight();
        float x10 = hc1Var.d0.getX() + ((hc1Var.d0.getWidth() - scaleX) / 2.0f);
        float y10 = hc1Var.d0.getY() + ((hc1Var.d0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.w;
        rectF.set(x10, y10, scaleX + x10, scaleY + y10);
        float L = org.telegram.messenger.g0.L(4.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        hc1 hc1Var = this.y;
        if (hc1Var.G0 || hc1Var.E0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            hc1Var.g();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || hc1Var.p0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.y.l1) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 33 || this.x != null) {
            return;
        }
        this.x = ai.d.k(this, new tb1(this.y, 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        wn0 wn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (wn0Var = this.x) != null) {
            ai.d.m(this, wn0Var);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
