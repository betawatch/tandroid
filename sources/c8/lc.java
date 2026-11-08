package c8;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class lc {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.c.c(edgeEffect, f10, f11);
        }
        u0.b.a(edgeEffect, f10, f11);
        return f10;
    }
}
