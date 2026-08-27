package n6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import h7.q8;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                try {
                    return o.a(parcel.readInt());
                } catch (n e9) {
                    throw new RuntimeException(e9);
                }
            case 1:
                int z10 = q8.z(parcel);
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        j10 = q8.w(parcel, readInt);
                    } else if (c10 == 2) {
                        bArr = q8.b(parcel, readInt);
                    } else if (c10 == 3) {
                        bArr2 = q8.b(parcel, readInt);
                    } else if (c10 != 4) {
                        q8.y(parcel, readInt);
                    } else {
                        bArr3 = q8.b(parcel, readInt);
                    }
                }
                q8.m(parcel, z10);
                return new x0(j10, bArr, bArr2, bArr3);
            case 2:
                int z11 = q8.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        q8.y(parcel, readInt2);
                    } else {
                        arrayList = q8.l(parcel, readInt2, x0.CREATOR);
                    }
                }
                q8.m(parcel, z11);
                return new y0(arrayList);
            case 3:
                int z12 = q8.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        q8.y(parcel, readInt3);
                    } else {
                        q8.n(parcel, readInt3);
                    }
                }
                q8.m(parcel, z12);
                return new z0();
            case 4:
                try {
                    return r.a(parcel.readInt());
                } catch (q e10) {
                    throw new IllegalArgumentException(e10);
                }
            case 5:
                int z13 = q8.z(parcel);
                String str = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        q8.y(parcel, readInt4);
                    } else {
                        str = q8.h(parcel, readInt4);
                    }
                }
                q8.m(parcel, z13);
                return new s(str);
            case 6:
                int z14 = q8.z(parcel);
                String str2 = null;
                String str3 = null;
                IBinder iBinder = null;
                o5.f fVar = null;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str2 = q8.h(parcel, readInt5);
                            break;
                        case 3:
                            str3 = q8.h(parcel, readInt5);
                            break;
                        case 4:
                            iBinder = q8.t(parcel, readInt5);
                            break;
                        case 5:
                            fVar = (o5.f) q8.g(parcel, readInt5, o5.f.CREATOR);
                            break;
                        case 6:
                            z15 = q8.n(parcel, readInt5);
                            break;
                        case 7:
                            z16 = q8.n(parcel, readInt5);
                            break;
                        default:
                            q8.y(parcel, readInt5);
                            break;
                    }
                }
                q8.m(parcel, z14);
                return new o5.a(str2, str3, iBinder, fVar, z15, z16);
            case 7:
                int z17 = q8.z(parcel);
                ArrayList arrayList2 = null;
                int[] iArr = null;
                String str4 = null;
                IBinder iBinder2 = null;
                long j11 = 0;
                int i10 = 0;
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
                boolean z18 = false;
                boolean z19 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            arrayList2 = q8.j(parcel, readInt6);
                            break;
                        case 3:
                            iArr = q8.d(parcel, readInt6);
                            break;
                        case 4:
                            j11 = q8.w(parcel, readInt6);
                            break;
                        case 5:
                            str4 = q8.h(parcel, readInt6);
                            break;
                        case 6:
                            i10 = q8.u(parcel, readInt6);
                            break;
                        case 7:
                            i11 = q8.u(parcel, readInt6);
                            break;
                        case '\b':
                            i12 = q8.u(parcel, readInt6);
                            break;
                        case '\t':
                            i13 = q8.u(parcel, readInt6);
                            break;
                        case '\n':
                            i14 = q8.u(parcel, readInt6);
                            break;
                        case 11:
                            i15 = q8.u(parcel, readInt6);
                            break;
                        case '\f':
                            i16 = q8.u(parcel, readInt6);
                            break;
                        case '\r':
                            i17 = q8.u(parcel, readInt6);
                            break;
                        case 14:
                            i18 = q8.u(parcel, readInt6);
                            break;
                        case 15:
                            i19 = q8.u(parcel, readInt6);
                            break;
                        case 16:
                            i20 = q8.u(parcel, readInt6);
                            break;
                        case 17:
                            i21 = q8.u(parcel, readInt6);
                            break;
                        case 18:
                            i22 = q8.u(parcel, readInt6);
                            break;
                        case 19:
                            i23 = q8.u(parcel, readInt6);
                            break;
                        case 20:
                            i24 = q8.u(parcel, readInt6);
                            break;
                        case 21:
                            i25 = q8.u(parcel, readInt6);
                            break;
                        case 22:
                            i26 = q8.u(parcel, readInt6);
                            break;
                        case 23:
                            i27 = q8.u(parcel, readInt6);
                            break;
                        case 24:
                            i28 = q8.u(parcel, readInt6);
                            break;
                        case 25:
                            i29 = q8.u(parcel, readInt6);
                            break;
                        case 26:
                            i30 = q8.u(parcel, readInt6);
                            break;
                        case 27:
                            i31 = q8.u(parcel, readInt6);
                            break;
                        case 28:
                            i32 = q8.u(parcel, readInt6);
                            break;
                        case 29:
                            i33 = q8.u(parcel, readInt6);
                            break;
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                            i34 = q8.u(parcel, readInt6);
                            break;
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                            i35 = q8.u(parcel, readInt6);
                            break;
                        case ' ':
                            i36 = q8.u(parcel, readInt6);
                            break;
                        case '!':
                            iBinder2 = q8.t(parcel, readInt6);
                            break;
                        case '\"':
                            z18 = q8.n(parcel, readInt6);
                            break;
                        case '#':
                            z19 = q8.n(parcel, readInt6);
                            break;
                        default:
                            q8.y(parcel, readInt6);
                            break;
                    }
                }
                q8.m(parcel, z17);
                return new o5.f(arrayList2, iArr, j11, str4, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder2, z18, z19);
            case 8:
                int z20 = q8.z(parcel);
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                while (parcel.dataPosition() < z20) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 == 2) {
                        i37 = q8.u(parcel, readInt7);
                    } else if (c11 == 3) {
                        i38 = q8.u(parcel, readInt7);
                    } else if (c11 != 4) {
                        q8.y(parcel, readInt7);
                    } else {
                        i39 = q8.u(parcel, readInt7);
                    }
                }
                q8.m(parcel, z20);
                return new o5.b(i37, i38, i39);
            case 9:
                int z21 = q8.z(parcel);
                String str5 = null;
                String str6 = null;
                int i40 = 0;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        str5 = q8.h(parcel, readInt8);
                    } else if (c12 == 3) {
                        i40 = q8.u(parcel, readInt8);
                    } else if (c12 != 4) {
                        q8.y(parcel, readInt8);
                    } else {
                        str6 = q8.h(parcel, readInt8);
                    }
                }
                q8.m(parcel, z21);
                return new o5.d(str5, i40, str6);
            case 10:
                int z22 = q8.z(parcel);
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 2) {
                        q8.y(parcel, readInt9);
                    } else {
                        bArr4 = q8.b(parcel, readInt9);
                    }
                }
                q8.m(parcel, z22);
                return new p7.d(bArr4);
            case 11:
                int z23 = q8.z(parcel);
                byte[] bArr5 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        q8.y(parcel, readInt10);
                    } else {
                        bArr5 = q8.b(parcel, readInt10);
                    }
                }
                q8.m(parcel, z23);
                return new p7.e(bArr5);
            case 12:
                int z24 = q8.z(parcel);
                byte[] bArr6 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        q8.y(parcel, readInt11);
                    } else {
                        bArr6 = q8.b(parcel, readInt11);
                    }
                }
                q8.m(parcel, z24);
                return new p7.f(bArr6);
            case 13:
                int z25 = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        q8.y(parcel, readInt12);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, readInt12, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, z25);
                return new p7.g(pendingIntent);
            case 14:
                int z26 = q8.z(parcel);
                String[] strArr = null;
                int[] iArr2 = null;
                RemoteViews remoteViews = null;
                byte[] bArr7 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 == 1) {
                        strArr = q8.i(parcel, readInt13);
                    } else if (c13 == 2) {
                        iArr2 = q8.d(parcel, readInt13);
                    } else if (c13 == 3) {
                        remoteViews = (RemoteViews) q8.g(parcel, readInt13, RemoteViews.CREATOR);
                    } else if (c13 != 4) {
                        q8.y(parcel, readInt13);
                    } else {
                        bArr7 = q8.b(parcel, readInt13);
                    }
                }
                q8.m(parcel, z26);
                p7.h hVar = new p7.h();
                hVar.a = strArr;
                hVar.b = iArr2;
                hVar.c = remoteViews;
                hVar.d = bArr7;
                return hVar;
            case 15:
                int z27 = q8.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
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
                boolean z28 = false;
                while (parcel.dataPosition() < z27) {
                    int readInt14 = parcel.readInt();
                    boolean z29 = z28;
                    switch ((char) readInt14) {
                        case 2:
                            str7 = q8.h(parcel, readInt14);
                            break;
                        case 3:
                            str8 = q8.h(parcel, readInt14);
                            break;
                        case 4:
                            str9 = q8.h(parcel, readInt14);
                            break;
                        case 5:
                            str10 = q8.h(parcel, readInt14);
                            break;
                        case 6:
                            str11 = q8.h(parcel, readInt14);
                            break;
                        case 7:
                            str12 = q8.h(parcel, readInt14);
                            break;
                        case '\b':
                            str13 = q8.h(parcel, readInt14);
                            break;
                        case '\t':
                            str14 = q8.h(parcel, readInt14);
                            break;
                        case '\n':
                            str15 = q8.h(parcel, readInt14);
                            break;
                        case 11:
                            str16 = q8.h(parcel, readInt14);
                            break;
                        case '\f':
                            str17 = q8.h(parcel, readInt14);
                            break;
                        case '\r':
                            str18 = q8.h(parcel, readInt14);
                            break;
                        case 14:
                            z28 = q8.n(parcel, readInt14);
                            continue;
                        case 15:
                            str20 = q8.h(parcel, readInt14);
                            break;
                        case 16:
                            str19 = q8.h(parcel, readInt14);
                            break;
                        default:
                            q8.y(parcel, readInt14);
                            break;
                    }
                    z28 = z29;
                }
                q8.m(parcel, z27);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str7;
                userAddress.b = str8;
                userAddress.c = str9;
                userAddress.d = str10;
                userAddress.e = str11;
                userAddress.f = str12;
                userAddress.h = str13;
                userAddress.n = str14;
                userAddress.r = str15;
                userAddress.s = str16;
                userAddress.v = str17;
                userAddress.w = str18;
                userAddress.x = z28;
                userAddress.y = str20;
                userAddress.A = str19;
                return userAddress;
            case 16:
                int z30 = q8.z(parcel);
                int i41 = 0;
                boolean z31 = false;
                boolean z32 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt15 = parcel.readInt();
                    char c14 = (char) readInt15;
                    if (c14 == 2) {
                        i41 = q8.u(parcel, readInt15);
                    } else if (c14 == 3) {
                        z31 = q8.n(parcel, readInt15);
                    } else if (c14 != 4) {
                        q8.y(parcel, readInt15);
                    } else {
                        z32 = q8.n(parcel, readInt15);
                    }
                }
                q8.m(parcel, z30);
                return new r5.y(i41, z31, z32);
            case 17:
                int z33 = q8.z(parcel);
                double d = 0.0d;
                m5.d dVar = null;
                m5.y yVar = null;
                boolean z34 = false;
                int i42 = 0;
                int i43 = 0;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z33) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            d = q8.q(parcel, readInt16);
                            break;
                        case 3:
                            z34 = q8.n(parcel, readInt16);
                            break;
                        case 4:
                            i42 = q8.u(parcel, readInt16);
                            break;
                        case 5:
                            dVar = (m5.d) q8.g(parcel, readInt16, m5.d.CREATOR);
                            break;
                        case 6:
                            i43 = q8.u(parcel, readInt16);
                            break;
                        case 7:
                            yVar = (m5.y) q8.g(parcel, readInt16, m5.y.CREATOR);
                            break;
                        case '\b':
                            d10 = q8.q(parcel, readInt16);
                            break;
                        default:
                            q8.y(parcel, readInt16);
                            break;
                    }
                }
                q8.m(parcel, z33);
                r5.d dVar2 = new r5.d();
                dVar2.a = d;
                dVar2.b = z34;
                dVar2.c = i42;
                dVar2.d = dVar;
                dVar2.e = i43;
                dVar2.f = yVar;
                dVar2.h = d10;
                return dVar2;
            case 18:
                int z35 = q8.z(parcel);
                String str21 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 2) {
                        q8.y(parcel, readInt17);
                    } else {
                        str21 = q8.h(parcel, readInt17);
                    }
                }
                q8.m(parcel, z35);
                return new r5.c(str21);
            case 19:
                int z36 = q8.z(parcel);
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        q8.y(parcel, readInt18);
                    } else {
                        z37 = q8.n(parcel, readInt18);
                    }
                }
                q8.m(parcel, z36);
                return new r6.a(z37);
            case 20:
                int z38 = q8.z(parcel);
                while (parcel.dataPosition() < z38) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, z38);
                return new r6.b();
            case 21:
                int z39 = q8.z(parcel);
                boolean z40 = false;
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        q8.y(parcel, readInt19);
                    } else {
                        z40 = q8.n(parcel, readInt19);
                    }
                }
                q8.m(parcel, z39);
                return new r6.c(z40);
            case 22:
                int z41 = q8.z(parcel);
                boolean z42 = false;
                while (parcel.dataPosition() < z41) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        q8.y(parcel, readInt20);
                    } else {
                        z42 = q8.n(parcel, readInt20);
                    }
                }
                q8.m(parcel, z41);
                return new r6.d(z42);
            case 23:
                int z43 = q8.z(parcel);
                PendingIntent pendingIntent2 = null;
                r6.g gVar = null;
                while (parcel.dataPosition() < z43) {
                    int readInt21 = parcel.readInt();
                    char c15 = (char) readInt21;
                    if (c15 == 1) {
                        pendingIntent2 = (PendingIntent) q8.g(parcel, readInt21, PendingIntent.CREATOR);
                    } else if (c15 != 2) {
                        q8.y(parcel, readInt21);
                    } else {
                        gVar = (r6.g) q8.g(parcel, readInt21, r6.g.CREATOR);
                    }
                }
                q8.m(parcel, z43);
                return new r6.e(pendingIntent2, gVar);
            case 24:
                int z44 = q8.z(parcel);
                String str22 = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str23 = null;
                String str24 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z44) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            str22 = q8.h(parcel, readInt22);
                            break;
                        case 2:
                            bundle = q8.a(parcel, readInt22);
                            break;
                        case 3:
                            bundle2 = q8.a(parcel, readInt22);
                            break;
                        case 4:
                            str23 = q8.h(parcel, readInt22);
                            break;
                        case 5:
                            str24 = q8.h(parcel, readInt22);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) q8.g(parcel, readInt22, ResultReceiver.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt22);
                            break;
                    }
                }
                q8.m(parcel, z44);
                return new r6.f(str22, bundle, bundle2, str23, str24, resultReceiver);
            case 25:
                int z45 = q8.z(parcel);
                String str25 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt23 = parcel.readInt();
                    char c16 = (char) readInt23;
                    if (c16 == 1) {
                        str25 = q8.h(parcel, readInt23);
                    } else if (c16 != 2) {
                        q8.y(parcel, readInt23);
                    } else {
                        bundle3 = q8.a(parcel, readInt23);
                    }
                }
                q8.m(parcel, z45);
                return new r6.g(str25, bundle3);
            case 26:
                int z46 = q8.z(parcel);
                String str26 = "";
                String str27 = str26;
                String str28 = str27;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str29 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            str26 = q8.h(parcel, readInt24);
                            break;
                        case 2:
                            bundle4 = q8.a(parcel, readInt24);
                            break;
                        case 3:
                            bundle5 = q8.a(parcel, readInt24);
                            break;
                        case 4:
                            str29 = q8.h(parcel, readInt24);
                            break;
                        case 5:
                            str27 = q8.h(parcel, readInt24);
                            break;
                        case 6:
                            str28 = q8.h(parcel, readInt24);
                            break;
                        default:
                            q8.y(parcel, readInt24);
                            break;
                    }
                }
                q8.m(parcel, z46);
                return new r6.h(str26, bundle4, bundle5, str29, str27, str28);
            case 27:
                int z47 = q8.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        q8.y(parcel, readInt25);
                    } else {
                        bundle6 = q8.a(parcel, readInt25);
                    }
                }
                q8.m(parcel, z47);
                return new r6.i(bundle6);
            case 28:
                int z48 = q8.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt26 = parcel.readInt();
                    if (((char) readInt26) != 1) {
                        q8.y(parcel, readInt26);
                    } else {
                        bundle7 = q8.a(parcel, readInt26);
                    }
                }
                q8.m(parcel, z48);
                return new r6.j(bundle7);
            default:
                int z49 = q8.z(parcel);
                ArrayList arrayList3 = null;
                Bundle bundle8 = null;
                String str30 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt27 = parcel.readInt();
                    char c17 = (char) readInt27;
                    if (c17 == 1) {
                        arrayList3 = q8.l(parcel, readInt27, r6.h.CREATOR);
                    } else if (c17 == 2) {
                        bundle8 = q8.a(parcel, readInt27);
                    } else if (c17 == 3) {
                        str30 = q8.h(parcel, readInt27);
                    } else if (c17 != 4) {
                        q8.y(parcel, readInt27);
                    } else {
                        resultReceiver2 = (ResultReceiver) q8.g(parcel, readInt27, ResultReceiver.CREATOR);
                    }
                }
                q8.m(parcel, z49);
                return new GetCredentialRequest(arrayList3, bundle8, str30, resultReceiver2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new o[i10];
            case 1:
                return new x0[i10];
            case 2:
                return new y0[i10];
            case 3:
                return new z0[i10];
            case 4:
                return new r[i10];
            case 5:
                return new s[i10];
            case 6:
                return new o5.a[i10];
            case 7:
                return new o5.f[i10];
            case 8:
                return new o5.b[i10];
            case 9:
                return new o5.d[i10];
            case 10:
                return new p7.d[i10];
            case 11:
                return new p7.e[i10];
            case 12:
                return new p7.f[i10];
            case 13:
                return new p7.g[i10];
            case 14:
                return new p7.h[i10];
            case 15:
                return new UserAddress[i10];
            case 16:
                return new r5.y[i10];
            case 17:
                return new r5.d[i10];
            case 18:
                return new r5.c[i10];
            case 19:
                return new r6.a[i10];
            case 20:
                return new r6.b[i10];
            case 21:
                return new r6.c[i10];
            case 22:
                return new r6.d[i10];
            case 23:
                return new r6.e[i10];
            case 24:
                return new r6.f[i10];
            case 25:
                return new r6.g[i10];
            case 26:
                return new r6.h[i10];
            case 27:
                return new r6.i[i10];
            case 28:
                return new r6.j[i10];
            default:
                return new GetCredentialRequest[i10];
        }
    }
}
