package j4;

import android.net.Uri;
import h3.p2;
import h3.q2;
import h3.r2;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h1 extends r2 {
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
    public final h3.f1 w;
    public final h3.b1 x;

    static {
        h3.x0 x0Var = new h3.x0();
        o8.x xVar = o8.z.b;
        o8.l0 l0Var = o8.l0.e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.e;
        h3.d1 d1Var = h3.d1.c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new h3.c1(uri, null, null, list, null, l0Var2, null);
        }
        new h3.z0(x0Var);
        h3.h1 h1Var = h3.h1.U;
    }

    public h1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, o4.c cVar, h3.f1 f1Var, h3.b1 b1Var) {
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

    @Override // h3.r2
    public final int b(Object obj) {
        return y.equals(obj) ? 0 : -1;
    }

    @Override // h3.r2
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        d5.a.h(i9, 1);
        Object obj = z10 ? y : null;
        long j10 = -this.f;
        p2Var.getClass();
        p2Var.h(null, obj, 0, this.d, j10, k4.b.f, false);
        return p2Var;
    }

    @Override // h3.r2
    public final int h() {
        return 1;
    }

    @Override // h3.r2
    public final Object l(int i9) {
        d5.a.h(i9, 1);
        return y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // h3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q2 m(int i9, q2 q2Var, long j10) {
        long j11;
        d5.a.h(i9, 1);
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

    @Override // h3.r2
    public final int o() {
        return 1;
    }
}
