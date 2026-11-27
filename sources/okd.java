// default package

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class okd extends ejd implements Set, j$.util.Set {
    public transient vjd b;

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
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // ejd
    public vjd k() {
        vjd vjdVar = this.b;
        if (vjdVar != null) {
            return vjdVar;
        }
        vjd n = n();
        this.b = n;
        return n;
    }

    public vjd n() {
        Object[] array = toArray(ejd.a);
        jjd jjdVar = vjd.b;
        return vjd.o(array.length, array);
    }
}
