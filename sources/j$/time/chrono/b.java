package j$.time.chrono;

import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
