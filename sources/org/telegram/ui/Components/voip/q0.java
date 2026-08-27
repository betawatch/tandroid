package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {
    public final p0 a;
    public final n9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public q0(Activity activity) {
        super(activity);
        p0 p0Var = new p0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.a = p0Var;
        p0Var.b(3.0d);
        if (!p0Var.e) {
            invalidate();
        }
        p0Var.e = true;
        n9 n9Var = new n9(activity);
        this.b = n9Var;
        addView(n9Var, z5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(er.g);
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(er.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            p0 p0Var = this.a;
            if (z10) {
                p0Var.b(3.0d);
            }
            if (p0Var.h != z10) {
                p0Var.h = z10;
                ValueAnimator valueAnimator = p0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    p0Var.j.cancel();
                }
                if (z10) {
                    p0Var.j = ValueAnimator.ofFloat(p0Var.i, 0.0f);
                    p0Var.k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    p0Var.k = 0;
                    p0Var.j = ValueAnimator.ofFloat(p0Var.i, 1.0f);
                }
                p0Var.j.addUpdateListener(new lh.m2(p0Var, 10));
                if (z11) {
                    p0Var.j.setDuration(150L);
                } else {
                    p0Var.j.setDuration(1000L);
                }
                p0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            p0 p0Var = this.a;
            p0Var.c();
            p0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        p0 p0Var = this.a;
        if (d > 1.5d) {
            p0Var.b(d);
        } else {
            p0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        p0 p0Var = this.a;
        if (p0Var.e != z10) {
            invalidate();
        }
        p0Var.e = z10;
    }
}
