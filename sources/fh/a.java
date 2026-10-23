package fh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import eh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d, d6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ a(int i10, d6 d6Var) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int G(int i10) {
        return w(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return h6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void d(float f7, float f10, int i10, int i11) {
        h6.q(f7, f10, i10, i11);
    }

    @Override // eh.d
    public int f(d6 d6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return h6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, h6.w0(h6.Sd, d6Var));
                }
                return i0.a.o(h6.w0(h6.Sd, d6Var), 255);
            case 1:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return h6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, h6.w0(h6.ce, d6Var));
                }
                return i0.a.o(h6.w0(z10 ? h6.s8 : h6.ce, d6Var), 255);
            default:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return h6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, h6.w0(h6.ce, d6Var));
                }
                return i0.a.o(h6.w0(z10 ? h6.s8 : h6.ce, d6Var), 255);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter j() {
        return h6.v3;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint n(String str) {
        return h6.T0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int r(int i10) {
        return w(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int w(int i10) {
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
        return d6Var != null ? d6Var.w(i10) : h6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void B(int i10, int i11) {
    }
}
