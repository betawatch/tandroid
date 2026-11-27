package j$.time.chrono;

import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
