package j7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class i5 {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            c9.b bVar = (c9.b) obj;
            c9.j jVar = new c9.j(bVar);
            for (c9.t tVar : bVar.b) {
                boolean z4 = bVar.e == 0;
                c9.k kVar = new c9.k(tVar, !z4);
                if (!hashMap.containsKey(kVar)) {
                    hashMap.put(kVar, new HashSet());
                }
                Set set = (Set) hashMap.get(kVar);
                if (!set.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + tVar + ".");
                }
                set.add(jVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (c9.j jVar2 : (Set) it.next()) {
                for (c9.l lVar : jVar2.a.c) {
                    if (lVar.c == 0) {
                        Set<c9.j> set2 = (Set) hashMap.get(new c9.k(lVar.a, lVar.b == 2));
                        if (set2 != null) {
                            for (c9.j jVar3 : set2) {
                                jVar2.b.add(jVar3);
                                jVar3.c.add(jVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            c9.j jVar4 = (c9.j) it3.next();
            if (jVar4.c.isEmpty()) {
                hashSet2.add(jVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            c9.j jVar5 = (c9.j) hashSet2.iterator().next();
            hashSet2.remove(jVar5);
            i10++;
            Iterator it4 = jVar5.b.iterator();
            while (it4.hasNext()) {
                c9.j jVar6 = (c9.j) it4.next();
                jVar6.c.remove(jVar5);
                if (jVar6.c.isEmpty()) {
                    hashSet2.add(jVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            c9.j jVar7 = (c9.j) it5.next();
            if (!jVar7.c.isEmpty() && !jVar7.b.isEmpty()) {
                arrayList2.add(jVar7.a);
            }
        }
        throw new c9.m("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
