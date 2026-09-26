package o2;

import java.util.Arrays;
import v7.n7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class e extends v2.e {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // y2.i
    public final void D() {
        this.v = true;
    }

    @Override // y2.i
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
            n7.a(this.r);
        } catch (Throwable th2) {
            n7.a(this.r);
            throw th2;
        }
    }
}
