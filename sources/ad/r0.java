package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum r0 extends c2 {
    public r0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        String g7 = aVar.g(c2.G0);
        if (g7.length() > 0) {
            mVar.i.f(g7);
        } else {
            mVar.i.h = true;
        }
        char d = aVar.d();
        if (d == 0) {
            mVar.m(this);
            mVar.i.e((char) 65533);
            return;
        }
        if (d == '\"') {
            mVar.c = c2.e0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                mVar.i.e(d);
                return;
            } else {
                mVar.l(this);
                mVar.c = c2.a;
                return;
            }
        }
        int[] c2 = mVar.c('\"', true);
        if (c2 != null) {
            mVar.i.g(c2);
        } else {
            mVar.i.e('&');
        }
    }
}
