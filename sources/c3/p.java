package c3;

import java.io.EOFException;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class p implements l0 {
    public final byte[] a = new byte[4096];

    @Override // c3.l0
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override // c3.l0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.l0
    public final int f(b2.o oVar, int i10, boolean z10) {
        byte[] bArr = this.a;
        int read = oVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.l0
    public final void g(e2.x xVar, int i10, int i11) {
        xVar.O(i10);
    }

    @Override // c3.l0
    public final void b(b2.w wVar) {
    }

    @Override // c3.l0
    public final /* synthetic */ void e(long j10) {
    }

    @Override // c3.l0
    public final void c(long j10, int i10, int i11, int i12, k0 k0Var) {
    }
}
