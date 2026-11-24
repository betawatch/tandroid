// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o0a extends c6 {
    public final /* synthetic */ r7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ p0a c;

    public o0a(p0a p0aVar, r7 r7Var, long j) {
        this.c = p0aVar;
        this.a = r7Var;
        this.b = j;
    }

    @Override // c6
    public final void b(int i) {
        a8 a8Var;
        a8 a8Var2;
        p0a p0aVar = this.c;
        ava avaVar = p0aVar.T1;
        if (i != 1) {
            if (i == -1) {
                p0aVar.dismiss();
                return;
            }
            return;
        }
        bu5 bu5Var = p0aVar.Y1;
        if (bu5Var != null) {
            bu5Var.u();
        }
        bu5 G = bu5.G(p0aVar.c, p0aVar.J0, this.a);
        p0aVar.Y1 = G;
        long e = z8c.h(p0aVar.a).e();
        long j = this.b;
        boolean w = j == e ? true : j >= 0 ? false : sd2.w(5, oc7.r1(p0aVar.a).L0(Long.valueOf(-j)));
        a8 a8Var3 = new a8(0, G.d, G.e, false, false);
        G.c(a8Var3);
        G.j();
        a8 g = G.g();
        g.setText(jb6.M0(2131750128, null));
        a8 g2 = G.g();
        g2.setText(jb6.M0(2131750132, null));
        a8 g3 = G.g();
        g3.setText(jb6.M0(2131750127, null));
        a8 g4 = G.g();
        g4.setText(jb6.M0(2131750129, null));
        if (w) {
            G.j();
            a8 g5 = G.g();
            g5.setText(jb6.M0(2131750134, null));
            a8 g6 = G.g();
            g6.setText(jb6.M0(2131750133, null));
            a8Var2 = g6;
            a8Var = g5;
        } else {
            a8Var = null;
            a8Var2 = null;
        }
        n0a n0aVar = new n0a(this, a8Var3, g, g2, g3, g4, w, a8Var, a8Var2);
        n0aVar.run();
        a8Var3.setOnClickListener(new r39(this, n0aVar, (byte) 6));
        vs8.j(g, avaVar, n0aVar, 1);
        vs8.j(g2, avaVar, n0aVar, 2);
        vs8.j(g3, avaVar, n0aVar, 4);
        vs8.j(g4, avaVar, n0aVar, 8);
        if (w) {
            vs8.j(a8Var, avaVar, n0aVar, 256);
            vs8.j(a8Var2, avaVar, n0aVar, 512);
        }
        G.b0 = true;
        G.J = false;
        G.s = (short) 0;
        G.a0();
    }
}
