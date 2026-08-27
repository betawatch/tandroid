package g7;

import java.io.Serializable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e8 {
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

    public h9.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.i == null) {
            str = s3.c.l(str, " platform");
        }
        if (this.c == null) {
            str = s3.c.l(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = s3.c.l(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = s3.c.l(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new h9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (h9.d2) this.g, (h9.j1) this.h, (h9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
