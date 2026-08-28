package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.B0);
        if (g10.length() > 0) {
            lVar.i.g(g10);
        } else {
            lVar.i.h = true;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.f((char) 65533);
            return;
        }
        if (d == '\"') {
            lVar.c = b2.Z;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                lVar.i.f(d);
                return;
            } else {
                lVar.l(this);
                lVar.c = b2.a;
                return;
            }
        }
        int[] c10 = lVar.c('\"', true);
        if (c10 != null) {
            lVar.i.h(c10);
        } else {
            lVar.i.f('&');
        }
    }
}
