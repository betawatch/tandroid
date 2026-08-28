package bg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements xb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ f(long j10, Calendar calendar, int i9, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = calendar;
        this.d = i9;
    }

    @Override // org.telegram.ui.Components.xb0
    public final String g(int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i9 * 86400000) + this.b;
                Calendar calendar = this.c;
                calendar.setTimeInMillis(j10);
                return calendar.get(1) == this.d ? LocaleController.getInstance().getFormatterScheduleDay().format(j10) : LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j11 = (i9 * 86400000) + this.b;
                Calendar calendar2 = this.c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) != this.d) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
                }
                return LocaleController.getInstance().getFormatterWeek().format(j11) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j11);
        }
    }
}
