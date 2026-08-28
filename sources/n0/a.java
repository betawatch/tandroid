package n0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.i;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            g0.f.f(30);
        }
        if (i9 >= 30) {
            g0.f.f(31);
        }
        if (i9 >= 30) {
            g0.f.f(33);
        }
        if (i9 >= 30) {
            g0.f.f(MediaController.VIDEO_BITRATE_480);
        }
    }

    public static final boolean a() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            return true;
        }
        if (i9 >= 32) {
            String CODENAME = Build.VERSION.CODENAME;
            i.d(CODENAME, "CODENAME");
            if (!"REL".equals(CODENAME)) {
                Locale locale = Locale.ROOT;
                String upperCase = CODENAME.toUpperCase(locale);
                i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                Integer num = upperCase.equals("BAKLAVA") ? r1 : null;
                String upperCase2 = "Tiramisu".toUpperCase(locale);
                i.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                r1 = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num == null || r1 == null) {
                    if (num == null && r1 == null) {
                        String upperCase3 = CODENAME.toUpperCase(locale);
                        i.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String upperCase4 = "Tiramisu".toUpperCase(locale);
                        i.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
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
