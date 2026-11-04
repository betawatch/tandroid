package ai;

import ci.v8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l6 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.q0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ m6 c;

    public l6(m6 m6Var, org.telegram.ui.ActionBar.q0 q0Var, long j10) {
        this.c = m6Var;
        this.a = q0Var;
        this.b = j10;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.y0 y0Var2;
        m6 m6Var = this.c;
        v8 v8Var = m6Var.R1;
        if (i3 != 1) {
            if (i3 == -1) {
                m6Var.dismiss();
                return;
            }
            return;
        }
        f60 f60Var = m6Var.W1;
        if (f60Var != null) {
            f60Var.u();
        }
        f60 F = f60.F(m6Var.c, m6Var.J0, this.a);
        m6Var.W1 = F;
        long e10 = h10.i(m6Var.a).e();
        long j10 = this.b;
        boolean w10 = j10 == e10 ? true : j10 >= 0 ? false : org.telegram.messenger.t3.w(5, hp.s1(m6Var.a).M0(Long.valueOf(-j10)));
        org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, F.e, F.d, false, false);
        F.d(y0Var3);
        F.k();
        org.telegram.ui.ActionBar.y0 h = F.h();
        h.setText(bd.M0(2131750203, null));
        org.telegram.ui.ActionBar.y0 h7 = F.h();
        h7.setText(bd.M0(2131750207, null));
        org.telegram.ui.ActionBar.y0 h10 = F.h();
        h10.setText(bd.M0(2131750202, null));
        org.telegram.ui.ActionBar.y0 h11 = F.h();
        h11.setText(bd.M0(2131750204, null));
        if (w10) {
            F.k();
            org.telegram.ui.ActionBar.y0 h12 = F.h();
            h12.setText(bd.M0(2131750209, null));
            org.telegram.ui.ActionBar.y0 h13 = F.h();
            h13.setText(bd.M0(2131750208, null));
            y0Var2 = h13;
            y0Var = h12;
        } else {
            y0Var = null;
            y0Var2 = null;
        }
        k6 k6Var = new k6(this, y0Var3, h, h7, h10, h11, w10, y0Var, y0Var2);
        k6Var.run();
        y0Var3.setOnClickListener(new d(4, this, k6Var));
        u4.j(h, v8Var, k6Var, 1);
        u4.j(h7, v8Var, k6Var, 2);
        u4.j(h10, v8Var, k6Var, 4);
        u4.j(h11, v8Var, k6Var, 8);
        if (w10) {
            u4.j(y0Var, v8Var, k6Var, 256);
            u4.j(y0Var2, v8Var, k6Var, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
