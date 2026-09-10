package o2;

import java.util.Arrays;
import v7.n7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e extends v2.e {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // y2.k
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

    @Override // y2.k
    public final void k() {
        this.v = true;
    }
}
