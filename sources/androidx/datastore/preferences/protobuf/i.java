package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends k {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public i(byte[] bArr, int i3, int i10, boolean z10) {
        this.c = bArr;
        this.d = i10 + i3;
        this.f = i3;
        this.g = i3;
    }

    public final long A() {
        int i3 = this.f;
        if (this.d - i3 < 8) {
            throw e0.e();
        }
        this.f = i3 + 8;
        byte[] bArr = this.c;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int B() {
        int i3;
        int i10 = this.f;
        int i11 = this.d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i3 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i3 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i3 = (-2080896) ^ i18;
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
                                                    i3 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i19;
                            }
                            i3 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f = i13;
                return i3;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i3 = this.f;
        int i10 = this.d;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.c;
            byte b10 = bArr[i3];
            if (b10 >= 0) {
                this.f = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i3 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j10 = i13 ^ (-128);
                } else {
                    int i14 = i3 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j10 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i3 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j13 = (-2080896) ^ i17;
                        } else {
                            long j14 = i17;
                            i12 = i3 + 5;
                            long j15 = j14 ^ (bArr[i16] << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i16 = i3 + 6;
                                long j16 = j15 ^ (bArr[i12] << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i12 = i3 + 7;
                                    j15 = j16 ^ (bArr[i16] << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i16 = i3 + 8;
                                        j16 = j15 ^ (bArr[i12] << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i12 = i3 + 9;
                                            long j17 = (j16 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i18 = i3 + 10;
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
                this.f = i12;
                return j10;
            }
        }
        return D();
    }

    public final long D() {
        long j10 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i10 = this.f;
            if (i10 == this.d) {
                throw e0.e();
            }
            this.f = i10 + 1;
            j10 |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.c[i10] & 128) == 0) {
                return j10;
            }
        }
        throw e0.c();
    }

    public final void E() {
        int i3 = this.d + this.e;
        this.d = i3;
        int i10 = i3 - this.g;
        int i11 = this.i;
        if (i10 <= i11) {
            this.e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.e = i12;
        this.d = i3 - i12;
    }

    public final void F(int i3) {
        if (i3 >= 0) {
            int i10 = this.d;
            int i11 = this.f;
            if (i3 <= i10 - i11) {
                this.f = i11 + i3;
                return;
            }
        }
        if (i3 >= 0) {
            throw e0.e();
        }
        throw e0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void a(int i3) {
        if (this.h != i3) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int b() {
        return this.f - this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void d(int i3) {
        this.i = i3;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int e(int i3) {
        if (i3 < 0) {
            throw e0.d();
        }
        int b10 = b() + i3;
        if (b10 < 0) {
            throw new e0("Failed to parse the message.");
        }
        int i10 = this.i;
        if (b10 > i10) {
            throw e0.e();
        }
        this.i = b10;
        E();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean f() {
        return C() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final h g() {
        byte[] bArr;
        int B = B();
        byte[] bArr2 = this.c;
        if (B > 0) {
            int i3 = this.d;
            int i10 = this.f;
            if (B <= i3 - i10) {
                h j10 = h.j(i10, B, bArr2);
                this.f += B;
                return j10;
            }
        }
        if (B == 0) {
            return h.c;
        }
        if (B > 0) {
            int i11 = this.d;
            int i12 = this.f;
            if (B <= i11 - i12) {
                int i13 = B + i12;
                this.f = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                h hVar = h.c;
                return new h(bArr);
            }
        }
        if (B > 0) {
            throw e0.e();
        }
        if (B != 0) {
            throw e0.d();
        }
        bArr = c0.b;
        h hVar2 = h.c;
        return new h(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int q() {
        int B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long r() {
        long C = C();
        return (-(C & 1)) ^ (C >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String s() {
        int B = B();
        if (B > 0) {
            int i3 = this.d;
            int i10 = this.f;
            if (B <= i3 - i10) {
                String str = new String(this.c, i10, B, c0.a);
                this.f += B;
                return str;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B < 0) {
            throw e0.d();
        }
        throw e0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String t() {
        int B = B();
        if (B > 0) {
            int i3 = this.d;
            int i10 = this.f;
            if (B <= i3 - i10) {
                String a10 = q1.a.a(i10, B, this.c);
                this.f += B;
                return a10;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B <= 0) {
            throw e0.d();
        }
        throw e0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int B = B();
        this.h = B;
        if ((B >>> 3) != 0) {
            return B;
        }
        throw new e0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean x(int i3) {
        int i10 = i3 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                F(8);
                return true;
            }
            if (i10 == 2) {
                F(B());
                return true;
            }
            if (i10 == 3) {
                y();
                a(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw e0.b();
            }
            F(4);
            return true;
        }
        int i12 = this.d - this.f;
        byte[] bArr = this.c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f;
                this.f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw e0.c();
        }
        while (i11 < 10) {
            int i14 = this.f;
            if (i14 == this.d) {
                throw e0.e();
            }
            this.f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw e0.c();
        return true;
    }

    public final int z() {
        int i3 = this.f;
        if (this.d - i3 < 4) {
            throw e0.e();
        }
        this.f = i3 + 4;
        byte[] bArr = this.c;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }
}
