// default package

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class bwe {
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static n9a b(Set set, di8 di8Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof n9a)) {
                return new o9a(set2, di8Var);
            }
            n9a n9aVar = (n9a) set2;
            di8 di8Var2 = n9aVar.b;
            di8Var2.getClass();
            return new o9a((SortedSet) n9aVar.a, new ei8(Arrays.asList(di8Var2, di8Var)));
        }
        if (!(set instanceof n9a)) {
            set.getClass();
            return new n9a(set, di8Var);
        }
        n9a n9aVar2 = (n9a) set;
        di8 di8Var3 = n9aVar2.b;
        di8Var3.getClass();
        return new n9a(n9aVar2.a, new ei8(Arrays.asList(di8Var3, di8Var)));
    }

    public static int c(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static m9a d(yo5 yo5Var, yo5 yo5Var2) {
        jte.l(yo5Var, "set1");
        jte.l(yo5Var2, "set2");
        return new m9a(yo5Var, yo5Var2);
    }
}
