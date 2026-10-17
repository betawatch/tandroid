package fd;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public enum o extends a2 {
    public o() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(k kVar, a aVar) {
        kVar.h("</" + kVar.h.toString());
        aVar.q();
        kVar.c = a2.c;
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            String e = aVar.e();
            kVar.i.h(e);
            kVar.h.append(e);
            return;
        }
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (kVar.n()) {
                kVar.c = a2.W;
                return;
            } else {
                e(kVar, aVar);
                return;
            }
        }
        if (d == '/') {
            if (kVar.n()) {
                kVar.c = a2.e0;
                return;
            } else {
                e(kVar, aVar);
                return;
            }
        }
        if (d != '>') {
            e(kVar, aVar);
        } else if (!kVar.n()) {
            e(kVar, aVar);
        } else {
            kVar.k();
            kVar.c = a2.a;
        }
    }
}
