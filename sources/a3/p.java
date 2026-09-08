package a3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class p extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final o b;
    public boolean c;

    public p(o oVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.b = oVar;
        this.a = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a A[Catch: k -> 0x0046, TRY_LEAVE, TryCatch #0 {k -> 0x0046, blocks: (B:3:0x0001, B:7:0x003a, B:16:0x000d, B:18:0x0018, B:22:0x0025, B:25:0x0032), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context) {
        boolean j3;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24 && ((i10 >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                j3 = e2.a.j("EGL_EXT_protected_content");
                if (j3) {
                    return 0;
                }
                return e2.a.j("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            j3 = false;
            if (j3) {
            }
        } catch (e2.k e7) {
            e2.a.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e7.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (p.class) {
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
                    o oVar = this.b;
                    oVar.b.getClass();
                    oVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
