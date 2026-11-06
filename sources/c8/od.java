package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class od {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", pd.e(aVar.a));
        hashMap2.put("cvc", pd.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", pd.e(aVar.e));
        hashMap2.put("currency", pd.e(aVar.n));
        hashMap2.put("address_line1", pd.e(aVar.f));
        hashMap2.put("address_line2", pd.e(aVar.g));
        hashMap2.put("address_city", pd.e(aVar.h));
        hashMap2.put("address_zip", pd.e(aVar.j));
        hashMap2.put("address_state", pd.e(aVar.i));
        hashMap2.put("address_country", pd.e(aVar.k));
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
