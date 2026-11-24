// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ide {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xq2 xq2Var = (xq2) obj;
            k63 k63Var = new k63(xq2Var);
            for (yy8 yy8Var : xq2Var.b) {
                boolean z = xq2Var.e;
                l63 l63Var = new l63(yy8Var, z);
                if (!hashMap.containsKey(l63Var)) {
                    hashMap.put(l63Var, new HashSet());
                }
                Set set = (Set) hashMap.get(l63Var);
                if (!set.isEmpty() && !z) {
                    throw new IllegalArgumentException("Multiple components provide " + yy8Var + ".");
                }
                set.add(k63Var);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (k63 k63Var2 : (Set) it.next()) {
                for (if3 if3Var : k63Var2.a.c) {
                    if (if3Var.c == 0) {
                        Set<k63> set2 = (Set) hashMap.get(new l63(if3Var.a, if3Var.b == 2));
                        if (set2 != null) {
                            for (k63 k63Var3 : set2) {
                                k63Var2.b.add(k63Var3);
                                k63Var3.c.add(k63Var2);
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
            k63 k63Var4 = (k63) it3.next();
            if (k63Var4.c.isEmpty()) {
                hashSet2.add(k63Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            k63 k63Var5 = (k63) hashSet2.iterator().next();
            hashSet2.remove(k63Var5);
            i++;
            Iterator it4 = k63Var5.b.iterator();
            while (it4.hasNext()) {
                k63 k63Var6 = (k63) it4.next();
                k63Var6.c.remove(k63Var5);
                if (k63Var6.c.isEmpty()) {
                    hashSet2.add(k63Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            k63 k63Var7 = (k63) it5.next();
            if (!k63Var7.c.isEmpty() && !k63Var7.b.isEmpty()) {
                arrayList2.add(k63Var7.a);
            }
        }
        throw new jf3("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
