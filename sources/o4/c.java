package o4;

import g7.r6;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements j {
    public static final int[] b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i9, ArrayList arrayList) {
        if (r6.c(i9, 0, 7, b) == -1 || arrayList.contains(Integer.valueOf(i9))) {
            return;
        }
        arrayList.add(Integer.valueOf(i9));
    }
}
