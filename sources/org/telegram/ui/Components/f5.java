package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f5 {
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

    public f5(View view) {
        this.f = 200L;
        this.g = jr.f;
        this.a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f;
        if (z10 || j10 <= 0 || this.e) {
            this.d = i10;
            this.c = i10;
            this.h = false;
            this.e = false;
        } else if (this.d != i10) {
            this.h = true;
            this.d = i10;
            this.j = this.c;
            this.i = elapsedRealtime;
        }
        if (this.h) {
            float a2 = i7.w.a((elapsedRealtime - this.i) / j10, 0.0f, 1.0f);
            if (elapsedRealtime - this.i >= 0) {
                TimeInterpolator timeInterpolator = this.g;
                if (timeInterpolator == null) {
                    this.c = i0.a.d(a2, this.j, this.d);
                } else {
                    this.c = i0.a.d(timeInterpolator.getInterpolation(a2), this.j, this.d);
                }
            }
            if (a2 >= 1.0f) {
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

    public f5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        jr jrVar = jr.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public f5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f = 200L;
        jr jrVar = jr.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public f5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        jr jrVar = jr.f;
        this.b = runnable;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }
}
