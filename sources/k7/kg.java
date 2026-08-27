package k7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class kg implements k {
    public transient ed a;
    public transient i7.wa b;

    public final Map a() {
        i7.wa waVar = this.b;
        if (waVar != null) {
            return waVar;
        }
        lg lgVar = (lg) this;
        i7.wa waVar2 = new i7.wa(lgVar, lgVar.c, 1);
        this.b = waVar2;
        return waVar2;
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
        return ((i7.wa) a()).b.hashCode();
    }

    public final String toString() {
        return ((i7.wa) a()).b.toString();
    }
}
