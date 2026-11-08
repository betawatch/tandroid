package da;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
