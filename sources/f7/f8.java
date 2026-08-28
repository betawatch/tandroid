package f7;

import java.io.Serializable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public g9.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.i == null) {
            str = ta.b.j(str, " platform");
        }
        if (this.c == null) {
            str = ta.b.j(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = ta.b.j(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = ta.b.j(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new g9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (g9.d2) this.g, (g9.j1) this.h, (g9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
