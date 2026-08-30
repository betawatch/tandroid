package j7;

import java.io.Serializable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f8 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Object f;
    public Object g;
    public Object h;
    public Integer i;
    public Object j;
    public Serializable k;

    public k9.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.i == null) {
            str = vh.v2.k(str, " platform");
        }
        if (this.c == null) {
            str = vh.v2.k(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = vh.v2.k(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = vh.v2.k(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new k9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (k9.d2) this.g, (k9.j1) this.h, (k9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
