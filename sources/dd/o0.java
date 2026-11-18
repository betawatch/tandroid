package dd;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public enum o0 extends b2 {
    public o0() {
        super("AfterAttributeName", 35);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.Y;
        if (d == 0) {
            lVar.m(this);
            lVar.i.d((char) 65533);
            lVar.c = n0Var;
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
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                switch (d) {
                    case ks.x0 /* 60 */:
                        break;
                    case ks.y0 /* 61 */:
                        lVar.c = b2.a0;
                        break;
                    case ks.z0 /* 62 */:
                        lVar.k();
                        lVar.c = wVar;
                        break;
                    default:
                        lVar.i.j();
                        aVar.q();
                        lVar.c = n0Var;
                        break;
                }
                return;
            }
            lVar.m(this);
            lVar.i.j();
            lVar.i.d(d);
            lVar.c = n0Var;
        }
    }
}
