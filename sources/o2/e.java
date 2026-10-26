package o2;

import a8.hc;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e extends v2.f {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // y2.i
    public final void b() {
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
            hc.a(this.r);
        } catch (Throwable th2) {
            hc.a(this.r);
            throw th2;
        }
    }

    @Override // y2.i
    public final void f0() {
        this.v = true;
    }
}
