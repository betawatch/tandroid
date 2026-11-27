// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class b90 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final c90 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new c90(str, this.e, this.c, this.a, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
