package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v9;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t0 extends FrameLayout {
    public final s0 a;
    public final v9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public t0(Activity activity) {
        super(activity);
        s0 s0Var = new s0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.a = s0Var;
        s0Var.b(3.0d);
        if (!s0Var.e) {
            invalidate();
        }
        s0Var.e = true;
        v9 v9Var = new v9(activity);
        this.b = v9Var;
        addView(v9Var, y5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<t0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<t0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(qr.g);
        this.c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f = isEnabled;
        if (isEnabled) {
            this.c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<t0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<t0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(qr.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            s0 s0Var = this.a;
            if (z10) {
                s0Var.b(3.0d);
            }
            if (s0Var.h != z10) {
                s0Var.h = z10;
                ValueAnimator valueAnimator = s0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    s0Var.j.cancel();
                }
                int i10 = 0;
                if (z10) {
                    s0Var.j = ValueAnimator.ofFloat(s0Var.i, 0.0f);
                    s0Var.k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    s0Var.k = 0;
                    s0Var.j = ValueAnimator.ofFloat(s0Var.i, 1.0f);
                }
                s0Var.j.addUpdateListener(new r0(s0Var, i10));
                if (z11) {
                    s0Var.j.setDuration(150L);
                } else {
                    s0Var.j.setDuration(1000L);
                }
                s0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            s0 s0Var = this.a;
            s0Var.c();
            s0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        s0 s0Var = this.a;
        if (d > 1.5d) {
            s0Var.b(d);
        } else {
            s0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        s0 s0Var = this.a;
        if (s0Var.e != z10) {
            invalidate();
        }
        s0Var.e = z10;
    }
}
