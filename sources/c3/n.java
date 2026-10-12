package c3;

import java.io.EOFException;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class n implements i0 {
    public final byte[] a = new byte[4096];

    @Override // c3.i0
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.i0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.i0
    public final int f(b2.p pVar, int i10, boolean z10) {
        byte[] bArr = this.a;
        int read = pVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.i0
    public final void g(e2.x xVar, int i10, int i11) {
        xVar.O(i10);
    }

    @Override // c3.i0
    public final void b(b2.x xVar) {
    }

    @Override // c3.i0
    public final /* synthetic */ void e(long j10) {
    }

    @Override // c3.i0
    public final void c(long j10, int i10, int i11, int i12, h0 h0Var) {
    }
}
