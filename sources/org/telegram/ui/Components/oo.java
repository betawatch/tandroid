package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class oo extends FrameLayout {
    public k81 a;
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
        this.e.setInterpolator(mr.h);
        this.e.setDuration(320L);
        this.e.addListener(new dg.w2(26, this, z4));
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
        k81 k81Var = this.a;
        if (k81Var != null) {
            k81Var.setPivotX(k81Var.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
            this.a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        }
        setAlpha(f10);
        invalidate();
    }

    public void setTabs(k81 k81Var) {
        this.a = k81Var;
        addView(k81Var, k7.b6.c(-1.0f, -1));
    }
}
