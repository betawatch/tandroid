// default package

import android.util.Pair;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class og7 implements ez9 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public og7(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? gcc.T(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair i(long j, long[] jArr, long[] jArr2) {
        int f = gcc.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // ez9
    public final long a() {
        return -1L;
    }

    @Override // ez9
    public final long b() {
        return 0L;
    }

    @Override // zy9
    public final boolean c() {
        return true;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        Pair i = i(gcc.i0(gcc.j(j, 0L, this.c)), this.b, this.a);
        bz9 bz9Var = new bz9(gcc.T(((Long) i.first).longValue()), ((Long) i.second).longValue());
        return new yy9(bz9Var, bz9Var);
    }

    @Override // ez9
    public final long f(long j) {
        return gcc.T(((Long) i(j, this.a, this.b).second).longValue());
    }

    @Override // ez9
    public final int g() {
        return -2147483647;
    }

    @Override // zy9
    public final long h() {
        return this.c;
    }
}
