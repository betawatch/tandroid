package k3;

import ci.u0;
import g2.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends u0 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable e1(int i3, y yVar) {
        if (i3 == 0) {
            return Double.valueOf(Double.longBitsToDouble(yVar.u()));
        }
        if (i3 == 1) {
            return Boolean.valueOf(yVar.A() == 1);
        }
        if (i3 == 2) {
            return g1(yVar);
        }
        if (i3 != 3) {
            if (i3 == 8) {
                return f1(yVar);
            }
            if (i3 != 10) {
                if (i3 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(yVar.u()));
                yVar.O(2);
                return date;
            }
            int E = yVar.E();
            ArrayList arrayList = new ArrayList(E);
            for (int i10 = 0; i10 < E; i10++) {
                Serializable e12 = e1(yVar.A(), yVar);
                if (e12 != null) {
                    arrayList.add(e12);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String g12 = g1(yVar);
            int A = yVar.A();
            if (A == 9) {
                return hashMap;
            }
            Serializable e13 = e1(A, yVar);
            if (e13 != null) {
                hashMap.put(g12, e13);
            }
        }
    }

    public static HashMap f1(y yVar) {
        int E = yVar.E();
        HashMap hashMap = new HashMap(E);
        for (int i3 = 0; i3 < E; i3++) {
            String g12 = g1(yVar);
            Serializable e12 = e1(yVar.A(), yVar);
            if (e12 != null) {
                hashMap.put(g12, e12);
            }
        }
        return hashMap;
    }

    public static String g1(y yVar) {
        int H = yVar.H();
        int i3 = yVar.b;
        yVar.O(H);
        return new String(yVar.a, i3, H);
    }
}
