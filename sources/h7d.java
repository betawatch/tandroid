// default package

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class h7d implements red {
    public transient d5d a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var != null) {
            return d3Var;
        }
        j7d j7dVar = (j7d) this;
        d3 d3Var2 = new d3(j7dVar, j7dVar.c, (byte) 2);
        this.b = d3Var2;
        return d3Var2;
    }

    public final Set b() {
        d5d d5dVar = this.a;
        if (d5dVar != null) {
            return d5dVar;
        }
        j7d j7dVar = (j7d) this;
        d5d d5dVar2 = new d5d(j7dVar, j7dVar.c);
        this.a = d5dVar2;
        return d5dVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof red) {
            return a().equals(((h7d) ((red) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((so2) ((d3) a()).d).hashCode();
    }

    public final String toString() {
        return ((so2) ((d3) a()).d).toString();
    }
}
