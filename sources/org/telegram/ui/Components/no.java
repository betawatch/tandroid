package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class no extends FrameLayout {
    public y71 a;
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
        ofFloat.addUpdateListener(new j6(this, 12));
        this.e.setInterpolator(jr.h);
        this.e.setDuration(320L);
        this.e.addListener(new z9(4, this, z10));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.b);
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.c;
    }

    public void setShown(float f9) {
        this.b = f9;
        y71 y71Var = this.a;
        if (y71Var != null) {
            y71Var.setPivotX(y71Var.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f9));
            this.a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f9));
        }
        setAlpha(f9);
        invalidate();
    }

    public void setTabs(y71 y71Var) {
        this.a = y71Var;
        addView(y71Var, i7.f6.c(-1.0f, -1));
    }
}
