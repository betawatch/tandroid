package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class qj0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.a = f10;
        this.d = f12;
        this.b = f10 - Math.max(0.0f, Math.min(f11, Math.max(0.0f, f12 - f13)));
        this.c = Math.max(f10, f12);
        this.f = this.b <= f13 + 0.5f;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f) {
            return this.c;
        }
        float f10 = this.b;
        return ((this.c - f10) * this.e) + f10;
    }
}
