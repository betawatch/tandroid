package j$.time.chrono;

import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface b extends Temporal, j$.time.temporal.m, Comparable {
    b D(long j, j$.time.temporal.q qVar);

    /* renamed from: F */
    int compareTo(b bVar);

    k b();

    @Override // j$.time.temporal.Temporal
    b e(long j, j$.time.temporal.o oVar);

    @Override // j$.time.temporal.Temporal
    b f(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.Temporal
    long g(Temporal temporal, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.l
    boolean h(j$.time.temporal.o oVar);

    int hashCode();

    String toString();

    long v();

    ChronoLocalDateTime w(j$.time.h hVar);
}
