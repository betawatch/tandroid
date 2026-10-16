package a4;

import e2.m0;
import e2.x;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public g() {
        this.a = 2;
        this.b = m0.b;
    }

    public void a() {
        int i10;
        int i11 = this.c;
        u6.p(i11 >= 0 && (i11 < (i10 = this.e) || (i11 == i10 && this.d == 0)));
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public int d() {
        u6.p(this.d == 0);
        return this.c;
    }

    public int e() {
        return (this.c * 8) + this.d;
    }

    public boolean f() {
        switch (this.a) {
            case 1:
                boolean z10 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                o(1);
                return z10;
            default:
                boolean z11 = (this.b[this.c] & (128 >> this.d)) != 0;
                n();
                return z11;
        }
    }

    public int g(int i10) {
        switch (this.a) {
            case 1:
                int i11 = this.d;
                int min = Math.min(i10, 8 - this.e);
                byte[] bArr = this.b;
                int i12 = i11 + 1;
                int i13 = ((bArr[i11] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i10) {
                    i13 |= (bArr[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                o(i10);
                return i14;
            default:
                if (i10 == 0) {
                    return 0;
                }
                this.d += i10;
                int i15 = 0;
                while (true) {
                    int i16 = this.d;
                    if (i16 <= 8) {
                        byte[] bArr2 = this.b;
                        int i17 = this.c;
                        int i18 = ((-1) >>> (32 - i10)) & (i15 | ((bArr2[i17] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.d = 0;
                            this.c = i17 + 1;
                        }
                        a();
                        return i18;
                    }
                    int i19 = i16 - 8;
                    this.d = i19;
                    byte[] bArr3 = this.b;
                    int i20 = this.c;
                    this.c = i20 + 1;
                    i15 |= (bArr3[i20] & 255) << i19;
                }
        }
    }

    public void h(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.b;
            int i13 = this.c;
            int i14 = i13 + 1;
            this.c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.b;
            int i18 = this.c;
            this.c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.d = i17 - 8;
        }
        int i19 = this.d + i16;
        this.d = i19;
        byte[] bArr4 = this.b;
        int i20 = this.c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.d = 0;
            this.c = i20 + 1;
        }
        a();
    }

    public long i(int i10) {
        if (i10 <= 32) {
            int g10 = g(i10);
            String str = m0.a;
            return 4294967295L & g10;
        }
        int g11 = g(i10 - 32);
        int g12 = g(32);
        String str2 = m0.a;
        return (4294967295L & g12) | ((g11 & 4294967295L) << 32);
    }

    public void j(int i10, byte[] bArr) {
        u6.p(this.d == 0);
        System.arraycopy(this.b, this.c, bArr, 0, i10);
        this.c += i10;
        a();
    }

    public void k(int i10, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i10;
    }

    public void l(x xVar) {
        k(xVar.c, xVar.a);
        m(xVar.b * 8);
    }

    public void m(int i10) {
        int i11 = i10 / 8;
        this.c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public void n() {
        int i10 = this.d + 1;
        this.d = i10;
        if (i10 == 8) {
            this.d = 0;
            this.c++;
        }
        a();
    }

    public void o(int i10) {
        int i11;
        switch (this.a) {
            case 1:
                int i12 = i10 / 8;
                int i13 = this.d + i12;
                this.d = i13;
                int i14 = (i10 - (i12 * 8)) + this.e;
                this.e = i14;
                boolean z10 = true;
                if (i14 > 7) {
                    this.d = i13 + 1;
                    this.e = i14 - 8;
                }
                int i15 = this.d;
                if (i15 < 0 || (i15 >= (i11 = this.c) && (i15 != i11 || this.e != 0))) {
                    z10 = false;
                }
                u6.p(z10);
                break;
            default:
                int i16 = i10 / 8;
                int i17 = this.c + i16;
                this.c = i17;
                int i18 = (i10 - (i16 * 8)) + this.d;
                this.d = i18;
                if (i18 > 7) {
                    this.c = i17 + 1;
                    this.d = i18 - 8;
                }
                a();
                break;
        }
    }

    public void p(int i10) {
        u6.p(this.d == 0);
        this.c += i10;
        a();
    }

    public g(byte[] bArr) {
        this.a = 1;
        this.b = bArr;
        this.c = bArr.length;
    }

    public g(byte[] bArr, int i10) {
        this.a = 2;
        this.b = bArr;
        this.e = i10;
    }

    public g(int i10, int i11) {
        this.a = 0;
        this.c = i10;
        this.d = i11;
        this.b = new byte[(i11 * 2) - 1];
        this.e = 0;
    }
}
