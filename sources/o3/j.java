package o3;

import j3.t0;
import java.io.EOFException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j implements w {
    public final byte[] a = new byte[4096];

    @Override // o3.w
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
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

    @Override // o3.w
    public final void d(int i10, f5.w wVar) {
        wVar.D(i10);
    }

    @Override // o3.w
    public final void e(int i10, f5.w wVar) {
        wVar.D(i10);
    }

    @Override // o3.w
    public final void b(t0 t0Var) {
    }

    @Override // o3.w
    public final void c(long j10, int i10, int i11, int i12, v vVar) {
    }
}
