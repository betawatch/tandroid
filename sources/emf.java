// default package

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class emf implements yhd {
    public transient o4f a;
    public transient e3 b;

    public final Map a() {
        e3 e3Var = this.b;
        if (e3Var != null) {
            return e3Var;
        }
        lmf lmfVar = (lmf) this;
        e3 e3Var2 = new e3(lmfVar, lmfVar.c, (byte) 1);
        this.b = e3Var2;
        return e3Var2;
    }

    public final Set b() {
        o4f o4fVar = this.a;
        if (o4fVar != null) {
            return o4fVar;
        }
        lmf lmfVar = (lmf) this;
        o4f o4fVar2 = new o4f(lmfVar, lmfVar.c);
        this.a = o4fVar2;
        return o4fVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yhd) {
            return a().equals(((emf) ((yhd) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((lp2) ((e3) a()).d).hashCode();
    }

    public final String toString() {
        return ((lp2) ((e3) a()).d).toString();
    }
}
