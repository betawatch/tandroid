package j7;

import java.io.Serializable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g8 {
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
            str = vh.w2.k(str, " platform");
        }
        if (this.c == null) {
            str = vh.w2.k(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = vh.w2.k(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = vh.w2.k(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new k9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (k9.d2) this.g, (k9.j1) this.h, (k9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
