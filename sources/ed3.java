// default package

import java.io.EOFException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ed3 implements oq7 {
    public final nq7 a;
    public final long b;
    public final long c;
    public final yab d;
    public byte e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public ed3(yab yabVar, long j, long j2, long j3, long j4, boolean z) {
        jte.f(j >= 0 && j2 > j);
        this.d = yabVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = (byte) 4;
        } else {
            this.e = (byte) 0;
        }
        this.a = new nq7();
    }

    @Override // oq7
    public final ix9 D() {
        if (this.f != 0) {
            return new dd3(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int, short] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // oq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(vb3 vb3Var) {
        long j;
        nq7 nq7Var;
        ?? r14;
        long j2;
        long j3;
        nq7 nq7Var2;
        long j4;
        long j5;
        byte b = this.e;
        long j6 = this.c;
        nq7 nq7Var3 = this.a;
        if (b == 0) {
            j = 0;
            nq7Var = nq7Var3;
            long j7 = vb3Var.d;
            this.h = j7;
            this.e = (byte) 1;
            long j8 = j6 - 65307;
            if (j8 > j7) {
                return j8;
            }
            r14 = 0;
        } else if (b != 1) {
            if (b == 2) {
                long j9 = this.r;
                long j10 = this.s;
                if (j9 == j10) {
                    nq7Var2 = nq7Var3;
                    j5 = -1;
                    j4 = -1;
                } else {
                    long j11 = vb3Var.d;
                    if (nq7Var3.b(vb3Var, j10)) {
                        nq7Var3.a(vb3Var, false);
                        vb3Var.f = 0;
                        long j12 = this.n;
                        long j13 = nq7Var3.b;
                        long j14 = j12 - j13;
                        j3 = 2;
                        int i = nq7Var3.d + nq7Var3.e;
                        if (0 > j14 || j14 >= 72000) {
                            if (j14 < 0) {
                                this.s = j11;
                                this.x = j13;
                            } else {
                                this.r = vb3Var.d + i;
                                this.w = j13;
                            }
                            long j15 = this.s;
                            long j16 = this.r;
                            if (j15 - j16 < 100000) {
                                this.s = j16;
                                nq7Var2 = nq7Var3;
                                j4 = -1;
                                j5 = j16;
                            } else {
                                nq7Var2 = nq7Var3;
                                j4 = -1;
                                j5 = hac.j((((j15 - j16) * j14) / (this.x - this.w)) + (vb3Var.d - (i * (j14 <= 0 ? 2L : 1L))), j16, j15 - 1);
                            }
                        } else {
                            nq7Var2 = nq7Var3;
                            j5 = -1;
                            j4 = -1;
                        }
                        if (j5 == j4) {
                            return j5;
                        }
                        this.e = (byte) 3;
                    } else {
                        j5 = this.r;
                        if (j5 == j11) {
                            wa3.d("No ogg page can be found.");
                            return 0L;
                        }
                        nq7Var2 = nq7Var3;
                        j4 = -1;
                    }
                }
                j3 = 2;
                if (j5 == j4) {
                }
            } else {
                if (b != 3) {
                    if (b == 4) {
                        return -1L;
                    }
                    rjb.h();
                    return 0L;
                }
                nq7Var2 = nq7Var3;
                j4 = -1;
                j3 = 2;
            }
            nq7 nq7Var4 = nq7Var2;
            long j17 = j4;
            while (true) {
                nq7Var4.b(vb3Var, j17);
                nq7Var4.a(vb3Var, false);
                if (nq7Var4.b > this.n) {
                    vb3Var.f = 0;
                    this.e = (byte) 4;
                    return -(this.w + j3);
                }
                vb3Var.m(nq7Var4.d + nq7Var4.e, false);
                this.r = vb3Var.d;
                this.w = nq7Var4.b;
                j17 = -1;
            }
        } else {
            j = 0;
            nq7Var = nq7Var3;
            r14 = 0;
        }
        nq7Var.a = r14;
        nq7Var.b = j;
        nq7Var.c = r14;
        nq7Var.d = r14;
        nq7Var.e = r14;
        if (!nq7Var.b(vb3Var, -1L)) {
            throw new EOFException();
        }
        nq7Var.a(vb3Var, r14);
        vb3Var.m(nq7Var.d + nq7Var.e, r14);
        while (true) {
            j2 = nq7Var.b;
            if ((nq7Var.a & 4) == 4 || !nq7Var.b(vb3Var, -1L) || vb3Var.d >= j6 || !nq7Var.a(vb3Var, true)) {
                break;
            }
            try {
                vb3Var.m(nq7Var.d + nq7Var.e, false);
            } catch (EOFException unused) {
            }
        }
        this.f = j2;
        this.e = (byte) 4;
        return this.h;
    }

    @Override // oq7
    public final void u0(long j) {
        this.n = hac.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }
}
