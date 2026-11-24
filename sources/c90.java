// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c90 {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final d90 a() {
        if (this.g == 31) {
            return new d90(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.g & 16) == 0) {
            sb.append(" diskUsed");
        }
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }
}
