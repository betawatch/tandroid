package kg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.id;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b1 {
    public int a;
    public int b;

    public b1(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public static String a(int i7) {
        int i10 = i7 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i7 - i10) / 60) % 24, i10);
        id E0 = id.E0();
        if (E0.c == null) {
            synchronized (E0) {
                try {
                    if (E0.c == null) {
                        Locale locale = E0.y;
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
                        boolean z9 = id.c0;
                        E0.c = id.k(locale, z9 ? "HH:mm" : "h:mm a", z9 ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        String format = E0.c.format(calendar.getTime());
        return i7 > 1440 ? id.a0(null, null, 2131752748, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
