// default package

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class li2 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public li2(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            y26 y26Var = (y26) entry.getValue();
            List list = (List) this.a.get(y26Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(y26Var, list);
            }
            list.add((mi2) entry.getKey());
        }
    }

    public static void a(List list, i36 i36Var, y26 y26Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                mi2 mi2Var = (mi2) list.get(size);
                Method method = mi2Var.b;
                try {
                    byte b = mi2Var.a;
                    if (b == 0) {
                        method.invoke(obj, null);
                    } else if (b == 1) {
                        method.invoke(obj, i36Var);
                    } else if (b == 2) {
                        method.invoke(obj, i36Var, y26Var);
                    }
                } catch (IllegalAccessException e) {
                    grb.m(e);
                    return;
                } catch (InvocationTargetException e2) {
                    grb.j("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
