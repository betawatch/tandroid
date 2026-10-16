package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public enum h0 extends a2 {
    public h0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        f0 f0Var = a2.R;
        if (d == 0) {
            kVar.m(this);
            kVar.f((char) 65533);
            kVar.c = f0Var;
        } else if (d == '-') {
            kVar.f(d);
            kVar.c = a2.T;
        } else if (d == '<') {
            kVar.f(d);
            kVar.c = a2.U;
        } else if (d != 65535) {
            kVar.f(d);
            kVar.c = f0Var;
        } else {
            kVar.l(this);
            kVar.c = a2.a;
        }
    }
}
