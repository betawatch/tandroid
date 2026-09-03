package j7;

import java.io.Serializable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            str = w.c.e(str, " platform");
        }
        if (this.c == null) {
            str = w.c.e(str, " installationUuid");
        }
        if (((String) this.k) == null) {
            str = w.c.e(str, " buildVersion");
        }
        if (((String) this.f) == null) {
            str = w.c.e(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new k9.a0(this.a, this.b, this.i.intValue(), this.c, this.d, this.e, (String) this.k, (String) this.f, (k9.d2) this.g, (k9.j1) this.h, (k9.g1) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
