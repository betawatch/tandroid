package di;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class c6 implements org.telegram.ui.ActionBar.c6 {
    public PorterDuffColorFilter a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 b;

    public c6(org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = c6Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int F0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.g6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Ne || i10 == org.telegram.ui.ActionBar.g6.Re || i10 == org.telegram.ui.ActionBar.g6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.g6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Fh || i10 == org.telegram.ui.ActionBar.g6.Eh || i10 == org.telegram.ui.ActionBar.g6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Hh) {
            return 352321535;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Ie) {
            return 780633991;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.a7) {
            return -15921907;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        return c6Var != null ? c6Var.F0(i10) : org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Paint G(String str) {
        return this.b.G(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int b0(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int g1(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final ColorFilter x() {
        if (this.a == null) {
            this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void N0(int i10, int i11) {
    }
}
