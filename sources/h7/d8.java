package h7;

import java.io.Serializable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d8 {
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

    public i9.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.i == null) {
            str = u3.c.k(str, " platform");
        }
        if (this.c == null) {
            str = u3.c.k(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = u3.c.k(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = u3.c.k(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new i9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (i9.d2) this.g, (i9.j1) this.h, (i9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
