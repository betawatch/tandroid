package c8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class rc {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u9.a aVar = (u9.a) obj;
            u9.g gVar = new u9.g(aVar);
            for (u9.q qVar : aVar.b) {
                boolean z9 = aVar.e == 0;
                u9.h hVar = new u9.h(qVar, !z9);
                if (!hashMap.containsKey(hVar)) {
                    hashMap.put(hVar, new HashSet());
                }
                Set set = (Set) hashMap.get(hVar);
                if (!set.isEmpty() && z9) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set.add(gVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (u9.g gVar2 : (Set) it.next()) {
                for (u9.i iVar : gVar2.a.c) {
                    if (iVar.c == 0) {
                        Set<u9.g> set2 = (Set) hashMap.get(new u9.h(iVar.a, iVar.b == 2));
                        if (set2 != null) {
                            for (u9.g gVar3 : set2) {
                                gVar2.b.add(gVar3);
                                gVar3.c.add(gVar2);
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
            u9.g gVar4 = (u9.g) it3.next();
            if (gVar4.c.isEmpty()) {
                hashSet2.add(gVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            u9.g gVar5 = (u9.g) hashSet2.iterator().next();
            hashSet2.remove(gVar5);
            i7++;
            Iterator it4 = gVar5.b.iterator();
            while (it4.hasNext()) {
                u9.g gVar6 = (u9.g) it4.next();
                gVar6.c.remove(gVar5);
                if (gVar6.c.isEmpty()) {
                    hashSet2.add(gVar6);
                }
            }
        }
        if (i7 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            u9.g gVar7 = (u9.g) it5.next();
            if (!gVar7.c.isEmpty() && !gVar7.b.isEmpty()) {
                arrayList2.add(gVar7.a);
            }
        }
        throw new u9.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
