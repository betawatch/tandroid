package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class dc {
    public View a;
    public final float b;
    public final float c;
    public final float d;
    public long e;
    public Runnable f;
    public ValueAnimator g;
    public final float h;
    public boolean i;
    public float j;

    public dc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return c3.i0.z(1.0f, this.j, f7, 1.0f - f7) * this.h;
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

    public final void c(boolean z10) {
        if (this.i != z10) {
            this.i = z10;
            ValueAnimator valueAnimator = this.g;
            this.g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j, z10 ? 1.0f : 0.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new a6(this, 7));
            this.g.addListener(new eg.m(17, this, z10));
            if (this.i) {
                this.g.setInterpolator(gr.f);
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

    public dc(View view, float f7, float f10) {
        this.e = 0L;
        this.h = 1.0f;
        this.a = view;
        this.c = f7;
        this.b = f7;
        this.d = f10;
    }

    public dc(vh.a4 a4Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.a = a4Var;
        this.b = 1.5f;
        this.c = 1.0f;
        this.d = 2.0f;
    }
}
