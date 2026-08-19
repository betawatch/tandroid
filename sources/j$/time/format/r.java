package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class r {
    public final j$.time.temporal.l a;
    public final DateTimeFormatter b;
    public int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.time.chrono.k, java.lang.Object] */
    public r(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.r rVar = dateTimeFormatter.d;
        if (rVar != null) {
            ?? r1 = (j$.time.chrono.k) lVar.r(j$.time.temporal.p.b);
            ZoneId zoneId = (ZoneId) lVar.r(j$.time.temporal.p.a);
            j$.time.chrono.b bVar = null;
            rVar = Objects.equals(rVar, r1) ? null : rVar;
            Objects.equals(null, zoneId);
            if (rVar != null) {
                j$.time.chrono.r rVar2 = rVar != null ? rVar : r1;
                if (rVar != null) {
                    if (lVar.h(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = rVar2.a(lVar);
                    } else if (rVar != j$.time.chrono.r.c || r1 != 0) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.u() && lVar.h(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + rVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                            }
                        }
                    }
                }
                lVar = new q(bVar, lVar, rVar2, zoneId);
            }
        }
        this.a = lVar;
        this.b = dateTimeFormatter;
    }

    public final Object b(a aVar) {
        j$.time.temporal.l lVar = this.a;
        Object r = lVar.r(aVar);
        if (r != null || this.c != 0) {
            return r;
        }
        throw new j$.time.b("Unable to extract " + aVar + " from temporal " + lVar);
    }

    public final Long a(j$.time.temporal.o oVar) {
        int i = this.c;
        j$.time.temporal.l lVar = this.a;
        if (i <= 0 || lVar.h(oVar)) {
            return Long.valueOf(lVar.u(oVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
