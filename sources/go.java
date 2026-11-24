// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class go {
    public final int a;
    public final yn b;
    public final vn c;
    public final String d;

    public go(yn ynVar, vn vnVar, String str) {
        this.b = ynVar;
        this.c = vnVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{ynVar, vnVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return cqe.a(this.b, goVar.b) && cqe.a(this.c, goVar.c) && cqe.a(this.d, goVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
