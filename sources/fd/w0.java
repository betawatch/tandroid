package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.n.b();
            kVar.c = a2.h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.c = a2.n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f0);
        }
    }
}
