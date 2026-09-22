package dd;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        boolean o9 = aVar.o();
        h1 h1Var = b2.p0;
        if (o9) {
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
