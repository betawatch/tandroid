package kd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static Map b(jd.d... dVarArr) {
        if (dVarArr.length <= 0) {
            return p.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(dVarArr.length));
        c(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static final void c(LinkedHashMap linkedHashMap, jd.d[] dVarArr) {
        for (jd.d dVar : dVarArr) {
            linkedHashMap.put(dVar.a, dVar.b);
        }
    }

    public static Map d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p.a;
        }
        if (size == 1) {
            jd.d pair = (jd.d) arrayList.get(0);
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
            jd.d dVar = (jd.d) obj;
            linkedHashMap.put(dVar.a, dVar.b);
        }
        return linkedHashMap;
    }
}
