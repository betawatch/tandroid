package j$.time.chrono;

import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public interface b extends Temporal, j$.time.temporal.m, Comparable {
    ChronoLocalDateTime A(j$.time.j jVar);

    /* renamed from: D */
    int compareTo(b bVar);

    a a();

    @Override // j$.time.temporal.Temporal
    b c(long j, j$.time.temporal.o oVar);

    @Override // j$.time.temporal.Temporal
    b d(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.l
    boolean e(j$.time.temporal.o oVar);

    @Override // j$.time.temporal.Temporal
    long g(Temporal temporal, j$.time.temporal.q qVar);

    int hashCode();

    b s(long j, j$.time.temporal.q qVar);

    String toString();

    long z();
}
