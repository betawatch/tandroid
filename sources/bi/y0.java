package bi;

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
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class y0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public zp f;
    public ub h;
    public x0 n;
    public r9 r;
    public v0 s;
    public Uri v;
    public boolean w;
    public boolean x;

    public static void a(y0 y0Var) {
        ub ubVar = y0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && y0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(y0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                return;
            }
            return;
        }
        if (y0Var.c || y0Var.r == null) {
            return;
        }
        if (y0Var.v != null) {
            if (i10 >= 30) {
                y0Var.getContext().getContentResolver().delete(y0Var.v, null);
                y0Var.v = null;
            } else if (i10 < 29) {
                try {
                    new File(y0Var.v.toString()).delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y0Var.v = null;
            }
        }
        y0Var.c = true;
        x0 x0Var = y0Var.n;
        if (x0Var != null) {
            x0Var.a();
            y0Var.n = null;
        }
        v0 v0Var = y0Var.s;
        if (v0Var != null) {
            v0Var.a(true);
            y0Var.s = null;
        }
        if (ubVar != null) {
            y0Var.e = true;
            ubVar.run(new s0(y0Var, 0));
        }
        y0Var.d();
        if (ubVar == null) {
            y0Var.b();
        }
    }

    public final void b() {
        r9 r9Var;
        if (!this.e || (r9Var = this.r) == null) {
            return;
        }
        this.e = false;
        if (r9Var.E()) {
            this.d = true;
            x0 x0Var = new x0(getContext());
            this.n = x0Var;
            x0Var.setOnCancelListener(new s0(this, 1));
            this.b.addView(this.n);
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            this.s = new v0(this.a, this.r, generateVideoPath, new t0(this, generateVideoPath, 0), new u0(this, 0), new s0(this, 2));
        } else {
            this.d = false;
            File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
            if (generatePicturePath == null) {
                this.n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.themeQueue.postRunnable(new t0(this, generatePicturePath, 1));
        }
        d();
    }

    public final void c(int i10, String str) {
        x0 x0Var = this.n;
        if (x0Var != null) {
            x0Var.a();
            this.n = null;
        }
        x0 x0Var2 = new x0(getContext());
        this.n = x0Var2;
        x0Var2.b(i10, 3500, str);
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

    public void setEntry(r9 r9Var) {
        this.v = null;
        this.r = r9Var;
        v0 v0Var = this.s;
        if (v0Var != null) {
            v0Var.a(true);
            this.s = null;
        }
        x0 x0Var = this.n;
        if (x0Var != null) {
            x0Var.a();
            this.n = null;
        }
        if (r9Var == null) {
            this.c = false;
            d();
        }
    }
}
