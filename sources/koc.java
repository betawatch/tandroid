// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class koc extends ucb {
    public u8a n;
    public int o;
    public boolean p;
    public loc q;
    public i09 r;

    @Override // ucb
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        loc locVar = this.q;
        this.o = locVar != null ? locVar.e : 0;
    }

    @Override // ucb
    public final long b(ey7 ey7Var) {
        if ((ey7Var.a[0] & 1) == 1) {
            return -1L;
        }
        u8a u8aVar = this.n;
        u8aVar.getClass();
        byte b = ey7Var.a[0];
        loc locVar = (loc) u8aVar.a;
        jp5[] jp5VarArr = (jp5[]) u8aVar.d;
        int i = jp5VarArr[(b >> 1) & (jn7.d4 >>> (8 - s2f.a(jp5VarArr.length - 1)))].b ? locVar.f : locVar.e;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = ey7Var.a;
        int length = bArr.length;
        int i2 = ey7Var.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            ey7Var.L(copyOf.length, copyOf);
        } else {
            ey7Var.M(i2);
        }
        byte[] bArr2 = ey7Var.a;
        int i3 = ey7Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // ucb
    public final boolean c(ey7 ey7Var, long j, k7b k7bVar) {
        u8a u8aVar;
        if (this.n != null) {
            ((ko4) k7bVar.b).getClass();
            return false;
        }
        loc locVar = this.q;
        int i = 4;
        if (locVar == null) {
            s2f.c(1, ey7Var, false);
            ey7Var.s();
            int A = ey7Var.A();
            int s = ey7Var.s();
            int o = ey7Var.o();
            int i2 = o <= 0 ? -1 : o;
            int o2 = ey7Var.o();
            int i3 = o2 <= 0 ? -1 : o2;
            ey7Var.o();
            int A2 = ey7Var.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & jn7.O3) >> 4);
            ey7Var.A();
            this.q = new loc(A, s, i2, i3, pow, pow2, Arrays.copyOf(ey7Var.a, ey7Var.c));
        } else {
            i09 i09Var = this.r;
            if (i09Var == null) {
                this.r = s2f.b(ey7Var, true, true);
            } else {
                int i4 = ey7Var.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(ey7Var.a, 0, bArr, 0, i4);
                short s2 = locVar.a;
                int i5 = 5;
                s2f.c(5, ey7Var, false);
                int A3 = ey7Var.A() + 1;
                zd1 zd1Var = new zd1(ey7Var.a);
                int i6 = 3;
                zd1Var.n(ey7Var.b << 3);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    int i10 = i6;
                    if (i7 >= A3) {
                        int i11 = 6;
                        int f = zd1Var.f(6) + 1;
                        for (int i12 = 0; i12 < f; i12++) {
                            if (zd1Var.f(16) != 0) {
                                throw hy7.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i13 = 1;
                        int f2 = zd1Var.f(6) + 1;
                        int i14 = 0;
                        while (i14 < f2) {
                            int f3 = zd1Var.f(i9);
                            if (f3 == 0) {
                                int i15 = 8;
                                zd1Var.n(8);
                                zd1Var.n(16);
                                zd1Var.n(16);
                                zd1Var.n(6);
                                zd1Var.n(8);
                                int f4 = zd1Var.f(4) + 1;
                                int i16 = 0;
                                while (i16 < f4) {
                                    zd1Var.n(i15);
                                    i16++;
                                    i15 = 8;
                                }
                            } else {
                                if (f3 != i13) {
                                    throw hy7.a("floor type greater than 1 not decodable: " + f3, null);
                                }
                                int f5 = zd1Var.f(i5);
                                int[] iArr = new int[f5];
                                int i17 = -1;
                                for (int i18 = 0; i18 < f5; i18++) {
                                    int f6 = zd1Var.f(i);
                                    iArr[i18] = f6;
                                    if (f6 > i17) {
                                        i17 = f6;
                                    }
                                }
                                int i19 = i17 + 1;
                                int[] iArr2 = new int[i19];
                                int i20 = 0;
                                while (i20 < i19) {
                                    iArr2[i20] = zd1Var.f(i10) + 1;
                                    int f7 = zd1Var.f(i8);
                                    if (f7 > 0) {
                                        zd1Var.n(8);
                                    }
                                    int i21 = 0;
                                    for (int i22 = 1; i21 < (i22 << f7); i22 = 1) {
                                        zd1Var.n(8);
                                        i21++;
                                    }
                                    i20++;
                                    i10 = 3;
                                    i8 = 2;
                                }
                                zd1Var.n(i8);
                                int f8 = zd1Var.f(4);
                                int i23 = 0;
                                int i24 = 0;
                                for (int i25 = 0; i25 < f5; i25++) {
                                    i23 += iArr2[iArr[i25]];
                                    while (i24 < i23) {
                                        zd1Var.n(f8);
                                        i24++;
                                    }
                                }
                            }
                            i14++;
                            i10 = 3;
                            i11 = 6;
                            i8 = 2;
                            i = 4;
                            i9 = 16;
                            i5 = 5;
                            i13 = 1;
                        }
                        int f9 = zd1Var.f(i11) + 1;
                        int i26 = 0;
                        while (i26 < f9) {
                            if (zd1Var.f(16) > 2) {
                                throw hy7.a("residueType greater than 2 is not decodable", null);
                            }
                            zd1Var.n(24);
                            zd1Var.n(24);
                            zd1Var.n(24);
                            int f10 = zd1Var.f(i11) + 1;
                            zd1Var.n(8);
                            int[] iArr3 = new int[f10];
                            for (int i27 = 0; i27 < f10; i27++) {
                                iArr3[i27] = ((zd1Var.e() ? zd1Var.f(5) : 0) << 3) + zd1Var.f(3);
                            }
                            for (int i28 = 0; i28 < f10; i28++) {
                                for (int i29 = 0; i29 < 8; i29++) {
                                    if ((iArr3[i28] & (1 << i29)) != 0) {
                                        zd1Var.n(8);
                                    }
                                }
                            }
                            i26++;
                            i11 = 6;
                        }
                        int f11 = zd1Var.f(i11) + 1;
                        for (int i30 = 0; i30 < f11; i30++) {
                            int f12 = zd1Var.f(16);
                            if (f12 != 0) {
                                efd.c("VorbisUtil", "mapping type other than 0 not supported: " + f12);
                            } else {
                                int f13 = zd1Var.e() ? zd1Var.f(4) + 1 : 1;
                                if (zd1Var.e()) {
                                    int f14 = zd1Var.f(8) + 1;
                                    for (int i31 = 0; i31 < f14; i31++) {
                                        int i32 = s2 - 1;
                                        zd1Var.n(s2f.a(i32));
                                        zd1Var.n(s2f.a(i32));
                                    }
                                }
                                if (zd1Var.f(2) != 0) {
                                    throw hy7.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (f13 > 1) {
                                    for (int i33 = 0; i33 < s2; i33++) {
                                        zd1Var.n(4);
                                    }
                                }
                                for (int i34 = 0; i34 < f13; i34++) {
                                    zd1Var.n(8);
                                    zd1Var.n(8);
                                    zd1Var.n(8);
                                }
                            }
                        }
                        int f15 = zd1Var.f(6) + 1;
                        jp5[] jp5VarArr = new jp5[f15];
                        for (int i35 = 0; i35 < f15; i35++) {
                            boolean e = zd1Var.e();
                            zd1Var.f(16);
                            zd1Var.f(16);
                            zd1Var.f(8);
                            jp5VarArr[i35] = new jp5((byte) 4, e);
                        }
                        if (!zd1Var.e()) {
                            throw hy7.a("framing bit after modes not set as expected", null);
                        }
                        u8aVar = new u8a(locVar, i09Var, bArr, jp5VarArr);
                    } else {
                        if (zd1Var.f(24) != 5653314) {
                            throw hy7.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((zd1Var.d << 3) + zd1Var.e), null);
                        }
                        int f16 = zd1Var.f(16);
                        int f17 = zd1Var.f(24);
                        if (zd1Var.e()) {
                            zd1Var.n(5);
                            for (int i36 = 0; i36 < f17; i36 += zd1Var.f(s2f.a(f17 - i36))) {
                            }
                        } else {
                            boolean e2 = zd1Var.e();
                            for (int i37 = 0; i37 < f17; i37++) {
                                if (!e2) {
                                    zd1Var.n(5);
                                } else if (zd1Var.e()) {
                                    zd1Var.n(5);
                                }
                            }
                        }
                        int f18 = zd1Var.f(4);
                        if (f18 > 2) {
                            throw hy7.a("lookup type greater than 2 not decodable: " + f18, null);
                        }
                        if (f18 == 1 || f18 == 2) {
                            zd1Var.n(32);
                            zd1Var.n(32);
                            int f19 = zd1Var.f(4) + 1;
                            zd1Var.n(1);
                            zd1Var.n((int) ((f18 == 1 ? f16 != 0 ? (long) Math.floor(Math.pow(f17, 1.0d / f16)) : 0L : f16 * f17) * f19));
                        }
                        i7++;
                        i6 = i10;
                    }
                }
            }
        }
        u8aVar = null;
        this.n = u8aVar;
        if (u8aVar == null) {
            return true;
        }
        loc locVar2 = (loc) u8aVar.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(locVar2.g);
        arrayList.add((byte[]) u8aVar.c);
        uf7 a = moc.a(po5.r((String[]) ((i09) u8aVar.b).b));
        jo4 jo4Var = new jo4();
        jo4Var.r = dg7.n("audio/ogg");
        jo4Var.s = dg7.n("audio/vorbis");
        jo4Var.i = locVar2.d;
        jo4Var.j = locVar2.c;
        jo4Var.M = locVar2.a;
        jo4Var.O = locVar2.b;
        jo4Var.v = arrayList;
        jo4Var.l = a;
        k7bVar.b = new ko4(jo4Var);
        return true;
    }

    @Override // ucb
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
