package o2;

import e2.u;
import h2.m0;
import m4.d0;
import x2.c1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m implements c1 {
    public final u a;
    public long[] c;
    public boolean d;
    public p2.g e;
    public boolean f;
    public int h;
    public final d0 b = new d0(20);
    public long n = -9223372036854775807L;

    public m(p2.g gVar, u uVar, boolean z9) {
        this.a = uVar;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z9);
    }

    public final void b(p2.g gVar, boolean z9) {
        int i7 = this.h;
        long j3 = -9223372036854775807L;
        long j10 = i7 == 0 ? -9223372036854775807L : this.c[i7 - 1];
        this.d = z9;
        this.e = gVar;
        long[] jArr = gVar.b;
        this.c = jArr;
        long j11 = this.n;
        if (j11 == -9223372036854775807L) {
            if (j10 != -9223372036854775807L) {
                this.h = m0.b(jArr, j10, false);
            }
        } else {
            int b10 = m0.b(jArr, j11, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j3 = j11;
            }
            this.n = j3;
        }
    }

    @Override // x2.c1
    public final boolean f() {
        return true;
    }

    @Override // x2.c1
    public final int l(long j3) {
        int max = Math.max(this.h, m0.b(this.c, j3, true));
        int i7 = max - this.h;
        this.h = max;
        return i7;
    }

    @Override // x2.c1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        int i10 = this.h;
        boolean z9 = i10 == this.c.length;
        if (z9 && !this.d) {
            hVar.setFlags(4);
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f) {
            bVar.c = this.a;
            this.f = true;
            return -5;
        }
        if (z9) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.h = i10 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] B = this.b.B(this.e.a[i10]);
            hVar.b(B.length);
            hVar.c.put(B);
        }
        hVar.e = this.c[i10];
        hVar.setFlags(1);
        return -4;
    }

    @Override // x2.c1
    public final void a() {
    }
}
