package g7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class l7 {
    public static HashMap a(dc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", m7.e(aVar.a));
        hashMap2.put("cvc", m7.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", m7.e(aVar.e));
        hashMap2.put("currency", m7.e(aVar.n));
        hashMap2.put("address_line1", m7.e(aVar.f));
        hashMap2.put("address_line2", m7.e(aVar.g));
        hashMap2.put("address_city", m7.e(aVar.h));
        hashMap2.put("address_zip", m7.e(aVar.j));
        hashMap2.put("address_state", m7.e(aVar.i));
        hashMap2.put("address_country", m7.e(aVar.k));
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
