package dc;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public g(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.a = f7;
        this.b = f12;
        this.c = f15;
        this.d = f10;
        this.e = f13;
        this.f = f16;
        this.g = f11;
        this.h = f14;
        this.i = f17;
    }

    public static g a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f7 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new g(f11 - f7, f13 - f11, f7, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float v = e2.v(f20, f18, f22 * f17, f23);
        float v9 = e2.v(f17, f21, f19 * f18, f23);
        return new g((v * f11) + (f11 - f7), (v9 * f15) + (f15 - f7), f7, (v * f12) + (f12 - f10), (v9 * f16) + (f16 - f10), f10, v, v9, 1.0f);
    }
}
