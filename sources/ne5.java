// default package

import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
