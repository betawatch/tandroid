package gg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tc0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements tc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ c(long j10, Calendar calendar, int i10, int i11) {
        this.a = i11;
        this.b = j10;
        this.c = calendar;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.tc0
    public final String e(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.b;
                Calendar calendar = this.c;
                calendar.setTimeInMillis(j10);
                return calendar.get(1) == this.d ? LocaleController.getInstance().getFormatterScheduleDay().format(j10) : LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j11 = (i10 * 86400000) + this.b;
                Calendar calendar2 = this.c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) != this.d) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
                }
                return LocaleController.getInstance().getFormatterWeek().format(j11) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j11);
        }
    }
}
