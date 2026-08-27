package i7;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g implements u {
    public transient a a;
    public transient wa b;

    public final Map a() {
        wa waVar = this.b;
        if (waVar != null) {
            return waVar;
        }
        h hVar = (h) this;
        wa waVar2 = new wa(hVar, hVar.c, 0);
        this.b = waVar2;
        return waVar2;
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
        return ((wa) a()).b.hashCode();
    }

    public final String toString() {
        return ((wa) a()).b.toString();
    }
}
