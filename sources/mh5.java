// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mh5 {
    public final go4 a;
    public final String b;
    public final String c;

    public mh5(go4 go4Var, String str, String str2) {
        fo4 a = go4Var.a();
        a.a = null;
        a.l = null;
        this.a = new go4(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh5)) {
            return false;
        }
        mh5 mh5Var = (mh5) obj;
        return this.a.equals(mh5Var.a) && Objects.equals(this.b, mh5Var.b) && Objects.equals(this.c, mh5Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
