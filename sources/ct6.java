// default package

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ct6 {
    public static final ct6 d = new ct6(new pm3((byte) 16, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = gcc.a;
        e = "0";
        f = "1";
        g = "2";
    }

    public ct6(pm3 pm3Var) {
        this.a = (Uri) pm3Var.b;
        this.b = (String) pm3Var.c;
        this.c = (Bundle) pm3Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct6)) {
            return false;
        }
        ct6 ct6Var = (ct6) obj;
        if (Objects.equals(this.a, ct6Var.a) && Objects.equals(this.b, ct6Var.b)) {
            if ((this.c == null) == (ct6Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
