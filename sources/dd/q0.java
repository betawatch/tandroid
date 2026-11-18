package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.G0);
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
        if (d == '\"') {
            lVar.c = b2.e0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                lVar.i.e(d);
                return;
            } else {
                lVar.l(this);
                lVar.c = b2.a;
                return;
            }
        }
        int[] c10 = lVar.c('\"', true);
        if (c10 != null) {
            lVar.i.g(c10);
        } else {
            lVar.i.e('&');
        }
    }
}
