package h3;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.xb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements d5.k, jk0, xb0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ x(int i9, int i10) {
        this.a = i10;
        this.b = i9;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        MessagesController.getInstance(this.b).performLogout(1);
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 3:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i9);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i11) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
            default:
                return i9 == i11 ? "—" : String.format("%02d", Integer.valueOf(i9));
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

    @Override // org.telegram.ui.Components.jk0
    public int run() {
        return this.b;
    }

    public /* synthetic */ x(i3.a aVar, int i9, b2 b2Var, b2 b2Var2) {
        this.a = 1;
        this.b = i9;
    }
}
