package bi;

import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.r0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ l8 c;

    public k8(l8 l8Var, org.telegram.ui.ActionBar.r0 r0Var, long j3) {
        this.c = l8Var;
        this.a = r0Var;
        this.b = j3;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.z0 z0Var2;
        l8 l8Var = this.c;
        di.o8 o8Var = l8Var.U1;
        if (i7 != 1) {
            if (i7 == -1) {
                l8Var.dismiss();
                return;
            }
            return;
        }
        y60 y60Var = l8Var.Z1;
        if (y60Var != null) {
            y60Var.v();
        }
        y60 G = y60.G(l8Var.c, l8Var.J0, this.a);
        l8Var.Z1 = G;
        long e10 = j10.i(l8Var.a).e();
        long j3 = this.b;
        boolean w10 = j3 == e10 ? true : j3 >= 0 ? false : org.telegram.messenger.v3.w(5, mp.u1(l8Var.a).O0(Long.valueOf(-j3)));
        org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, G.e, G.d, false, false);
        G.d(z0Var3);
        G.k();
        org.telegram.ui.ActionBar.z0 h = G.h();
        h.setText(gd.M0(2131750179, null));
        org.telegram.ui.ActionBar.z0 h7 = G.h();
        h7.setText(gd.M0(2131750183, null));
        org.telegram.ui.ActionBar.z0 h10 = G.h();
        h10.setText(gd.M0(2131750178, null));
        org.telegram.ui.ActionBar.z0 h11 = G.h();
        h11.setText(gd.M0(2131750180, null));
        if (w10) {
            G.k();
            org.telegram.ui.ActionBar.z0 h12 = G.h();
            h12.setText(gd.M0(2131750185, null));
            org.telegram.ui.ActionBar.z0 h13 = G.h();
            h13.setText(gd.M0(2131750184, null));
            z0Var2 = h13;
            z0Var = h12;
        } else {
            z0Var = null;
            z0Var2 = null;
        }
        j8 j8Var = new j8(this, z0Var3, h, h7, h10, h11, w10, z0Var, z0Var2);
        j8Var.run();
        z0Var3.setOnClickListener(new ai.v2(9, this, j8Var));
        q6.j(h, o8Var, j8Var, 1);
        q6.j(h7, o8Var, j8Var, 2);
        q6.j(h10, o8Var, j8Var, 4);
        q6.j(h11, o8Var, j8Var, 8);
        if (w10) {
            q6.j(z0Var, o8Var, j8Var, 256);
            q6.j(z0Var2, o8Var, j8Var, 512);
        }
        G.b0 = true;
        G.J = false;
        G.s = 0;
        G.a0();
    }
}
