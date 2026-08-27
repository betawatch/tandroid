package j4;

import h3.p2;
import h3.r2;
import h3.s2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends n {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public e(s2 s2Var, long j10, long j11) {
        super(s2Var);
        boolean z10 = false;
        if (s2Var.h() != 1) {
            throw new f(0);
        }
        r2 m10 = s2Var.m(0, new r2(), 0L);
        long max = Math.max(0L, j10);
        if (!m10.w && max != 0 && !m10.n) {
            throw new f(1);
        }
        long max2 = j11 == Long.MIN_VALUE ? m10.y : Math.max(0L, j11);
        long j12 = m10.y;
        if (j12 != -9223372036854775807L) {
            max2 = max2 > j12 ? j12 : max2;
            if (max > max2) {
                throw new f(2);
            }
        }
        this.c = max;
        this.d = max2;
        this.e = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
        if (m10.r && (max2 == -9223372036854775807L || (j12 != -9223372036854775807L && max2 == j12))) {
            z10 = true;
        }
        this.f = z10;
    }

    @Override // j4.n, h3.s2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.b.f(0, p2Var, z10);
        long j10 = p2Var.e - this.c;
        long j11 = this.e;
        p2Var.h(p2Var.a, p2Var.b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, k4.b.f, false);
        return p2Var;
    }

    @Override // j4.n, h3.s2
    public final r2 m(int i10, r2 r2Var, long j10) {
        this.b.m(0, r2Var, 0L);
        long j11 = r2Var.C;
        long j12 = this.c;
        r2Var.C = j11 + j12;
        r2Var.y = this.e;
        r2Var.r = this.f;
        long j13 = r2Var.x;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            r2Var.x = max;
            long j14 = this.d;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            r2Var.x = max - j12;
        }
        long S = d5.g0.S(j12);
        long j15 = r2Var.e;
        if (j15 != -9223372036854775807L) {
            r2Var.e = j15 + S;
        }
        long j16 = r2Var.f;
        if (j16 != -9223372036854775807L) {
            r2Var.f = j16 + S;
        }
        return r2Var;
    }
}
