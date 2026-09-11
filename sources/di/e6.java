package di;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class e6 implements org.telegram.ui.ActionBar.f6 {
    public PorterDuffColorFilter a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;

    public e6(org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint G(String str) {
        return this.b.G(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int G0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.j6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Ne || i10 == org.telegram.ui.ActionBar.j6.Re || i10 == org.telegram.ui.ActionBar.j6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.j6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Fh || i10 == org.telegram.ui.ActionBar.j6.Eh || i10 == org.telegram.ui.ActionBar.j6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Hh) {
            return 352321535;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Ie) {
            return 780633991;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.a7) {
            return -15921907;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter x() {
        if (this.a == null) {
            this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void O0(int i10, int i11) {
    }
}
