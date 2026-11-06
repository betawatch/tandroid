package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class j extends k {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public j(FileInputStream fileInputStream) {
        Charset charset = c0.a;
        this.c = fileInputStream;
        this.d = new byte[TLObject.FLAG_12];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final byte[] A(int i7) {
        if (i7 == 0) {
            return c0.b;
        }
        if (i7 < 0) {
            throw e0.d();
        }
        int i10 = this.i;
        int i11 = this.g;
        int i12 = i10 + i11 + i7;
        if (i12 - ConnectionsManager.DEFAULT_DATACENTER_ID > 0) {
            throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.j;
        if (i12 > i13) {
            J((i13 - i10) - i11);
            throw e0.e();
        }
        int i14 = this.e - i11;
        int i15 = i7 - i14;
        FileInputStream fileInputStream = this.c;
        if (i15 >= 4096) {
            try {
                if (i15 > fileInputStream.available()) {
                    return null;
                }
            } catch (e0 e10) {
                e10.a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.d, this.g, bArr, 0, i14);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i14 < i7) {
            try {
                int read = fileInputStream.read(bArr, i14, i7 - i14);
                if (read == -1) {
                    throw e0.e();
                }
                this.i += read;
                i14 += read;
            } catch (e0 e11) {
                e11.a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, TLObject.FLAG_12);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.c.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw e0.e();
                }
                this.i += read;
                i10 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i7 = this.g;
        if (this.e - i7 < 4) {
            I(4);
            i7 = this.g;
        }
        this.g = i7 + 4;
        byte[] bArr = this.d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long D() {
        int i7 = this.g;
        if (this.e - i7 < 8) {
            I(8);
            i7 = this.g;
        }
        this.g = i7 + 8;
        byte[] bArr = this.d;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int E() {
        int i7;
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
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
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
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.g = i13;
                return i7;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j3;
        long j10;
        long j11;
        long j12;
        int i7 = this.g;
        int i10 = this.e;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.d;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.g = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j3 = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j3 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i7 + 5;
                            long j14 = j13 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i7 + 6;
                                long j15 = j14 ^ (bArr[i12] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i7 + 7;
                                    j14 = j15 ^ (bArr[i16] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j15 = j14 ^ (bArr[i12] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i7 + 9;
                                            long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j3 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j3 = j11 ^ j14;
                        }
                        i12 = i16;
                        j3 = j12;
                    }
                }
                this.g = i12;
                return j3;
            }
        }
        return G();
    }

    public final long G() {
        long j3 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.g == this.e) {
                I(1);
            }
            int i10 = this.g;
            this.g = i10 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.d[i10] & 128) == 0) {
                return j3;
            }
        }
        throw e0.c();
    }

    public final void H() {
        int i7 = this.e + this.f;
        this.e = i7;
        int i10 = this.i + i7;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f = i12;
        this.e = i7 - i12;
    }

    public final void I(int i7) {
        if (K(i7)) {
            return;
        }
        if (i7 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - this.i) - this.g) {
            throw e0.e();
        }
        throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i7) {
        int i10 = this.e;
        int i11 = this.g;
        int i12 = i10 - i11;
        if (i7 <= i12 && i7 >= 0) {
            this.g = i11 + i7;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i7 < 0) {
            throw e0.d();
        }
        int i13 = this.i;
        int i14 = i13 + i11;
        int i15 = i14 + i7;
        int i16 = this.j;
        if (i15 > i16) {
            J((i16 - i13) - i11);
            throw e0.e();
        }
        this.i = i14;
        this.e = 0;
        this.g = 0;
        while (i12 < i7) {
            long j3 = i7 - i12;
            try {
                try {
                    long skip = fileInputStream.skip(j3);
                    if (skip < 0 || skip > j3) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i12 += (int) skip;
                    }
                } catch (e0 e10) {
                    e10.a = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.i += i12;
                H();
                throw th2;
            }
        }
        this.i += i12;
        H();
        if (i12 >= i7) {
            return;
        }
        int i17 = this.e;
        int i18 = i17 - this.g;
        this.g = i17;
        I(1);
        while (true) {
            int i19 = i7 - i18;
            int i20 = this.e;
            if (i19 <= i20) {
                this.g = i19;
                return;
            } else {
                i18 += i20;
                this.g = i20;
                I(1);
            }
        }
    }

    public final boolean K(int i7) {
        FileInputStream fileInputStream = this.c;
        int i10 = this.g;
        int i11 = i10 + i7;
        int i12 = this.e;
        if (i11 <= i12) {
            throw new IllegalStateException(jg.g.k(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.i;
        if (i7 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - i13) - i10 && i13 + i10 + i7 <= this.j) {
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
            try {
                int read = fileInputStream.read(bArr, i14, Math.min(bArr.length - i14, (ConnectionsManager.DEFAULT_DATACENTER_ID - this.i) - i14));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.e += read;
                    H();
                    if (this.e >= i7) {
                        return true;
                    }
                    return K(i7);
                }
            } catch (e0 e10) {
                e10.a = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void a(int i7) {
        if (this.h != i7) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int b() {
        return this.i + this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean c() {
        return this.g == this.e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void d(int i7) {
        this.j = i7;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int e(int i7) {
        if (i7 < 0) {
            throw e0.d();
        }
        int i10 = this.i + this.g + i7;
        if (i10 < 0) {
            throw new e0("Failed to parse the message.");
        }
        int i11 = this.j;
        if (i10 > i11) {
            throw e0.e();
        }
        this.j = i10;
        H();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final h g() {
        int E = E();
        int i7 = this.e;
        int i10 = this.g;
        int i11 = i7 - i10;
        byte[] bArr = this.d;
        if (E <= i11 && E > 0) {
            h j3 = h.j(i10, E, bArr);
            this.g += E;
            return j3;
        }
        if (E == 0) {
            return h.c;
        }
        if (E < 0) {
            throw e0.d();
        }
        byte[] A = A(E);
        if (A != null) {
            return h.j(0, A.length, A);
        }
        int i12 = this.g;
        int i13 = this.e;
        int i14 = i13 - i12;
        this.i += i13;
        this.g = 0;
        this.e = 0;
        ArrayList B = B(E - i14);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        int size = B.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = B.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        h hVar = h.c;
        return new h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int q() {
        int E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long r() {
        long F = F();
        return (-(F & 1)) ^ (F >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String s() {
        int E = E();
        byte[] bArr = this.d;
        if (E > 0) {
            int i7 = this.e;
            int i10 = this.g;
            if (E <= i7 - i10) {
                String str = new String(bArr, i10, E, c0.a);
                this.g += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E < 0) {
            throw e0.d();
        }
        if (E > this.e) {
            return new String(z(E), c0.a);
        }
        I(E);
        String str2 = new String(bArr, this.g, E, c0.a);
        this.g += E;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String t() {
        int E = E();
        int i7 = this.g;
        int i10 = this.e;
        int i11 = i10 - i7;
        byte[] bArr = this.d;
        if (E <= i11 && E > 0) {
            this.g = i7 + E;
        } else {
            if (E == 0) {
                return "";
            }
            if (E < 0) {
                throw e0.d();
            }
            i7 = 0;
            if (E <= i10) {
                I(E);
                this.g = E;
            } else {
                bArr = z(E);
            }
        }
        return q1.a.a(i7, E, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int E = E();
        this.h = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw new e0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean x(int i7) {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                J(8);
                return true;
            }
            if (i10 == 2) {
                J(E());
                return true;
            }
            if (i10 == 3) {
                y();
                a(((i7 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw e0.b();
            }
            J(4);
            return true;
        }
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
            throw e0.c();
        }
        while (i11 < 10) {
            if (this.g == this.e) {
                I(1);
            }
            int i14 = this.g;
            this.g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw e0.c();
        return true;
    }

    public final byte[] z(int i7) {
        byte[] A = A(i7);
        if (A != null) {
            return A;
        }
        int i10 = this.g;
        int i11 = this.e;
        int i12 = i11 - i10;
        this.i += i11;
        this.g = 0;
        this.e = 0;
        ArrayList B = B(i7 - i12);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.d, i10, bArr, 0, i12);
        int size = B.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = B.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }
}
