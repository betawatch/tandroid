package b8;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ch implements p {
    public transient kd a;
    public transient mb b;

    public final Map a() {
        mb mbVar = this.b;
        if (mbVar != null) {
            return mbVar;
        }
        dh dhVar = (dh) this;
        mb mbVar2 = new mb(dhVar, dhVar.c, 0);
        this.b = mbVar2;
        return mbVar2;
    }

    public final Set b() {
        kd kdVar = this.a;
        if (kdVar != null) {
            return kdVar;
        }
        dh dhVar = (dh) this;
        kd kdVar2 = new kd(dhVar, dhVar.c);
        this.a = kdVar2;
        return kdVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return a().equals(((ch) ((p) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((mb) a()).b.hashCode();
    }

    public final String toString() {
        return ((mb) a()).b.toString();
    }
}
