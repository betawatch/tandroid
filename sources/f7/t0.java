package f7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
import java.util.ArrayList;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                int z10 = xb.z(parcel);
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
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            sVar = (s) xb.g(parcel, readInt, s.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) xb.g(parcel, readInt, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) xb.g(parcel, readInt, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) xb.g(parcel, readInt, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) xb.g(parcel, readInt, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) xb.g(parcel, readInt, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) xb.g(parcel, readInt, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) xb.g(parcel, readInt, o0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) xb.g(parcel, readInt, t.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) xb.g(parcel, readInt, q0.CREATOR);
                            break;
                        case '\f':
                            r0Var = (r0) xb.g(parcel, readInt, r0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) xb.g(parcel, readInt, p0.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt);
                            break;
                    }
                }
                xb.m(parcel, z10);
                return new f(sVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, tVar, q0Var, r0Var, p0Var);
            case 1:
                int z11 = xb.z(parcel);
                boolean z12 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        xb.y(parcel, readInt2);
                    } else {
                        z12 = xb.n(parcel, readInt2);
                    }
                }
                xb.m(parcel, z11);
                return new h(z12);
            case 2:
                int z13 = xb.z(parcel);
                byte[] bArr = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        bArr = xb.b(parcel, readInt3);
                    } else if (c10 != 2) {
                        xb.y(parcel, readInt3);
                    } else {
                        bArr2 = xb.b(parcel, readInt3);
                    }
                }
                xb.m(parcel, z13);
                return new u0(bArr == null ? null : q7.s0.o(bArr.length, bArr), bArr2 != null ? q7.s0.o(bArr2.length, bArr2) : null);
            case 3:
                int z14 = xb.z(parcel);
                boolean z15 = false;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        z15 = xb.n(parcel, readInt4);
                    } else if (c11 != 2) {
                        xb.y(parcel, readInt4);
                    } else {
                        bArr3 = xb.b(parcel, readInt4);
                    }
                }
                xb.m(parcel, z14);
                return new v0(z15, bArr3 != null ? q7.s0.o(bArr3.length, bArr3) : null);
            case 4:
                int z16 = xb.z(parcel);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 2) {
                        bArr4 = xb.b(parcel, readInt5);
                    } else if (c12 == 3) {
                        bArr5 = xb.b(parcel, readInt5);
                    } else if (c12 == 4) {
                        bArr6 = xb.b(parcel, readInt5);
                    } else if (c12 == 5) {
                        bArr7 = xb.b(parcel, readInt5);
                    } else if (c12 != 6) {
                        xb.y(parcel, readInt5);
                    } else {
                        bArr8 = xb.b(parcel, readInt5);
                    }
                }
                xb.m(parcel, z16);
                return new i(bArr4, bArr5, bArr6, bArr7, bArr8);
            case 5:
                int z17 = xb.z(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 2) {
                        bArr9 = xb.b(parcel, readInt6);
                    } else if (c13 == 3) {
                        bArr10 = xb.b(parcel, readInt6);
                    } else if (c13 == 4) {
                        bArr11 = xb.b(parcel, readInt6);
                    } else if (c13 != 5) {
                        xb.y(parcel, readInt6);
                    } else {
                        strArr = xb.i(parcel, readInt6);
                    }
                }
                xb.m(parcel, z17);
                return new j(bArr9, bArr10, bArr11, strArr);
            case 6:
                int z18 = xb.z(parcel);
                int i7 = 0;
                String str = null;
                int i10 = 0;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 2) {
                        i7 = xb.u(parcel, readInt7);
                    } else if (c14 == 3) {
                        str = xb.h(parcel, readInt7);
                    } else if (c14 != 4) {
                        xb.y(parcel, readInt7);
                    } else {
                        i10 = xb.u(parcel, readInt7);
                    }
                }
                xb.m(parcel, z18);
                return new k(i7, i10, str);
            case 7:
                int z19 = xb.z(parcel);
                String str2 = null;
                Boolean bool = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 2) {
                        str2 = xb.h(parcel, readInt8);
                    } else if (c15 == 3) {
                        bool = xb.o(parcel, readInt8);
                    } else if (c15 == 4) {
                        str3 = xb.h(parcel, readInt8);
                    } else if (c15 != 5) {
                        xb.y(parcel, readInt8);
                    } else {
                        str4 = xb.h(parcel, readInt8);
                    }
                }
                xb.m(parcel, z19);
                return new m(str2, bool, str3, str4);
            case 8:
                try {
                    return o.a(parcel.readInt());
                } catch (n e10) {
                    throw new RuntimeException(e10);
                }
            case 9:
                int z20 = xb.z(parcel);
                byte[] bArr12 = null;
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                long j3 = 0;
                while (parcel.dataPosition() < z20) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        j3 = xb.w(parcel, readInt9);
                    } else if (c16 == 2) {
                        bArr12 = xb.b(parcel, readInt9);
                    } else if (c16 == 3) {
                        bArr13 = xb.b(parcel, readInt9);
                    } else if (c16 != 4) {
                        xb.y(parcel, readInt9);
                    } else {
                        bArr14 = xb.b(parcel, readInt9);
                    }
                }
                xb.m(parcel, z20);
                return new w0(j3, bArr12, bArr13, bArr14);
            case 10:
                int z21 = xb.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        xb.y(parcel, readInt10);
                    } else {
                        arrayList = xb.l(parcel, readInt10, w0.CREATOR);
                    }
                }
                xb.m(parcel, z21);
                return new x0(arrayList);
            case 11:
                int z22 = xb.z(parcel);
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        xb.y(parcel, readInt11);
                    } else {
                        xb.n(parcel, readInt11);
                    }
                }
                xb.m(parcel, z22);
                return new y0();
            case 12:
                try {
                    return r.a(parcel.readInt());
                } catch (q e11) {
                    throw new IllegalArgumentException(e11);
                }
            case 13:
                int z23 = xb.z(parcel);
                String str5 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        xb.y(parcel, readInt12);
                    } else {
                        str5 = xb.h(parcel, readInt12);
                    }
                }
                xb.m(parcel, z23);
                return new s(str5);
            case 14:
                int z24 = xb.z(parcel);
                boolean z25 = false;
                while (parcel.dataPosition() < z24) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        xb.y(parcel, readInt13);
                    } else {
                        z25 = xb.n(parcel, readInt13);
                    }
                }
                xb.m(parcel, z24);
                return new g6.a0(z25);
            case 15:
                int z26 = xb.z(parcel);
                int i11 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        xb.y(parcel, readInt14);
                    } else {
                        i11 = xb.u(parcel, readInt14);
                    }
                }
                xb.m(parcel, z26);
                return new g6.b0(i11);
            case 16:
                int z27 = xb.z(parcel);
                String str6 = null;
                ArrayList arrayList2 = null;
                f6.i iVar = null;
                h6.a aVar = null;
                ArrayList arrayList3 = null;
                g6.a0 a0Var = null;
                g6.b0 b0Var = null;
                boolean z28 = false;
                boolean z29 = false;
                boolean z30 = false;
                boolean z31 = false;
                boolean z32 = false;
                boolean z33 = false;
                boolean z34 = false;
                boolean z35 = false;
                double d = 0.0d;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            str6 = xb.h(parcel, readInt15);
                            break;
                        case 3:
                            arrayList2 = xb.j(parcel, readInt15);
                            break;
                        case 4:
                            z28 = xb.n(parcel, readInt15);
                            break;
                        case 5:
                            iVar = (f6.i) xb.g(parcel, readInt15, f6.i.CREATOR);
                            break;
                        case 6:
                            z29 = xb.n(parcel, readInt15);
                            break;
                        case 7:
                            aVar = (h6.a) xb.g(parcel, readInt15, h6.a.CREATOR);
                            break;
                        case '\b':
                            z30 = xb.n(parcel, readInt15);
                            break;
                        case '\t':
                            d = xb.q(parcel, readInt15);
                            break;
                        case '\n':
                            z31 = xb.n(parcel, readInt15);
                            break;
                        case 11:
                            z32 = xb.n(parcel, readInt15);
                            break;
                        case '\f':
                            z33 = xb.n(parcel, readInt15);
                            break;
                        case '\r':
                            arrayList3 = xb.j(parcel, readInt15);
                            break;
                        case 14:
                            z34 = xb.n(parcel, readInt15);
                            break;
                        case 15:
                            xb.u(parcel, readInt15);
                            break;
                        case 16:
                            z35 = xb.n(parcel, readInt15);
                            break;
                        case 17:
                            a0Var = (g6.a0) xb.g(parcel, readInt15, g6.a0.CREATOR);
                            break;
                        case 18:
                            b0Var = (g6.b0) xb.g(parcel, readInt15, g6.b0.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt15);
                            break;
                    }
                }
                xb.m(parcel, z27);
                return new g6.b(str6, arrayList2, z28, iVar, z29, aVar, z30, d, z31, z32, z33, arrayList3, z34, z35, a0Var, b0Var);
            case 17:
                int z36 = xb.z(parcel);
                boolean z37 = false;
                boolean z38 = false;
                String str7 = null;
                String str8 = null;
                IBinder iBinder = null;
                h6.f fVar = null;
                while (parcel.dataPosition() < z36) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            str7 = xb.h(parcel, readInt16);
                            break;
                        case 3:
                            str8 = xb.h(parcel, readInt16);
                            break;
                        case 4:
                            iBinder = xb.t(parcel, readInt16);
                            break;
                        case 5:
                            fVar = (h6.f) xb.g(parcel, readInt16, h6.f.CREATOR);
                            break;
                        case 6:
                            z37 = xb.n(parcel, readInt16);
                            break;
                        case 7:
                            z38 = xb.n(parcel, readInt16);
                            break;
                        default:
                            xb.y(parcel, readInt16);
                            break;
                    }
                }
                xb.m(parcel, z36);
                return new h6.a(str7, str8, iBinder, fVar, z37, z38);
            case 18:
                int z39 = xb.z(parcel);
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
                boolean z40 = false;
                boolean z41 = false;
                ArrayList arrayList4 = null;
                int[] iArr = null;
                String str9 = null;
                IBinder iBinder2 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z39) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            arrayList4 = xb.j(parcel, readInt17);
                            break;
                        case 3:
                            iArr = xb.d(parcel, readInt17);
                            break;
                        case 4:
                            j10 = xb.w(parcel, readInt17);
                            break;
                        case 5:
                            str9 = xb.h(parcel, readInt17);
                            break;
                        case 6:
                            i12 = xb.u(parcel, readInt17);
                            break;
                        case 7:
                            i13 = xb.u(parcel, readInt17);
                            break;
                        case '\b':
                            i14 = xb.u(parcel, readInt17);
                            break;
                        case '\t':
                            i15 = xb.u(parcel, readInt17);
                            break;
                        case '\n':
                            i16 = xb.u(parcel, readInt17);
                            break;
                        case 11:
                            i17 = xb.u(parcel, readInt17);
                            break;
                        case '\f':
                            i18 = xb.u(parcel, readInt17);
                            break;
                        case '\r':
                            i19 = xb.u(parcel, readInt17);
                            break;
                        case 14:
                            i20 = xb.u(parcel, readInt17);
                            break;
                        case 15:
                            i21 = xb.u(parcel, readInt17);
                            break;
                        case 16:
                            i22 = xb.u(parcel, readInt17);
                            break;
                        case 17:
                            i23 = xb.u(parcel, readInt17);
                            break;
                        case 18:
                            i24 = xb.u(parcel, readInt17);
                            break;
                        case 19:
                            i25 = xb.u(parcel, readInt17);
                            break;
                        case 20:
                            i26 = xb.u(parcel, readInt17);
                            break;
                        case 21:
                            i27 = xb.u(parcel, readInt17);
                            break;
                        case 22:
                            i28 = xb.u(parcel, readInt17);
                            break;
                        case 23:
                            i29 = xb.u(parcel, readInt17);
                            break;
                        case 24:
                            i30 = xb.u(parcel, readInt17);
                            break;
                        case 25:
                            i31 = xb.u(parcel, readInt17);
                            break;
                        case 26:
                            i32 = xb.u(parcel, readInt17);
                            break;
                        case 27:
                            i33 = xb.u(parcel, readInt17);
                            break;
                        case 28:
                            i34 = xb.u(parcel, readInt17);
                            break;
                        case 29:
                            i35 = xb.u(parcel, readInt17);
                            break;
                        case ns.T /* 30 */:
                            i36 = xb.u(parcel, readInt17);
                            break;
                        case ns.U /* 31 */:
                            i37 = xb.u(parcel, readInt17);
                            break;
                        case ' ':
                            i38 = xb.u(parcel, readInt17);
                            break;
                        case '!':
                            iBinder2 = xb.t(parcel, readInt17);
                            break;
                        case '\"':
                            z40 = xb.n(parcel, readInt17);
                            break;
                        case '#':
                            z41 = xb.n(parcel, readInt17);
                            break;
                        default:
                            xb.y(parcel, readInt17);
                            break;
                    }
                }
                xb.m(parcel, z39);
                return new h6.f(arrayList4, iArr, j10, str9, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, iBinder2, z40, z41);
            case 19:
                int z42 = xb.z(parcel);
                int i39 = 0;
                int i40 = 0;
                int i41 = 0;
                while (parcel.dataPosition() < z42) {
                    int readInt18 = parcel.readInt();
                    char c17 = (char) readInt18;
                    if (c17 == 2) {
                        i39 = xb.u(parcel, readInt18);
                    } else if (c17 == 3) {
                        i40 = xb.u(parcel, readInt18);
                    } else if (c17 != 4) {
                        xb.y(parcel, readInt18);
                    } else {
                        i41 = xb.u(parcel, readInt18);
                    }
                }
                xb.m(parcel, z42);
                return new h6.b(i39, i40, i41);
            case 20:
                int z43 = xb.z(parcel);
                String str10 = null;
                int i42 = 0;
                String str11 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt19 = parcel.readInt();
                    char c18 = (char) readInt19;
                    if (c18 == 2) {
                        str10 = xb.h(parcel, readInt19);
                    } else if (c18 == 3) {
                        i42 = xb.u(parcel, readInt19);
                    } else if (c18 != 4) {
                        xb.y(parcel, readInt19);
                    } else {
                        str11 = xb.h(parcel, readInt19);
                    }
                }
                xb.m(parcel, z43);
                return new h6.d(str10, i42, str11);
            case 21:
                int z44 = xb.z(parcel);
                byte[] bArr15 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        xb.y(parcel, readInt20);
                    } else {
                        bArr15 = xb.b(parcel, readInt20);
                    }
                }
                xb.m(parcel, z44);
                return new h8.d(bArr15);
            case 22:
                int z45 = xb.z(parcel);
                byte[] bArr16 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        xb.y(parcel, readInt21);
                    } else {
                        bArr16 = xb.b(parcel, readInt21);
                    }
                }
                xb.m(parcel, z45);
                return new h8.e(bArr16);
            case 23:
                int z46 = xb.z(parcel);
                byte[] bArr17 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        xb.y(parcel, readInt22);
                    } else {
                        bArr17 = xb.b(parcel, readInt22);
                    }
                }
                xb.m(parcel, z46);
                return new h8.f(bArr17);
            case 24:
                int z47 = xb.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z47) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        xb.y(parcel, readInt23);
                    } else {
                        pendingIntent = (PendingIntent) xb.g(parcel, readInt23, PendingIntent.CREATOR);
                    }
                }
                xb.m(parcel, z47);
                return new h8.g(pendingIntent);
            case 25:
                int z48 = xb.z(parcel);
                String[] strArr2 = null;
                int[] iArr2 = null;
                RemoteViews remoteViews = null;
                byte[] bArr18 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt24 = parcel.readInt();
                    char c19 = (char) readInt24;
                    if (c19 == 1) {
                        strArr2 = xb.i(parcel, readInt24);
                    } else if (c19 == 2) {
                        iArr2 = xb.d(parcel, readInt24);
                    } else if (c19 == 3) {
                        remoteViews = (RemoteViews) xb.g(parcel, readInt24, RemoteViews.CREATOR);
                    } else if (c19 != 4) {
                        xb.y(parcel, readInt24);
                    } else {
                        bArr18 = xb.b(parcel, readInt24);
                    }
                }
                xb.m(parcel, z48);
                h8.h hVar = new h8.h();
                hVar.a = strArr2;
                hVar.b = iArr2;
                hVar.c = remoteViews;
                hVar.d = bArr18;
                return hVar;
            case 26:
                int z49 = xb.z(parcel);
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
                boolean z50 = false;
                String str25 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt25 = parcel.readInt();
                    boolean z51 = z50;
                    switch ((char) readInt25) {
                        case 2:
                            str12 = xb.h(parcel, readInt25);
                            break;
                        case 3:
                            str25 = xb.h(parcel, readInt25);
                            break;
                        case 4:
                            str13 = xb.h(parcel, readInt25);
                            break;
                        case 5:
                            str14 = xb.h(parcel, readInt25);
                            break;
                        case 6:
                            str15 = xb.h(parcel, readInt25);
                            break;
                        case 7:
                            str16 = xb.h(parcel, readInt25);
                            break;
                        case '\b':
                            str17 = xb.h(parcel, readInt25);
                            break;
                        case '\t':
                            str18 = xb.h(parcel, readInt25);
                            break;
                        case '\n':
                            str19 = xb.h(parcel, readInt25);
                            break;
                        case 11:
                            str20 = xb.h(parcel, readInt25);
                            break;
                        case '\f':
                            str21 = xb.h(parcel, readInt25);
                            break;
                        case '\r':
                            str22 = xb.h(parcel, readInt25);
                            break;
                        case 14:
                            z50 = xb.n(parcel, readInt25);
                            continue;
                        case 15:
                            str24 = xb.h(parcel, readInt25);
                            break;
                        case 16:
                            str23 = xb.h(parcel, readInt25);
                            break;
                        default:
                            xb.y(parcel, readInt25);
                            break;
                    }
                    z50 = z51;
                }
                xb.m(parcel, z49);
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
                userAddress.y = z50;
                userAddress.E = str24;
                userAddress.F = str23;
                return userAddress;
            case 27:
                int z52 = xb.z(parcel);
                int i43 = 0;
                boolean z53 = false;
                boolean z54 = false;
                while (parcel.dataPosition() < z52) {
                    int readInt26 = parcel.readInt();
                    char c20 = (char) readInt26;
                    if (c20 == 2) {
                        i43 = xb.u(parcel, readInt26);
                    } else if (c20 == 3) {
                        z53 = xb.n(parcel, readInt26);
                    } else if (c20 != 4) {
                        xb.y(parcel, readInt26);
                    } else {
                        z54 = xb.n(parcel, readInt26);
                    }
                }
                xb.m(parcel, z52);
                return new j6.y(i43, z53, z54);
            case 28:
                int z55 = xb.z(parcel);
                double d2 = 0.0d;
                f6.d dVar = null;
                f6.x xVar = null;
                boolean z56 = false;
                int i44 = 0;
                int i45 = 0;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z55) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            d2 = xb.q(parcel, readInt27);
                            break;
                        case 3:
                            z56 = xb.n(parcel, readInt27);
                            break;
                        case 4:
                            i44 = xb.u(parcel, readInt27);
                            break;
                        case 5:
                            dVar = (f6.d) xb.g(parcel, readInt27, f6.d.CREATOR);
                            break;
                        case 6:
                            i45 = xb.u(parcel, readInt27);
                            break;
                        case 7:
                            xVar = (f6.x) xb.g(parcel, readInt27, f6.x.CREATOR);
                            break;
                        case '\b':
                            d10 = xb.q(parcel, readInt27);
                            break;
                        default:
                            xb.y(parcel, readInt27);
                            break;
                    }
                }
                xb.m(parcel, z55);
                j6.d dVar2 = new j6.d();
                dVar2.a = d2;
                dVar2.b = z56;
                dVar2.c = i44;
                dVar2.d = dVar;
                dVar2.e = i45;
                dVar2.f = xVar;
                dVar2.h = d10;
                return dVar2;
            default:
                int z57 = xb.z(parcel);
                String str26 = null;
                while (parcel.dataPosition() < z57) {
                    int readInt28 = parcel.readInt();
                    if (((char) readInt28) != 2) {
                        xb.y(parcel, readInt28);
                    } else {
                        str26 = xb.h(parcel, readInt28);
                    }
                }
                xb.m(parcel, z57);
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
                return new j6.y[i7];
            case 28:
                return new j6.d[i7];
            default:
                return new j6.c[i7];
        }
    }
}
