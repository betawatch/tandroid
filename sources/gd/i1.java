package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum i1 extends a2 {
    public i1() {
        super("AfterDoctypePublicKeyword", 54);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            kVar.c = a2.s0;
            return;
        }
        if (d == '\"') {
            kVar.m(this);
            kVar.c = a2.t0;
            return;
        }
        if (d == '\'') {
            kVar.m(this);
            kVar.c = a2.u0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.m(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
            return;
        }
        if (d != 65535) {
            kVar.m(this);
            fVar.getClass();
            kVar.c = a2.C0;
        } else {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
        }
    }
}
