package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class w5 {
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

    public w5(long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.a = null;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z9) {
        e(true, z9 ? 1.0f : 0.0f);
    }

    public final float b() {
        if (this.i) {
            return c8.j9.a(((SystemClock.elapsedRealtime() - this.j) - this.f) / this.g, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float c() {
        if (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.j9.a(((elapsedRealtime - this.j) - this.f) / this.g, 0.0f, 1.0f);
            if (elapsedRealtime - this.j >= this.f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.c = org.telegram.messenger.g0.T1(this.k, this.d, a10);
                } else {
                    this.c = org.telegram.messenger.g0.T1(this.k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
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

    public final float d(boolean z9) {
        return e(false, z9 ? 1.0f : 0.0f);
    }

    public final float e(boolean z9, float f10) {
        if (z9 || this.g <= 0 || this.e) {
            this.d = f10;
            this.c = f10;
            this.i = false;
            this.e = false;
        } else if (Math.abs(this.d - f10) > 1.0E-4f) {
            this.i = true;
            this.d = f10;
            this.k = this.c;
            this.j = SystemClock.elapsedRealtime();
        }
        return c();
    }

    public final float f(boolean z9, boolean z10) {
        return e(z10, z9 ? 1.0f : 0.0f);
    }

    public w5(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.a = null;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public w5(View view) {
        this.f = 0L;
        this.g = 200L;
        this.h = xq.f;
        this.a = view;
        this.e = true;
    }

    public w5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.a = view;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public w5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.a = view;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public w5(Runnable runnable) {
        this.f = 0L;
        this.g = 200L;
        this.h = xq.f;
        this.b = runnable;
        this.e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.b = runnable;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.b = runnable;
        this.f = 0L;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public w5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.a = view;
        this.d = f10;
        this.c = f10;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public w5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        xq xqVar = xq.f;
        this.b = runnable;
        this.d = f10;
        this.c = f10;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
