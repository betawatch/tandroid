// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class mj2 extends xo4 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public mj2(asb asbVar, long j, long j2, boolean z) {
        super(asbVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new nj2(j, 2, j2);
        }
        boolean z2 = false;
        if (asbVar.h() != 1) {
            throw new nj2(0);
        }
        zrb m = asbVar.m(0, new zrb(), 0L);
        long max = Math.max(0L, j);
        if (!z && !m.j && max != 0 && !m.g) {
            throw new nj2(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? m.l : Math.max(0L, j2);
        long j3 = m.l;
        if (j3 != -9223372036854775807L) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.f = max;
        this.g = max2;
        this.h = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m.h && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // xo4, asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        this.e.f(0, xrbVar, z);
        long j = xrbVar.e - this.f;
        long j2 = this.h;
        long j3 = j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L;
        Object obj = xrbVar.a;
        Object obj2 = xrbVar.b;
        ea eaVar = ea.c;
        xrbVar.h(obj, obj2, 0, j3, j, xrbVar.f);
        return xrbVar;
    }

    @Override // xo4, asb
    public final zrb m(int i, zrb zrbVar, long j) {
        this.e.m(0, zrbVar, 0L);
        long j2 = zrbVar.o;
        long j3 = this.f;
        zrbVar.o = j2 + j3;
        zrbVar.l = this.h;
        zrbVar.h = this.i;
        long j4 = zrbVar.k;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            zrbVar.k = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            zrbVar.k = max - j3;
        }
        long i0 = gcc.i0(j3);
        long j6 = zrbVar.d;
        if (j6 != -9223372036854775807L) {
            zrbVar.d = j6 + i0;
        }
        long j7 = zrbVar.e;
        if (j7 != -9223372036854775807L) {
            zrbVar.e = j7 + i0;
        }
        return zrbVar;
    }
}
