// default package

import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mg5 extends ni2 {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override // ja6
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
            wde.a(this.r);
        }
    }

    @Override // ja6
    public final void e() {
        this.w = true;
    }
}
