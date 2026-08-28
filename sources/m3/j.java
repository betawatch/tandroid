package m3;

import h3.t0;
import java.io.EOFException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements w {
    public final byte[] a = new byte[4096];

    @Override // m3.w
    public final void a(int i9, d5.y yVar) {
        yVar.D(i9);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        byte[] bArr = this.a;
        int read = jVar.read(bArr, 0, Math.min(bArr.length, i9));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // m3.w
    public final void d(int i9, d5.y yVar) {
        yVar.D(i9);
    }

    @Override // m3.w
    public final void c(t0 t0Var) {
    }

    @Override // m3.w
    public final void e(long j10, int i9, int i10, int i11, v vVar) {
    }
}
