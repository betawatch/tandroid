package l7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class kg implements k {
    public transient ed a;
    public transient j7.xa b;

    public final Map a() {
        j7.xa xaVar = this.b;
        if (xaVar != null) {
            return xaVar;
        }
        lg lgVar = (lg) this;
        j7.xa xaVar2 = new j7.xa(lgVar, lgVar.c, 1);
        this.b = xaVar2;
        return xaVar2;
    }

    public final Set b() {
        ed edVar = this.a;
        if (edVar != null) {
            return edVar;
        }
        lg lgVar = (lg) this;
        ed edVar2 = new ed(lgVar, lgVar.c);
        this.a = edVar2;
        return edVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return a().equals(((kg) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((j7.xa) a()).b.hashCode();
    }

    public final String toString() {
        return ((j7.xa) a()).b.toString();
    }
}
