package o2;

import e2.u;
import h2.l0;
import x2.b1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class m implements b1 {
    public final u a;
    public long[] c;
    public boolean d;
    public p2.g e;
    public boolean f;
    public int h;
    public final k8.a b = new k8.a(24);
    public long n = -9223372036854775807L;

    public m(p2.g gVar, u uVar, boolean z10) {
        this.a = uVar;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z10);
    }

    public final void b(p2.g gVar, boolean z10) {
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

    @Override // x2.b1
    public final boolean f() {
        return true;
    }

    @Override // x2.b1
    public final int n(long j3) {
        int max = Math.max(this.h, l0.b(this.c, j3, true));
        int i7 = max - this.h;
        this.h = max;
        return i7;
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        int i10 = this.h;
        boolean z10 = i10 == this.c.length;
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f) {
            aVar.c = this.a;
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
            byte[] E0 = this.b.E0(this.e.a[i10]);
            hVar.b(E0.length);
            hVar.c.put(E0);
        }
        hVar.e = this.c[i10];
        hVar.setFlags(1);
        return -4;
    }

    @Override // x2.b1
    public final void a() {
    }
}
