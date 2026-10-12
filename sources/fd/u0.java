package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.a;
        if (d == '>') {
            kVar.i.j = true;
            kVar.k();
            kVar.c = vVar;
        } else if (d == 65535) {
            kVar.l(this);
            kVar.c = vVar;
        } else {
            kVar.m(this);
            aVar.q();
            kVar.c = a2.W;
        }
    }
}
