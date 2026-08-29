package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class uc {
    public View a;
    public final float b;
    public final float c;
    public final float d;
    public long e;
    public Runnable f;
    public ValueAnimator g;
    public boolean h;
    public float i;

    public uc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f9) {
        return com.google.android.recaptcha.internal.a.z(1.0f, this.i, f9, 1.0f - f9);
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
        if (this.h != z10) {
            this.h = z10;
            ValueAnimator valueAnimator = this.g;
            this.g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, z10 ? 1.0f : 0.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 7));
            this.g.addListener(new z9(1, this, z10));
            if (this.h) {
                this.g.setInterpolator(jr.f);
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

    public uc(View view, float f9, float f10) {
        this.e = 0L;
        this.a = view;
        this.c = f9;
        this.b = f9;
        this.d = f10;
    }

    public uc(nh.s5 s5Var) {
        this.e = 0L;
        this.a = s5Var;
        this.b = 1.5f;
        this.c = 1.0f;
        this.d = 2.0f;
    }
}
