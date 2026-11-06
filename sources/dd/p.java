package dd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            String e10 = aVar.e();
            lVar.i.h(e10);
            lVar.h.append(e10);
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
