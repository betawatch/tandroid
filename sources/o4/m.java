package o4;

import f5.d0;
import j3.t0;
import j3.u0;
import l4.c1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m implements c1 {
    public final t0 a;
    public long[] c;
    public boolean d;
    public p4.g e;
    public boolean f;
    public int h;
    public final ze.b b = new ze.b(19, false);
    public long n = -9223372036854775807L;

    public m(p4.g gVar, t0 t0Var, boolean z10) {
        this.a = t0Var;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z10);
    }

    public final void b(p4.g gVar, boolean z10) {
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
                this.h = d0.b(jArr, j11, false);
            }
        } else {
            int b10 = d0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j10 = j12;
            }
            this.n = j10;
        }
    }

    @Override // l4.c1
    public final int d(u0 u0Var, m3.i iVar, int i10) {
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
            byte[] E = this.b.E(this.e.a[i11]);
            iVar.b(E.length);
            iVar.b.put(E);
        }
        iVar.d = this.c[i11];
        iVar.setFlags(1);
        return -4;
    }

    @Override // l4.c1
    public final boolean e() {
        return true;
    }

    @Override // l4.c1
    public final int i(long j10) {
        int max = Math.max(this.h, d0.b(this.c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override // l4.c1
    public final void a() {
    }
}
