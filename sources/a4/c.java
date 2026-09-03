package a4;

import h5.d0;
import q5.c0;
import r3.n;
import r3.o;
import r3.s;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    public s h() {
        h5.a.i(this.a != -1);
        return new n((o) this.c, this.a, 0);
    }

    @Override // a4.h
    public void u(long j10) {
        long[] jArr = (long[]) ((c0) this.d).c;
        this.b = jArr[d0.e(jArr, j10, true)];
    }

    public c(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
