package j7;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i8 {
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
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            d = true;
        }
        Method method = c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e6) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e6);
            c = null;
            return 0;
        }
    }

    public static boolean b(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.w(i10, drawable);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e6) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e6);
                a = null;
            }
        }
        return false;
    }

    public static void c(int i10, Drawable drawable) {
        drawable.setTint(i10);
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
