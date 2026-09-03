package n7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class lg implements k {
    public transient fd a;
    public transient l7.xa b;

    public final Map a() {
        l7.xa xaVar = this.b;
        if (xaVar != null) {
            return xaVar;
        }
        mg mgVar = (mg) this;
        l7.xa xaVar2 = new l7.xa(mgVar, mgVar.c, 1);
        this.b = xaVar2;
        return xaVar2;
    }

    public final Set b() {
        fd fdVar = this.a;
        if (fdVar != null) {
            return fdVar;
        }
        mg mgVar = (mg) this;
        fd fdVar2 = new fd(mgVar, mgVar.c);
        this.a = fdVar2;
        return fdVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return a().equals(((lg) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((l7.xa) a()).b.hashCode();
    }

    public final String toString() {
        return ((l7.xa) a()).b.toString();
    }
}
