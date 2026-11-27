// default package

import java.io.EOFException;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lb implements e84 {
    public final int a;
    public final ey7 d;
    public final zd1 e;
    public g84 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final mb b = new mb(0, null, "audio/mp4a-latm", true);
    public final ey7 c = new ey7(2048);
    public int i = -1;
    public long h = -1;

    public lb(int i) {
        this.a = i;
        ey7 ey7Var = new ey7(10);
        this.d = ey7Var;
        byte[] bArr = ey7Var.a;
        this.e = new zd1(bArr.length, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00af  */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        long j;
        int i;
        int i2;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        mb mbVar;
        boolean z3;
        this.f.getClass();
        long j4 = ((cb3) f84Var).c;
        int i3 = this.a;
        int i4 = i3 & 2;
        int i5 = 0;
        if (i4 != 0 || ((i3 & 1) != 0 && j4 != -1)) {
            zd1 zd1Var = this.e;
            ey7 ey7Var = this.d;
            if (!this.j) {
                this.i = -1;
                cb3 cb3Var = (cb3) f84Var;
                cb3Var.f = 0;
                j = 0;
                if (cb3Var.d == 0) {
                    g(cb3Var);
                }
                i = 0;
                while (true) {
                    try {
                        try {
                            cb3 cb3Var2 = (cb3) f84Var;
                            if (!cb3Var2.d(ey7Var.a, i5, 2, true)) {
                                break;
                            }
                            ey7Var.N(i5);
                            if (((ey7Var.H() & 65526) == 65520 ? 1 : i5) != 0) {
                                if (!cb3Var2.d(ey7Var.a, i5, 4, true)) {
                                    break;
                                }
                                zd1Var.l(14);
                                int f = zd1Var.f(13);
                                if (f > 6) {
                                    j3 = j + f;
                                    i++;
                                    if (i == 1000) {
                                        break;
                                    }
                                    try {
                                        if (!cb3Var2.a(f - 6, true)) {
                                            break;
                                        }
                                        j = j3;
                                        i5 = 0;
                                    } catch (EOFException unused) {
                                    }
                                } else {
                                    j2 = j;
                                    try {
                                        this.j = true;
                                        throw hy7.a("Malformed ADTS stream", null);
                                    } catch (EOFException unused2) {
                                        j = j2;
                                        cb3Var.f = 0;
                                        if (i <= 0) {
                                        }
                                        this.j = true;
                                        ey7 ey7Var2 = this.c;
                                        int read = ((cb3) f84Var).read(ey7Var2.a, 0, 2048);
                                        if (read == i2) {
                                        }
                                        z2 = this.l;
                                        mb mbVar2 = this.b;
                                        if (!z2) {
                                        }
                                        mbVar = mbVar2;
                                        z3 = true;
                                        if (z) {
                                        }
                                    }
                                }
                            } else {
                                i = i5;
                                break;
                            }
                        } catch (EOFException unused3) {
                        }
                    } catch (EOFException unused4) {
                    }
                }
                cb3Var.f = 0;
                if (i <= 0) {
                    this.i = (int) (j / i);
                    i2 = -1;
                } else {
                    i2 = -1;
                    this.i = -1;
                }
                this.j = true;
                ey7 ey7Var22 = this.c;
                int read2 = ((cb3) f84Var).read(ey7Var22.a, 0, 2048);
                z = read2 == i2;
                z2 = this.l;
                mb mbVar22 = this.b;
                if (!z2) {
                    boolean z4 = (i3 & 1) != 0 && this.i > 0;
                    if (!z4 || mbVar22.s != -9223372036854775807L || z) {
                        if (z4) {
                            long j5 = mbVar22.s;
                            if (j5 != -9223372036854775807L) {
                                g84 g84Var = this.f;
                                boolean z5 = i4 != 0;
                                int i6 = this.i;
                                mbVar = mbVar22;
                                g84Var.m0(new jt2(j4, this.h, (int) (((i6 << 3) * 1000000) / j5), i6, z5, true));
                                z3 = true;
                                this.l = true;
                                if (z) {
                                    return -1;
                                }
                                ey7Var22.N(0);
                                ey7Var22.M(read2);
                                if (!this.k) {
                                    mbVar.u = this.g;
                                    this.k = z3;
                                }
                                mbVar.b(ey7Var22);
                                return 0;
                            }
                        }
                        mbVar = mbVar22;
                        this.f.m0(new qc0(-9223372036854775807L));
                        z3 = true;
                        this.l = true;
                        if (z) {
                        }
                    }
                }
                mbVar = mbVar22;
                z3 = true;
                if (z) {
                }
            }
        }
        i2 = -1;
        ey7 ey7Var222 = this.c;
        int read22 = ((cb3) f84Var).read(ey7Var222.a, 0, 2048);
        if (read22 == i2) {
        }
        z2 = this.l;
        mb mbVar222 = this.b;
        if (!z2) {
        }
        mbVar = mbVar222;
        z3 = true;
        if (z) {
        }
        j = j3;
        cb3Var.f = 0;
        if (i <= 0) {
        }
        this.j = true;
        ey7 ey7Var2222 = this.c;
        int read222 = ((cb3) f84Var).read(ey7Var2222.a, 0, 2048);
        if (read222 == i2) {
        }
        z2 = this.l;
        mb mbVar2222 = this.b;
        if (!z2) {
        }
        mbVar = mbVar2222;
        z3 = true;
        if (z) {
        }
        j2 = j;
        j = j2;
        cb3Var.f = 0;
        if (i <= 0) {
        }
        this.j = true;
        ey7 ey7Var22222 = this.c;
        int read2222 = ((cb3) f84Var).read(ey7Var22222.a, 0, 2048);
        if (read2222 == i2) {
        }
        z2 = this.l;
        mb mbVar22222 = this.b;
        if (!z2) {
        }
        mbVar = mbVar22222;
        z3 = true;
        if (z) {
        }
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        cb3 cb3Var = (cb3) f84Var;
        int g = g(cb3Var);
        int i = g;
        int i2 = 0;
        int i3 = 0;
        do {
            ey7 ey7Var = this.d;
            cb3Var.d(ey7Var.a, 0, 2, false);
            ey7Var.N(0);
            if ((ey7Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                cb3Var.d(ey7Var.a, 0, 4, false);
                zd1 zd1Var = this.e;
                zd1Var.l(14);
                int f = zd1Var.f(13);
                if (f <= 6) {
                    i++;
                    cb3Var.f = 0;
                    cb3Var.a(i, false);
                } else {
                    cb3Var.a(f - 6, false);
                    i3 += f;
                }
            } else {
                i++;
                cb3Var.f = 0;
                cb3Var.a(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - g < 8192);
        return false;
    }

    @Override // e84
    public final void d(long j, long j2) {
        this.k = false;
        this.b.d();
        this.g = j2;
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.f = g84Var;
        this.b.h(g84Var, new l6c(0, 1));
        g84Var.D();
    }

    public final int g(cb3 cb3Var) {
        int i = 0;
        while (true) {
            ey7 ey7Var = this.d;
            cb3Var.d(ey7Var.a, 0, 10, false);
            ey7Var.N(0);
            if (ey7Var.D() != 4801587) {
                break;
            }
            ey7Var.O(3);
            int z = ey7Var.z();
            i += z + 10;
            cb3Var.a(z, false);
        }
        cb3Var.f = 0;
        cb3Var.a(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
