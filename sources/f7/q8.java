package f7;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class q8 {
    public static Method a;
    public static boolean b;
    public static Method c;
    public static boolean d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.h(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            d = true;
        }
        Method method = c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e11) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
            c = null;
            return 0;
        }
    }

    public static boolean b(int i9, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.w(i9, drawable);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i9));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                a = null;
            }
        }
        return false;
    }

    public static void c(int i9, Drawable drawable) {
        drawable.setTint(i9);
    }

    public static Drawable d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof j0.b)) {
            return drawable;
        }
        j0.d dVar = new j0.d();
        dVar.d = dVar.c();
        dVar.h(drawable);
        j0.d.a();
        return dVar;
    }
}
