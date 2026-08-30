package o4;

import android.net.Uri;
import j3.c1;
import j3.e1;
import j3.m2;
import j3.n2;
import j3.o2;
import j3.w0;
import j3.x0;
import j3.y0;
import j3.z0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r0 extends o2 {
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
    public final c1 w;
    public final x0 x;

    static {
        j3.s0 s0Var = new j3.s0();
        j3.v0 v0Var = new j3.v0();
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var = s8.i0.e;
        z0 z0Var = z0.c;
        Uri uri = Uri.EMPTY;
        h5.a.i(v0Var.b == null || v0Var.a != null);
        if (uri != null) {
            new y0(uri, null, v0Var.a != null ? new w0(v0Var) : null, null, list, null, i0Var, null);
        }
        new j3.u0(s0Var);
        e1 e1Var = e1.V;
    }

    public r0(long j10, long j11, long j12, long j13, long j14, long j15, boolean z4, boolean z10, boolean z11, t4.c cVar, c1 c1Var, x0 x0Var) {
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
        this.f = j14;
        this.h = j15;
        this.n = z4;
        this.r = z10;
        this.s = z11;
        this.v = cVar;
        c1Var.getClass();
        this.w = c1Var;
        this.x = x0Var;
    }

    @Override // j3.o2
    public final int b(Object obj) {
        return y.equals(obj) ? 0 : -1;
    }

    @Override // j3.o2
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        h5.a.h(i10, 1);
        Object obj = z4 ? y : null;
        long j10 = -this.f;
        m2Var.getClass();
        m2Var.i(null, obj, 0, this.d, j10, p4.b.f, false);
        return m2Var;
    }

    @Override // j3.o2
    public final int h() {
        return 1;
    }

    @Override // j3.o2
    public final Object l(int i10) {
        h5.a.h(i10, 1);
        return y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // j3.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n2 m(int i10, n2 n2Var, long j10) {
        long j11;
        h5.a.h(i10, 1);
        long j12 = this.h;
        boolean z4 = this.r;
        if (z4 && !this.s && j10 != 0) {
            long j13 = this.e;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
            }
            j11 = -9223372036854775807L;
            n2Var.b(n2.E, this.w, this.v, this.b, this.c, -9223372036854775807L, this.n, z4, this.x, j11, this.e, 0, 0, this.f);
            return n2Var;
        }
        j11 = j12;
        n2Var.b(n2.E, this.w, this.v, this.b, this.c, -9223372036854775807L, this.n, z4, this.x, j11, this.e, 0, 0, this.f);
        return n2Var;
    }

    @Override // j3.o2
    public final int o() {
        return 1;
    }
}
