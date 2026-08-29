package o6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.identity.intents.model.UserAddress;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ w0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                String str = null;
                Boolean bool = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        str = ce.b.i(parcel, readInt);
                    } else if (c3 == 3) {
                        bool = ce.b.p(parcel, readInt);
                    } else if (c3 == 4) {
                        str2 = ce.b.i(parcel, readInt);
                    } else if (c3 != 5) {
                        ce.b.z(parcel, readInt);
                    } else {
                        str3 = ce.b.i(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new m(str, bool, str2, str3);
            case 1:
                try {
                    return o.a(parcel.readInt());
                } catch (n e10) {
                    throw new RuntimeException(e10);
                }
            case 2:
                int A2 = ce.b.A(parcel);
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                long j10 = 0;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 == 1) {
                        j10 = ce.b.x(parcel, readInt2);
                    } else if (c6 == 2) {
                        bArr = ce.b.c(parcel, readInt2);
                    } else if (c6 == 3) {
                        bArr2 = ce.b.c(parcel, readInt2);
                    } else if (c6 != 4) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        bArr3 = ce.b.c(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new x0(j10, bArr, bArr2, bArr3);
            case 3:
                int A3 = ce.b.A(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        arrayList = ce.b.m(parcel, readInt3, x0.CREATOR);
                    }
                }
                ce.b.n(parcel, A3);
                return new y0(arrayList);
            case 4:
                int A4 = ce.b.A(parcel);
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        ce.b.o(parcel, readInt4);
                    }
                }
                ce.b.n(parcel, A4);
                return new z0();
            case 5:
                try {
                    return r.a(parcel.readInt());
                } catch (q e11) {
                    throw new IllegalArgumentException(e11);
                }
            case 6:
                int A5 = ce.b.A(parcel);
                String str4 = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        str4 = ce.b.i(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A5);
                return new s(str4);
            case 7:
                int A6 = ce.b.A(parcel);
                boolean z10 = false;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        ce.b.z(parcel, readInt6);
                    } else {
                        z10 = ce.b.o(parcel, readInt6);
                    }
                }
                ce.b.n(parcel, A6);
                return new p5.a0(z10);
            case 8:
                int A7 = ce.b.A(parcel);
                int i10 = 0;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        ce.b.z(parcel, readInt7);
                    } else {
                        i10 = ce.b.v(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                return new p5.b0(i10);
            case 9:
                int A8 = ce.b.A(parcel);
                String str5 = null;
                ArrayList arrayList2 = null;
                o5.i iVar = null;
                q5.a aVar = null;
                ArrayList arrayList3 = null;
                p5.a0 a0Var = null;
                p5.b0 b0Var = null;
                double d = 0.0d;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str5 = ce.b.i(parcel, readInt8);
                            break;
                        case 3:
                            arrayList2 = ce.b.k(parcel, readInt8);
                            break;
                        case 4:
                            z11 = ce.b.o(parcel, readInt8);
                            break;
                        case 5:
                            iVar = (o5.i) ce.b.h(parcel, readInt8, o5.i.CREATOR);
                            break;
                        case 6:
                            z12 = ce.b.o(parcel, readInt8);
                            break;
                        case 7:
                            aVar = (q5.a) ce.b.h(parcel, readInt8, q5.a.CREATOR);
                            break;
                        case '\b':
                            z13 = ce.b.o(parcel, readInt8);
                            break;
                        case '\t':
                            d = ce.b.r(parcel, readInt8);
                            break;
                        case '\n':
                            z14 = ce.b.o(parcel, readInt8);
                            break;
                        case 11:
                            z15 = ce.b.o(parcel, readInt8);
                            break;
                        case '\f':
                            z16 = ce.b.o(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList3 = ce.b.k(parcel, readInt8);
                            break;
                        case 14:
                            z17 = ce.b.o(parcel, readInt8);
                            break;
                        case 15:
                            ce.b.v(parcel, readInt8);
                            break;
                        case 16:
                            z18 = ce.b.o(parcel, readInt8);
                            break;
                        case 17:
                            a0Var = (p5.a0) ce.b.h(parcel, readInt8, p5.a0.CREATOR);
                            break;
                        case 18:
                            b0Var = (p5.b0) ce.b.h(parcel, readInt8, p5.b0.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt8);
                            break;
                    }
                }
                ce.b.n(parcel, A8);
                return new p5.b(str5, arrayList2, z11, iVar, z12, aVar, z13, d, z14, z15, z16, arrayList3, z17, z18, a0Var, b0Var);
            case 10:
                int A9 = ce.b.A(parcel);
                String str6 = null;
                String str7 = null;
                IBinder iBinder = null;
                q5.f fVar = null;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str6 = ce.b.i(parcel, readInt9);
                            break;
                        case 3:
                            str7 = ce.b.i(parcel, readInt9);
                            break;
                        case 4:
                            iBinder = ce.b.u(parcel, readInt9);
                            break;
                        case 5:
                            fVar = (q5.f) ce.b.h(parcel, readInt9, q5.f.CREATOR);
                            break;
                        case 6:
                            z19 = ce.b.o(parcel, readInt9);
                            break;
                        case 7:
                            z20 = ce.b.o(parcel, readInt9);
                            break;
                        default:
                            ce.b.z(parcel, readInt9);
                            break;
                    }
                }
                ce.b.n(parcel, A9);
                return new q5.a(str6, str7, iBinder, fVar, z19, z20);
            case 11:
                int A10 = ce.b.A(parcel);
                ArrayList arrayList4 = null;
                int[] iArr = null;
                String str8 = null;
                IBinder iBinder2 = null;
                long j11 = 0;
                int i11 = 0;
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
                boolean z21 = false;
                boolean z22 = false;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            arrayList4 = ce.b.k(parcel, readInt10);
                            break;
                        case 3:
                            iArr = ce.b.e(parcel, readInt10);
                            break;
                        case 4:
                            j11 = ce.b.x(parcel, readInt10);
                            break;
                        case 5:
                            str8 = ce.b.i(parcel, readInt10);
                            break;
                        case 6:
                            i11 = ce.b.v(parcel, readInt10);
                            break;
                        case 7:
                            i12 = ce.b.v(parcel, readInt10);
                            break;
                        case '\b':
                            i13 = ce.b.v(parcel, readInt10);
                            break;
                        case '\t':
                            i14 = ce.b.v(parcel, readInt10);
                            break;
                        case '\n':
                            i15 = ce.b.v(parcel, readInt10);
                            break;
                        case 11:
                            i16 = ce.b.v(parcel, readInt10);
                            break;
                        case '\f':
                            i17 = ce.b.v(parcel, readInt10);
                            break;
                        case '\r':
                            i18 = ce.b.v(parcel, readInt10);
                            break;
                        case 14:
                            i19 = ce.b.v(parcel, readInt10);
                            break;
                        case 15:
                            i20 = ce.b.v(parcel, readInt10);
                            break;
                        case 16:
                            i21 = ce.b.v(parcel, readInt10);
                            break;
                        case 17:
                            i22 = ce.b.v(parcel, readInt10);
                            break;
                        case 18:
                            i23 = ce.b.v(parcel, readInt10);
                            break;
                        case 19:
                            i24 = ce.b.v(parcel, readInt10);
                            break;
                        case 20:
                            i25 = ce.b.v(parcel, readInt10);
                            break;
                        case 21:
                            i26 = ce.b.v(parcel, readInt10);
                            break;
                        case 22:
                            i27 = ce.b.v(parcel, readInt10);
                            break;
                        case 23:
                            i28 = ce.b.v(parcel, readInt10);
                            break;
                        case 24:
                            i29 = ce.b.v(parcel, readInt10);
                            break;
                        case 25:
                            i30 = ce.b.v(parcel, readInt10);
                            break;
                        case 26:
                            i31 = ce.b.v(parcel, readInt10);
                            break;
                        case 27:
                            i32 = ce.b.v(parcel, readInt10);
                            break;
                        case 28:
                            i33 = ce.b.v(parcel, readInt10);
                            break;
                        case 29:
                            i34 = ce.b.v(parcel, readInt10);
                            break;
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                            i35 = ce.b.v(parcel, readInt10);
                            break;
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                            i36 = ce.b.v(parcel, readInt10);
                            break;
                        case ' ':
                            i37 = ce.b.v(parcel, readInt10);
                            break;
                        case '!':
                            iBinder2 = ce.b.u(parcel, readInt10);
                            break;
                        case '\"':
                            z21 = ce.b.o(parcel, readInt10);
                            break;
                        case '#':
                            z22 = ce.b.o(parcel, readInt10);
                            break;
                        default:
                            ce.b.z(parcel, readInt10);
                            break;
                    }
                }
                ce.b.n(parcel, A10);
                return new q5.f(arrayList4, iArr, j11, str8, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, iBinder2, z21, z22);
            case 12:
                int A11 = ce.b.A(parcel);
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    char c10 = (char) readInt11;
                    if (c10 == 2) {
                        i38 = ce.b.v(parcel, readInt11);
                    } else if (c10 == 3) {
                        i39 = ce.b.v(parcel, readInt11);
                    } else if (c10 != 4) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        i40 = ce.b.v(parcel, readInt11);
                    }
                }
                ce.b.n(parcel, A11);
                return new q5.b(i38, i39, i40);
            case 13:
                int A12 = ce.b.A(parcel);
                String str9 = null;
                String str10 = null;
                int i41 = 0;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c11 = (char) readInt12;
                    if (c11 == 2) {
                        str9 = ce.b.i(parcel, readInt12);
                    } else if (c11 == 3) {
                        i41 = ce.b.v(parcel, readInt12);
                    } else if (c11 != 4) {
                        ce.b.z(parcel, readInt12);
                    } else {
                        str10 = ce.b.i(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A12);
                return new q5.d(str9, i41, str10);
            case 14:
                int A13 = ce.b.A(parcel);
                byte[] bArr4 = null;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        ce.b.z(parcel, readInt13);
                    } else {
                        bArr4 = ce.b.c(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A13);
                return new q7.d(bArr4);
            case 15:
                int A14 = ce.b.A(parcel);
                byte[] bArr5 = null;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        ce.b.z(parcel, readInt14);
                    } else {
                        bArr5 = ce.b.c(parcel, readInt14);
                    }
                }
                ce.b.n(parcel, A14);
                return new q7.e(bArr5);
            case 16:
                int A15 = ce.b.A(parcel);
                byte[] bArr6 = null;
                while (parcel.dataPosition() < A15) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        ce.b.z(parcel, readInt15);
                    } else {
                        bArr6 = ce.b.c(parcel, readInt15);
                    }
                }
                ce.b.n(parcel, A15);
                return new q7.f(bArr6);
            case 17:
                int A16 = ce.b.A(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < A16) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        ce.b.z(parcel, readInt16);
                    } else {
                        pendingIntent = (PendingIntent) ce.b.h(parcel, readInt16, PendingIntent.CREATOR);
                    }
                }
                ce.b.n(parcel, A16);
                return new q7.g(pendingIntent);
            case 18:
                int A17 = ce.b.A(parcel);
                String[] strArr = null;
                int[] iArr2 = null;
                RemoteViews remoteViews = null;
                byte[] bArr7 = null;
                while (parcel.dataPosition() < A17) {
                    int readInt17 = parcel.readInt();
                    char c12 = (char) readInt17;
                    if (c12 == 1) {
                        strArr = ce.b.j(parcel, readInt17);
                    } else if (c12 == 2) {
                        iArr2 = ce.b.e(parcel, readInt17);
                    } else if (c12 == 3) {
                        remoteViews = (RemoteViews) ce.b.h(parcel, readInt17, RemoteViews.CREATOR);
                    } else if (c12 != 4) {
                        ce.b.z(parcel, readInt17);
                    } else {
                        bArr7 = ce.b.c(parcel, readInt17);
                    }
                }
                ce.b.n(parcel, A17);
                q7.h hVar = new q7.h();
                hVar.a = strArr;
                hVar.b = iArr2;
                hVar.c = remoteViews;
                hVar.d = bArr7;
                return hVar;
            case 19:
                int A18 = ce.b.A(parcel);
                String str11 = null;
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
                boolean z23 = false;
                while (parcel.dataPosition() < A18) {
                    int readInt18 = parcel.readInt();
                    boolean z24 = z23;
                    switch ((char) readInt18) {
                        case 2:
                            str11 = ce.b.i(parcel, readInt18);
                            break;
                        case 3:
                            str12 = ce.b.i(parcel, readInt18);
                            break;
                        case 4:
                            str13 = ce.b.i(parcel, readInt18);
                            break;
                        case 5:
                            str14 = ce.b.i(parcel, readInt18);
                            break;
                        case 6:
                            str15 = ce.b.i(parcel, readInt18);
                            break;
                        case 7:
                            str16 = ce.b.i(parcel, readInt18);
                            break;
                        case '\b':
                            str17 = ce.b.i(parcel, readInt18);
                            break;
                        case '\t':
                            str18 = ce.b.i(parcel, readInt18);
                            break;
                        case '\n':
                            str19 = ce.b.i(parcel, readInt18);
                            break;
                        case 11:
                            str20 = ce.b.i(parcel, readInt18);
                            break;
                        case '\f':
                            str21 = ce.b.i(parcel, readInt18);
                            break;
                        case '\r':
                            str22 = ce.b.i(parcel, readInt18);
                            break;
                        case 14:
                            z23 = ce.b.o(parcel, readInt18);
                            continue;
                        case 15:
                            str24 = ce.b.i(parcel, readInt18);
                            break;
                        case 16:
                            str23 = ce.b.i(parcel, readInt18);
                            break;
                        default:
                            ce.b.z(parcel, readInt18);
                            break;
                    }
                    z23 = z24;
                }
                ce.b.n(parcel, A18);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str11;
                userAddress.b = str12;
                userAddress.c = str13;
                userAddress.d = str14;
                userAddress.e = str15;
                userAddress.f = str16;
                userAddress.h = str17;
                userAddress.n = str18;
                userAddress.r = str19;
                userAddress.s = str20;
                userAddress.v = str21;
                userAddress.w = str22;
                userAddress.x = z23;
                userAddress.y = str24;
                userAddress.A = str23;
                return userAddress;
            case 20:
                int A19 = ce.b.A(parcel);
                int i42 = 0;
                boolean z25 = false;
                boolean z26 = false;
                while (parcel.dataPosition() < A19) {
                    int readInt19 = parcel.readInt();
                    char c13 = (char) readInt19;
                    if (c13 == 2) {
                        i42 = ce.b.v(parcel, readInt19);
                    } else if (c13 == 3) {
                        z25 = ce.b.o(parcel, readInt19);
                    } else if (c13 != 4) {
                        ce.b.z(parcel, readInt19);
                    } else {
                        z26 = ce.b.o(parcel, readInt19);
                    }
                }
                ce.b.n(parcel, A19);
                return new s5.y(i42, z25, z26);
            case 21:
                int A20 = ce.b.A(parcel);
                double d10 = 0.0d;
                o5.d dVar = null;
                o5.x xVar = null;
                boolean z27 = false;
                int i43 = 0;
                int i44 = 0;
                double d11 = 0.0d;
                while (parcel.dataPosition() < A20) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            d10 = ce.b.r(parcel, readInt20);
                            break;
                        case 3:
                            z27 = ce.b.o(parcel, readInt20);
                            break;
                        case 4:
                            i43 = ce.b.v(parcel, readInt20);
                            break;
                        case 5:
                            dVar = (o5.d) ce.b.h(parcel, readInt20, o5.d.CREATOR);
                            break;
                        case 6:
                            i44 = ce.b.v(parcel, readInt20);
                            break;
                        case 7:
                            xVar = (o5.x) ce.b.h(parcel, readInt20, o5.x.CREATOR);
                            break;
                        case '\b':
                            d11 = ce.b.r(parcel, readInt20);
                            break;
                        default:
                            ce.b.z(parcel, readInt20);
                            break;
                    }
                }
                ce.b.n(parcel, A20);
                s5.d dVar2 = new s5.d();
                dVar2.a = d10;
                dVar2.b = z27;
                dVar2.c = i43;
                dVar2.d = dVar;
                dVar2.e = i44;
                dVar2.f = xVar;
                dVar2.h = d11;
                return dVar2;
            case 22:
                int A21 = ce.b.A(parcel);
                String str25 = null;
                while (parcel.dataPosition() < A21) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        ce.b.z(parcel, readInt21);
                    } else {
                        str25 = ce.b.i(parcel, readInt21);
                    }
                }
                ce.b.n(parcel, A21);
                return new s5.c(str25);
            case 23:
                int A22 = ce.b.A(parcel);
                boolean z28 = false;
                while (parcel.dataPosition() < A22) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        ce.b.z(parcel, readInt22);
                    } else {
                        z28 = ce.b.o(parcel, readInt22);
                    }
                }
                ce.b.n(parcel, A22);
                return new s6.a(z28);
            case 24:
                int A23 = ce.b.A(parcel);
                while (parcel.dataPosition() < A23) {
                    ce.b.z(parcel, parcel.readInt());
                }
                ce.b.n(parcel, A23);
                return new s6.b();
            case 25:
                int A24 = ce.b.A(parcel);
                boolean z29 = false;
                while (parcel.dataPosition() < A24) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        ce.b.z(parcel, readInt23);
                    } else {
                        z29 = ce.b.o(parcel, readInt23);
                    }
                }
                ce.b.n(parcel, A24);
                return new s6.c(z29);
            case 26:
                int A25 = ce.b.A(parcel);
                boolean z30 = false;
                while (parcel.dataPosition() < A25) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        ce.b.z(parcel, readInt24);
                    } else {
                        z30 = ce.b.o(parcel, readInt24);
                    }
                }
                ce.b.n(parcel, A25);
                return new s6.d(z30);
            case 27:
                int A26 = ce.b.A(parcel);
                PendingIntent pendingIntent2 = null;
                s6.g gVar = null;
                while (parcel.dataPosition() < A26) {
                    int readInt25 = parcel.readInt();
                    char c14 = (char) readInt25;
                    if (c14 == 1) {
                        pendingIntent2 = (PendingIntent) ce.b.h(parcel, readInt25, PendingIntent.CREATOR);
                    } else if (c14 != 2) {
                        ce.b.z(parcel, readInt25);
                    } else {
                        gVar = (s6.g) ce.b.h(parcel, readInt25, s6.g.CREATOR);
                    }
                }
                ce.b.n(parcel, A26);
                return new s6.e(pendingIntent2, gVar);
            case 28:
                int A27 = ce.b.A(parcel);
                String str26 = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str27 = null;
                String str28 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < A27) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            str26 = ce.b.i(parcel, readInt26);
                            break;
                        case 2:
                            bundle = ce.b.b(parcel, readInt26);
                            break;
                        case 3:
                            bundle2 = ce.b.b(parcel, readInt26);
                            break;
                        case 4:
                            str27 = ce.b.i(parcel, readInt26);
                            break;
                        case 5:
                            str28 = ce.b.i(parcel, readInt26);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) ce.b.h(parcel, readInt26, ResultReceiver.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt26);
                            break;
                    }
                }
                ce.b.n(parcel, A27);
                return new s6.f(str26, bundle, bundle2, str27, str28, resultReceiver);
            default:
                int A28 = ce.b.A(parcel);
                String str29 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < A28) {
                    int readInt27 = parcel.readInt();
                    char c15 = (char) readInt27;
                    if (c15 == 1) {
                        str29 = ce.b.i(parcel, readInt27);
                    } else if (c15 != 2) {
                        ce.b.z(parcel, readInt27);
                    } else {
                        bundle3 = ce.b.b(parcel, readInt27);
                    }
                }
                ce.b.n(parcel, A28);
                return new s6.g(str29, bundle3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new m[i10];
            case 1:
                return new o[i10];
            case 2:
                return new x0[i10];
            case 3:
                return new y0[i10];
            case 4:
                return new z0[i10];
            case 5:
                return new r[i10];
            case 6:
                return new s[i10];
            case 7:
                return new p5.a0[i10];
            case 8:
                return new p5.b0[i10];
            case 9:
                return new p5.b[i10];
            case 10:
                return new q5.a[i10];
            case 11:
                return new q5.f[i10];
            case 12:
                return new q5.b[i10];
            case 13:
                return new q5.d[i10];
            case 14:
                return new q7.d[i10];
            case 15:
                return new q7.e[i10];
            case 16:
                return new q7.f[i10];
            case 17:
                return new q7.g[i10];
            case 18:
                return new q7.h[i10];
            case 19:
                return new UserAddress[i10];
            case 20:
                return new s5.y[i10];
            case 21:
                return new s5.d[i10];
            case 22:
                return new s5.c[i10];
            case 23:
                return new s6.a[i10];
            case 24:
                return new s6.b[i10];
            case 25:
                return new s6.c[i10];
            case 26:
                return new s6.d[i10];
            case 27:
                return new s6.e[i10];
            case 28:
                return new s6.f[i10];
            default:
                return new s6.g[i10];
        }
    }
}
