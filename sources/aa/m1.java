package aa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            s9.i iVar = new s9.i(aVar);
            for (s9.s sVar : aVar.b) {
                boolean z10 = aVar.e == 0;
                s9.j jVar = new s9.j(sVar, !z10);
                if (!hashMap.containsKey(jVar)) {
                    hashMap.put(jVar, new HashSet());
                }
                Set set = (Set) hashMap.get(jVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + sVar + ".");
                }
                set.add(iVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (s9.i iVar2 : (Set) it.next()) {
                for (s9.k kVar : iVar2.a.c) {
                    if (kVar.c == 0) {
                        Set<s9.i> set2 = (Set) hashMap.get(new s9.j(kVar.a, kVar.b == 2));
                        if (set2 != null) {
                            for (s9.i iVar3 : set2) {
                                iVar2.b.add(iVar3);
                                iVar3.c.add(iVar2);
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
            s9.i iVar4 = (s9.i) it3.next();
            if (iVar4.c.isEmpty()) {
                hashSet2.add(iVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            s9.i iVar5 = (s9.i) hashSet2.iterator().next();
            hashSet2.remove(iVar5);
            i10++;
            Iterator it4 = iVar5.b.iterator();
            while (it4.hasNext()) {
                s9.i iVar6 = (s9.i) it4.next();
                iVar6.c.remove(iVar5);
                if (iVar6.c.isEmpty()) {
                    hashSet2.add(iVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            s9.i iVar7 = (s9.i) it5.next();
            if (!iVar7.c.isEmpty() && !iVar7.b.isEmpty()) {
                arrayList2.add(iVar7.a);
            }
        }
        throw new s9.l("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
