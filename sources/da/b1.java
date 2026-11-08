package da;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b1 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final c1 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new c1(str, this.e, this.c, this.a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.b == null) {
            sb2.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
