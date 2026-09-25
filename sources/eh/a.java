package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d, d6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ a(int i10, d6 d6Var) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint G(String str) {
        return h6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int G0(int i10) {
        if (i10 == h6.G8) {
            return -14145495;
        }
        if (i10 == h6.E8) {
            return -1;
        }
        if (i10 == h6.h5) {
            return -14737633;
        }
        if (i10 == h6.j5) {
            return -592138;
        }
        if (i10 == h6.r5) {
            return -8553091;
        }
        if (i10 == h6.He) {
            return -16777216;
        }
        if (i10 == h6.Ke) {
            return -1610612736;
        }
        if (i10 == h6.Ne || i10 == h6.Re || i10 == h6.Me) {
            return -9539985;
        }
        if (i10 == h6.G6) {
            return -1;
        }
        int i11 = h6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == h6.i6) {
            return 536870911;
        }
        if (i10 == h6.Fh || i10 == h6.Eh || i10 == h6.Gh) {
            return -1;
        }
        if (i10 == h6.Hh) {
            return 352321535;
        }
        if (i10 == h6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == h6.Ie) {
            return 780633991;
        }
        if (i10 == h6.a7) {
            return -15921907;
        }
        if (i10 == h6.m7) {
            return -12500671;
        }
        if (i10 == h6.l7) {
            return -13133079;
        }
        if (i10 == h6.n7) {
            return -1;
        }
        if (i10 == h6.d6) {
            return -15198183;
        }
        if (i10 == h6.d7) {
            return -16777216;
        }
        d6 d6Var = this.b;
        return d6Var != null ? d6Var.G0(i10) : h6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return h6.I.q();
    }

    @Override // dh.d
    public int g(d6 d6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return h6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, h6.v0(h6.Sd, d6Var));
                }
                return i0.a.k(h6.v0(h6.Sd, d6Var), 255);
            case 1:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return h6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, h6.v0(h6.ce, d6Var));
                }
                return i0.a.k(h6.v0(z10 ? h6.s8 : h6.ce, d6Var), 255);
            default:
                if (b.c(UserConfig.selectedAccount, this.b)) {
                    return h6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, h6.v0(h6.ce, d6Var));
                }
                return i0.a.k(h6.v0(z10 ? h6.s8 : h6.ce, d6Var), 255);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        h6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return h6.v3;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
