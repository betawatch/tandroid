package c8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class sc {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u9.a aVar = (u9.a) obj;
            u9.h hVar = new u9.h(aVar);
            for (u9.r rVar : aVar.b) {
                boolean z9 = aVar.e == 0;
                u9.i iVar = new u9.i(rVar, !z9);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z9) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (u9.h hVar2 : (Set) it.next()) {
                for (u9.j jVar : hVar2.a.c) {
                    if (jVar.c == 0) {
                        Set<u9.h> set2 = (Set) hashMap.get(new u9.i(jVar.a, jVar.b == 2));
                        if (set2 != null) {
                            for (u9.h hVar3 : set2) {
                                hVar2.b.add(hVar3);
                                hVar3.c.add(hVar2);
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
            u9.h hVar4 = (u9.h) it3.next();
            if (hVar4.c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            u9.h hVar5 = (u9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i7++;
            Iterator it4 = hVar5.b.iterator();
            while (it4.hasNext()) {
                u9.h hVar6 = (u9.h) it4.next();
                hVar6.c.remove(hVar5);
                if (hVar6.c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i7 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            u9.h hVar7 = (u9.h) it5.next();
            if (!hVar7.c.isEmpty() && !hVar7.b.isEmpty()) {
                arrayList2.add(hVar7.a);
            }
        }
        throw new u9.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
