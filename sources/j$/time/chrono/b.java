package j$.time.chrono;

import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface b extends Temporal, j$.time.temporal.m, Comparable {
    ChronoLocalDateTime A(j$.time.h hVar);

    /* renamed from: E */
    int compareTo(b bVar);

    k a();

    @Override // j$.time.temporal.Temporal
    b c(long j10, j$.time.temporal.o oVar);

    @Override // j$.time.temporal.Temporal
    b d(long j10, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.l
    boolean e(j$.time.temporal.o oVar);

    @Override // j$.time.temporal.Temporal
    long g(Temporal temporal, j$.time.temporal.q qVar);

    int hashCode();

    b t(long j10, j$.time.temporal.q qVar);

    String toString();

    long z();
}
