package k9;

import java.util.List;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g0 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Boolean f;
    public l1 g;
    public c2 h;
    public b2 i;
    public m1 j;
    public List k;
    public Integer l;

    public final h0 a() {
        String str = this.a == null ? " generator" : "";
        if (this.b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = w2.k(str, " startedAt");
        }
        if (this.f == null) {
            str = w2.k(str, " crashed");
        }
        if (this.g == null) {
            str = w2.k(str, " app");
        }
        if (this.l == null) {
            str = w2.k(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.a, this.b, this.c, this.d.longValue(), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
