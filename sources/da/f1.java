package da;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f1 {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final g1 a() {
        if (this.g == 31) {
            return new g1(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
