package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m5 {
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

    public final void a(float f7, float f10, long j3) {
        if (Float.isNaN(f7) || Float.isInfinite(f7) || Float.isNaN(f10) || Float.isInfinite(f10)) {
            return;
        }
        this.b = f7;
        this.c = f10;
        this.i = j3;
        if (!this.a) {
            this.a = true;
            this.d = f7;
            this.e = f10;
            this.f = f7;
            this.g = f10;
            this.h = j3;
            return;
        }
        float f11 = f7 - this.f;
        float f12 = f10 - this.g;
        if ((f12 * f12) + (f11 * f11) > 1.265625f) {
            this.f = f7;
            this.g = f10;
            this.h = j3;
        }
    }

    public final void b(long j3) {
        if (this.a) {
            if (this.j == 0) {
                this.j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, (j3 - r0) * 1.0E-9f));
            this.j = j3;
            if (this.i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.b, f7, exp, f7);
            float f10 = this.e;
            this.e = com.google.android.gms.internal.vision.e2.y(this.c, f10, exp, f10);
        }
    }
}
