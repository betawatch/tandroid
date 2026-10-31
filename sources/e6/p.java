package e6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import g6.x;
import java.util.ArrayList;
import w7.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g0.z(parcel);
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i10 = g0.u(parcel, readInt);
                    } else if (c10 == 3) {
                        i11 = g0.u(parcel, readInt);
                    } else if (c10 != 4) {
                        g0.y(parcel, readInt);
                    } else {
                        i12 = g0.u(parcel, readInt);
                    }
                }
                g0.m(parcel, z10);
                return new b(i10, i11, i12);
            case 1:
                int z11 = g0.z(parcel);
                String str = null;
                int i13 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        str = g0.h(parcel, readInt2);
                    } else if (c11 == 3) {
                        i13 = g0.u(parcel, readInt2);
                    } else if (c11 != 4) {
                        g0.y(parcel, readInt2);
                    } else {
                        str2 = g0.h(parcel, readInt2);
                    }
                }
                g0.m(parcel, z11);
                return new d(str, i13, str2);
            case 2:
                int z12 = g0.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        g0.y(parcel, readInt3);
                    } else {
                        bArr = g0.b(parcel, readInt3);
                    }
                }
                g0.m(parcel, z12);
                return new e8.d(bArr);
            case 3:
                int z13 = g0.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        g0.y(parcel, readInt4);
                    } else {
                        bArr2 = g0.b(parcel, readInt4);
                    }
                }
                g0.m(parcel, z13);
                return new e8.e(bArr2);
            case 4:
                int z14 = g0.z(parcel);
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        g0.y(parcel, readInt5);
                    } else {
                        bArr3 = g0.b(parcel, readInt5);
                    }
                }
                g0.m(parcel, z14);
                return new e8.f(bArr3);
            case 5:
                int z15 = g0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        g0.y(parcel, readInt6);
                    } else {
                        pendingIntent = (PendingIntent) g0.g(parcel, readInt6, PendingIntent.CREATOR);
                    }
                }
                g0.m(parcel, z15);
                return new e8.g(pendingIntent);
            case 6:
                int z16 = g0.z(parcel);
                String[] strArr = null;
                int[] iArr = null;
                RemoteViews remoteViews = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        strArr = g0.i(parcel, readInt7);
                    } else if (c12 == 2) {
                        iArr = g0.d(parcel, readInt7);
                    } else if (c12 == 3) {
                        remoteViews = (RemoteViews) g0.g(parcel, readInt7, RemoteViews.CREATOR);
                    } else if (c12 != 4) {
                        g0.y(parcel, readInt7);
                    } else {
                        bArr4 = g0.b(parcel, readInt7);
                    }
                }
                g0.m(parcel, z16);
                e8.h hVar = new e8.h();
                hVar.a = strArr;
                hVar.b = iArr;
                hVar.c = remoteViews;
                hVar.d = bArr4;
                return hVar;
            case 7:
                int z17 = g0.z(parcel);
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
                boolean z18 = false;
                String str16 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    boolean z19 = z18;
                    switch ((char) readInt8) {
                        case 2:
                            str3 = g0.h(parcel, readInt8);
                            break;
                        case 3:
                            str16 = g0.h(parcel, readInt8);
                            break;
                        case 4:
                            str4 = g0.h(parcel, readInt8);
                            break;
                        case 5:
                            str5 = g0.h(parcel, readInt8);
                            break;
                        case 6:
                            str6 = g0.h(parcel, readInt8);
                            break;
                        case 7:
                            str7 = g0.h(parcel, readInt8);
                            break;
                        case '\b':
                            str8 = g0.h(parcel, readInt8);
                            break;
                        case '\t':
                            str9 = g0.h(parcel, readInt8);
                            break;
                        case '\n':
                            str10 = g0.h(parcel, readInt8);
                            break;
                        case 11:
                            str11 = g0.h(parcel, readInt8);
                            break;
                        case '\f':
                            str12 = g0.h(parcel, readInt8);
                            break;
                        case '\r':
                            str13 = g0.h(parcel, readInt8);
                            break;
                        case 14:
                            z18 = g0.n(parcel, readInt8);
                            continue;
                        case 15:
                            str15 = g0.h(parcel, readInt8);
                            break;
                        case 16:
                            str14 = g0.h(parcel, readInt8);
                            break;
                        default:
                            g0.y(parcel, readInt8);
                            break;
                    }
                    z18 = z19;
                }
                boolean z20 = z18;
                g0.m(parcel, z17);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str3;
                userAddress.b = str16;
                userAddress.c = str4;
                userAddress.d = str5;
                userAddress.e = str6;
                userAddress.f = str7;
                userAddress.h = str8;
                userAddress.n = str9;
                userAddress.r = str10;
                userAddress.s = str11;
                userAddress.w = str12;
                userAddress.x = str13;
                userAddress.y = z20;
                userAddress.D = str15;
                userAddress.E = str14;
                return userAddress;
            case 8:
                int z21 = g0.z(parcel);
                int i14 = 0;
                boolean z22 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        i14 = g0.u(parcel, readInt9);
                    } else if (c13 == 3) {
                        z22 = g0.n(parcel, readInt9);
                    } else if (c13 != 4) {
                        g0.y(parcel, readInt9);
                    } else {
                        z23 = g0.n(parcel, readInt9);
                    }
                }
                g0.m(parcel, z21);
                return new x(i14, z22, z23);
            case 9:
                int z24 = g0.z(parcel);
                double d = 0.0d;
                c6.d dVar = null;
                c6.x xVar = null;
                boolean z25 = false;
                int i15 = 0;
                int i16 = 0;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            d = g0.q(parcel, readInt10);
                            break;
                        case 3:
                            z25 = g0.n(parcel, readInt10);
                            break;
                        case 4:
                            i15 = g0.u(parcel, readInt10);
                            break;
                        case 5:
                            dVar = (c6.d) g0.g(parcel, readInt10, c6.d.CREATOR);
                            break;
                        case 6:
                            i16 = g0.u(parcel, readInt10);
                            break;
                        case 7:
                            xVar = (c6.x) g0.g(parcel, readInt10, c6.x.CREATOR);
                            break;
                        case '\b':
                            d10 = g0.q(parcel, readInt10);
                            break;
                        default:
                            g0.y(parcel, readInt10);
                            break;
                    }
                }
                g0.m(parcel, z24);
                g6.d dVar2 = new g6.d();
                dVar2.a = d;
                dVar2.b = z25;
                dVar2.c = i15;
                dVar2.d = dVar;
                dVar2.e = i16;
                dVar2.f = xVar;
                dVar2.h = d10;
                return dVar2;
            case 10:
                int z26 = g0.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        g0.y(parcel, readInt11);
                    } else {
                        str17 = g0.h(parcel, readInt11);
                    }
                }
                g0.m(parcel, z26);
                return new g6.c(str17);
            case 11:
                int z27 = g0.z(parcel);
                boolean z28 = false;
                while (parcel.dataPosition() < z27) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        g0.y(parcel, readInt12);
                    } else {
                        z28 = g0.n(parcel, readInt12);
                    }
                }
                g0.m(parcel, z27);
                return new g7.a(z28);
            case 12:
                int z29 = g0.z(parcel);
                while (parcel.dataPosition() < z29) {
                    g0.y(parcel, parcel.readInt());
                }
                g0.m(parcel, z29);
                return new g7.b();
            case 13:
                int z30 = g0.z(parcel);
                boolean z31 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        g0.y(parcel, readInt13);
                    } else {
                        z31 = g0.n(parcel, readInt13);
                    }
                }
                g0.m(parcel, z30);
                return new g7.c(z31);
            case 14:
                int z32 = g0.z(parcel);
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        g0.y(parcel, readInt14);
                    } else {
                        z33 = g0.n(parcel, readInt14);
                    }
                }
                g0.m(parcel, z32);
                return new g7.d(z33);
            case 15:
                int z34 = g0.z(parcel);
                PendingIntent pendingIntent2 = null;
                g7.g gVar = null;
                while (parcel.dataPosition() < z34) {
                    int readInt15 = parcel.readInt();
                    char c14 = (char) readInt15;
                    if (c14 == 1) {
                        pendingIntent2 = (PendingIntent) g0.g(parcel, readInt15, PendingIntent.CREATOR);
                    } else if (c14 != 2) {
                        g0.y(parcel, readInt15);
                    } else {
                        gVar = (g7.g) g0.g(parcel, readInt15, g7.g.CREATOR);
                    }
                }
                g0.m(parcel, z34);
                return new g7.e(pendingIntent2, gVar);
            case 16:
                int z35 = g0.z(parcel);
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
                            str18 = g0.h(parcel, readInt16);
                            break;
                        case 2:
                            bundle = g0.a(parcel, readInt16);
                            break;
                        case 3:
                            bundle2 = g0.a(parcel, readInt16);
                            break;
                        case 4:
                            str19 = g0.h(parcel, readInt16);
                            break;
                        case 5:
                            str20 = g0.h(parcel, readInt16);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) g0.g(parcel, readInt16, ResultReceiver.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt16);
                            break;
                    }
                }
                g0.m(parcel, z35);
                return new g7.f(str18, bundle, bundle2, str19, str20, resultReceiver);
            case 17:
                int z36 = g0.z(parcel);
                String str21 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    char c15 = (char) readInt17;
                    if (c15 == 1) {
                        str21 = g0.h(parcel, readInt17);
                    } else if (c15 != 2) {
                        g0.y(parcel, readInt17);
                    } else {
                        bundle3 = g0.a(parcel, readInt17);
                    }
                }
                g0.m(parcel, z36);
                return new g7.g(str21, bundle3);
            case 18:
                int z37 = g0.z(parcel);
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
                            str22 = g0.h(parcel, readInt18);
                            break;
                        case 2:
                            bundle4 = g0.a(parcel, readInt18);
                            break;
                        case 3:
                            bundle5 = g0.a(parcel, readInt18);
                            break;
                        case 4:
                            str25 = g0.h(parcel, readInt18);
                            break;
                        case 5:
                            str23 = g0.h(parcel, readInt18);
                            break;
                        case 6:
                            str24 = g0.h(parcel, readInt18);
                            break;
                        default:
                            g0.y(parcel, readInt18);
                            break;
                    }
                }
                g0.m(parcel, z37);
                return new g7.h(str22, bundle4, bundle5, str25, str23, str24);
            case 19:
                int z38 = g0.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        g0.y(parcel, readInt19);
                    } else {
                        bundle6 = g0.a(parcel, readInt19);
                    }
                }
                g0.m(parcel, z38);
                return new g7.i(bundle6);
            case 20:
                int z39 = g0.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        g0.y(parcel, readInt20);
                    } else {
                        bundle7 = g0.a(parcel, readInt20);
                    }
                }
                g0.m(parcel, z39);
                return new g7.j(bundle7);
            case 21:
                int z40 = g0.z(parcel);
                ArrayList arrayList = null;
                Bundle bundle8 = null;
                String str26 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 1) {
                        arrayList = g0.l(parcel, readInt21, g7.h.CREATOR);
                    } else if (c16 == 2) {
                        bundle8 = g0.a(parcel, readInt21);
                    } else if (c16 == 3) {
                        str26 = g0.h(parcel, readInt21);
                    } else if (c16 != 4) {
                        g0.y(parcel, readInt21);
                    } else {
                        resultReceiver2 = (ResultReceiver) g0.g(parcel, readInt21, ResultReceiver.CREATOR);
                    }
                }
                g0.m(parcel, z40);
                return new GetCredentialRequest(arrayList, bundle8, str26, resultReceiver2);
            case 22:
                int z41 = g0.z(parcel);
                Bundle bundle9 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        g0.y(parcel, readInt22);
                    } else {
                        bundle9 = g0.a(parcel, readInt22);
                    }
                }
                g0.m(parcel, z41);
                return new g7.k(bundle9);
            case 23:
                int z42 = g0.z(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        g0.y(parcel, readInt23);
                    } else {
                        pendingIntent3 = (PendingIntent) g0.g(parcel, readInt23, PendingIntent.CREATOR);
                    }
                }
                g0.m(parcel, z42);
                return new g7.l(pendingIntent3);
            case 24:
                int z43 = g0.z(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        g0.y(parcel, readInt24);
                    } else {
                        pendingIntent4 = (PendingIntent) g0.g(parcel, readInt24, PendingIntent.CREATOR);
                    }
                }
                g0.m(parcel, z43);
                return new g7.m(pendingIntent4);
            case 25:
                int z44 = g0.z(parcel);
                while (parcel.dataPosition() < z44) {
                    g0.y(parcel, parcel.readInt());
                }
                g0.m(parcel, z44);
                return new g7.n();
            case 26:
                int z45 = g0.z(parcel);
                while (parcel.dataPosition() < z45) {
                    g0.y(parcel, parcel.readInt());
                }
                g0.m(parcel, z45);
                return new g7.o();
            case 27:
                int z46 = g0.z(parcel);
                while (parcel.dataPosition() < z46) {
                    g0.y(parcel, parcel.readInt());
                }
                g0.m(parcel, z46);
                return new g7.p();
            case 28:
                int z47 = g0.z(parcel);
                while (parcel.dataPosition() < z47) {
                    g0.y(parcel, parcel.readInt());
                }
                g0.m(parcel, z47);
                return new g7.q();
            default:
                int z48 = g0.z(parcel);
                Status status = null;
                g8.f fVar = null;
                while (parcel.dataPosition() < z48) {
                    int readInt25 = parcel.readInt();
                    char c17 = (char) readInt25;
                    if (c17 == 1) {
                        status = (Status) g0.g(parcel, readInt25, Status.CREATOR);
                    } else if (c17 != 2) {
                        g0.y(parcel, readInt25);
                    } else {
                        fVar = (g8.f) g0.g(parcel, readInt25, g8.f.CREATOR);
                    }
                }
                g0.m(parcel, z48);
                return new g8.e(status, fVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new d[i10];
            case 2:
                return new e8.d[i10];
            case 3:
                return new e8.e[i10];
            case 4:
                return new e8.f[i10];
            case 5:
                return new e8.g[i10];
            case 6:
                return new e8.h[i10];
            case 7:
                return new UserAddress[i10];
            case 8:
                return new x[i10];
            case 9:
                return new g6.d[i10];
            case 10:
                return new g6.c[i10];
            case 11:
                return new g7.a[i10];
            case 12:
                return new g7.b[i10];
            case 13:
                return new g7.c[i10];
            case 14:
                return new g7.d[i10];
            case 15:
                return new g7.e[i10];
            case 16:
                return new g7.f[i10];
            case 17:
                return new g7.g[i10];
            case 18:
                return new g7.h[i10];
            case 19:
                return new g7.i[i10];
            case 20:
                return new g7.j[i10];
            case 21:
                return new GetCredentialRequest[i10];
            case 22:
                return new g7.k[i10];
            case 23:
                return new g7.l[i10];
            case 24:
                return new g7.m[i10];
            case 25:
                return new g7.n[i10];
            case 26:
                return new g7.o[i10];
            case 27:
                return new g7.p[i10];
            case 28:
                return new g7.q[i10];
            default:
                return new g8.e[i10];
        }
    }
}
