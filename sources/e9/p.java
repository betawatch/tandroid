package e9;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p extends y0 implements Serializable {
    public final d9.e a;
    public final y0 b;

    public p(d9.e eVar, y0 y0Var) {
        this.a = eVar;
        this.b = y0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d9.e eVar = this.a;
        return this.b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
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
