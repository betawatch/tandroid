package o1;

import b8.ib;
import b8.yf;
import dd.k;
import ed.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import od.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends hd.j implements q {
    public /* synthetic */ n1.f a;
    public /* synthetic */ p1.b b;

    @Override // od.q
    public final Object a(Object obj, Object obj2, Object obj3) {
        i iVar = new i(3, (fd.c) obj3);
        iVar.a = (n1.f) obj;
        iVar.b = (p1.b) obj2;
        return iVar.invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
        n1.f fVar = this.a;
        p1.b bVar = this.b;
        Set keySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(ed.i.d(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((p1.e) it.next()).a);
        }
        Map<String, ?> all = fVar.a.getAll();
        kotlin.jvm.internal.j.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = fVar.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(s.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = ed.g.o((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        p1.b bVar2 = new p1.b(new LinkedHashMap(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof Float) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof Integer) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof Long) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof String) {
                bVar2.e(yf.a(name), value2);
            } else if (value2 instanceof Set) {
                bVar2.e(yf.b(name), (Set) value2);
            }
        }
        return new p1.b(new LinkedHashMap(bVar2.a()), true);
    }
}
