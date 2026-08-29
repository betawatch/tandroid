package nh;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public np f;
    public h9 h;
    public t0 n;
    public o7 r;
    public r0 s;
    public Uri v;
    public boolean w;
    public boolean x;

    public static void a(u0 u0Var) {
        h9 h9Var = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                return;
            }
            return;
        }
        if (u0Var.c || u0Var.r == null) {
            return;
        }
        if (u0Var.v != null) {
            if (i10 >= 30) {
                u0Var.getContext().getContentResolver().delete(u0Var.v, null);
                u0Var.v = null;
            } else if (i10 < 29) {
                try {
                    new File(u0Var.v.toString()).delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                u0Var.v = null;
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
        if (h9Var != null) {
            u0Var.e = true;
            h9Var.run(new o0(u0Var, 0));
        }
        u0Var.d();
        if (h9Var == null) {
            u0Var.b();
        }
    }

    public final void b() {
        o7 o7Var;
        if (!this.e || (o7Var = this.r) == null) {
            return;
        }
        this.e = false;
        if (o7Var.E()) {
            this.d = true;
            t0 t0Var = new t0(getContext());
            this.n = t0Var;
            t0Var.setOnCancelListener(new o0(this, 1));
            this.b.addView(this.n);
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            this.s = new r0(this.a, this.r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
        } else {
            this.d = false;
            File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
            if (generatePicturePath == null) {
                this.n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
        }
        d();
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.n;
        if (t0Var != null) {
            t0Var.a();
            this.n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.b.addView(this.n);
    }

    public final void d() {
        boolean z10 = this.w;
        boolean z11 = this.c;
        boolean z12 = false;
        if (z10 != (z11 && !this.d)) {
            boolean z13 = z11 && !this.d;
            this.w = z13;
            if (z13) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        if (this.x != (this.c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z12 = true;
            }
            this.x = z12;
            animate.alpha(z12 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(o7 o7Var) {
        this.v = null;
        this.r = o7Var;
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
        if (o7Var == null) {
            this.c = false;
            d();
        }
    }
}
