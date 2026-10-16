package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum y extends a2 {
    public y() {
        super("ScriptDataEscaped", 21);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else if (i10 == '-') {
            kVar.f('-');
            kVar.a(a2.L);
        } else if (i10 != '<') {
            kVar.h(aVar.g('-', '<', 0));
        } else {
            kVar.a(a2.N);
        }
    }
}
