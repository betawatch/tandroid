package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u5 {
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

    public u5(long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
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
            return c8.i9.a(((SystemClock.elapsedRealtime() - this.j) - this.f) / this.g, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float c() {
        if (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.i9.a(((elapsedRealtime - this.j) - this.f) / this.g, 0.0f, 1.0f);
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

    public u5(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = null;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public u5(View view) {
        this.f = 0L;
        this.g = 200L;
        this.h = er.f;
        this.a = view;
        this.e = true;
    }

    public u5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = view;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public u5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = view;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public u5(Runnable runnable) {
        this.f = 0L;
        this.g = 200L;
        this.h = er.f;
        this.b = runnable;
        this.e = true;
    }

    public u5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public u5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.f = 0L;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public u5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = view;
        this.d = f10;
        this.c = f10;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public u5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.d = f10;
        this.c = f10;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
