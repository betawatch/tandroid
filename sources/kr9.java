// default package

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kr9 {
    public static final float v = 0.6f;
    public static final float[] w = new float[101];
    public static final float x;
    public boolean a;
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
    public final DecelerateInterpolator r;
    public float t;
    public final float u;
    public boolean q = true;
    public final boolean s = true;

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float z = oo1.z(f5, f3, 2.0f, f3);
                float f6 = 1.0f - z;
                f = 3.0f * z * f6;
                f2 = z * z * z;
                float z2 = yjb.z(z, v, f6 * 0.4f, f) + f2;
                if (Math.abs(z2 - f4) < 1.0E-5d) {
                    break;
                } else if (z2 > f4) {
                    f5 = z;
                } else {
                    f3 = z;
                }
            }
            w[i] = f + f2;
        }
        w[100] = 1.0f;
        x = 1.0f;
        x = 1.0f / e(1.0f);
    }

    public kr9(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.r = decelerateInterpolator;
        this.u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float e(float f) {
        float f2 = f * 8.0f;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : tb4.A(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f)) * x;
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
        int i = this.m;
        if (currentAnimationTimeMillis >= i) {
            this.j = this.d;
            this.k = this.e;
            this.q = true;
            return true;
        }
        boolean z = this.a;
        if (!z) {
            float f = currentAnimationTimeMillis * this.n;
            DecelerateInterpolator decelerateInterpolator = this.r;
            float e = decelerateInterpolator == null ? e(f) : decelerateInterpolator.getInterpolation(f);
            this.j = Math.round(this.o * e) + this.b;
            this.k = Math.round(e * this.p) + this.c;
            return true;
        }
        if (z) {
            float f2 = currentAnimationTimeMillis / i;
            int i2 = (int) (f2 * 100.0f);
            float f3 = i2 / 100.0f;
            int i3 = i2 + 1;
            float[] fArr = w;
            float f4 = fArr[i2];
            float A = tb4.A(fArr[i3], f4, (f2 - f3) / ((i3 / 100.0f) - f3), f4);
            int round = Math.round((this.d - r1) * A) + this.b;
            this.j = round;
            int min = Math.min(round, this.g);
            this.j = min;
            this.j = Math.max(min, this.f);
            int round2 = Math.round(A * (this.e - r1)) + this.c;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        float sqrt;
        float f;
        float f2;
        if (this.s && !this.q) {
            float currentAnimationTimeMillis = this.t - ((this.u * ((int) (AnimationUtils.currentAnimationTimeMillis() - this.l))) / 2000.0f);
            float f3 = this.d - this.b;
            float f4 = this.e - this.c;
            float sqrt2 = (float) Math.sqrt((f4 * f4) + (f3 * f3));
            float f5 = (f3 / sqrt2) * currentAnimationTimeMillis;
            float f6 = (f4 / sqrt2) * currentAnimationTimeMillis;
            float f7 = i3;
            if (Math.signum(f7) == Math.signum(f5)) {
                float f8 = i4;
                if (Math.signum(f8) == Math.signum(f6)) {
                    i3 = (int) (f7 + f5);
                    i9 = (int) (f8 + f6);
                    this.a = true;
                    this.q = false;
                    sqrt = (float) Math.sqrt((i9 * i9) + (i3 * i3));
                    this.t = sqrt;
                    double log = Math.log((0.4f * sqrt) / 800.0f);
                    this.m = (int) (Math.exp(log / 1.7304542064666748d) * 1000.0d);
                    this.l = AnimationUtils.currentAnimationTimeMillis();
                    this.b = i;
                    this.c = i2;
                    if (sqrt != 0.0f) {
                        f2 = 1.0f;
                        f = 1.0f;
                    } else {
                        float f9 = i9 / sqrt;
                        f = i3 / sqrt;
                        f2 = f9;
                    }
                    int exp = (int) (Math.exp(1.5778829605909355d * log) * 800.0d);
                    this.f = i5;
                    this.g = i6;
                    this.h = i7;
                    this.i = i8;
                    float f10 = exp;
                    int round = Math.round(f * f10) + i;
                    this.d = round;
                    int min = Math.min(round, this.g);
                    this.d = min;
                    this.d = Math.max(min, this.f);
                    int round2 = Math.round(f10 * f2) + i2;
                    this.e = round2;
                    int min2 = Math.min(round2, this.i);
                    this.e = min2;
                    this.e = Math.max(min2, this.h);
                }
            }
        }
        i9 = i4;
        this.a = true;
        this.q = false;
        sqrt = (float) Math.sqrt((i9 * i9) + (i3 * i3));
        this.t = sqrt;
        double log2 = Math.log((0.4f * sqrt) / 800.0f);
        this.m = (int) (Math.exp(log2 / 1.7304542064666748d) * 1000.0d);
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.b = i;
        this.c = i2;
        if (sqrt != 0.0f) {
        }
        int exp2 = (int) (Math.exp(1.5778829605909355d * log2) * 800.0d);
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        float f102 = exp2;
        int round3 = Math.round(f * f102) + i;
        this.d = round3;
        int min3 = Math.min(round3, this.g);
        this.d = min3;
        this.d = Math.max(min3, this.f);
        int round22 = Math.round(f102 * f2) + i2;
        this.e = round22;
        int min22 = Math.min(round22, this.i);
        this.e = min22;
        this.e = Math.max(min22, this.h);
    }

    public final void d(int i, int i2) {
        this.a = false;
        this.q = false;
        this.m = i2;
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = i;
        this.o = 0.0f;
        this.p = i;
        this.n = 1.0f / this.m;
    }
}
