package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public enum f0 extends a2 {
    public f0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else if (i10 == '-') {
            kVar.f(i10);
            kVar.a(a2.S);
        } else if (i10 == '<') {
            kVar.f(i10);
            kVar.a(a2.U);
        } else if (i10 != 65535) {
            kVar.h(aVar.g('-', '<', 0));
        } else {
            kVar.l(this);
            kVar.c = a2.a;
        }
    }
}
