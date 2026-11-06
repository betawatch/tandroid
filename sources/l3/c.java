package l3;

import bi.b1;
import h2.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c extends b1 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable e1(int i7, x xVar) {
        if (i7 == 0) {
            return Double.valueOf(Double.longBitsToDouble(xVar.u()));
        }
        if (i7 == 1) {
            return Boolean.valueOf(xVar.A() == 1);
        }
        if (i7 == 2) {
            return g1(xVar);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return f1(xVar);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(xVar.u()));
                xVar.O(2);
                return date;
            }
            int E = xVar.E();
            ArrayList arrayList = new ArrayList(E);
            for (int i10 = 0; i10 < E; i10++) {
                Serializable e12 = e1(xVar.A(), xVar);
                if (e12 != null) {
                    arrayList.add(e12);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String g12 = g1(xVar);
            int A = xVar.A();
            if (A == 9) {
                return hashMap;
            }
            Serializable e13 = e1(A, xVar);
            if (e13 != null) {
                hashMap.put(g12, e13);
            }
        }
    }

    public static HashMap f1(x xVar) {
        int E = xVar.E();
        HashMap hashMap = new HashMap(E);
        for (int i7 = 0; i7 < E; i7++) {
            String g12 = g1(xVar);
            Serializable e12 = e1(xVar.A(), xVar);
            if (e12 != null) {
                hashMap.put(g12, e12);
            }
        }
        return hashMap;
    }

    public static String g1(x xVar) {
        int H = xVar.H();
        int i7 = xVar.b;
        xVar.O(H);
        return new String(xVar.a, i7, H);
    }
}
