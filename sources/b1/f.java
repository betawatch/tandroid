package b1;

import dd.k;
import ed.p;
import ed.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.h;
import v0.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements od.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // od.a
    public final Object invoke() {
        String[] names;
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new a1.e((h) this.c, 7));
                break;
            case 1:
                c1.e eVar = (c1.e) this.b;
                eVar.f().execute(new a1.f(24, eVar, (n) this.c));
                break;
            default:
                je.d dVar = (je.d) this.b;
                me.b bVar = (me.b) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.a.getClass();
                ne.f.e(dVar, bVar);
                int f10 = dVar.f();
                for (int i3 = 0; i3 < f10; i3++) {
                    List h = dVar.h(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : h) {
                        if (obj instanceof me.d) {
                            arrayList.add(obj);
                        }
                    }
                    me.d dVar2 = (me.d) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (dVar2 != null && (names = dVar2.names()) != null) {
                        for (String str : names) {
                            String str2 = j.a(dVar.e(), je.e.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String message = "The suggested name '" + str + "' for " + str2 + ' ' + dVar.g(i3) + " is already one of the names for " + str2 + ' ' + dVar.g(((Number) s.a(linkedHashMap, str)).intValue()) + " in " + dVar;
                                j.e(message, "message");
                                throw new he.d(message);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i3));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? p.a : linkedHashMap;
        }
        return k.a;
    }
}
