package j4;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m a;
    public final int b;
    public final p0 c;
    public final byte[] d;
    public int e;

    public p(com.google.android.exoplayer2.upstream.m mVar, int i9, p0 p0Var) {
        d5.a.f(i9 > 0);
        this.a = mVar;
        this.b = i9;
        this.c = p0Var;
        this.d = new byte[1];
        this.e = i9;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        y0Var.getClass();
        this.a.addTransferListener(y0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i9, int i10) {
        int i11 = this.e;
        com.google.android.exoplayer2.upstream.m mVar = this.a;
        if (i11 == 0) {
            byte[] bArr2 = this.d;
            int i12 = 0;
            if (mVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int read = mVar.read(bArr3, i12, i14);
                        if (read != -1) {
                            i12 += read;
                            i14 -= read;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        d5.y yVar = new d5.y(bArr3, i13);
                        p0 p0Var = this.c;
                        long max = !p0Var.w ? p0Var.r : Math.max(p0Var.x.l(true), p0Var.r);
                        int a2 = yVar.a();
                        a1 a1Var = p0Var.v;
                        a1Var.getClass();
                        a1Var.d(a2, yVar);
                        a1Var.e(max, 1, a2, 0, null);
                        p0Var.w = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = mVar.read(bArr, i9, Math.min(this.e, i10));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
