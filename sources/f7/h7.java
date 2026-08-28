package f7;

import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h7 {
    public static int a(int i9) {
        if (i9 >= 100 || i9 < 0) {
            return i9;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", e2.c.m(String.valueOf(za.a.p3().get(1)), 2, 0), Integer.valueOf(i9)));
    }
}
