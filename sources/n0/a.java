package n0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.j;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            g0.f.f(30);
        }
        if (i10 >= 30) {
            g0.f.f(31);
        }
        if (i10 >= 30) {
            g0.f.f(33);
        }
        if (i10 >= 30) {
            g0.f.f(MediaController.VIDEO_BITRATE_480);
        }
    }

    public static final boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 >= 32) {
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
