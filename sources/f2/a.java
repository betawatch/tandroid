package f2;

import e2.x;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    public static a a(x xVar) {
        String str;
        xVar.O(2);
        int A = xVar.A();
        int i10 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder t10 = a1.g.t(str);
        t10.append(i10 < 10 ? ".0" : ".");
        t10.append(i10);
        t10.append(A2 < 10 ? ".0" : ".");
        t10.append(A2);
        return new a(t10.toString());
    }
}
