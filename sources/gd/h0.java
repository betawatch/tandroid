package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum h0 extends a2 {
    public h0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // gd.a2
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
