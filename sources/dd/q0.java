package dd;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public enum q0 extends b2 {
    public q0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String g10 = aVar.g(b2.F0);
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
            lVar.c = b2.d0;
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
