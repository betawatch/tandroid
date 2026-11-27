// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class m6d {
    public final ho a;
    public final a94 b;

    public /* synthetic */ m6d(ho hoVar, a94 a94Var) {
        this.a = hoVar;
        this.b = a94Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m6d)) {
            return false;
        }
        m6d m6dVar = (m6d) obj;
        return vue.a(this.a, m6dVar.a) && vue.a(this.b, m6dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        um4 um4Var = new um4(this);
        um4Var.a(this.a, "key");
        um4Var.a(this.b, "feature");
        return um4Var.toString();
    }
}
