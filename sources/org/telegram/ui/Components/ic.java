package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class ic {
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

    public ic(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.j, f10, 1.0f - f10) * this.h;
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

    public final void c(boolean z9) {
        if (this.i != z9) {
            this.i = z9;
            ValueAnimator valueAnimator = this.g;
            this.g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j, z9 ? 1.0f : 0.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 7));
            this.g.addListener(new t9(1, this, z9));
            if (this.i) {
                this.g.setInterpolator(xq.f);
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

    public ic(View view, float f10, float f11) {
        this.e = 0L;
        this.h = 1.0f;
        this.a = view;
        this.c = f10;
        this.b = f10;
        this.d = f11;
    }

    public ic(fi.m5 m5Var) {
        this.e = 0L;
        this.h = 1.0f;
        this.a = m5Var;
        this.b = 1.5f;
        this.c = 1.0f;
        this.d = 2.0f;
    }
}
