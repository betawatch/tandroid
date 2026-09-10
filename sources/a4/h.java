package a4;

import e2.d0;
import e2.v;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public h() {
        this.a = 2;
        this.b = d0.b;
    }

    public void a() {
        int i10;
        int i11;
        switch (this.a) {
            case 2:
                int i12 = this.c;
                e2.d.g(i12 >= 0 && (i12 < (i10 = this.e) || (i12 == i10 && this.d == 0)));
                break;
            default:
                int i13 = this.d;
                e2.d.g(i13 >= 0 && (i13 < (i11 = this.c) || (i13 == i11 && this.e == 0)));
                break;
        }
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

    public boolean d(int i10) {
        int i11 = this.d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.c) {
                break;
            }
            if (r(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.c;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean e() {
        int i10 = this.d;
        int i11 = this.e;
        int i12 = 0;
        while (this.d < this.c && !h()) {
            i12++;
        }
        boolean z10 = this.d == this.c;
        this.d = i10;
        this.e = i11;
        return !z10 && d((i12 * 2) + 1);
    }

    public int f() {
        e2.d.g(this.d == 0);
        return this.c;
    }

    public int g() {
        return (this.c * 8) + this.d;
    }

    public boolean h() {
        switch (this.a) {
            case 1:
                boolean z10 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                t(1);
                return z10;
            case 2:
                boolean z11 = (this.b[this.c] & (128 >> this.d)) != 0;
                s();
                return z11;
            default:
                boolean z12 = (this.b[this.d] & (128 >> this.e)) != 0;
                s();
                return z12;
        }
    }

    public int i(int i10) {
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
                t(i10);
                return i14;
            case 2:
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
            default:
                this.e += i10;
                int i21 = 0;
                while (true) {
                    int i22 = this.e;
                    if (i22 <= 8) {
                        byte[] bArr4 = this.b;
                        int i23 = this.d;
                        int i24 = ((-1) >>> (32 - i10)) & (i21 | ((bArr4[i23] & 255) >> (8 - i22)));
                        if (i22 == 8) {
                            this.e = 0;
                            this.d = i23 + (r(i23 + 1) ? 2 : 1);
                        }
                        a();
                        return i24;
                    }
                    int i25 = i22 - 8;
                    this.e = i25;
                    byte[] bArr5 = this.b;
                    int i26 = this.d;
                    i21 |= (bArr5[i26] & 255) << i25;
                    if (!r(i26 + 1)) {
                        r3 = 1;
                    }
                    this.d = i26 + r3;
                }
        }
    }

    public void j(int i10, byte[] bArr) {
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

    public long k(int i10) {
        if (i10 <= 32) {
            int i11 = i(i10);
            String str = d0.a;
            return 4294967295L & i11;
        }
        int i12 = i(i10 - 32);
        int i13 = i(32);
        String str2 = d0.a;
        return (4294967295L & i13) | ((i12 & 4294967295L) << 32);
    }

    public void l(int i10, byte[] bArr) {
        e2.d.g(this.d == 0);
        System.arraycopy(this.b, this.c, bArr, 0, i10);
        this.c += i10;
        a();
    }

    public int m() {
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
    }

    public int n() {
        int m10 = m();
        return ((m10 + 1) / 2) * (m10 % 2 == 0 ? -1 : 1);
    }

    public void o(int i10, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i10;
    }

    public void p(v vVar) {
        o(vVar.c, vVar.a);
        q(vVar.b * 8);
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        this.c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public boolean r(int i10) {
        if (2 > i10 || i10 >= this.c) {
            return false;
        }
        byte[] bArr = this.b;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void s() {
        switch (this.a) {
            case 2:
                int i10 = this.d + 1;
                this.d = i10;
                if (i10 == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                break;
            default:
                int i11 = this.e + 1;
                this.e = i11;
                if (i11 == 8) {
                    this.e = 0;
                    int i12 = this.d;
                    this.d = i12 + (r(i12 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i10) {
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
                e2.d.g(z10);
                break;
            case 2:
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
            default:
                int i19 = this.d;
                int i20 = i10 / 8;
                int i21 = i19 + i20;
                this.d = i21;
                int i22 = (i10 - (i20 * 8)) + this.e;
                this.e = i22;
                if (i22 > 7) {
                    this.d = i21 + 1;
                    this.e = i22 - 8;
                }
                while (true) {
                    i19++;
                    if (i19 > this.d) {
                        a();
                        break;
                    } else if (r(i19)) {
                        this.d++;
                        i19 += 2;
                    }
                }
        }
    }

    public void u(int i10) {
        e2.d.g(this.d == 0);
        this.c += i10;
        a();
    }

    public h(byte[] bArr) {
        this.a = 1;
        this.b = bArr;
        this.c = bArr.length;
    }

    public h(byte[] bArr, int i10, int i11) {
        this.a = 3;
        this.b = bArr;
        this.d = i10;
        this.c = i11;
        this.e = 0;
        a();
    }

    public h(byte[] bArr, int i10) {
        this.a = 2;
        this.b = bArr;
        this.e = i10;
    }

    public h(int i10, int i11) {
        this.a = 0;
        this.c = i10;
        this.d = i11;
        this.b = new byte[(i11 * 2) - 1];
        this.e = 0;
    }
}
