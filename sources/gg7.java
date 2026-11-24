// default package

import android.util.Pair;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gg7 implements nx9 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public gg7(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? hac.T(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair i(long j, long[] jArr, long[] jArr2) {
        int f = hac.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // nx9
    public final long a() {
        return -1L;
    }

    @Override // nx9
    public final long b() {
        return 0L;
    }

    @Override // ix9
    public final boolean c() {
        return true;
    }

    @Override // ix9
    public final boolean d() {
        return false;
    }

    @Override // nx9
    public final long e(long j) {
        return hac.T(((Long) i(j, this.a, this.b).second).longValue());
    }

    @Override // ix9
    public final hx9 f(long j) {
        Pair i = i(hac.i0(hac.j(j, 0L, this.c)), this.b, this.a);
        kx9 kx9Var = new kx9(hac.T(((Long) i.first).longValue()), ((Long) i.second).longValue());
        return new hx9(kx9Var, kx9Var);
    }

    @Override // nx9
    public final int g() {
        return -2147483647;
    }

    @Override // ix9
    public final long h() {
        return this.c;
    }
}
