package bd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class t {
    public static int a(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static Map b(ad.e... eVarArr) {
        if (eVarArr.length <= 0) {
            return r.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(eVarArr.length));
        c(linkedHashMap, eVarArr);
        return linkedHashMap;
    }

    public static final void c(LinkedHashMap linkedHashMap, ad.e[] eVarArr) {
        for (ad.e eVar : eVarArr) {
            linkedHashMap.put(eVar.a, eVar.b);
        }
    }

    public static Map d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return r.a;
        }
        if (size == 1) {
            ad.e pair = (ad.e) arrayList.get(0);
            kotlin.jvm.internal.i.e(pair, "pair");
            Map singletonMap = Collections.singletonMap(pair.a, pair.b);
            kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(arrayList.size()));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            ad.e eVar = (ad.e) obj;
            linkedHashMap.put(eVar.a, eVar.b);
        }
        return linkedHashMap;
    }
}
