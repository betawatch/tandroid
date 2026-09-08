package dd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.G0);
        j jVar = lVar.i;
        String str = jVar.e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.e = h;
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            lVar.i.d((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    lVar.c = b2.e0;
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
                            lVar.c = b2.Z;
                            break;
                        case '>':
                            lVar.k();
                            lVar.c = wVar;
                            break;
                        default:
                            lVar.i.d(d);
                            break;
                    }
                    return;
                }
            }
            lVar.m(this);
            lVar.i.d(d);
            return;
        }
        lVar.c = b2.Y;
    }
}
