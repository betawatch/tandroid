package a8;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class p9 {
    public static boolean a(String str) {
        e5.b bVar = e5.k.a;
        Set<e5.d> unmodifiableSet = DesugarCollections.unmodifiableSet(e5.c.c);
        HashSet hashSet = new HashSet();
        for (e5.d dVar : unmodifiableSet) {
            if (((e5.c) dVar).a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e5.c cVar = (e5.c) ((e5.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }
}
