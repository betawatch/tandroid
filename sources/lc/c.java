package lc;

import java.nio.ByteBuffer;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class c {
    public final ByteBuffer a;
    public final int b;
    public int c;

    public c(int i7, ByteBuffer byteBuffer) {
        switch (i7) {
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

    public int a(int i7) {
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
        if (i7 <= i14) {
            a10 = ((i12 << (i13 % 8)) & qs.e4) >> ((i14 - i7) + (i13 % 8));
            this.c = i13 + i7;
        } else {
            int i15 = i7 - i14;
            a10 = (a(i14) << i15) + a(i15);
        }
        byteBuffer.position(i11 + ((int) Math.ceil(this.c / 8.0d)));
        return a10;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public void c(int i7, int i10) {
        int i11 = this.c;
        int i12 = 8 - (i11 % 8);
        int i13 = this.b;
        ByteBuffer byteBuffer = this.a;
        if (i10 <= i12) {
            int i14 = byteBuffer.get((i11 / 8) + i13);
            if (i14 < 0) {
                i14 += 256;
            }
            int i15 = i14 + (i7 << (i12 - i10));
            int i16 = (this.c / 8) + i13;
            if (i15 > 127) {
                i15 -= 256;
            }
            byteBuffer.put(i16, (byte) i15);
            this.c += i10;
        } else {
            int i17 = i10 - i12;
            c(i7 >> i17, i12);
            c(i7 & ((1 << i17) - 1), i17);
        }
        int i18 = this.c;
        byteBuffer.position((i18 / 8) + i13 + (i18 % 8 <= 0 ? 0 : 1));
    }
}
