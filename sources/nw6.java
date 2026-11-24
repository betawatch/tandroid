// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nw6 {
    public rw6 a;

    public nw6(String str, int i, int i2) {
        if (str == null) {
            fvc.f("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            w26.j("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new rw6(str, i, i2);
            return;
        }
        qw6 qw6Var = new qw6(str, i, i2);
        h15.b(i, i2, str);
        this.a = qw6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nw6) {
            return this.a.equals(((nw6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
