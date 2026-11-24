// default package

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class mse {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class cls = c;
        if (cls != null) {
            if (!f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    la9.a(longSparseArray);
                }
            }
        }
    }
}
