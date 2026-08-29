package j3;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements f5.j, wk0, mc0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ x(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
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

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        MessagesController.getInstance(this.b).performLogout(1);
    }

    @Override // f5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((a2) obj).onRepeatModeChanged(this.b);
                break;
            default:
                k3.b bVar = (k3.b) obj;
                bVar.getClass();
                bVar.e(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        return this.b;
    }

    public /* synthetic */ x(k3.a aVar, int i10, b2 b2Var, b2 b2Var2) {
        this.a = 1;
        this.b = i10;
    }
}
