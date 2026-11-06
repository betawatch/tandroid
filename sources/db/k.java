package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.wb;
import com.google.android.gms.fido.common.Transport;
import f7.a0;
import f7.b0;
import f7.d0;
import f7.e0;
import f7.f0;
import f7.g0;
import f7.h0;
import f7.i0;
import f7.j0;
import f7.k0;
import f7.l0;
import f7.m0;
import f7.n0;
import f7.o0;
import f7.p0;
import f7.q0;
import f7.r0;
import f7.u0;
import f7.v;
import f7.v0;
import f7.w;
import f7.x;
import f7.y;
import f7.z;
import f7.z0;
import java.util.ArrayList;
import q7.s0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z9 = wb.z(parcel);
                int i7 = 0;
                String str = null;
                int i10 = 0;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i7 = wb.u(parcel, readInt);
                    } else if (c10 == 2) {
                        str = wb.h(parcel, readInt);
                    } else if (c10 != 3) {
                        wb.y(parcel, readInt);
                    } else {
                        i10 = wb.u(parcel, readInt);
                    }
                }
                wb.m(parcel, z9);
                return new i(i7, i10, str);
            case 1:
                int z10 = wb.z(parcel);
                int i11 = 0;
                String str2 = null;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i11 = wb.u(parcel, readInt2);
                    } else if (c11 == 2) {
                        str2 = wb.h(parcel, readInt2);
                    } else if (c11 != 3) {
                        wb.y(parcel, readInt2);
                    } else {
                        i12 = wb.u(parcel, readInt2);
                    }
                }
                wb.m(parcel, z10);
                return new c(i11, i12, str2);
            case 2:
                int z11 = wb.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        wb.y(parcel, readInt3);
                    } else {
                        arrayList = wb.l(parcel, readInt3, i.CREATOR);
                    }
                }
                wb.m(parcel, z11);
                return new l(arrayList);
            case 3:
                int z12 = wb.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        wb.y(parcel, readInt4);
                    } else {
                        str3 = wb.h(parcel, readInt4);
                    }
                }
                wb.m(parcel, z12);
                return new o(str3);
            case 4:
                int z13 = wb.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        wb.y(parcel, readInt5);
                    } else {
                        arrayList2 = wb.e(parcel, readInt5);
                    }
                }
                wb.m(parcel, z13);
                return new q(arrayList2);
            case 5:
                try {
                    return f7.c.a(parcel.readString());
                } catch (f7.b e10) {
                    throw new RuntimeException(e10);
                }
            case 6:
                int z14 = wb.z(parcel);
                boolean z15 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        wb.y(parcel, readInt6);
                    } else {
                        z15 = wb.n(parcel, readInt6);
                    }
                }
                wb.m(parcel, z14);
                return new z0(z15);
            case 7:
                int z16 = wb.z(parcel);
                long j3 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        wb.y(parcel, readInt7);
                    } else {
                        j3 = wb.w(parcel, readInt7);
                    }
                }
                wb.m(parcel, z16);
                return new m0(j3);
            case 8:
                int z17 = wb.z(parcel);
                boolean z18 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        wb.y(parcel, readInt8);
                    } else {
                        z18 = wb.n(parcel, readInt8);
                    }
                }
                wb.m(parcel, z17);
                return new n0(z18);
            case 9:
                int z19 = wb.z(parcel);
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        wb.y(parcel, readInt9);
                    } else {
                        z20 = wb.n(parcel, readInt9);
                    }
                }
                wb.m(parcel, z19);
                return new f7.t(z20);
            case 10:
                int z21 = wb.z(parcel);
                String str4 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        wb.y(parcel, readInt10);
                    } else {
                        str4 = wb.h(parcel, readInt10);
                    }
                }
                wb.m(parcel, z21);
                return new o0(str4);
            case 11:
                int z22 = wb.z(parcel);
                int i13 = 0;
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    char c12 = (char) readInt11;
                    if (c12 == 1) {
                        bArr = wb.b(parcel, readInt11);
                    } else if (c12 == 2) {
                        bArr2 = wb.b(parcel, readInt11);
                    } else if (c12 == 3) {
                        bArr3 = wb.b(parcel, readInt11);
                    } else if (c12 != 4) {
                        wb.y(parcel, readInt11);
                    } else {
                        i13 = wb.u(parcel, readInt11);
                    }
                }
                wb.m(parcel, z22);
                return new p0(bArr == null ? null : s0.o(bArr.length, bArr), bArr2 == null ? null : s0.o(bArr2.length, bArr2), bArr3 != null ? s0.o(bArr3.length, bArr3) : null, i13);
            case 12:
                int z23 = wb.z(parcel);
                byte[][] bArr4 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        wb.y(parcel, readInt12);
                    } else {
                        bArr4 = wb.c(parcel, readInt12);
                    }
                }
                wb.m(parcel, z23);
                return new q0(bArr4);
            case 13:
                int z24 = wb.z(parcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList3 = null;
                Double d = null;
                ArrayList arrayList4 = null;
                f7.m mVar = null;
                Integer num = null;
                h0 h0Var = null;
                String str5 = null;
                f7.f fVar = null;
                String str6 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z24) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            yVar = (y) wb.g(parcel, readInt13, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) wb.g(parcel, readInt13, b0.CREATOR);
                            break;
                        case 4:
                            bArr5 = wb.b(parcel, readInt13);
                            break;
                        case 5:
                            arrayList3 = wb.l(parcel, readInt13, x.CREATOR);
                            break;
                        case 6:
                            int x10 = wb.x(parcel, readInt13);
                            if (x10 != 0) {
                                wb.B(parcel, x10, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        case 7:
                            arrayList4 = wb.l(parcel, readInt13, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (f7.m) wb.g(parcel, readInt13, f7.m.CREATOR);
                            break;
                        case '\t':
                            num = wb.v(parcel, readInt13);
                            break;
                        case '\n':
                            h0Var = (h0) wb.g(parcel, readInt13, h0.CREATOR);
                            break;
                        case 11:
                            str5 = wb.h(parcel, readInt13);
                            break;
                        case '\f':
                            fVar = (f7.f) wb.g(parcel, readInt13, f7.f.CREATOR);
                            break;
                        case '\r':
                            str6 = wb.h(parcel, readInt13);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) wb.g(parcel, readInt13, ResultReceiver.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt13);
                            break;
                    }
                }
                wb.m(parcel, z24);
                return new v(yVar, b0Var, bArr5, arrayList3, d, arrayList4, mVar, num, h0Var, str5, fVar, str6, resultReceiver);
            case 14:
                int z25 = wb.z(parcel);
                String str7 = null;
                String str8 = null;
                byte[] bArr6 = null;
                f7.j jVar = null;
                f7.i iVar = null;
                f7.k kVar = null;
                f7.g gVar = null;
                String str9 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            str7 = wb.h(parcel, readInt14);
                            break;
                        case 2:
                            str8 = wb.h(parcel, readInt14);
                            break;
                        case 3:
                            bArr6 = wb.b(parcel, readInt14);
                            break;
                        case 4:
                            jVar = (f7.j) wb.g(parcel, readInt14, f7.j.CREATOR);
                            break;
                        case 5:
                            iVar = (f7.i) wb.g(parcel, readInt14, f7.i.CREATOR);
                            break;
                        case 6:
                            kVar = (f7.k) wb.g(parcel, readInt14, f7.k.CREATOR);
                            break;
                        case 7:
                            gVar = (f7.g) wb.g(parcel, readInt14, f7.g.CREATOR);
                            break;
                        case '\b':
                            str9 = wb.h(parcel, readInt14);
                            break;
                        case '\t':
                            wb.h(parcel, readInt14);
                            break;
                        default:
                            wb.y(parcel, readInt14);
                            break;
                    }
                }
                wb.m(parcel, z25);
                return new f7.u(str7, str8, bArr6, jVar, iVar, kVar, gVar, str9);
            case 15:
                int z26 = wb.z(parcel);
                String str10 = null;
                byte[] bArr7 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt15 = parcel.readInt();
                    char c13 = (char) readInt15;
                    if (c13 == 2) {
                        str10 = wb.h(parcel, readInt15);
                    } else if (c13 == 3) {
                        bArr7 = wb.b(parcel, readInt15);
                    } else if (c13 != 4) {
                        wb.y(parcel, readInt15);
                    } else {
                        arrayList5 = wb.l(parcel, readInt15, Transport.CREATOR);
                    }
                }
                wb.m(parcel, z26);
                return new w(str10, bArr7, arrayList5);
            case 16:
                int z27 = wb.z(parcel);
                String str11 = null;
                Integer num2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt16 = parcel.readInt();
                    char c14 = (char) readInt16;
                    if (c14 == 2) {
                        str11 = wb.h(parcel, readInt16);
                    } else if (c14 != 3) {
                        wb.y(parcel, readInt16);
                    } else {
                        num2 = wb.v(parcel, readInt16);
                    }
                }
                wb.m(parcel, z27);
                return new x(str11, num2.intValue());
            case 17:
                int z28 = wb.z(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c15 = (char) readInt17;
                    if (c15 == 2) {
                        str12 = wb.h(parcel, readInt17);
                    } else if (c15 == 3) {
                        str13 = wb.h(parcel, readInt17);
                    } else if (c15 != 4) {
                        wb.y(parcel, readInt17);
                    } else {
                        str14 = wb.h(parcel, readInt17);
                    }
                }
                wb.m(parcel, z28);
                return new y(str12, str13, str14);
            case 18:
                try {
                    return a0.a(parcel.readString());
                } catch (z e11) {
                    throw new RuntimeException(e11);
                }
            case 19:
                int z29 = wb.z(parcel);
                byte[] bArr8 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    char c16 = (char) readInt18;
                    if (c16 == 2) {
                        bArr8 = wb.b(parcel, readInt18);
                    } else if (c16 == 3) {
                        str15 = wb.h(parcel, readInt18);
                    } else if (c16 == 4) {
                        str16 = wb.h(parcel, readInt18);
                    } else if (c16 != 5) {
                        wb.y(parcel, readInt18);
                    } else {
                        str17 = wb.h(parcel, readInt18);
                    }
                }
                wb.m(parcel, z29);
                return new b0(str15, bArr8, str16, str17);
            case 20:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e12) {
                    throw new RuntimeException(e12);
                }
            case 21:
                int z30 = wb.z(parcel);
                String str18 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        wb.y(parcel, readInt19);
                    } else {
                        str18 = wb.h(parcel, readInt19);
                    }
                }
                wb.m(parcel, z30);
                return new r0(str18);
            case 22:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e13) {
                    throw new RuntimeException(e13);
                }
            case 23:
                int z31 = wb.z(parcel);
                String str19 = null;
                String str20 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt20 = parcel.readInt();
                    char c17 = (char) readInt20;
                    if (c17 == 2) {
                        str19 = wb.h(parcel, readInt20);
                    } else if (c17 != 3) {
                        wb.y(parcel, readInt20);
                    } else {
                        str20 = wb.h(parcel, readInt20);
                    }
                }
                wb.m(parcel, z31);
                return new h0(str19, str20);
            case 24:
                try {
                    return f7.e.a(parcel.readString());
                } catch (f7.d e14) {
                    throw new RuntimeException(e14);
                }
            case 25:
                int z32 = wb.z(parcel);
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        wb.y(parcel, readInt21);
                    } else {
                        z33 = wb.n(parcel, readInt21);
                    }
                }
                wb.m(parcel, z32);
                return new i0(z33);
            case 26:
                try {
                    return j0.a(parcel.readString());
                } catch (f7.s0 e15) {
                    throw new RuntimeException(e15);
                }
            case 27:
                int z34 = wb.z(parcel);
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        wb.y(parcel, readInt22);
                    } else {
                        arrayList6 = wb.l(parcel, readInt22, l0.CREATOR);
                    }
                }
                wb.m(parcel, z34);
                return new k0(arrayList6);
            case 28:
                int z35 = wb.z(parcel);
                int i14 = 0;
                short s5 = 0;
                short s9 = 0;
                while (parcel.dataPosition() < z35) {
                    int readInt23 = parcel.readInt();
                    char c18 = (char) readInt23;
                    if (c18 == 1) {
                        i14 = wb.u(parcel, readInt23);
                    } else if (c18 == 2) {
                        wb.A(parcel, readInt23, 4);
                        s5 = (short) parcel.readInt();
                    } else if (c18 != 3) {
                        wb.y(parcel, readInt23);
                    } else {
                        wb.A(parcel, readInt23, 4);
                        s9 = (short) parcel.readInt();
                    }
                }
                wb.m(parcel, z35);
                return new l0(i14, s5, s9);
            default:
                int z36 = wb.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                f7.h hVar = null;
                v0 v0Var = null;
                String str21 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt24 = parcel.readInt();
                    char c19 = (char) readInt24;
                    if (c19 == 1) {
                        k0Var = (k0) wb.g(parcel, readInt24, k0.CREATOR);
                    } else if (c19 == 2) {
                        u0Var = (u0) wb.g(parcel, readInt24, u0.CREATOR);
                    } else if (c19 == 3) {
                        hVar = (f7.h) wb.g(parcel, readInt24, f7.h.CREATOR);
                    } else if (c19 == 4) {
                        v0Var = (v0) wb.g(parcel, readInt24, v0.CREATOR);
                    } else if (c19 != 5) {
                        wb.y(parcel, readInt24);
                    } else {
                        str21 = wb.h(parcel, readInt24);
                    }
                }
                wb.m(parcel, z36);
                return new f7.g(k0Var, u0Var, hVar, v0Var, str21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new i[i7];
            case 1:
                return new c[i7];
            case 2:
                return new l[i7];
            case 3:
                return new o[i7];
            case 4:
                return new q[i7];
            case 5:
                return new f7.c[i7];
            case 6:
                return new z0[i7];
            case 7:
                return new m0[i7];
            case 8:
                return new n0[i7];
            case 9:
                return new f7.t[i7];
            case 10:
                return new o0[i7];
            case 11:
                return new p0[i7];
            case 12:
                return new q0[i7];
            case 13:
                return new v[i7];
            case 14:
                return new f7.u[i7];
            case 15:
                return new w[i7];
            case 16:
                return new x[i7];
            case 17:
                return new y[i7];
            case 18:
                return new a0[i7];
            case 19:
                return new b0[i7];
            case 20:
                return new e0[i7];
            case 21:
                return new r0[i7];
            case 22:
                return new f0[i7];
            case 23:
                return new h0[i7];
            case 24:
                return new f7.e[i7];
            case 25:
                return new i0[i7];
            case 26:
                return new j0[i7];
            case 27:
                return new k0[i7];
            case 28:
                return new l0[i7];
            default:
                return new f7.g[i7];
        }
    }
}
