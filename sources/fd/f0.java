package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
