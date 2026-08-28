package f7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k7 {
    public static HashMap a(cc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", l7.e(aVar.a));
        hashMap2.put("cvc", l7.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", l7.e(aVar.e));
        hashMap2.put("currency", l7.e(aVar.n));
        hashMap2.put("address_line1", l7.e(aVar.f));
        hashMap2.put("address_line2", l7.e(aVar.g));
        hashMap2.put("address_city", l7.e(aVar.h));
        hashMap2.put("address_zip", l7.e(aVar.j));
        hashMap2.put("address_state", l7.e(aVar.i));
        hashMap2.put("address_country", l7.e(aVar.k));
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
