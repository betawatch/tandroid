package b8;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class p9 {
    public static boolean a(String str) {
        d5.b bVar = d5.l.a;
        Set<d5.d> unmodifiableSet = DesugarCollections.unmodifiableSet(d5.c.c);
        HashSet hashSet = new HashSet();
        for (d5.d dVar : unmodifiableSet) {
            if (((d5.c) dVar).a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            d5.c cVar = (d5.c) ((d5.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }
}
