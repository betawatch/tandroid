package f2;

import e2.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a implements fb.n {
    public String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    public static a a(v vVar) {
        String str;
        vVar.K(2);
        int x10 = vVar.x();
        int i10 = x10 >> 1;
        int x11 = ((vVar.x() >> 3) & 31) | ((x10 & 1) << 5);
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
        StringBuilder v = a1.g.v(str);
        v.append(i10 < 10 ? ".0" : ".");
        v.append(i10);
        v.append(x11 < 10 ? ".0" : ".");
        v.append(x11);
        return new a(v.toString());
    }

    @Override // fb.n
    public Object v2() {
        throw new db.j(this.a);
    }
}
