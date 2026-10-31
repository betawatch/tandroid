package mg;

import java.util.Calendar;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.wb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements wb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ d(long j10, Calendar calendar, int i10, int i11) {
        this.a = i11;
        this.b = j10;
        this.c = calendar;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.wb0
    public final String e(int i10) {
        int i11 = this.a;
        int i12 = this.d;
        Calendar calendar = this.c;
        long j10 = this.b;
        switch (i11) {
            case 0:
                if (i10 == 0) {
                    return cd.L0(2131748546, "MessageScheduleToday");
                }
                long j11 = (i10 * 86400000) + j10;
                calendar.setTimeInMillis(j11);
                return calendar.get(1) == i12 ? cd.D0().v0().format(j11) : cd.D0().x0().format(j11);
            default:
                if (i10 == 0) {
                    return cd.L0(2131748546, null);
                }
                long j12 = (i10 * 86400000) + j10;
                calendar.setTimeInMillis(j12);
                if (calendar.get(1) != i12) {
                    return cd.D0().x0().format(j12);
                }
                return cd.D0().z0().format(j12) + " " + cd.D0().v0().format(j12);
        }
    }
}
