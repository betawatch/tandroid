package fd;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public enum f1 extends a2 {
    public f1() {
        super("BeforeDoctypeName", 51);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        boolean o10 = aVar.o();
        g1 g1Var = a2.p0;
        if (o10) {
            fVar.b();
            kVar.c = g1Var;
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.b();
            fVar.c.append((char) 65533);
            kVar.c = g1Var;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                kVar.l(this);
                fVar.b();
                fVar.getClass();
                kVar.j();
                kVar.c = a2.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            fVar.b();
            fVar.c.append(d);
            kVar.c = g1Var;
        }
    }
}
