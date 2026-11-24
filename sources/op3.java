// default package

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class op3 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ih2 f;
    public e6b h;
    public np3 n;
    public f4b r;
    public lp3 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public final void a() {
        e6b e6bVar = this.h;
        int i = Build.VERSION.SDK_INT;
        if ((i <= 28 || w01.b) && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = gl.W(getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, kk7.x1);
                return;
            }
            return;
        }
        if (this.c || this.r == null) {
            return;
        }
        if (this.w != null) {
            if (i >= 30) {
                getContext().getContentResolver().delete(this.w, null);
                this.w = null;
            } else if (i < 29) {
                try {
                    new File(this.w.toString()).delete();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                this.w = null;
            }
        }
        this.c = true;
        np3 np3Var = this.n;
        if (np3Var != null) {
            np3Var.a();
            this.n = null;
        }
        lp3 lp3Var = this.s;
        if (lp3Var != null) {
            lp3Var.a(true);
            this.s = null;
        }
        if (e6bVar != null) {
            this.e = true;
            e6bVar.a(new ip3(this, (byte) 0));
        }
        d();
        if (e6bVar == null) {
            b();
        }
    }

    public final void b() {
        f4b f4bVar;
        if (!this.e || (f4bVar = this.r) == null) {
            return;
        }
        byte b = 0;
        this.e = false;
        byte b2 = 1;
        if (f4bVar.D()) {
            this.d = true;
            np3 np3Var = new np3(getContext());
            this.n = np3Var;
            np3Var.setOnCancelListener(new ip3(this, b2));
            this.b.addView(this.n);
            File s0 = gl.s0(false);
            this.s = new lp3(this.a, this.r, s0, new jp3(this, s0, b), new kp3(this, b), new ip3(this, (byte) 2));
        } else {
            this.d = false;
            File q0 = gl.q0("png", false);
            if (q0 == null) {
                this.n.b(R.raw.error, 3500, k96.N0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new jp3(this, q0, b2));
        }
        d();
    }

    public final void c(String str) {
        np3 np3Var = this.n;
        if (np3Var != null) {
            np3Var.a();
            this.n = null;
        }
        np3 np3Var2 = new np3(getContext());
        this.n = np3Var2;
        np3Var2.b(R.raw.error, 3500, str);
        this.b.addView(this.n);
    }

    public final void d() {
        boolean z = this.x;
        boolean z2 = this.c;
        boolean z3 = false;
        if (z != (z2 && !this.d)) {
            boolean z4 = z2 && !this.d;
            this.x = z4;
            if (z4) {
                gl.N3(this, this.f);
            } else {
                gl.M3(this, R.drawable.media_download);
            }
        }
        if (this.y != (this.c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z3 = true;
            }
            this.y = z3;
            animate.alpha(z3 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(f4b f4bVar) {
        this.w = null;
        this.r = f4bVar;
        lp3 lp3Var = this.s;
        if (lp3Var != null) {
            lp3Var.a(true);
            this.s = null;
        }
        np3 np3Var = this.n;
        if (np3Var != null) {
            np3Var.a();
            this.n = null;
        }
        if (f4bVar == null) {
            this.c = false;
            d();
        }
    }
}
