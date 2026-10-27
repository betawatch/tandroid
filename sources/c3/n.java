package c3;

import java.io.EOFException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n implements j0 {
    public final byte[] a = new byte[4096];

    @Override // c3.j0
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.j0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        h0.a(this, xVar, i10);
    }

    @Override // c3.j0
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

    @Override // c3.j0
    public final void g(e2.x xVar, int i10, int i11) {
        xVar.O(i10);
    }

    @Override // c3.j0
    public final void b(b2.x xVar) {
    }

    @Override // c3.j0
    public final /* synthetic */ void e(long j10) {
    }

    @Override // c3.j0
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
    }
}
