package a4;

import a8.ia;
import f3.c0;
import f3.p;
import f3.t;
import f3.u;
import h2.m0;
import q4.q;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
