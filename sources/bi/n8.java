package bi;

import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.q0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ o8 c;

    public n8(o8 o8Var, org.telegram.ui.ActionBar.q0 q0Var, long j3) {
        this.c = o8Var;
        this.a = q0Var;
        this.b = j3;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.y0 y0Var2;
        o8 o8Var = this.c;
        di.p8 p8Var = o8Var.U1;
        if (i7 != 1) {
            if (i7 == -1) {
                o8Var.dismiss();
                return;
            }
            return;
        }
        a70 a70Var = o8Var.Z1;
        if (a70Var != null) {
            a70Var.v();
        }
        a70 G = a70.G(o8Var.c, o8Var.J0, this.a);
        o8Var.Z1 = G;
        long e10 = j10.i(o8Var.a).e();
        long j3 = this.b;
        boolean w10 = j3 == e10 ? true : j3 >= 0 ? false : org.telegram.messenger.v3.w(5, mp.u1(o8Var.a).O0(Long.valueOf(-j3)));
        org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, G.e, G.d, false, false);
        G.d(y0Var3);
        G.k();
        org.telegram.ui.ActionBar.y0 h = G.h();
        h.setText(gd.N0(2131750178, null));
        org.telegram.ui.ActionBar.y0 h7 = G.h();
        h7.setText(gd.N0(2131750182, null));
        org.telegram.ui.ActionBar.y0 h10 = G.h();
        h10.setText(gd.N0(2131750177, null));
        org.telegram.ui.ActionBar.y0 h11 = G.h();
        h11.setText(gd.N0(2131750179, null));
        if (w10) {
            G.k();
            org.telegram.ui.ActionBar.y0 h12 = G.h();
            h12.setText(gd.N0(2131750184, null));
            org.telegram.ui.ActionBar.y0 h13 = G.h();
            h13.setText(gd.N0(2131750183, null));
            y0Var2 = h13;
            y0Var = h12;
        } else {
            y0Var = null;
            y0Var2 = null;
        }
        m8 m8Var = new m8(this, y0Var3, h, h7, h10, h11, w10, y0Var, y0Var2);
        m8Var.run();
        y0Var3.setOnClickListener(new ai.x2(8, this, m8Var));
        t6.j(h, p8Var, m8Var, 1);
        t6.j(h7, p8Var, m8Var, 2);
        t6.j(h10, p8Var, m8Var, 4);
        t6.j(h11, p8Var, m8Var, 8);
        if (w10) {
            t6.j(y0Var, p8Var, m8Var, 256);
            t6.j(y0Var2, p8Var, m8Var, 512);
        }
        G.b0 = true;
        G.J = false;
        G.s = 0;
        G.a0();
    }
}
