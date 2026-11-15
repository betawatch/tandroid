package h9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class l implements i1 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    @Override // h9.i1
    public Collection a() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection e10 = e();
        this.a = e10;
        return e10;
    }

    @Override // h9.i1
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

    @Override // h9.i1
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set f10 = f();
        this.b = f10;
        return f10;
    }

    @Override // h9.i1
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }
}
