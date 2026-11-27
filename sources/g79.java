// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class g79 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.d = f3;
        this.b = f - Math.max(0.0f, Math.min(f2, Math.max(0.0f, f3 - f4)));
        this.c = Math.max(f, f3);
        this.f = this.b <= f4 + 0.5f;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f) {
            return this.c;
        }
        float f = this.b;
        return ((this.c - f) * this.e) + f;
    }
}
