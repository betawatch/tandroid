package fh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import eh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d, f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ a(int i10, f6 f6Var) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int G0(int i10) {
        if (i10 == j6.G8) {
            return -14145495;
        }
        if (i10 == j6.E8) {
            return -1;
        }
        if (i10 == j6.h5) {
            return -14737633;
        }
        if (i10 == j6.j5) {
            return -592138;
        }
        if (i10 == j6.r5) {
            return -8553091;
        }
        if (i10 == j6.He) {
            return -16777216;
        }
        if (i10 == j6.Ke) {
            return -1610612736;
        }
        if (i10 == j6.Ne || i10 == j6.Re || i10 == j6.Me) {
            return -9539985;
        }
        if (i10 == j6.G6) {
            return -1;
        }
        int i11 = j6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == j6.i6) {
            return 536870911;
        }
        if (i10 == j6.Fh || i10 == j6.Eh || i10 == j6.Gh) {
            return -1;
        }
        if (i10 == j6.Hh) {
            return 352321535;
        }
        if (i10 == j6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == j6.Ie) {
            return 780633991;
        }
        if (i10 == j6.a7) {
            return -15921907;
        }
        if (i10 == j6.m7) {
            return -12500671;
        }
        if (i10 == j6.l7) {
            return -13133079;
        }
        if (i10 == j6.n7) {
            return -1;
        }
        if (i10 == j6.d6) {
            return -15198183;
        }
        if (i10 == j6.d7) {
            return -16777216;
        }
        f6 f6Var = this.b;
        return f6Var != null ? f6Var.G0(i10) : j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return j6.I.q();
    }

    @Override // eh.d
    public int f(f6 f6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.Sd, f6Var));
                }
                return i0.a.k(j6.v0(j6.Sd, f6Var), 255);
            case 1:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.ce, f6Var));
                }
                return i0.a.k(j6.v0(z10 ? j6.s8 : j6.ce, f6Var), 255);
            default:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.ce, f6Var));
                }
                return i0.a.k(j6.v0(z10 ? j6.s8 : j6.ce, f6Var), 255);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void O0(int i10, int i11) {
    }
}
