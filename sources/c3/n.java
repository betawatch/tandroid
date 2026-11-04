package c3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final m b;
    public boolean c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.b = mVar;
        this.a = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039 A[Catch: n -> 0x0045, TRY_LEAVE, TryCatch #0 {n -> 0x0045, blocks: (B:3:0x0001, B:7:0x0039, B:16:0x000d, B:18:0x0017, B:22:0x0024, B:25:0x0031), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context) {
        boolean d10;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24 && ((i3 >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && (i3 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                d10 = g2.f.d("EGL_EXT_protected_content");
                if (d10) {
                    return 0;
                }
                return g2.f.d("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            d10 = false;
            if (d10) {
            }
        } catch (g2.n e10) {
            g2.a.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e10.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (n.class) {
            try {
                if (!e) {
                    d = a(context);
                    e = true;
                }
                z10 = d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    m mVar = this.b;
                    mVar.b.getClass();
                    mVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
