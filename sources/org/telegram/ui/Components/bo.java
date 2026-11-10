package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class bo extends FrameLayout {
    public u61 a;
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
        ofFloat.addUpdateListener(new d6(this, 13));
        this.e.setInterpolator(wq.h);
        this.e.setDuration(320L);
        this.e.addListener(new s9(4, this, z9));
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
        u61 u61Var = this.a;
        if (u61Var != null) {
            u61Var.setPivotX(u61Var.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
            this.a.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(u61 u61Var) {
        this.a = u61Var;
        addView(u61Var, c8.ha.c(-1.0f, -1));
    }
}
