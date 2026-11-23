package da;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
