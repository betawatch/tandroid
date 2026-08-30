package a4;

import h5.d0;
import q5.g0;
import r3.n;
import r3.o;
import r3.s;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements h {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public c(long j10, int i10) {
        h5.a.i(((g5.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i10;
    }

    @Override // a4.h
    public long c(r3.l lVar) {
        long j10 = this.b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.b = -1L;
        return j11;
    }

    @Override // a4.h
    public s k() {
        h5.a.i(this.a != -1);
        return new n((o) this.c, this.a, 0);
    }

    @Override // a4.h
    public void v(long j10) {
        long[] jArr = (long[]) ((g0) this.d).b;
        this.b = jArr[d0.e(jArr, j10, true)];
    }

    public c(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
