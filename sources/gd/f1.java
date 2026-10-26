package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum f1 extends a2 {
    public f1() {
        super("BeforeDoctypeName", 51);
    }

    @Override // gd.a2
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
