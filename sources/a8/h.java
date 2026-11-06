package a8;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class h implements y {
    public transient b a;
    public transient kb b;

    public final Map a() {
        kb kbVar = this.b;
        if (kbVar != null) {
            return kbVar;
        }
        i iVar = (i) this;
        kb kbVar2 = new kb(iVar, iVar.c, 0);
        this.b = kbVar2;
        return kbVar2;
    }

    public final Set b() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar;
        }
        i iVar = (i) this;
        b bVar2 = new b(iVar, iVar.c);
        this.a = bVar2;
        return bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return a().equals(((h) ((y) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((kb) a()).b.hashCode();
    }

    public final String toString() {
        return ((kb) a()).b.toString();
    }
}
