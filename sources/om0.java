// default package

import java.util.Calendar;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class om0 implements dn7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ om0(long j, Calendar calendar, int i, byte b) {
        this.a = b;
        this.b = j;
        this.c = calendar;
        this.d = i;
    }

    @Override // dn7
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.d;
        Calendar calendar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return k96.M0(2131748339, "MessageScheduleToday");
                }
                long j2 = (i * 86400000) + j;
                calendar.setTimeInMillis(j2);
                return calendar.get(1) == i2 ? k96.D0().v0().format(j2) : k96.D0().x0().format(j2);
            default:
                if (i == 0) {
                    return k96.M0(2131748339, null);
                }
                long j3 = (i * 86400000) + j;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) != i2) {
                    return k96.D0().x0().format(j3);
                }
                return k96.D0().z0().format(j3) + " " + k96.D0().v0().format(j3);
        }
    }
}
