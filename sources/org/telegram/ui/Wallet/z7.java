package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z7 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;

    public z7(float f10, float f11, float f12) {
        this.b = f10;
        this.a = f10;
        this.d = f11;
        this.e = f12;
    }

    public final void a(float f10) {
        this.b = f10;
        this.a = f10;
        this.c = 0.0f;
    }

    public final boolean b(float f10) {
        float sqrt = this.e * 2.0f * ((float) Math.sqrt(this.d));
        while (f10 > 0.0f) {
            float min = Math.min(f10, 0.0020833334f);
            float f11 = this.c;
            float f12 = -this.d;
            float f13 = this.a;
            float f14 = ((((f13 - this.b) * f12) - (sqrt * f11)) * min) + f11;
            this.c = f14;
            this.a = (f14 * min) + f13;
            f10 -= min;
        }
        boolean z10 = Math.abs(this.a - this.b) > 0.002f || Math.abs(this.c) > 0.02f;
        if (!z10) {
            a(this.b);
        }
        return z10;
    }
}
