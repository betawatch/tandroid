// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class hbe {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            mp2 mp2Var = (mp2) obj;
            z43 z43Var = new z43(mp2Var);
            for (xw8 xw8Var : mp2Var.b) {
                boolean z = mp2Var.e;
                a53 a53Var = new a53(xw8Var, z);
                if (!hashMap.containsKey(a53Var)) {
                    hashMap.put(a53Var, new HashSet());
                }
                Set set = (Set) hashMap.get(a53Var);
                if (!set.isEmpty() && !z) {
                    throw new IllegalArgumentException("Multiple components provide " + xw8Var + ".");
                }
                set.add(z43Var);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (z43 z43Var2 : (Set) it.next()) {
                for (wd3 wd3Var : z43Var2.a.c) {
                    if (wd3Var.c == 0) {
                        Set<z43> set2 = (Set) hashMap.get(new a53(wd3Var.a, wd3Var.b == 2));
                        if (set2 != null) {
                            for (z43 z43Var3 : set2) {
                                z43Var2.b.add(z43Var3);
                                z43Var3.c.add(z43Var2);
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
            z43 z43Var4 = (z43) it3.next();
            if (z43Var4.c.isEmpty()) {
                hashSet2.add(z43Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            z43 z43Var5 = (z43) hashSet2.iterator().next();
            hashSet2.remove(z43Var5);
            i++;
            Iterator it4 = z43Var5.b.iterator();
            while (it4.hasNext()) {
                z43 z43Var6 = (z43) it4.next();
                z43Var6.c.remove(z43Var5);
                if (z43Var6.c.isEmpty()) {
                    hashSet2.add(z43Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            z43 z43Var7 = (z43) it5.next();
            if (!z43Var7.c.isEmpty() && !z43Var7.b.isEmpty()) {
                arrayList2.add(z43Var7.a);
            }
        }
        throw new xd3("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
