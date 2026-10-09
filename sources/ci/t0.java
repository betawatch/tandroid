package ci;

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
import org.telegram.ui.Components.jq;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public jq f;
    public ia h;
    public s0 n;
    public l8 r;
    public q0 s;
    public Uri v;
    public boolean w;
    public boolean x;

    public static void a(t0 t0Var) {
        ia iaVar = t0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && t0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity findActivity = AndroidUtilities.findActivity(t0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                return;
            }
            return;
        }
        if (t0Var.c || t0Var.r == null) {
            return;
        }
        if (t0Var.v != null) {
            if (i10 >= 30) {
                t0Var.getContext().getContentResolver().delete(t0Var.v, null);
                t0Var.v = null;
            } else if (i10 < 29) {
                try {
                    new File(t0Var.v.toString()).delete();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                t0Var.v = null;
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
        if (iaVar != null) {
            t0Var.e = true;
            iaVar.run(new n0(t0Var, 0));
        }
        t0Var.d();
        if (iaVar == null) {
            t0Var.b();
        }
    }

    public final void b() {
        l8 l8Var;
        if (!this.e || (l8Var = this.r) == null) {
            return;
        }
        this.e = false;
        if (l8Var.E()) {
            this.d = true;
            s0 s0Var = new s0(getContext());
            this.n = s0Var;
            s0Var.setOnCancelListener(new n0(this, 1));
            this.b.addView(this.n);
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            this.s = new q0(this.a, this.r, generateVideoPath, new o0(this, generateVideoPath, 0), new p0(this, 0), new n0(this, 2));
        } else {
            this.d = false;
            File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
            if (generatePicturePath == null) {
                this.n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.themeQueue.postRunnable(new o0(this, generatePicturePath, 1));
        }
        d();
    }

    public final void c(int i10, String str) {
        s0 s0Var = this.n;
        if (s0Var != null) {
            s0Var.a();
            this.n = null;
        }
        s0 s0Var2 = new s0(getContext());
        this.n = s0Var2;
        s0Var2.b(i10, 3500, str);
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

    public void setEntry(l8 l8Var) {
        this.v = null;
        this.r = l8Var;
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
        if (l8Var == null) {
            this.c = false;
            d();
        }
    }
}
