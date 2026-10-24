package o2;

import java.util.Arrays;
import v7.k7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e extends v2.f {
    public byte[] s;
    public volatile boolean v;
    public byte[] w;

    @Override // y2.i
    public final void O() {
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
            k7.a(this.r);
        } catch (Throwable th2) {
            k7.a(this.r);
            throw th2;
        }
    }
}
