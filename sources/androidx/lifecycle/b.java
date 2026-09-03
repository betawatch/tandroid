package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                    int i10 = cVar.a;
                    if (i10 == 0) {
                        method.invoke(sVar, null);
                    } else if (i10 == 1) {
                        method.invoke(sVar, tVar);
                    } else if (i10 == 2) {
                        method.invoke(sVar, tVar, mVar);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
