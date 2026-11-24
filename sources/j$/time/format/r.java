package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class r {
    public final j$.time.temporal.l a;
    public final DateTimeFormatter b;
    public int c;

    public r(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.q qVar = dateTimeFormatter.d;
        if (qVar != null) {
            j$.time.chrono.a aVar = (j$.time.chrono.a) lVar.r(j$.time.temporal.p.b);
            ZoneId zoneId = (ZoneId) lVar.r(j$.time.temporal.p.a);
            j$.time.chrono.b bVar = null;
            qVar = Objects.equals(qVar, aVar) ? null : qVar;
            Objects.equals(null, zoneId);
            if (qVar != null) {
                if (qVar != null) {
                    if (lVar.e(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = qVar.j(lVar);
                    } else if (qVar != j$.time.chrono.q.c || aVar != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.isDateBased() && lVar.e(aVar2)) {
                                throw new j$.time.c("Unable to apply override chronology '" + qVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                            }
                        }
                    }
                }
                lVar = new q(bVar, lVar, qVar, zoneId);
            }
        }
        this.a = lVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.o oVar) {
        int i = this.c;
        j$.time.temporal.l lVar = this.a;
        if (i <= 0 || lVar.e(oVar)) {
            return Long.valueOf(lVar.y(oVar));
        }
        return null;
    }

    public final Object b(a aVar) {
        j$.time.temporal.l lVar = this.a;
        Object r = lVar.r(aVar);
        if (r != null || this.c != 0) {
            return r;
        }
        throw new j$.time.c("Unable to extract " + aVar + " from temporal " + lVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}
