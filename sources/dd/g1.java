package dd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        boolean o4 = aVar.o();
        h1 h1Var = b2.q0;
        if (o4) {
            fVar.b();
            lVar.c = h1Var;
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            fVar.b();
            fVar.c.append((char) 65533);
            lVar.c = h1Var;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                lVar.l(this);
                fVar.b();
                fVar.getClass();
                lVar.j();
                lVar.c = b2.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            fVar.b();
            fVar.c.append(d);
            lVar.c = h1Var;
        }
    }
}
