package c8;

import android.os.Build;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class aa {
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
