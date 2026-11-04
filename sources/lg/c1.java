package lg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 {
    public int a;
    public int b;

    public c1(int i3, int i10) {
        this.a = i3;
        this.b = i10;
    }

    public static String a(int i3) {
        int i10 = i3 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i3 - i10) / 60) % 24, i10);
        bd E0 = bd.E0();
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
                        boolean z10 = bd.c0;
                        E0.c = bd.k(locale, z10 ? "HH:mm" : "h:mm a", z10 ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        String format = E0.c.format(calendar.getTime());
        return i3 > 1440 ? bd.a0(null, null, 2131752748, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
