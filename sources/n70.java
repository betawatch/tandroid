// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n70 {
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
            return s56.b((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.g;
        return (s56.b((j - j2) / this.h, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
