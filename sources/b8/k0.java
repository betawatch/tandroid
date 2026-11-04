package b8;

import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class k0 {
    public static boolean a(int i3) {
        return (i3 & 32768) != 0;
    }

    public static boolean b(int i3) {
        if (i3 == 15 || i3 == 255) {
            return true;
        }
        if (i3 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i3 != 32783) {
            return i3 == 33023 || i3 == 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 28 || i10 > 29;
    }
}
