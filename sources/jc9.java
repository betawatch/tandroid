// default package

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jc9 {
    public final Resources a;
    public final Resources.Theme b;

    public jc9(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jc9.class == obj.getClass()) {
            jc9 jc9Var = (jc9) obj;
            if (this.a.equals(jc9Var.a) && Objects.equals(this.b, jc9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
