package l2;

import b2.s;
import e2.d0;
import n4.y;
import u2.b1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l implements b1 {
    public final s a;
    public long[] c;
    public boolean d;
    public m2.g e;
    public boolean f;
    public int h;
    public final y b = new y(27);
    public long n = -9223372036854775807L;

    public l(m2.g gVar, s sVar, boolean z10) {
        this.a = sVar;
        this.e = gVar;
        this.c = gVar.b;
        a(gVar, z10);
    }

    public final void a(m2.g gVar, boolean z10) {
        int i10 = this.h;
        long j3 = -9223372036854775807L;
        long j10 = i10 == 0 ? -9223372036854775807L : this.c[i10 - 1];
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.b;
        this.c = jArr;
        long j11 = this.n;
        if (j11 == -9223372036854775807L) {
            if (j10 != -9223372036854775807L) {
                this.h = d0.a(jArr, j10, false);
            }
        } else {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.c.length) {
                j3 = j11;
            }
            this.n = j3;
        }
    }

    @Override // u2.b1
    public final boolean e() {
        return true;
    }

    @Override // u2.b1
    public final int f(y yVar, h2.h hVar, int i10) {
        int i11 = this.h;
        boolean z10 = i11 == this.c.length;
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f) {
            yVar.c = this.a;
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
            hVar.b(E.length);
            hVar.c.put(E);
        }
        hVar.e = this.c[i11];
        hVar.setFlags(1);
        return -4;
    }

    @Override // u2.b1
    public final int m(long j3) {
        int max = Math.max(this.h, d0.a(this.c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override // u2.b1
    public final void b() {
    }
}
