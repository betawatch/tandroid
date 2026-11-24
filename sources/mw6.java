// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mw6 {
    public pw6 a;

    public mw6(String str, int i, int i2) {
        if (str == null) {
            fvc.f("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            w26.j("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new ow6(str, i, i2);
        } else {
            this.a = new pw6(str, i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mw6) {
            return this.a.equals(((mw6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
