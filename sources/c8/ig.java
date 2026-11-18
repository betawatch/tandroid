package c8;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class ig implements k {
    public transient cd a;
    public transient a8.lb b;

    public final Map a() {
        a8.lb lbVar = this.b;
        if (lbVar != null) {
            return lbVar;
        }
        jg jgVar = (jg) this;
        a8.lb lbVar2 = new a8.lb(jgVar, jgVar.c, 1);
        this.b = lbVar2;
        return lbVar2;
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
        return ((a8.lb) a()).b.hashCode();
    }

    public final String toString() {
        return ((a8.lb) a()).b.toString();
    }
}
