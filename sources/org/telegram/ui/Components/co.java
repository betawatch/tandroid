package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class co extends FrameLayout {
    public o61 a;
    public float b;
    public boolean c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z9);

    public final void b(boolean z9) {
        this.c = z9;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
            valueAnimator.cancel();
        }
        if (z9) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z9 ? 1.0f : 0.0f);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 13));
        this.e.setInterpolator(xq.h);
        this.e.setDuration(320L);
        this.e.addListener(new t9(4, this, z9));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.b);
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.c;
    }

    public void setShown(float f10) {
        this.b = f10;
        o61 o61Var = this.a;
        if (o61Var != null) {
            o61Var.setPivotX(o61Var.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(o61 o61Var) {
        this.a = o61Var;
        addView(o61Var, c8.ha.c(-1.0f, -1));
    }
}
