package a4;

import a8.ia;
import f3.c0;
import f3.p;
import f3.t;
import f3.u;
import h2.m0;
import q4.q;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c implements h {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public c(long j3, int i7) {
        ia.p(((b3.a) this.c) == null);
        this.a = j3;
        this.b = j3 + i7;
    }

    @Override // a4.h
    public c0 M() {
        ia.p(this.a != -1);
        return new t((u) this.c, this.a, 0);
    }

    @Override // a4.h
    public long r0(p pVar) {
        long j3 = this.b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.b = -1L;
        return j10;
    }

    @Override // a4.h
    public void v0(long j3) {
        long[] jArr = (long[]) ((q) this.d).b;
        this.b = jArr[m0.f(jArr, j3, true)];
    }

    public c(String str, byte[] bArr, long j3, long j10) {
        this.c = str;
        this.d = bArr;
        this.a = j3;
        this.b = j10;
    }
}
