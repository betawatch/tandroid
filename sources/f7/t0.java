package f7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.wb;
import com.google.android.gms.identity.intents.model.UserAddress;
import java.util.ArrayList;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ t0(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z9 = wb.z(parcel);
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
                r0 r0Var = null;
                p0 p0Var = null;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            sVar = (s) wb.g(parcel, readInt, s.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) wb.g(parcel, readInt, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) wb.g(parcel, readInt, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) wb.g(parcel, readInt, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) wb.g(parcel, readInt, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) wb.g(parcel, readInt, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) wb.g(parcel, readInt, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) wb.g(parcel, readInt, o0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) wb.g(parcel, readInt, t.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) wb.g(parcel, readInt, q0.CREATOR);
                            break;
                        case '\f':
                            r0Var = (r0) wb.g(parcel, readInt, r0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) wb.g(parcel, readInt, p0.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt);
                            break;
                    }
                }
                wb.m(parcel, z9);
                return new f(sVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, tVar, q0Var, r0Var, p0Var);
            case 1:
                int z10 = wb.z(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        wb.y(parcel, readInt2);
                    } else {
                        z11 = wb.n(parcel, readInt2);
                    }
                }
                wb.m(parcel, z10);
                return new h(z11);
            case 2:
                int z12 = wb.z(parcel);
                byte[] bArr = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        bArr = wb.b(parcel, readInt3);
                    } else if (c10 != 2) {
                        wb.y(parcel, readInt3);
                    } else {
                        bArr2 = wb.b(parcel, readInt3);
                    }
                }
                wb.m(parcel, z12);
                return new u0(bArr == null ? null : q7.s0.o(bArr.length, bArr), bArr2 != null ? q7.s0.o(bArr2.length, bArr2) : null);
            case 3:
                int z13 = wb.z(parcel);
                boolean z14 = false;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        z14 = wb.n(parcel, readInt4);
                    } else if (c11 != 2) {
                        wb.y(parcel, readInt4);
                    } else {
                        bArr3 = wb.b(parcel, readInt4);
                    }
                }
                wb.m(parcel, z13);
                return new v0(z14, bArr3 != null ? q7.s0.o(bArr3.length, bArr3) : null);
            case 4:
                int z15 = wb.z(parcel);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 2) {
                        bArr4 = wb.b(parcel, readInt5);
                    } else if (c12 == 3) {
                        bArr5 = wb.b(parcel, readInt5);
                    } else if (c12 == 4) {
                        bArr6 = wb.b(parcel, readInt5);
                    } else if (c12 == 5) {
                        bArr7 = wb.b(parcel, readInt5);
                    } else if (c12 != 6) {
                        wb.y(parcel, readInt5);
                    } else {
                        bArr8 = wb.b(parcel, readInt5);
                    }
                }
                wb.m(parcel, z15);
                return new i(bArr4, bArr5, bArr6, bArr7, bArr8);
            case 5:
                int z16 = wb.z(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 2) {
                        bArr9 = wb.b(parcel, readInt6);
                    } else if (c13 == 3) {
                        bArr10 = wb.b(parcel, readInt6);
                    } else if (c13 == 4) {
                        bArr11 = wb.b(parcel, readInt6);
                    } else if (c13 != 5) {
                        wb.y(parcel, readInt6);
                    } else {
                        strArr = wb.i(parcel, readInt6);
                    }
                }
                wb.m(parcel, z16);
                return new j(bArr9, bArr10, bArr11, strArr);
            case 6:
                int z17 = wb.z(parcel);
                int i7 = 0;
                String str = null;
                int i10 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 2) {
                        i7 = wb.u(parcel, readInt7);
                    } else if (c14 == 3) {
                        str = wb.h(parcel, readInt7);
                    } else if (c14 != 4) {
                        wb.y(parcel, readInt7);
                    } else {
                        i10 = wb.u(parcel, readInt7);
                    }
                }
                wb.m(parcel, z17);
                return new k(i7, i10, str);
            case 7:
                int z18 = wb.z(parcel);
                String str2 = null;
                Boolean bool = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 2) {
                        str2 = wb.h(parcel, readInt8);
                    } else if (c15 == 3) {
                        bool = wb.o(parcel, readInt8);
                    } else if (c15 == 4) {
                        str3 = wb.h(parcel, readInt8);
                    } else if (c15 != 5) {
                        wb.y(parcel, readInt8);
                    } else {
                        str4 = wb.h(parcel, readInt8);
                    }
                }
                wb.m(parcel, z18);
                return new m(str2, bool, str3, str4);
            case 8:
                try {
                    return o.a(parcel.readInt());
                } catch (n e10) {
                    throw new RuntimeException(e10);
                }
            case 9:
                int z19 = wb.z(parcel);
                byte[] bArr12 = null;
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                long j3 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        j3 = wb.w(parcel, readInt9);
                    } else if (c16 == 2) {
                        bArr12 = wb.b(parcel, readInt9);
                    } else if (c16 == 3) {
                        bArr13 = wb.b(parcel, readInt9);
                    } else if (c16 != 4) {
                        wb.y(parcel, readInt9);
                    } else {
                        bArr14 = wb.b(parcel, readInt9);
                    }
                }
                wb.m(parcel, z19);
                return new w0(j3, bArr12, bArr13, bArr14);
            case 10:
                int z20 = wb.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z20) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        wb.y(parcel, readInt10);
                    } else {
                        arrayList = wb.l(parcel, readInt10, w0.CREATOR);
                    }
                }
                wb.m(parcel, z20);
                return new x0(arrayList);
            case 11:
                int z21 = wb.z(parcel);
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        wb.y(parcel, readInt11);
                    } else {
                        wb.n(parcel, readInt11);
                    }
                }
                wb.m(parcel, z21);
                return new y0();
            case 12:
                try {
                    return r.a(parcel.readInt());
                } catch (q e11) {
                    throw new IllegalArgumentException(e11);
                }
            case 13:
                int z22 = wb.z(parcel);
                String str5 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        wb.y(parcel, readInt12);
                    } else {
                        str5 = wb.h(parcel, readInt12);
                    }
                }
                wb.m(parcel, z22);
                return new s(str5);
            case 14:
                int z23 = wb.z(parcel);
                boolean z24 = false;
                while (parcel.dataPosition() < z23) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        wb.y(parcel, readInt13);
                    } else {
                        z24 = wb.n(parcel, readInt13);
                    }
                }
                wb.m(parcel, z23);
                return new g6.a0(z24);
            case 15:
                int z25 = wb.z(parcel);
                int i11 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        wb.y(parcel, readInt14);
                    } else {
                        i11 = wb.u(parcel, readInt14);
                    }
                }
                wb.m(parcel, z25);
                return new g6.b0(i11);
            case 16:
                int z26 = wb.z(parcel);
                String str6 = null;
                ArrayList arrayList2 = null;
                f6.i iVar = null;
                h6.a aVar = null;
                ArrayList arrayList3 = null;
                g6.a0 a0Var = null;
                g6.b0 b0Var = null;
                boolean z27 = false;
                boolean z28 = false;
                boolean z29 = false;
                boolean z30 = false;
                boolean z31 = false;
                boolean z32 = false;
                boolean z33 = false;
                boolean z34 = false;
                double d = 0.0d;
                while (parcel.dataPosition() < z26) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            str6 = wb.h(parcel, readInt15);
                            break;
                        case 3:
                            arrayList2 = wb.j(parcel, readInt15);
                            break;
                        case 4:
                            z27 = wb.n(parcel, readInt15);
                            break;
                        case 5:
                            iVar = (f6.i) wb.g(parcel, readInt15, f6.i.CREATOR);
                            break;
                        case 6:
                            z28 = wb.n(parcel, readInt15);
                            break;
                        case 7:
                            aVar = (h6.a) wb.g(parcel, readInt15, h6.a.CREATOR);
                            break;
                        case '\b':
                            z29 = wb.n(parcel, readInt15);
                            break;
                        case '\t':
                            d = wb.q(parcel, readInt15);
                            break;
                        case '\n':
                            z30 = wb.n(parcel, readInt15);
                            break;
                        case 11:
                            z31 = wb.n(parcel, readInt15);
                            break;
                        case '\f':
                            z32 = wb.n(parcel, readInt15);
                            break;
                        case '\r':
                            arrayList3 = wb.j(parcel, readInt15);
                            break;
                        case 14:
                            z33 = wb.n(parcel, readInt15);
                            break;
                        case 15:
                            wb.u(parcel, readInt15);
                            break;
                        case 16:
                            z34 = wb.n(parcel, readInt15);
                            break;
                        case 17:
                            a0Var = (g6.a0) wb.g(parcel, readInt15, g6.a0.CREATOR);
                            break;
                        case 18:
                            b0Var = (g6.b0) wb.g(parcel, readInt15, g6.b0.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt15);
                            break;
                    }
                }
                wb.m(parcel, z26);
                return new g6.b(str6, arrayList2, z27, iVar, z28, aVar, z29, d, z30, z31, z32, arrayList3, z33, z34, a0Var, b0Var);
            case 17:
                int z35 = wb.z(parcel);
                boolean z36 = false;
                boolean z37 = false;
                String str7 = null;
                String str8 = null;
                IBinder iBinder = null;
                h6.f fVar = null;
                while (parcel.dataPosition() < z35) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            str7 = wb.h(parcel, readInt16);
                            break;
                        case 3:
                            str8 = wb.h(parcel, readInt16);
                            break;
                        case 4:
                            iBinder = wb.t(parcel, readInt16);
                            break;
                        case 5:
                            fVar = (h6.f) wb.g(parcel, readInt16, h6.f.CREATOR);
                            break;
                        case 6:
                            z36 = wb.n(parcel, readInt16);
                            break;
                        case 7:
                            z37 = wb.n(parcel, readInt16);
                            break;
                        default:
                            wb.y(parcel, readInt16);
                            break;
                    }
                }
                wb.m(parcel, z35);
                return new h6.a(str7, str8, iBinder, fVar, z36, z37);
            case 18:
                int z38 = wb.z(parcel);
                int i12 = 0;
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
                boolean z39 = false;
                boolean z40 = false;
                ArrayList arrayList4 = null;
                int[] iArr = null;
                String str9 = null;
                IBinder iBinder2 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z38) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            arrayList4 = wb.j(parcel, readInt17);
                            break;
                        case 3:
                            iArr = wb.d(parcel, readInt17);
                            break;
                        case 4:
                            j10 = wb.w(parcel, readInt17);
                            break;
                        case 5:
                            str9 = wb.h(parcel, readInt17);
                            break;
                        case 6:
                            i12 = wb.u(parcel, readInt17);
                            break;
                        case 7:
                            i13 = wb.u(parcel, readInt17);
                            break;
                        case '\b':
                            i14 = wb.u(parcel, readInt17);
                            break;
                        case '\t':
                            i15 = wb.u(parcel, readInt17);
                            break;
                        case '\n':
                            i16 = wb.u(parcel, readInt17);
                            break;
                        case 11:
                            i17 = wb.u(parcel, readInt17);
                            break;
                        case '\f':
                            i18 = wb.u(parcel, readInt17);
                            break;
                        case '\r':
                            i19 = wb.u(parcel, readInt17);
                            break;
                        case 14:
                            i20 = wb.u(parcel, readInt17);
                            break;
                        case 15:
                            i21 = wb.u(parcel, readInt17);
                            break;
                        case 16:
                            i22 = wb.u(parcel, readInt17);
                            break;
                        case 17:
                            i23 = wb.u(parcel, readInt17);
                            break;
                        case 18:
                            i24 = wb.u(parcel, readInt17);
                            break;
                        case 19:
                            i25 = wb.u(parcel, readInt17);
                            break;
                        case 20:
                            i26 = wb.u(parcel, readInt17);
                            break;
                        case 21:
                            i27 = wb.u(parcel, readInt17);
                            break;
                        case 22:
                            i28 = wb.u(parcel, readInt17);
                            break;
                        case 23:
                            i29 = wb.u(parcel, readInt17);
                            break;
                        case 24:
                            i30 = wb.u(parcel, readInt17);
                            break;
                        case 25:
                            i31 = wb.u(parcel, readInt17);
                            break;
                        case 26:
                            i32 = wb.u(parcel, readInt17);
                            break;
                        case 27:
                            i33 = wb.u(parcel, readInt17);
                            break;
                        case 28:
                            i34 = wb.u(parcel, readInt17);
                            break;
                        case 29:
                            i35 = wb.u(parcel, readInt17);
                            break;
                        case qs.T /* 30 */:
                            i36 = wb.u(parcel, readInt17);
                            break;
                        case qs.U /* 31 */:
                            i37 = wb.u(parcel, readInt17);
                            break;
                        case ' ':
                            i38 = wb.u(parcel, readInt17);
                            break;
                        case '!':
                            iBinder2 = wb.t(parcel, readInt17);
                            break;
                        case '\"':
                            z39 = wb.n(parcel, readInt17);
                            break;
                        case '#':
                            z40 = wb.n(parcel, readInt17);
                            break;
                        default:
                            wb.y(parcel, readInt17);
                            break;
                    }
                }
                wb.m(parcel, z38);
                return new h6.f(arrayList4, iArr, j10, str9, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, iBinder2, z39, z40);
            case 19:
                int z41 = wb.z(parcel);
                int i39 = 0;
                int i40 = 0;
                int i41 = 0;
                while (parcel.dataPosition() < z41) {
                    int readInt18 = parcel.readInt();
                    char c17 = (char) readInt18;
                    if (c17 == 2) {
                        i39 = wb.u(parcel, readInt18);
                    } else if (c17 == 3) {
                        i40 = wb.u(parcel, readInt18);
                    } else if (c17 != 4) {
                        wb.y(parcel, readInt18);
                    } else {
                        i41 = wb.u(parcel, readInt18);
                    }
                }
                wb.m(parcel, z41);
                return new h6.b(i39, i40, i41);
            case 20:
                int z42 = wb.z(parcel);
                String str10 = null;
                int i42 = 0;
                String str11 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt19 = parcel.readInt();
                    char c18 = (char) readInt19;
                    if (c18 == 2) {
                        str10 = wb.h(parcel, readInt19);
                    } else if (c18 == 3) {
                        i42 = wb.u(parcel, readInt19);
                    } else if (c18 != 4) {
                        wb.y(parcel, readInt19);
                    } else {
                        str11 = wb.h(parcel, readInt19);
                    }
                }
                wb.m(parcel, z42);
                return new h6.d(str10, i42, str11);
            case 21:
                int z43 = wb.z(parcel);
                byte[] bArr15 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        wb.y(parcel, readInt20);
                    } else {
                        bArr15 = wb.b(parcel, readInt20);
                    }
                }
                wb.m(parcel, z43);
                return new h8.d(bArr15);
            case 22:
                int z44 = wb.z(parcel);
                byte[] bArr16 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        wb.y(parcel, readInt21);
                    } else {
                        bArr16 = wb.b(parcel, readInt21);
                    }
                }
                wb.m(parcel, z44);
                return new h8.e(bArr16);
            case 23:
                int z45 = wb.z(parcel);
                byte[] bArr17 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        wb.y(parcel, readInt22);
                    } else {
                        bArr17 = wb.b(parcel, readInt22);
                    }
                }
                wb.m(parcel, z45);
                return new h8.f(bArr17);
            case 24:
                int z46 = wb.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z46) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        wb.y(parcel, readInt23);
                    } else {
                        pendingIntent = (PendingIntent) wb.g(parcel, readInt23, PendingIntent.CREATOR);
                    }
                }
                wb.m(parcel, z46);
                return new h8.g(pendingIntent);
            case 25:
                int z47 = wb.z(parcel);
                String[] strArr2 = null;
                int[] iArr2 = null;
                RemoteViews remoteViews = null;
                byte[] bArr18 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt24 = parcel.readInt();
                    char c19 = (char) readInt24;
                    if (c19 == 1) {
                        strArr2 = wb.i(parcel, readInt24);
                    } else if (c19 == 2) {
                        iArr2 = wb.d(parcel, readInt24);
                    } else if (c19 == 3) {
                        remoteViews = (RemoteViews) wb.g(parcel, readInt24, RemoteViews.CREATOR);
                    } else if (c19 != 4) {
                        wb.y(parcel, readInt24);
                    } else {
                        bArr18 = wb.b(parcel, readInt24);
                    }
                }
                wb.m(parcel, z47);
                h8.h hVar = new h8.h();
                hVar.a = strArr2;
                hVar.b = iArr2;
                hVar.c = remoteViews;
                hVar.d = bArr18;
                return hVar;
            case 26:
                int z48 = wb.z(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                boolean z49 = false;
                String str25 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt25 = parcel.readInt();
                    boolean z50 = z49;
                    switch ((char) readInt25) {
                        case 2:
                            str12 = wb.h(parcel, readInt25);
                            break;
                        case 3:
                            str25 = wb.h(parcel, readInt25);
                            break;
                        case 4:
                            str13 = wb.h(parcel, readInt25);
                            break;
                        case 5:
                            str14 = wb.h(parcel, readInt25);
                            break;
                        case 6:
                            str15 = wb.h(parcel, readInt25);
                            break;
                        case 7:
                            str16 = wb.h(parcel, readInt25);
                            break;
                        case '\b':
                            str17 = wb.h(parcel, readInt25);
                            break;
                        case '\t':
                            str18 = wb.h(parcel, readInt25);
                            break;
                        case '\n':
                            str19 = wb.h(parcel, readInt25);
                            break;
                        case 11:
                            str20 = wb.h(parcel, readInt25);
                            break;
                        case '\f':
                            str21 = wb.h(parcel, readInt25);
                            break;
                        case '\r':
                            str22 = wb.h(parcel, readInt25);
                            break;
                        case 14:
                            z49 = wb.n(parcel, readInt25);
                            continue;
                        case 15:
                            str24 = wb.h(parcel, readInt25);
                            break;
                        case 16:
                            str23 = wb.h(parcel, readInt25);
                            break;
                        default:
                            wb.y(parcel, readInt25);
                            break;
                    }
                    z49 = z50;
                }
                wb.m(parcel, z48);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str12;
                userAddress.b = str25;
                userAddress.c = str13;
                userAddress.d = str14;
                userAddress.e = str15;
                userAddress.f = str16;
                userAddress.h = str17;
                userAddress.n = str18;
                userAddress.r = str19;
                userAddress.s = str20;
                userAddress.w = str21;
                userAddress.x = str22;
                userAddress.y = z49;
                userAddress.D = str24;
                userAddress.E = str23;
                return userAddress;
            case 27:
                int z51 = wb.z(parcel);
                int i43 = 0;
                boolean z52 = false;
                boolean z53 = false;
                while (parcel.dataPosition() < z51) {
                    int readInt26 = parcel.readInt();
                    char c20 = (char) readInt26;
                    if (c20 == 2) {
                        i43 = wb.u(parcel, readInt26);
                    } else if (c20 == 3) {
                        z52 = wb.n(parcel, readInt26);
                    } else if (c20 != 4) {
                        wb.y(parcel, readInt26);
                    } else {
                        z53 = wb.n(parcel, readInt26);
                    }
                }
                wb.m(parcel, z51);
                return new j6.x(i43, z52, z53);
            case 28:
                int z54 = wb.z(parcel);
                double d2 = 0.0d;
                f6.d dVar = null;
                f6.x xVar = null;
                boolean z55 = false;
                int i44 = 0;
                int i45 = 0;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z54) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            d2 = wb.q(parcel, readInt27);
                            break;
                        case 3:
                            z55 = wb.n(parcel, readInt27);
                            break;
                        case 4:
                            i44 = wb.u(parcel, readInt27);
                            break;
                        case 5:
                            dVar = (f6.d) wb.g(parcel, readInt27, f6.d.CREATOR);
                            break;
                        case 6:
                            i45 = wb.u(parcel, readInt27);
                            break;
                        case 7:
                            xVar = (f6.x) wb.g(parcel, readInt27, f6.x.CREATOR);
                            break;
                        case '\b':
                            d10 = wb.q(parcel, readInt27);
                            break;
                        default:
                            wb.y(parcel, readInt27);
                            break;
                    }
                }
                wb.m(parcel, z54);
                j6.d dVar2 = new j6.d();
                dVar2.a = d2;
                dVar2.b = z55;
                dVar2.c = i44;
                dVar2.d = dVar;
                dVar2.e = i45;
                dVar2.f = xVar;
                dVar2.h = d10;
                return dVar2;
            default:
                int z56 = wb.z(parcel);
                String str26 = null;
                while (parcel.dataPosition() < z56) {
                    int readInt28 = parcel.readInt();
                    if (((char) readInt28) != 2) {
                        wb.y(parcel, readInt28);
                    } else {
                        str26 = wb.h(parcel, readInt28);
                    }
                }
                wb.m(parcel, z56);
                return new j6.c(str26);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new f[i7];
            case 1:
                return new h[i7];
            case 2:
                return new u0[i7];
            case 3:
                return new v0[i7];
            case 4:
                return new i[i7];
            case 5:
                return new j[i7];
            case 6:
                return new k[i7];
            case 7:
                return new m[i7];
            case 8:
                return new o[i7];
            case 9:
                return new w0[i7];
            case 10:
                return new x0[i7];
            case 11:
                return new y0[i7];
            case 12:
                return new r[i7];
            case 13:
                return new s[i7];
            case 14:
                return new g6.a0[i7];
            case 15:
                return new g6.b0[i7];
            case 16:
                return new g6.b[i7];
            case 17:
                return new h6.a[i7];
            case 18:
                return new h6.f[i7];
            case 19:
                return new h6.b[i7];
            case 20:
                return new h6.d[i7];
            case 21:
                return new h8.d[i7];
            case 22:
                return new h8.e[i7];
            case 23:
                return new h8.f[i7];
            case 24:
                return new h8.g[i7];
            case 25:
                return new h8.h[i7];
            case 26:
                return new UserAddress[i7];
            case 27:
                return new j6.x[i7];
            case 28:
                return new j6.d[i7];
            default:
                return new j6.c[i7];
        }
    }
}
