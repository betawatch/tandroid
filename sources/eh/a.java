package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d, e6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ a(int i10, e6 e6Var) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint G(String str) {
        return i6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int G0(int i10) {
        if (i10 == i6.G8) {
            return -14145495;
        }
        if (i10 == i6.E8) {
            return -1;
        }
        if (i10 == i6.h5) {
            return -14737633;
        }
        if (i10 == i6.j5) {
            return -592138;
        }
        if (i10 == i6.r5) {
            return -8553091;
        }
        if (i10 == i6.He) {
            return -16777216;
        }
        if (i10 == i6.Ke) {
            return -1610612736;
        }
        if (i10 == i6.Ne || i10 == i6.Re || i10 == i6.Me) {
            return -9539985;
        }
        if (i10 == i6.G6) {
            return -1;
        }
        int i11 = i6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == i6.i6) {
            return 536870911;
        }
        if (i10 == i6.Fh || i10 == i6.Eh || i10 == i6.Gh) {
            return -1;
        }
        if (i10 == i6.Hh) {
            return 352321535;
        }
        if (i10 == i6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == i6.Ie) {
            return 780633991;
        }
        if (i10 == i6.a7) {
            return -15921907;
        }
        if (i10 == i6.m7) {
            return -12500671;
        }
        if (i10 == i6.l7) {
            return -13133079;
        }
        if (i10 == i6.n7) {
            return -1;
        }
        if (i10 == i6.d6) {
            return -15198183;
        }
        if (i10 == i6.d7) {
            return -16777216;
        }
        e6 e6Var = this.b;
        return e6Var != null ? e6Var.G0(i10) : i6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean a() {
        return i6.I.q();
    }

    @Override // dh.d
    public int g(e6 e6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.Sd, e6Var));
                }
                return i0.a.k(i6.v0(i6.Sd, e6Var), 255);
            case 1:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.ce, e6Var));
                }
                return i0.a.k(i6.v0(z10 ? i6.s8 : i6.ce, e6Var), 255);
            default:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.ce, e6Var));
                }
                return i0.a.k(i6.v0(z10 ? i6.s8 : i6.ce, e6Var), 255);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        return i6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
