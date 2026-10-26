package f2;

import e2.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements hb.n {
    public final String a;

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
        StringBuilder u10 = a1.g.u(str);
        u10.append(i10 < 10 ? ".0" : ".");
        u10.append(i10);
        u10.append(A2 < 10 ? ".0" : ".");
        u10.append(A2);
        return new a(u10.toString());
    }

    @Override // hb.n
    public Object U1() {
        throw new fb.j(this.a);
    }
}
