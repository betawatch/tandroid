package a;

import b5.b;
import b5.c;
import b5.e;
import b5.m;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class a {
    public static boolean a(String str) {
        b bVar = m.a;
        Set<e> unmodifiableSet = DesugarCollections.unmodifiableSet(c.c);
        HashSet hashSet = new HashSet();
        for (e eVar : unmodifiableSet) {
            if (((c) eVar).a.equals(str)) {
                hashSet.add(eVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((e) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }
}
