package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x4 {
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

    public x4(View view) {
        this.f = 200L;
        this.g = xq.f;
        this.a = view;
        this.e = true;
    }

    public final int a(int i3, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f;
        if (z10 || j10 <= 0 || this.e) {
            this.d = i3;
            this.c = i3;
            this.h = false;
            this.e = false;
        } else if (this.d != i3) {
            this.h = true;
            this.d = i3;
            this.j = this.c;
            this.i = elapsedRealtime;
        }
        if (this.h) {
            float a10 = b8.be.a((elapsedRealtime - this.i) / j10, 0.0f, 1.0f);
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

    public x4(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        xq xqVar = xq.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public x4(View view, long j10, TimeInterpolator timeInterpolator, int i3) {
        this.f = 200L;
        xq xqVar = xq.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public x4(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        xq xqVar = xq.f;
        this.b = runnable;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }
}
