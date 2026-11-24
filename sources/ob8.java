// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ob8 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final nb8 b;
    public boolean c;

    public ob8(nb8 nb8Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = nb8Var;
        this.a = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if ((i < 24 || (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL) || !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) ? false : wie.b("EGL_EXT_protected_content")) {
                return wie.b("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (bw4 e2) {
            lad.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (ob8.class) {
            if (!e) {
                d = a(context);
                e = true;
            }
            z = d != 0;
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            if (!this.c) {
                nb8 nb8Var = this.b;
                nb8Var.b.getClass();
                nb8Var.b.sendEmptyMessage(2);
                this.c = true;
            }
        }
    }
}
