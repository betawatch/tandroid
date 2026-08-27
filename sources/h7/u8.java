package h7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class u8 {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z8.a aVar = (z8.a) obj;
            z8.g gVar = new z8.g(aVar);
            for (z8.q qVar : aVar.b) {
                boolean z10 = aVar.e == 0;
                z8.h hVar = new z8.h(qVar, !z10);
                if (!hashMap.containsKey(hVar)) {
                    hashMap.put(hVar, new HashSet());
                }
                Set set = (Set) hashMap.get(hVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set.add(gVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (z8.g gVar2 : (Set) it.next()) {
                for (z8.i iVar : gVar2.a.c) {
                    if (iVar.c == 0) {
                        Set<z8.g> set2 = (Set) hashMap.get(new z8.h(iVar.a, iVar.b == 2));
                        if (set2 != null) {
                            for (z8.g gVar3 : set2) {
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
            z8.g gVar4 = (z8.g) it3.next();
            if (gVar4.c.isEmpty()) {
                hashSet2.add(gVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            z8.g gVar5 = (z8.g) hashSet2.iterator().next();
            hashSet2.remove(gVar5);
            i10++;
            Iterator it4 = gVar5.b.iterator();
            while (it4.hasNext()) {
                z8.g gVar6 = (z8.g) it4.next();
                gVar6.c.remove(gVar5);
                if (gVar6.c.isEmpty()) {
                    hashSet2.add(gVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            z8.g gVar7 = (z8.g) it5.next();
            if (!gVar7.c.isEmpty() && !gVar7.b.isEmpty()) {
                arrayList2.add(gVar7.a);
            }
        }
        throw new z8.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
