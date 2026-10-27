package a8;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
