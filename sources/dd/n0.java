package dd;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                        case qs.x0 /* 60 */:
                            break;
                        case qs.y0 /* 61 */:
                            lVar.c = b2.Z;
                            break;
                        case qs.z0 /* 62 */:
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
