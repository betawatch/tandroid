package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y5 {
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

    public y5(long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = null;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z10) {
        d(z10 ? 1.0f : 0.0f, true);
    }

    public final float b() {
        if (this.i) {
            return h7.n.a(((SystemClock.elapsedRealtime() - this.j) - this.f) / this.g, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float c() {
        if (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = h7.n.a(((elapsedRealtime - this.j) - this.f) / this.g, 0.0f, 1.0f);
            if (elapsedRealtime - this.j >= this.f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.c = AndroidUtilities.lerp(this.k, this.d, a2);
                } else {
                    this.c = AndroidUtilities.lerp(this.k, this.d, timeInterpolator.getInterpolation(a2));
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

    public final float d(float f10, boolean z10) {
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

    public final float e(boolean z10) {
        return d(z10 ? 1.0f : 0.0f, false);
    }

    public final float f(boolean z10, boolean z11) {
        return d(z10 ? 1.0f : 0.0f, z11);
    }

    public y5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = null;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public y5(View view) {
        this.f = 0L;
        this.g = 200L;
        this.h = er.f;
        this.a = view;
        this.e = true;
    }

    public y5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = view;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public y5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = view;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public y5(Runnable runnable) {
        this.f = 0L;
        this.g = 200L;
        this.h = er.f;
        this.b = runnable;
        this.e = true;
    }

    public y5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public y5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.f = 0L;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public y5(float f10, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.a = view;
        this.d = f10;
        this.c = f10;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public y5(float f10, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.d = f10;
        this.c = f10;
        this.f = j10;
        this.g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
