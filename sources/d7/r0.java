package d7;

import a8.bf;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                try {
                    return a0.a(parcel.readString());
                } catch (z e) {
                    throw new RuntimeException(e);
                }
            case 1:
                int z10 = bf.z(parcel);
                byte[] bArr = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        bArr = bf.b(parcel, readInt);
                    } else if (c10 == 3) {
                        str = bf.h(parcel, readInt);
                    } else if (c10 == 4) {
                        str2 = bf.h(parcel, readInt);
                    } else if (c10 != 5) {
                        bf.y(parcel, readInt);
                    } else {
                        str3 = bf.h(parcel, readInt);
                    }
                }
                bf.m(parcel, z10);
                return new b0(str, bArr, str2, str3);
            case 2:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e10) {
                    throw new RuntimeException(e10);
                }
            case 3:
                int z11 = bf.z(parcel);
                String str4 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        bf.y(parcel, readInt2);
                    } else {
                        str4 = bf.h(parcel, readInt2);
                    }
                }
                bf.m(parcel, z11);
                return new s0(str4);
            case 4:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e11) {
                    throw new RuntimeException(e11);
                }
            case 5:
                int z12 = bf.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str5 = bf.h(parcel, readInt3);
                    } else if (c11 != 3) {
                        bf.y(parcel, readInt3);
                    } else {
                        str6 = bf.h(parcel, readInt3);
                    }
                }
                bf.m(parcel, z12);
                return new h0(str5, str6);
            case 6:
                try {
                    return e.a(parcel.readString());
                } catch (d e12) {
                    throw new RuntimeException(e12);
                }
            case 7:
                int z13 = bf.z(parcel);
                boolean z14 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        bf.y(parcel, readInt4);
                    } else {
                        z14 = bf.n(parcel, readInt4);
                    }
                }
                bf.m(parcel, z13);
                return new i0(z14);
            case 8:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e13) {
                    throw new RuntimeException(e13);
                }
            case 9:
                int z15 = bf.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        bf.y(parcel, readInt5);
                    } else {
                        arrayList = bf.l(parcel, readInt5, l0.CREATOR);
                    }
                }
                bf.m(parcel, z15);
                return new k0(arrayList);
            case 10:
                int z16 = bf.z(parcel);
                int i10 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        i10 = bf.u(parcel, readInt6);
                    } else if (c12 == 2) {
                        bf.B(parcel, readInt6, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c12 != 3) {
                        bf.y(parcel, readInt6);
                    } else {
                        bf.B(parcel, readInt6, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                bf.m(parcel, z16);
                return new l0(i10, s10, s11);
            case 11:
                int z17 = bf.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String str7 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        k0Var = (k0) bf.g(parcel, readInt7, k0.CREATOR);
                    } else if (c13 == 2) {
                        u0Var = (u0) bf.g(parcel, readInt7, u0.CREATOR);
                    } else if (c13 == 3) {
                        hVar = (h) bf.g(parcel, readInt7, h.CREATOR);
                    } else if (c13 == 4) {
                        v0Var = (v0) bf.g(parcel, readInt7, v0.CREATOR);
                    } else if (c13 != 5) {
                        bf.y(parcel, readInt7);
                    } else {
                        str7 = bf.h(parcel, readInt7);
                    }
                }
                bf.m(parcel, z17);
                return new g(k0Var, u0Var, hVar, v0Var, str7);
            case 12:
                int z18 = bf.z(parcel);
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
                            sVar = (s) bf.g(parcel, readInt8, s.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) bf.g(parcel, readInt8, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) bf.g(parcel, readInt8, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) bf.g(parcel, readInt8, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) bf.g(parcel, readInt8, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) bf.g(parcel, readInt8, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) bf.g(parcel, readInt8, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) bf.g(parcel, readInt8, o0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) bf.g(parcel, readInt8, t.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) bf.g(parcel, readInt8, q0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) bf.g(parcel, readInt8, s0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) bf.g(parcel, readInt8, p0.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt8);
                            break;
                    }
                }
                bf.m(parcel, z18);
                return new f(sVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, tVar, q0Var, s0Var, p0Var);
            case 13:
                int z19 = bf.z(parcel);
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        bf.y(parcel, readInt9);
                    } else {
                        z20 = bf.n(parcel, readInt9);
                    }
                }
                bf.m(parcel, z19);
                return new h(z20);
            case 14:
                int z21 = bf.z(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 1) {
                        bArr2 = bf.b(parcel, readInt10);
                    } else if (c14 != 2) {
                        bf.y(parcel, readInt10);
                    } else {
                        bArr3 = bf.b(parcel, readInt10);
                    }
                }
                bf.m(parcel, z21);
                return new u0(bArr2 == null ? null : o7.s0.s(bArr2.length, bArr2), bArr3 != null ? o7.s0.s(bArr3.length, bArr3) : null);
            case 15:
                int z22 = bf.z(parcel);
                boolean z23 = false;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 1) {
                        z23 = bf.n(parcel, readInt11);
                    } else if (c15 != 2) {
                        bf.y(parcel, readInt11);
                    } else {
                        bArr4 = bf.b(parcel, readInt11);
                    }
                }
                bf.m(parcel, z22);
                return new v0(z23, bArr4 != null ? o7.s0.s(bArr4.length, bArr4) : null);
            case 16:
                int z24 = bf.z(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 2) {
                        bArr5 = bf.b(parcel, readInt12);
                    } else if (c16 == 3) {
                        bArr6 = bf.b(parcel, readInt12);
                    } else if (c16 == 4) {
                        bArr7 = bf.b(parcel, readInt12);
                    } else if (c16 == 5) {
                        bArr8 = bf.b(parcel, readInt12);
                    } else if (c16 != 6) {
                        bf.y(parcel, readInt12);
                    } else {
                        bArr9 = bf.b(parcel, readInt12);
                    }
                }
                bf.m(parcel, z24);
                return new i(bArr5, bArr6, bArr7, bArr8, bArr9);
            case 17:
                int z25 = bf.z(parcel);
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 == 2) {
                        bArr10 = bf.b(parcel, readInt13);
                    } else if (c17 == 3) {
                        bArr11 = bf.b(parcel, readInt13);
                    } else if (c17 == 4) {
                        bArr12 = bf.b(parcel, readInt13);
                    } else if (c17 != 5) {
                        bf.y(parcel, readInt13);
                    } else {
                        strArr = bf.i(parcel, readInt13);
                    }
                }
                bf.m(parcel, z25);
                return new j(bArr10, bArr11, bArr12, strArr);
            case 18:
                int z26 = bf.z(parcel);
                int i11 = 0;
                String str8 = null;
                int i12 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    char c18 = (char) readInt14;
                    if (c18 == 2) {
                        i11 = bf.u(parcel, readInt14);
                    } else if (c18 == 3) {
                        str8 = bf.h(parcel, readInt14);
                    } else if (c18 != 4) {
                        bf.y(parcel, readInt14);
                    } else {
                        i12 = bf.u(parcel, readInt14);
                    }
                }
                bf.m(parcel, z26);
                return new k(i11, i12, str8);
            case 19:
                int z27 = bf.z(parcel);
                String str9 = null;
                Boolean bool = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c19 = (char) readInt15;
                    if (c19 == 2) {
                        str9 = bf.h(parcel, readInt15);
                    } else if (c19 == 3) {
                        bool = bf.o(parcel, readInt15);
                    } else if (c19 == 4) {
                        str10 = bf.h(parcel, readInt15);
                    } else if (c19 != 5) {
                        bf.y(parcel, readInt15);
                    } else {
                        str11 = bf.h(parcel, readInt15);
                    }
                }
                bf.m(parcel, z27);
                return new m(str9, bool, str10, str11);
            case 20:
                try {
                    return o.a(parcel.readInt());
                } catch (n e14) {
                    throw new RuntimeException(e14);
                }
            case 21:
                int z28 = bf.z(parcel);
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    char c20 = (char) readInt16;
                    if (c20 == 1) {
                        j10 = bf.w(parcel, readInt16);
                    } else if (c20 == 2) {
                        bArr13 = bf.b(parcel, readInt16);
                    } else if (c20 == 3) {
                        bArr14 = bf.b(parcel, readInt16);
                    } else if (c20 != 4) {
                        bf.y(parcel, readInt16);
                    } else {
                        bArr15 = bf.b(parcel, readInt16);
                    }
                }
                bf.m(parcel, z28);
                return new w0(j10, bArr13, bArr14, bArr15);
            case 22:
                int z29 = bf.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        bf.y(parcel, readInt17);
                    } else {
                        arrayList2 = bf.l(parcel, readInt17, w0.CREATOR);
                    }
                }
                bf.m(parcel, z29);
                return new x0(arrayList2);
            case 23:
                int z30 = bf.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        bf.y(parcel, readInt18);
                    } else {
                        bf.n(parcel, readInt18);
                    }
                }
                bf.m(parcel, z30);
                return new y0();
            case 24:
                try {
                    return r.a(parcel.readInt());
                } catch (q e15) {
                    throw new IllegalArgumentException(e15);
                }
            case 25:
                int z31 = bf.z(parcel);
                String str12 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 2) {
                        bf.y(parcel, readInt19);
                    } else {
                        str12 = bf.h(parcel, readInt19);
                    }
                }
                bf.m(parcel, z31);
                return new s(str12);
            case 26:
                int z32 = bf.z(parcel);
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        bf.y(parcel, readInt20);
                    } else {
                        z33 = bf.n(parcel, readInt20);
                    }
                }
                bf.m(parcel, z32);
                return new e6.a0(z33);
            case 27:
                int z34 = bf.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z34) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        bf.y(parcel, readInt21);
                    } else {
                        i13 = bf.u(parcel, readInt21);
                    }
                }
                bf.m(parcel, z34);
                return new e6.b0(i13);
            case 28:
                int z35 = bf.z(parcel);
                String str13 = null;
                ArrayList arrayList3 = null;
                d6.i iVar = null;
                f6.a aVar = null;
                ArrayList arrayList4 = null;
                e6.a0 a0Var = null;
                e6.b0 b0Var = null;
                boolean z36 = false;
                boolean z37 = false;
                boolean z38 = false;
                boolean z39 = false;
                boolean z40 = false;
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                double d = 0.0d;
                while (parcel.dataPosition() < z35) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str13 = bf.h(parcel, readInt22);
                            break;
                        case 3:
                            arrayList3 = bf.j(parcel, readInt22);
                            break;
                        case 4:
                            z36 = bf.n(parcel, readInt22);
                            break;
                        case 5:
                            iVar = (d6.i) bf.g(parcel, readInt22, d6.i.CREATOR);
                            break;
                        case 6:
                            z37 = bf.n(parcel, readInt22);
                            break;
                        case 7:
                            aVar = (f6.a) bf.g(parcel, readInt22, f6.a.CREATOR);
                            break;
                        case '\b':
                            z38 = bf.n(parcel, readInt22);
                            break;
                        case '\t':
                            d = bf.q(parcel, readInt22);
                            break;
                        case '\n':
                            z39 = bf.n(parcel, readInt22);
                            break;
                        case 11:
                            z40 = bf.n(parcel, readInt22);
                            break;
                        case '\f':
                            z41 = bf.n(parcel, readInt22);
                            break;
                        case '\r':
                            arrayList4 = bf.j(parcel, readInt22);
                            break;
                        case 14:
                            z42 = bf.n(parcel, readInt22);
                            break;
                        case 15:
                            bf.u(parcel, readInt22);
                            break;
                        case 16:
                            z43 = bf.n(parcel, readInt22);
                            break;
                        case 17:
                            a0Var = (e6.a0) bf.g(parcel, readInt22, e6.a0.CREATOR);
                            break;
                        case 18:
                            b0Var = (e6.b0) bf.g(parcel, readInt22, e6.b0.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt22);
                            break;
                    }
                }
                bf.m(parcel, z35);
                return new e6.b(str13, arrayList3, z36, iVar, z37, aVar, z38, d, z39, z40, z41, arrayList4, z42, z43, a0Var, b0Var);
            default:
                int z44 = bf.z(parcel);
                boolean z45 = false;
                boolean z46 = false;
                String str14 = null;
                String str15 = null;
                IBinder iBinder = null;
                f6.f fVar = null;
                while (parcel.dataPosition() < z44) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str14 = bf.h(parcel, readInt23);
                            break;
                        case 3:
                            str15 = bf.h(parcel, readInt23);
                            break;
                        case 4:
                            iBinder = bf.t(parcel, readInt23);
                            break;
                        case 5:
                            fVar = (f6.f) bf.g(parcel, readInt23, f6.f.CREATOR);
                            break;
                        case 6:
                            z45 = bf.n(parcel, readInt23);
                            break;
                        case 7:
                            z46 = bf.n(parcel, readInt23);
                            break;
                        default:
                            bf.y(parcel, readInt23);
                            break;
                    }
                }
                bf.m(parcel, z44);
                return new f6.a(str14, str15, iBinder, fVar, z45, z46);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new a0[i10];
            case 1:
                return new b0[i10];
            case 2:
                return new e0[i10];
            case 3:
                return new s0[i10];
            case 4:
                return new f0[i10];
            case 5:
                return new h0[i10];
            case 6:
                return new e[i10];
            case 7:
                return new i0[i10];
            case 8:
                return new j0[i10];
            case 9:
                return new k0[i10];
            case 10:
                return new l0[i10];
            case 11:
                return new g[i10];
            case 12:
                return new f[i10];
            case 13:
                return new h[i10];
            case 14:
                return new u0[i10];
            case 15:
                return new v0[i10];
            case 16:
                return new i[i10];
            case 17:
                return new j[i10];
            case 18:
                return new k[i10];
            case 19:
                return new m[i10];
            case 20:
                return new o[i10];
            case 21:
                return new w0[i10];
            case 22:
                return new x0[i10];
            case 23:
                return new y0[i10];
            case 24:
                return new r[i10];
            case 25:
                return new s[i10];
            case 26:
                return new e6.a0[i10];
            case 27:
                return new e6.b0[i10];
            case 28:
                return new e6.b[i10];
            default:
                return new f6.a[i10];
        }
    }
}
