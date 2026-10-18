package e9;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class r extends v1 implements Serializable {
    public final d9.k a;
    public final v1 b;

    public r(d9.k kVar, v1 v1Var) {
        this.a = kVar;
        this.b = v1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d9.k kVar = this.a;
        return this.b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a.equals(rVar.a) && this.b.equals(rVar.b)) {
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
