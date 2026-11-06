package fi;

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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.cp;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public cp f;
    public v8 h;
    public s0 n;
    public e7 r;
    public q0 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public static void a(t0 t0Var) {
        v8 v8Var = t0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.r2.b) && t0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(t0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, qs.y1);
                return;
            }
            return;
        }
        if (t0Var.c || t0Var.r == null) {
            return;
        }
        if (t0Var.w != null) {
            if (i7 >= 30) {
                t0Var.getContext().getContentResolver().delete(t0Var.w, null);
                t0Var.w = null;
            } else if (i7 < 29) {
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
        if (v8Var != null) {
            t0Var.e = true;
            v8Var.a(new n0(t0Var, 0));
        }
        t0Var.d();
        if (v8Var == null) {
            t0Var.b();
        }
    }

    public final void b() {
        e7 e7Var;
        if (!this.e || (e7Var = this.r) == null) {
            return;
        }
        int i7 = 0;
        this.e = false;
        int i10 = 1;
        if (e7Var.E()) {
            this.d = true;
            s0 s0Var = new s0(getContext());
            this.n = s0Var;
            s0Var.setOnCancelListener(new n0(this, i10));
            this.b.addView(this.n);
            File s02 = org.telegram.messenger.g0.s0(false);
            this.s = new q0(this.a, this.r, s02, new o0(this, s02, i7), new p0(this, i7), new n0(this, 2));
        } else {
            this.d = false;
            File q02 = org.telegram.messenger.g0.q0("png", false);
            if (q02 == null) {
                this.n.b(R.raw.error, 3500, hd.N0("UnknownError"));
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
        boolean z9 = this.x;
        boolean z10 = this.c;
        boolean z11 = false;
        if (z9 != (z10 && !this.d)) {
            boolean z12 = z10 && !this.d;
            this.x = z12;
            if (z12) {
                org.telegram.messenger.g0.S3(this, this.f);
            } else {
                org.telegram.messenger.g0.R3(this, R.drawable.media_download);
            }
        }
        if (this.y != (this.c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z11 = true;
            }
            this.y = z11;
            animate.alpha(z11 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(e7 e7Var) {
        this.w = null;
        this.r = e7Var;
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
        if (e7Var == null) {
            this.c = false;
            d();
        }
    }
}
