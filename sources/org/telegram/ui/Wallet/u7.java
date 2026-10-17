package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class u7 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;

    public u7(float f7, float f10, float f11) {
        this.b = f7;
        this.a = f7;
        this.d = f10;
        this.e = f11;
    }

    public final void a(float f7) {
        this.b = f7;
        this.a = f7;
        this.c = 0.0f;
    }

    public final boolean b(float f7) {
        float sqrt = this.e * 2.0f * ((float) Math.sqrt(this.d));
        while (f7 > 0.0f) {
            float min = Math.min(f7, 0.0020833334f);
            float f10 = this.c;
            float f11 = -this.d;
            float f12 = this.a;
            float f13 = ((((f12 - this.b) * f11) - (sqrt * f10)) * min) + f10;
            this.c = f13;
            this.a = (f13 * min) + f12;
            f7 -= min;
        }
        boolean z10 = Math.abs(this.a - this.b) > 0.002f || Math.abs(this.c) > 0.02f;
        if (!z10) {
            a(this.b);
        }
        return z10;
    }
}
