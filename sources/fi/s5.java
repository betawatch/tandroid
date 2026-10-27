package fi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s5 implements org.telegram.ui.ActionBar.u6 {
    public PorterDuffColorFilter a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 b;

    public s5(org.telegram.ui.ActionBar.u6 u6Var) {
        this.b = u6Var;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        if (this.a == null) {
            this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Paint d(String str) {
        return this.b.d(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        if (i10 == org.telegram.ui.ActionBar.y6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Ne || i10 == org.telegram.ui.ActionBar.y6.Re || i10 == org.telegram.ui.ActionBar.y6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.y6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Fh || i10 == org.telegram.ui.ActionBar.y6.Eh || i10 == org.telegram.ui.ActionBar.y6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Hh) {
            return 352321535;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Ie) {
            return 780633991;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.a7) {
            return -15921907;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        return u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
