// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class df8 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final cf8 b;
    public boolean c;

    public df8(cf8 cf8Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = cf8Var;
        this.a = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if ((i < 24 || (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL) || !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) ? false : one.b("EGL_EXT_protected_content")) {
                return one.b("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (gy4 e2) {
            efd.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (df8.class) {
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
                cf8 cf8Var = this.b;
                cf8Var.b.getClass();
                cf8Var.b.sendEmptyMessage(2);
                this.c = true;
            }
        }
    }
}
