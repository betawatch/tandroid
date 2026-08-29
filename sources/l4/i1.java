package l4;

import android.net.Uri;
import j3.p2;
import j3.q2;
import j3.r2;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i1 extends r2 {
    public static final Object y = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long h;
    public final boolean n;
    public final boolean r;
    public final boolean s;
    public final Object v;
    public final j3.f1 w;
    public final j3.b1 x;

    static {
        j3.x0 x0Var = new j3.x0();
        q8.x xVar = q8.z.b;
        q8.l0 l0Var = q8.l0.e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.e;
        j3.d1 d1Var = j3.d1.c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new j3.c1(uri, null, null, list, null, l0Var2, null);
        }
        new j3.z0(x0Var);
        j3.h1 h1Var = j3.h1.U;
    }

    public i1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, q4.c cVar, j3.f1 f1Var, j3.b1 b1Var) {
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
        this.f = j14;
        this.h = j15;
        this.n = z10;
        this.r = z11;
        this.s = z12;
        this.v = cVar;
        f1Var.getClass();
        this.w = f1Var;
        this.x = b1Var;
    }

    @Override // j3.r2
    public final int b(Object obj) {
        return y.equals(obj) ? 0 : -1;
    }

    @Override // j3.r2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        f5.a.h(i10, 1);
        Object obj = z10 ? y : null;
        long j10 = -this.f;
        p2Var.getClass();
        p2Var.h(null, obj, 0, this.d, j10, m4.c.f, false);
        return p2Var;
    }

    @Override // j3.r2
    public final int h() {
        return 1;
    }

    @Override // j3.r2
    public final Object l(int i10) {
        f5.a.h(i10, 1);
        return y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // j3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q2 m(int i10, q2 q2Var, long j10) {
        long j11;
        f5.a.h(i10, 1);
        long j12 = this.h;
        boolean z10 = this.r;
        if (z10 && !this.s && j10 != 0) {
            long j13 = this.e;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
            }
            j11 = -9223372036854775807L;
            q2Var.b(q2.D, this.w, this.v, this.b, this.c, -9223372036854775807L, this.n, z10, this.x, j11, this.e, 0, 0, this.f);
            return q2Var;
        }
        j11 = j12;
        q2Var.b(q2.D, this.w, this.v, this.b, this.c, -9223372036854775807L, this.n, z10, this.x, j11, this.e, 0, 0, this.f);
        return q2Var;
    }

    @Override // j3.r2
    public final int o() {
        return 1;
    }
}
