package c8;

import android.os.Build;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class z9 {
    public static boolean a(int i7) {
        if (i7 == 8 || i7 == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !(i7 == 26 || i7 == 27)) {
            return i10 >= 33 && i7 == 30;
        }
        return true;
    }
}
