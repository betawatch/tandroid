package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
