package g7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class q7 {
    public static Method a;
    public static boolean b;
    public static Field c;
    public static boolean d;

    public static void a(m.y yVar, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.x(yVar, z10);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                field.set(yVar, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i9) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.y(popupWindow, i9);
            return;
        }
        if (!b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i9));
            } catch (Exception unused2) {
            }
        }
    }
}
