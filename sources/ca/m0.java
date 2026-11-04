package ca;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public b2 g;
    public s2 h;
    public r2 i;
    public c2 j;
    public List k;
    public int l;
    public byte m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (b2Var = this.g) != null) {
            return new n0(str, str2, this.c, this.d, this.e, this.f, b2Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" generator");
        }
        if (this.b == null) {
            sb2.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.g == null) {
            sb2.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
