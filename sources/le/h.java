package le;

import ed.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements he.a {
    public final he.a a;
    public final g b;

    public h(he.a aVar) {
        p pVar = p.a;
        this.a = aVar;
        this.b = new g(p.b, aVar.d());
    }

    @Override // he.a
    public Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        kotlin.jvm.internal.j.e(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        g2.d c2 = decoder.c(d());
        while (true) {
            int d = c2.d(d());
            if (d == -1) {
                c2.p(d());
                kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i3 = d + size;
            LinkedHashMap builder = linkedHashMap;
            kotlin.jvm.internal.j.e(builder, "builder");
            p pVar = p.a;
            g gVar = this.b;
            Object k10 = c2.k(gVar, i3, pVar, null);
            int d10 = c2.d(gVar);
            if (d10 != i3 + 1) {
                throw new IllegalArgumentException(a1.g.n(i3, d10, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
            boolean containsKey = builder.containsKey(k10);
            he.a aVar = this.a;
            builder.put(k10, (!containsKey || (aVar.d().e() instanceof je.c)) ? c2.k(gVar, d10, aVar, null) : c2.k(gVar, d10, aVar, s.a(builder, k10)));
        }
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.j.e(map, "<this>");
        map.size();
        g descriptor = this.b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ne.h a10 = hVar.a(descriptor);
        Map map2 = (Map) obj;
        kotlin.jvm.internal.j.e(map2, "<this>");
        int i3 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i3 + 1;
            a10.h(descriptor, i3, p.a, key);
            i3 += 2;
            a10.h(descriptor, i10, this.a, value);
        }
        a10.l(descriptor);
    }

    @Override // he.a
    public final je.d d() {
        return this.b;
    }
}
