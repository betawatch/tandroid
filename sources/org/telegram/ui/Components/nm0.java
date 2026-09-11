package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class nm0 {
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
        float f7;
        float f10;
        float f11 = 0.0f;
        for (int i10 = 0; i10 <= 100; i10++) {
            float f12 = i10 / 100.0f;
            float f13 = 1.0f;
            while (true) {
                float A2 = com.google.android.gms.internal.vision.e2.A(f13, f11, 2.0f, f11);
                float f14 = 1.0f - A2;
                f7 = 3.0f * A2 * f14;
                f10 = A2 * A2 * A2;
                float B = com.google.android.gms.internal.vision.e2.B(A2, x, f14 * w, f7) + f10;
                if (Math.abs(B - f12) < 1.0E-5d) {
                    break;
                } else if (B > f12) {
                    f13 = A2;
                } else {
                    f11 = A2;
                }
            }
            y[i10] = f7 + f10;
        }
        y[100] = 1.0f;
        z = 8.0f;
        A = 1.0f;
        A = 1.0f / e(1.0f);
    }

    public nm0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.r = decelerateInterpolator;
        this.u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f7) {
        float f10 = f7 * z;
        return (f10 < 1.0f ? f10 - (1.0f - ((float) Math.exp(-f10))) : com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.exp(1.0f - f10), 0.63212055f, 0.36787945f)) * A;
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
            float f7 = currentAnimationTimeMillis * this.n;
            Interpolator interpolator = this.r;
            float e7 = interpolator == null ? e(f7) : interpolator.getInterpolation(f7);
            this.j = Math.round(this.o * e7) + this.b;
            this.k = Math.round(e7 * this.p) + this.c;
            return true;
        }
        if (i11 == 1) {
            float f10 = currentAnimationTimeMillis / i10;
            int i12 = (int) (f10 * 100.0f);
            float f11 = i12 / 100.0f;
            int i13 = i12 + 1;
            float[] fArr = y;
            float f12 = fArr[i12];
            float z10 = com.google.android.gms.internal.vision.e2.z(fArr[i13], f12, (f10 - f11) / ((i13 / 100.0f) - f11), f12);
            int round = Math.round((this.d - r1) * z10) + this.b;
            this.j = round;
            int min = Math.min(round, this.g);
            this.j = min;
            this.j = Math.max(min, this.f);
            int round2 = Math.round(z10 * (this.e - r1)) + this.c;
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
            float f7 = this.d - this.b;
            float f10 = this.e - this.c;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
            float f11 = (f7 / sqrt) * currentAnimationTimeMillis;
            float f12 = (f10 / sqrt) * currentAnimationTimeMillis;
            i18 = i12;
            float f13 = i18;
            if (Math.signum(f13) == Math.signum(f11)) {
                i19 = i13;
                float f14 = i19;
                if (Math.signum(f14) == Math.signum(f12)) {
                    i18 = (int) (f13 + f11);
                    i19 = (int) (f14 + f12);
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
                float f15 = sqrt2 != 0.0f ? 1.0f : i18 / sqrt2;
                float f16 = sqrt2 != 0.0f ? i19 / sqrt2 : 1.0f;
                double exp = Math.exp((d / d10) * log);
                this.f = i14;
                this.g = i15;
                this.h = i16;
                this.i = i17;
                float f17 = (int) (exp * 800.0f);
                int round = Math.round(f15 * f17) + i10;
                this.d = round;
                int min = Math.min(round, this.g);
                this.d = min;
                this.d = Math.max(min, this.f);
                int round2 = Math.round(f17 * f16) + i11;
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
        float f172 = (int) (exp2 * 800.0f);
        int round3 = Math.round(f15 * f172) + i10;
        this.d = round3;
        int min3 = Math.min(round3, this.g);
        this.d = min3;
        this.d = Math.max(min3, this.f);
        int round22 = Math.round(f172 * f16) + i11;
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
