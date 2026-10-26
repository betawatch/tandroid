package a8;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class v1 {
    public static boolean a(String str) {
        c5.b bVar = c5.m.a;
        Set<c5.e> unmodifiableSet = DesugarCollections.unmodifiableSet(c5.c.c);
        HashSet hashSet = new HashSet();
        for (c5.e eVar : unmodifiableSet) {
            if (((c5.c) eVar).a.equals(str)) {
                hashSet.add(eVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c5.c cVar = (c5.c) ((c5.e) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }
}
