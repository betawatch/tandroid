// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class my6 {
    public py6 a;

    public my6(String str, int i, int i2) {
        if (str == null) {
            gxc.d("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            u36.j("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new oy6(str, i, i2);
        } else {
            this.a = new py6(str, i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof my6) {
            return this.a.equals(((my6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
