package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
