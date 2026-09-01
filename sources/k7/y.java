package k7;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class y {
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
