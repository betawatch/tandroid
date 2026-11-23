package c8;

import android.os.Build;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class ba {
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
