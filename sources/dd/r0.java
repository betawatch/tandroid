package dd;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.E0);
        if (g10.length() > 0) {
            lVar.i.f(g10);
        } else {
            lVar.i.h = true;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.e((char) 65533);
            return;
        }
        if (d == 65535) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                lVar.i.e(d);
                return;
            } else {
                lVar.c = b2.d0;
                return;
            }
        }
        int[] c10 = lVar.c('\'', true);
        if (c10 != null) {
            lVar.i.g(c10);
        } else {
            lVar.i.e('&');
        }
    }
}
