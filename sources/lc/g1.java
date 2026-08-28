package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        boolean o6 = aVar.o();
        h1 h1Var = b2.l0;
        if (o6) {
            fVar.c();
            lVar.c = h1Var;
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            fVar.c();
            fVar.c.append((char) 65533);
            lVar.c = h1Var;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                lVar.l(this);
                fVar.c();
                fVar.getClass();
                lVar.j();
                lVar.c = b2.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            fVar.c();
            fVar.c.append(d);
            lVar.c = h1Var;
        }
    }
}
