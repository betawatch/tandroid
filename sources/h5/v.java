package h5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public v() {
        this.a = 0;
        this.b = d0.f;
    }

    public void a() {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                int i12 = this.c;
                a.i(i12 >= 0 && (i12 < (i10 = this.e) || (i12 == i10 && this.d == 0)));
                break;
            default:
                int i13 = this.d;
                a.i(i13 >= 0 && (i13 < (i11 = this.c) || (i13 == i11 && this.e == 0)));
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
            if (q(i11)) {
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
        boolean z4 = this.d == this.c;
        this.d = i10;
        this.e = i11;
        return !z4 && d((i12 * 2) + 1);
    }

    public int f() {
        a.i(this.d == 0);
        return this.c;
    }

    public int g() {
        return (this.c * 8) + this.d;
    }

    public boolean h() {
        switch (this.a) {
            case 0:
                boolean z4 = (this.b[this.c] & (128 >> this.d)) != 0;
                r();
                return z4;
            case 1:
                boolean z10 = (this.b[this.d] & (128 >> this.e)) != 0;
                r();
                return z10;
            default:
                boolean z11 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                s(1);
                return z11;
        }
    }

    public int i(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.d += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.d;
                    if (i12 <= 8) {
                        byte[] bArr = this.b;
                        int i13 = this.c;
                        int i14 = ((-1) >>> (32 - i10)) & (i11 | ((bArr[i13] & 255) >> (8 - i12)));
                        if (i12 == 8) {
                            this.d = 0;
                            this.c = i13 + 1;
                        }
                        a();
                        return i14;
                    }
                    int i15 = i12 - 8;
                    this.d = i15;
                    byte[] bArr2 = this.b;
                    int i16 = this.c;
                    this.c = i16 + 1;
                    i11 |= (bArr2[i16] & 255) << i15;
                }
            case 1:
                this.e += i10;
                int i17 = 0;
                while (true) {
                    int i18 = this.e;
                    if (i18 <= 8) {
                        byte[] bArr3 = this.b;
                        int i19 = this.d;
                        int i20 = ((-1) >>> (32 - i10)) & (i17 | ((bArr3[i19] & 255) >> (8 - i18)));
                        if (i18 == 8) {
                            this.e = 0;
                            this.d = i19 + (q(i19 + 1) ? 2 : 1);
                        }
                        a();
                        return i20;
                    }
                    int i21 = i18 - 8;
                    this.e = i21;
                    byte[] bArr4 = this.b;
                    int i22 = this.d;
                    i17 |= (bArr4[i22] & 255) << i21;
                    if (!q(i22 + 1)) {
                        r3 = 1;
                    }
                    this.d = i22 + r3;
                }
            default:
                int i23 = this.d;
                int min = Math.min(i10, 8 - this.e);
                byte[] bArr5 = this.b;
                int i24 = i23 + 1;
                int i25 = ((bArr5[i23] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i10) {
                    i25 |= (bArr5[i24] & 255) << min;
                    min += 8;
                    i24++;
                }
                int i26 = i25 & ((-1) >>> (32 - i10));
                s(i10);
                return i26;
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

    public void k(int i10, byte[] bArr) {
        a.i(this.d == 0);
        System.arraycopy(this.b, this.c, bArr, 0, i10);
        this.c += i10;
        a();
    }

    public int l() {
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
    }

    public int m() {
        int l10 = l();
        return ((l10 + 1) / 2) * (l10 % 2 == 0 ? -1 : 1);
    }

    public void n(int i10, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i10;
    }

    public void o(w wVar) {
        n(wVar.c, wVar.a);
        p(wVar.b * 8);
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public boolean q(int i10) {
        if (2 > i10 || i10 >= this.c) {
            return false;
        }
        byte[] bArr = this.b;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void r() {
        switch (this.a) {
            case 0:
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
                    this.d = i12 + (q(i12 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void s(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                int i12 = i10 / 8;
                int i13 = this.c + i12;
                this.c = i13;
                int i14 = (i10 - (i12 * 8)) + this.d;
                this.d = i14;
                if (i14 > 7) {
                    this.c = i13 + 1;
                    this.d = i14 - 8;
                }
                a();
                break;
            case 1:
                int i15 = this.d;
                int i16 = i10 / 8;
                int i17 = i15 + i16;
                this.d = i17;
                int i18 = (i10 - (i16 * 8)) + this.e;
                this.e = i18;
                if (i18 > 7) {
                    this.d = i17 + 1;
                    this.e = i18 - 8;
                }
                while (true) {
                    i15++;
                    if (i15 > this.d) {
                        a();
                        break;
                    } else if (q(i15)) {
                        this.d++;
                        i15 += 2;
                    }
                }
            default:
                int i19 = i10 / 8;
                int i20 = this.d + i19;
                this.d = i20;
                int i21 = (i10 - (i19 * 8)) + this.e;
                this.e = i21;
                boolean z4 = true;
                if (i21 > 7) {
                    this.d = i20 + 1;
                    this.e = i21 - 8;
                }
                int i22 = this.d;
                if (i22 < 0 || (i22 >= (i11 = this.c) && (i22 != i11 || this.e != 0))) {
                    z4 = false;
                }
                a.i(z4);
                break;
        }
    }

    public void t(int i10) {
        a.i(this.d == 0);
        this.c += i10;
        a();
    }

    public v(byte[] bArr, int i10, int i11) {
        this.a = 1;
        this.b = bArr;
        this.d = i10;
        this.c = i11;
        this.e = 0;
        a();
    }

    public v(byte[] bArr) {
        this.a = 2;
        this.b = bArr;
        this.c = bArr.length;
    }

    public v(byte[] bArr, int i10) {
        this.a = 0;
        this.b = bArr;
        this.e = i10;
    }

    public v(int i10, int i11) {
        this.a = 3;
        this.c = i10;
        this.d = i11;
        this.b = new byte[(i11 * 2) - 1];
        this.e = 0;
    }
}
