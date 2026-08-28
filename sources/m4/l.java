package m4;

import d5.f0;
import h3.t0;
import h3.u0;
import j4.b1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements b1 {
    public final t0 a;
    public long[] c;
    public boolean d;
    public n4.g e;
    public boolean f;
    public int h;
    public final we.b b = new we.b(6, (byte) 0);
    public long n = -9223372036854775807L;

    public l(n4.g gVar, t0 t0Var, boolean z10) {
        this.a = t0Var;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z10);
    }

    public final void b(n4.g gVar, boolean z10) {
        int i9 = this.h;
        long j10 = -9223372036854775807L;
        long j11 = i9 == 0 ? -9223372036854775807L : this.c[i9 - 1];
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.b;
        this.c = jArr;
        long j12 = this.n;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.h = f0.b(jArr, j11, false);
            }
        } else {
            int b10 = f0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j10 = j12;
            }
            this.n = j10;
        }
    }

    @Override // j4.b1
    public final boolean f() {
        return true;
    }

    @Override // j4.b1
    public final int j(long j10) {
        int max = Math.max(this.h, f0.b(this.c, j10, true));
        int i9 = max - this.h;
        this.h = max;
        return i9;
    }

    @Override // j4.b1
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        int i10 = this.h;
        boolean z10 = i10 == this.c.length;
        if (z10 && !this.d) {
            iVar.setFlags(4);
            return -4;
        }
        if ((i9 & 2) != 0 || !this.f) {
            u0Var.b = this.a;
            this.f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i9 & 1) == 0) {
            this.h = i10 + 1;
        }
        if ((i9 & 4) == 0) {
            byte[] A = this.b.A(this.e.a[i10]);
            iVar.c(A.length);
            iVar.b.put(A);
        }
        iVar.d = this.c[i10];
        iVar.setFlags(1);
        return -4;
    }

    @Override // j4.b1
    public final void a() {
    }
}
