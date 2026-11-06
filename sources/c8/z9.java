package c8;

import android.os.Build;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
