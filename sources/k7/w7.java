package k7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class w7 {
    public static Method a;
    public static boolean b;
    public static Field c;
    public static boolean d;

    public static void a(m.x xVar, boolean z4) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.x(xVar, z4);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e6);
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                field.set(xVar, Boolean.valueOf(z4));
            } catch (IllegalAccessException e10) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e10);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.y(popupWindow, i10);
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
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }
}
