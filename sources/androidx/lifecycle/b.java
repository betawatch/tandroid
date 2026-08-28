package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public b(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            m mVar = (m) entry.getValue();
            List list = (List) this.a.get(mVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(mVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, t tVar, m mVar, s sVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.b;
                try {
                    int i9 = cVar.a;
                    if (i9 == 0) {
                        method.invoke(sVar, null);
                    } else if (i9 == 1) {
                        method.invoke(sVar, tVar);
                    } else if (i9 == 2) {
                        method.invoke(sVar, tVar, mVar);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
