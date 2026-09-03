package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class um0 {
    public static final float A;
    public static final float v = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float w = 0.4f;
    public static final float x = 1.0f - 0.4f;
    public static final float[] y = new float[101];
    public static final float z;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public float n;
    public float o;
    public float p;
    public final Interpolator r;
    public float t;
    public final float u;
    public boolean q = true;
    public final boolean s = true;

    static {
        float f10;
        float f11;
        float f12 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f13 = i10 / 100.0f;
            float f14 = 1.0f;
            while (true) {
                float x10 = e2.c.x(f14, f12, 2.0f, f12);
                float f15 = 1.0f - x10;
                f10 = 3.0f * x10 * f15;
                f11 = x10 * x10 * x10;
                float y10 = e2.c.y(x10, x, f15 * w, f10) + f11;
                if (Math.abs(y10 - f13) < 1.0E-5d) {
                    break;
                } else if (y10 > f13) {
                    f14 = x10;
                } else {
                    f12 = x10;
                }
            }
            y[i10] = f10 + f11;
        }
        y[100] = 1.0f;
        z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public um0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.r = decelerateInterpolator;
        this.u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f10) {
        float f11 = f10 * z;
        return (f11 < 1.0f ? f11 - (1.0f - ((float) Math.exp(-f11))) : e2.c.w(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f)) * A;
    }

    public final void a() {
        this.j = this.d;
        this.k = this.e;
        this.q = true;
    }

    public final boolean b() {
        if (this.q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.l);
        int i10 = this.m;
        if (currentAnimationTimeMillis >= i10) {
            this.j = this.d;
            this.k = this.e;
            this.q = true;
            return true;
        }
        int i11 = this.a;
        if (i11 == 0) {
            float f10 = currentAnimationTimeMillis * this.n;
            Interpolator interpolator = this.r;
            float e = interpolator == null ? e(f10) : interpolator.getInterpolation(f10);
            this.j = Math.round(this.o * e) + this.b;
            this.k = Math.round(e * this.p) + this.c;
            return true;
        }
        if (i11 == 1) {
            float f11 = currentAnimationTimeMillis / i10;
            int i12 = (int) (f11 * 100.0f);
            float f12 = i12 / 100.0f;
            int i13 = i12 + 1;
            float[] fArr = y;
            float f13 = fArr[i12];
            float w10 = e2.c.w(fArr[i13], f13, (f11 - f12) / ((i13 / 100.0f) - f12), f13);
            int round = Math.round((this.d - r1) * w10) + this.b;
            this.j = round;
            int min = Math.min(round, this.g);
            this.j = min;
            this.j = Math.max(min, this.f);
            int round2 = Math.round(w10 * (this.e - r1)) + this.c;
            this.k = round2;
            int min2 = Math.min(round2, this.i);
            this.k = min2;
            int max = Math.max(min2, this.h);
            this.k = max;
            if (this.j == this.d && max == this.e) {
                this.q = true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        if (!this.s || this.q) {
            i18 = i12;
        } else {
            float currentAnimationTimeMillis = this.t - ((this.u * ((int) (AnimationUtils.currentAnimationTimeMillis() - this.l))) / 2000.0f);
            float f10 = this.d - this.b;
            float f11 = this.e - this.c;
            float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            float f12 = (f10 / sqrt) * currentAnimationTimeMillis;
            float f13 = (f11 / sqrt) * currentAnimationTimeMillis;
            i18 = i12;
            float f14 = i18;
            if (Math.signum(f14) == Math.signum(f12)) {
                i19 = i13;
                float f15 = i19;
                if (Math.signum(f15) == Math.signum(f13)) {
                    i18 = (int) (f14 + f12);
                    i19 = (int) (f15 + f13);
                }
                this.a = 1;
                this.q = false;
                float sqrt2 = (float) Math.sqrt((i19 * i19) + (i18 * i18));
                this.t = sqrt2;
                double log = Math.log((w * sqrt2) / 800.0f);
                double d = v;
                double d10 = d - 1.0d;
                this.m = (int) (Math.exp(log / d10) * 1000.0d);
                this.l = AnimationUtils.currentAnimationTimeMillis();
                this.b = i10;
                this.c = i11;
                float f16 = sqrt2 != 0.0f ? 1.0f : i18 / sqrt2;
                float f17 = sqrt2 != 0.0f ? i19 / sqrt2 : 1.0f;
                double exp = Math.exp((d / d10) * log);
                this.f = i14;
                this.g = i15;
                this.h = i16;
                this.i = i17;
                float f18 = (int) (exp * 800.0f);
                int round = Math.round(f16 * f18) + i10;
                this.d = round;
                int min = Math.min(round, this.g);
                this.d = min;
                this.d = Math.max(min, this.f);
                int round2 = Math.round(f18 * f17) + i11;
                this.e = round2;
                int min2 = Math.min(round2, this.i);
                this.e = min2;
                this.e = Math.max(min2, this.h);
            }
        }
        i19 = i13;
        this.a = 1;
        this.q = false;
        float sqrt22 = (float) Math.sqrt((i19 * i19) + (i18 * i18));
        this.t = sqrt22;
        double log2 = Math.log((w * sqrt22) / 800.0f);
        double d11 = v;
        double d102 = d11 - 1.0d;
        this.m = (int) (Math.exp(log2 / d102) * 1000.0d);
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.b = i10;
        this.c = i11;
        if (sqrt22 != 0.0f) {
        }
        if (sqrt22 != 0.0f) {
        }
        double exp2 = Math.exp((d11 / d102) * log2);
        this.f = i14;
        this.g = i15;
        this.h = i16;
        this.i = i17;
        float f182 = (int) (exp2 * 800.0f);
        int round3 = Math.round(f16 * f182) + i10;
        this.d = round3;
        int min3 = Math.min(round3, this.g);
        this.d = min3;
        this.d = Math.max(min3, this.f);
        int round22 = Math.round(f182 * f17) + i11;
        this.e = round22;
        int min22 = Math.min(round22, this.i);
        this.e = min22;
        this.e = Math.max(min22, this.h);
    }

    public final void d(int i10, int i11) {
        this.a = 0;
        this.q = false;
        this.m = i11;
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = i10;
        this.o = 0;
        this.p = i10;
        this.n = 1.0f / this.m;
    }
}
