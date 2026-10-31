package o2;

import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import v7.l7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends v2.f {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override // y2.i
    public final void R1() {
        this.w = true;
    }

    @Override // y2.i
    public final void b() {
        try {
            this.r.open(this.b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.w) {
                byte[] bArr = this.s;
                if (bArr.length < i11 + TLObject.FLAG_14) {
                    this.s = Arrays.copyOf(bArr, bArr.length + TLObject.FLAG_14);
                }
                i10 = this.r.read(this.s, i11, TLObject.FLAG_14);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.w) {
                this.x = Arrays.copyOf(this.s, i11);
            }
            l7.a(this.r);
        } catch (Throwable th2) {
            l7.a(this.r);
            throw th2;
        }
    }
}
