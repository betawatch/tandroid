// default package

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ja9 {
    public final Resources a;
    public final Resources.Theme b;

    public ja9(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ja9.class == obj.getClass()) {
            ja9 ja9Var = (ja9) obj;
            if (this.a.equals(ja9Var.a) && Objects.equals(this.b, ja9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
