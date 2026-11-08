package a4;

import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import f3.a0;
import f3.l0;
import h2.x;
import h9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.qs;
import q4.q;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l extends j {
    public k n;
    public int o;
    public boolean p;
    public a0 q;
    public l0 r;

    @Override // a4.j
    public final void a(long j3) {
        this.g = j3;
        this.p = j3 != 0;
        a0 a0Var = this.q;
        this.o = a0Var != null ? a0Var.e : 0;
    }

    @Override // a4.j
    public final long b(x xVar) {
        byte b10 = xVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.n;
        kVar.getClass();
        int i7 = kVar.b;
        a0 a0Var = (a0) kVar.c;
        int i10 = !((ci.a[]) kVar.f)[(b10 >> 1) & (qs.e4 >>> (8 - i7))].a ? a0Var.e : a0Var.f;
        long j3 = this.p ? (this.o + i10) / 4 : 0;
        byte[] bArr = xVar.a;
        int length = bArr.length;
        int i11 = xVar.c + 4;
        if (length < i11) {
            byte[] copyOf = Arrays.copyOf(bArr, i11);
            xVar.L(copyOf.length, copyOf);
        } else {
            xVar.M(i11);
        }
        byte[] bArr2 = xVar.a;
        int i12 = xVar.c;
        bArr2[i12 - 4] = (byte) (j3 & 255);
        bArr2[i12 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j3 >>> 24) & 255);
        this.p = true;
        this.o = i10;
        return j3;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // a4.j
    public final boolean c(x xVar, long j3, q qVar) {
        k kVar;
        if (this.n != null) {
            ((u) qVar.b).getClass();
            return false;
        }
        a0 a0Var = this.q;
        int i7 = 4;
        if (a0Var == null) {
            f3.b.w(1, xVar, false);
            xVar.s();
            int A = xVar.A();
            int s5 = xVar.s();
            int o4 = xVar.o();
            if (o4 <= 0) {
                o4 = -1;
            }
            int o10 = xVar.o();
            int i10 = o10 > 0 ? o10 : -1;
            xVar.o();
            int A2 = xVar.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & qs.P3) >> 4);
            xVar.A();
            ?? copyOf = Arrays.copyOf(xVar.a, xVar.c);
            a0 a0Var2 = new a0();
            a0Var2.a = A;
            a0Var2.b = s5;
            a0Var2.c = o4;
            a0Var2.d = i10;
            a0Var2.e = pow;
            a0Var2.f = pow2;
            a0Var2.g = copyOf;
            this.q = a0Var2;
        } else {
            l0 l0Var = this.r;
            if (l0Var == null) {
                this.r = f3.b.u(xVar, true, true);
            } else {
                int i11 = xVar.c;
                byte[] bArr = new byte[i11];
                System.arraycopy(xVar.a, 0, bArr, 0, i11);
                int i12 = a0Var.a;
                int i13 = 5;
                f3.b.w(5, xVar, false);
                int A3 = xVar.A() + 1;
                d4.f fVar = new d4.f(xVar.a);
                int i14 = 8;
                fVar.L(xVar.b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 16;
                    if (i15 < A3) {
                        int i17 = i14;
                        if (fVar.j(24) != 5653314) {
                            throw t0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.d * 8) + fVar.e));
                        }
                        int j10 = fVar.j(16);
                        int j11 = fVar.j(24);
                        if (fVar.i()) {
                            fVar.L(i13);
                            int i18 = 0;
                            while (i18 < j11) {
                                int i19 = 0;
                                for (int i20 = j11 - i18; i20 > 0; i20 >>>= 1) {
                                    i19++;
                                }
                                i18 += fVar.j(i19);
                            }
                        } else {
                            boolean i21 = fVar.i();
                            for (int i22 = 0; i22 < j11; i22++) {
                                if (!i21) {
                                    fVar.L(i13);
                                } else if (fVar.i()) {
                                    fVar.L(i13);
                                }
                            }
                        }
                        int j12 = fVar.j(4);
                        if (j12 > 2) {
                            throw t0.a(null, "lookup type greater than 2 not decodable: " + j12);
                        }
                        if (j12 == 1 || j12 == 2) {
                            fVar.L(32);
                            fVar.L(32);
                            int j13 = fVar.j(4) + 1;
                            fVar.L(1);
                            fVar.L((int) ((j12 == 1 ? j10 != 0 ? (long) Math.floor(Math.pow(j11, 1.0d / j10)) : 0L : j11 * j10) * j13));
                        }
                        i15++;
                        i14 = i17;
                        i13 = 5;
                    } else {
                        int i23 = i14;
                        int i24 = 6;
                        int j14 = fVar.j(6) + 1;
                        for (int i25 = 0; i25 < j14; i25++) {
                            if (fVar.j(16) != 0) {
                                throw t0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i26 = 1;
                        int j15 = fVar.j(6) + 1;
                        int i27 = 0;
                        while (true) {
                            int i28 = 3;
                            if (i27 < j15) {
                                int j16 = fVar.j(i16);
                                if (j16 == 0) {
                                    int i29 = i23;
                                    fVar.L(i29);
                                    fVar.L(16);
                                    fVar.L(16);
                                    fVar.L(6);
                                    fVar.L(i29);
                                    int j17 = fVar.j(4) + 1;
                                    int i30 = 0;
                                    while (i30 < j17) {
                                        fVar.L(i29);
                                        i30++;
                                        i29 = 8;
                                    }
                                } else {
                                    if (j16 != i26) {
                                        throw t0.a(null, "floor type greater than 1 not decodable: " + j16);
                                    }
                                    int j18 = fVar.j(5);
                                    int[] iArr = new int[j18];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < j18; i32++) {
                                        int j19 = fVar.j(i7);
                                        iArr[i32] = j19;
                                        if (j19 > i31) {
                                            i31 = j19;
                                        }
                                    }
                                    int i33 = i31 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = fVar.j(i28) + 1;
                                        int j20 = fVar.j(2);
                                        int i35 = i23;
                                        if (j20 > 0) {
                                            fVar.L(i35);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i36 = 0;
                                        for (int i37 = 1; i36 < (i37 << j20); i37 = 1) {
                                            fVar.L(i35);
                                            i36++;
                                            i35 = 8;
                                        }
                                        i34++;
                                        iArr2 = iArr3;
                                        i23 = 8;
                                        i28 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    fVar.L(2);
                                    int j21 = fVar.j(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < j18; i40++) {
                                        i38 += iArr4[iArr[i40]];
                                        while (i39 < i38) {
                                            fVar.L(j21);
                                            i39++;
                                        }
                                    }
                                }
                                i27++;
                                i23 = 8;
                                i24 = 6;
                                i7 = 4;
                                i16 = 16;
                                i26 = 1;
                            } else {
                                int j22 = fVar.j(i24) + 1;
                                int i41 = 0;
                                while (i41 < j22) {
                                    if (fVar.j(16) > 2) {
                                        throw t0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    fVar.L(24);
                                    fVar.L(24);
                                    fVar.L(24);
                                    int j23 = fVar.j(i24) + 1;
                                    int i42 = 8;
                                    fVar.L(8);
                                    int[] iArr5 = new int[j23];
                                    for (int i43 = 0; i43 < j23; i43++) {
                                        iArr5[i43] = ((fVar.i() ? fVar.j(5) : 0) * 8) + fVar.j(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < j23) {
                                        int i45 = 0;
                                        while (i45 < i42) {
                                            if ((iArr5[i44] & (1 << i45)) != 0) {
                                                fVar.L(i42);
                                            }
                                            i45++;
                                            i42 = 8;
                                        }
                                        i44++;
                                        i42 = 8;
                                    }
                                    i41++;
                                    i24 = 6;
                                }
                                int j24 = fVar.j(i24) + 1;
                                for (int i46 = 0; i46 < j24; i46++) {
                                    int j25 = fVar.j(16);
                                    if (j25 != 0) {
                                        h2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + j25);
                                    } else {
                                        int j26 = fVar.i() ? fVar.j(4) + 1 : 1;
                                        if (fVar.i()) {
                                            int j27 = fVar.j(8) + 1;
                                            for (int i47 = 0; i47 < j27; i47++) {
                                                int i48 = i12 - 1;
                                                int i49 = 0;
                                                for (int i50 = i48; i50 > 0; i50 >>>= 1) {
                                                    i49++;
                                                }
                                                fVar.L(i49);
                                                int i51 = 0;
                                                while (i48 > 0) {
                                                    i51++;
                                                    i48 >>>= 1;
                                                }
                                                fVar.L(i51);
                                            }
                                        }
                                        if (fVar.j(2) != 0) {
                                            throw t0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (j26 > 1) {
                                            for (int i52 = 0; i52 < i12; i52++) {
                                                fVar.L(4);
                                            }
                                        }
                                        for (int i53 = 0; i53 < j26; i53++) {
                                            fVar.L(8);
                                            fVar.L(8);
                                            fVar.L(8);
                                        }
                                    }
                                }
                                int j28 = fVar.j(6);
                                int i54 = j28 + 1;
                                ci.a[] aVarArr = new ci.a[i54];
                                for (int i55 = 0; i55 < i54; i55++) {
                                    boolean i56 = fVar.i();
                                    fVar.j(16);
                                    fVar.j(16);
                                    fVar.j(8);
                                    ci.a aVar = new ci.a();
                                    aVar.a = i56;
                                    aVarArr[i55] = aVar;
                                }
                                if (!fVar.i()) {
                                    throw t0.a(null, "framing bit after modes not set as expected");
                                }
                                int i57 = 0;
                                while (j28 > 0) {
                                    i57++;
                                    j28 >>>= 1;
                                }
                                kVar = new k(a0Var, l0Var, bArr, aVarArr, i57);
                            }
                        }
                    }
                }
            }
        }
        kVar = null;
        this.n = kVar;
        if (kVar == null) {
            return true;
        }
        a0 a0Var3 = (a0) kVar.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) a0Var3.g);
        arrayList.add((byte[]) kVar.e);
        q0 r10 = f3.b.r(i0.r(((l0) kVar.d).a));
        t tVar = new t();
        tVar.q = s0.n("audio/ogg");
        tVar.r = s0.n("audio/vorbis");
        tVar.h = a0Var3.d;
        tVar.i = a0Var3.c;
        tVar.J = a0Var3.a;
        tVar.K = a0Var3.b;
        tVar.u = arrayList;
        tVar.k = r10;
        qVar.b = new u(tVar);
        return true;
    }

    @Override // a4.j
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
