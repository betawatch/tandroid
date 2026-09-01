package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class ro extends FrameLayout {
    public l81 a;
    public float b;
    public boolean c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z4);

    public final void b(boolean z4) {
        this.c = z4;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
            valueAnimator.cancel();
        }
        if (z4) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z4 ? 1.0f : 0.0f);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 12));
        this.e.setInterpolator(pr.h);
        this.e.setDuration(320L);
        this.e.addListener(new eg.u2(24, this, z4));
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
        l81 l81Var = this.a;
        if (l81Var != null) {
            l81Var.setPivotX(l81Var.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
            this.a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(l81 l81Var) {
        this.a = l81Var;
        addView(l81Var, k7.c6.c(-1.0f, -1));
    }
}
