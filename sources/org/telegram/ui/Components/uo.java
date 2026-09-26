package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class uo extends FrameLayout {
    public v81 a;
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
        ofFloat.addUpdateListener(new k6(this, 12));
        this.e.setInterpolator(rr.h);
        this.e.setDuration(320L);
        this.e.addListener(new ca(4, this, z10));
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
        v81 v81Var = this.a;
        if (v81Var != null) {
            v81Var.setPivotX(v81Var.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
            this.a.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        }
        setAlpha(f7);
        invalidate();
    }

    public void setTabs(v81 v81Var) {
        this.a = v81Var;
        addView(v81Var, w7.y5.c(-1.0f, -1));
    }
}
