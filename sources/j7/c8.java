package j7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class c8 {
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
