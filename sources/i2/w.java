package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.xl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements e2.o, e9.k, e2.j, xl0, jd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ w(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((m4.n1) obj).g0(this.b);
                break;
            case 4:
                ((m4.n1) obj).M(this.b);
                break;
            case 5:
                ((m4.n1) obj).j(this.b);
                break;
            default:
                ((m4.n1) obj).G0(this.b);
                break;
        }
    }

    @Override // e9.k
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.Components.jd0
    public String f(int i10) {
        int i11 = this.a;
        int i12 = this.b;
        switch (i11) {
            case 8:
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

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.e1) obj).onRepeatModeChanged(this.b);
                break;
            default:
                ((b2.e1) obj).onAudioSessionIdChanged(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        return this.b;
    }
}
