package h7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a9.b bVar = (a9.b) obj;
            a9.k kVar = new a9.k(bVar);
            for (a9.v vVar : bVar.b) {
                boolean z10 = bVar.e == 0;
                a9.l lVar = new a9.l(vVar, !z10);
                if (!hashMap.containsKey(lVar)) {
                    hashMap.put(lVar, new HashSet());
                }
                Set set = (Set) hashMap.get(lVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + vVar + ".");
                }
                set.add(kVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (a9.k kVar2 : (Set) it.next()) {
                for (a9.m mVar : kVar2.a.c) {
                    if (mVar.c == 0) {
                        Set<a9.k> set2 = (Set) hashMap.get(new a9.l(mVar.a, mVar.b == 2));
                        if (set2 != null) {
                            for (a9.k kVar3 : set2) {
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
            a9.k kVar4 = (a9.k) it3.next();
            if (kVar4.c.isEmpty()) {
                hashSet2.add(kVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            a9.k kVar5 = (a9.k) hashSet2.iterator().next();
            hashSet2.remove(kVar5);
            i10++;
            Iterator it4 = kVar5.b.iterator();
            while (it4.hasNext()) {
                a9.k kVar6 = (a9.k) it4.next();
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
            a9.k kVar7 = (a9.k) it5.next();
            if (!kVar7.c.isEmpty() && !kVar7.b.isEmpty()) {
                arrayList2.add(kVar7.a);
            }
        }
        throw new a9.n("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
