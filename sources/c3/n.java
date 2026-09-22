package c3;

import java.io.EOFException;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class n implements h0 {
    public final byte[] a = new byte[4096];

    @Override // c3.h0
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override // c3.h0
    public final /* synthetic */ void d(int i10, e2.v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override // c3.h0
    public final int e(b2.k kVar, int i10, boolean z10) {
        byte[] bArr = this.a;
        int read = kVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.h0
    public final void f(e2.v vVar, int i10, int i11) {
        vVar.K(i10);
    }

    @Override // c3.h0
    public final void b(b2.s sVar) {
    }

    @Override // c3.h0
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
    }
}
