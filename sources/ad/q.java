package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum q extends c2 {
    public q() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(m mVar, a aVar) {
        mVar.h("</" + mVar.h.toString());
        aVar.q();
        mVar.c = c2.c;
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            String e10 = aVar.e();
            mVar.i.h(e10);
            mVar.h.append(e10);
            return;
        }
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (mVar.n()) {
                mVar.c = c2.X;
                return;
            } else {
                e(mVar, aVar);
                return;
            }
        }
        if (d == '/') {
            if (mVar.n()) {
                mVar.c = c2.f0;
                return;
            } else {
                e(mVar, aVar);
                return;
            }
        }
        if (d != '>') {
            e(mVar, aVar);
        } else if (!mVar.n()) {
            e(mVar, aVar);
        } else {
            mVar.k();
            mVar.c = c2.a;
        }
    }
}
