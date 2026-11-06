package c8;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class ig implements k {
    public transient cd a;
    public transient a8.kb b;

    public final Map a() {
        a8.kb kbVar = this.b;
        if (kbVar != null) {
            return kbVar;
        }
        jg jgVar = (jg) this;
        a8.kb kbVar2 = new a8.kb(jgVar, jgVar.c, 1);
        this.b = kbVar2;
        return kbVar2;
    }

    public final Set b() {
        cd cdVar = this.a;
        if (cdVar != null) {
            return cdVar;
        }
        jg jgVar = (jg) this;
        cd cdVar2 = new cd(jgVar, jgVar.c);
        this.a = cdVar2;
        return cdVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return a().equals(((ig) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((a8.kb) a()).b.hashCode();
    }

    public final String toString() {
        return ((a8.kb) a()).b.toString();
    }
}
