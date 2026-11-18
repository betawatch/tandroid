package kg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e1 {
    public int a;
    public int b;

    public e1(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public static String a(int i7) {
        int i10 = i7 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i7 - i10) / 60) % 24, i10);
        gd E0 = gd.E0();
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
                        boolean z10 = gd.c0;
                        E0.c = gd.k(locale, z10 ? "HH:mm" : "h:mm a", z10 ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        String format = E0.c.format(calendar.getTime());
        return i7 > 1440 ? gd.a0(null, null, 2131752737, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
