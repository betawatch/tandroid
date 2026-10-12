package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
