package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final m b;
    public boolean c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.b = mVar;
        this.a = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039 A[Catch: m -> 0x0045, TRY_LEAVE, TryCatch #0 {m -> 0x0045, blocks: (B:3:0x0001, B:7:0x0039, B:16:0x000d, B:18:0x0017, B:22:0x0024, B:25:0x0031), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context) {
        boolean d2;
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24 && ((i7 >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && (i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                d2 = h2.e.d("EGL_EXT_protected_content");
                if (d2) {
                    return 0;
                }
                return h2.e.d("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            d2 = false;
            if (d2) {
            }
        } catch (h2.m e10) {
            h2.a.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e10.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z9;
        synchronized (n.class) {
            try {
                if (!e) {
                    d = a(context);
                    e = true;
                }
                z9 = d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z9;
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
