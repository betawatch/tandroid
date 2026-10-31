package c3;

import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n implements k0 {
    public final byte[] a = new byte[TLObject.FLAG_12];

    @Override // c3.k0
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.k0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        i0.a(this, xVar, i10);
    }

    @Override // c3.k0
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

    @Override // c3.k0
    public final void g(e2.x xVar, int i10, int i11) {
        xVar.O(i10);
    }

    @Override // c3.k0
    public final void b(b2.x xVar) {
    }

    @Override // c3.k0
    public final /* synthetic */ void e(long j10) {
    }

    @Override // c3.k0
    public final void c(long j10, int i10, int i11, int i12, j0 j0Var) {
    }
}
