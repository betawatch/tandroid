package ig;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class f1 {
    public int a;
    public int b;

    public f1(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public static String a(int i10) {
        int i11 = i10 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i10 - i11) / 60) % 24, i11);
        String format = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
        return i10 > 1440 ? LocaleController.formatString(R.string.BusinessHoursNextDay, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
