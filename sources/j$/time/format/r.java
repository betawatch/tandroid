package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes2.dex */
final class r {
    private j$.time.temporal.m a;
    private DateTimeFormatter b;
    private int c;

    r(j$.time.temporal.m mVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l b = dateTimeFormatter.b();
        if (b != null) {
            j$.time.chrono.l lVar = (j$.time.chrono.l) mVar.v(j$.time.temporal.l.e());
            ZoneId zoneId = (ZoneId) mVar.v(j$.time.temporal.l.k());
            j$.time.chrono.b bVar = null;
            b = Objects.equals(b, lVar) ? null : b;
            Objects.equals(null, zoneId);
            if (b != null) {
                j$.time.chrono.l lVar2 = b != null ? b : lVar;
                if (b != null) {
                    if (mVar.g(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = lVar2.m(mVar);
                    } else if (b != j$.time.chrono.s.d || lVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.v() && mVar.g(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + mVar);
                            }
                        }
                    }
                }
                mVar = new q(bVar, mVar, lVar2, zoneId);
            }
        }
        this.a = mVar;
        this.b = dateTimeFormatter;
    }

    final j$.time.temporal.m d() {
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

    final Object f(j$.time.temporal.r rVar) {
        j$.time.temporal.m mVar = this.a;
        Object v = mVar.v(rVar);
        if (v != null || this.c != 0) {
            return v;
        }
        throw new j$.time.c("Unable to extract " + rVar + " from temporal " + mVar);
    }

    final Long e(j$.time.temporal.p pVar) {
        int i = this.c;
        j$.time.temporal.m mVar = this.a;
        if (i <= 0 || mVar.g(pVar)) {
            return Long.valueOf(mVar.r(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
