package f7;

import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m {
    public static boolean a(int i9) {
        return (i9 & 32768) != 0;
    }

    public static boolean b(int i9) {
        if (i9 == 15 || i9 == 255) {
            return true;
        }
        if (i9 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i9 != 32783) {
            return i9 == 33023 || i9 == 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 28 || i10 > 29;
    }
}
