package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class lo extends FrameLayout {
    public w71 a;
    public float b;
    public boolean c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z10);

    public final void b(boolean z10) {
        this.c = z10;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new a6(this, 13));
        this.e.setInterpolator(gr.h);
        this.e.setDuration(320L);
        this.e.addListener(new eg.m(20, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.b);
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.c;
    }

    public void setShown(float f7) {
        this.b = f7;
        w71 w71Var = this.a;
        if (w71Var != null) {
            w71Var.setPivotX(w71Var.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
            this.a.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(w71 w71Var) {
        this.a = w71Var;
        addView(w71Var, w7.b6.c(-1.0f, -1));
    }
}
