package dd;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
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
                    lVar.c = b2.f0;
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
                        case ls.x0 /* 60 */:
                            break;
                        case ls.y0 /* 61 */:
                            lVar.c = b2.a0;
                            break;
                        case ls.z0 /* 62 */:
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
        lVar.c = b2.Z;
    }
}
