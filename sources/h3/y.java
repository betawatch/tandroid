package h3;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.mk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements d5.k, mk0, bc0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ y(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        MessagesController.getInstance(this.b).performLogout(1);
    }

    @Override // org.telegram.ui.Components.bc0
    public String g(int i10) {
        int i11 = this.a;
        int i12 = this.b;
        switch (i11) {
            case 3:
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

    @Override // d5.k
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((a2) obj).onRepeatModeChanged(this.b);
                break;
            default:
                i3.b bVar = (i3.b) obj;
                bVar.getClass();
                bVar.e(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mk0
    public int run() {
        return this.b;
    }

    public /* synthetic */ y(i3.a aVar, int i10, b2 b2Var, b2 b2Var2) {
        this.a = 1;
        this.b = i10;
    }
}
