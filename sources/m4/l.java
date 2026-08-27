package m4;

import d5.g0;
import h3.t0;
import h3.u0;
import j4.b1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements b1 {
    public final t0 a;
    public long[] c;
    public boolean d;
    public n4.g e;
    public boolean f;
    public int h;
    public final xe.b b = new xe.b(7, (byte) 0);
    public long n = -9223372036854775807L;

    public l(n4.g gVar, t0 t0Var, boolean z10) {
        this.a = t0Var;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z10);
    }

    public final void b(n4.g gVar, boolean z10) {
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        long j11 = i10 == 0 ? -9223372036854775807L : this.c[i10 - 1];
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.b;
        this.c = jArr;
        long j12 = this.n;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.h = g0.b(jArr, j11, false);
            }
        } else {
            int b10 = g0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j10 = j12;
            }
            this.n = j10;
        }
    }

    @Override // j4.b1
    public final boolean e() {
        return true;
    }

    @Override // j4.b1
    public final int f(long j10) {
        int max = Math.max(this.h, g0.b(this.c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override // j4.b1
    public final int i(u0 u0Var, k3.i iVar, int i10) {
        int i11 = this.h;
        boolean z10 = i11 == this.c.length;
        if (z10 && !this.d) {
            iVar.setFlags(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f) {
            u0Var.b = this.a;
            this.f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.h = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] A = this.b.A(this.e.a[i11]);
            iVar.b(A.length);
            iVar.b.put(A);
        }
        iVar.d = this.c[i11];
        iVar.setFlags(1);
        return -4;
    }

    @Override // j4.b1
    public final void a() {
    }
}
