package i3;

import android.util.SparseArray;
import java.util.HashMap;
import kh.a2;
import v2.d;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(d.a, 0);
        hashMap.put(d.b, 1);
        hashMap.put(d.c, 2);
        for (d dVar : hashMap.keySet()) {
            a.append(((Integer) b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(a2.j(i10, "Unknown Priority for value "));
    }
}
