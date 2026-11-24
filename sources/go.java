// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
