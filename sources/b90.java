// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
