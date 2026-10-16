package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum q extends a2 {
    public q() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.c = a2.E;
        } else {
            kVar.h("</");
            kVar.c = a2.e;
        }
    }
}
