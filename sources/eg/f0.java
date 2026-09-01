package eg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements g6, rg.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ f0(int i10, g6 g6Var) {
        this.a = i10;
        this.b = g6Var;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int B0(int i10) {
        if (i10 == k6.G8) {
            return -14145495;
        }
        if (i10 == k6.E8) {
            return -1;
        }
        if (i10 == k6.h5) {
            return -14737633;
        }
        if (i10 == k6.j5) {
            return -592138;
        }
        if (i10 == k6.r5) {
            return -8553091;
        }
        if (i10 == k6.He) {
            return -16777216;
        }
        if (i10 == k6.Ke) {
            return -1610612736;
        }
        if (i10 == k6.Ne || i10 == k6.Re || i10 == k6.Me) {
            return -9539985;
        }
        if (i10 == k6.G6) {
            return -1;
        }
        int i11 = k6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == k6.i6) {
            return 536870911;
        }
        if (i10 == k6.Fh || i10 == k6.Eh || i10 == k6.Gh) {
            return -1;
        }
        if (i10 == k6.Hh) {
            return 352321535;
        }
        if (i10 == k6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == k6.Ie) {
            return 780633991;
        }
        if (i10 == k6.a7) {
            return -15921907;
        }
        if (i10 == k6.m7) {
            return -12500671;
        }
        if (i10 == k6.l7) {
            return -13133079;
        }
        if (i10 == k6.n7) {
            return -1;
        }
        if (i10 == k6.d6) {
            return -15198183;
        }
        if (i10 == k6.d7) {
            return -16777216;
        }
        g6 g6Var = this.b;
        return g6Var != null ? g6Var.B0(i10) : k6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Paint F(String str) {
        return k6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean a() {
        return k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int e0(int i10) {
        return B0(i10);
    }

    @Override // rg.c
    public int g(g6 g6Var, boolean z4) {
        switch (this.a) {
            case 1:
                if (sg.b.c(UserConfig.selectedAccount, this.b)) {
                    return k6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.Sd, g6Var));
                }
                return i0.a.k(k6.v0(k6.Sd, g6Var), 255);
            case 2:
                if (sg.b.c(UserConfig.selectedAccount, this.b)) {
                    return k6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.ce, g6Var));
                }
                return i0.a.k(k6.v0(z4 ? k6.s8 : k6.ce, g6Var), 255);
            default:
                if (sg.b.c(UserConfig.selectedAccount, this.b)) {
                    return k6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.ce, g6Var));
                }
                return i0.a.k(k6.v0(z4 ? k6.s8 : k6.ce, g6Var), 255);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public void l(float f10, float f11, int i10, int i11) {
        k6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public ColorFilter w() {
        return k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ void J0(int i10, int i11) {
    }
}
