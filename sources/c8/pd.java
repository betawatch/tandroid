package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class pd {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", qd.e(aVar.a));
        hashMap2.put("cvc", qd.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", qd.e(aVar.e));
        hashMap2.put("currency", qd.e(aVar.n));
        hashMap2.put("address_line1", qd.e(aVar.f));
        hashMap2.put("address_line2", qd.e(aVar.g));
        hashMap2.put("address_city", qd.e(aVar.h));
        hashMap2.put("address_zip", qd.e(aVar.j));
        hashMap2.put("address_state", qd.e(aVar.i));
        hashMap2.put("address_country", qd.e(aVar.k));
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
