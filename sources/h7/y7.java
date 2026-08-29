package h7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class y7 {
    public static HashMap a(ec.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", z7.e(aVar.a));
        hashMap2.put("cvc", z7.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", z7.e(aVar.e));
        hashMap2.put("currency", z7.e(aVar.n));
        hashMap2.put("address_line1", z7.e(aVar.f));
        hashMap2.put("address_line2", z7.e(aVar.g));
        hashMap2.put("address_city", z7.e(aVar.h));
        hashMap2.put("address_zip", z7.e(aVar.j));
        hashMap2.put("address_state", z7.e(aVar.i));
        hashMap2.put("address_country", z7.e(aVar.k));
        Iterator it = new HashSet(hashMap2.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashMap2.get(str) == null) {
                hashMap2.remove(str);
            }
        }
        hashMap.put("card", hashMap2);
        return hashMap;
    }
}
