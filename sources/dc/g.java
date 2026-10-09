package dc;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;

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
        float u10 = e2.u(f20, f18, f22 * f17, f23);
        float u11 = e2.u(f17, f21, f19 * f18, f23);
        return new g((u10 * f11) + (f11 - f7), (u11 * f15) + (f15 - f7), f7, (u10 * f12) + (f12 - f10), (u11 * f16) + (f16 - f10), f10, u10, u11, 1.0f);
    }
}
