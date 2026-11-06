package h9;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n extends r1 implements Serializable {
    public final g9.k a;
    public final r1 b;

    public n(g9.k kVar, r1 r1Var) {
        this.a = kVar;
        this.b = r1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g9.k kVar = this.a;
        return this.b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a.equals(nVar.a) && this.b.equals(nVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
