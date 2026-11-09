package f3;

import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class n implements j0 {
    public final byte[] a = new byte[TLObject.FLAG_12];

    @Override // f3.j0
    public final void a(h2.x xVar, int i7, int i10) {
        xVar.O(i7);
    }

    @Override // f3.j0
    public final /* synthetic */ void b(int i7, h2.x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override // f3.j0
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override // f3.j0
    public final int f(e2.n nVar, int i7, boolean z9) {
        byte[] bArr = this.a;
        int read = nVar.read(bArr, 0, Math.min(bArr.length, i7));
        if (read != -1) {
            return read;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // f3.j0
    public final /* synthetic */ void d(long j3) {
    }

    @Override // f3.j0
    public final void g(e2.u uVar) {
    }

    @Override // f3.j0
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
    }
}
