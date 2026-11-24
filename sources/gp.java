// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gp {
    public final int a;
    public final zo b;
    public final wo c;
    public final String d;

    public gp(zo zoVar, wo woVar, String str) {
        this.b = zoVar;
        this.c = woVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{zoVar, woVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return fse.a(this.b, gpVar.b) && fse.a(this.c, gpVar.c) && fse.a(this.d, gpVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
