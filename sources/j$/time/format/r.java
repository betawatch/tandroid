package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class r {
    public final j$.time.temporal.l a;
    public final DateTimeFormatter b;
    public int c;

    public r(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.k kVar = dateTimeFormatter.d;
        if (kVar != null) {
            j$.time.chrono.k kVar2 = (j$.time.chrono.k) lVar.m(j$.time.temporal.p.b);
            ZoneId zoneId = (ZoneId) lVar.m(j$.time.temporal.p.a);
            j$.time.chrono.b bVar = null;
            kVar = Objects.equals(kVar, kVar2) ? null : kVar;
            Objects.equals(null, zoneId);
            if (kVar != null) {
                j$.time.chrono.k kVar3 = kVar != null ? kVar : kVar2;
                if (kVar != null) {
                    if (lVar.e(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = kVar3.x(lVar);
                    } else if (kVar != j$.time.chrono.r.c || kVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && lVar.e(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + kVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                            }
                        }
                    }
                }
                lVar = new q(bVar, lVar, kVar3, zoneId);
            }
        }
        this.a = lVar;
        this.b = dateTimeFormatter;
    }

    public final Object b(a aVar) {
        j$.time.temporal.l lVar = this.a;
        Object m9 = lVar.m(aVar);
        if (m9 != null || this.c != 0) {
            return m9;
        }
        throw new j$.time.b("Unable to extract " + aVar + " from temporal " + lVar);
    }

    public final Long a(j$.time.temporal.o oVar) {
        int i10 = this.c;
        j$.time.temporal.l lVar = this.a;
        if (i10 <= 0 || lVar.e(oVar)) {
            return Long.valueOf(lVar.y(oVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
