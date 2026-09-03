package o4;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i implements g5.m {
    public final g5.m a;
    public final int b;
    public final b0 c;
    public final byte[] d;
    public int e;

    public i(g5.m mVar, int i10, b0 b0Var) {
        h5.a.f(i10 > 0);
        this.a = mVar;
        this.b = i10;
        this.c = b0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override // g5.m
    public final void addTransferListener(g5.v0 v0Var) {
        v0Var.getClass();
        this.a.addTransferListener(v0Var);
    }

    @Override // g5.m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // g5.m
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // g5.m
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // g5.m
    public final long open(g5.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.e;
        g5.m mVar = this.a;
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
                        h5.w wVar = new h5.w(bArr3, i14);
                        b0 b0Var = this.c;
                        long max = !b0Var.w ? b0Var.r : Math.max(b0Var.x.f(true), b0Var.r);
                        int a2 = wVar.a();
                        k0 k0Var = b0Var.v;
                        k0Var.getClass();
                        k0Var.a(a2, wVar);
                        k0Var.c(max, 1, a2, 0, null);
                        b0Var.w = true;
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
