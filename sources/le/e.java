package le;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import bi.kc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final d b;
    public final Interpolator c;
    public final long d;
    public float e;
    public float f;
    public boolean g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j3) {
        this.a = i10;
        this.b = dVar;
        this.c = interpolator;
        this.d = j3;
    }

    public final void a(float f7) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.g) {
            b();
        }
        float f10 = this.e;
        int i10 = this.a;
        d dVar = this.b;
        if (f10 == f7) {
            dVar.B(f10, i10);
            return;
        }
        int i11 = 1;
        if (!this.g) {
            this.g = true;
        }
        float f11 = f7 - f10;
        long j3 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        int i12 = 0;
        if (j3 <= 0) {
            d(f7, 1.0f);
            if (this.g) {
                this.g = false;
            }
            dVar.B(f7, i10);
            return;
        }
        this.f = f7;
        DecelerateInterpolator decelerateInterpolator = ke.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(j3);
        this.h.setInterpolator(this.c);
        this.h.addUpdateListener(new kc(this, f10, f11, i11));
        this.h.addListener(new c(this, f10, f11, i12));
        try {
            this.h.start();
        } catch (Throwable th2) {
            Log.e("tgx", "Cannot start animation", th2);
            c(f7);
        }
    }

    public final boolean b() {
        if (!this.g) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.g) {
            this.g = false;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator == null) {
            return true;
        }
        valueAnimator.cancel();
        this.h = null;
        return true;
    }

    public final void c(float f7) {
        boolean b10 = b();
        if (d(f7, 1.0f) || b10) {
            this.b.B(f7, this.a);
        }
    }

    public final boolean d(float f7, float f10) {
        if (this.e == f7) {
            return false;
        }
        this.e = f7;
        this.b.G(this.a, f7, f10, this);
        return true;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j3, float f7) {
        this.a = i10;
        this.b = dVar;
        this.c = interpolator;
        this.d = j3;
        this.e = f7;
    }
}
