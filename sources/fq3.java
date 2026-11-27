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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class fq3 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public di2 f;
    public dab h;
    public eq3 n;
    public c8b r;
    public cq3 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public final void a() {
        dab dabVar = this.h;
        int i = Build.VERSION.SDK_INT;
        if ((i <= 28 || f11.b) && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = hl.W(getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, jn7.x1);
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
                    cc4.g(e, true);
                }
                this.w = null;
            }
        }
        this.c = true;
        eq3 eq3Var = this.n;
        if (eq3Var != null) {
            eq3Var.a();
            this.n = null;
        }
        cq3 cq3Var = this.s;
        if (cq3Var != null) {
            cq3Var.a(true);
            this.s = null;
        }
        if (dabVar != null) {
            this.e = true;
            dabVar.a(new zp3(this, (byte) 0));
        }
        d();
        if (dabVar == null) {
            b();
        }
    }

    public final void b() {
        c8b c8bVar;
        if (!this.e || (c8bVar = this.r) == null) {
            return;
        }
        byte b = 0;
        this.e = false;
        byte b2 = 1;
        if (c8bVar.D()) {
            this.d = true;
            eq3 eq3Var = new eq3(getContext());
            this.n = eq3Var;
            eq3Var.setOnCancelListener(new zp3(this, (byte) 1));
            this.b.addView(this.n);
            File s0 = hl.s0(false);
            this.s = new cq3(this.a, this.r, s0, new aq3(this, s0, b), new bq3(this, (byte) 0), new zp3(this, (byte) 2));
        } else {
            this.d = false;
            File q0 = hl.q0("png", false);
            if (q0 == null) {
                this.n.b(R.raw.error, 3500, ob6.N0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new aq3(this, q0, b2));
        }
        d();
    }

    public final void c(String str) {
        eq3 eq3Var = this.n;
        if (eq3Var != null) {
            eq3Var.a();
            this.n = null;
        }
        eq3 eq3Var2 = new eq3(getContext());
        this.n = eq3Var2;
        eq3Var2.b(R.raw.error, 3500, str);
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
                hl.M3(this, this.f);
            } else {
                hl.L3(this, R.drawable.media_download);
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

    public void setEntry(c8b c8bVar) {
        this.w = null;
        this.r = c8bVar;
        cq3 cq3Var = this.s;
        if (cq3Var != null) {
            cq3Var.a(true);
            this.s = null;
        }
        eq3 eq3Var = this.n;
        if (eq3Var != null) {
            eq3Var.a();
            this.n = null;
        }
        if (c8bVar == null) {
            this.c = false;
            d();
        }
    }
}
