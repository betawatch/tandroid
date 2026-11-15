package a8;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class h implements y {
    public transient b a;
    public transient lb b;

    public final Map a() {
        lb lbVar = this.b;
        if (lbVar != null) {
            return lbVar;
        }
        i iVar = (i) this;
        lb lbVar2 = new lb(iVar, iVar.c, 0);
        this.b = lbVar2;
        return lbVar2;
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
        return ((lb) a()).b.hashCode();
    }

    public final String toString() {
        return ((lb) a()).b.toString();
    }
}
