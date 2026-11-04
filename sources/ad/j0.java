package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum j0 extends c2 {
    public j0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        h0 h0Var = c2.S;
        if (d == 0) {
            mVar.m(this);
            mVar.f((char) 65533);
            mVar.c = h0Var;
        } else if (d == '-') {
            mVar.f(d);
            mVar.c = c2.U;
        } else if (d == '<') {
            mVar.f(d);
            mVar.c = c2.V;
        } else if (d != 65535) {
            mVar.f(d);
            mVar.c = h0Var;
        } else {
            mVar.l(this);
            mVar.c = c2.a;
        }
    }
}
