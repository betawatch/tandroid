package j4;

import android.net.Uri;
import h3.p2;
import h3.r2;
import h3.s2;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h1 extends s2 {
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
        p8.x xVar = p8.z.b;
        p8.l0 l0Var = p8.l0.e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.e;
        h3.d1 d1Var = h3.d1.c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new h3.c1(uri, null, list, l0Var2);
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

    @Override // h3.s2
    public final int b(Object obj) {
        return y.equals(obj) ? 0 : -1;
    }

    @Override // h3.s2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        d5.a.h(i10, 1);
        Object obj = z10 ? y : null;
        long j10 = -this.f;
        p2Var.getClass();
        p2Var.h(null, obj, 0, this.d, j10, k4.b.f, false);
        return p2Var;
    }

    @Override // h3.s2
    public final int h() {
        return 1;
    }

    @Override // h3.s2
    public final Object l(int i10) {
        d5.a.h(i10, 1);
        return y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // h3.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r2 m(int i10, r2 r2Var, long j10) {
        long j11;
        d5.a.h(i10, 1);
        long j12 = this.h;
        boolean z10 = this.r;
        if (z10 && !this.s && j10 != 0) {
            long j13 = this.e;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
            }
            j11 = -9223372036854775807L;
            r2Var.b(r2.D, this.w, this.v, this.b, this.c, -9223372036854775807L, this.n, z10, this.x, j11, this.e, 0, 0, this.f);
            return r2Var;
        }
        j11 = j12;
        r2Var.b(r2.D, this.w, this.v, this.b, this.c, -9223372036854775807L, this.n, z10, this.x, j11, this.e, 0, 0, this.f);
        return r2Var;
    }

    @Override // h3.s2
    public final int o() {
        return 1;
    }
}
