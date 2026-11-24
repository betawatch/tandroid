// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class emc implements wo {
    public final byte a;

    public emc(d10 d10Var) {
        this.a = d10Var.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof emc) || !fse.a(Integer.valueOf(this.a), Integer.valueOf(((emc) obj).a)) || !fse.a(1, 1) || !fse.a(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return fse.a(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
