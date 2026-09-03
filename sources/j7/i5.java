package j7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            c9.k kVar = new c9.k(bVar);
            for (c9.u uVar : bVar.b) {
                boolean z4 = bVar.e == 0;
                c9.l lVar = new c9.l(uVar, !z4);
                if (!hashMap.containsKey(lVar)) {
                    hashMap.put(lVar, new HashSet());
                }
                Set set = (Set) hashMap.get(lVar);
                if (!set.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + uVar + ".");
                }
                set.add(kVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (c9.k kVar2 : (Set) it.next()) {
                for (c9.m mVar : kVar2.a.c) {
                    if (mVar.c == 0) {
                        Set<c9.k> set2 = (Set) hashMap.get(new c9.l(mVar.a, mVar.b == 2));
                        if (set2 != null) {
                            for (c9.k kVar3 : set2) {
                                kVar2.b.add(kVar3);
                                kVar3.c.add(kVar2);
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
            c9.k kVar4 = (c9.k) it3.next();
            if (kVar4.c.isEmpty()) {
                hashSet2.add(kVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            c9.k kVar5 = (c9.k) hashSet2.iterator().next();
            hashSet2.remove(kVar5);
            i10++;
            Iterator it4 = kVar5.b.iterator();
            while (it4.hasNext()) {
                c9.k kVar6 = (c9.k) it4.next();
                kVar6.c.remove(kVar5);
                if (kVar6.c.isEmpty()) {
                    hashSet2.add(kVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            c9.k kVar7 = (c9.k) it5.next();
            if (!kVar7.c.isEmpty() && !kVar7.b.isEmpty()) {
                arrayList2.add(kVar7.a);
            }
        }
        throw new c9.n("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
