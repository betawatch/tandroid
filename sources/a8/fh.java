package a8;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class fh implements p {
    public transient nd a;
    public transient pb b;

    public final Map a() {
        pb pbVar = this.b;
        if (pbVar != null) {
            return pbVar;
        }
        gh ghVar = (gh) this;
        pb pbVar2 = new pb(ghVar, ghVar.c, 0);
        this.b = pbVar2;
        return pbVar2;
    }

    public final Set b() {
        nd ndVar = this.a;
        if (ndVar != null) {
            return ndVar;
        }
        gh ghVar = (gh) this;
        nd ndVar2 = new nd(ghVar, ghVar.c);
        this.a = ndVar2;
        return ndVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return a().equals(((fh) ((p) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((pb) a()).b.hashCode();
    }

    public final String toString() {
        return ((pb) a()).b.toString();
    }
}
