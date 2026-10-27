package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        String g7 = aVar.g(a2.E0);
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
        if (d == 65535) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                kVar.i.e(d);
                return;
            } else {
                kVar.c = a2.d0;
                return;
            }
        }
        int[] c10 = kVar.c('\'', true);
        if (c10 != null) {
            kVar.i.g(c10);
        } else {
            kVar.i.e('&');
        }
    }
}
