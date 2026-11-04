package e7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int i3) {
        this.a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                String str = null;
                byte[] bArr = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 2) {
                        str = g6.e.h(parcel, readInt);
                    } else if (c2 == 3) {
                        bArr = g6.e.b(parcel, readInt);
                    } else if (c2 != 4) {
                        g6.e.y(parcel, readInt);
                    } else {
                        arrayList = g6.e.l(parcel, readInt, Transport.CREATOR);
                    }
                }
                g6.e.m(parcel, z10);
                return new w(str, bArr, arrayList);
            case 1:
                int z11 = g6.e.z(parcel);
                String str2 = null;
                Integer num = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        str2 = g6.e.h(parcel, readInt2);
                    } else if (c10 != 3) {
                        g6.e.y(parcel, readInt2);
                    } else {
                        num = g6.e.v(parcel, readInt2);
                    }
                }
                g6.e.m(parcel, z11);
                return new x(str2, num.intValue());
            case 2:
                int z12 = g6.e.z(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str3 = g6.e.h(parcel, readInt3);
                    } else if (c11 == 3) {
                        str4 = g6.e.h(parcel, readInt3);
                    } else if (c11 != 4) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        str5 = g6.e.h(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z12);
                return new y(str3, str4, str5);
            case 3:
                try {
                    return a0.a(parcel.readString());
                } catch (z e10) {
                    throw new RuntimeException(e10);
                }
            case 4:
                int z13 = g6.e.z(parcel);
                byte[] bArr2 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        bArr2 = g6.e.b(parcel, readInt4);
                    } else if (c12 == 3) {
                        str6 = g6.e.h(parcel, readInt4);
                    } else if (c12 == 4) {
                        str7 = g6.e.h(parcel, readInt4);
                    } else if (c12 != 5) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        str8 = g6.e.h(parcel, readInt4);
                    }
                }
                g6.e.m(parcel, z13);
                return new b0(str6, bArr2, str7, str8);
            case 5:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e11) {
                    throw new RuntimeException(e11);
                }
            case 6:
                int z14 = g6.e.z(parcel);
                String str9 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        g6.e.y(parcel, readInt5);
                    } else {
                        str9 = g6.e.h(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z14);
                return new s0(str9);
            case 7:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e12) {
                    throw new RuntimeException(e12);
                }
            case 8:
                int z15 = g6.e.z(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 2) {
                        str10 = g6.e.h(parcel, readInt6);
                    } else if (c13 != 3) {
                        g6.e.y(parcel, readInt6);
                    } else {
                        str11 = g6.e.h(parcel, readInt6);
                    }
                }
                g6.e.m(parcel, z15);
                return new h0(str10, str11);
            case 9:
                try {
                    return e.a(parcel.readString());
                } catch (d e13) {
                    throw new RuntimeException(e13);
                }
            case 10:
                int z16 = g6.e.z(parcel);
                boolean z17 = false;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        g6.e.y(parcel, readInt7);
                    } else {
                        z17 = g6.e.n(parcel, readInt7);
                    }
                }
                g6.e.m(parcel, z16);
                return new i0(z17);
            case 11:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e14) {
                    throw new RuntimeException(e14);
                }
            case 12:
                int z18 = g6.e.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        g6.e.y(parcel, readInt8);
                    } else {
                        arrayList2 = g6.e.l(parcel, readInt8, l0.CREATOR);
                    }
                }
                g6.e.m(parcel, z18);
                return new k0(arrayList2);
            case 13:
                int z19 = g6.e.z(parcel);
                int i3 = 0;
                short s6 = 0;
                short s10 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        i3 = g6.e.u(parcel, readInt9);
                    } else if (c14 == 2) {
                        g6.e.A(parcel, readInt9, 4);
                        s6 = (short) parcel.readInt();
                    } else if (c14 != 3) {
                        g6.e.y(parcel, readInt9);
                    } else {
                        g6.e.A(parcel, readInt9, 4);
                        s10 = (short) parcel.readInt();
                    }
                }
                g6.e.m(parcel, z19);
                return new l0(i3, s6, s10);
            case 14:
                int z20 = g6.e.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String str12 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        k0Var = (k0) g6.e.g(parcel, readInt10, k0.CREATOR);
                    } else if (c15 == 2) {
                        u0Var = (u0) g6.e.g(parcel, readInt10, u0.CREATOR);
                    } else if (c15 == 3) {
                        hVar = (h) g6.e.g(parcel, readInt10, h.CREATOR);
                    } else if (c15 == 4) {
                        v0Var = (v0) g6.e.g(parcel, readInt10, v0.CREATOR);
                    } else if (c15 != 5) {
                        g6.e.y(parcel, readInt10);
                    } else {
                        str12 = g6.e.h(parcel, readInt10);
                    }
                }
                g6.e.m(parcel, z20);
                return new g(k0Var, u0Var, hVar, v0Var, str12);
            case 15:
                int z21 = g6.e.z(parcel);
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
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            sVar = (s) g6.e.g(parcel, readInt11, s.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) g6.e.g(parcel, readInt11, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) g6.e.g(parcel, readInt11, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) g6.e.g(parcel, readInt11, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) g6.e.g(parcel, readInt11, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) g6.e.g(parcel, readInt11, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) g6.e.g(parcel, readInt11, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) g6.e.g(parcel, readInt11, o0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) g6.e.g(parcel, readInt11, t.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) g6.e.g(parcel, readInt11, q0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) g6.e.g(parcel, readInt11, s0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) g6.e.g(parcel, readInt11, p0.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt11);
                            break;
                    }
                }
                g6.e.m(parcel, z21);
                return new f(sVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, tVar, q0Var, s0Var, p0Var);
            case 16:
                int z22 = g6.e.z(parcel);
                boolean z23 = false;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        g6.e.y(parcel, readInt12);
                    } else {
                        z23 = g6.e.n(parcel, readInt12);
                    }
                }
                g6.e.m(parcel, z22);
                return new h(z23);
            case 17:
                int z24 = g6.e.z(parcel);
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 1) {
                        bArr3 = g6.e.b(parcel, readInt13);
                    } else if (c16 != 2) {
                        g6.e.y(parcel, readInt13);
                    } else {
                        bArr4 = g6.e.b(parcel, readInt13);
                    }
                }
                g6.e.m(parcel, z24);
                return new u0(bArr3 == null ? null : p7.t0.o(bArr3.length, bArr3), bArr4 != null ? p7.t0.o(bArr4.length, bArr4) : null);
            case 18:
                int z25 = g6.e.z(parcel);
                boolean z26 = false;
                byte[] bArr5 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 1) {
                        z26 = g6.e.n(parcel, readInt14);
                    } else if (c17 != 2) {
                        g6.e.y(parcel, readInt14);
                    } else {
                        bArr5 = g6.e.b(parcel, readInt14);
                    }
                }
                g6.e.m(parcel, z25);
                return new v0(z26, bArr5 != null ? p7.t0.o(bArr5.length, bArr5) : null);
            case 19:
                int z27 = g6.e.z(parcel);
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 2) {
                        bArr6 = g6.e.b(parcel, readInt15);
                    } else if (c18 == 3) {
                        bArr7 = g6.e.b(parcel, readInt15);
                    } else if (c18 == 4) {
                        bArr8 = g6.e.b(parcel, readInt15);
                    } else if (c18 == 5) {
                        bArr9 = g6.e.b(parcel, readInt15);
                    } else if (c18 != 6) {
                        g6.e.y(parcel, readInt15);
                    } else {
                        bArr10 = g6.e.b(parcel, readInt15);
                    }
                }
                g6.e.m(parcel, z27);
                return new i(bArr6, bArr7, bArr8, bArr9, bArr10);
            case 20:
                int z28 = g6.e.z(parcel);
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                byte[] bArr13 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    char c19 = (char) readInt16;
                    if (c19 == 2) {
                        bArr11 = g6.e.b(parcel, readInt16);
                    } else if (c19 == 3) {
                        bArr12 = g6.e.b(parcel, readInt16);
                    } else if (c19 == 4) {
                        bArr13 = g6.e.b(parcel, readInt16);
                    } else if (c19 != 5) {
                        g6.e.y(parcel, readInt16);
                    } else {
                        strArr = g6.e.i(parcel, readInt16);
                    }
                }
                g6.e.m(parcel, z28);
                return new j(bArr11, bArr12, bArr13, strArr);
            case 21:
                int z29 = g6.e.z(parcel);
                int i10 = 0;
                String str13 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    char c20 = (char) readInt17;
                    if (c20 == 2) {
                        i10 = g6.e.u(parcel, readInt17);
                    } else if (c20 == 3) {
                        str13 = g6.e.h(parcel, readInt17);
                    } else if (c20 != 4) {
                        g6.e.y(parcel, readInt17);
                    } else {
                        i11 = g6.e.u(parcel, readInt17);
                    }
                }
                g6.e.m(parcel, z29);
                return new k(i10, i11, str13);
            case 22:
                int z30 = g6.e.z(parcel);
                String str14 = null;
                Boolean bool = null;
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt18 = parcel.readInt();
                    char c21 = (char) readInt18;
                    if (c21 == 2) {
                        str14 = g6.e.h(parcel, readInt18);
                    } else if (c21 == 3) {
                        bool = g6.e.o(parcel, readInt18);
                    } else if (c21 == 4) {
                        str15 = g6.e.h(parcel, readInt18);
                    } else if (c21 != 5) {
                        g6.e.y(parcel, readInt18);
                    } else {
                        str16 = g6.e.h(parcel, readInt18);
                    }
                }
                g6.e.m(parcel, z30);
                return new m(str14, bool, str15, str16);
            case 23:
                try {
                    return o.a(parcel.readInt());
                } catch (n e15) {
                    throw new RuntimeException(e15);
                }
            case 24:
                int z31 = g6.e.z(parcel);
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                byte[] bArr16 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt19 = parcel.readInt();
                    char c22 = (char) readInt19;
                    if (c22 == 1) {
                        j10 = g6.e.w(parcel, readInt19);
                    } else if (c22 == 2) {
                        bArr14 = g6.e.b(parcel, readInt19);
                    } else if (c22 == 3) {
                        bArr15 = g6.e.b(parcel, readInt19);
                    } else if (c22 != 4) {
                        g6.e.y(parcel, readInt19);
                    } else {
                        bArr16 = g6.e.b(parcel, readInt19);
                    }
                }
                g6.e.m(parcel, z31);
                return new w0(j10, bArr14, bArr15, bArr16);
            case 25:
                int z32 = g6.e.z(parcel);
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        g6.e.y(parcel, readInt20);
                    } else {
                        arrayList3 = g6.e.l(parcel, readInt20, w0.CREATOR);
                    }
                }
                g6.e.m(parcel, z32);
                return new x0(arrayList3);
            case 26:
                int z33 = g6.e.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        g6.e.y(parcel, readInt21);
                    } else {
                        g6.e.n(parcel, readInt21);
                    }
                }
                g6.e.m(parcel, z33);
                return new y0();
            case 27:
                try {
                    return r.a(parcel.readInt());
                } catch (q e16) {
                    throw new IllegalArgumentException(e16);
                }
            case 28:
                int z34 = g6.e.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 2) {
                        g6.e.y(parcel, readInt22);
                    } else {
                        str17 = g6.e.h(parcel, readInt22);
                    }
                }
                g6.e.m(parcel, z34);
                return new s(str17);
            default:
                int z35 = g6.e.z(parcel);
                boolean z36 = false;
                while (parcel.dataPosition() < z35) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 2) {
                        g6.e.y(parcel, readInt23);
                    } else {
                        z36 = g6.e.n(parcel, readInt23);
                    }
                }
                g6.e.m(parcel, z35);
                return new f6.a0(z36);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new w[i3];
            case 1:
                return new x[i3];
            case 2:
                return new y[i3];
            case 3:
                return new a0[i3];
            case 4:
                return new b0[i3];
            case 5:
                return new e0[i3];
            case 6:
                return new s0[i3];
            case 7:
                return new f0[i3];
            case 8:
                return new h0[i3];
            case 9:
                return new e[i3];
            case 10:
                return new i0[i3];
            case 11:
                return new j0[i3];
            case 12:
                return new k0[i3];
            case 13:
                return new l0[i3];
            case 14:
                return new g[i3];
            case 15:
                return new f[i3];
            case 16:
                return new h[i3];
            case 17:
                return new u0[i3];
            case 18:
                return new v0[i3];
            case 19:
                return new i[i3];
            case 20:
                return new j[i3];
            case 21:
                return new k[i3];
            case 22:
                return new m[i3];
            case 23:
                return new o[i3];
            case 24:
                return new w0[i3];
            case 25:
                return new x0[i3];
            case 26:
                return new y0[i3];
            case 27:
                return new r[i3];
            case 28:
                return new s[i3];
            default:
                return new f6.a0[i3];
        }
    }
}
