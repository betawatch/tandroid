package i3;

import android.util.SparseArray;
import java.util.HashMap;
import v2.d;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        throw new IllegalArgumentException(l.d.j(i10, "Unknown Priority for value "));
    }
}
