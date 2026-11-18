package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dk0 {
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
