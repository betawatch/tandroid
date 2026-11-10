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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cc1 extends org.telegram.ui.Components.voip.o2 {
    public final Path s;
    public final RectF w;
    public vn0 x;
    public final /* synthetic */ jc1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(Activity activity, boolean z9, jc1 jc1Var) {
        super(activity);
        this.y = jc1Var;
        this.c = new h2.f((int[]) null);
        this.a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z9) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        jc1 jc1Var = this.y;
        if (!jc1Var.D0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = jc1Var.c0.getScaleX() * jc1Var.c0.getWidth();
        float scaleY = jc1Var.c0.getScaleY() * jc1Var.c0.getHeight();
        float x10 = jc1Var.c0.getX() + ((jc1Var.c0.getWidth() - scaleX) / 2.0f);
        float y10 = jc1Var.c0.getY() + ((jc1Var.c0.getHeight() - scaleY) / 2.0f);
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
        jc1 jc1Var = this.y;
        if (jc1Var.F0 || jc1Var.D0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            jc1Var.g();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || jc1Var.o0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.y.k1) {
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
        this.x = g0.a.h(this, new vb1(this.y, 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        vn0 vn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (vn0Var = this.x) != null) {
            g0.a.j(this, vn0Var);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
