package ci;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class e6 implements org.telegram.ui.ActionBar.e6 {
    public PorterDuffColorFilter a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 b;

    public e6(org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint G(String str) {
        return this.b.G(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int G0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.i6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Ne || i10 == org.telegram.ui.ActionBar.i6.Re || i10 == org.telegram.ui.ActionBar.i6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.i6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Fh || i10 == org.telegram.ui.ActionBar.i6.Eh || i10 == org.telegram.ui.ActionBar.i6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Hh) {
            return 352321535;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Ie) {
            return 780633991;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.a7) {
            return -15921907;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        return e6Var != null ? e6Var.G0(i10) : org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter x() {
        if (this.a == null) {
            this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
