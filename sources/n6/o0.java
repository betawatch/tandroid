package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import h7.q8;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = q8.z(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        q8.y(parcel, readInt);
                    } else {
                        z11 = q8.n(parcel, readInt);
                    }
                }
                q8.m(parcel, z10);
                return new n0(z11);
            case 1:
                int z12 = q8.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        q8.y(parcel, readInt2);
                    } else {
                        z13 = q8.n(parcel, readInt2);
                    }
                }
                q8.m(parcel, z12);
                return new t(z13);
            case 2:
                int z14 = q8.z(parcel);
                String str = null;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        q8.y(parcel, readInt3);
                    } else {
                        str = q8.h(parcel, readInt3);
                    }
                }
                q8.m(parcel, z14);
                return new p0(str);
            case 3:
                int z15 = q8.z(parcel);
                int i10 = 0;
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        bArr = q8.b(parcel, readInt4);
                    } else if (c10 == 2) {
                        bArr2 = q8.b(parcel, readInt4);
                    } else if (c10 == 3) {
                        bArr3 = q8.b(parcel, readInt4);
                    } else if (c10 != 4) {
                        q8.y(parcel, readInt4);
                    } else {
                        i10 = q8.u(parcel, readInt4);
                    }
                }
                q8.m(parcel, z15);
                return new q0(bArr == null ? null : y6.s0.t(bArr.length, bArr), bArr2 == null ? null : y6.s0.t(bArr2.length, bArr2), bArr3 != null ? y6.s0.t(bArr3.length, bArr3) : null, i10);
            case 4:
                int z16 = q8.z(parcel);
                byte[][] bArr4 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        q8.y(parcel, readInt5);
                    } else {
                        bArr4 = q8.c(parcel, readInt5);
                    }
                }
                q8.m(parcel, z16);
                return new r0(bArr4);
            case 5:
                int z17 = q8.z(parcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList = null;
                Double d = null;
                ArrayList arrayList2 = null;
                m mVar = null;
                Integer num = null;
                h0 h0Var = null;
                String str2 = null;
                f fVar = null;
                String str3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            yVar = (y) q8.g(parcel, readInt6, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) q8.g(parcel, readInt6, b0.CREATOR);
                            break;
                        case 4:
                            bArr5 = q8.b(parcel, readInt6);
                            break;
                        case 5:
                            arrayList = q8.l(parcel, readInt6, x.CREATOR);
                            break;
                        case 6:
                            int x8 = q8.x(parcel, readInt6);
                            if (x8 != 0) {
                                q8.A(parcel, x8, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        case 7:
                            arrayList2 = q8.l(parcel, readInt6, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) q8.g(parcel, readInt6, m.CREATOR);
                            break;
                        case '\t':
                            num = q8.v(parcel, readInt6);
                            break;
                        case '\n':
                            h0Var = (h0) q8.g(parcel, readInt6, h0.CREATOR);
                            break;
                        case 11:
                            str2 = q8.h(parcel, readInt6);
                            break;
                        case '\f':
                            fVar = (f) q8.g(parcel, readInt6, f.CREATOR);
                            break;
                        case '\r':
                            str3 = q8.h(parcel, readInt6);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) q8.g(parcel, readInt6, ResultReceiver.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt6);
                            break;
                    }
                }
                q8.m(parcel, z17);
                return new v(yVar, b0Var, bArr5, arrayList, d, arrayList2, mVar, num, h0Var, str2, fVar, str3, resultReceiver);
            case 6:
                int z18 = q8.z(parcel);
                String str4 = null;
                String str5 = null;
                byte[] bArr6 = null;
                j jVar = null;
                i iVar = null;
                k kVar = null;
                g gVar = null;
                String str6 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str4 = q8.h(parcel, readInt7);
                            break;
                        case 2:
                            str5 = q8.h(parcel, readInt7);
                            break;
                        case 3:
                            bArr6 = q8.b(parcel, readInt7);
                            break;
                        case 4:
                            jVar = (j) q8.g(parcel, readInt7, j.CREATOR);
                            break;
                        case 5:
                            iVar = (i) q8.g(parcel, readInt7, i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) q8.g(parcel, readInt7, k.CREATOR);
                            break;
                        case 7:
                            gVar = (g) q8.g(parcel, readInt7, g.CREATOR);
                            break;
                        case '\b':
                            str6 = q8.h(parcel, readInt7);
                            break;
                        case '\t':
                            q8.h(parcel, readInt7);
                            break;
                        default:
                            q8.y(parcel, readInt7);
                            break;
                    }
                }
                q8.m(parcel, z18);
                return new u(str4, str5, bArr6, jVar, iVar, kVar, gVar, str6);
            case 7:
                int z19 = q8.z(parcel);
                String str7 = null;
                byte[] bArr7 = null;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt8 = parcel.readInt();
                    char c11 = (char) readInt8;
                    if (c11 == 2) {
                        str7 = q8.h(parcel, readInt8);
                    } else if (c11 == 3) {
                        bArr7 = q8.b(parcel, readInt8);
                    } else if (c11 != 4) {
                        q8.y(parcel, readInt8);
                    } else {
                        arrayList3 = q8.l(parcel, readInt8, Transport.CREATOR);
                    }
                }
                q8.m(parcel, z19);
                return new w(str7, bArr7, arrayList3);
            case 8:
                int z20 = q8.z(parcel);
                String str8 = null;
                Integer num2 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 2) {
                        str8 = q8.h(parcel, readInt9);
                    } else if (c12 != 3) {
                        q8.y(parcel, readInt9);
                    } else {
                        num2 = q8.v(parcel, readInt9);
                    }
                }
                q8.m(parcel, z20);
                return new x(str8, num2.intValue());
            case 9:
                int z21 = q8.z(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 2) {
                        str9 = q8.h(parcel, readInt10);
                    } else if (c13 == 3) {
                        str10 = q8.h(parcel, readInt10);
                    } else if (c13 != 4) {
                        q8.y(parcel, readInt10);
                    } else {
                        str11 = q8.h(parcel, readInt10);
                    }
                }
                q8.m(parcel, z21);
                return new y(str9, str10, str11);
            case 10:
                try {
                    return a0.a(parcel.readString());
                } catch (z e9) {
                    throw new RuntimeException(e9);
                }
            case 11:
                int z22 = q8.z(parcel);
                byte[] bArr8 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 2) {
                        bArr8 = q8.b(parcel, readInt11);
                    } else if (c14 == 3) {
                        str12 = q8.h(parcel, readInt11);
                    } else if (c14 == 4) {
                        str13 = q8.h(parcel, readInt11);
                    } else if (c14 != 5) {
                        q8.y(parcel, readInt11);
                    } else {
                        str14 = q8.h(parcel, readInt11);
                    }
                }
                q8.m(parcel, z22);
                return new b0(str12, bArr8, str13, str14);
            case 12:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e10) {
                    throw new RuntimeException(e10);
                }
            case 13:
                int z23 = q8.z(parcel);
                String str15 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        q8.y(parcel, readInt12);
                    } else {
                        str15 = q8.h(parcel, readInt12);
                    }
                }
                q8.m(parcel, z23);
                return new s0(str15);
            case 14:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e11) {
                    throw new RuntimeException(e11);
                }
            case 15:
                int z24 = q8.z(parcel);
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 == 2) {
                        str16 = q8.h(parcel, readInt13);
                    } else if (c15 != 3) {
                        q8.y(parcel, readInt13);
                    } else {
                        str17 = q8.h(parcel, readInt13);
                    }
                }
                q8.m(parcel, z24);
                return new h0(str16, str17);
            case 16:
                try {
                    return e.a(parcel.readString());
                } catch (d e12) {
                    throw new RuntimeException(e12);
                }
            case 17:
                int z25 = q8.z(parcel);
                boolean z26 = false;
                while (parcel.dataPosition() < z25) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        q8.y(parcel, readInt14);
                    } else {
                        z26 = q8.n(parcel, readInt14);
                    }
                }
                q8.m(parcel, z25);
                return new i0(z26);
            case 18:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e13) {
                    throw new RuntimeException(e13);
                }
            case 19:
                int z27 = q8.z(parcel);
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        q8.y(parcel, readInt15);
                    } else {
                        arrayList4 = q8.l(parcel, readInt15, l0.CREATOR);
                    }
                }
                q8.m(parcel, z27);
                return new k0(arrayList4);
            case 20:
                int z28 = q8.z(parcel);
                int i11 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 1) {
                        i11 = q8.u(parcel, readInt16);
                    } else if (c16 == 2) {
                        q8.B(parcel, readInt16, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c16 != 3) {
                        q8.y(parcel, readInt16);
                    } else {
                        q8.B(parcel, readInt16, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                q8.m(parcel, z28);
                return new l0(i11, s10, s11);
            case 21:
                int z29 = q8.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String str18 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 1) {
                        k0Var = (k0) q8.g(parcel, readInt17, k0.CREATOR);
                    } else if (c17 == 2) {
                        u0Var = (u0) q8.g(parcel, readInt17, u0.CREATOR);
                    } else if (c17 == 3) {
                        hVar = (h) q8.g(parcel, readInt17, h.CREATOR);
                    } else if (c17 == 4) {
                        v0Var = (v0) q8.g(parcel, readInt17, v0.CREATOR);
                    } else if (c17 != 5) {
                        q8.y(parcel, readInt17);
                    } else {
                        str18 = q8.h(parcel, readInt17);
                    }
                }
                q8.m(parcel, z29);
                return new g(k0Var, u0Var, hVar, v0Var, str18);
            case 22:
                int z30 = q8.z(parcel);
                s sVar = null;
                y0 y0Var = null;
                i0 i0Var = null;
                a1 a1Var = null;
                m0 m0Var = null;
                n0 n0Var = null;
                z0 z0Var = null;
                p0 p0Var = null;
                t tVar = null;
                r0 r0Var = null;
                s0 s0Var = null;
                q0 q0Var = null;
                while (parcel.dataPosition() < z30) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            sVar = (s) q8.g(parcel, readInt18, s.CREATOR);
                            break;
                        case 3:
                            y0Var = (y0) q8.g(parcel, readInt18, y0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) q8.g(parcel, readInt18, i0.CREATOR);
                            break;
                        case 5:
                            a1Var = (a1) q8.g(parcel, readInt18, a1.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) q8.g(parcel, readInt18, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) q8.g(parcel, readInt18, n0.CREATOR);
                            break;
                        case '\b':
                            z0Var = (z0) q8.g(parcel, readInt18, z0.CREATOR);
                            break;
                        case '\t':
                            p0Var = (p0) q8.g(parcel, readInt18, p0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) q8.g(parcel, readInt18, t.CREATOR);
                            break;
                        case 11:
                            r0Var = (r0) q8.g(parcel, readInt18, r0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) q8.g(parcel, readInt18, s0.CREATOR);
                            break;
                        case '\r':
                            q0Var = (q0) q8.g(parcel, readInt18, q0.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt18);
                            break;
                    }
                }
                q8.m(parcel, z30);
                return new f(sVar, y0Var, i0Var, a1Var, m0Var, n0Var, z0Var, p0Var, tVar, r0Var, s0Var, q0Var);
            case 23:
                int z31 = q8.z(parcel);
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        q8.y(parcel, readInt19);
                    } else {
                        z32 = q8.n(parcel, readInt19);
                    }
                }
                q8.m(parcel, z31);
                return new h(z32);
            case 24:
                int z33 = q8.z(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt20 = parcel.readInt();
                    char c18 = (char) readInt20;
                    if (c18 == 1) {
                        bArr9 = q8.b(parcel, readInt20);
                    } else if (c18 != 2) {
                        q8.y(parcel, readInt20);
                    } else {
                        bArr10 = q8.b(parcel, readInt20);
                    }
                }
                q8.m(parcel, z33);
                return new u0(bArr9 == null ? null : y6.s0.t(bArr9.length, bArr9), bArr10 != null ? y6.s0.t(bArr10.length, bArr10) : null);
            case 25:
                int z34 = q8.z(parcel);
                boolean z35 = false;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt21 = parcel.readInt();
                    char c19 = (char) readInt21;
                    if (c19 == 1) {
                        z35 = q8.n(parcel, readInt21);
                    } else if (c19 != 2) {
                        q8.y(parcel, readInt21);
                    } else {
                        bArr11 = q8.b(parcel, readInt21);
                    }
                }
                q8.m(parcel, z34);
                return new v0(z35, bArr11 != null ? y6.s0.t(bArr11.length, bArr11) : null);
            case 26:
                int z36 = q8.z(parcel);
                byte[] bArr12 = null;
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                byte[] bArr16 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt22 = parcel.readInt();
                    char c20 = (char) readInt22;
                    if (c20 == 2) {
                        bArr12 = q8.b(parcel, readInt22);
                    } else if (c20 == 3) {
                        bArr13 = q8.b(parcel, readInt22);
                    } else if (c20 == 4) {
                        bArr14 = q8.b(parcel, readInt22);
                    } else if (c20 == 5) {
                        bArr15 = q8.b(parcel, readInt22);
                    } else if (c20 != 6) {
                        q8.y(parcel, readInt22);
                    } else {
                        bArr16 = q8.b(parcel, readInt22);
                    }
                }
                q8.m(parcel, z36);
                return new i(bArr12, bArr13, bArr14, bArr15, bArr16);
            case 27:
                int z37 = q8.z(parcel);
                byte[] bArr17 = null;
                byte[] bArr18 = null;
                byte[] bArr19 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z37) {
                    int readInt23 = parcel.readInt();
                    char c21 = (char) readInt23;
                    if (c21 == 2) {
                        bArr17 = q8.b(parcel, readInt23);
                    } else if (c21 == 3) {
                        bArr18 = q8.b(parcel, readInt23);
                    } else if (c21 == 4) {
                        bArr19 = q8.b(parcel, readInt23);
                    } else if (c21 != 5) {
                        q8.y(parcel, readInt23);
                    } else {
                        strArr = q8.i(parcel, readInt23);
                    }
                }
                q8.m(parcel, z37);
                return new j(bArr17, bArr18, bArr19, strArr);
            case 28:
                int z38 = q8.z(parcel);
                int i12 = 0;
                String str19 = null;
                int i13 = 0;
                while (parcel.dataPosition() < z38) {
                    int readInt24 = parcel.readInt();
                    char c22 = (char) readInt24;
                    if (c22 == 2) {
                        i12 = q8.u(parcel, readInt24);
                    } else if (c22 == 3) {
                        str19 = q8.h(parcel, readInt24);
                    } else if (c22 != 4) {
                        q8.y(parcel, readInt24);
                    } else {
                        i13 = q8.u(parcel, readInt24);
                    }
                }
                q8.m(parcel, z38);
                return new k(i12, i13, str19);
            default:
                int z39 = q8.z(parcel);
                String str20 = null;
                Boolean bool = null;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt25 = parcel.readInt();
                    char c23 = (char) readInt25;
                    if (c23 == 2) {
                        str20 = q8.h(parcel, readInt25);
                    } else if (c23 == 3) {
                        bool = q8.o(parcel, readInt25);
                    } else if (c23 == 4) {
                        str21 = q8.h(parcel, readInt25);
                    } else if (c23 != 5) {
                        q8.y(parcel, readInt25);
                    } else {
                        str22 = q8.h(parcel, readInt25);
                    }
                }
                q8.m(parcel, z39);
                return new m(str20, bool, str21, str22);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new n0[i10];
            case 1:
                return new t[i10];
            case 2:
                return new p0[i10];
            case 3:
                return new q0[i10];
            case 4:
                return new r0[i10];
            case 5:
                return new v[i10];
            case 6:
                return new u[i10];
            case 7:
                return new w[i10];
            case 8:
                return new x[i10];
            case 9:
                return new y[i10];
            case 10:
                return new a0[i10];
            case 11:
                return new b0[i10];
            case 12:
                return new e0[i10];
            case 13:
                return new s0[i10];
            case 14:
                return new f0[i10];
            case 15:
                return new h0[i10];
            case 16:
                return new e[i10];
            case 17:
                return new i0[i10];
            case 18:
                return new j0[i10];
            case 19:
                return new k0[i10];
            case 20:
                return new l0[i10];
            case 21:
                return new g[i10];
            case 22:
                return new f[i10];
            case 23:
                return new h[i10];
            case 24:
                return new u0[i10];
            case 25:
                return new v0[i10];
            case 26:
                return new i[i10];
            case 27:
                return new j[i10];
            case 28:
                return new k[i10];
            default:
                return new m[i10];
        }
    }
}
