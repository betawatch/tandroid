package o6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ n0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                long j10 = 0;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        ce.b.z(parcel, readInt);
                    } else {
                        j10 = ce.b.x(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new m0(j10);
            case 1:
                int A2 = ce.b.A(parcel);
                boolean z10 = false;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        z10 = ce.b.o(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new o0(z10);
            case 2:
                int A3 = ce.b.A(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        z11 = ce.b.o(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new t(z11);
            case 3:
                int A4 = ce.b.A(parcel);
                String str = null;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        str = ce.b.i(parcel, readInt4);
                    }
                }
                ce.b.n(parcel, A4);
                return new p0(str);
            case 4:
                int A5 = ce.b.A(parcel);
                int i10 = 0;
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        bArr = ce.b.c(parcel, readInt5);
                    } else if (c3 == 2) {
                        bArr2 = ce.b.c(parcel, readInt5);
                    } else if (c3 == 3) {
                        bArr3 = ce.b.c(parcel, readInt5);
                    } else if (c3 != 4) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        i10 = ce.b.v(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A5);
                return new q0(bArr == null ? null : z6.s0.t(bArr.length, bArr), bArr2 == null ? null : z6.s0.t(bArr2.length, bArr2), bArr3 != null ? z6.s0.t(bArr3.length, bArr3) : null, i10);
            case 5:
                int A6 = ce.b.A(parcel);
                byte[][] bArr4 = null;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        ce.b.z(parcel, readInt6);
                    } else {
                        bArr4 = ce.b.d(parcel, readInt6);
                    }
                }
                ce.b.n(parcel, A6);
                return new r0(bArr4);
            case 6:
                int A7 = ce.b.A(parcel);
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
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            yVar = (y) ce.b.h(parcel, readInt7, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) ce.b.h(parcel, readInt7, b0.CREATOR);
                            break;
                        case 4:
                            bArr5 = ce.b.c(parcel, readInt7);
                            break;
                        case 5:
                            arrayList = ce.b.m(parcel, readInt7, x.CREATOR);
                            break;
                        case 6:
                            int y8 = ce.b.y(parcel, readInt7);
                            if (y8 != 0) {
                                ce.b.B(parcel, y8, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        case 7:
                            arrayList2 = ce.b.m(parcel, readInt7, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) ce.b.h(parcel, readInt7, m.CREATOR);
                            break;
                        case '\t':
                            num = ce.b.w(parcel, readInt7);
                            break;
                        case '\n':
                            h0Var = (h0) ce.b.h(parcel, readInt7, h0.CREATOR);
                            break;
                        case 11:
                            str2 = ce.b.i(parcel, readInt7);
                            break;
                        case '\f':
                            fVar = (f) ce.b.h(parcel, readInt7, f.CREATOR);
                            break;
                        case '\r':
                            str3 = ce.b.i(parcel, readInt7);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) ce.b.h(parcel, readInt7, ResultReceiver.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt7);
                            break;
                    }
                }
                ce.b.n(parcel, A7);
                return new v(yVar, b0Var, bArr5, arrayList, d, arrayList2, mVar, num, h0Var, str2, fVar, str3, resultReceiver);
            case 7:
                int A8 = ce.b.A(parcel);
                String str4 = null;
                String str5 = null;
                byte[] bArr6 = null;
                j jVar = null;
                i iVar = null;
                k kVar = null;
                g gVar = null;
                String str6 = null;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str4 = ce.b.i(parcel, readInt8);
                            break;
                        case 2:
                            str5 = ce.b.i(parcel, readInt8);
                            break;
                        case 3:
                            bArr6 = ce.b.c(parcel, readInt8);
                            break;
                        case 4:
                            jVar = (j) ce.b.h(parcel, readInt8, j.CREATOR);
                            break;
                        case 5:
                            iVar = (i) ce.b.h(parcel, readInt8, i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) ce.b.h(parcel, readInt8, k.CREATOR);
                            break;
                        case 7:
                            gVar = (g) ce.b.h(parcel, readInt8, g.CREATOR);
                            break;
                        case '\b':
                            str6 = ce.b.i(parcel, readInt8);
                            break;
                        case '\t':
                            ce.b.i(parcel, readInt8);
                            break;
                        default:
                            ce.b.z(parcel, readInt8);
                            break;
                    }
                }
                ce.b.n(parcel, A8);
                return new u(str4, str5, bArr6, jVar, iVar, kVar, gVar, str6);
            case 8:
                int A9 = ce.b.A(parcel);
                String str7 = null;
                byte[] bArr7 = null;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 2) {
                        str7 = ce.b.i(parcel, readInt9);
                    } else if (c6 == 3) {
                        bArr7 = ce.b.c(parcel, readInt9);
                    } else if (c6 != 4) {
                        ce.b.z(parcel, readInt9);
                    } else {
                        arrayList3 = ce.b.m(parcel, readInt9, Transport.CREATOR);
                    }
                }
                ce.b.n(parcel, A9);
                return new w(str7, bArr7, arrayList3);
            case 9:
                int A10 = ce.b.A(parcel);
                String str8 = null;
                Integer num2 = null;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    char c10 = (char) readInt10;
                    if (c10 == 2) {
                        str8 = ce.b.i(parcel, readInt10);
                    } else if (c10 != 3) {
                        ce.b.z(parcel, readInt10);
                    } else {
                        num2 = ce.b.w(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A10);
                return new x(str8, num2.intValue());
            case 10:
                int A11 = ce.b.A(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 2) {
                        str9 = ce.b.i(parcel, readInt11);
                    } else if (c11 == 3) {
                        str10 = ce.b.i(parcel, readInt11);
                    } else if (c11 != 4) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        str11 = ce.b.i(parcel, readInt11);
                    }
                }
                ce.b.n(parcel, A11);
                return new y(str9, str10, str11);
            case 11:
                try {
                    return a0.a(parcel.readString());
                } catch (z e10) {
                    throw new RuntimeException(e10);
                }
            case 12:
                int A12 = ce.b.A(parcel);
                byte[] bArr8 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 == 2) {
                        bArr8 = ce.b.c(parcel, readInt12);
                    } else if (c12 == 3) {
                        str12 = ce.b.i(parcel, readInt12);
                    } else if (c12 == 4) {
                        str13 = ce.b.i(parcel, readInt12);
                    } else if (c12 != 5) {
                        ce.b.z(parcel, readInt12);
                    } else {
                        str14 = ce.b.i(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A12);
                return new b0(str12, bArr8, str13, str14);
            case 13:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e11) {
                    throw new RuntimeException(e11);
                }
            case 14:
                int A13 = ce.b.A(parcel);
                String str15 = null;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        ce.b.z(parcel, readInt13);
                    } else {
                        str15 = ce.b.i(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A13);
                return new s0(str15);
            case 15:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e12) {
                    throw new RuntimeException(e12);
                }
            case 16:
                int A14 = ce.b.A(parcel);
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    char c13 = (char) readInt14;
                    if (c13 == 2) {
                        str16 = ce.b.i(parcel, readInt14);
                    } else if (c13 != 3) {
                        ce.b.z(parcel, readInt14);
                    } else {
                        str17 = ce.b.i(parcel, readInt14);
                    }
                }
                ce.b.n(parcel, A14);
                return new h0(str16, str17);
            case 17:
                try {
                    return e.a(parcel.readString());
                } catch (d e13) {
                    throw new RuntimeException(e13);
                }
            case 18:
                int A15 = ce.b.A(parcel);
                boolean z12 = false;
                while (parcel.dataPosition() < A15) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        ce.b.z(parcel, readInt15);
                    } else {
                        z12 = ce.b.o(parcel, readInt15);
                    }
                }
                ce.b.n(parcel, A15);
                return new i0(z12);
            case 19:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e14) {
                    throw new RuntimeException(e14);
                }
            case 20:
                int A16 = ce.b.A(parcel);
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < A16) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        ce.b.z(parcel, readInt16);
                    } else {
                        arrayList4 = ce.b.m(parcel, readInt16, l0.CREATOR);
                    }
                }
                ce.b.n(parcel, A16);
                return new k0(arrayList4);
            case 21:
                int A17 = ce.b.A(parcel);
                int i11 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < A17) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        i11 = ce.b.v(parcel, readInt17);
                    } else if (c14 == 2) {
                        ce.b.C(parcel, readInt17, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c14 != 3) {
                        ce.b.z(parcel, readInt17);
                    } else {
                        ce.b.C(parcel, readInt17, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                ce.b.n(parcel, A17);
                return new l0(i11, s10, s11);
            case 22:
                int A18 = ce.b.A(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String str18 = null;
                while (parcel.dataPosition() < A18) {
                    int readInt18 = parcel.readInt();
                    char c15 = (char) readInt18;
                    if (c15 == 1) {
                        k0Var = (k0) ce.b.h(parcel, readInt18, k0.CREATOR);
                    } else if (c15 == 2) {
                        u0Var = (u0) ce.b.h(parcel, readInt18, u0.CREATOR);
                    } else if (c15 == 3) {
                        hVar = (h) ce.b.h(parcel, readInt18, h.CREATOR);
                    } else if (c15 == 4) {
                        v0Var = (v0) ce.b.h(parcel, readInt18, v0.CREATOR);
                    } else if (c15 != 5) {
                        ce.b.z(parcel, readInt18);
                    } else {
                        str18 = ce.b.i(parcel, readInt18);
                    }
                }
                ce.b.n(parcel, A18);
                return new g(k0Var, u0Var, hVar, v0Var, str18);
            case 23:
                int A19 = ce.b.A(parcel);
                s sVar = null;
                y0 y0Var = null;
                i0 i0Var = null;
                a1 a1Var = null;
                m0 m0Var = null;
                o0 o0Var = null;
                z0 z0Var = null;
                p0 p0Var = null;
                t tVar = null;
                r0 r0Var = null;
                s0 s0Var = null;
                q0 q0Var = null;
                while (parcel.dataPosition() < A19) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            sVar = (s) ce.b.h(parcel, readInt19, s.CREATOR);
                            break;
                        case 3:
                            y0Var = (y0) ce.b.h(parcel, readInt19, y0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) ce.b.h(parcel, readInt19, i0.CREATOR);
                            break;
                        case 5:
                            a1Var = (a1) ce.b.h(parcel, readInt19, a1.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) ce.b.h(parcel, readInt19, m0.CREATOR);
                            break;
                        case 7:
                            o0Var = (o0) ce.b.h(parcel, readInt19, o0.CREATOR);
                            break;
                        case '\b':
                            z0Var = (z0) ce.b.h(parcel, readInt19, z0.CREATOR);
                            break;
                        case '\t':
                            p0Var = (p0) ce.b.h(parcel, readInt19, p0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) ce.b.h(parcel, readInt19, t.CREATOR);
                            break;
                        case 11:
                            r0Var = (r0) ce.b.h(parcel, readInt19, r0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) ce.b.h(parcel, readInt19, s0.CREATOR);
                            break;
                        case '\r':
                            q0Var = (q0) ce.b.h(parcel, readInt19, q0.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt19);
                            break;
                    }
                }
                ce.b.n(parcel, A19);
                return new f(sVar, y0Var, i0Var, a1Var, m0Var, o0Var, z0Var, p0Var, tVar, r0Var, s0Var, q0Var);
            case 24:
                int A20 = ce.b.A(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < A20) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        ce.b.z(parcel, readInt20);
                    } else {
                        z13 = ce.b.o(parcel, readInt20);
                    }
                }
                ce.b.n(parcel, A20);
                return new h(z13);
            case 25:
                int A21 = ce.b.A(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                while (parcel.dataPosition() < A21) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 1) {
                        bArr9 = ce.b.c(parcel, readInt21);
                    } else if (c16 != 2) {
                        ce.b.z(parcel, readInt21);
                    } else {
                        bArr10 = ce.b.c(parcel, readInt21);
                    }
                }
                ce.b.n(parcel, A21);
                return new u0(bArr9 == null ? null : z6.s0.t(bArr9.length, bArr9), bArr10 != null ? z6.s0.t(bArr10.length, bArr10) : null);
            case 26:
                int A22 = ce.b.A(parcel);
                boolean z14 = false;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < A22) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 1) {
                        z14 = ce.b.o(parcel, readInt22);
                    } else if (c17 != 2) {
                        ce.b.z(parcel, readInt22);
                    } else {
                        bArr11 = ce.b.c(parcel, readInt22);
                    }
                }
                ce.b.n(parcel, A22);
                return new v0(z14, bArr11 != null ? z6.s0.t(bArr11.length, bArr11) : null);
            case 27:
                int A23 = ce.b.A(parcel);
                byte[] bArr12 = null;
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                byte[] bArr16 = null;
                while (parcel.dataPosition() < A23) {
                    int readInt23 = parcel.readInt();
                    char c18 = (char) readInt23;
                    if (c18 == 2) {
                        bArr12 = ce.b.c(parcel, readInt23);
                    } else if (c18 == 3) {
                        bArr13 = ce.b.c(parcel, readInt23);
                    } else if (c18 == 4) {
                        bArr14 = ce.b.c(parcel, readInt23);
                    } else if (c18 == 5) {
                        bArr15 = ce.b.c(parcel, readInt23);
                    } else if (c18 != 6) {
                        ce.b.z(parcel, readInt23);
                    } else {
                        bArr16 = ce.b.c(parcel, readInt23);
                    }
                }
                ce.b.n(parcel, A23);
                return new i(bArr12, bArr13, bArr14, bArr15, bArr16);
            case 28:
                int A24 = ce.b.A(parcel);
                byte[] bArr17 = null;
                byte[] bArr18 = null;
                byte[] bArr19 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < A24) {
                    int readInt24 = parcel.readInt();
                    char c19 = (char) readInt24;
                    if (c19 == 2) {
                        bArr17 = ce.b.c(parcel, readInt24);
                    } else if (c19 == 3) {
                        bArr18 = ce.b.c(parcel, readInt24);
                    } else if (c19 == 4) {
                        bArr19 = ce.b.c(parcel, readInt24);
                    } else if (c19 != 5) {
                        ce.b.z(parcel, readInt24);
                    } else {
                        strArr = ce.b.j(parcel, readInt24);
                    }
                }
                ce.b.n(parcel, A24);
                return new j(bArr17, bArr18, bArr19, strArr);
            default:
                int A25 = ce.b.A(parcel);
                int i12 = 0;
                String str19 = null;
                int i13 = 0;
                while (parcel.dataPosition() < A25) {
                    int readInt25 = parcel.readInt();
                    char c20 = (char) readInt25;
                    if (c20 == 2) {
                        i12 = ce.b.v(parcel, readInt25);
                    } else if (c20 == 3) {
                        str19 = ce.b.i(parcel, readInt25);
                    } else if (c20 != 4) {
                        ce.b.z(parcel, readInt25);
                    } else {
                        i13 = ce.b.v(parcel, readInt25);
                    }
                }
                ce.b.n(parcel, A25);
                return new k(i12, i13, str19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new m0[i10];
            case 1:
                return new o0[i10];
            case 2:
                return new t[i10];
            case 3:
                return new p0[i10];
            case 4:
                return new q0[i10];
            case 5:
                return new r0[i10];
            case 6:
                return new v[i10];
            case 7:
                return new u[i10];
            case 8:
                return new w[i10];
            case 9:
                return new x[i10];
            case 10:
                return new y[i10];
            case 11:
                return new a0[i10];
            case 12:
                return new b0[i10];
            case 13:
                return new e0[i10];
            case 14:
                return new s0[i10];
            case 15:
                return new f0[i10];
            case 16:
                return new h0[i10];
            case 17:
                return new e[i10];
            case 18:
                return new i0[i10];
            case 19:
                return new j0[i10];
            case 20:
                return new k0[i10];
            case 21:
                return new l0[i10];
            case 22:
                return new g[i10];
            case 23:
                return new f[i10];
            case 24:
                return new h[i10];
            case 25:
                return new u0[i10];
            case 26:
                return new v0[i10];
            case 27:
                return new i[i10];
            case 28:
                return new j[i10];
            default:
                return new k[i10];
        }
    }
}
