package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public enum t0 extends a2 {
    public t0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        l0 l0Var = a2.W;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            kVar.c = l0Var;
            return;
        }
        if (d == '/') {
            kVar.c = a2.e0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.k();
            kVar.c = vVar;
        } else if (d == 65535) {
            kVar.l(this);
            kVar.c = vVar;
        } else {
            kVar.m(this);
            aVar.q();
            kVar.c = l0Var;
        }
    }
}
