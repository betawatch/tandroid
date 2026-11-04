package f6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i3) {
        this.a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                int i3 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        g6.e.y(parcel, readInt);
                    } else {
                        i3 = g6.e.u(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                return new b0(i3);
            case 1:
                int z11 = g6.e.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                e6.i iVar = null;
                g6.a aVar = null;
                ArrayList arrayList2 = null;
                a0 a0Var = null;
                b0 b0Var = null;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                double d = 0.0d;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str = g6.e.h(parcel, readInt2);
                            break;
                        case 3:
                            arrayList = g6.e.j(parcel, readInt2);
                            break;
                        case 4:
                            z12 = g6.e.n(parcel, readInt2);
                            break;
                        case 5:
                            iVar = (e6.i) g6.e.g(parcel, readInt2, e6.i.CREATOR);
                            break;
                        case 6:
                            z13 = g6.e.n(parcel, readInt2);
                            break;
                        case 7:
                            aVar = (g6.a) g6.e.g(parcel, readInt2, g6.a.CREATOR);
                            break;
                        case '\b':
                            z14 = g6.e.n(parcel, readInt2);
                            break;
                        case '\t':
                            d = g6.e.q(parcel, readInt2);
                            break;
                        case '\n':
                            z15 = g6.e.n(parcel, readInt2);
                            break;
                        case 11:
                            z16 = g6.e.n(parcel, readInt2);
                            break;
                        case '\f':
                            z17 = g6.e.n(parcel, readInt2);
                            break;
                        case '\r':
                            arrayList2 = g6.e.j(parcel, readInt2);
                            break;
                        case 14:
                            z18 = g6.e.n(parcel, readInt2);
                            break;
                        case 15:
                            g6.e.u(parcel, readInt2);
                            break;
                        case 16:
                            z19 = g6.e.n(parcel, readInt2);
                            break;
                        case 17:
                            a0Var = (a0) g6.e.g(parcel, readInt2, a0.CREATOR);
                            break;
                        case 18:
                            b0Var = (b0) g6.e.g(parcel, readInt2, b0.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt2);
                            break;
                    }
                }
                g6.e.m(parcel, z11);
                return new b(str, arrayList, z12, iVar, z13, aVar, z14, d, z15, z16, z17, arrayList2, z18, z19, a0Var, b0Var);
            case 2:
                int z20 = g6.e.z(parcel);
                boolean z21 = false;
                boolean z22 = false;
                String str2 = null;
                String str3 = null;
                IBinder iBinder = null;
                g6.f fVar = null;
                while (parcel.dataPosition() < z20) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str2 = g6.e.h(parcel, readInt3);
                            break;
                        case 3:
                            str3 = g6.e.h(parcel, readInt3);
                            break;
                        case 4:
                            iBinder = g6.e.t(parcel, readInt3);
                            break;
                        case 5:
                            fVar = (g6.f) g6.e.g(parcel, readInt3, g6.f.CREATOR);
                            break;
                        case 6:
                            z21 = g6.e.n(parcel, readInt3);
                            break;
                        case 7:
                            z22 = g6.e.n(parcel, readInt3);
                            break;
                        default:
                            g6.e.y(parcel, readInt3);
                            break;
                    }
                }
                g6.e.m(parcel, z20);
                return new g6.a(str2, str3, iBinder, fVar, z21, z22);
            case 3:
                int z23 = g6.e.z(parcel);
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
                boolean z24 = false;
                boolean z25 = false;
                ArrayList arrayList3 = null;
                int[] iArr = null;
                String str4 = null;
                IBinder iBinder2 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            arrayList3 = g6.e.j(parcel, readInt4);
                            break;
                        case 3:
                            iArr = g6.e.d(parcel, readInt4);
                            break;
                        case 4:
                            j10 = g6.e.w(parcel, readInt4);
                            break;
                        case 5:
                            str4 = g6.e.h(parcel, readInt4);
                            break;
                        case 6:
                            i10 = g6.e.u(parcel, readInt4);
                            break;
                        case 7:
                            i11 = g6.e.u(parcel, readInt4);
                            break;
                        case '\b':
                            i12 = g6.e.u(parcel, readInt4);
                            break;
                        case '\t':
                            i13 = g6.e.u(parcel, readInt4);
                            break;
                        case '\n':
                            i14 = g6.e.u(parcel, readInt4);
                            break;
                        case 11:
                            i15 = g6.e.u(parcel, readInt4);
                            break;
                        case '\f':
                            i16 = g6.e.u(parcel, readInt4);
                            break;
                        case '\r':
                            i17 = g6.e.u(parcel, readInt4);
                            break;
                        case 14:
                            i18 = g6.e.u(parcel, readInt4);
                            break;
                        case 15:
                            i19 = g6.e.u(parcel, readInt4);
                            break;
                        case 16:
                            i20 = g6.e.u(parcel, readInt4);
                            break;
                        case 17:
                            i21 = g6.e.u(parcel, readInt4);
                            break;
                        case 18:
                            i22 = g6.e.u(parcel, readInt4);
                            break;
                        case 19:
                            i23 = g6.e.u(parcel, readInt4);
                            break;
                        case 20:
                            i24 = g6.e.u(parcel, readInt4);
                            break;
                        case 21:
                            i25 = g6.e.u(parcel, readInt4);
                            break;
                        case 22:
                            i26 = g6.e.u(parcel, readInt4);
                            break;
                        case 23:
                            i27 = g6.e.u(parcel, readInt4);
                            break;
                        case 24:
                            i28 = g6.e.u(parcel, readInt4);
                            break;
                        case 25:
                            i29 = g6.e.u(parcel, readInt4);
                            break;
                        case 26:
                            i30 = g6.e.u(parcel, readInt4);
                            break;
                        case 27:
                            i31 = g6.e.u(parcel, readInt4);
                            break;
                        case 28:
                            i32 = g6.e.u(parcel, readInt4);
                            break;
                        case 29:
                            i33 = g6.e.u(parcel, readInt4);
                            break;
                        case hs.T /* 30 */:
                            i34 = g6.e.u(parcel, readInt4);
                            break;
                        case hs.U /* 31 */:
                            i35 = g6.e.u(parcel, readInt4);
                            break;
                        case ' ':
                            i36 = g6.e.u(parcel, readInt4);
                            break;
                        case '!':
                            iBinder2 = g6.e.t(parcel, readInt4);
                            break;
                        case '\"':
                            z24 = g6.e.n(parcel, readInt4);
                            break;
                        case '#':
                            z25 = g6.e.n(parcel, readInt4);
                            break;
                        default:
                            g6.e.y(parcel, readInt4);
                            break;
                    }
                }
                g6.e.m(parcel, z23);
                return new g6.f(arrayList3, iArr, j10, str4, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder2, z24, z25);
            case 4:
                int z26 = g6.e.z(parcel);
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 2) {
                        i37 = g6.e.u(parcel, readInt5);
                    } else if (c2 == 3) {
                        i38 = g6.e.u(parcel, readInt5);
                    } else if (c2 != 4) {
                        g6.e.y(parcel, readInt5);
                    } else {
                        i39 = g6.e.u(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z26);
                return new g6.b(i37, i38, i39);
            case 5:
                int z27 = g6.e.z(parcel);
                String str5 = null;
                int i40 = 0;
                String str6 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt6 = parcel.readInt();
                    char c10 = (char) readInt6;
                    if (c10 == 2) {
                        str5 = g6.e.h(parcel, readInt6);
                    } else if (c10 == 3) {
                        i40 = g6.e.u(parcel, readInt6);
                    } else if (c10 != 4) {
                        g6.e.y(parcel, readInt6);
                    } else {
                        str6 = g6.e.h(parcel, readInt6);
                    }
                }
                g6.e.m(parcel, z27);
                return new g6.d(str5, i40, str6);
            case 6:
                int z28 = g6.e.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z28) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        g6.e.y(parcel, readInt7);
                    } else {
                        bArr = g6.e.b(parcel, readInt7);
                    }
                }
                g6.e.m(parcel, z28);
                return new g8.d(bArr);
            case 7:
                int z29 = g6.e.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 2) {
                        g6.e.y(parcel, readInt8);
                    } else {
                        bArr2 = g6.e.b(parcel, readInt8);
                    }
                }
                g6.e.m(parcel, z29);
                return new g8.e(bArr2);
            case 8:
                int z30 = g6.e.z(parcel);
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        g6.e.y(parcel, readInt9);
                    } else {
                        bArr3 = g6.e.b(parcel, readInt9);
                    }
                }
                g6.e.m(parcel, z30);
                return new g8.f(bArr3);
            case 9:
                int z31 = g6.e.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z31) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        g6.e.y(parcel, readInt10);
                    } else {
                        pendingIntent = (PendingIntent) g6.e.g(parcel, readInt10, PendingIntent.CREATOR);
                    }
                }
                g6.e.m(parcel, z31);
                return new g8.g(pendingIntent);
            case 10:
                int z32 = g6.e.z(parcel);
                String[] strArr = null;
                int[] iArr2 = null;
                RemoteViews remoteViews = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 1) {
                        strArr = g6.e.i(parcel, readInt11);
                    } else if (c11 == 2) {
                        iArr2 = g6.e.d(parcel, readInt11);
                    } else if (c11 == 3) {
                        remoteViews = (RemoteViews) g6.e.g(parcel, readInt11, RemoteViews.CREATOR);
                    } else if (c11 != 4) {
                        g6.e.y(parcel, readInt11);
                    } else {
                        bArr4 = g6.e.b(parcel, readInt11);
                    }
                }
                g6.e.m(parcel, z32);
                g8.h hVar = new g8.h();
                hVar.a = strArr;
                hVar.b = iArr2;
                hVar.c = remoteViews;
                hVar.d = bArr4;
                return hVar;
            case 11:
                int z33 = g6.e.z(parcel);
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
                boolean z34 = false;
                String str20 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt12 = parcel.readInt();
                    boolean z35 = z34;
                    switch ((char) readInt12) {
                        case 2:
                            str7 = g6.e.h(parcel, readInt12);
                            break;
                        case 3:
                            str20 = g6.e.h(parcel, readInt12);
                            break;
                        case 4:
                            str8 = g6.e.h(parcel, readInt12);
                            break;
                        case 5:
                            str9 = g6.e.h(parcel, readInt12);
                            break;
                        case 6:
                            str10 = g6.e.h(parcel, readInt12);
                            break;
                        case 7:
                            str11 = g6.e.h(parcel, readInt12);
                            break;
                        case '\b':
                            str12 = g6.e.h(parcel, readInt12);
                            break;
                        case '\t':
                            str13 = g6.e.h(parcel, readInt12);
                            break;
                        case '\n':
                            str14 = g6.e.h(parcel, readInt12);
                            break;
                        case 11:
                            str15 = g6.e.h(parcel, readInt12);
                            break;
                        case '\f':
                            str16 = g6.e.h(parcel, readInt12);
                            break;
                        case '\r':
                            str17 = g6.e.h(parcel, readInt12);
                            break;
                        case 14:
                            z34 = g6.e.n(parcel, readInt12);
                            continue;
                        case 15:
                            str19 = g6.e.h(parcel, readInt12);
                            break;
                        case 16:
                            str18 = g6.e.h(parcel, readInt12);
                            break;
                        default:
                            g6.e.y(parcel, readInt12);
                            break;
                    }
                    z34 = z35;
                }
                boolean z36 = z34;
                g6.e.m(parcel, z33);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str7;
                userAddress.b = str20;
                userAddress.c = str8;
                userAddress.d = str9;
                userAddress.e = str10;
                userAddress.f = str11;
                userAddress.h = str12;
                userAddress.n = str13;
                userAddress.r = str14;
                userAddress.s = str15;
                userAddress.w = str16;
                userAddress.x = str17;
                userAddress.y = z36;
                userAddress.E = str19;
                userAddress.F = str18;
                return userAddress;
            case 12:
                int z37 = g6.e.z(parcel);
                int i41 = 0;
                boolean z38 = false;
                boolean z39 = false;
                while (parcel.dataPosition() < z37) {
                    int readInt13 = parcel.readInt();
                    char c12 = (char) readInt13;
                    if (c12 == 2) {
                        i41 = g6.e.u(parcel, readInt13);
                    } else if (c12 == 3) {
                        z38 = g6.e.n(parcel, readInt13);
                    } else if (c12 != 4) {
                        g6.e.y(parcel, readInt13);
                    } else {
                        z39 = g6.e.n(parcel, readInt13);
                    }
                }
                g6.e.m(parcel, z37);
                return new i6.x(i41, z38, z39);
            case 13:
                int z40 = g6.e.z(parcel);
                double d10 = 0.0d;
                e6.d dVar = null;
                e6.x xVar = null;
                boolean z41 = false;
                int i42 = 0;
                int i43 = 0;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z40) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            d10 = g6.e.q(parcel, readInt14);
                            break;
                        case 3:
                            z41 = g6.e.n(parcel, readInt14);
                            break;
                        case 4:
                            i42 = g6.e.u(parcel, readInt14);
                            break;
                        case 5:
                            dVar = (e6.d) g6.e.g(parcel, readInt14, e6.d.CREATOR);
                            break;
                        case 6:
                            i43 = g6.e.u(parcel, readInt14);
                            break;
                        case 7:
                            xVar = (e6.x) g6.e.g(parcel, readInt14, e6.x.CREATOR);
                            break;
                        case '\b':
                            d11 = g6.e.q(parcel, readInt14);
                            break;
                        default:
                            g6.e.y(parcel, readInt14);
                            break;
                    }
                }
                g6.e.m(parcel, z40);
                i6.d dVar2 = new i6.d();
                dVar2.a = d10;
                dVar2.b = z41;
                dVar2.c = i42;
                dVar2.d = dVar;
                dVar2.e = i43;
                dVar2.f = xVar;
                dVar2.h = d11;
                return dVar2;
            case 14:
                int z42 = g6.e.z(parcel);
                String str21 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 2) {
                        g6.e.y(parcel, readInt15);
                    } else {
                        str21 = g6.e.h(parcel, readInt15);
                    }
                }
                g6.e.m(parcel, z42);
                return new i6.c(str21);
            case 15:
                int z43 = g6.e.z(parcel);
                boolean z44 = false;
                while (parcel.dataPosition() < z43) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        g6.e.y(parcel, readInt16);
                    } else {
                        z44 = g6.e.n(parcel, readInt16);
                    }
                }
                g6.e.m(parcel, z43);
                return new i7.a(z44);
            case 16:
                int z45 = g6.e.z(parcel);
                while (parcel.dataPosition() < z45) {
                    g6.e.y(parcel, parcel.readInt());
                }
                g6.e.m(parcel, z45);
                return new i7.b();
            case 17:
                int z46 = g6.e.z(parcel);
                boolean z47 = false;
                while (parcel.dataPosition() < z46) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        g6.e.y(parcel, readInt17);
                    } else {
                        z47 = g6.e.n(parcel, readInt17);
                    }
                }
                g6.e.m(parcel, z46);
                return new i7.c(z47);
            case 18:
                int z48 = g6.e.z(parcel);
                boolean z49 = false;
                while (parcel.dataPosition() < z48) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        g6.e.y(parcel, readInt18);
                    } else {
                        z49 = g6.e.n(parcel, readInt18);
                    }
                }
                g6.e.m(parcel, z48);
                return new i7.d(z49);
            case 19:
                int z50 = g6.e.z(parcel);
                PendingIntent pendingIntent2 = null;
                i7.g gVar = null;
                while (parcel.dataPosition() < z50) {
                    int readInt19 = parcel.readInt();
                    char c13 = (char) readInt19;
                    if (c13 == 1) {
                        pendingIntent2 = (PendingIntent) g6.e.g(parcel, readInt19, PendingIntent.CREATOR);
                    } else if (c13 != 2) {
                        g6.e.y(parcel, readInt19);
                    } else {
                        gVar = (i7.g) g6.e.g(parcel, readInt19, i7.g.CREATOR);
                    }
                }
                g6.e.m(parcel, z50);
                return new i7.e(pendingIntent2, gVar);
            case 20:
                int z51 = g6.e.z(parcel);
                String str22 = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str23 = null;
                String str24 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z51) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            str22 = g6.e.h(parcel, readInt20);
                            break;
                        case 2:
                            bundle = g6.e.a(parcel, readInt20);
                            break;
                        case 3:
                            bundle2 = g6.e.a(parcel, readInt20);
                            break;
                        case 4:
                            str23 = g6.e.h(parcel, readInt20);
                            break;
                        case 5:
                            str24 = g6.e.h(parcel, readInt20);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) g6.e.g(parcel, readInt20, ResultReceiver.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt20);
                            break;
                    }
                }
                g6.e.m(parcel, z51);
                return new i7.f(str22, bundle, bundle2, str23, str24, resultReceiver);
            case 21:
                int z52 = g6.e.z(parcel);
                String str25 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z52) {
                    int readInt21 = parcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        str25 = g6.e.h(parcel, readInt21);
                    } else if (c14 != 2) {
                        g6.e.y(parcel, readInt21);
                    } else {
                        bundle3 = g6.e.a(parcel, readInt21);
                    }
                }
                g6.e.m(parcel, z52);
                return new i7.g(str25, bundle3);
            case 22:
                int z53 = g6.e.z(parcel);
                String str26 = "";
                String str27 = str26;
                String str28 = str27;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str29 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            str26 = g6.e.h(parcel, readInt22);
                            break;
                        case 2:
                            bundle4 = g6.e.a(parcel, readInt22);
                            break;
                        case 3:
                            bundle5 = g6.e.a(parcel, readInt22);
                            break;
                        case 4:
                            str29 = g6.e.h(parcel, readInt22);
                            break;
                        case 5:
                            str27 = g6.e.h(parcel, readInt22);
                            break;
                        case 6:
                            str28 = g6.e.h(parcel, readInt22);
                            break;
                        default:
                            g6.e.y(parcel, readInt22);
                            break;
                    }
                }
                g6.e.m(parcel, z53);
                return new i7.h(str26, bundle4, bundle5, str29, str27, str28);
            case 23:
                int z54 = g6.e.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z54) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        g6.e.y(parcel, readInt23);
                    } else {
                        bundle6 = g6.e.a(parcel, readInt23);
                    }
                }
                g6.e.m(parcel, z54);
                return new i7.i(bundle6);
            case 24:
                int z55 = g6.e.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z55) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        g6.e.y(parcel, readInt24);
                    } else {
                        bundle7 = g6.e.a(parcel, readInt24);
                    }
                }
                g6.e.m(parcel, z55);
                return new i7.j(bundle7);
            case 25:
                int z56 = g6.e.z(parcel);
                ArrayList arrayList4 = null;
                Bundle bundle8 = null;
                String str30 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z56) {
                    int readInt25 = parcel.readInt();
                    char c15 = (char) readInt25;
                    if (c15 == 1) {
                        arrayList4 = g6.e.l(parcel, readInt25, i7.h.CREATOR);
                    } else if (c15 == 2) {
                        bundle8 = g6.e.a(parcel, readInt25);
                    } else if (c15 == 3) {
                        str30 = g6.e.h(parcel, readInt25);
                    } else if (c15 != 4) {
                        g6.e.y(parcel, readInt25);
                    } else {
                        resultReceiver2 = (ResultReceiver) g6.e.g(parcel, readInt25, ResultReceiver.CREATOR);
                    }
                }
                g6.e.m(parcel, z56);
                return new GetCredentialRequest(arrayList4, bundle8, str30, resultReceiver2);
            case 26:
                int z57 = g6.e.z(parcel);
                Bundle bundle9 = null;
                while (parcel.dataPosition() < z57) {
                    int readInt26 = parcel.readInt();
                    if (((char) readInt26) != 1) {
                        g6.e.y(parcel, readInt26);
                    } else {
                        bundle9 = g6.e.a(parcel, readInt26);
                    }
                }
                g6.e.m(parcel, z57);
                return new i7.k(bundle9);
            case 27:
                int z58 = g6.e.z(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < z58) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        g6.e.y(parcel, readInt27);
                    } else {
                        pendingIntent3 = (PendingIntent) g6.e.g(parcel, readInt27, PendingIntent.CREATOR);
                    }
                }
                g6.e.m(parcel, z58);
                return new i7.l(pendingIntent3);
            case 28:
                int z59 = g6.e.z(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < z59) {
                    int readInt28 = parcel.readInt();
                    if (((char) readInt28) != 1) {
                        g6.e.y(parcel, readInt28);
                    } else {
                        pendingIntent4 = (PendingIntent) g6.e.g(parcel, readInt28, PendingIntent.CREATOR);
                    }
                }
                g6.e.m(parcel, z59);
                return new i7.m(pendingIntent4);
            default:
                int z60 = g6.e.z(parcel);
                while (parcel.dataPosition() < z60) {
                    g6.e.y(parcel, parcel.readInt());
                }
                g6.e.m(parcel, z60);
                return new i7.n();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new b0[i3];
            case 1:
                return new b[i3];
            case 2:
                return new g6.a[i3];
            case 3:
                return new g6.f[i3];
            case 4:
                return new g6.b[i3];
            case 5:
                return new g6.d[i3];
            case 6:
                return new g8.d[i3];
            case 7:
                return new g8.e[i3];
            case 8:
                return new g8.f[i3];
            case 9:
                return new g8.g[i3];
            case 10:
                return new g8.h[i3];
            case 11:
                return new UserAddress[i3];
            case 12:
                return new i6.x[i3];
            case 13:
                return new i6.d[i3];
            case 14:
                return new i6.c[i3];
            case 15:
                return new i7.a[i3];
            case 16:
                return new i7.b[i3];
            case 17:
                return new i7.c[i3];
            case 18:
                return new i7.d[i3];
            case 19:
                return new i7.e[i3];
            case 20:
                return new i7.f[i3];
            case 21:
                return new i7.g[i3];
            case 22:
                return new i7.h[i3];
            case 23:
                return new i7.i[i3];
            case 24:
                return new i7.j[i3];
            case 25:
                return new GetCredentialRequest[i3];
            case 26:
                return new i7.k[i3];
            case 27:
                return new i7.l[i3];
            case 28:
                return new i7.m[i3];
            default:
                return new i7.n[i3];
        }
    }
}
