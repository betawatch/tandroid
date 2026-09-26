package hg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
