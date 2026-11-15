package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        this.g = er.f;
        this.a = view;
        this.e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f;
        if (z10 || j3 <= 0 || this.e) {
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
            float a10 = c8.i9.a((elapsedRealtime - this.i) / j3, 0.0f, 1.0f);
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

    public x4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        er erVar = er.f;
        this.a = view;
        this.f = j3;
        this.g = timeInterpolator;
        this.e = true;
    }

    public x4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f = 200L;
        er erVar = er.f;
        this.a = view;
        this.f = j3;
        this.g = timeInterpolator;
        this.e = true;
    }

    public x4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        er erVar = er.f;
        this.b = runnable;
        this.f = j3;
        this.g = timeInterpolator;
        this.e = true;
    }
}
