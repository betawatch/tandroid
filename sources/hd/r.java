package hd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class r {
    public static Object a(Map map, Object obj) {
        kotlin.jvm.internal.j.e(map, "<this>");
        if (map instanceof q) {
            return ((q) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int b(int i7) {
        return i7 < 0 ? i7 : i7 < 3 ? i7 + 1 : i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static Map c(gd.e pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.a, pair.b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map d(gd.e... eVarArr) {
        if (eVarArr.length <= 0) {
            return o.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(eVarArr.length));
        e(linkedHashMap, eVarArr);
        return linkedHashMap;
    }

    public static final void e(LinkedHashMap linkedHashMap, gd.e[] eVarArr) {
        for (gd.e eVar : eVarArr) {
            linkedHashMap.put(eVar.a, eVar.b);
        }
    }

    public static Map f(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return o.a;
        }
        if (size == 1) {
            return c((gd.e) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            gd.e eVar = (gd.e) obj;
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
