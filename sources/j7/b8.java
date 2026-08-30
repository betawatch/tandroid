package j7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class b8 {
    public static Constructor a;
    public static Method b;
    public static Method c;
    public static Constructor d;
    public static Method e;

    public static void a() {
        if (a == null || b == null || c == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            a = cls.getConstructor(null);
            b = cls.getMethod("setRotationDegrees", Float.TYPE);
            c = cls.getMethod("build", null);
        }
        if (d == null || e == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            d = cls2.getConstructor(null);
            e = cls2.getMethod("build", null);
        }
    }
}
