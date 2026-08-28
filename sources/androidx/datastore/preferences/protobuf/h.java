package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = this.e + this.f;
        this.e = i9;
        int i10 = this.i + i9;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f = i12;
        this.e = i9 - i12;
    }

    public final void D(int i9) {
        if (G(i9)) {
            return;
        }
        if (i9 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - this.i) - this.g) {
            throw c0.f();
        }
        throw new c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i9) {
        int z10;
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 == 0) {
            int i12 = this.e - this.g;
            byte[] bArr = this.d;
            if (i12 >= 10) {
                while (i11 < 10) {
                    int i13 = this.g;
                    this.g = i13 + 1;
                    if (bArr[i13] < 0) {
                        i11++;
                    }
                }
                throw c0.c();
            }
            while (i11 < 10) {
                if (this.g == this.e) {
                    D(1);
                }
                int i14 = this.g;
                this.g = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            }
            throw c0.c();
            return true;
        }
        if (i10 == 1) {
            F(8);
            return true;
        }
        if (i10 == 2) {
            F(s());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
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
        a(((i9 >>> 3) << 3) | 4);
        return true;
    }

    public final void F(int i9) {
        int i10 = this.e;
        int i11 = this.g;
        int i12 = i10 - i11;
        if (i9 <= i12 && i9 >= 0) {
            this.g = i11 + i9;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i9 < 0) {
            throw c0.d();
        }
        int i13 = this.i;
        int i14 = i13 + i11;
        int i15 = i14 + i9;
        int i16 = this.j;
        if (i15 > i16) {
            F((i16 - i13) - i11);
            throw c0.f();
        }
        this.i = i14;
        this.e = 0;
        this.g = 0;
        while (i12 < i9) {
            long j10 = i9 - i12;
            try {
                long skip = fileInputStream.skip(j10);
                if (skip < 0 || skip > j10) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                }
                if (skip == 0) {
                    break;
                } else {
                    i12 += (int) skip;
                }
            } finally {
                this.i += i12;
                C();
            }
        }
        if (i12 >= i9) {
            return;
        }
        int i17 = this.e;
        int i18 = i17 - this.g;
        this.g = i17;
        D(1);
        while (true) {
            int i19 = i9 - i18;
            int i20 = this.e;
            if (i19 <= i20) {
                this.g = i19;
                return;
            } else {
                i18 += i20;
                this.g = i20;
                D(1);
            }
        }
    }

    public final boolean G(int i9) {
        int i10 = this.g;
        int i11 = i10 + i9;
        int i12 = this.e;
        if (i11 <= i12) {
            throw new IllegalStateException(j3.r0.m(i9, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.i;
        if (i9 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - i13) - i10 && i13 + i10 + i9 <= this.j) {
            byte[] bArr = this.d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.i += i10;
                this.e -= i10;
                this.g = 0;
            }
            int i14 = this.e;
            int min = Math.min(bArr.length - i14, (ConnectionsManager.DEFAULT_DATACENTER_ID - this.i) - i14);
            FileInputStream fileInputStream = this.c;
            int read = fileInputStream.read(bArr, i14, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read > 0) {
                this.e += read;
                C();
                if (this.e >= i9) {
                    return true;
                }
                return G(i9);
            }
        }
        return false;
    }

    public final void a(int i9) {
        if (this.h != i9) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.i + this.g;
    }

    public final boolean c() {
        return this.g == this.e && !G(1);
    }

    public final void d(int i9) {
        this.j = i9;
        C();
    }

    public final int e(int i9) {
        if (i9 < 0) {
            throw c0.d();
        }
        int i10 = this.i + this.g + i9;
        int i11 = this.j;
        if (i10 > i11) {
            throw c0.f();
        }
        this.j = i10;
        C();
        return i11;
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

    public final byte[] n(int i9) {
        byte[] o6 = o(i9);
        if (o6 != null) {
            return o6;
        }
        int i10 = this.g;
        int i11 = this.e;
        int i12 = i11 - i10;
        this.i += i11;
        this.g = 0;
        this.e = 0;
        ArrayList p6 = p(i9 - i12);
        byte[] bArr = new byte[i9];
        System.arraycopy(this.d, i10, bArr, 0, i12);
        int size = p6.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = p6.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] o(int i9) {
        if (i9 == 0) {
            return a0.b;
        }
        if (i9 < 0) {
            throw c0.d();
        }
        int i10 = this.i;
        int i11 = this.g;
        int i12 = i10 + i11 + i9;
        if (i12 - ConnectionsManager.DEFAULT_DATACENTER_ID > 0) {
            throw new c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.j;
        if (i12 > i13) {
            F((i13 - i10) - i11);
            throw c0.f();
        }
        int i14 = this.e - i11;
        int i15 = i9 - i14;
        FileInputStream fileInputStream = this.c;
        if (i15 >= 4096 && i15 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(this.d, this.g, bArr, 0, i14);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i14 < i9) {
            int read = fileInputStream.read(bArr, i14, i9 - i14);
            if (read == -1) {
                throw c0.f();
            }
            this.i += read;
            i14 += read;
        }
        return bArr;
    }

    public final ArrayList p(int i9) {
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int min = Math.min(i9, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.c.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw c0.f();
                }
                this.i += read;
                i10 += read;
            }
            i9 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int q() {
        int i9 = this.g;
        if (this.e - i9 < 4) {
            D(4);
            i9 = this.g;
        }
        this.g = i9 + 4;
        byte[] bArr = this.d;
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public final long r() {
        int i9 = this.g;
        if (this.e - i9 < 8) {
            D(8);
            i9 = this.g;
        }
        this.g = i9 + 8;
        byte[] bArr = this.d;
        return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public final int s() {
        int i9;
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
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.g = i13;
                return i9;
            }
        }
        return (int) u();
    }

    public final long t() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i9 = this.g;
        int i10 = this.e;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.d;
            byte b10 = bArr[i9];
            if (b10 >= 0) {
                this.g = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j10 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j10 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j13 = (-2080896) ^ i17;
                        } else {
                            long j14 = i17;
                            i12 = i9 + 5;
                            long j15 = j14 ^ (bArr[i16] << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i16 = i9 + 6;
                                long j16 = j15 ^ (bArr[i12] << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i12 = i9 + 7;
                                    j15 = j16 ^ (bArr[i16] << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i16 = i9 + 8;
                                        j16 = j15 ^ (bArr[i12] << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i12 = i9 + 9;
                                            long j17 = (j16 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i18 = i9 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
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
                        i12 = i16;
                        j10 = j13;
                    }
                }
                this.g = i12;
                return j10;
            }
        }
        return u();
    }

    public final long u() {
        long j10 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            if (this.g == this.e) {
                D(1);
            }
            int i10 = this.g;
            this.g = i10 + 1;
            j10 |= (r3 & Byte.MAX_VALUE) << i9;
            if ((this.d[i10] & 128) == 0) {
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
