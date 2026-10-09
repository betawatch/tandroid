package i3;

import b2.g;
import e2.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c extends g {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable b1(int i10, v vVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(vVar.r()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(vVar.x() == 1);
        }
        if (i10 == 2) {
            return d1(vVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return c1(vVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(vVar.r()));
                vVar.K(2);
                return date;
            }
            int B = vVar.B();
            ArrayList arrayList = new ArrayList(B);
            for (int i11 = 0; i11 < B; i11++) {
                Serializable b12 = b1(vVar.x(), vVar);
                if (b12 != null) {
                    arrayList.add(b12);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String d12 = d1(vVar);
            int x10 = vVar.x();
            if (x10 == 9) {
                return hashMap;
            }
            Serializable b13 = b1(x10, vVar);
            if (b13 != null) {
                hashMap.put(d12, b13);
            }
        }
    }

    public static HashMap c1(v vVar) {
        int B = vVar.B();
        HashMap hashMap = new HashMap(B);
        for (int i10 = 0; i10 < B; i10++) {
            String d12 = d1(vVar);
            Serializable b12 = b1(vVar.x(), vVar);
            if (b12 != null) {
                hashMap.put(d12, b12);
            }
        }
        return hashMap;
    }

    public static String d1(v vVar) {
        int D = vVar.D();
        int i10 = vVar.b;
        vVar.K(D);
        return new String(vVar.a, i10, D);
    }
}
