package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c6 {
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

    public c6(long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.a = null;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z10) {
        e(true, z10 ? 1.0f : 0.0f);
    }

    public final float b() {
        if (this.i) {
            return c8.l9.a(((SystemClock.elapsedRealtime() - this.j) - this.f) / this.g, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float c() {
        if (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.l9.a(((elapsedRealtime - this.j) - this.f) / this.g, 0.0f, 1.0f);
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

    public final float d(boolean z10) {
        return e(false, z10 ? 1.0f : 0.0f);
    }

    public final float e(boolean z10, float f10) {
        if (z10 || this.g <= 0 || this.e) {
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

    public final float f(boolean z10, boolean z11) {
        return e(z11, z10 ? 1.0f : 0.0f);
    }

    public c6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.a = null;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(View view) {
        this.f = 0L;
        this.g = 200L;
        this.h = lr.f;
        this.a = view;
        this.e = true;
    }

    public c6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.a = view;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.a = view;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(Runnable runnable) {
        this.f = 0L;
        this.g = 200L;
        this.h = lr.f;
        this.b = runnable;
        this.e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.b = runnable;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.b = runnable;
        this.f = 0L;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.a = view;
        this.d = f10;
        this.c = f10;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public c6(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        lr lrVar = lr.f;
        this.b = runnable;
        this.d = f10;
        this.c = f10;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
