package kg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d1 {
    public int a;
    public int b;

    public d1(int i7, int i10) {
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
        return i7 > 1440 ? gd.a0(null, null, 2131752736, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
