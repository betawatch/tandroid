package dd;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
            String e = aVar.e();
            lVar.i.h(e);
            lVar.h.append(e);
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
