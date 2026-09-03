package k7;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class x {
    public static boolean a(String str) {
        o2.b bVar = o2.l.a;
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
