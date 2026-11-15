package a8;

import android.os.Build;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class l1 {
    public static boolean a(int i7) {
        return (i7 & 32768) != 0;
    }

    public static boolean b(int i7) {
        if (i7 == 15 || i7 == 255) {
            return true;
        }
        if (i7 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i7 != 32783) {
            return i7 == 33023 || i7 == 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 28 || i10 > 29;
    }
}
