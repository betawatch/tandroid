package j$.time.chrono;

import j$.time.temporal.j;
import j$.time.temporal.p;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static int a(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.a aVar) {
        if (!(aVar instanceof j$.time.temporal.a)) {
            return j.a(chronoZonedDateTime, aVar);
        }
        int i = d.a[aVar.ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.e().j(aVar) : chronoZonedDateTime.c().getTotalSeconds();
        }
        throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }
}
