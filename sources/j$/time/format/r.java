package j$.time.format;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.util.A;
import java.util.Locale;

/* loaded from: classes2.dex */
final class r {
    private j$.time.temporal.k a;
    private DateTimeFormatter b;
    private int c;

    r(j$.time.temporal.k kVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.e b = dateTimeFormatter.b();
        if (b != null) {
            j$.time.chrono.e eVar = (j$.time.chrono.e) kVar.g(j$.time.temporal.j.d());
            ZoneId zoneId = (ZoneId) kVar.g(j$.time.temporal.j.j());
            LocalDate localDate = null;
            b = A.y(b, eVar) ? null : b;
            A.y(null, zoneId);
            if (b != null) {
                j$.time.chrono.e eVar2 = b != null ? b : eVar;
                if (b != null) {
                    if (kVar.j(j$.time.temporal.a.EPOCH_DAY)) {
                        ((j$.time.chrono.f) eVar2).getClass();
                        localDate = LocalDate.n(kVar);
                    } else if (b != j$.time.chrono.f.a || eVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.h() && kVar.j(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + kVar);
                            }
                        }
                    }
                }
                kVar = new q(localDate, kVar, eVar2, zoneId);
            }
        }
        this.a = kVar;
        this.b = dateTimeFormatter;
    }

    final j$.time.temporal.k d() {
        return this.a;
    }

    final Locale c() {
        return this.b.d();
    }

    final v b() {
        return this.b.c();
    }

    final void g() {
        this.c++;
    }

    final void a() {
        this.c--;
    }

    final Object f(j$.time.temporal.n nVar) {
        j$.time.temporal.k kVar = this.a;
        Object g = kVar.g(nVar);
        if (g != null || this.c != 0) {
            return g;
        }
        throw new j$.time.c("Unable to extract value: " + kVar.getClass());
    }

    final Long e(j$.time.temporal.l lVar) {
        try {
            return Long.valueOf(this.a.f(lVar));
        } catch (j$.time.c e) {
            if (this.c > 0) {
                return null;
            }
            throw e;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
