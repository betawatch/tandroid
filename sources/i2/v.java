package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.xk0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements e2.m, d9.e, xk0, qc0, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ v(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        int i11 = this.a;
        int i12 = this.b;
        switch (i11) {
            case 4:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i10);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i12) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
            default:
                return i10 == i12 ? "—" : String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i10) {
        MessagesController.getInstance(this.b).performLogout(1);
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.z0) obj).onRepeatModeChanged(this.b);
                break;
            default:
                ((b2.z0) obj).onAudioSessionIdChanged(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.xk0
    public int run() {
        return this.b;
    }
}
