package mc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c {
    public final ByteBuffer a;
    public final int b;
    public int c;

    public c(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
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

    public int a(int i10) {
        int a2;
        int i11 = this.c / 8;
        int i12 = this.b;
        ByteBuffer byteBuffer = this.a;
        int i13 = byteBuffer.get(i11 + i12);
        if (i13 < 0) {
            i13 += 256;
        }
        int i14 = this.c;
        int i15 = 8 - (i14 % 8);
        if (i10 <= i15) {
            a2 = ((i13 << (i14 % 8)) & 255) >> ((i15 - i10) + (i14 % 8));
            this.c = i14 + i10;
        } else {
            int i16 = i10 - i15;
            a2 = (a(i15) << i16) + a(i16);
        }
        byteBuffer.position(i12 + ((int) Math.ceil(this.c / 8.0d)));
        return a2;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public void c(int i10, int i11) {
        int i12 = this.c;
        int i13 = 8 - (i12 % 8);
        int i14 = this.b;
        ByteBuffer byteBuffer = this.a;
        if (i11 <= i13) {
            int i15 = byteBuffer.get((i12 / 8) + i14);
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i10 << (i13 - i11));
            int i17 = (this.c / 8) + i14;
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.c += i11;
        } else {
            int i18 = i11 - i13;
            c(i10 >> i18, i13);
            c(i10 & ((1 << i18) - 1), i18);
        }
        int i19 = this.c;
        byteBuffer.position((i19 / 8) + i14 + (i19 % 8 <= 0 ? 0 : 1));
    }
}
