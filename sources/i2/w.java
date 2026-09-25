package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.hl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements e2.m, d9.e, e2.h, hl0, ad0, z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ w(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((m4.e1) obj).f0(this.b);
                break;
            case 4:
                ((m4.e1) obj).N(this.b);
                break;
            case 5:
                ((m4.e1) obj).j(this.b);
                break;
            default:
                ((m4.e1) obj).D0(this.b);
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
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

    @Override // org.telegram.ui.Components.ad0
    public String j(int i10) {
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

    @Override // org.telegram.ui.Components.hl0
    public int run() {
        return this.b;
    }
}
