package o4;

import g7.l0;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends l4.e {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        try {
            this.r.open(this.b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.s;
                if (bArr.length < i11 + 16384) {
                    this.s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.r.read(this.s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.w = Arrays.copyOf(this.s, i11);
            }
            l0.a(this.r);
        } catch (Throwable th) {
            l0.a(this.r);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void l() {
        this.v = true;
    }
}
