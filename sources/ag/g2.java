package ag;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g2 {
    public int a;
    public int b;

    public g2(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public static String a(int i10) {
        int i11 = i10 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i10 - i11) / 60) % 24, i11);
        cd D0 = cd.D0();
        if (D0.c == null) {
            synchronized (D0) {
                try {
                    if (D0.c == null) {
                        Locale locale = D0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        String language = locale.getLanguage();
                        if (language == null) {
                            language = "en";
                        }
                        String lowerCase = language.toLowerCase();
                        if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                            locale = Locale.US;
                        }
                        boolean z10 = cd.Z;
                        D0.c = cd.k(locale, z10 ? "HH:mm" : "h:mm a", z10 ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        String format = D0.c.format(calendar.getTime());
        return i10 > 1440 ? cd.a0(null, null, 2131752748, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
