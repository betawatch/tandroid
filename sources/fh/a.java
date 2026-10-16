package fh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import eh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d, c6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ a(int i10, c6 c6Var) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int E0(int i10) {
        if (i10 == g6.G8) {
            return -14145495;
        }
        if (i10 == g6.E8) {
            return -1;
        }
        if (i10 == g6.h5) {
            return -14737633;
        }
        if (i10 == g6.j5) {
            return -592138;
        }
        if (i10 == g6.r5) {
            return -8553091;
        }
        if (i10 == g6.He) {
            return -16777216;
        }
        if (i10 == g6.Ke) {
            return -1610612736;
        }
        if (i10 == g6.Ne || i10 == g6.Re || i10 == g6.Me) {
            return -9539985;
        }
        if (i10 == g6.G6) {
            return -1;
        }
        int i11 = g6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == g6.i6) {
            return 536870911;
        }
        if (i10 == g6.Fh || i10 == g6.Eh || i10 == g6.Gh) {
            return -1;
        }
        if (i10 == g6.Hh) {
            return 352321535;
        }
        if (i10 == g6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == g6.Ie) {
            return 780633991;
        }
        if (i10 == g6.a7) {
            return -15921907;
        }
        if (i10 == g6.m7) {
            return -12500671;
        }
        if (i10 == g6.l7) {
            return -13133079;
        }
        if (i10 == g6.n7) {
            return -1;
        }
        if (i10 == g6.d6) {
            return -15198183;
        }
        if (i10 == g6.d7) {
            return -16777216;
        }
        c6 c6Var = this.b;
        return c6Var != null ? c6Var.E0(i10) : g6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint F(String str) {
        return g6.T0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return g6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int b0(int i10) {
        return E0(i10);
    }

    @Override // eh.d
    public int f(c6 c6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return g6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.w0(g6.Sd, c6Var));
                }
                return i0.a.k(g6.w0(g6.Sd, c6Var), 255);
            case 1:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return g6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.w0(g6.ce, c6Var));
                }
                return i0.a.k(g6.w0(z10 ? g6.s8 : g6.ce, c6Var), 255);
            default:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return g6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.w0(g6.ce, c6Var));
                }
                return i0.a.k(g6.w0(z10 ? g6.s8 : g6.ce, c6Var), 255);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int f1(int i10) {
        return E0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f7, float f10, int i10, int i11) {
        g6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter w() {
        return g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void M0(int i10, int i11) {
    }
}
