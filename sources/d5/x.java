package d5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public x() {
        this.a = 0;
        this.b = f0.f;
    }

    public void a() {
        int i9;
        int i10;
        switch (this.a) {
            case 0:
                int i11 = this.c;
                a.i(i11 >= 0 && (i11 < (i9 = this.e) || (i11 == i9 && this.d == 0)));
                break;
            default:
                int i12 = this.d;
                a.i(i12 >= 0 && (i12 < (i10 = this.c) || (i12 == i10 && this.e == 0)));
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

    public boolean d(int i9) {
        int i10 = this.d;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        int i13 = (this.e + i9) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.c) {
                break;
            }
            if (q(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.c;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean e() {
        int i9 = this.d;
        int i10 = this.e;
        int i11 = 0;
        while (this.d < this.c && !h()) {
            i11++;
        }
        boolean z10 = this.d == this.c;
        this.d = i9;
        this.e = i10;
        return !z10 && d((i11 * 2) + 1);
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
                boolean z10 = (this.b[this.c] & (128 >> this.d)) != 0;
                r();
                return z10;
            case 1:
                boolean z11 = (this.b[this.d] & (128 >> this.e)) != 0;
                r();
                return z11;
            default:
                boolean z12 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                s(1);
                return z12;
        }
    }

    public int i(int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 0) {
                    return 0;
                }
                this.d += i9;
                int i10 = 0;
                while (true) {
                    int i11 = this.d;
                    if (i11 <= 8) {
                        byte[] bArr = this.b;
                        int i12 = this.c;
                        int i13 = ((-1) >>> (32 - i9)) & (i10 | ((bArr[i12] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.d = 0;
                            this.c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                    int i14 = i11 - 8;
                    this.d = i14;
                    byte[] bArr2 = this.b;
                    int i15 = this.c;
                    this.c = i15 + 1;
                    i10 |= (bArr2[i15] & 255) << i14;
                }
            case 1:
                this.e += i9;
                int i16 = 0;
                while (true) {
                    int i17 = this.e;
                    if (i17 <= 8) {
                        byte[] bArr3 = this.b;
                        int i18 = this.d;
                        int i19 = ((-1) >>> (32 - i9)) & (i16 | ((bArr3[i18] & 255) >> (8 - i17)));
                        if (i17 == 8) {
                            this.e = 0;
                            this.d = i18 + (q(i18 + 1) ? 2 : 1);
                        }
                        a();
                        return i19;
                    }
                    int i20 = i17 - 8;
                    this.e = i20;
                    byte[] bArr4 = this.b;
                    int i21 = this.d;
                    i16 |= (bArr4[i21] & 255) << i20;
                    if (!q(i21 + 1)) {
                        r3 = 1;
                    }
                    this.d = i21 + r3;
                }
            default:
                int i22 = this.d;
                int min = Math.min(i9, 8 - this.e);
                byte[] bArr5 = this.b;
                int i23 = i22 + 1;
                int i24 = ((bArr5[i22] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i9) {
                    i24 |= (bArr5[i23] & 255) << min;
                    min += 8;
                    i23++;
                }
                int i25 = i24 & ((-1) >>> (32 - i9));
                s(i9);
                return i25;
        }
    }

    public void j(int i9, byte[] bArr) {
        int i10 = i9 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.b;
            int i12 = this.c;
            int i13 = i12 + 1;
            this.c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i9 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.b;
            int i17 = this.c;
            this.c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            this.d = i16 - 8;
        }
        int i18 = this.d + i15;
        this.d = i18;
        byte[] bArr4 = this.b;
        int i19 = this.c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.d = 0;
            this.c = i19 + 1;
        }
        a();
    }

    public void k(int i9, byte[] bArr) {
        a.i(this.d == 0);
        System.arraycopy(this.b, this.c, bArr, 0, i9);
        this.c += i9;
        a();
    }

    public int l() {
        int i9 = 0;
        while (!h()) {
            i9++;
        }
        return ((1 << i9) - 1) + (i9 > 0 ? i(i9) : 0);
    }

    public int m() {
        int l10 = l();
        return ((l10 + 1) / 2) * (l10 % 2 == 0 ? -1 : 1);
    }

    public void n(int i9, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i9;
    }

    public void o(y yVar) {
        n(yVar.c, yVar.a);
        p(yVar.b * 8);
    }

    public void p(int i9) {
        int i10 = i9 / 8;
        this.c = i10;
        this.d = i9 - (i10 * 8);
        a();
    }

    public boolean q(int i9) {
        if (2 > i9 || i9 >= this.c) {
            return false;
        }
        byte[] bArr = this.b;
        return bArr[i9] == 3 && bArr[i9 + (-2)] == 0 && bArr[i9 - 1] == 0;
    }

    public void r() {
        switch (this.a) {
            case 0:
                int i9 = this.d + 1;
                this.d = i9;
                if (i9 == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                break;
            default:
                int i10 = this.e + 1;
                this.e = i10;
                if (i10 == 8) {
                    this.e = 0;
                    int i11 = this.d;
                    this.d = i11 + (q(i11 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void s(int i9) {
        int i10;
        switch (this.a) {
            case 0:
                int i11 = i9 / 8;
                int i12 = this.c + i11;
                this.c = i12;
                int i13 = (i9 - (i11 * 8)) + this.d;
                this.d = i13;
                if (i13 > 7) {
                    this.c = i12 + 1;
                    this.d = i13 - 8;
                }
                a();
                break;
            case 1:
                int i14 = this.d;
                int i15 = i9 / 8;
                int i16 = i14 + i15;
                this.d = i16;
                int i17 = (i9 - (i15 * 8)) + this.e;
                this.e = i17;
                if (i17 > 7) {
                    this.d = i16 + 1;
                    this.e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 > this.d) {
                        a();
                        break;
                    } else if (q(i14)) {
                        this.d++;
                        i14 += 2;
                    }
                }
            default:
                int i18 = i9 / 8;
                int i19 = this.d + i18;
                this.d = i19;
                int i20 = (i9 - (i18 * 8)) + this.e;
                this.e = i20;
                boolean z10 = true;
                if (i20 > 7) {
                    this.d = i19 + 1;
                    this.e = i20 - 8;
                }
                int i21 = this.d;
                if (i21 < 0 || (i21 >= (i10 = this.c) && (i21 != i10 || this.e != 0))) {
                    z10 = false;
                }
                a.i(z10);
                break;
        }
    }

    public void t(int i9) {
        a.i(this.d == 0);
        this.c += i9;
        a();
    }

    public x(byte[] bArr, int i9, int i10) {
        this.a = 1;
        this.b = bArr;
        this.d = i9;
        this.c = i10;
        this.e = 0;
        a();
    }

    public x(byte[] bArr) {
        this.a = 2;
        this.b = bArr;
        this.c = bArr.length;
    }

    public x(byte[] bArr, int i9) {
        this.a = 0;
        this.b = bArr;
        this.e = i9;
    }

    public x(int i9, int i10) {
        this.a = 3;
        this.c = i9;
        this.d = i10;
        this.b = new byte[(i10 * 2) - 1];
        this.e = 0;
    }
}
