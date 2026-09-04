package dd;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.F0);
        if (g10.length() > 0) {
            lVar.i.l(g10);
        } else {
            lVar.i.n = true;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.j((char) 65533);
            return;
        }
        if (d == '\"') {
            lVar.c = b2.d0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                lVar.i.j(d);
                return;
            } else {
                lVar.l(this);
                lVar.c = b2.a;
                return;
            }
        }
        int[] c10 = lVar.c('\"', true);
        if (c10 != null) {
            lVar.i.m(c10);
        } else {
            lVar.i.j('&');
        }
    }
}
