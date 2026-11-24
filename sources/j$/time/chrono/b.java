package j$.time.chrono;

import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
