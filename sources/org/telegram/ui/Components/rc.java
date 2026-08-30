package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class rc {
    public View a;
    public final float b;
    public final float c;
    public final float d;
    public long e;
    public Runnable f;
    public ValueAnimator g;
    public boolean h;
    public float i;

    public rc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return e2.c.w(1.0f, this.i, f10, 1.0f - f10);
    }

    public void b() {
        View view = this.a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z4) {
        if (this.h != z4) {
            this.h = z4;
            ValueAnimator valueAnimator = this.g;
            this.g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, z4 ? 1.0f : 0.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 7));
            this.g.addListener(new dg.w2(23, this, z4));
            if (this.h) {
                this.g.setInterpolator(nr.f);
                this.g.setDuration((long) (this.b * 60.0f));
                this.g.setStartDelay(0L);
            } else {
                this.g.setInterpolator(new OvershootInterpolator(this.d));
                this.g.setDuration((long) (this.c * 350.0f));
                this.g.setStartDelay(this.e);
            }
            this.g.start();
        }
    }

    public rc(View view, float f10, float f11) {
        this.e = 0L;
        this.a = view;
        this.c = f10;
        this.b = f10;
        this.d = f11;
    }

    public rc(ph.b5 b5Var) {
        this.e = 0L;
        this.a = b5Var;
        this.b = 1.5f;
        this.c = 1.0f;
        this.d = 2.0f;
    }
}
