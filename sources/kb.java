// default package

import java.io.EOFException;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kb implements j74 {
    public final int a;
    public final xu7 d;
    public final qd1 e;
    public l74 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final lb b = new lb(0, null, "audio/mp4a-latm", true);
    public final xu7 c = new xu7(2048);
    public int i = -1;
    public long h = -1;

    public kb(int i) {
        this.a = i;
        xu7 xu7Var = new xu7(10);
        this.d = xu7Var;
        byte[] bArr = xu7Var.a;
        this.e = new qd1(bArr.length, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00af  */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        long j;
        int i;
        int i2;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        lb lbVar;
        boolean z3;
        this.f.getClass();
        long j4 = ((ja3) k74Var).c;
        int i3 = this.a;
        int i4 = i3 & 2;
        int i5 = 0;
        if (i4 != 0 || ((i3 & 1) != 0 && j4 != -1)) {
            qd1 qd1Var = this.e;
            xu7 xu7Var = this.d;
            if (!this.j) {
                this.i = -1;
                ja3 ja3Var = (ja3) k74Var;
                ja3Var.f = 0;
                j = 0;
                if (ja3Var.d == 0) {
                    g(ja3Var);
                }
                i = 0;
                while (true) {
                    try {
                        try {
                            ja3 ja3Var2 = (ja3) k74Var;
                            if (!ja3Var2.d(xu7Var.a, i5, 2, true)) {
                                break;
                            }
                            xu7Var.N(i5);
                            if (((xu7Var.H() & 65526) == 65520 ? 1 : i5) != 0) {
                                if (!ja3Var2.d(xu7Var.a, i5, 4, true)) {
                                    break;
                                }
                                qd1Var.l(14);
                                int f = qd1Var.f(13);
                                if (f > 6) {
                                    j3 = j + f;
                                    i++;
                                    if (i == 1000) {
                                        break;
                                    }
                                    try {
                                        if (!ja3Var2.a(f - 6, true)) {
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
                                        throw av7.a("Malformed ADTS stream", null);
                                    } catch (EOFException unused2) {
                                        j = j2;
                                        ja3Var.f = 0;
                                        if (i <= 0) {
                                        }
                                        this.j = true;
                                        xu7 xu7Var2 = this.c;
                                        int read = ((ja3) k74Var).read(xu7Var2.a, 0, 2048);
                                        if (read == i2) {
                                        }
                                        z2 = this.l;
                                        lb lbVar2 = this.b;
                                        if (!z2) {
                                        }
                                        lbVar = lbVar2;
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
                ja3Var.f = 0;
                if (i <= 0) {
                    this.i = (int) (j / i);
                    i2 = -1;
                } else {
                    i2 = -1;
                    this.i = -1;
                }
                this.j = true;
                xu7 xu7Var22 = this.c;
                int read2 = ((ja3) k74Var).read(xu7Var22.a, 0, 2048);
                z = read2 == i2;
                z2 = this.l;
                lb lbVar22 = this.b;
                if (!z2) {
                    boolean z4 = (i3 & 1) != 0 && this.i > 0;
                    if (!z4 || lbVar22.s != -9223372036854775807L || z) {
                        if (z4) {
                            long j5 = lbVar22.s;
                            if (j5 != -9223372036854775807L) {
                                l74 l74Var = this.f;
                                boolean z5 = i4 != 0;
                                int i6 = this.i;
                                lbVar = lbVar22;
                                l74Var.g0(new ps2(j4, this.h, (int) (((i6 << 3) * 1000000) / j5), i6, z5, true));
                                z3 = true;
                                this.l = true;
                                if (z) {
                                    return -1;
                                }
                                xu7Var22.N(0);
                                xu7Var22.M(read2);
                                if (!this.k) {
                                    lbVar.u = this.g;
                                    this.k = z3;
                                }
                                lbVar.b(xu7Var22);
                                return 0;
                            }
                        }
                        lbVar = lbVar22;
                        this.f.g0(new oc0(-9223372036854775807L));
                        z3 = true;
                        this.l = true;
                        if (z) {
                        }
                    }
                }
                lbVar = lbVar22;
                z3 = true;
                if (z) {
                }
            }
        }
        i2 = -1;
        xu7 xu7Var222 = this.c;
        int read22 = ((ja3) k74Var).read(xu7Var222.a, 0, 2048);
        if (read22 == i2) {
        }
        z2 = this.l;
        lb lbVar222 = this.b;
        if (!z2) {
        }
        lbVar = lbVar222;
        z3 = true;
        if (z) {
        }
        j = j3;
        ja3Var.f = 0;
        if (i <= 0) {
        }
        this.j = true;
        xu7 xu7Var2222 = this.c;
        int read222 = ((ja3) k74Var).read(xu7Var2222.a, 0, 2048);
        if (read222 == i2) {
        }
        z2 = this.l;
        lb lbVar2222 = this.b;
        if (!z2) {
        }
        lbVar = lbVar2222;
        z3 = true;
        if (z) {
        }
        j2 = j;
        j = j2;
        ja3Var.f = 0;
        if (i <= 0) {
        }
        this.j = true;
        xu7 xu7Var22222 = this.c;
        int read2222 = ((ja3) k74Var).read(xu7Var22222.a, 0, 2048);
        if (read2222 == i2) {
        }
        z2 = this.l;
        lb lbVar22222 = this.b;
        if (!z2) {
        }
        lbVar = lbVar22222;
        z3 = true;
        if (z) {
        }
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        ja3 ja3Var = (ja3) k74Var;
        int g = g(ja3Var);
        int i = g;
        int i2 = 0;
        int i3 = 0;
        do {
            xu7 xu7Var = this.d;
            ja3Var.d(xu7Var.a, 0, 2, false);
            xu7Var.N(0);
            if ((xu7Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ja3Var.d(xu7Var.a, 0, 4, false);
                qd1 qd1Var = this.e;
                qd1Var.l(14);
                int f = qd1Var.f(13);
                if (f <= 6) {
                    i++;
                    ja3Var.f = 0;
                    ja3Var.a(i, false);
                } else {
                    ja3Var.a(f - 6, false);
                    i3 += f;
                }
            } else {
                i++;
                ja3Var.f = 0;
                ja3Var.a(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - g < 8192);
        return false;
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.k = false;
        this.b.d();
        this.g = j2;
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.f = l74Var;
        this.b.h(l74Var, new l2c(0, 1));
        l74Var.z();
    }

    public final int g(ja3 ja3Var) {
        int i = 0;
        while (true) {
            xu7 xu7Var = this.d;
            ja3Var.d(xu7Var.a, 0, 10, false);
            xu7Var.N(0);
            if (xu7Var.D() != 4801587) {
                break;
            }
            xu7Var.O(3);
            int z = xu7Var.z();
            i += z + 10;
            ja3Var.a(z, false);
        }
        ja3Var.f = 0;
        ja3Var.a(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
