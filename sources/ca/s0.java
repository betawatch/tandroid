package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 {
    public long a;
    public String b;
    public k2 c;
    public l2 d;
    public m2 e;
    public p2 f;
    public byte g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.g == 1 && (str = this.b) != null && (k2Var = this.c) != null && (l2Var = this.d) != null) {
            return new t0(this.a, str, k2Var, l2Var, this.e, this.f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.b == null) {
            sb2.append(" type");
        }
        if (this.c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
