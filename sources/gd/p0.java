package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        String g7 = aVar.g(a2.F0);
        if (g7.length() > 0) {
            kVar.i.f(g7);
        } else {
            kVar.i.h = true;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.e((char) 65533);
            return;
        }
        if (d == '\"') {
            kVar.c = a2.d0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                kVar.i.e(d);
                return;
            } else {
                kVar.l(this);
                kVar.c = a2.a;
                return;
            }
        }
        int[] c10 = kVar.c('\"', true);
        if (c10 != null) {
            kVar.i.g(c10);
        } else {
            kVar.i.e('&');
        }
    }
}
