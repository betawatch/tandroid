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
import org.telegram.messenger.ls;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class v0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public up f;
    public s8 h;
    public u0 n;
    public c7 r;
    public s0 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public static void a(v0 v0Var) {
        s8 s8Var = v0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.s2.b) && v0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(v0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, ls.y1);
                return;
            }
            return;
        }
        if (v0Var.c || v0Var.r == null) {
            return;
        }
        if (v0Var.w != null) {
            if (i7 >= 30) {
                v0Var.getContext().getContentResolver().delete(v0Var.w, null);
                v0Var.w = null;
            } else if (i7 < 29) {
                try {
                    new File(v0Var.w.toString()).delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                v0Var.w = null;
            }
        }
        v0Var.c = true;
        u0 u0Var = v0Var.n;
        if (u0Var != null) {
            u0Var.a();
            v0Var.n = null;
        }
        s0 s0Var = v0Var.s;
        if (s0Var != null) {
            s0Var.a(true);
            v0Var.s = null;
        }
        if (s8Var != null) {
            v0Var.e = true;
            s8Var.a(new p0(v0Var, 0));
        }
        v0Var.d();
        if (s8Var == null) {
            v0Var.b();
        }
    }

    public final void b() {
        c7 c7Var;
        if (!this.e || (c7Var = this.r) == null) {
            return;
        }
        int i7 = 0;
        this.e = false;
        int i10 = 1;
        if (c7Var.E()) {
            this.d = true;
            u0 u0Var = new u0(getContext());
            this.n = u0Var;
            u0Var.setOnCancelListener(new p0(this, i10));
            this.b.addView(this.n);
            File s02 = org.telegram.messenger.g0.s0(false);
            this.s = new s0(this.a, this.r, s02, new q0(this, s02, i7), new r0(this, i7), new p0(this, 2));
        } else {
            this.d = false;
            File q02 = org.telegram.messenger.g0.q0("png", false);
            if (q02 == null) {
                this.n.b(R.raw.error, 3500, hd.O0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new q0(this, q02, i10));
        }
        d();
    }

    public final void c(String str) {
        u0 u0Var = this.n;
        if (u0Var != null) {
            u0Var.a();
            this.n = null;
        }
        u0 u0Var2 = new u0(getContext());
        this.n = u0Var2;
        u0Var2.b(R.raw.error, 3500, str);
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

    public void setEntry(c7 c7Var) {
        this.w = null;
        this.r = c7Var;
        s0 s0Var = this.s;
        if (s0Var != null) {
            s0Var.a(true);
            this.s = null;
        }
        u0 u0Var = this.n;
        if (u0Var != null) {
            u0Var.a();
            this.n = null;
        }
        if (c7Var == null) {
            this.c = false;
            d();
        }
    }
}
