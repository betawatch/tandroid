package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.zone.ZoneRules;
import j$.util.A;
import java.util.Locale;

/* loaded from: classes2.dex */
final class r {
    private j$.time.temporal.k a;
    private DateTimeFormatter b;
    private int c;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    r(j$.time.temporal.k kVar, DateTimeFormatter dateTimeFormatter) {
        ZoneId zoneId;
        ZoneRules rules;
        j$.time.chrono.e b = dateTimeFormatter.b();
        ZoneId e = dateTimeFormatter.e();
        if (b != null || e != null) {
            j$.time.chrono.e eVar = (j$.time.chrono.e) kVar.i(j$.time.temporal.j.d());
            ZoneId zoneId2 = (ZoneId) kVar.i(j$.time.temporal.j.j());
            LocalDate localDate = null;
            b = A.y(b, eVar) ? null : b;
            e = A.y(e, zoneId2) ? null : e;
            if (b != null || e != null) {
                j$.time.chrono.e eVar2 = b != null ? b : eVar;
                if (e != null) {
                    if (kVar.k(j$.time.temporal.a.INSTANT_SECONDS)) {
                        eVar2 = eVar2 == null ? j$.time.chrono.f.a : eVar2;
                        Instant o = Instant.o(kVar);
                        ((j$.time.chrono.f) eVar2).getClass();
                        kVar = ZonedDateTime.o(o, e);
                    } else {
                        try {
                            rules = e.getRules();
                        } catch (j$.time.zone.c unused) {
                        }
                        if (rules.h()) {
                            zoneId = rules.getOffset(Instant.c);
                            if (zoneId instanceof ZoneOffset) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                if (kVar.k(aVar) && kVar.j(aVar) != e.getRules().getOffset(Instant.c).getTotalSeconds()) {
                                    throw new j$.time.c("Unable to apply override zone '" + e + "' because the temporal object being formatted has a different offset but does not represent an instant: " + kVar);
                                }
                            }
                        }
                        zoneId = e;
                        if (zoneId instanceof ZoneOffset) {
                        }
                    }
                }
                zoneId2 = e != null ? e : zoneId2;
                if (b != null) {
                    if (kVar.k(j$.time.temporal.a.EPOCH_DAY)) {
                        ((j$.time.chrono.f) eVar2).getClass();
                        localDate = LocalDate.o(kVar);
                    } else if (b != j$.time.chrono.f.a || eVar != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.k() && kVar.k(aVar2)) {
                                throw new j$.time.c("Unable to apply override chronology '" + b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + kVar);
                            }
                        }
                    }
                }
                kVar = new q(localDate, kVar, eVar2, zoneId2);
            }
        }
        this.a = kVar;
        this.b = dateTimeFormatter;
    }

    final void a() {
        this.c--;
    }

    final v b() {
        return this.b.c();
    }

    final Locale c() {
        return this.b.d();
    }

    final j$.time.temporal.k d() {
        return this.a;
    }

    final Long e(j$.time.temporal.l lVar) {
        try {
            return Long.valueOf(this.a.h(lVar));
        } catch (j$.time.c e) {
            if (this.c > 0) {
                return null;
            }
            throw e;
        }
    }

    final Object f(j$.time.temporal.n nVar) {
        j$.time.temporal.k kVar = this.a;
        Object i = kVar.i(nVar);
        if (i != null || this.c != 0) {
            return i;
        }
        throw new j$.time.c("Unable to extract value: " + kVar.getClass());
    }

    final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
