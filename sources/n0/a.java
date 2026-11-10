package n0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            g0.f.f(30);
        }
        if (i7 >= 30) {
            g0.f.f(31);
        }
        if (i7 >= 30) {
            g0.f.f(33);
        }
        if (i7 >= 30) {
            g0.f.f(1000000);
        }
    }

    public static final boolean a() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return true;
        }
        if (i7 >= 32) {
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
