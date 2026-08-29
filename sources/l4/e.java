package l4;

import j3.p2;
import j3.q2;
import j3.r2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends n {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public e(r2 r2Var, long j10, long j11) {
        super(r2Var);
        boolean z10 = false;
        if (r2Var.h() != 1) {
            throw new f(0);
        }
        q2 m10 = r2Var.m(0, new q2(), 0L);
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

    @Override // l4.n, j3.r2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.b.f(0, p2Var, z10);
        long j10 = p2Var.e - this.c;
        long j11 = this.e;
        p2Var.h(p2Var.a, p2Var.b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, m4.c.f, false);
        return p2Var;
    }

    @Override // l4.n, j3.r2
    public final q2 m(int i10, q2 q2Var, long j10) {
        this.b.m(0, q2Var, 0L);
        long j11 = q2Var.C;
        long j12 = this.c;
        q2Var.C = j11 + j12;
        q2Var.y = this.e;
        q2Var.r = this.f;
        long j13 = q2Var.x;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            q2Var.x = max;
            long j14 = this.d;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            q2Var.x = max - j12;
        }
        long S = f5.d0.S(j12);
        long j15 = q2Var.e;
        if (j15 != -9223372036854775807L) {
            q2Var.e = j15 + S;
        }
        long j16 = q2Var.f;
        if (j16 != -9223372036854775807L) {
            q2Var.f = j16 + S;
        }
        return q2Var;
    }
}
