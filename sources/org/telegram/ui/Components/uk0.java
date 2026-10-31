package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uk0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;

    public final void a(float f7, float f10, float f11, float f12) {
        this.a = f7;
        this.d = f11;
        this.b = f7 - Math.max(0.0f, Math.min(f10, Math.max(0.0f, f11 - f12)));
        this.c = Math.max(f7, f11);
        this.f = this.b <= f12 + 0.5f;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f) {
            return this.c;
        }
        float f7 = this.b;
        return ((this.c - f7) * this.e) + f7;
    }
}
