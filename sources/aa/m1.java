package aa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class m1 {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s9.a aVar = (s9.a) obj;
            s9.h hVar = new s9.h(aVar);
            for (s9.r rVar : aVar.b) {
                boolean z10 = aVar.e == 0;
                s9.i iVar = new s9.i(rVar, !z10);
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
            for (s9.h hVar2 : (Set) it.next()) {
                for (s9.j jVar : hVar2.a.c) {
                    if (jVar.c == 0) {
                        Set<s9.h> set2 = (Set) hashMap.get(new s9.i(jVar.a, jVar.b == 2));
                        if (set2 != null) {
                            for (s9.h hVar3 : set2) {
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
            s9.h hVar4 = (s9.h) it3.next();
            if (hVar4.c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            s9.h hVar5 = (s9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i10++;
            Iterator it4 = hVar5.b.iterator();
            while (it4.hasNext()) {
                s9.h hVar6 = (s9.h) it4.next();
                hVar6.c.remove(hVar5);
                if (hVar6.c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            s9.h hVar7 = (s9.h) it5.next();
            if (!hVar7.c.isEmpty() && !hVar7.b.isEmpty()) {
                arrayList2.add(hVar7.a);
            }
        }
        throw new s9.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
