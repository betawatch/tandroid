// default package

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ohf implements fdd {
    public transient xze a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var != null) {
            return d3Var;
        }
        vhf vhfVar = (vhf) this;
        d3 d3Var2 = new d3(vhfVar, vhfVar.c, (byte) 1);
        this.b = d3Var2;
        return d3Var2;
    }

    public final Set b() {
        xze xzeVar = this.a;
        if (xzeVar != null) {
            return xzeVar;
        }
        vhf vhfVar = (vhf) this;
        xze xzeVar2 = new xze(vhfVar, vhfVar.c);
        this.a = xzeVar2;
        return xzeVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdd) {
            return a().equals(((ohf) ((fdd) obj)).a());
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
