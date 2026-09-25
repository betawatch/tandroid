package e6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import g6.x;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import w7.e0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = e0.z(parcel);
                ArrayList arrayList = null;
                int[] iArr = null;
                String str = null;
                IBinder iBinder = null;
                long j3 = 0;
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
                boolean z11 = false;
                boolean z12 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            arrayList = e0.j(parcel, readInt);
                            break;
                        case 3:
                            iArr = e0.d(parcel, readInt);
                            break;
                        case 4:
                            j3 = e0.w(parcel, readInt);
                            break;
                        case 5:
                            str = e0.h(parcel, readInt);
                            break;
                        case 6:
                            i10 = e0.u(parcel, readInt);
                            break;
                        case 7:
                            i11 = e0.u(parcel, readInt);
                            break;
                        case '\b':
                            i12 = e0.u(parcel, readInt);
                            break;
                        case '\t':
                            i13 = e0.u(parcel, readInt);
                            break;
                        case '\n':
                            i14 = e0.u(parcel, readInt);
                            break;
                        case 11:
                            i15 = e0.u(parcel, readInt);
                            break;
                        case '\f':
                            i16 = e0.u(parcel, readInt);
                            break;
                        case '\r':
                            i17 = e0.u(parcel, readInt);
                            break;
                        case 14:
                            i18 = e0.u(parcel, readInt);
                            break;
                        case 15:
                            i19 = e0.u(parcel, readInt);
                            break;
                        case 16:
                            i20 = e0.u(parcel, readInt);
                            break;
                        case 17:
                            i21 = e0.u(parcel, readInt);
                            break;
                        case 18:
                            i22 = e0.u(parcel, readInt);
                            break;
                        case 19:
                            i23 = e0.u(parcel, readInt);
                            break;
                        case 20:
                            i24 = e0.u(parcel, readInt);
                            break;
                        case 21:
                            i25 = e0.u(parcel, readInt);
                            break;
                        case 22:
                            i26 = e0.u(parcel, readInt);
                            break;
                        case 23:
                            i27 = e0.u(parcel, readInt);
                            break;
                        case 24:
                            i28 = e0.u(parcel, readInt);
                            break;
                        case 25:
                            i29 = e0.u(parcel, readInt);
                            break;
                        case 26:
                            i30 = e0.u(parcel, readInt);
                            break;
                        case 27:
                            i31 = e0.u(parcel, readInt);
                            break;
                        case 28:
                            i32 = e0.u(parcel, readInt);
                            break;
                        case 29:
                            i33 = e0.u(parcel, readInt);
                            break;
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                            i34 = e0.u(parcel, readInt);
                            break;
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                            i35 = e0.u(parcel, readInt);
                            break;
                        case ' ':
                            i36 = e0.u(parcel, readInt);
                            break;
                        case '!':
                            iBinder = e0.t(parcel, readInt);
                            break;
                        case '\"':
                            z11 = e0.n(parcel, readInt);
                            break;
                        case '#':
                            z12 = e0.n(parcel, readInt);
                            break;
                        default:
                            e0.y(parcel, readInt);
                            break;
                    }
                }
                e0.m(parcel, z10);
                return new f(arrayList, iArr, j3, str, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder, z11, z12);
            case 1:
                int z13 = e0.z(parcel);
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        i37 = e0.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i38 = e0.u(parcel, readInt2);
                    } else if (c10 != 4) {
                        e0.y(parcel, readInt2);
                    } else {
                        i39 = e0.u(parcel, readInt2);
                    }
                }
                e0.m(parcel, z13);
                return new b(i37, i38, i39);
            case 2:
                int z14 = e0.z(parcel);
                String str2 = null;
                String str3 = null;
                int i40 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str2 = e0.h(parcel, readInt3);
                    } else if (c11 == 3) {
                        i40 = e0.u(parcel, readInt3);
                    } else if (c11 != 4) {
                        e0.y(parcel, readInt3);
                    } else {
                        str3 = e0.h(parcel, readInt3);
                    }
                }
                e0.m(parcel, z14);
                return new d(str2, i40, str3);
            case 3:
                int z15 = e0.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        e0.y(parcel, readInt4);
                    } else {
                        bArr = e0.b(parcel, readInt4);
                    }
                }
                e0.m(parcel, z15);
                return new e8.d(bArr);
            case 4:
                int z16 = e0.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        e0.y(parcel, readInt5);
                    } else {
                        bArr2 = e0.b(parcel, readInt5);
                    }
                }
                e0.m(parcel, z16);
                return new e8.e(bArr2);
            case 5:
                int z17 = e0.z(parcel);
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        e0.y(parcel, readInt6);
                    } else {
                        bArr3 = e0.b(parcel, readInt6);
                    }
                }
                e0.m(parcel, z17);
                return new e8.f(bArr3);
            case 6:
                int z18 = e0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        e0.y(parcel, readInt7);
                    } else {
                        pendingIntent = (PendingIntent) e0.g(parcel, readInt7, PendingIntent.CREATOR);
                    }
                }
                e0.m(parcel, z18);
                return new e8.g(pendingIntent);
            case 7:
                int z19 = e0.z(parcel);
                String[] strArr = null;
                int[] iArr2 = null;
                RemoteViews remoteViews = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 1) {
                        strArr = e0.i(parcel, readInt8);
                    } else if (c12 == 2) {
                        iArr2 = e0.d(parcel, readInt8);
                    } else if (c12 == 3) {
                        remoteViews = (RemoteViews) e0.g(parcel, readInt8, RemoteViews.CREATOR);
                    } else if (c12 != 4) {
                        e0.y(parcel, readInt8);
                    } else {
                        bArr4 = e0.b(parcel, readInt8);
                    }
                }
                e0.m(parcel, z19);
                e8.h hVar = new e8.h();
                hVar.a = strArr;
                hVar.b = iArr2;
                hVar.c = remoteViews;
                hVar.d = bArr4;
                return hVar;
            case 8:
                int z20 = e0.z(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
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
                boolean z21 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt9 = parcel.readInt();
                    boolean z22 = z21;
                    switch ((char) readInt9) {
                        case 2:
                            str4 = e0.h(parcel, readInt9);
                            break;
                        case 3:
                            str5 = e0.h(parcel, readInt9);
                            break;
                        case 4:
                            str6 = e0.h(parcel, readInt9);
                            break;
                        case 5:
                            str7 = e0.h(parcel, readInt9);
                            break;
                        case 6:
                            str8 = e0.h(parcel, readInt9);
                            break;
                        case 7:
                            str9 = e0.h(parcel, readInt9);
                            break;
                        case '\b':
                            str10 = e0.h(parcel, readInt9);
                            break;
                        case '\t':
                            str11 = e0.h(parcel, readInt9);
                            break;
                        case '\n':
                            str12 = e0.h(parcel, readInt9);
                            break;
                        case 11:
                            str13 = e0.h(parcel, readInt9);
                            break;
                        case '\f':
                            str14 = e0.h(parcel, readInt9);
                            break;
                        case '\r':
                            str15 = e0.h(parcel, readInt9);
                            break;
                        case 14:
                            z21 = e0.n(parcel, readInt9);
                            continue;
                        case 15:
                            str17 = e0.h(parcel, readInt9);
                            break;
                        case 16:
                            str16 = e0.h(parcel, readInt9);
                            break;
                        default:
                            e0.y(parcel, readInt9);
                            break;
                    }
                    z21 = z22;
                }
                boolean z23 = z21;
                e0.m(parcel, z20);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str4;
                userAddress.b = str5;
                userAddress.c = str6;
                userAddress.d = str7;
                userAddress.e = str8;
                userAddress.f = str9;
                userAddress.h = str10;
                userAddress.n = str11;
                userAddress.r = str12;
                userAddress.s = str13;
                userAddress.v = str14;
                userAddress.w = str15;
                userAddress.x = z23;
                userAddress.y = str17;
                userAddress.E = str16;
                return userAddress;
            case 9:
                int z24 = e0.z(parcel);
                int i41 = 0;
                boolean z25 = false;
                boolean z26 = false;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 2) {
                        i41 = e0.u(parcel, readInt10);
                    } else if (c13 == 3) {
                        z25 = e0.n(parcel, readInt10);
                    } else if (c13 != 4) {
                        e0.y(parcel, readInt10);
                    } else {
                        z26 = e0.n(parcel, readInt10);
                    }
                }
                e0.m(parcel, z24);
                return new x(i41, z25, z26);
            case 10:
                int z27 = e0.z(parcel);
                double d = 0.0d;
                c6.d dVar = null;
                c6.x xVar = null;
                boolean z28 = false;
                int i42 = 0;
                int i43 = 0;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z27) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            d = e0.q(parcel, readInt11);
                            break;
                        case 3:
                            z28 = e0.n(parcel, readInt11);
                            break;
                        case 4:
                            i42 = e0.u(parcel, readInt11);
                            break;
                        case 5:
                            dVar = (c6.d) e0.g(parcel, readInt11, c6.d.CREATOR);
                            break;
                        case 6:
                            i43 = e0.u(parcel, readInt11);
                            break;
                        case 7:
                            xVar = (c6.x) e0.g(parcel, readInt11, c6.x.CREATOR);
                            break;
                        case '\b':
                            d10 = e0.q(parcel, readInt11);
                            break;
                        default:
                            e0.y(parcel, readInt11);
                            break;
                    }
                }
                e0.m(parcel, z27);
                g6.d dVar2 = new g6.d();
                dVar2.a = d;
                dVar2.b = z28;
                dVar2.c = i42;
                dVar2.d = dVar;
                dVar2.e = i43;
                dVar2.f = xVar;
                dVar2.h = d10;
                return dVar2;
            case 11:
                int z29 = e0.z(parcel);
                String str18 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        e0.y(parcel, readInt12);
                    } else {
                        str18 = e0.h(parcel, readInt12);
                    }
                }
                e0.m(parcel, z29);
                return new g6.c(str18);
            case 12:
                int z30 = e0.z(parcel);
                boolean z31 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        e0.y(parcel, readInt13);
                    } else {
                        z31 = e0.n(parcel, readInt13);
                    }
                }
                e0.m(parcel, z30);
                return new g7.a(z31);
            case 13:
                int z32 = e0.z(parcel);
                while (parcel.dataPosition() < z32) {
                    e0.y(parcel, parcel.readInt());
                }
                e0.m(parcel, z32);
                return new g7.b();
            case 14:
                int z33 = e0.z(parcel);
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        e0.y(parcel, readInt14);
                    } else {
                        z34 = e0.n(parcel, readInt14);
                    }
                }
                e0.m(parcel, z33);
                return new g7.c(z34);
            case 15:
                int z35 = e0.z(parcel);
                boolean z36 = false;
                while (parcel.dataPosition() < z35) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        e0.y(parcel, readInt15);
                    } else {
                        z36 = e0.n(parcel, readInt15);
                    }
                }
                e0.m(parcel, z35);
                return new g7.d(z36);
            case 16:
                int z37 = e0.z(parcel);
                PendingIntent pendingIntent2 = null;
                g7.g gVar = null;
                while (parcel.dataPosition() < z37) {
                    int readInt16 = parcel.readInt();
                    char c14 = (char) readInt16;
                    if (c14 == 1) {
                        pendingIntent2 = (PendingIntent) e0.g(parcel, readInt16, PendingIntent.CREATOR);
                    } else if (c14 != 2) {
                        e0.y(parcel, readInt16);
                    } else {
                        gVar = (g7.g) e0.g(parcel, readInt16, g7.g.CREATOR);
                    }
                }
                e0.m(parcel, z37);
                return new g7.e(pendingIntent2, gVar);
            case 17:
                int z38 = e0.z(parcel);
                String str19 = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str20 = null;
                String str21 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z38) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            str19 = e0.h(parcel, readInt17);
                            break;
                        case 2:
                            bundle = e0.a(parcel, readInt17);
                            break;
                        case 3:
                            bundle2 = e0.a(parcel, readInt17);
                            break;
                        case 4:
                            str20 = e0.h(parcel, readInt17);
                            break;
                        case 5:
                            str21 = e0.h(parcel, readInt17);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) e0.g(parcel, readInt17, ResultReceiver.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt17);
                            break;
                    }
                }
                e0.m(parcel, z38);
                return new g7.f(str19, bundle, bundle2, str20, str21, resultReceiver);
            case 18:
                int z39 = e0.z(parcel);
                String str22 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt18 = parcel.readInt();
                    char c15 = (char) readInt18;
                    if (c15 == 1) {
                        str22 = e0.h(parcel, readInt18);
                    } else if (c15 != 2) {
                        e0.y(parcel, readInt18);
                    } else {
                        bundle3 = e0.a(parcel, readInt18);
                    }
                }
                e0.m(parcel, z39);
                return new g7.g(str22, bundle3);
            case 19:
                int z40 = e0.z(parcel);
                String str23 = "";
                String str24 = str23;
                String str25 = str24;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str26 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str23 = e0.h(parcel, readInt19);
                            break;
                        case 2:
                            bundle4 = e0.a(parcel, readInt19);
                            break;
                        case 3:
                            bundle5 = e0.a(parcel, readInt19);
                            break;
                        case 4:
                            str26 = e0.h(parcel, readInt19);
                            break;
                        case 5:
                            str24 = e0.h(parcel, readInt19);
                            break;
                        case 6:
                            str25 = e0.h(parcel, readInt19);
                            break;
                        default:
                            e0.y(parcel, readInt19);
                            break;
                    }
                }
                e0.m(parcel, z40);
                return new g7.h(str23, bundle4, bundle5, str26, str24, str25);
            case 20:
                int z41 = e0.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        e0.y(parcel, readInt20);
                    } else {
                        bundle6 = e0.a(parcel, readInt20);
                    }
                }
                e0.m(parcel, z41);
                return new g7.i(bundle6);
            case 21:
                int z42 = e0.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        e0.y(parcel, readInt21);
                    } else {
                        bundle7 = e0.a(parcel, readInt21);
                    }
                }
                e0.m(parcel, z42);
                return new g7.j(bundle7);
            case 22:
                int z43 = e0.z(parcel);
                ArrayList arrayList2 = null;
                Bundle bundle8 = null;
                String str27 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt22 = parcel.readInt();
                    char c16 = (char) readInt22;
                    if (c16 == 1) {
                        arrayList2 = e0.l(parcel, readInt22, g7.h.CREATOR);
                    } else if (c16 == 2) {
                        bundle8 = e0.a(parcel, readInt22);
                    } else if (c16 == 3) {
                        str27 = e0.h(parcel, readInt22);
                    } else if (c16 != 4) {
                        e0.y(parcel, readInt22);
                    } else {
                        resultReceiver2 = (ResultReceiver) e0.g(parcel, readInt22, ResultReceiver.CREATOR);
                    }
                }
                e0.m(parcel, z43);
                return new GetCredentialRequest(arrayList2, bundle8, str27, resultReceiver2);
            case 23:
                int z44 = e0.z(parcel);
                Bundle bundle9 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        e0.y(parcel, readInt23);
                    } else {
                        bundle9 = e0.a(parcel, readInt23);
                    }
                }
                e0.m(parcel, z44);
                return new g7.k(bundle9);
            case 24:
                int z45 = e0.z(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        e0.y(parcel, readInt24);
                    } else {
                        pendingIntent3 = (PendingIntent) e0.g(parcel, readInt24, PendingIntent.CREATOR);
                    }
                }
                e0.m(parcel, z45);
                return new g7.l(pendingIntent3);
            case 25:
                int z46 = e0.z(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        e0.y(parcel, readInt25);
                    } else {
                        pendingIntent4 = (PendingIntent) e0.g(parcel, readInt25, PendingIntent.CREATOR);
                    }
                }
                e0.m(parcel, z46);
                return new g7.m(pendingIntent4);
            case 26:
                int z47 = e0.z(parcel);
                while (parcel.dataPosition() < z47) {
                    e0.y(parcel, parcel.readInt());
                }
                e0.m(parcel, z47);
                return new g7.n();
            case 27:
                int z48 = e0.z(parcel);
                while (parcel.dataPosition() < z48) {
                    e0.y(parcel, parcel.readInt());
                }
                e0.m(parcel, z48);
                return new g7.o();
            case 28:
                int z49 = e0.z(parcel);
                while (parcel.dataPosition() < z49) {
                    e0.y(parcel, parcel.readInt());
                }
                e0.m(parcel, z49);
                return new g7.p();
            default:
                int z50 = e0.z(parcel);
                while (parcel.dataPosition() < z50) {
                    e0.y(parcel, parcel.readInt());
                }
                e0.m(parcel, z50);
                return new g7.q();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new f[i10];
            case 1:
                return new b[i10];
            case 2:
                return new d[i10];
            case 3:
                return new e8.d[i10];
            case 4:
                return new e8.e[i10];
            case 5:
                return new e8.f[i10];
            case 6:
                return new e8.g[i10];
            case 7:
                return new e8.h[i10];
            case 8:
                return new UserAddress[i10];
            case 9:
                return new x[i10];
            case 10:
                return new g6.d[i10];
            case 11:
                return new g6.c[i10];
            case 12:
                return new g7.a[i10];
            case 13:
                return new g7.b[i10];
            case 14:
                return new g7.c[i10];
            case 15:
                return new g7.d[i10];
            case 16:
                return new g7.e[i10];
            case 17:
                return new g7.f[i10];
            case 18:
                return new g7.g[i10];
            case 19:
                return new g7.h[i10];
            case 20:
                return new g7.i[i10];
            case 21:
                return new g7.j[i10];
            case 22:
                return new GetCredentialRequest[i10];
            case 23:
                return new g7.k[i10];
            case 24:
                return new g7.l[i10];
            case 25:
                return new g7.m[i10];
            case 26:
                return new g7.n[i10];
            case 27:
                return new g7.o[i10];
            case 28:
                return new g7.p[i10];
            default:
                return new g7.q[i10];
        }
    }
}
