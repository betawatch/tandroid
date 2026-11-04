package ed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class s {
    public static Object a(Map map, Object obj) {
        kotlin.jvm.internal.j.e(map, "<this>");
        if (map instanceof r) {
            return ((r) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int b(int i3) {
        return i3 < 0 ? i3 : i3 < 3 ? i3 + 1 : i3 < 1073741824 ? (int) ((i3 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static Map c(dd.e pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.a, pair.b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map d(dd.e... eVarArr) {
        if (eVarArr.length <= 0) {
            return p.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(eVarArr.length));
        e(linkedHashMap, eVarArr);
        return linkedHashMap;
    }

    public static final void e(LinkedHashMap linkedHashMap, dd.e[] eVarArr) {
        for (dd.e eVar : eVarArr) {
            linkedHashMap.put(eVar.a, eVar.b);
        }
    }

    public static Map f(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p.a;
        }
        if (size == 1) {
            return c((dd.e) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            dd.e eVar = (dd.e) obj;
            linkedHashMap.put(eVar.a, eVar.b);
        }
        return linkedHashMap;
    }

    public static final Map g(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.j.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
