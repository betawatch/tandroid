package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum p extends b2 {
    public p() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(l lVar, a aVar) {
        lVar.g("</" + lVar.h.toString());
        aVar.q();
        lVar.c = b2.c;
    }

    @Override // mc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            String e9 = aVar.e();
            lVar.i.i(e9);
            lVar.h.append(e9);
            return;
        }
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (lVar.n()) {
                lVar.c = b2.S;
                return;
            } else {
                e(lVar, aVar);
                return;
            }
        }
        if (d == '/') {
            if (lVar.n()) {
                lVar.c = b2.a0;
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
