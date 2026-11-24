// default package

import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ne5 extends zg2 {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override // k86
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
            vbe.a(this.r);
        }
    }

    @Override // k86
    public final void d() {
        this.w = true;
    }
}
