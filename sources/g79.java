// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
