// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c61 extends at7 implements Serializable {
    public final bs4 a;
    public final at7 b;

    public c61(bs4 bs4Var, at7 at7Var) {
        this.a = bs4Var;
        this.b = at7Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        bs4 bs4Var = this.a;
        return this.b.compare(bs4Var.apply(obj), bs4Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c61)) {
            return false;
        }
        c61 c61Var = (c61) obj;
        return this.a.equals(c61Var.a) && this.b.equals(c61Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
