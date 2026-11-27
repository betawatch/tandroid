// default package

import java.io.EOFException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lc3 implements lr7 {
    public final kr7 a;
    public final long b;
    public final long c;
    public final ucb d;
    public byte e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public lc3(ucb ucbVar, long j, long j2, long j3, long j4, boolean z) {
        yve.f(j >= 0 && j2 > j);
        this.d = ucbVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = (byte) 4;
        } else {
            this.e = (byte) 0;
        }
        this.a = new kr7();
    }

    @Override // lr7
    public final zy9 C() {
        if (this.f != 0) {
            return new kc3(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int, short] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // lr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(cb3 cb3Var) {
        long j;
        kr7 kr7Var;
        ?? r14;
        long j2;
        long j3;
        kr7 kr7Var2;
        long j4;
        long j5;
        byte b = this.e;
        long j6 = this.c;
        kr7 kr7Var3 = this.a;
        if (b == 0) {
            j = 0;
            kr7Var = kr7Var3;
            long j7 = cb3Var.d;
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
                    kr7Var2 = kr7Var3;
                    j5 = -1;
                    j4 = -1;
                } else {
                    long j11 = cb3Var.d;
                    if (kr7Var3.b(cb3Var, j10)) {
                        kr7Var3.a(cb3Var, false);
                        cb3Var.f = 0;
                        long j12 = this.n;
                        long j13 = kr7Var3.b;
                        long j14 = j12 - j13;
                        j3 = 2;
                        int i = kr7Var3.d + kr7Var3.e;
                        if (0 > j14 || j14 >= 72000) {
                            if (j14 < 0) {
                                this.s = j11;
                                this.x = j13;
                            } else {
                                this.r = cb3Var.d + i;
                                this.w = j13;
                            }
                            long j15 = this.s;
                            long j16 = this.r;
                            if (j15 - j16 < 100000) {
                                this.s = j16;
                                kr7Var2 = kr7Var3;
                                j4 = -1;
                                j5 = j16;
                            } else {
                                kr7Var2 = kr7Var3;
                                j4 = -1;
                                j5 = gcc.j((((j15 - j16) * j14) / (this.x - this.w)) + (cb3Var.d - (i * (j14 <= 0 ? 2L : 1L))), j16, j15 - 1);
                            }
                        } else {
                            kr7Var2 = kr7Var3;
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
                            su3.e("No ogg page can be found.");
                            return 0L;
                        }
                        kr7Var2 = kr7Var3;
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
                    grb.g();
                    return 0L;
                }
                kr7Var2 = kr7Var3;
                j4 = -1;
                j3 = 2;
            }
            kr7 kr7Var4 = kr7Var2;
            long j17 = j4;
            while (true) {
                kr7Var4.b(cb3Var, j17);
                kr7Var4.a(cb3Var, false);
                if (kr7Var4.b > this.n) {
                    cb3Var.f = 0;
                    this.e = (byte) 4;
                    return -(this.w + j3);
                }
                cb3Var.l(kr7Var4.d + kr7Var4.e, false);
                this.r = cb3Var.d;
                this.w = kr7Var4.b;
                j17 = -1;
            }
        } else {
            j = 0;
            kr7Var = kr7Var3;
            r14 = 0;
        }
        kr7Var.a = r14;
        kr7Var.b = j;
        kr7Var.c = r14;
        kr7Var.d = r14;
        kr7Var.e = r14;
        if (!kr7Var.b(cb3Var, -1L)) {
            throw new EOFException();
        }
        kr7Var.a(cb3Var, r14);
        cb3Var.l(kr7Var.d + kr7Var.e, r14);
        while (true) {
            j2 = kr7Var.b;
            if ((kr7Var.a & 4) == 4 || !kr7Var.b(cb3Var, -1L) || cb3Var.d >= j6 || !kr7Var.a(cb3Var, true)) {
                break;
            }
            try {
                cb3Var.l(kr7Var.d + kr7Var.e, false);
            } catch (EOFException unused) {
            }
        }
        this.f = j2;
        this.e = (byte) 4;
        return this.h;
    }

    @Override // lr7
    public final void p0(long j) {
        this.n = gcc.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }
}
