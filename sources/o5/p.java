package o5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import g7.o8;
import java.util.ArrayList;
import m5.x;
import q5.y;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i9 = o8.u(parcel, readInt);
                    } else if (c10 == 3) {
                        i10 = o8.u(parcel, readInt);
                    } else if (c10 != 4) {
                        o8.y(parcel, readInt);
                    } else {
                        i11 = o8.u(parcel, readInt);
                    }
                }
                o8.m(parcel, z10);
                return new b(i9, i10, i11);
            case 1:
                int z11 = o8.z(parcel);
                String str = null;
                String str2 = null;
                int i12 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        str = o8.h(parcel, readInt2);
                    } else if (c11 == 3) {
                        i12 = o8.u(parcel, readInt2);
                    } else if (c11 != 4) {
                        o8.y(parcel, readInt2);
                    } else {
                        str2 = o8.h(parcel, readInt2);
                    }
                }
                o8.m(parcel, z11);
                return new d(str, i12, str2);
            case 2:
                int z12 = o8.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        o8.y(parcel, readInt3);
                    } else {
                        bArr = o8.b(parcel, readInt3);
                    }
                }
                o8.m(parcel, z12);
                return new o7.d(bArr);
            case 3:
                int z13 = o8.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        o8.y(parcel, readInt4);
                    } else {
                        bArr2 = o8.b(parcel, readInt4);
                    }
                }
                o8.m(parcel, z13);
                return new o7.e(bArr2);
            case 4:
                int z14 = o8.z(parcel);
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        o8.y(parcel, readInt5);
                    } else {
                        bArr3 = o8.b(parcel, readInt5);
                    }
                }
                o8.m(parcel, z14);
                return new o7.f(bArr3);
            case 5:
                int z15 = o8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        o8.y(parcel, readInt6);
                    } else {
                        pendingIntent = (PendingIntent) o8.g(parcel, readInt6, PendingIntent.CREATOR);
                    }
                }
                o8.m(parcel, z15);
                return new o7.g(pendingIntent);
            case 6:
                int z16 = o8.z(parcel);
                String[] strArr = null;
                int[] iArr = null;
                RemoteViews remoteViews = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        strArr = o8.i(parcel, readInt7);
                    } else if (c12 == 2) {
                        iArr = o8.d(parcel, readInt7);
                    } else if (c12 == 3) {
                        remoteViews = (RemoteViews) o8.g(parcel, readInt7, RemoteViews.CREATOR);
                    } else if (c12 != 4) {
                        o8.y(parcel, readInt7);
                    } else {
                        bArr4 = o8.b(parcel, readInt7);
                    }
                }
                o8.m(parcel, z16);
                o7.h hVar = new o7.h();
                hVar.a = strArr;
                hVar.b = iArr;
                hVar.c = remoteViews;
                hVar.d = bArr4;
                return hVar;
            case 7:
                int z17 = o8.z(parcel);
                String str3 = null;
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
                boolean z18 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    boolean z19 = z18;
                    switch ((char) readInt8) {
                        case 2:
                            str3 = o8.h(parcel, readInt8);
                            break;
                        case 3:
                            str4 = o8.h(parcel, readInt8);
                            break;
                        case 4:
                            str5 = o8.h(parcel, readInt8);
                            break;
                        case 5:
                            str6 = o8.h(parcel, readInt8);
                            break;
                        case 6:
                            str7 = o8.h(parcel, readInt8);
                            break;
                        case 7:
                            str8 = o8.h(parcel, readInt8);
                            break;
                        case '\b':
                            str9 = o8.h(parcel, readInt8);
                            break;
                        case '\t':
                            str10 = o8.h(parcel, readInt8);
                            break;
                        case '\n':
                            str11 = o8.h(parcel, readInt8);
                            break;
                        case 11:
                            str12 = o8.h(parcel, readInt8);
                            break;
                        case '\f':
                            str13 = o8.h(parcel, readInt8);
                            break;
                        case '\r':
                            str14 = o8.h(parcel, readInt8);
                            break;
                        case 14:
                            z18 = o8.n(parcel, readInt8);
                            continue;
                        case 15:
                            str16 = o8.h(parcel, readInt8);
                            break;
                        case 16:
                            str15 = o8.h(parcel, readInt8);
                            break;
                        default:
                            o8.y(parcel, readInt8);
                            break;
                    }
                    z18 = z19;
                }
                boolean z20 = z18;
                o8.m(parcel, z17);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str3;
                userAddress.b = str4;
                userAddress.c = str5;
                userAddress.d = str6;
                userAddress.e = str7;
                userAddress.f = str8;
                userAddress.h = str9;
                userAddress.n = str10;
                userAddress.r = str11;
                userAddress.s = str12;
                userAddress.v = str13;
                userAddress.w = str14;
                userAddress.x = z20;
                userAddress.y = str16;
                userAddress.A = str15;
                return userAddress;
            case 8:
                int z21 = o8.z(parcel);
                int i13 = 0;
                boolean z22 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        i13 = o8.u(parcel, readInt9);
                    } else if (c13 == 3) {
                        z22 = o8.n(parcel, readInt9);
                    } else if (c13 != 4) {
                        o8.y(parcel, readInt9);
                    } else {
                        z23 = o8.n(parcel, readInt9);
                    }
                }
                o8.m(parcel, z21);
                return new y(i13, z22, z23);
            case 9:
                int z24 = o8.z(parcel);
                double d = 0.0d;
                m5.d dVar = null;
                x xVar = null;
                boolean z25 = false;
                int i14 = 0;
                int i15 = 0;
                double d9 = 0.0d;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            d = o8.q(parcel, readInt10);
                            break;
                        case 3:
                            z25 = o8.n(parcel, readInt10);
                            break;
                        case 4:
                            i14 = o8.u(parcel, readInt10);
                            break;
                        case 5:
                            dVar = (m5.d) o8.g(parcel, readInt10, m5.d.CREATOR);
                            break;
                        case 6:
                            i15 = o8.u(parcel, readInt10);
                            break;
                        case 7:
                            xVar = (x) o8.g(parcel, readInt10, x.CREATOR);
                            break;
                        case '\b':
                            d9 = o8.q(parcel, readInt10);
                            break;
                        default:
                            o8.y(parcel, readInt10);
                            break;
                    }
                }
                o8.m(parcel, z24);
                q5.d dVar2 = new q5.d();
                dVar2.a = d;
                dVar2.b = z25;
                dVar2.c = i14;
                dVar2.d = dVar;
                dVar2.e = i15;
                dVar2.f = xVar;
                dVar2.h = d9;
                return dVar2;
            case 10:
                int z26 = o8.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        o8.y(parcel, readInt11);
                    } else {
                        str17 = o8.h(parcel, readInt11);
                    }
                }
                o8.m(parcel, z26);
                return new q5.c(str17);
            case 11:
                int z27 = o8.z(parcel);
                boolean z28 = false;
                while (parcel.dataPosition() < z27) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        o8.y(parcel, readInt12);
                    } else {
                        z28 = o8.n(parcel, readInt12);
                    }
                }
                o8.m(parcel, z27);
                return new q6.a(z28);
            case 12:
                int z29 = o8.z(parcel);
                while (parcel.dataPosition() < z29) {
                    o8.y(parcel, parcel.readInt());
                }
                o8.m(parcel, z29);
                return new q6.b();
            case 13:
                int z30 = o8.z(parcel);
                boolean z31 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        o8.y(parcel, readInt13);
                    } else {
                        z31 = o8.n(parcel, readInt13);
                    }
                }
                o8.m(parcel, z30);
                return new q6.c(z31);
            case 14:
                int z32 = o8.z(parcel);
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        o8.y(parcel, readInt14);
                    } else {
                        z33 = o8.n(parcel, readInt14);
                    }
                }
                o8.m(parcel, z32);
                return new q6.d(z33);
            case 15:
                int z34 = o8.z(parcel);
                PendingIntent pendingIntent2 = null;
                q6.g gVar = null;
                while (parcel.dataPosition() < z34) {
                    int readInt15 = parcel.readInt();
                    char c14 = (char) readInt15;
                    if (c14 == 1) {
                        pendingIntent2 = (PendingIntent) o8.g(parcel, readInt15, PendingIntent.CREATOR);
                    } else if (c14 != 2) {
                        o8.y(parcel, readInt15);
                    } else {
                        gVar = (q6.g) o8.g(parcel, readInt15, q6.g.CREATOR);
                    }
                }
                o8.m(parcel, z34);
                return new q6.e(pendingIntent2, gVar);
            case 16:
                int z35 = o8.z(parcel);
                String str18 = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str19 = null;
                String str20 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z35) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            str18 = o8.h(parcel, readInt16);
                            break;
                        case 2:
                            bundle = o8.a(parcel, readInt16);
                            break;
                        case 3:
                            bundle2 = o8.a(parcel, readInt16);
                            break;
                        case 4:
                            str19 = o8.h(parcel, readInt16);
                            break;
                        case 5:
                            str20 = o8.h(parcel, readInt16);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) o8.g(parcel, readInt16, ResultReceiver.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt16);
                            break;
                    }
                }
                o8.m(parcel, z35);
                return new q6.f(str18, bundle, bundle2, str19, str20, resultReceiver);
            case 17:
                int z36 = o8.z(parcel);
                String str21 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    char c15 = (char) readInt17;
                    if (c15 == 1) {
                        str21 = o8.h(parcel, readInt17);
                    } else if (c15 != 2) {
                        o8.y(parcel, readInt17);
                    } else {
                        bundle3 = o8.a(parcel, readInt17);
                    }
                }
                o8.m(parcel, z36);
                return new q6.g(str21, bundle3);
            case 18:
                int z37 = o8.z(parcel);
                String str22 = "";
                String str23 = str22;
                String str24 = str23;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str25 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            str22 = o8.h(parcel, readInt18);
                            break;
                        case 2:
                            bundle4 = o8.a(parcel, readInt18);
                            break;
                        case 3:
                            bundle5 = o8.a(parcel, readInt18);
                            break;
                        case 4:
                            str25 = o8.h(parcel, readInt18);
                            break;
                        case 5:
                            str23 = o8.h(parcel, readInt18);
                            break;
                        case 6:
                            str24 = o8.h(parcel, readInt18);
                            break;
                        default:
                            o8.y(parcel, readInt18);
                            break;
                    }
                }
                o8.m(parcel, z37);
                return new q6.h(str22, bundle4, bundle5, str25, str23, str24);
            case 19:
                int z38 = o8.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        o8.y(parcel, readInt19);
                    } else {
                        bundle6 = o8.a(parcel, readInt19);
                    }
                }
                o8.m(parcel, z38);
                return new q6.i(bundle6);
            case 20:
                int z39 = o8.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        o8.y(parcel, readInt20);
                    } else {
                        bundle7 = o8.a(parcel, readInt20);
                    }
                }
                o8.m(parcel, z39);
                return new q6.j(bundle7);
            case 21:
                int z40 = o8.z(parcel);
                ArrayList arrayList = null;
                Bundle bundle8 = null;
                String str26 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 1) {
                        arrayList = o8.l(parcel, readInt21, q6.h.CREATOR);
                    } else if (c16 == 2) {
                        bundle8 = o8.a(parcel, readInt21);
                    } else if (c16 == 3) {
                        str26 = o8.h(parcel, readInt21);
                    } else if (c16 != 4) {
                        o8.y(parcel, readInt21);
                    } else {
                        resultReceiver2 = (ResultReceiver) o8.g(parcel, readInt21, ResultReceiver.CREATOR);
                    }
                }
                o8.m(parcel, z40);
                return new GetCredentialRequest(arrayList, bundle8, str26, resultReceiver2);
            case 22:
                int z41 = o8.z(parcel);
                Bundle bundle9 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        o8.y(parcel, readInt22);
                    } else {
                        bundle9 = o8.a(parcel, readInt22);
                    }
                }
                o8.m(parcel, z41);
                return new q6.k(bundle9);
            case 23:
                int z42 = o8.z(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        o8.y(parcel, readInt23);
                    } else {
                        pendingIntent3 = (PendingIntent) o8.g(parcel, readInt23, PendingIntent.CREATOR);
                    }
                }
                o8.m(parcel, z42);
                return new q6.l(pendingIntent3);
            case 24:
                int z43 = o8.z(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        o8.y(parcel, readInt24);
                    } else {
                        pendingIntent4 = (PendingIntent) o8.g(parcel, readInt24, PendingIntent.CREATOR);
                    }
                }
                o8.m(parcel, z43);
                return new q6.m(pendingIntent4);
            case 25:
                int z44 = o8.z(parcel);
                while (parcel.dataPosition() < z44) {
                    o8.y(parcel, parcel.readInt());
                }
                o8.m(parcel, z44);
                return new q6.n();
            case 26:
                int z45 = o8.z(parcel);
                while (parcel.dataPosition() < z45) {
                    o8.y(parcel, parcel.readInt());
                }
                o8.m(parcel, z45);
                return new q6.o();
            case 27:
                int z46 = o8.z(parcel);
                while (parcel.dataPosition() < z46) {
                    o8.y(parcel, parcel.readInt());
                }
                o8.m(parcel, z46);
                return new q6.p();
            case 28:
                int z47 = o8.z(parcel);
                while (parcel.dataPosition() < z47) {
                    o8.y(parcel, parcel.readInt());
                }
                o8.m(parcel, z47);
                return new q6.q();
            default:
                int z48 = o8.z(parcel);
                Status status = null;
                q7.h hVar2 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt25 = parcel.readInt();
                    char c17 = (char) readInt25;
                    if (c17 == 1) {
                        status = (Status) o8.g(parcel, readInt25, Status.CREATOR);
                    } else if (c17 != 2) {
                        o8.y(parcel, readInt25);
                    } else {
                        hVar2 = (q7.h) o8.g(parcel, readInt25, q7.h.CREATOR);
                    }
                }
                o8.m(parcel, z48);
                return new q7.g(status, hVar2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new b[i9];
            case 1:
                return new d[i9];
            case 2:
                return new o7.d[i9];
            case 3:
                return new o7.e[i9];
            case 4:
                return new o7.f[i9];
            case 5:
                return new o7.g[i9];
            case 6:
                return new o7.h[i9];
            case 7:
                return new UserAddress[i9];
            case 8:
                return new y[i9];
            case 9:
                return new q5.d[i9];
            case 10:
                return new q5.c[i9];
            case 11:
                return new q6.a[i9];
            case 12:
                return new q6.b[i9];
            case 13:
                return new q6.c[i9];
            case 14:
                return new q6.d[i9];
            case 15:
                return new q6.e[i9];
            case 16:
                return new q6.f[i9];
            case 17:
                return new q6.g[i9];
            case 18:
                return new q6.h[i9];
            case 19:
                return new q6.i[i9];
            case 20:
                return new q6.j[i9];
            case 21:
                return new GetCredentialRequest[i9];
            case 22:
                return new q6.k[i9];
            case 23:
                return new q6.l[i9];
            case 24:
                return new q6.m[i9];
            case 25:
                return new q6.n[i9];
            case 26:
                return new q6.o[i9];
            case 27:
                return new q6.p[i9];
            case 28:
                return new q6.q[i9];
            default:
                return new q7.g[i9];
        }
    }
}
