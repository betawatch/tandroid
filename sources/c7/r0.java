package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = w7.d0.z(parcel);
                byte[] bArr = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        bArr = w7.d0.b(parcel, readInt);
                    } else if (c10 == 3) {
                        str = w7.d0.h(parcel, readInt);
                    } else if (c10 == 4) {
                        str2 = w7.d0.h(parcel, readInt);
                    } else if (c10 != 5) {
                        w7.d0.y(parcel, readInt);
                    } else {
                        str3 = w7.d0.h(parcel, readInt);
                    }
                }
                w7.d0.m(parcel, z10);
                return new b0(str, bArr, str2, str3);
            case 1:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e7) {
                    throw new RuntimeException(e7);
                }
            case 2:
                int z11 = w7.d0.z(parcel);
                String str4 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        w7.d0.y(parcel, readInt2);
                    } else {
                        str4 = w7.d0.h(parcel, readInt2);
                    }
                }
                w7.d0.m(parcel, z11);
                return new s0(str4);
            case 3:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e10) {
                    throw new RuntimeException(e10);
                }
            case 4:
                int z12 = w7.d0.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str5 = w7.d0.h(parcel, readInt3);
                    } else if (c11 != 3) {
                        w7.d0.y(parcel, readInt3);
                    } else {
                        str6 = w7.d0.h(parcel, readInt3);
                    }
                }
                w7.d0.m(parcel, z12);
                return new h0(str5, str6);
            case 5:
                try {
                    return e.a(parcel.readString());
                } catch (d e11) {
                    throw new RuntimeException(e11);
                }
            case 6:
                int z13 = w7.d0.z(parcel);
                boolean z14 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        w7.d0.y(parcel, readInt4);
                    } else {
                        z14 = w7.d0.n(parcel, readInt4);
                    }
                }
                w7.d0.m(parcel, z13);
                return new i0(z14);
            case 7:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e12) {
                    throw new RuntimeException(e12);
                }
            case 8:
                int z15 = w7.d0.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        w7.d0.y(parcel, readInt5);
                    } else {
                        arrayList = w7.d0.l(parcel, readInt5, l0.CREATOR);
                    }
                }
                w7.d0.m(parcel, z15);
                return new k0(arrayList);
            case 9:
                int z16 = w7.d0.z(parcel);
                int i10 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        i10 = w7.d0.u(parcel, readInt6);
                    } else if (c12 == 2) {
                        w7.d0.B(parcel, readInt6, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c12 != 3) {
                        w7.d0.y(parcel, readInt6);
                    } else {
                        w7.d0.B(parcel, readInt6, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                w7.d0.m(parcel, z16);
                return new l0(i10, s10, s11);
            case 10:
                int z17 = w7.d0.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String str7 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        k0Var = (k0) w7.d0.g(parcel, readInt7, k0.CREATOR);
                    } else if (c13 == 2) {
                        u0Var = (u0) w7.d0.g(parcel, readInt7, u0.CREATOR);
                    } else if (c13 == 3) {
                        hVar = (h) w7.d0.g(parcel, readInt7, h.CREATOR);
                    } else if (c13 == 4) {
                        v0Var = (v0) w7.d0.g(parcel, readInt7, v0.CREATOR);
                    } else if (c13 != 5) {
                        w7.d0.y(parcel, readInt7);
                    } else {
                        str7 = w7.d0.h(parcel, readInt7);
                    }
                }
                w7.d0.m(parcel, z17);
                return new g(k0Var, u0Var, hVar, v0Var, str7);
            case 11:
                int z18 = w7.d0.z(parcel);
                s sVar = null;
                x0 x0Var = null;
                i0 i0Var = null;
                z0 z0Var = null;
                m0 m0Var = null;
                n0 n0Var = null;
                y0 y0Var = null;
                o0 o0Var = null;
                t tVar = null;
                q0 q0Var = null;
                s0 s0Var = null;
                p0 p0Var = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            sVar = (s) w7.d0.g(parcel, readInt8, s.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) w7.d0.g(parcel, readInt8, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) w7.d0.g(parcel, readInt8, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) w7.d0.g(parcel, readInt8, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) w7.d0.g(parcel, readInt8, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) w7.d0.g(parcel, readInt8, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) w7.d0.g(parcel, readInt8, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) w7.d0.g(parcel, readInt8, o0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) w7.d0.g(parcel, readInt8, t.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) w7.d0.g(parcel, readInt8, q0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) w7.d0.g(parcel, readInt8, s0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) w7.d0.g(parcel, readInt8, p0.CREATOR);
                            break;
                        default:
                            w7.d0.y(parcel, readInt8);
                            break;
                    }
                }
                w7.d0.m(parcel, z18);
                return new f(sVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, tVar, q0Var, s0Var, p0Var);
            case 12:
                int z19 = w7.d0.z(parcel);
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        w7.d0.y(parcel, readInt9);
                    } else {
                        z20 = w7.d0.n(parcel, readInt9);
                    }
                }
                w7.d0.m(parcel, z19);
                return new h(z20);
            case 13:
                int z21 = w7.d0.z(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 1) {
                        bArr2 = w7.d0.b(parcel, readInt10);
                    } else if (c14 != 2) {
                        w7.d0.y(parcel, readInt10);
                    } else {
                        bArr3 = w7.d0.b(parcel, readInt10);
                    }
                }
                w7.d0.m(parcel, z21);
                return new u0(bArr2 == null ? null : n7.s0.t(bArr2.length, bArr2), bArr3 != null ? n7.s0.t(bArr3.length, bArr3) : null);
            case 14:
                int z22 = w7.d0.z(parcel);
                boolean z23 = false;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 1) {
                        z23 = w7.d0.n(parcel, readInt11);
                    } else if (c15 != 2) {
                        w7.d0.y(parcel, readInt11);
                    } else {
                        bArr4 = w7.d0.b(parcel, readInt11);
                    }
                }
                w7.d0.m(parcel, z22);
                return new v0(z23, bArr4 != null ? n7.s0.t(bArr4.length, bArr4) : null);
            case 15:
                int z24 = w7.d0.z(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 2) {
                        bArr5 = w7.d0.b(parcel, readInt12);
                    } else if (c16 == 3) {
                        bArr6 = w7.d0.b(parcel, readInt12);
                    } else if (c16 == 4) {
                        bArr7 = w7.d0.b(parcel, readInt12);
                    } else if (c16 == 5) {
                        bArr8 = w7.d0.b(parcel, readInt12);
                    } else if (c16 != 6) {
                        w7.d0.y(parcel, readInt12);
                    } else {
                        bArr9 = w7.d0.b(parcel, readInt12);
                    }
                }
                w7.d0.m(parcel, z24);
                return new i(bArr5, bArr6, bArr7, bArr8, bArr9);
            case 16:
                int z25 = w7.d0.z(parcel);
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 == 2) {
                        bArr10 = w7.d0.b(parcel, readInt13);
                    } else if (c17 == 3) {
                        bArr11 = w7.d0.b(parcel, readInt13);
                    } else if (c17 == 4) {
                        bArr12 = w7.d0.b(parcel, readInt13);
                    } else if (c17 != 5) {
                        w7.d0.y(parcel, readInt13);
                    } else {
                        strArr = w7.d0.i(parcel, readInt13);
                    }
                }
                w7.d0.m(parcel, z25);
                return new j(bArr10, bArr11, bArr12, strArr);
            case 17:
                int z26 = w7.d0.z(parcel);
                int i11 = 0;
                String str8 = null;
                int i12 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    char c18 = (char) readInt14;
                    if (c18 == 2) {
                        i11 = w7.d0.u(parcel, readInt14);
                    } else if (c18 == 3) {
                        str8 = w7.d0.h(parcel, readInt14);
                    } else if (c18 != 4) {
                        w7.d0.y(parcel, readInt14);
                    } else {
                        i12 = w7.d0.u(parcel, readInt14);
                    }
                }
                w7.d0.m(parcel, z26);
                return new k(i11, i12, str8);
            case 18:
                int z27 = w7.d0.z(parcel);
                String str9 = null;
                Boolean bool = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c19 = (char) readInt15;
                    if (c19 == 2) {
                        str9 = w7.d0.h(parcel, readInt15);
                    } else if (c19 == 3) {
                        bool = w7.d0.o(parcel, readInt15);
                    } else if (c19 == 4) {
                        str10 = w7.d0.h(parcel, readInt15);
                    } else if (c19 != 5) {
                        w7.d0.y(parcel, readInt15);
                    } else {
                        str11 = w7.d0.h(parcel, readInt15);
                    }
                }
                w7.d0.m(parcel, z27);
                return new m(str9, bool, str10, str11);
            case 19:
                try {
                    return o.a(parcel.readInt());
                } catch (n e13) {
                    throw new RuntimeException(e13);
                }
            case 20:
                int z28 = w7.d0.z(parcel);
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                long j3 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    char c20 = (char) readInt16;
                    if (c20 == 1) {
                        j3 = w7.d0.w(parcel, readInt16);
                    } else if (c20 == 2) {
                        bArr13 = w7.d0.b(parcel, readInt16);
                    } else if (c20 == 3) {
                        bArr14 = w7.d0.b(parcel, readInt16);
                    } else if (c20 != 4) {
                        w7.d0.y(parcel, readInt16);
                    } else {
                        bArr15 = w7.d0.b(parcel, readInt16);
                    }
                }
                w7.d0.m(parcel, z28);
                return new w0(j3, bArr13, bArr14, bArr15);
            case 21:
                int z29 = w7.d0.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        w7.d0.y(parcel, readInt17);
                    } else {
                        arrayList2 = w7.d0.l(parcel, readInt17, w0.CREATOR);
                    }
                }
                w7.d0.m(parcel, z29);
                return new x0(arrayList2);
            case 22:
                int z30 = w7.d0.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        w7.d0.y(parcel, readInt18);
                    } else {
                        w7.d0.n(parcel, readInt18);
                    }
                }
                w7.d0.m(parcel, z30);
                return new y0();
            case 23:
                try {
                    return r.a(parcel.readInt());
                } catch (q e14) {
                    throw new IllegalArgumentException(e14);
                }
            case 24:
                int z31 = w7.d0.z(parcel);
                String str12 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 2) {
                        w7.d0.y(parcel, readInt19);
                    } else {
                        str12 = w7.d0.h(parcel, readInt19);
                    }
                }
                w7.d0.m(parcel, z31);
                return new s(str12);
            case 25:
                int z32 = w7.d0.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z32) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        w7.d0.y(parcel, readInt20);
                    } else {
                        bundle = w7.d0.a(parcel, readInt20);
                    }
                }
                w7.d0.m(parcel, z32);
                return new com.google.firebase.messaging.r(bundle);
            case 26:
                int z33 = w7.d0.z(parcel);
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        w7.d0.y(parcel, readInt21);
                    } else {
                        z34 = w7.d0.n(parcel, readInt21);
                    }
                }
                w7.d0.m(parcel, z33);
                return new d6.a0(z34);
            case 27:
                int z35 = w7.d0.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z35) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 2) {
                        w7.d0.y(parcel, readInt22);
                    } else {
                        i13 = w7.d0.u(parcel, readInt22);
                    }
                }
                w7.d0.m(parcel, z35);
                return new d6.b0(i13);
            case 28:
                int z36 = w7.d0.z(parcel);
                String str13 = null;
                ArrayList arrayList3 = null;
                c6.i iVar = null;
                e6.a aVar = null;
                ArrayList arrayList4 = null;
                d6.a0 a0Var = null;
                d6.b0 b0Var = null;
                double d = 0.0d;
                boolean z37 = false;
                boolean z38 = false;
                boolean z39 = false;
                boolean z40 = false;
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                boolean z44 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str13 = w7.d0.h(parcel, readInt23);
                            break;
                        case 3:
                            arrayList3 = w7.d0.j(parcel, readInt23);
                            break;
                        case 4:
                            z37 = w7.d0.n(parcel, readInt23);
                            break;
                        case 5:
                            iVar = (c6.i) w7.d0.g(parcel, readInt23, c6.i.CREATOR);
                            break;
                        case 6:
                            z38 = w7.d0.n(parcel, readInt23);
                            break;
                        case 7:
                            aVar = (e6.a) w7.d0.g(parcel, readInt23, e6.a.CREATOR);
                            break;
                        case '\b':
                            z39 = w7.d0.n(parcel, readInt23);
                            break;
                        case '\t':
                            d = w7.d0.q(parcel, readInt23);
                            break;
                        case '\n':
                            z40 = w7.d0.n(parcel, readInt23);
                            break;
                        case 11:
                            z41 = w7.d0.n(parcel, readInt23);
                            break;
                        case '\f':
                            z42 = w7.d0.n(parcel, readInt23);
                            break;
                        case '\r':
                            arrayList4 = w7.d0.j(parcel, readInt23);
                            break;
                        case 14:
                            z43 = w7.d0.n(parcel, readInt23);
                            break;
                        case 15:
                            w7.d0.u(parcel, readInt23);
                            break;
                        case 16:
                            z44 = w7.d0.n(parcel, readInt23);
                            break;
                        case 17:
                            a0Var = (d6.a0) w7.d0.g(parcel, readInt23, d6.a0.CREATOR);
                            break;
                        case 18:
                            b0Var = (d6.b0) w7.d0.g(parcel, readInt23, d6.b0.CREATOR);
                            break;
                        default:
                            w7.d0.y(parcel, readInt23);
                            break;
                    }
                }
                w7.d0.m(parcel, z36);
                return new d6.b(str13, arrayList3, z37, iVar, z38, aVar, z39, d, z40, z41, z42, arrayList4, z43, z44, a0Var, b0Var);
            default:
                int z45 = w7.d0.z(parcel);
                String str14 = null;
                String str15 = null;
                IBinder iBinder = null;
                e6.f fVar = null;
                boolean z46 = false;
                boolean z47 = false;
                while (parcel.dataPosition() < z45) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            str14 = w7.d0.h(parcel, readInt24);
                            break;
                        case 3:
                            str15 = w7.d0.h(parcel, readInt24);
                            break;
                        case 4:
                            iBinder = w7.d0.t(parcel, readInt24);
                            break;
                        case 5:
                            fVar = (e6.f) w7.d0.g(parcel, readInt24, e6.f.CREATOR);
                            break;
                        case 6:
                            z46 = w7.d0.n(parcel, readInt24);
                            break;
                        case 7:
                            z47 = w7.d0.n(parcel, readInt24);
                            break;
                        default:
                            w7.d0.y(parcel, readInt24);
                            break;
                    }
                }
                w7.d0.m(parcel, z45);
                return new e6.a(str14, str15, iBinder, fVar, z46, z47);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b0[i10];
            case 1:
                return new e0[i10];
            case 2:
                return new s0[i10];
            case 3:
                return new f0[i10];
            case 4:
                return new h0[i10];
            case 5:
                return new e[i10];
            case 6:
                return new i0[i10];
            case 7:
                return new j0[i10];
            case 8:
                return new k0[i10];
            case 9:
                return new l0[i10];
            case 10:
                return new g[i10];
            case 11:
                return new f[i10];
            case 12:
                return new h[i10];
            case 13:
                return new u0[i10];
            case 14:
                return new v0[i10];
            case 15:
                return new i[i10];
            case 16:
                return new j[i10];
            case 17:
                return new k[i10];
            case 18:
                return new m[i10];
            case 19:
                return new o[i10];
            case 20:
                return new w0[i10];
            case 21:
                return new x0[i10];
            case 22:
                return new y0[i10];
            case 23:
                return new r[i10];
            case 24:
                return new s[i10];
            case 25:
                return new com.google.firebase.messaging.r[i10];
            case 26:
                return new d6.a0[i10];
            case 27:
                return new d6.b0[i10];
            case 28:
                return new d6.b[i10];
            default:
                return new e6.a[i10];
        }
    }
}
