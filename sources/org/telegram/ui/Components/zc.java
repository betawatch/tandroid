package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class zc {
    public View a;
    public final float b;
    public final float c;
    public final float d;
    public long e;
    public Runnable f;
    public ValueAnimator g;
    public boolean h;
    public float i;

    public zc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f7) {
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.i, f7, 1.0f - f7);
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
            ofFloat.addUpdateListener(new l6(this, 7));
            this.g.addListener(new org.telegram.ui.to(2, this, z10));
            if (this.h) {
                this.g.setInterpolator(pr.f);
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

    public zc(View view, float f7, float f10) {
        this.e = 0L;
        this.a = view;
        this.c = f7;
        this.b = f7;
        this.d = f10;
    }

    public zc(di.o6 o6Var) {
        this.e = 0L;
        this.a = o6Var;
        this.b = 1.5f;
        this.c = 1.0f;
        this.d = 2.0f;
    }
}
