package l2;

import b2.w;
import e2.m0;
import u2.d1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class m implements d1 {
    public final w a;
    public long[] c;
    public boolean d;
    public m2.g e;
    public boolean f;
    public int h;
    public final n2.e b = new n2.e(1);
    public long n = -9223372036854775807L;

    public m(m2.g gVar, w wVar, boolean z10) {
        this.a = wVar;
        this.e = gVar;
        this.c = gVar.b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
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
                this.h = m0.b(jArr, j11, false);
            }
        } else {
            int b10 = m0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.c.length) {
                j10 = j12;
            }
            this.n = j10;
        }
    }

    @Override // u2.d1
    public final boolean f() {
        return true;
    }

    @Override // u2.d1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        int i11 = this.h;
        boolean z10 = i11 == this.c.length;
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f) {
            bVar.c = this.a;
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
            byte[] x10 = this.b.x(this.e.a[i11]);
            hVar.b(x10.length);
            hVar.c.put(x10);
        }
        hVar.e = this.c[i11];
        hVar.setFlags(1);
        return -4;
    }

    @Override // u2.d1
    public final int m(long j10) {
        int max = Math.max(this.h, m0.b(this.c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override // u2.d1
    public final void a() {
    }
}
