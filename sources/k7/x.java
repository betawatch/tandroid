package k7;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class x {
    public static boolean a(String str) {
        o2.b bVar = o2.k.a;
        Set<o2.d> unmodifiableSet = DesugarCollections.unmodifiableSet(o2.c.c);
        HashSet hashSet = new HashSet();
        for (o2.d dVar : unmodifiableSet) {
            if (((o2.c) dVar).a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            o2.c cVar = (o2.c) ((o2.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }
}
