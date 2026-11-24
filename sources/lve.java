// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lve {
    public static dve a(Object obj, Object obj2) {
        dve dveVar = (dve) obj;
        dve dveVar2 = (dve) obj2;
        if (!dveVar2.isEmpty()) {
            if (!dveVar.a) {
                if (dveVar.isEmpty()) {
                    dveVar = new dve();
                } else {
                    dve dveVar3 = new dve(dveVar);
                    dveVar3.a = true;
                    dveVar = dveVar3;
                }
            }
            dveVar.c();
            if (!dveVar2.isEmpty()) {
                dveVar.putAll(dveVar2);
            }
        }
        return dveVar;
    }

    public static void b(Object obj, Object obj2) {
        dve dveVar = (dve) obj;
        if (obj2 != null) {
            rjb.p();
            return;
        }
        if (dveVar.isEmpty()) {
            return;
        }
        Iterator it = dveVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }
}
