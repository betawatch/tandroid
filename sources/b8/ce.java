package b8;

import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ce {
    public static boolean a(int i3) {
        if (i3 == 8 || i3 == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !(i3 == 26 || i3 == 27)) {
            return i10 >= 33 && i3 == 30;
        }
        return true;
    }
}
