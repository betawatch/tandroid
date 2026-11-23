package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class sd {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", td.e(aVar.a));
        hashMap2.put("cvc", td.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", td.e(aVar.e));
        hashMap2.put("currency", td.e(aVar.n));
        hashMap2.put("address_line1", td.e(aVar.f));
        hashMap2.put("address_line2", td.e(aVar.g));
        hashMap2.put("address_city", td.e(aVar.h));
        hashMap2.put("address_zip", td.e(aVar.j));
        hashMap2.put("address_state", td.e(aVar.i));
        hashMap2.put("address_country", td.e(aVar.k));
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
