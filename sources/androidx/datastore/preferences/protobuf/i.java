package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i extends k {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public i(byte[] bArr, int i7, int i10, boolean z9) {
        this.c = bArr;
        this.d = i10 + i7;
        this.f = i7;
        this.g = i7;
    }

    public final long A() {
        int i7 = this.f;
        if (this.d - i7 < 8) {
            throw e0.e();
        }
        this.f = i7 + 8;
        byte[] bArr = this.c;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int B() {
        int i7;
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
                this.f = i13;
                return i7;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j3;
        long j10;
        long j11;
        long j12;
        int i7 = this.f;
        int i10 = this.d;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.c;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.f = i11;
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
                this.f = i12;
                return j3;
            }
        }
        return D();
    }

    public final long D() {
        long j3 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i10 = this.f;
            if (i10 == this.d) {
                throw e0.e();
            }
            this.f = i10 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.c[i10] & 128) == 0) {
                return j3;
            }
        }
        throw e0.c();
    }

    public final void E() {
        int i7 = this.d + this.e;
        this.d = i7;
        int i10 = i7 - this.g;
        int i11 = this.i;
        if (i10 <= i11) {
            this.e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.e = i12;
        this.d = i7 - i12;
    }

    public final void F(int i7) {
        if (i7 >= 0) {
            int i10 = this.d;
            int i11 = this.f;
            if (i7 <= i10 - i11) {
                this.f = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw e0.e();
        }
        throw e0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void a(int i7) {
        if (this.h != i7) {
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
    public final void d(int i7) {
        this.i = i7;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int e(int i7) {
        if (i7 < 0) {
            throw e0.d();
        }
        int b10 = b() + i7;
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
            int i7 = this.d;
            int i10 = this.f;
            if (B <= i7 - i10) {
                h j3 = h.j(i10, B, bArr2);
                this.f += B;
                return j3;
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
            int i7 = this.d;
            int i10 = this.f;
            if (B <= i7 - i10) {
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
            int i7 = this.d;
            int i10 = this.f;
            if (B <= i7 - i10) {
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
    public final boolean x(int i7) {
        int i10 = i7 & 7;
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
                a(((i7 >>> 3) << 3) | 4);
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
        int i7 = this.f;
        if (this.d - i7 < 4) {
            throw e0.e();
        }
        this.f = i7 + 4;
        byte[] bArr = this.c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }
}
