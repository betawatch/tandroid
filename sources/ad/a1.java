package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum a1 extends c2 {
    public a1() {
        super("CommentStartDash", 45);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        f fVar = mVar.n;
        char d = aVar.d();
        b1 b1Var = c2.k0;
        if (d == 0) {
            mVar.m(this);
            fVar.c.append((char) 65533);
            mVar.c = b1Var;
            return;
        }
        if (d == '-') {
            mVar.c = c2.j0;
            return;
        }
        x xVar = c2.a;
        if (d == '>') {
            mVar.m(this);
            mVar.i();
            mVar.c = xVar;
        } else if (d != 65535) {
            fVar.c.append(d);
            mVar.c = b1Var;
        } else {
            mVar.l(this);
            mVar.i();
            mVar.c = xVar;
        }
    }
}
