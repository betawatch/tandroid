package o4;

import f7.f5;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends l4.e {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void K() {
        this.v = true;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        try {
            this.r.open(this.b);
            int i9 = 0;
            int i10 = 0;
            while (i9 != -1 && !this.v) {
                byte[] bArr = this.s;
                if (bArr.length < i10 + 16384) {
                    this.s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i9 = this.r.read(this.s, i10, 16384);
                if (i9 != -1) {
                    i10 += i9;
                }
            }
            if (!this.v) {
                this.w = Arrays.copyOf(this.s, i10);
            }
            f5.a(this.r);
        } catch (Throwable th) {
            f5.a(this.r);
            throw th;
        }
    }
}
