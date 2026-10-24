package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
