package dd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
