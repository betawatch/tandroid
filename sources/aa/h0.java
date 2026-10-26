package aa;

import java.util.List;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h0 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Boolean f;
    public n1 g;
    public e2 h;
    public d2 i;
    public o1 j;
    public List k;
    public Integer l;

    public final i0 a() {
        String str = this.a == null ? " generator" : "";
        if (this.b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = b10.u(str, " startedAt");
        }
        if (this.f == null) {
            str = b10.u(str, " crashed");
        }
        if (this.g == null) {
            str = b10.u(str, " app");
        }
        if (this.l == null) {
            str = b10.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new i0(this.a, this.b, this.c, this.d.longValue(), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
