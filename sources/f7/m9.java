package f7;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m9 extends i9 implements Set {
    public transient l9 b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i9 += next != null ? next.hashCode() : 0;
        }
        return i9;
    }

    public final l9 q() {
        l9 l9Var = this.b;
        if (l9Var != null) {
            return l9Var;
        }
        o9 o9Var = new o9((a) this);
        this.b = o9Var;
        return o9Var;
    }
}
