package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h {
    public int a;
    public i b;
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public h(FileInputStream fileInputStream) {
        Charset charset = a0.a;
        this.c = fileInputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final int A() {
        return s();
    }

    public final long B() {
        return t();
    }

    public final void C() {
        int i10 = this.e + this.f;
        this.e = i10;
        int i11 = this.i + i10;
        int i12 = this.j;
        if (i11 <= i12) {
            this.f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f = i13;
        this.e = i10 - i13;
    }

    public final void D(int i10) {
        if (G(i10)) {
            return;
        }
        if (i10 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - this.i) - this.g) {
            throw c0.f();
        }
        throw new c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i10) {
        int z10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.e - this.g;
            byte[] bArr = this.d;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.g;
                    this.g = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw c0.c();
            }
            while (i12 < 10) {
                if (this.g == this.e) {
                    D(1);
                }
                int i15 = this.g;
                this.g = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw c0.c();
            return true;
        }
        if (i11 == 1) {
            F(8);
            return true;
        }
        if (i11 == 2) {
            F(s());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw c0.b();
            }
            F(4);
            return true;
        }
        do {
            z10 = z();
            if (z10 == 0) {
                break;
            }
        } while (E(z10));
        a(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final void F(int i10) {
        int i11 = this.e;
        int i12 = this.g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.g = i12 + i10;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i10 < 0) {
            throw c0.d();
        }
        int i14 = this.i;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.j;
        if (i16 > i17) {
            F((i17 - i14) - i12);
            throw c0.f();
        }
        this.i = i15;
        this.e = 0;
        this.g = 0;
        while (i13 < i10) {
            long j10 = i10 - i13;
            try {
                long skip = fileInputStream.skip(j10);
                if (skip < 0 || skip > j10) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                }
                if (skip == 0) {
                    break;
                } else {
                    i13 += (int) skip;
                }
            } finally {
                this.i += i13;
                C();
            }
        }
        if (i13 >= i10) {
            return;
        }
        int i18 = this.e;
        int i19 = i18 - this.g;
        this.g = i18;
        D(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.e;
            if (i20 <= i21) {
                this.g = i20;
                return;
            } else {
                i19 += i21;
                this.g = i21;
                D(1);
            }
        }
    }

    public final boolean G(int i10) {
        int i11 = this.g;
        int i12 = i11 + i10;
        int i13 = this.e;
        if (i12 <= i13) {
            throw new IllegalStateException(j7.l1.l(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.i;
        if (i10 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - i14) - i11 && i14 + i11 + i10 <= this.j) {
            byte[] bArr = this.d;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.i += i11;
                this.e -= i11;
                this.g = 0;
            }
            int i15 = this.e;
            int min = Math.min(bArr.length - i15, (ConnectionsManager.DEFAULT_DATACENTER_ID - this.i) - i15);
            FileInputStream fileInputStream = this.c;
            int read = fileInputStream.read(bArr, i15, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read > 0) {
                this.e += read;
                C();
                if (this.e >= i10) {
                    return true;
                }
                return G(i10);
            }
        }
        return false;
    }

    public final void a(int i10) {
        if (this.h != i10) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.i + this.g;
    }

    public final boolean c() {
        return this.g == this.e && !G(1);
    }

    public final void d(int i10) {
        this.j = i10;
        C();
    }

    public final int e(int i10) {
        if (i10 < 0) {
            throw c0.d();
        }
        int i11 = this.i + this.g + i10;
        int i12 = this.j;
        if (i11 > i12) {
            throw c0.f();
        }
        this.j = i11;
        C();
        return i12;
    }

    public final boolean f() {
        return t() != 0;
    }

    public final double g() {
        return Double.longBitsToDouble(r());
    }

    public final int h() {
        return s();
    }

    public final int i() {
        return q();
    }

    public final long j() {
        return r();
    }

    public final float k() {
        return Float.intBitsToFloat(q());
    }

    public final int l() {
        return s();
    }

    public final long m() {
        return t();
    }

    public final byte[] n(int i10) {
        byte[] o10 = o(i10);
        if (o10 != null) {
            return o10;
        }
        int i11 = this.g;
        int i12 = this.e;
        int i13 = i12 - i11;
        this.i += i12;
        this.g = 0;
        this.e = 0;
        ArrayList p10 = p(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.d, i11, bArr, 0, i13);
        int size = p10.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = p10.get(i14);
            i14++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] o(int i10) {
        if (i10 == 0) {
            return a0.b;
        }
        if (i10 < 0) {
            throw c0.d();
        }
        int i11 = this.i;
        int i12 = this.g;
        int i13 = i11 + i12 + i10;
        if (i13 - ConnectionsManager.DEFAULT_DATACENTER_ID > 0) {
            throw new c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.j;
        if (i13 > i14) {
            F((i14 - i11) - i12);
            throw c0.f();
        }
        int i15 = this.e - i12;
        int i16 = i10 - i15;
        FileInputStream fileInputStream = this.c;
        if (i16 >= 4096 && i16 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.d, this.g, bArr, 0, i15);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i15 < i10) {
            int read = fileInputStream.read(bArr, i15, i10 - i15);
            if (read == -1) {
                throw c0.f();
            }
            this.i += read;
            i15 += read;
        }
        return bArr;
    }

    public final ArrayList p(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.c.read(bArr, i11, min - i11);
                if (read == -1) {
                    throw c0.f();
                }
                this.i += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int q() {
        int i10 = this.g;
        if (this.e - i10 < 4) {
            D(4);
            i10 = this.g;
        }
        this.g = i10 + 4;
        byte[] bArr = this.d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long r() {
        int i10 = this.g;
        if (this.e - i10 < 8) {
            D(8);
            i10 = this.g;
        }
        this.g = i10 + 8;
        byte[] bArr = this.d;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int s() {
        int i10;
        int i11 = this.g;
        int i12 = this.e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.g = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.g = i14;
                return i10;
            }
        }
        return (int) u();
    }

    public final long t() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.g;
        int i11 = this.e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.g = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (bArr[i17] << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (bArr[i13] << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (bArr[i17] << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (bArr[i13] << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.g = i13;
                return j10;
            }
        }
        return u();
    }

    public final long u() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.g == this.e) {
                D(1);
            }
            int i11 = this.g;
            this.g = i11 + 1;
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((this.d[i11] & 128) == 0) {
                return j10;
            }
        }
        throw c0.c();
    }

    public final int v() {
        return q();
    }

    public final long w() {
        return r();
    }

    public final int x() {
        int s10 = s();
        return (-(s10 & 1)) ^ (s10 >>> 1);
    }

    public final long y() {
        long t10 = t();
        return (-(t10 & 1)) ^ (t10 >>> 1);
    }

    public final int z() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int s10 = s();
        this.h = s10;
        if ((s10 >>> 3) != 0) {
            return s10;
        }
        throw new c0("Protocol message contained an invalid tag (zero).");
    }
}
