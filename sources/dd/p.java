package dd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                lVar.c = b2.X;
                return;
            } else {
                e(lVar, aVar);
                return;
            }
        }
        if (d == '/') {
            if (lVar.n()) {
                lVar.c = b2.f0;
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
