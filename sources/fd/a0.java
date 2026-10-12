package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public enum a0 extends a2 {
    public a0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.K;
        if (d == 0) {
            kVar.m(this);
            kVar.f((char) 65533);
            kVar.c = yVar;
        } else {
            if (d == '-') {
                kVar.f(d);
                return;
            }
            if (d == '<') {
                kVar.c = a2.N;
            } else if (d != '>') {
                kVar.f(d);
                kVar.c = yVar;
            } else {
                kVar.f(d);
                kVar.c = a2.f;
            }
        }
    }
}
