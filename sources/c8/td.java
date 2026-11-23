package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class td {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", ud.e(aVar.a));
        hashMap2.put("cvc", ud.e(aVar.b));
        hashMap2.put("exp_month", aVar.c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", ud.e(aVar.e));
        hashMap2.put("currency", ud.e(aVar.n));
        hashMap2.put("address_line1", ud.e(aVar.f));
        hashMap2.put("address_line2", ud.e(aVar.g));
        hashMap2.put("address_city", ud.e(aVar.h));
        hashMap2.put("address_zip", ud.e(aVar.j));
        hashMap2.put("address_state", ud.e(aVar.i));
        hashMap2.put("address_country", ud.e(aVar.k));
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
