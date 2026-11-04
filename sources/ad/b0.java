package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum b0 extends c2 {
    public b0() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (aVar.j()) {
            mVar.l(this);
            mVar.c = c2.a;
            return;
        }
        char d = aVar.d();
        a0 a0Var = c2.L;
        if (d == 0) {
            mVar.m(this);
            mVar.f((char) 65533);
            mVar.c = a0Var;
        } else if (d == '-') {
            mVar.f(d);
            mVar.c = c2.N;
        } else if (d == '<') {
            mVar.c = c2.O;
        } else {
            mVar.f(d);
            mVar.c = a0Var;
        }
    }
}
