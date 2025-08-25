package j$.time.chrono;

/* loaded from: classes2.dex */
public interface b extends j$.time.temporal.m, j$.time.temporal.p, Comparable {
    l a();

    @Override // j$.time.temporal.m
    b d(long j, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    b e(long j, j$.time.temporal.u uVar);

    @Override // j$.time.temporal.o
    boolean f(j$.time.temporal.r rVar);

    int hashCode();

    long s();

    ChronoLocalDateTime t(j$.time.j jVar);

    String toString();

    /* renamed from: y */
    int compareTo(b bVar);
}
