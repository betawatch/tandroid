package f9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class l implements i1 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    @Override // f9.i1
    public Collection a() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection e = e();
        this.a = e;
        return e;
    }

    @Override // f9.i1
    public Map b() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map d = d();
        this.d = d;
        return d;
    }

    public boolean c(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    public abstract Collection e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            return b().equals(((i1) obj).b());
        }
        return false;
    }

    public abstract Set f();

    public abstract Iterator g();

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // f9.i1
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set f7 = f();
        this.b = f7;
        return f7;
    }

    @Override // f9.i1
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }
}
