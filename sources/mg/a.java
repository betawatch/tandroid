package mg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements lg.c, b6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ a(int i9, b6 b6Var) {
        this.a = i9;
        this.b = b6Var;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public ColorFilter H() {
        return f6.v3;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int N0(int i9) {
        if (i9 == f6.G8) {
            return -14145495;
        }
        if (i9 == f6.E8) {
            return -1;
        }
        if (i9 == f6.h5) {
            return -14737633;
        }
        if (i9 == f6.j5) {
            return -592138;
        }
        if (i9 == f6.r5) {
            return -8553091;
        }
        if (i9 == f6.He) {
            return -16777216;
        }
        if (i9 == f6.Ke) {
            return -1610612736;
        }
        if (i9 == f6.Ne || i9 == f6.Re || i9 == f6.Me) {
            return -9539985;
        }
        if (i9 == f6.G6) {
            return -1;
        }
        int i10 = f6.Mh;
        if (i9 == i10) {
            return -11754001;
        }
        if (i9 == f6.i6) {
            return 536870911;
        }
        if (i9 == f6.Fh || i9 == f6.Eh || i9 == f6.Gh) {
            return -1;
        }
        if (i9 == f6.Hh) {
            return 352321535;
        }
        if (i9 == f6.Je || i9 == i10) {
            return -7895161;
        }
        if (i9 == f6.Ie) {
            return 780633991;
        }
        if (i9 == f6.a7) {
            return -15921907;
        }
        if (i9 == f6.m7) {
            return -12500671;
        }
        if (i9 == f6.l7) {
            return -13133079;
        }
        if (i9 == f6.n7) {
            return -1;
        }
        if (i9 == f6.d6) {
            return -15198183;
        }
        if (i9 == f6.d7) {
            return -16777216;
        }
        b6 b6Var = this.b;
        return b6Var != null ? b6Var.N0(i9) : f6.w0(null, i9, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Paint O(String str) {
        return f6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public boolean a() {
        return f6.I.q();
    }

    @Override // lg.c
    public int g(b6 b6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return f6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.Sd, b6Var));
                }
                return i0.a.k(f6.v0(f6.Sd, b6Var), 255);
            case 1:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return f6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.ce, b6Var));
                }
                return i0.a.k(f6.v0(z10 ? f6.s8 : f6.ce, b6Var), 255);
            default:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return f6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.ce, b6Var));
                }
                return i0.a.k(f6.v0(z10 ? f6.s8 : f6.ce, b6Var), 255);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void o(float f10, float f11, int i9, int i10) {
        f6.q(f10, f11, i9, i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int p0(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int q1(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ void c1(int i9, int i10) {
    }
}
