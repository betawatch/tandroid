package b1;

import bi.a4;
import gd.k;
import hd.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.o;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements rd.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // rd.a
    public final Object invoke() {
        String[] names;
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new a1.b((v0.g) this.c, 7));
                break;
            case 1:
                c1.e eVar = (c1.e) this.b;
                eVar.g().execute(new a4(14, eVar, (o) this.c));
                break;
            default:
                me.d dVar = (me.d) this.b;
                pe.b bVar = (pe.b) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.a.getClass();
                qe.f.e(dVar, bVar);
                int f10 = dVar.f();
                for (int i7 = 0; i7 < f10; i7++) {
                    List h = dVar.h(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : h) {
                        if (obj instanceof pe.d) {
                            arrayList.add(obj);
                        }
                    }
                    pe.d dVar2 = (pe.d) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (dVar2 != null && (names = dVar2.names()) != null) {
                        for (String str : names) {
                            String str2 = j.a(dVar.e(), me.e.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String message = "The suggested name '" + str + "' for " + str2 + ' ' + dVar.g(i7) + " is already one of the names for " + str2 + ' ' + dVar.g(((Number) r.a(linkedHashMap, str)).intValue()) + " in " + dVar;
                                j.e(message, "message");
                                throw new ke.d(message);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? hd.o.a : linkedHashMap;
        }
        return k.a;
    }
}
