// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class my9 extends c6 {
    public final /* synthetic */ r7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ny9 c;

    public my9(ny9 ny9Var, r7 r7Var, long j) {
        this.c = ny9Var;
        this.a = r7Var;
        this.b = j;
    }

    @Override // c6
    public final void b(int i) {
        a8 a8Var;
        a8 a8Var2;
        ny9 ny9Var = this.c;
        xsa xsaVar = ny9Var.T1;
        if (i != 1) {
            if (i == -1) {
                ny9Var.dismiss();
                return;
            }
            return;
        }
        cs5 cs5Var = ny9Var.Y1;
        if (cs5Var != null) {
            cs5Var.u();
        }
        cs5 G = cs5.G(ny9Var.c, ny9Var.J0, this.a);
        ny9Var.Y1 = G;
        long e = y6c.h(ny9Var.a).e();
        long j = this.b;
        byte b = 5;
        boolean w = j == e ? true : j >= 0 ? false : hc2.w(5, na7.q1(ny9Var.a).K0(Long.valueOf(-j)));
        a8 a8Var3 = new a8(0, G.d, G.e, false, false);
        G.c(a8Var3);
        G.j();
        a8 g = G.g();
        g.setText(k96.M0(2131750179, null));
        a8 g2 = G.g();
        g2.setText(k96.M0(2131750183, null));
        a8 g3 = G.g();
        g3.setText(k96.M0(2131750178, null));
        a8 g4 = G.g();
        g4.setText(k96.M0(2131750180, null));
        if (w) {
            G.j();
            a8 g5 = G.g();
            g5.setText(k96.M0(2131750185, null));
            a8 g6 = G.g();
            g6.setText(k96.M0(2131750184, null));
            a8Var2 = g6;
            a8Var = g5;
        } else {
            a8Var = null;
            a8Var2 = null;
        }
        ly9 ly9Var = new ly9(this, a8Var3, g, g2, g3, g4, w, a8Var, a8Var2);
        ly9Var.run();
        a8Var3.setOnClickListener(new b99(this, ly9Var, b));
        tq8.j(g, xsaVar, ly9Var, 1);
        tq8.j(g2, xsaVar, ly9Var, 2);
        tq8.j(g3, xsaVar, ly9Var, 4);
        tq8.j(g4, xsaVar, ly9Var, 8);
        if (w) {
            tq8.j(a8Var, xsaVar, ly9Var, 256);
            tq8.j(a8Var2, xsaVar, ly9Var, 512);
        }
        G.b0 = true;
        G.J = false;
        G.s = (short) 0;
        G.a0();
    }
}
