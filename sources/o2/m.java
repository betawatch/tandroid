package o2;

import e2.u;
import h2.l0;
import x2.d1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class m implements d1 {
    public final u a;
    public long[] c;
    public boolean d;
    public p2.g e;
    public boolean f;
    public int h;
    public final jb.m b = new jb.m(25);
    public long n = -9223372036854775807L;

    public m(p2.g gVar, u uVar, boolean z10) {
        this.a = uVar;
        this.e = gVar;
        this.c = gVar.b;
        c(gVar, z10);
    }

    @Override // x2.d1
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        int i10 = this.h;
        boolean z10 = i10 == this.c.length;
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f) {
            mVar.c = this.a;
            this.f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.h = i10 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] g02 = this.b.g0(this.e.a[i10]);
            hVar.b(g02.length);
            hVar.c.put(g02);
        }
        hVar.e = this.c[i10];
        hVar.setFlags(1);
        return -4;
    }

    public final void c(p2.g gVar, boolean z10) {
        int i7 = this.h;
        long j3 = -9223372036854775807L;
        long j10 = i7 == 0 ? -9223372036854775807L : this.c[i7 - 1];
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.b;
        this.c = jArr;
        long j11 = this.n;
        if (j11 == -9223372036854775807L) {
            if (j10 != -9223372036854775807L) {
                this.h = l0.b(jArr, j10, false);
            }
        } else {
            int b10 = l0.b(jArr, j11, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j3 = j11;
            }
            this.n = j3;
        }
    }

    @Override // x2.d1
    public final boolean h() {
        return true;
    }

    @Override // x2.d1
    public final int o(long j3) {
        int max = Math.max(this.h, l0.b(this.c, j3, true));
        int i7 = max - this.h;
        this.h = max;
        return i7;
    }

    @Override // x2.d1
    public final void a() {
    }
}
