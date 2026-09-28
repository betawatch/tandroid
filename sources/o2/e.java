package o2;

import java.util.Arrays;
import v7.n7;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
