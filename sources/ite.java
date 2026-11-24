// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ite {
    public static ate a(Object obj, Object obj2) {
        ate ateVar = (ate) obj;
        ate ateVar2 = (ate) obj2;
        if (!ateVar2.isEmpty()) {
            if (!ateVar.a) {
                if (ateVar.isEmpty()) {
                    ateVar = new ate();
                } else {
                    ate ateVar3 = new ate(ateVar);
                    ateVar3.a = true;
                    ateVar = ateVar3;
                }
            }
            ateVar.c();
            if (!ateVar2.isEmpty()) {
                ateVar.putAll(ateVar2);
            }
        }
        return ateVar;
    }

    public static void b(Object obj, Object obj2) {
        ate ateVar = (ate) obj;
        if (obj2 != null) {
            fyb.g();
            return;
        }
        if (ateVar.isEmpty()) {
            return;
        }
        Iterator it = ateVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }
}
