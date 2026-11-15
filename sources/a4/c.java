package a4;

import a8.ja;
import f3.b0;
import f3.p;
import f3.t;
import f3.u;
import h2.l0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class c implements h {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public c(long j3, int i7) {
        ja.p(((b3.a) this.c) == null);
        this.a = j3;
        this.b = j3 + i7;
    }

    @Override // a4.h
    public b0 Y() {
        ja.p(this.a != -1);
        return new t((u) this.c, this.a, 0);
    }

    @Override // a4.h
    public long m0(p pVar) {
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
        long[] jArr = (long[]) ((wf.b) this.d).b;
        this.b = jArr[l0.f(jArr, j3, true)];
    }

    public c(String str, byte[] bArr, long j3, long j10) {
        this.c = str;
        this.d = bArr;
        this.a = j3;
        this.b = j10;
    }
}
