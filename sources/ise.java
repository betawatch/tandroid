// default package

import android.os.Build;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ise {
    public static Boolean a;
    public static int b;

    public static boolean a() {
        Boolean bool;
        int intValue;
        Boolean bool2 = a;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            bool = Boolean.FALSE;
            a = bool;
        }
        if (intValue < 100000) {
            return false;
        }
        b = intValue - 90000;
        bool = Boolean.TRUE;
        a = bool;
        return bool.booleanValue();
    }
}
