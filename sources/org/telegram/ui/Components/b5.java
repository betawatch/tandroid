package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        this.g = gr.f;
        this.a = view;
        this.e = true;
    }

    public final int a(int i9, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f;
        if (z10 || j10 <= 0 || this.e) {
            this.d = i9;
            this.c = i9;
            this.h = false;
            this.e = false;
        } else if (this.d != i9) {
            this.h = true;
            this.d = i9;
            this.j = this.c;
            this.i = elapsedRealtime;
        }
        if (this.h) {
            float a2 = g7.n.a((elapsedRealtime - this.i) / j10, 0.0f, 1.0f);
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

    public b5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        gr grVar = gr.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public b5(View view, long j10, TimeInterpolator timeInterpolator, int i9) {
        this.f = 200L;
        gr grVar = gr.f;
        this.a = view;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }

    public b5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f = 200L;
        gr grVar = gr.f;
        this.b = runnable;
        this.f = j10;
        this.g = timeInterpolator;
        this.e = true;
    }
}
