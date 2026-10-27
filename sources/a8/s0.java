package a8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class s0 {
    public static HashMap a(xc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", t0.e(aVar.a));
        hashMap2.put("cvc", t0.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", t0.e(aVar.e));
        hashMap2.put("currency", t0.e(aVar.n));
        hashMap2.put("address_line1", t0.e(aVar.f));
        hashMap2.put("address_line2", t0.e(aVar.g));
        hashMap2.put("address_city", t0.e(aVar.h));
        hashMap2.put("address_zip", t0.e(aVar.j));
        hashMap2.put("address_state", t0.e(aVar.i));
        hashMap2.put("address_country", t0.e(aVar.k));
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
