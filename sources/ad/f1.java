package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum f1 extends c2 {
    public f1() {
        super("CommentEndBang", 49);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        f fVar = mVar.n;
        char d = aVar.d();
        b1 b1Var = c2.k0;
        if (d == 0) {
            mVar.m(this);
            StringBuilder sb2 = fVar.c;
            sb2.append("--!");
            sb2.append((char) 65533);
            mVar.c = b1Var;
            return;
        }
        if (d == '-') {
            fVar.c.append("--!");
            mVar.c = c2.l0;
            return;
        }
        x xVar = c2.a;
        if (d == '>') {
            mVar.i();
            mVar.c = xVar;
        } else if (d == 65535) {
            mVar.l(this);
            mVar.i();
            mVar.c = xVar;
        } else {
            StringBuilder sb3 = fVar.c;
            sb3.append("--!");
            sb3.append(d);
            mVar.c = b1Var;
        }
    }
}
