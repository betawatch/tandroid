package a4;

import h5.v;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.ArrayList;
import java.util.Arrays;
import k7.x6;
import l3.o0;
import org.telegram.ui.Components.tp0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends j {
    public k n;
    public int o;
    public boolean p;
    public o0 q;
    public tp0 r;

    @Override // a4.j
    public final void a(long j10) {
        this.g = j10;
        this.p = j10 != 0;
        o0 o0Var = this.q;
        this.o = o0Var != null ? o0Var.e : 0;
    }

    @Override // a4.j
    public final long b(w wVar) {
        byte b10 = wVar.a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.n;
        h5.a.j(kVar);
        int i10 = kVar.a;
        o0 o0Var = (o0) kVar.b;
        int i11 = !((h5.c[]) kVar.e)[(b10 >> 1) & (255 >>> (8 - i10))].a ? o0Var.e : o0Var.f;
        long j10 = this.p ? (this.o + i11) / 4 : 0;
        byte[] bArr = wVar.a;
        int length = bArr.length;
        int i12 = wVar.c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            wVar.D(copyOf.length, copyOf);
        } else {
            wVar.E(i12);
        }
        byte[] bArr2 = wVar.a;
        int i13 = wVar.c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.p = true;
        this.o = i11;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // a4.j
    public final boolean c(w wVar, long j10, af.c cVar) {
        k kVar;
        if (this.n != null) {
            ((n0) cVar.b).getClass();
            return false;
        }
        o0 o0Var = this.q;
        int i10 = 4;
        if (o0Var == null) {
            x6.c(1, wVar, false);
            wVar.m();
            int u10 = wVar.u();
            int m9 = wVar.m();
            int i11 = wVar.i();
            if (i11 <= 0) {
                i11 = -1;
            }
            int i12 = wVar.i();
            int i13 = i12 > 0 ? i12 : -1;
            wVar.i();
            int u11 = wVar.u();
            int pow = (int) Math.pow(2.0d, u11 & 15);
            int pow2 = (int) Math.pow(2.0d, (u11 & 240) >> 4);
            wVar.u();
            ?? copyOf = Arrays.copyOf(wVar.a, wVar.c);
            o0 o0Var2 = new o0();
            o0Var2.a = u10;
            o0Var2.b = m9;
            o0Var2.c = i11;
            o0Var2.d = i13;
            o0Var2.e = pow;
            o0Var2.f = pow2;
            o0Var2.g = copyOf;
            this.q = o0Var2;
        } else {
            tp0 tp0Var = this.r;
            if (tp0Var == null) {
                this.r = x6.b(wVar, true, true);
            } else {
                int i14 = wVar.c;
                byte[] bArr = new byte[i14];
                System.arraycopy(wVar.a, 0, bArr, 0, i14);
                int i15 = o0Var.a;
                int i16 = 5;
                x6.c(5, wVar, false);
                int u12 = wVar.u() + 1;
                v vVar = new v(wVar.a);
                vVar.s(wVar.b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 16;
                    if (i17 >= u12) {
                        int i19 = 6;
                        int i20 = vVar.i(6) + 1;
                        for (int i21 = 0; i21 < i20; i21++) {
                            if (vVar.i(16) != 0) {
                                throw r1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i22 = 1;
                        int i23 = vVar.i(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < i23) {
                                int i26 = vVar.i(i18);
                                if (i26 == 0) {
                                    int i27 = 8;
                                    vVar.s(8);
                                    vVar.s(16);
                                    vVar.s(16);
                                    vVar.s(6);
                                    vVar.s(8);
                                    int i28 = vVar.i(4) + 1;
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        vVar.s(i27);
                                        i29++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (i26 != i22) {
                                        throw r1.a("floor type greater than 1 not decodable: " + i26, null);
                                    }
                                    int i30 = vVar.i(5);
                                    int[] iArr = new int[i30];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < i30; i32++) {
                                        int i33 = vVar.i(i10);
                                        iArr[i32] = i33;
                                        if (i33 > i31) {
                                            i31 = i33;
                                        }
                                    }
                                    int i34 = i31 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = vVar.i(i25) + 1;
                                        int i36 = vVar.i(2);
                                        int i37 = 8;
                                        if (i36 > 0) {
                                            vVar.s(8);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i38 = 0;
                                        for (int i39 = 1; i38 < (i39 << i36); i39 = 1) {
                                            vVar.s(i37);
                                            i38++;
                                            i37 = 8;
                                        }
                                        i35++;
                                        iArr2 = iArr3;
                                        i25 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    vVar.s(2);
                                    int i40 = vVar.i(4);
                                    int i41 = 0;
                                    int i42 = 0;
                                    for (int i43 = 0; i43 < i30; i43++) {
                                        i41 += iArr4[iArr[i43]];
                                        while (i42 < i41) {
                                            vVar.s(i40);
                                            i42++;
                                        }
                                    }
                                }
                                i24++;
                                i19 = 6;
                                i10 = 4;
                                i18 = 16;
                                i22 = 1;
                            } else {
                                int i44 = vVar.i(i19) + 1;
                                int i45 = 0;
                                while (i45 < i44) {
                                    if (vVar.i(16) > 2) {
                                        throw r1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    vVar.s(24);
                                    vVar.s(24);
                                    vVar.s(24);
                                    int i46 = vVar.i(i19) + 1;
                                    int i47 = 8;
                                    vVar.s(8);
                                    int[] iArr5 = new int[i46];
                                    for (int i48 = 0; i48 < i46; i48++) {
                                        iArr5[i48] = ((vVar.h() ? vVar.i(5) : 0) * 8) + vVar.i(3);
                                    }
                                    int i49 = 0;
                                    while (i49 < i46) {
                                        int i50 = 0;
                                        while (i50 < i47) {
                                            if ((iArr5[i49] & (1 << i50)) != 0) {
                                                vVar.s(i47);
                                            }
                                            i50++;
                                            i47 = 8;
                                        }
                                        i49++;
                                        i47 = 8;
                                    }
                                    i45++;
                                    i19 = 6;
                                }
                                int i51 = vVar.i(i19) + 1;
                                for (int i52 = 0; i52 < i51; i52++) {
                                    int i53 = vVar.i(16);
                                    if (i53 != 0) {
                                        h5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i53);
                                    } else {
                                        int i54 = vVar.h() ? vVar.i(4) + 1 : 1;
                                        if (vVar.h()) {
                                            int i55 = vVar.i(8) + 1;
                                            for (int i56 = 0; i56 < i55; i56++) {
                                                int i57 = i15 - 1;
                                                int i58 = 0;
                                                for (int i59 = i57; i59 > 0; i59 >>>= 1) {
                                                    i58++;
                                                }
                                                vVar.s(i58);
                                                int i60 = 0;
                                                while (i57 > 0) {
                                                    i60++;
                                                    i57 >>>= 1;
                                                }
                                                vVar.s(i60);
                                            }
                                        }
                                        if (vVar.i(2) != 0) {
                                            throw r1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i54 > 1) {
                                            for (int i61 = 0; i61 < i15; i61++) {
                                                vVar.s(4);
                                            }
                                        }
                                        for (int i62 = 0; i62 < i54; i62++) {
                                            vVar.s(8);
                                            vVar.s(8);
                                            vVar.s(8);
                                        }
                                    }
                                }
                                int i63 = vVar.i(6);
                                int i64 = i63 + 1;
                                h5.c[] cVarArr = new h5.c[i64];
                                for (int i65 = 0; i65 < i64; i65++) {
                                    boolean h = vVar.h();
                                    vVar.i(16);
                                    vVar.i(16);
                                    vVar.i(8);
                                    h5.c cVar2 = new h5.c();
                                    cVar2.a = h;
                                    cVarArr[i65] = cVar2;
                                }
                                if (!vVar.h()) {
                                    throw r1.a("framing bit after modes not set as expected", null);
                                }
                                int i66 = 0;
                                while (i63 > 0) {
                                    i66++;
                                    i63 >>>= 1;
                                }
                                kVar = new k(o0Var, tp0Var, bArr, cVarArr, i66);
                            }
                        }
                    } else {
                        if (vVar.i(24) != 5653314) {
                            throw r1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((vVar.d * 8) + vVar.e), null);
                        }
                        int i67 = vVar.i(16);
                        int i68 = vVar.i(24);
                        if (vVar.h()) {
                            vVar.s(i16);
                            int i69 = 0;
                            while (i69 < i68) {
                                int i70 = 0;
                                for (int i71 = i68 - i69; i71 > 0; i71 >>>= 1) {
                                    i70++;
                                }
                                i69 += vVar.i(i70);
                            }
                        } else {
                            boolean h9 = vVar.h();
                            for (int i72 = 0; i72 < i68; i72++) {
                                if (!h9) {
                                    vVar.s(i16);
                                } else if (vVar.h()) {
                                    vVar.s(i16);
                                }
                            }
                        }
                        int i73 = vVar.i(4);
                        if (i73 > 2) {
                            throw r1.a("lookup type greater than 2 not decodable: " + i73, null);
                        }
                        if (i73 == 1 || i73 == 2) {
                            vVar.s(32);
                            vVar.s(32);
                            int i74 = vVar.i(4) + 1;
                            vVar.s(1);
                            vVar.s((int) ((i73 == 1 ? i67 != 0 ? (long) Math.floor(Math.pow(i68, 1.0d / i67)) : 0L : i68 * i67) * i74));
                        }
                        i17++;
                        i16 = 5;
                    }
                }
            }
        }
        kVar = null;
        this.n = kVar;
        if (kVar == null) {
            return true;
        }
        o0 o0Var3 = (o0) kVar.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) o0Var3.g);
        arrayList.add((byte[]) kVar.d);
        e4.c a2 = x6.a(s8.v.u((String[]) ((tp0) kVar.c).b));
        m0 m0Var = new m0();
        m0Var.o = "audio/vorbis";
        m0Var.f = o0Var3.d;
        m0Var.g = o0Var3.c;
        m0Var.B = o0Var3.a;
        m0Var.C = o0Var3.b;
        m0Var.q = arrayList;
        m0Var.i = a2;
        cVar.b = new n0(m0Var);
        return true;
    }

    @Override // a4.j
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
