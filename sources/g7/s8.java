package g7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s8 {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y8.a aVar = (y8.a) obj;
            y8.h hVar = new y8.h(aVar);
            for (y8.r rVar : aVar.b) {
                boolean z10 = aVar.e == 0;
                y8.i iVar = new y8.i(rVar, !z10);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (y8.h hVar2 : (Set) it.next()) {
                for (y8.j jVar : hVar2.a.c) {
                    if (jVar.c == 0) {
                        Set<y8.h> set2 = (Set) hashMap.get(new y8.i(jVar.a, jVar.b == 2));
                        if (set2 != null) {
                            for (y8.h hVar3 : set2) {
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
            y8.h hVar4 = (y8.h) it3.next();
            if (hVar4.c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            y8.h hVar5 = (y8.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i9++;
            Iterator it4 = hVar5.b.iterator();
            while (it4.hasNext()) {
                y8.h hVar6 = (y8.h) it4.next();
                hVar6.c.remove(hVar5);
                if (hVar6.c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i9 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            y8.h hVar7 = (y8.h) it5.next();
            if (!hVar7.c.isEmpty() && !hVar7.b.isEmpty()) {
                arrayList2.add(hVar7.a);
            }
        }
        throw new y8.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
