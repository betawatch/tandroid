package m3;

import d5.z;
import h3.t0;
import java.io.EOFException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j implements w {
    public final byte[] a = new byte[4096];

    @Override // m3.w
    public final void a(int i10, z zVar) {
        zVar.D(i10);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        byte[] bArr = this.a;
        int read = jVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // m3.w
    public final void d(int i10, z zVar) {
        zVar.D(i10);
    }

    @Override // m3.w
    public final void c(t0 t0Var) {
    }

    @Override // m3.w
    public final void e(long j10, int i10, int i11, int i12, v vVar) {
    }
}
