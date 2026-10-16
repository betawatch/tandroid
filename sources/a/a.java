package a;

import b5.b;
import b5.c;
import b5.e;
import b5.m;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
