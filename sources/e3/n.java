package e3;

import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements i0 {
    public final byte[] a = new byte[TLObject.FLAG_12];

    @Override // e3.i0
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final int c(d2.o oVar, int i3, boolean z10) {
        byte[] bArr = this.a;
        int read = oVar.read(bArr, 0, Math.min(bArr.length, i3));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // e3.i0
    public final /* synthetic */ void e(int i3, g2.y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override // e3.i0
    public final void f(g2.y yVar, int i3, int i10) {
        yVar.O(i3);
    }

    @Override // e3.i0
    public final /* synthetic */ void b(long j10) {
    }

    @Override // e3.i0
    public final void g(d2.v vVar) {
    }

    @Override // e3.i0
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
    }
}
