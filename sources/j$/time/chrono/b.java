package j$.time.chrono;

import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface b extends Temporal, j$.time.temporal.n, Comparable {
    b E(long j, j$.time.temporal.s sVar);

    /* renamed from: F */
    int compareTo(b bVar);

    l a();

    @Override // j$.time.temporal.Temporal
    b d(long j, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.Temporal
    b e(long j, j$.time.temporal.s sVar);

    @Override // j$.time.temporal.Temporal
    long f(Temporal temporal, j$.time.temporal.s sVar);

    @Override // j$.time.temporal.m
    boolean g(j$.time.temporal.p pVar);

    int hashCode();

    long t();

    String toString();

    ChronoLocalDateTime u(j$.time.j jVar);
}
