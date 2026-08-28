package m6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g7.o8;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                byte[] bArr = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        bArr = o8.b(parcel, readInt);
                    } else if (c10 == 3) {
                        str = o8.h(parcel, readInt);
                    } else if (c10 == 4) {
                        str2 = o8.h(parcel, readInt);
                    } else if (c10 != 5) {
                        o8.y(parcel, readInt);
                    } else {
                        str3 = o8.h(parcel, readInt);
                    }
                }
                o8.m(parcel, z10);
                return new b0(str, bArr, str2, str3);
            case 1:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e10) {
                    throw new RuntimeException(e10);
                }
            case 2:
                int z11 = o8.z(parcel);
                String str4 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        o8.y(parcel, readInt2);
                    } else {
                        str4 = o8.h(parcel, readInt2);
                    }
                }
                o8.m(parcel, z11);
                return new s0(str4);
            case 3:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e11) {
                    throw new RuntimeException(e11);
                }
            case 4:
                int z12 = o8.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str5 = o8.h(parcel, readInt3);
                    } else if (c11 != 3) {
                        o8.y(parcel, readInt3);
                    } else {
                        str6 = o8.h(parcel, readInt3);
                    }
                }
                o8.m(parcel, z12);
                return new h0(str5, str6);
            case 5:
                try {
                    return e.a(parcel.readString());
                } catch (d e12) {
                    throw new RuntimeException(e12);
                }
            case 6:
                int z13 = o8.z(parcel);
                boolean z14 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        o8.y(parcel, readInt4);
                    } else {
                        z14 = o8.n(parcel, readInt4);
                    }
                }
                o8.m(parcel, z13);
                return new i0(z14);
            case 7:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e13) {
                    throw new RuntimeException(e13);
                }
            case 8:
                int z15 = o8.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        o8.y(parcel, readInt5);
                    } else {
                        arrayList = o8.l(parcel, readInt5, l0.CREATOR);
                    }
                }
                o8.m(parcel, z15);
                return new k0(arrayList);
            case 9:
                int z16 = o8.z(parcel);
                int i9 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        i9 = o8.u(parcel, readInt6);
                    } else if (c12 == 2) {
                        o8.B(parcel, readInt6, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c12 != 3) {
                        o8.y(parcel, readInt6);
                    } else {
                        o8.B(parcel, readInt6, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                o8.m(parcel, z16);
                return new l0(i9, s10, s11);
            case 10:
                int z17 = o8.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String str7 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        k0Var = (k0) o8.g(parcel, readInt7, k0.CREATOR);
                    } else if (c13 == 2) {
                        u0Var = (u0) o8.g(parcel, readInt7, u0.CREATOR);
                    } else if (c13 == 3) {
                        hVar = (h) o8.g(parcel, readInt7, h.CREATOR);
                    } else if (c13 == 4) {
                        v0Var = (v0) o8.g(parcel, readInt7, v0.CREATOR);
                    } else if (c13 != 5) {
                        o8.y(parcel, readInt7);
                    } else {
                        str7 = o8.h(parcel, readInt7);
                    }
                }
                o8.m(parcel, z17);
                return new g(k0Var, u0Var, hVar, v0Var, str7);
            case 11:
                int z18 = o8.z(parcel);
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
                            sVar = (s) o8.g(parcel, readInt8, s.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) o8.g(parcel, readInt8, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) o8.g(parcel, readInt8, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) o8.g(parcel, readInt8, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) o8.g(parcel, readInt8, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) o8.g(parcel, readInt8, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) o8.g(parcel, readInt8, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) o8.g(parcel, readInt8, o0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) o8.g(parcel, readInt8, t.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) o8.g(parcel, readInt8, q0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) o8.g(parcel, readInt8, s0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) o8.g(parcel, readInt8, p0.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt8);
                            break;
                    }
                }
                o8.m(parcel, z18);
                return new f(sVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, tVar, q0Var, s0Var, p0Var);
            case 12:
                int z19 = o8.z(parcel);
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        o8.y(parcel, readInt9);
                    } else {
                        z20 = o8.n(parcel, readInt9);
                    }
                }
                o8.m(parcel, z19);
                return new h(z20);
            case 13:
                int z21 = o8.z(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 1) {
                        bArr2 = o8.b(parcel, readInt10);
                    } else if (c14 != 2) {
                        o8.y(parcel, readInt10);
                    } else {
                        bArr3 = o8.b(parcel, readInt10);
                    }
                }
                o8.m(parcel, z21);
                return new u0(bArr2 == null ? null : x6.s0.t(bArr2.length, bArr2), bArr3 != null ? x6.s0.t(bArr3.length, bArr3) : null);
            case 14:
                int z22 = o8.z(parcel);
                boolean z23 = false;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 1) {
                        z23 = o8.n(parcel, readInt11);
                    } else if (c15 != 2) {
                        o8.y(parcel, readInt11);
                    } else {
                        bArr4 = o8.b(parcel, readInt11);
                    }
                }
                o8.m(parcel, z22);
                return new v0(z23, bArr4 != null ? x6.s0.t(bArr4.length, bArr4) : null);
            case 15:
                int z24 = o8.z(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 2) {
                        bArr5 = o8.b(parcel, readInt12);
                    } else if (c16 == 3) {
                        bArr6 = o8.b(parcel, readInt12);
                    } else if (c16 == 4) {
                        bArr7 = o8.b(parcel, readInt12);
                    } else if (c16 == 5) {
                        bArr8 = o8.b(parcel, readInt12);
                    } else if (c16 != 6) {
                        o8.y(parcel, readInt12);
                    } else {
                        bArr9 = o8.b(parcel, readInt12);
                    }
                }
                o8.m(parcel, z24);
                return new i(bArr5, bArr6, bArr7, bArr8, bArr9);
            case 16:
                int z25 = o8.z(parcel);
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 == 2) {
                        bArr10 = o8.b(parcel, readInt13);
                    } else if (c17 == 3) {
                        bArr11 = o8.b(parcel, readInt13);
                    } else if (c17 == 4) {
                        bArr12 = o8.b(parcel, readInt13);
                    } else if (c17 != 5) {
                        o8.y(parcel, readInt13);
                    } else {
                        strArr = o8.i(parcel, readInt13);
                    }
                }
                o8.m(parcel, z25);
                return new j(bArr10, bArr11, bArr12, strArr);
            case 17:
                int z26 = o8.z(parcel);
                int i10 = 0;
                String str8 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    char c18 = (char) readInt14;
                    if (c18 == 2) {
                        i10 = o8.u(parcel, readInt14);
                    } else if (c18 == 3) {
                        str8 = o8.h(parcel, readInt14);
                    } else if (c18 != 4) {
                        o8.y(parcel, readInt14);
                    } else {
                        i11 = o8.u(parcel, readInt14);
                    }
                }
                o8.m(parcel, z26);
                return new k(i10, i11, str8);
            case 18:
                int z27 = o8.z(parcel);
                String str9 = null;
                Boolean bool = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c19 = (char) readInt15;
                    if (c19 == 2) {
                        str9 = o8.h(parcel, readInt15);
                    } else if (c19 == 3) {
                        bool = o8.o(parcel, readInt15);
                    } else if (c19 == 4) {
                        str10 = o8.h(parcel, readInt15);
                    } else if (c19 != 5) {
                        o8.y(parcel, readInt15);
                    } else {
                        str11 = o8.h(parcel, readInt15);
                    }
                }
                o8.m(parcel, z27);
                return new m(str9, bool, str10, str11);
            case 19:
                try {
                    return o.a(parcel.readInt());
                } catch (n e14) {
                    throw new RuntimeException(e14);
                }
            case 20:
                int z28 = o8.z(parcel);
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    char c20 = (char) readInt16;
                    if (c20 == 1) {
                        j10 = o8.w(parcel, readInt16);
                    } else if (c20 == 2) {
                        bArr13 = o8.b(parcel, readInt16);
                    } else if (c20 == 3) {
                        bArr14 = o8.b(parcel, readInt16);
                    } else if (c20 != 4) {
                        o8.y(parcel, readInt16);
                    } else {
                        bArr15 = o8.b(parcel, readInt16);
                    }
                }
                o8.m(parcel, z28);
                return new w0(j10, bArr13, bArr14, bArr15);
            case 21:
                int z29 = o8.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        o8.y(parcel, readInt17);
                    } else {
                        arrayList2 = o8.l(parcel, readInt17, w0.CREATOR);
                    }
                }
                o8.m(parcel, z29);
                return new x0(arrayList2);
            case 22:
                int z30 = o8.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        o8.y(parcel, readInt18);
                    } else {
                        o8.n(parcel, readInt18);
                    }
                }
                o8.m(parcel, z30);
                return new y0();
            case 23:
                try {
                    return r.a(parcel.readInt());
                } catch (q e15) {
                    throw new IllegalArgumentException(e15);
                }
            case 24:
                int z31 = o8.z(parcel);
                String str12 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 2) {
                        o8.y(parcel, readInt19);
                    } else {
                        str12 = o8.h(parcel, readInt19);
                    }
                }
                o8.m(parcel, z31);
                return new s(str12);
            case 25:
                int z32 = o8.z(parcel);
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        o8.y(parcel, readInt20);
                    } else {
                        z33 = o8.n(parcel, readInt20);
                    }
                }
                o8.m(parcel, z32);
                return new n5.b0(z33);
            case 26:
                int z34 = o8.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z34) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        o8.y(parcel, readInt21);
                    } else {
                        i12 = o8.u(parcel, readInt21);
                    }
                }
                o8.m(parcel, z34);
                return new n5.c0(i12);
            case 27:
                int z35 = o8.z(parcel);
                String str13 = null;
                ArrayList arrayList3 = null;
                m5.i iVar = null;
                o5.a aVar = null;
                ArrayList arrayList4 = null;
                n5.b0 b0Var = null;
                n5.c0 c0Var = null;
                double d = 0.0d;
                boolean z36 = false;
                boolean z37 = false;
                boolean z38 = false;
                boolean z39 = false;
                boolean z40 = false;
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                while (parcel.dataPosition() < z35) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str13 = o8.h(parcel, readInt22);
                            break;
                        case 3:
                            arrayList3 = o8.j(parcel, readInt22);
                            break;
                        case 4:
                            z36 = o8.n(parcel, readInt22);
                            break;
                        case 5:
                            iVar = (m5.i) o8.g(parcel, readInt22, m5.i.CREATOR);
                            break;
                        case 6:
                            z37 = o8.n(parcel, readInt22);
                            break;
                        case 7:
                            aVar = (o5.a) o8.g(parcel, readInt22, o5.a.CREATOR);
                            break;
                        case '\b':
                            z38 = o8.n(parcel, readInt22);
                            break;
                        case '\t':
                            d = o8.q(parcel, readInt22);
                            break;
                        case '\n':
                            z39 = o8.n(parcel, readInt22);
                            break;
                        case 11:
                            z40 = o8.n(parcel, readInt22);
                            break;
                        case '\f':
                            z41 = o8.n(parcel, readInt22);
                            break;
                        case '\r':
                            arrayList4 = o8.j(parcel, readInt22);
                            break;
                        case 14:
                            z42 = o8.n(parcel, readInt22);
                            break;
                        case 15:
                            o8.u(parcel, readInt22);
                            break;
                        case 16:
                            z43 = o8.n(parcel, readInt22);
                            break;
                        case 17:
                            b0Var = (n5.b0) o8.g(parcel, readInt22, n5.b0.CREATOR);
                            break;
                        case 18:
                            c0Var = (n5.c0) o8.g(parcel, readInt22, n5.c0.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt22);
                            break;
                    }
                }
                o8.m(parcel, z35);
                return new n5.b(str13, arrayList3, z36, iVar, z37, aVar, z38, d, z39, z40, z41, arrayList4, z42, z43, b0Var, c0Var);
            case 28:
                int z44 = o8.z(parcel);
                String str14 = null;
                String str15 = null;
                IBinder iBinder = null;
                o5.f fVar = null;
                boolean z45 = false;
                boolean z46 = false;
                while (parcel.dataPosition() < z44) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str14 = o8.h(parcel, readInt23);
                            break;
                        case 3:
                            str15 = o8.h(parcel, readInt23);
                            break;
                        case 4:
                            iBinder = o8.t(parcel, readInt23);
                            break;
                        case 5:
                            fVar = (o5.f) o8.g(parcel, readInt23, o5.f.CREATOR);
                            break;
                        case 6:
                            z45 = o8.n(parcel, readInt23);
                            break;
                        case 7:
                            z46 = o8.n(parcel, readInt23);
                            break;
                        default:
                            o8.y(parcel, readInt23);
                            break;
                    }
                }
                o8.m(parcel, z44);
                return new o5.a(str14, str15, iBinder, fVar, z45, z46);
            default:
                int z47 = o8.z(parcel);
                ArrayList arrayList5 = null;
                int[] iArr = null;
                String str16 = null;
                IBinder iBinder2 = null;
                long j11 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                boolean z48 = false;
                boolean z49 = false;
                while (parcel.dataPosition() < z47) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            arrayList5 = o8.j(parcel, readInt24);
                            break;
                        case 3:
                            iArr = o8.d(parcel, readInt24);
                            break;
                        case 4:
                            j11 = o8.w(parcel, readInt24);
                            break;
                        case 5:
                            str16 = o8.h(parcel, readInt24);
                            break;
                        case 6:
                            i13 = o8.u(parcel, readInt24);
                            break;
                        case 7:
                            i14 = o8.u(parcel, readInt24);
                            break;
                        case '\b':
                            i15 = o8.u(parcel, readInt24);
                            break;
                        case '\t':
                            i16 = o8.u(parcel, readInt24);
                            break;
                        case '\n':
                            i17 = o8.u(parcel, readInt24);
                            break;
                        case 11:
                            i18 = o8.u(parcel, readInt24);
                            break;
                        case '\f':
                            i19 = o8.u(parcel, readInt24);
                            break;
                        case '\r':
                            i20 = o8.u(parcel, readInt24);
                            break;
                        case 14:
                            i21 = o8.u(parcel, readInt24);
                            break;
                        case 15:
                            i22 = o8.u(parcel, readInt24);
                            break;
                        case 16:
                            i23 = o8.u(parcel, readInt24);
                            break;
                        case 17:
                            i24 = o8.u(parcel, readInt24);
                            break;
                        case 18:
                            i25 = o8.u(parcel, readInt24);
                            break;
                        case 19:
                            i26 = o8.u(parcel, readInt24);
                            break;
                        case 20:
                            i27 = o8.u(parcel, readInt24);
                            break;
                        case 21:
                            i28 = o8.u(parcel, readInt24);
                            break;
                        case 22:
                            i29 = o8.u(parcel, readInt24);
                            break;
                        case 23:
                            i30 = o8.u(parcel, readInt24);
                            break;
                        case 24:
                            i31 = o8.u(parcel, readInt24);
                            break;
                        case 25:
                            i32 = o8.u(parcel, readInt24);
                            break;
                        case 26:
                            i33 = o8.u(parcel, readInt24);
                            break;
                        case 27:
                            i34 = o8.u(parcel, readInt24);
                            break;
                        case 28:
                            i35 = o8.u(parcel, readInt24);
                            break;
                        case 29:
                            i36 = o8.u(parcel, readInt24);
                            break;
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                            i37 = o8.u(parcel, readInt24);
                            break;
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                            i38 = o8.u(parcel, readInt24);
                            break;
                        case ' ':
                            i39 = o8.u(parcel, readInt24);
                            break;
                        case '!':
                            iBinder2 = o8.t(parcel, readInt24);
                            break;
                        case '\"':
                            z48 = o8.n(parcel, readInt24);
                            break;
                        case '#':
                            z49 = o8.n(parcel, readInt24);
                            break;
                        default:
                            o8.y(parcel, readInt24);
                            break;
                    }
                }
                o8.m(parcel, z47);
                return new o5.f(arrayList5, iArr, j11, str16, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, iBinder2, z48, z49);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new b0[i9];
            case 1:
                return new e0[i9];
            case 2:
                return new s0[i9];
            case 3:
                return new f0[i9];
            case 4:
                return new h0[i9];
            case 5:
                return new e[i9];
            case 6:
                return new i0[i9];
            case 7:
                return new j0[i9];
            case 8:
                return new k0[i9];
            case 9:
                return new l0[i9];
            case 10:
                return new g[i9];
            case 11:
                return new f[i9];
            case 12:
                return new h[i9];
            case 13:
                return new u0[i9];
            case 14:
                return new v0[i9];
            case 15:
                return new i[i9];
            case 16:
                return new j[i9];
            case 17:
                return new k[i9];
            case 18:
                return new m[i9];
            case 19:
                return new o[i9];
            case 20:
                return new w0[i9];
            case 21:
                return new x0[i9];
            case 22:
                return new y0[i9];
            case 23:
                return new r[i9];
            case 24:
                return new s[i9];
            case 25:
                return new n5.b0[i9];
            case 26:
                return new n5.c0[i9];
            case 27:
                return new n5.b[i9];
            case 28:
                return new o5.a[i9];
            default:
                return new o5.f[i9];
        }
    }
}
