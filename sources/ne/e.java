package ne;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ei.ja;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        if (this.g) {
            b();
        }
        float f10 = this.e;
        int i10 = this.a;
        d dVar = this.b;
        if (f10 == f7) {
            dVar.H(f10, i10);
            return;
        }
        int i11 = 1;
        if (!this.g) {
            this.g = true;
        }
        float f11 = f7 - f10;
        long j10 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        int i12 = 0;
        if (j10 <= 0) {
            d(f7, 1.0f);
            if (this.g) {
                this.g = false;
            }
            dVar.H(f7, i10);
            return;
        }
        this.f = f7;
        DecelerateInterpolator decelerateInterpolator = me.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(j10);
        this.h.setInterpolator(this.c);
        this.h.addUpdateListener(new ja(this, f10, f11, i11));
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
            this.b.H(f7, this.a);
        }
    }

    public final boolean d(float f7, float f10) {
        if (this.e == f7) {
            return false;
        }
        this.e = f7;
        this.b.o(this.a, f7, f10, this);
        return true;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.a = i10;
        this.b = dVar;
        this.c = interpolator;
        this.d = j10;
        this.e = f7;
    }
}
