package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.j3;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout {
    public final b0 a;
    public final k9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public c0(Activity activity) {
        super(activity);
        b0 b0Var = new b0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.a = b0Var;
        b0Var.b(3.0d);
        if (!b0Var.e) {
            invalidate();
        }
        b0Var.e = true;
        k9 k9Var = new k9(activity);
        this.b = k9Var;
        addView(k9Var, mf.e(hs.R1, hs.R1, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<c0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<c0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(xq.g);
        this.c.setDuration(3000L);
        boolean e10 = lc.e(512);
        this.f = e10;
        if (e10) {
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<c0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<c0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(xq.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            b0 b0Var = this.a;
            if (z10) {
                b0Var.b(3.0d);
            }
            if (b0Var.h != z10) {
                b0Var.h = z10;
                ValueAnimator valueAnimator = b0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    b0Var.j.cancel();
                }
                if (z10) {
                    b0Var.j = ValueAnimator.ofFloat(b0Var.i, 0.0f);
                    b0Var.k = (int) (2000.0f / org.telegram.messenger.g0.t);
                } else {
                    b0Var.k = 0;
                    b0Var.j = ValueAnimator.ofFloat(b0Var.i, 1.0f);
                }
                b0Var.j.addUpdateListener(new j3(b0Var, 17));
                if (z11) {
                    b0Var.j.setDuration(150L);
                } else {
                    b0Var.j.setDuration(1000L);
                }
                b0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            b0 b0Var = this.a;
            b0Var.c();
            b0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        b0 b0Var = this.a;
        if (d > 1.5d) {
            b0Var.b(d);
        } else {
            b0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i3) {
        this.b.setRoundRadius(i3);
    }

    public void setShowWaves(boolean z10) {
        b0 b0Var = this.a;
        if (b0Var.e != z10) {
            invalidate();
        }
        b0Var.e = z10;
    }
}
