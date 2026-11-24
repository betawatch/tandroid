// default package

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class i33 implements pr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i33(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // pr4
    public final Object invoke() {
        String[] names;
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((rr4) obj2).invoke(((e79) obj).a);
                return g7cVar;
            case 1:
                ((rr4) obj2).invoke(((e79) obj).a);
                return g7cVar;
            default:
                y6a y6aVar = (y6a) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                mcd.a((lw5) obj, y6aVar);
                int f = y6aVar.f();
                for (int i = 0; i < f; i++) {
                    List h = y6aVar.h(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : h) {
                        if (obj3 instanceof uw5) {
                            arrayList.add(obj3);
                        }
                    }
                    uw5 uw5Var = (uw5) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (uw5Var != null && (names = uw5Var.names()) != null) {
                        for (String str : names) {
                            String str2 = rr5.a(y6aVar.e(), a7a.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new tw5("The suggested name '" + str + "' for " + str2 + ' ' + y6aVar.g(i) + " is already one of the names for " + str2 + ' ' + y6aVar.g(((Number) sk6.a(linkedHashMap, str)).intValue()) + " in " + y6aVar);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? o34.a : linkedHashMap;
        }
    }
}
