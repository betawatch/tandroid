package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d6 {
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

    public d6(long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.a = null;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z10) {
        d(z10 ? 1.0f : 0.0f, true);
    }

    public final float b() {
        if (this.i) {
            return w7.q.a(((SystemClock.elapsedRealtime() - this.j) - this.f) / this.g, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float c() {
        if (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((elapsedRealtime - this.j) - this.f) / this.g, 0.0f, 1.0f);
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

    public final float d(float f7, boolean z10) {
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

    public final float e(boolean z10) {
        return d(z10 ? 1.0f : 0.0f, false);
    }

    public final float f(boolean z10, boolean z11) {
        return d(z10 ? 1.0f : 0.0f, z11);
    }

    public d6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.a = null;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view) {
        this.f = 0L;
        this.g = 200L;
        this.h = wr.f;
        this.a = view;
        this.e = true;
    }

    public d6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.a = view;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.a = view;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable) {
        this.f = 0L;
        this.g = 200L;
        this.h = wr.f;
        this.b = runnable;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.b = runnable;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.b = runnable;
        this.f = 0L;
        this.g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.a = view;
        this.d = f7;
        this.c = f7;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public d6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f = 0L;
        this.g = 200L;
        wr wrVar = wr.f;
        this.b = runnable;
        this.d = f7;
        this.c = f7;
        this.f = j3;
        this.g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
