package dd;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char d = aVar.d();
        a1 a1Var = b2.j0;
        if (d == 0) {
            lVar.m(this);
            eVar.c.append((char) 65533);
            lVar.c = a1Var;
            return;
        }
        if (d == '-') {
            lVar.c = b2.i0;
            return;
        }
        w wVar = b2.a;
        if (d == '>') {
            lVar.m(this);
            lVar.i();
            lVar.c = wVar;
        } else if (d != 65535) {
            eVar.c.append(d);
            lVar.c = a1Var;
        } else {
            lVar.l(this);
            lVar.i();
            lVar.c = wVar;
        }
    }
}
