package j$.time.chrono;

import j$.time.ZonedDateTime;
import j$.time.temporal.j;
import j$.time.temporal.p;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static int a(ZonedDateTime zonedDateTime, j$.time.temporal.a aVar) {
        if (aVar instanceof j$.time.temporal.a) {
            int i = d.a[aVar.ordinal()];
            if (i == 1) {
                throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return zonedDateTime.l().getTotalSeconds();
            }
            return zonedDateTime.d().h(aVar);
        }
        return j.a(zonedDateTime, aVar);
    }
}
