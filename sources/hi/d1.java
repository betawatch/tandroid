package hi;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.rp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class d1 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public rp f;
    public n9 h;
    public c1 n;
    public x7 r;
    public a1 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public static void a(d1 d1Var) {
        n9 n9Var = d1Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.s2.b) && d1Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(d1Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, ks.y1);
                return;
            }
            return;
        }
        if (d1Var.c || d1Var.r == null) {
            return;
        }
        if (d1Var.w != null) {
            if (i7 >= 30) {
                d1Var.getContext().getContentResolver().delete(d1Var.w, null);
                d1Var.w = null;
            } else if (i7 < 29) {
                try {
                    new File(d1Var.w.toString()).delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                d1Var.w = null;
            }
        }
        d1Var.c = true;
        c1 c1Var = d1Var.n;
        if (c1Var != null) {
            c1Var.a();
            d1Var.n = null;
        }
        a1 a1Var = d1Var.s;
        if (a1Var != null) {
            a1Var.a(true);
            d1Var.s = null;
        }
        if (n9Var != null) {
            d1Var.e = true;
            n9Var.a(new x0(d1Var, 0));
        }
        d1Var.d();
        if (n9Var == null) {
            d1Var.b();
        }
    }

    public final void b() {
        x7 x7Var;
        if (!this.e || (x7Var = this.r) == null) {
            return;
        }
        int i7 = 0;
        this.e = false;
        int i10 = 1;
        if (x7Var.E()) {
            this.d = true;
            c1 c1Var = new c1(getContext());
            this.n = c1Var;
            c1Var.setOnCancelListener(new x0(this, i10));
            this.b.addView(this.n);
            File s02 = org.telegram.messenger.g0.s0(false);
            this.s = new a1(this.a, this.r, s02, new y0(this, s02, i7), new z0(this, i7), new x0(this, 2));
        } else {
            this.d = false;
            File q02 = org.telegram.messenger.g0.q0("png", false);
            if (q02 == null) {
                this.n.b(R.raw.error, 3500, gd.O0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new y0(this, q02, i10));
        }
        d();
    }

    public final void c(String str) {
        c1 c1Var = this.n;
        if (c1Var != null) {
            c1Var.a();
            this.n = null;
        }
        c1 c1Var2 = new c1(getContext());
        this.n = c1Var2;
        c1Var2.b(R.raw.error, 3500, str);
        this.b.addView(this.n);
    }

    public final void d() {
        boolean z10 = this.x;
        boolean z11 = this.c;
        boolean z12 = false;
        if (z10 != (z11 && !this.d)) {
            boolean z13 = z11 && !this.d;
            this.x = z13;
            if (z13) {
                org.telegram.messenger.g0.Q3(this, this.f);
            } else {
                org.telegram.messenger.g0.P3(this, R.drawable.media_download);
            }
        }
        if (this.y != (this.c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z12 = true;
            }
            this.y = z12;
            animate.alpha(z12 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(x7 x7Var) {
        this.w = null;
        this.r = x7Var;
        a1 a1Var = this.s;
        if (a1Var != null) {
            a1Var.a(true);
            this.s = null;
        }
        c1 c1Var = this.n;
        if (c1Var != null) {
            c1Var.a();
            this.n = null;
        }
        if (x7Var == null) {
            this.c = false;
            d();
        }
    }
}
