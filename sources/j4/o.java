package j4;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m a;
    public final int b;
    public final o0 c;
    public final byte[] d;
    public int e;

    public o(com.google.android.exoplayer2.upstream.m mVar, int i10, o0 o0Var) {
        d5.a.f(i10 > 0);
        this.a = mVar;
        this.b = i10;
        this.c = o0Var;
        this.d = new byte[1];
        this.e = i10;
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
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.e;
        com.google.android.exoplayer2.upstream.m mVar = this.a;
        if (i12 == 0) {
            byte[] bArr2 = this.d;
            int i13 = 0;
            if (mVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int read = mVar.read(bArr3, i13, i15);
                        if (read != -1) {
                            i13 += read;
                            i15 -= read;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        d5.z zVar = new d5.z(bArr3, i14);
                        o0 o0Var = this.c;
                        long max = !o0Var.w ? o0Var.r : Math.max(o0Var.x.i(true), o0Var.r);
                        int a2 = zVar.a();
                        a1 a1Var = o0Var.v;
                        a1Var.getClass();
                        a1Var.d(a2, zVar);
                        a1Var.e(max, 1, a2, 0, null);
                        o0Var.w = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = mVar.read(bArr, i10, Math.min(this.e, i11));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
