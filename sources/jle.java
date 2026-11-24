// default package

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class jle {
    public static Object a(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object b(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return oo1.m(1, list);
        }
        w26.g();
        return null;
    }

    public static void c(List list, bg8 bg8Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (bg8Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
