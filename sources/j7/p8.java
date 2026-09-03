package j7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class p8 {
    public static HashMap a(gc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", q8.e(aVar.a));
        hashMap2.put("cvc", q8.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", q8.e(aVar.e));
        hashMap2.put("currency", q8.e(aVar.n));
        hashMap2.put("address_line1", q8.e(aVar.f));
        hashMap2.put("address_line2", q8.e(aVar.g));
        hashMap2.put("address_city", q8.e(aVar.h));
        hashMap2.put("address_zip", q8.e(aVar.j));
        hashMap2.put("address_state", q8.e(aVar.i));
        hashMap2.put("address_country", q8.e(aVar.k));
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
