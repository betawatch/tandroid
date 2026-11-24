// default package

import java.util.Calendar;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class on0 implements hp7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ on0(long j, Calendar calendar, int i, byte b) {
        this.a = b;
        this.b = j;
        this.c = calendar;
        this.d = i;
    }

    @Override // hp7
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.d;
        Calendar calendar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return jb6.M0(2131748288, "MessageScheduleToday");
                }
                long j2 = (i * 86400000) + j;
                calendar.setTimeInMillis(j2);
                return calendar.get(1) == i2 ? jb6.D0().v0().format(j2) : jb6.D0().x0().format(j2);
            default:
                if (i == 0) {
                    return jb6.M0(2131748288, null);
                }
                long j3 = (i * 86400000) + j;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) != i2) {
                    return jb6.D0().x0().format(j3);
                }
                return jb6.D0().z0().format(j3) + " " + jb6.D0().v0().format(j3);
        }
    }
}
