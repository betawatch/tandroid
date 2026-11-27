// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class e90 {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final f90 a() {
        if (this.g == 31) {
            return new f90(this.a, this.b, this.c, this.d, this.e, this.f);
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
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
