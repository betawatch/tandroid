package f9;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n extends q1 implements Serializable {
    public final e9.k a;
    public final q1 b;

    public n(e9.k kVar, q1 q1Var) {
        this.a = kVar;
        this.b = q1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e9.k kVar = this.a;
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
