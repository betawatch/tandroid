package ic;

import java.nio.ByteBuffer;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public final ByteBuffer a;
    public final int b;
    public int c;

    public c(int i3, ByteBuffer byteBuffer) {
        switch (i3) {
            case 1:
                this.c = 0;
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                break;
            default:
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                break;
        }
    }

    public int a(int i3) {
        int a10;
        int i10 = this.c / 8;
        int i11 = this.b;
        ByteBuffer byteBuffer = this.a;
        int i12 = byteBuffer.get(i10 + i11);
        if (i12 < 0) {
            i12 += 256;
        }
        int i13 = this.c;
        int i14 = 8 - (i13 % 8);
        if (i3 <= i14) {
            a10 = ((i12 << (i13 % 8)) & hs.e4) >> ((i14 - i3) + (i13 % 8));
            this.c = i13 + i3;
        } else {
            int i15 = i3 - i14;
            a10 = (a(i14) << i15) + a(i15);
        }
        byteBuffer.position(i11 + ((int) Math.ceil(this.c / 8.0d)));
        return a10;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public void c(int i3, int i10) {
        int i11 = this.c;
        int i12 = 8 - (i11 % 8);
        int i13 = this.b;
        ByteBuffer byteBuffer = this.a;
        if (i10 <= i12) {
            int i14 = byteBuffer.get((i11 / 8) + i13);
            if (i14 < 0) {
                i14 += 256;
            }
            int i15 = i14 + (i3 << (i12 - i10));
            int i16 = (this.c / 8) + i13;
            if (i15 > 127) {
                i15 -= 256;
            }
            byteBuffer.put(i16, (byte) i15);
            this.c += i10;
        } else {
            int i17 = i10 - i12;
            c(i3 >> i17, i12);
            c(i3 & ((1 << i17) - 1), i17);
        }
        int i18 = this.c;
        byteBuffer.position((i18 / 8) + i13 + (i18 % 8 <= 0 ? 0 : 1));
    }
}
