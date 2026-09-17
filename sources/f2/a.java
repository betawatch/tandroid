package f2;

import e2.v;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class a implements fb.n {
    public final String a;

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
        StringBuilder u10 = a4.a.u(str);
        u10.append(i10 < 10 ? ".0" : ".");
        u10.append(i10);
        u10.append(x11 < 10 ? ".0" : ".");
        u10.append(x11);
        return new a(u10.toString());
    }

    @Override // fb.n
    public Object h2() {
        throw new db.j(this.a);
    }
}
