package kg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        hd E0 = hd.E0();
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
                        boolean z10 = hd.c0;
                        E0.c = hd.k(locale, z10 ? "HH:mm" : "h:mm a", z10 ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        String format = E0.c.format(calendar.getTime());
        return i7 > 1440 ? hd.a0(null, null, 2131752748, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
