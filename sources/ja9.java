// default package

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
