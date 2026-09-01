package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import oh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class r0 extends FrameLayout {
    public final q0 a;
    public final p9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public r0(Activity activity) {
        super(activity);
        q0 q0Var = new q0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.a = q0Var;
        q0Var.b(3.0d);
        if (!q0Var.e) {
            invalidate();
        }
        q0Var.e = true;
        p9 p9Var = new p9(activity);
        this.b = p9Var;
        addView(p9Var, c6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<r0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<r0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(pr.g);
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<r0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<r0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(pr.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z4, boolean z10) {
        if (this.e != z4) {
            this.e = z4;
            q0 q0Var = this.a;
            if (z4) {
                q0Var.b(3.0d);
            }
            if (q0Var.h != z4) {
                q0Var.h = z4;
                ValueAnimator valueAnimator = q0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    q0Var.j.cancel();
                }
                if (z4) {
                    q0Var.j = ValueAnimator.ofFloat(q0Var.i, 0.0f);
                    q0Var.k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    q0Var.k = 0;
                    q0Var.j = ValueAnimator.ofFloat(q0Var.i, 1.0f);
                }
                q0Var.j.addUpdateListener(new f5(q0Var, 3));
                if (z10) {
                    q0Var.j.setDuration(150L);
                } else {
                    q0Var.j.setDuration(1000L);
                }
                q0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            q0 q0Var = this.a;
            q0Var.c();
            q0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        q0 q0Var = this.a;
        if (d > 1.5d) {
            q0Var.b(d);
        } else {
            q0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z4) {
        q0 q0Var = this.a;
        if (q0Var.e != z4) {
            invalidate();
        }
        q0Var.e = z4;
    }
}
