// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mk6 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public mk6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != mk6.class) {
            return false;
        }
        mk6 mk6Var = (mk6) obj;
        return TextUtils.equals(this.a, mk6Var.a) && this.b == mk6Var.b && this.c == mk6Var.c;
    }

    public final int hashCode() {
        return ((ir2.j(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
