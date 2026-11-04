package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum d1 extends c2 {
    public d1() {
        super("CommentEnd", 48);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        f fVar = mVar.n;
        char d = aVar.d();
        b1 b1Var = c2.k0;
        if (d == 0) {
            mVar.m(this);
            StringBuilder sb2 = fVar.c;
            sb2.append("--");
            sb2.append((char) 65533);
            mVar.c = b1Var;
            return;
        }
        if (d == '!') {
            mVar.m(this);
            mVar.c = c2.n0;
            return;
        }
        if (d == '-') {
            mVar.m(this);
            fVar.c.append('-');
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
            mVar.m(this);
            StringBuilder sb3 = fVar.c;
            sb3.append("--");
            sb3.append(d);
            mVar.c = b1Var;
        }
    }
}
