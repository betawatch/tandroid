// default package

import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class og5 extends rh2 {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override // oa6
    public final void a() {
        try {
            this.r.open(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.w) {
                byte[] bArr = this.s;
                if (bArr.length < i2 + TLObject.FLAG_14) {
                    bArr = Arrays.copyOf(bArr, bArr.length + TLObject.FLAG_14);
                    this.s = bArr;
                }
                i = this.r.read(bArr, i2, TLObject.FLAG_14);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.w) {
                this.x = Arrays.copyOf(this.s, i2);
            }
        } finally {
            lge.a(this.r);
        }
    }

    @Override // oa6
    public final void c() {
        this.w = true;
    }
}
