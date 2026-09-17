package dd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
