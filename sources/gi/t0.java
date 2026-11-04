package gi;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.cp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public cp f;
    public w8 h;
    public s0 n;
    public f7 r;
    public q0 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public static void a(t0 t0Var) {
        w8 w8Var = t0Var.h;
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 <= 28 || org.telegram.messenger.r2.b) && t0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(t0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, hs.y1);
                return;
            }
            return;
        }
        if (t0Var.c || t0Var.r == null) {
            return;
        }
        if (t0Var.w != null) {
            if (i3 >= 30) {
                t0Var.getContext().getContentResolver().delete(t0Var.w, null);
                t0Var.w = null;
            } else if (i3 < 29) {
                try {
                    new File(t0Var.w.toString()).delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                t0Var.w = null;
            }
        }
        t0Var.c = true;
        s0 s0Var = t0Var.n;
        if (s0Var != null) {
            s0Var.a();
            t0Var.n = null;
        }
        q0 q0Var = t0Var.s;
        if (q0Var != null) {
            q0Var.a(true);
            t0Var.s = null;
        }
        if (w8Var != null) {
            t0Var.e = true;
            w8Var.a(new n0(t0Var, 0));
        }
        t0Var.d();
        if (w8Var == null) {
            t0Var.b();
        }
    }

    public final void b() {
        f7 f7Var;
        if (!this.e || (f7Var = this.r) == null) {
            return;
        }
        int i3 = 0;
        this.e = false;
        int i10 = 1;
        if (f7Var.E()) {
            this.d = true;
            s0 s0Var = new s0(getContext());
            this.n = s0Var;
            s0Var.setOnCancelListener(new n0(this, i10));
            this.b.addView(this.n);
            File s02 = org.telegram.messenger.g0.s0(false);
            this.s = new q0(this.a, this.r, s02, new o0(this, s02, i3), new p0(this, i3), new n0(this, 2));
        } else {
            this.d = false;
            File q02 = org.telegram.messenger.g0.q0("png", false);
            if (q02 == null) {
                this.n.b(R.raw.error, 3500, bd.N0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new o0(this, q02, i10));
        }
        d();
    }

    public final void c(String str) {
        s0 s0Var = this.n;
        if (s0Var != null) {
            s0Var.a();
            this.n = null;
        }
        s0 s0Var2 = new s0(getContext());
        this.n = s0Var2;
        s0Var2.b(R.raw.error, 3500, str);
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
                org.telegram.messenger.g0.S3(this, this.f);
            } else {
                org.telegram.messenger.g0.R3(this, R.drawable.media_download);
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

    public void setEntry(f7 f7Var) {
        this.w = null;
        this.r = f7Var;
        q0 q0Var = this.s;
        if (q0Var != null) {
            q0Var.a(true);
            this.s = null;
        }
        s0 s0Var = this.n;
        if (s0Var != null) {
            s0Var.a();
            this.n = null;
        }
        if (f7Var == null) {
            this.c = false;
            d();
        }
    }
}
