package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes2.dex */
final class r {
    private j$.time.temporal.o a;
    private DateTimeFormatter b;
    private int c;

    r(j$.time.temporal.o oVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l b = dateTimeFormatter.b();
        if (b != null) {
            j$.time.chrono.l lVar = (j$.time.chrono.l) oVar.u(j$.time.temporal.n.e());
            ZoneId zoneId = (ZoneId) oVar.u(j$.time.temporal.n.k());
            j$.time.chrono.b bVar = null;
            b = Objects.equals(b, lVar) ? null : b;
            Objects.equals(null, zoneId);
            if (b != null) {
                j$.time.chrono.l lVar2 = b != null ? b : lVar;
                if (b != null) {
                    if (oVar.f(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = lVar2.k(oVar);
                    } else if (b != j$.time.chrono.s.d || lVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.u() && oVar.f(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + oVar);
                            }
                        }
                    }
                }
                oVar = new q(bVar, oVar, lVar2, zoneId);
            }
        }
        this.a = oVar;
        this.b = dateTimeFormatter;
    }

    final j$.time.temporal.o d() {
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

    final Object f(j$.time.temporal.t tVar) {
        j$.time.temporal.o oVar = this.a;
        Object u = oVar.u(tVar);
        if (u != null || this.c != 0) {
            return u;
        }
        throw new j$.time.c("Unable to extract " + tVar + " from temporal " + oVar);
    }

    final Long e(j$.time.temporal.r rVar) {
        int i = this.c;
        j$.time.temporal.o oVar = this.a;
        if (i <= 0 || oVar.f(rVar)) {
            return Long.valueOf(oVar.r(rVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
