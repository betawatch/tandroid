// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n80 {
    public short a;
    public short b;
    public float c;
    public long d;
    public long e;
    public long f;
    public float g;
    public int h;

    public final float a(long j) {
        if (j < this.d) {
            return 0.0f;
        }
        long j2 = this.f;
        if (j2 < 0 || j < j2) {
            return s76.b((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.g;
        return (s76.b((j - j2) / this.h, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
