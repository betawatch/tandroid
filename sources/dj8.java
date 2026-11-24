// default package

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class dj8 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(cj8.a, 0);
        hashMap.put(cj8.b, 1);
        hashMap.put(cj8.c, 2);
        for (cj8 cj8Var : hashMap.keySet()) {
            a.append(((Integer) b.get(cj8Var)).intValue(), cj8Var);
        }
    }

    public static int a(cj8 cj8Var) {
        Integer num = (Integer) b.get(cj8Var);
        if (num != null) {
            return num.intValue();
        }
        wn4.i(cj8Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static cj8 b(int i) {
        cj8 cj8Var = (cj8) a.get(i);
        if (cj8Var != null) {
            return cj8Var;
        }
        w26.j(de9.k(i, "Unknown Priority for value "));
        return null;
    }
}
