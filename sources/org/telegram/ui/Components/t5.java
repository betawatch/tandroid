package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t5 {
    public View a;
    public final Runnable b;
    public float c;
    public float d;
    public boolean e;
    public long f;
    public long g;
    public TimeInterpolator h;
    public boolean i;
    public long j;
    public float k;

    public t5(long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.a = null;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z10) {
        e(true, z10 ? 1.0f : 0.0f);
    }

    public final float b() {
        if (this.i) {
            return w7.u.a(((SystemClock.elapsedRealtime() - this.j) - this.f) / this.g, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float c() {
        if (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.u.a(((elapsedRealtime - this.j) - this.f) / this.g, 0.0f, 1.0f);
            if (elapsedRealtime - this.j >= this.f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.c = org.telegram.messenger.i0.T1(this.k, this.d, a2);
                } else {
                    this.c = org.telegram.messenger.i0.T1(this.k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.i = false;
            } else {
                View view = this.a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.c;
    }

    public final float d(boolean z10) {
        return e(false, z10 ? 1.0f : 0.0f);
    }

    public final float e(boolean z10, float f7) {
        if (z10 || this.g <= 0 || this.e) {
            this.d = f7;
            this.c = f7;
            this.i = false;
            this.e = false;
        } else if (Math.abs(this.d - f7) > 1.0E-4f) {
            this.i = true;
            this.d = f7;
            this.k = this.c;
            this.j = SystemClock.elapsedRealtime();
        }
        return c();
    }

    public final float f(boolean z10, boolean z11) {
        return e(z11, z10 ? 1.0f : 0.0f);
    }

    public t5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.a = null;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(View view) {
        this.f = 0L;
        this.g = 200L;
        this.h = gr.f;
        this.a = view;
        this.e = true;
    }

    public t5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.a = view;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.a = view;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(Runnable runnable) {
        this.f = 0L;
        this.g = 200L;
        this.h = gr.f;
        this.b = runnable;
        this.e = true;
    }

    public t5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.b = runnable;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.b = runnable;
        this.f = 0L;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.a = view;
        this.d = f7;
        this.c = f7;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public t5(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        gr grVar = gr.f;
        this.b = runnable;
        this.d = f7;
        this.c = f7;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
