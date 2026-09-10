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
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s0 extends FrameLayout {
    public final r0 a;
    public final w9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public s0(Activity activity) {
        super(activity);
        r0 r0Var = new r0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.a = r0Var;
        r0Var.b(3.0d);
        if (!r0Var.e) {
            invalidate();
        }
        r0Var.e = true;
        w9 w9Var = new w9(activity);
        this.b = w9Var;
        addView(w9Var, a6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<s0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<s0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(wr.g);
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<s0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<s0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(wr.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            r0 r0Var = this.a;
            if (z10) {
                r0Var.b(3.0d);
            }
            if (r0Var.h != z10) {
                r0Var.h = z10;
                ValueAnimator valueAnimator = r0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    r0Var.j.cancel();
                }
                if (z10) {
                    r0Var.j = ValueAnimator.ofFloat(r0Var.i, 0.0f);
                    r0Var.k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    r0Var.k = 0;
                    r0Var.j = ValueAnimator.ofFloat(r0Var.i, 1.0f);
                }
                r0Var.j.addUpdateListener(new ai.a(r0Var, 16));
                if (z11) {
                    r0Var.j.setDuration(150L);
                } else {
                    r0Var.j.setDuration(1000L);
                }
                r0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            r0 r0Var = this.a;
            r0Var.c();
            r0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        r0 r0Var = this.a;
        if (d > 1.5d) {
            r0Var.b(d);
        } else {
            r0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        r0 r0Var = this.a;
        if (r0Var.e != z10) {
            invalidate();
        }
        r0Var.e = z10;
    }
}
