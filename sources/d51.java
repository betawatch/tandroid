// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class d51 extends eu7 implements Serializable {
    public final es4 a;
    public final eu7 b;

    public d51(es4 es4Var, eu7 eu7Var) {
        this.a = es4Var;
        this.b = eu7Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        es4 es4Var = this.a;
        return this.b.compare(es4Var.apply(obj), es4Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d51)) {
            return false;
        }
        d51 d51Var = (d51) obj;
        return this.a.equals(d51Var.a) && this.b.equals(d51Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
