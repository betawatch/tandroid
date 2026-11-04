package n2;

import d2.v;
import g2.n0;
import mi.h0;
import w2.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements d1 {
    public final v a;
    public long[] c;
    public boolean d;
    public o2.g e;
    public boolean f;
    public int h;
    public final h0 b = new h0(17);
    public long n = -9223372036854775807L;

    public m(o2.g gVar, v vVar, boolean z10) {
        this.a = vVar;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z10);
    }

    public final void b(o2.g gVar, boolean z10) {
        int i3 = this.h;
        long j10 = -9223372036854775807L;
        long j11 = i3 == 0 ? -9223372036854775807L : this.c[i3 - 1];
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.b;
        this.c = jArr;
        long j12 = this.n;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.h = n0.b(jArr, j11, false);
            }
        } else {
            int b10 = n0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j10 = j12;
            }
            this.n = j10;
        }
    }

    @Override // w2.d1
    public final boolean f() {
        return true;
    }

    @Override // w2.d1
    public final int m(long j10) {
        int max = Math.max(this.h, n0.b(this.c, j10, true));
        int i3 = max - this.h;
        this.h = max;
        return i3;
    }

    @Override // w2.d1
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        int i10 = this.h;
        boolean z10 = i10 == this.c.length;
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        }
        if ((i3 & 2) != 0 || !this.f) {
            bVar.b = this.a;
            this.f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i3 & 1) == 0) {
            this.h = i10 + 1;
        }
        if ((i3 & 4) == 0) {
            byte[] e10 = this.b.e(this.e.a[i10]);
            hVar.b(e10.length);
            hVar.c.put(e10);
        }
        hVar.e = this.c[i10];
        hVar.setFlags(1);
        return -4;
    }

    @Override // w2.d1
    public final void a() {
    }
}
