package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class d6 {
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public long j;

    public final void a(float f7, float f10, long j10) {
        if (Float.isNaN(f7) || Float.isInfinite(f7) || Float.isNaN(f10) || Float.isInfinite(f10)) {
            return;
        }
        this.b = f7;
        this.c = f10;
        this.i = j10;
        if (!this.a) {
            this.a = true;
            this.d = f7;
            this.e = f10;
            this.f = f7;
            this.g = f10;
            this.h = j10;
            return;
        }
        float f11 = f7 - this.f;
        float f12 = f10 - this.g;
        if ((f12 * f12) + (f11 * f11) > 1.265625f) {
            this.f = f7;
            this.g = f10;
            this.h = j10;
        }
    }

    public final void b(long j10) {
        if (this.a) {
            if (this.j == 0) {
                this.j = j10;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, (j10 - r0) * 1.0E-9f));
            this.j = j10;
            if (this.i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.play_billing.k3.y(this.b, f7, exp, f7);
            float f10 = this.e;
            this.e = com.google.android.gms.internal.play_billing.k3.y(this.c, f10, exp, f10);
        }
    }
}
