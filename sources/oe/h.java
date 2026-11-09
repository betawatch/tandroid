package oe;

import a8.p0;
import hd.r;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class h implements ke.a {
    public final ke.a a;
    public final g b;

    public h(ke.a aVar) {
        p pVar = p.a;
        this.a = aVar;
        this.b = new g(p.b, aVar.d());
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.j.e(map, "<this>");
        map.size();
        g descriptor = this.b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        qe.h a10 = hVar.a(descriptor);
        Map map2 = (Map) obj;
        kotlin.jvm.internal.j.e(map2, "<this>");
        int i7 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i7 + 1;
            a10.h(descriptor, i7, p.a, key);
            i7 += 2;
            a10.h(descriptor, i10, this.a, value);
        }
        a10.l(descriptor);
    }

    @Override // ke.a
    public Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        kotlin.jvm.internal.j.e(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        h2.c c10 = decoder.c(d());
        while (true) {
            int d = c10.d(d());
            if (d == -1) {
                c10.p(d());
                kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i7 = d + size;
            LinkedHashMap builder = linkedHashMap;
            kotlin.jvm.internal.j.e(builder, "builder");
            p pVar = p.a;
            g gVar = this.b;
            Object k10 = c10.k(gVar, i7, pVar, null);
            int d2 = c10.d(gVar);
            if (d2 != i7 + 1) {
                throw new IllegalArgumentException(p0.m(i7, d2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
            boolean containsKey = builder.containsKey(k10);
            ke.a aVar = this.a;
            builder.put(k10, (!containsKey || (aVar.d().e() instanceof me.c)) ? c10.k(gVar, d2, aVar, null) : c10.k(gVar, d2, aVar, r.a(builder, k10)));
        }
    }

    @Override // ke.a
    public final me.d d() {
        return this.b;
    }
}
