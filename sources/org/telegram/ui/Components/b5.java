package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b5 {
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

    public b5(View view) {
        this.f = 200L;
        this.g = er.f;
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
            float a2 = h7.n.a((elapsedRealtime - this.i) / j10, 0.0f, 1.0f);
            if (elapsedRealtime - this.i >= 0) {
                TimeInterpolator timeInterpolator = this.g;
                if (timeInterpolator == null) {
                    this.c = i0.b.d(a2, this.j, this.d);
                } else {
                    this.c = i0.b.d(timeInterpolator.getInterpolation(a2), this.j, this.d);
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

    public b5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        er erVar = er.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public b5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f = 200L;
        er erVar = er.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public b5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }
}
