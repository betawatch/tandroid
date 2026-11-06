package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z4 {
    public final View a;
    public final Runnable b;
    public int c;
    public int d;
    public boolean e;
    public final long f;
    public final TimeInterpolator g;
    public boolean h;
    public long i;
    public int j;

    public z4(View view) {
        this.f = 200L;
        this.g = xq.f;
        this.a = view;
        this.e = true;
    }

    public final int a(int i7, boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f;
        if (z9 || j3 <= 0 || this.e) {
            this.d = i7;
            this.c = i7;
            this.h = false;
            this.e = false;
        } else if (this.d != i7) {
            this.h = true;
            this.d = i7;
            this.j = this.c;
            this.i = elapsedRealtime;
        }
        if (this.h) {
            float a10 = c8.j9.a((elapsedRealtime - this.i) / j3, 0.0f, 1.0f);
            if (elapsedRealtime - this.i >= 0) {
                TimeInterpolator timeInterpolator = this.g;
                if (timeInterpolator == null) {
                    this.c = i0.a.f(a10, this.j, this.d);
                } else {
                    this.c = i0.a.f(timeInterpolator.getInterpolation(a10), this.j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
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

    public z4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        xq xqVar = xq.f;
        this.a = view;
        this.f = j3;
        this.g = timeInterpolator;
        this.e = true;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f = 200L;
        xq xqVar = xq.f;
        this.a = view;
        this.f = j3;
        this.g = timeInterpolator;
        this.e = true;
    }

    public z4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        xq xqVar = xq.f;
        this.b = runnable;
        this.f = j3;
        this.g = timeInterpolator;
        this.e = true;
    }
}
