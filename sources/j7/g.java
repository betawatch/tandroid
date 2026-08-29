package j7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class g implements u {
    public transient a a;
    public transient xa b;

    public final Map a() {
        xa xaVar = this.b;
        if (xaVar != null) {
            return xaVar;
        }
        h hVar = (h) this;
        xa xaVar2 = new xa(hVar, hVar.c, 0);
        this.b = xaVar2;
        return xaVar2;
    }

    public final Set b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        h hVar = (h) this;
        a aVar2 = new a(hVar, hVar.c);
        this.a = aVar2;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return a().equals(((g) ((u) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((xa) a()).b.hashCode();
    }

    public final String toString() {
        return ((xa) a()).b.toString();
    }
}
