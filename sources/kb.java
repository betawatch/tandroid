// default package

import java.io.EOFException;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kb implements s84 {
    public final int a;
    public final yw7 d;
    public final ye1 e;
    public u84 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final lb b = new lb(0, null, "audio/mp4a-latm", true);
    public final yw7 c = new yw7(2048);
    public int i = -1;
    public long h = -1;

    public kb(int i) {
        this.a = i;
        yw7 yw7Var = new yw7(10);
        this.d = yw7Var;
        byte[] bArr = yw7Var.a;
        this.e = new ye1(bArr.length, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00af  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
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
        long j4 = ((vb3) t84Var).c;
        int i3 = this.a;
        int i4 = i3 & 2;
        int i5 = 0;
        if (i4 != 0 || ((i3 & 1) != 0 && j4 != -1)) {
            ye1 ye1Var = this.e;
            yw7 yw7Var = this.d;
            if (!this.j) {
                this.i = -1;
                vb3 vb3Var = (vb3) t84Var;
                vb3Var.f = 0;
                j = 0;
                if (vb3Var.d == 0) {
                    g(vb3Var);
                }
                i = 0;
                while (true) {
                    try {
                        try {
                            vb3 vb3Var2 = (vb3) t84Var;
                            if (!vb3Var2.d(yw7Var.a, i5, 2, true)) {
                                break;
                            }
                            yw7Var.N(i5);
                            if (((yw7Var.H() & 65526) == 65520 ? 1 : i5) != 0) {
                                if (!vb3Var2.d(yw7Var.a, i5, 4, true)) {
                                    break;
                                }
                                ye1Var.l(14);
                                int f = ye1Var.f(13);
                                if (f > 6) {
                                    j3 = j + f;
                                    i++;
                                    if (i == 1000) {
                                        break;
                                    }
                                    try {
                                        if (!vb3Var2.a(f - 6, true)) {
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
                                        throw bx7.a("Malformed ADTS stream", null);
                                    } catch (EOFException unused2) {
                                        j = j2;
                                        vb3Var.f = 0;
                                        if (i <= 0) {
                                        }
                                        this.j = true;
                                        yw7 yw7Var2 = this.c;
                                        int read = ((vb3) t84Var).read(yw7Var2.a, 0, 2048);
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
                vb3Var.f = 0;
                if (i <= 0) {
                    this.i = (int) (j / i);
                    i2 = -1;
                } else {
                    i2 = -1;
                    this.i = -1;
                }
                this.j = true;
                yw7 yw7Var22 = this.c;
                int read2 = ((vb3) t84Var).read(yw7Var22.a, 0, 2048);
                z = read2 == i2;
                z2 = this.l;
                lb lbVar22 = this.b;
                if (!z2) {
                    boolean z4 = (i3 & 1) != 0 && this.i > 0;
                    if (!z4 || lbVar22.s != -9223372036854775807L || z) {
                        if (z4) {
                            long j5 = lbVar22.s;
                            if (j5 != -9223372036854775807L) {
                                u84 u84Var = this.f;
                                boolean z5 = i4 != 0;
                                int i6 = this.i;
                                lbVar = lbVar22;
                                u84Var.f0(new au2(j4, this.h, (int) (((i6 << 3) * 1000000) / j5), i6, z5, true));
                                z3 = true;
                                this.l = true;
                                if (z) {
                                    return -1;
                                }
                                yw7Var22.N(0);
                                yw7Var22.M(read2);
                                if (!this.k) {
                                    lbVar.u = this.g;
                                    this.k = z3;
                                }
                                lbVar.b(yw7Var22);
                                return 0;
                            }
                        }
                        lbVar = lbVar22;
                        this.f.f0(new od0(-9223372036854775807L));
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
        yw7 yw7Var222 = this.c;
        int read22 = ((vb3) t84Var).read(yw7Var222.a, 0, 2048);
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
        vb3Var.f = 0;
        if (i <= 0) {
        }
        this.j = true;
        yw7 yw7Var2222 = this.c;
        int read222 = ((vb3) t84Var).read(yw7Var2222.a, 0, 2048);
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
        vb3Var.f = 0;
        if (i <= 0) {
        }
        this.j = true;
        yw7 yw7Var22222 = this.c;
        int read2222 = ((vb3) t84Var).read(yw7Var22222.a, 0, 2048);
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

    @Override // s84
    public final boolean c(t84 t84Var) {
        vb3 vb3Var = (vb3) t84Var;
        int g = g(vb3Var);
        int i = g;
        int i2 = 0;
        int i3 = 0;
        do {
            yw7 yw7Var = this.d;
            vb3Var.d(yw7Var.a, 0, 2, false);
            yw7Var.N(0);
            if ((yw7Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                vb3Var.d(yw7Var.a, 0, 4, false);
                ye1 ye1Var = this.e;
                ye1Var.l(14);
                int f = ye1Var.f(13);
                if (f <= 6) {
                    i++;
                    vb3Var.f = 0;
                    vb3Var.a(i, false);
                } else {
                    vb3Var.a(f - 6, false);
                    i3 += f;
                }
            } else {
                i++;
                vb3Var.f = 0;
                vb3Var.a(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - g < 8192);
        return false;
    }

    @Override // s84
    public final void d(long j, long j2) {
        this.k = false;
        this.b.d();
        this.g = j2;
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.f = u84Var;
        this.b.h(u84Var, new l4c(0, 1));
        u84Var.B();
    }

    public final int g(vb3 vb3Var) {
        int i = 0;
        while (true) {
            yw7 yw7Var = this.d;
            vb3Var.d(yw7Var.a, 0, 10, false);
            yw7Var.N(0);
            if (yw7Var.D() != 4801587) {
                break;
            }
            yw7Var.O(3);
            int z = yw7Var.z();
            i += z + 10;
            vb3Var.a(z, false);
        }
        vb3Var.f = 0;
        vb3Var.a(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
