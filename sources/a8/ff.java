package a8;

import java.io.Serializable;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class ff {
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public Serializable g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public aa.a0 a() {
        String str = this.a == null ? " sdkVersion" : "";
        if (this.b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.c == null) {
            str = b10.u(str, " platform");
        }
        if (this.d == null) {
            str = b10.u(str, " installationUuid");
        }
        if (((String) this.g) == null) {
            str = b10.u(str, " buildVersion");
        }
        if (((String) this.h) == null) {
            str = b10.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new aa.a0(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, (String) this.g, (String) this.h, (aa.f2) this.i, (aa.l1) this.j, (aa.i1) this.k);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
