package da;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
