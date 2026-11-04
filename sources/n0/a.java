package n0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            g0.f.f(30);
        }
        if (i3 >= 30) {
            g0.f.f(31);
        }
        if (i3 >= 30) {
            g0.f.f(33);
        }
        if (i3 >= 30) {
            g0.f.f(1000000);
        }
    }

    public static final boolean a() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return true;
        }
        if (i3 >= 32) {
            String CODENAME = Build.VERSION.CODENAME;
            j.d(CODENAME, "CODENAME");
            if (!"REL".equals(CODENAME)) {
                Locale locale = Locale.ROOT;
                String upperCase = CODENAME.toUpperCase(locale);
                j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                Integer num = upperCase.equals("BAKLAVA") ? r1 : null;
                String upperCase2 = "Tiramisu".toUpperCase(locale);
                j.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                r1 = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num == null || r1 == null) {
                    if (num == null && r1 == null) {
                        String upperCase3 = CODENAME.toUpperCase(locale);
                        j.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String upperCase4 = "Tiramisu".toUpperCase(locale);
                        j.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= r1.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
