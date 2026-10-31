package fe;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f {
    public final int a;
    public final e b;
    public final Interpolator c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public boolean h;
    public ValueAnimator i;

    public f(int i10, e eVar, Interpolator interpolator, long j10) {
        this.a = i10;
        this.b = eVar;
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
        e eVar = this.b;
        if (f10 == f7) {
            eVar.E(f10, i10);
            return;
        }
        if (!this.h) {
            this.h = true;
        }
        float f11 = f7 - f10;
        long j10 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        int i11 = 0;
        if (j10 <= 0) {
            d(f7, 1.0f);
            if (this.h) {
                this.h = false;
            }
            eVar.E(f7, i10);
            return;
        }
        this.g = f7;
        DecelerateInterpolator decelerateInterpolator = ee.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i = ofFloat;
        ofFloat.setDuration(j10);
        this.i.setInterpolator(this.c);
        this.i.addUpdateListener(new c(this, f10, f11, i11));
        this.i.addListener(new d(this, f10, f11, i11));
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
            this.b.E(f7, this.a);
        }
    }

    public final boolean d(float f7, float f10) {
        if (this.f == f7) {
            return false;
        }
        this.f = f7;
        this.b.v(this.a, f7, f10, this);
        return true;
    }

    public f(int i10, e eVar, Interpolator interpolator, long j10, float f7) {
        this.a = i10;
        this.b = eVar;
        this.c = interpolator;
        this.d = j10;
        this.f = f7;
    }
}
