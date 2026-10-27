package oe;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import fi.fa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final d b;
    public final Interpolator c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public boolean h;
    public ValueAnimator i;

    public e(int i10, d dVar, Interpolator interpolator, long j10) {
        this.a = i10;
        this.b = dVar;
        this.c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.h) {
            b();
        }
        float f10 = this.f;
        int i10 = this.a;
        d dVar = this.b;
        if (f10 == f7) {
            dVar.z(f10, i10);
            return;
        }
        int i11 = 1;
        if (!this.h) {
            this.h = true;
        }
        float f11 = f7 - f10;
        long j10 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        int i12 = 0;
        if (j10 <= 0) {
            d(f7, 1.0f);
            if (this.h) {
                this.h = false;
            }
            dVar.z(f7, i10);
            return;
        }
        this.g = f7;
        DecelerateInterpolator decelerateInterpolator = ne.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i = ofFloat;
        ofFloat.setDuration(j10);
        this.i.setInterpolator(this.c);
        this.i.addUpdateListener(new fa(this, f10, f11, i11));
        this.i.addListener(new c(this, f10, f11, i12));
        long j11 = this.e;
        if (j11 != 0) {
            this.i.setStartDelay(j11);
        }
        try {
            this.i.start();
        } catch (Throwable th2) {
            Log.e("tgx", "Cannot start animation", th2);
            c(f7);
        }
    }

    public final boolean b() {
        if (!this.h) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.h) {
            this.h = false;
        }
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator == null) {
            return true;
        }
        valueAnimator.cancel();
        this.i = null;
        return true;
    }

    public final void c(float f7) {
        boolean b10 = b();
        if (d(f7, 1.0f) || b10) {
            this.b.z(f7, this.a);
        }
    }

    public final boolean d(float f7, float f10) {
        if (this.f == f7) {
            return false;
        }
        this.f = f7;
        this.b.E(this.a, f7, f10, this);
        return true;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.a = i10;
        this.b = dVar;
        this.c = interpolator;
        this.d = j10;
        this.f = f7;
    }
}
