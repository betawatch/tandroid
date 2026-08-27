package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override // mc.b2
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.C0);
        j jVar = lVar.i;
        String str = jVar.e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.e = h;
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.e((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    lVar.c = b2.a0;
                    return;
                }
                w wVar = b2.a;
                if (d == 65535) {
                    lVar.l(this);
                    lVar.c = wVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    switch (d) {
                        case '<':
                            break;
                        case '=':
                            lVar.c = b2.V;
                            break;
                        case '>':
                            lVar.k();
                            lVar.c = wVar;
                            break;
                        default:
                            lVar.i.e(d);
                            break;
                    }
                    return;
                }
            }
            lVar.m(this);
            lVar.i.e(d);
            return;
        }
        lVar.c = b2.U;
    }
}
