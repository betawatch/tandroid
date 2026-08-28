package kh;

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
import org.telegram.ui.Components.jp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public jp f;
    public w9 h;
    public u0 n;
    public a8 r;
    public s0 s;
    public Uri v;
    public boolean w;
    public boolean x;

    public static void a(v0 v0Var) {
        w9 w9Var = v0Var.h;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23 && ((i9 <= 28 || BuildVars.NO_SCOPED_STORAGE) && v0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(v0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                return;
            }
            return;
        }
        if (v0Var.c || v0Var.r == null) {
            return;
        }
        if (v0Var.v != null) {
            if (i9 >= 30) {
                v0Var.getContext().getContentResolver().delete(v0Var.v, null);
                v0Var.v = null;
            } else if (i9 < 29) {
                try {
                    new File(v0Var.v.toString()).delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                v0Var.v = null;
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
        if (w9Var != null) {
            v0Var.e = true;
            w9Var.run(new p0(v0Var, 0));
        }
        v0Var.d();
        if (w9Var == null) {
            v0Var.b();
        }
    }

    public final void b() {
        a8 a8Var;
        if (!this.e || (a8Var = this.r) == null) {
            return;
        }
        this.e = false;
        if (a8Var.E()) {
            this.d = true;
            u0 u0Var = new u0(getContext());
            this.n = u0Var;
            u0Var.setOnCancelListener(new p0(this, 1));
            this.b.addView(this.n);
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            this.s = new s0(this.a, this.r, generateVideoPath, new q0(this, generateVideoPath, 0), new r0(this, 0), new p0(this, 2));
        } else {
            this.d = false;
            File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
            if (generatePicturePath == null) {
                this.n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.themeQueue.postRunnable(new q0(this, generatePicturePath, 1));
        }
        d();
    }

    public final void c(int i9, String str) {
        u0 u0Var = this.n;
        if (u0Var != null) {
            u0Var.a();
            this.n = null;
        }
        u0 u0Var2 = new u0(getContext());
        this.n = u0Var2;
        u0Var2.b(i9, 3500, str);
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

    public void setEntry(a8 a8Var) {
        this.v = null;
        this.r = a8Var;
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
        if (a8Var == null) {
            this.c = false;
            d();
        }
    }
}
