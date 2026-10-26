package jg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g1 {
    public int a;
    public int b;

    public g1(int i10, int i11) {
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
