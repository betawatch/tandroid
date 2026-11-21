package f3;

import com.google.android.gms.internal.vision.e2;
import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class n implements i0 {
    public final byte[] a = new byte[TLObject.FLAG_12];

    @Override // f3.i0
    public final void a(h2.x xVar, int i7, int i10) {
        xVar.O(i7);
    }

    @Override // f3.i0
    public final /* synthetic */ void b(int i7, h2.x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override // f3.i0
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override // f3.i0
    public final int f(e2.n nVar, int i7, boolean z10) {
        byte[] bArr = this.a;
        int read = nVar.read(bArr, 0, Math.min(bArr.length, i7));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // f3.i0
    public final /* synthetic */ void d(long j3) {
    }

    @Override // f3.i0
    public final void g(e2.u uVar) {
    }

    @Override // f3.i0
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
    }
}
