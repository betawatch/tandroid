package dd;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.h("</" + lVar.h.toString());
        aVar.q();
        lVar.c = b2.c;
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String e7 = aVar.e();
            lVar.i.n(e7);
            lVar.h.append(e7);
            return;
        }
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (lVar.n()) {
                lVar.c = b2.W;
                return;
            } else {
                e(lVar, aVar);
                return;
            }
        }
        if (d == '/') {
            if (lVar.n()) {
                lVar.c = b2.e0;
                return;
            } else {
                e(lVar, aVar);
                return;
            }
        }
        if (d != '>') {
            e(lVar, aVar);
        } else if (!lVar.n()) {
            e(lVar, aVar);
        } else {
            lVar.k();
            lVar.c = b2.a;
        }
    }
}
