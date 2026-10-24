package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h20 implements org.telegram.ui.Components.md0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ h20(long j10, Calendar calendar, int i10, int i11) {
        this.a = i11;
        this.b = j10;
        this.c = calendar;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.md0
    public final String e(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.b;
                Calendar calendar = this.c;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) != this.d) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
                }
                return LocaleController.getInstance().getFormatterWeek().format(j10) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j11 = (i10 * 86400000) + this.b;
                Calendar calendar2 = this.c;
                calendar2.setTimeInMillis(j11);
                return calendar2.get(1) == this.d ? LocaleController.getInstance().getFormatterScheduleDay().format(j11) : LocaleController.getInstance().getFormatterScheduleYear().format(j11);
        }
    }
}
