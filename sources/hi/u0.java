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
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public lp f;
    public t8 h;
    public t0 n;
    public d7 r;
    public r0 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public static void a(u0 u0Var) {
        t8 t8Var = u0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.r2.b) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(u0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, ns.y1);
                return;
            }
            return;
        }
        if (u0Var.c || u0Var.r == null) {
            return;
        }
        if (u0Var.w != null) {
            if (i7 >= 30) {
                u0Var.getContext().getContentResolver().delete(u0Var.w, null);
                u0Var.w = null;
            } else if (i7 < 29) {
                try {
                    new File(u0Var.w.toString()).delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                u0Var.w = null;
            }
        }
        u0Var.c = true;
        t0 t0Var = u0Var.n;
        if (t0Var != null) {
            t0Var.a();
            u0Var.n = null;
        }
        r0 r0Var = u0Var.s;
        if (r0Var != null) {
            r0Var.a(true);
            u0Var.s = null;
        }
        if (t8Var != null) {
            u0Var.e = true;
            t8Var.a(new o0(u0Var, 0));
        }
        u0Var.d();
        if (t8Var == null) {
            u0Var.b();
        }
    }

    public final void b() {
        d7 d7Var;
        if (!this.e || (d7Var = this.r) == null) {
            return;
        }
        int i7 = 0;
        this.e = false;
        int i10 = 1;
        if (d7Var.E()) {
            this.d = true;
            t0 t0Var = new t0(getContext());
            this.n = t0Var;
            t0Var.setOnCancelListener(new o0(this, i10));
            this.b.addView(this.n);
            File s02 = org.telegram.messenger.g0.s0(false);
            this.s = new r0(this.a, this.r, s02, new p0(this, s02, i7), new q0(this, i7), new o0(this, 2));
        } else {
            this.d = false;
            File q02 = org.telegram.messenger.g0.q0("png", false);
            if (q02 == null) {
                this.n.b(R.raw.error, 3500, hd.N0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new p0(this, q02, i10));
        }
        d();
    }

    public final void c(String str) {
        t0 t0Var = this.n;
        if (t0Var != null) {
            t0Var.a();
            this.n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.n = t0Var2;
        t0Var2.b(R.raw.error, 3500, str);
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
                org.telegram.messenger.g0.R3(this, this.f);
            } else {
                org.telegram.messenger.g0.Q3(this, R.drawable.media_download);
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

    public void setEntry(d7 d7Var) {
        this.w = null;
        this.r = d7Var;
        r0 r0Var = this.s;
        if (r0Var != null) {
            r0Var.a(true);
            this.s = null;
        }
        t0 t0Var = this.n;
        if (t0Var != null) {
            t0Var.a();
            this.n = null;
        }
        if (d7Var == null) {
            this.c = false;
            d();
        }
    }
}
