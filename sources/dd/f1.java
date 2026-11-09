package dd;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public enum f1 extends b2 {
    public f1() {
        super("Doctype", 50);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        char d = aVar.d();
        g1 g1Var = b2.o0;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            lVar.c = g1Var;
            return;
        }
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                lVar.c = g1Var;
                return;
            }
            lVar.l(this);
        }
        lVar.m(this);
        fVar.b();
        fVar.getClass();
        lVar.j();
        lVar.c = b2.a;
    }
}
