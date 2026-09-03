package j8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z4 = f5.z(parcel);
                String str = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        str = f5.h(parcel, readInt);
                    } else if (c3 != 3) {
                        f5.y(parcel, readInt);
                    } else {
                        bundle = f5.a(parcel, readInt);
                    }
                }
                f5.m(parcel, z4);
                s sVar = new s();
                sVar.a = str;
                sVar.b = bundle;
                return sVar;
            case 1:
                int z10 = f5.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str2 = f5.h(parcel, readInt2);
                            break;
                        case 3:
                            str3 = f5.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = f5.h(parcel, readInt2);
                            break;
                        case 5:
                            str5 = f5.h(parcel, readInt2);
                            break;
                        case 6:
                            str6 = f5.h(parcel, readInt2);
                            break;
                        case 7:
                            str7 = f5.h(parcel, readInt2);
                            break;
                        case '\b':
                            str8 = f5.h(parcel, readInt2);
                            break;
                        case '\t':
                            str9 = f5.h(parcel, readInt2);
                            break;
                        case '\n':
                            str10 = f5.h(parcel, readInt2);
                            break;
                        case 11:
                            z11 = f5.n(parcel, readInt2);
                            break;
                        case '\f':
                            str11 = f5.h(parcel, readInt2);
                            break;
                        default:
                            f5.y(parcel, readInt2);
                            break;
                    }
                }
                f5.m(parcel, z10);
                q qVar = new q();
                qVar.a = str2;
                qVar.b = str3;
                qVar.c = str4;
                qVar.d = str5;
                qVar.e = str6;
                qVar.f = str7;
                qVar.h = str8;
                qVar.n = str9;
                qVar.r = str10;
                qVar.s = z11;
                qVar.v = str11;
                return qVar;
            case 2:
                int z12 = f5.z(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                UserAddress userAddress = null;
                int i10 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        str12 = f5.h(parcel, readInt3);
                    } else if (c10 == 2) {
                        str13 = f5.h(parcel, readInt3);
                    } else if (c10 == 3) {
                        str14 = f5.h(parcel, readInt3);
                    } else if (c10 == 4) {
                        i10 = f5.u(parcel, readInt3);
                    } else if (c10 != 5) {
                        f5.y(parcel, readInt3);
                    } else {
                        userAddress = (UserAddress) f5.g(parcel, readInt3, UserAddress.CREATOR);
                    }
                }
                f5.m(parcel, z12);
                b bVar = new b();
                bVar.a = str12;
                bVar.b = str13;
                bVar.c = str14;
                bVar.d = i10;
                bVar.e = userAddress;
                return bVar;
            case 3:
                int z13 = f5.z(parcel);
                ArrayList arrayList = null;
                boolean z14 = false;
                int i11 = 0;
                boolean z15 = true;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        arrayList = f5.e(parcel, readInt4);
                    } else if (c11 == 2) {
                        z15 = f5.n(parcel, readInt4);
                    } else if (c11 == 3) {
                        z14 = f5.n(parcel, readInt4);
                    } else if (c11 != 4) {
                        f5.y(parcel, readInt4);
                    } else {
                        i11 = f5.u(parcel, readInt4);
                    }
                }
                f5.m(parcel, z13);
                c cVar = new c();
                cVar.a = arrayList;
                cVar.b = z15;
                cVar.c = z14;
                cVar.d = i11;
                return cVar;
            case 4:
                int z16 = f5.z(parcel);
                String str15 = null;
                String str16 = null;
                r rVar = null;
                String str17 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress2 = null;
                UserAddress userAddress3 = null;
                d[] dVarArr = null;
                k kVar = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str15 = f5.h(parcel, readInt5);
                            break;
                        case 3:
                            str16 = f5.h(parcel, readInt5);
                            break;
                        case 4:
                            rVar = (r) f5.g(parcel, readInt5, r.CREATOR);
                            break;
                        case 5:
                            str17 = f5.h(parcel, readInt5);
                            break;
                        case 6:
                            qVar2 = (q) f5.g(parcel, readInt5, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) f5.g(parcel, readInt5, q.CREATOR);
                            break;
                        case '\b':
                            strArr = f5.i(parcel, readInt5);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) f5.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) f5.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) f5.k(parcel, readInt5, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) f5.g(parcel, readInt5, k.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt5);
                            break;
                    }
                }
                f5.m(parcel, z16);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str15;
                fullWallet.b = str16;
                fullWallet.c = rVar;
                fullWallet.d = str17;
                fullWallet.e = qVar2;
                fullWallet.f = qVar3;
                fullWallet.h = strArr;
                fullWallet.n = userAddress2;
                fullWallet.r = userAddress3;
                fullWallet.s = dVarArr;
                fullWallet.v = kVar;
                return fullWallet;
            case 5:
                int z17 = f5.z(parcel);
                String str18 = null;
                String str19 = null;
                int i12 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 2) {
                        str18 = f5.h(parcel, readInt6);
                    } else if (c12 == 3) {
                        str19 = f5.h(parcel, readInt6);
                    } else if (c12 != 4) {
                        f5.y(parcel, readInt6);
                    } else {
                        i12 = f5.u(parcel, readInt6);
                    }
                }
                f5.m(parcel, z17);
                d dVar = new d();
                dVar.a = str18;
                dVar.b = str19;
                dVar.c = i12;
                return dVar;
            case 6:
                int z18 = f5.z(parcel);
                ArrayList arrayList2 = null;
                String str20 = null;
                String str21 = null;
                ArrayList arrayList3 = null;
                String str22 = null;
                boolean z19 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            arrayList2 = f5.e(parcel, readInt7);
                            break;
                        case 3:
                        default:
                            f5.y(parcel, readInt7);
                            break;
                        case 4:
                            str20 = f5.h(parcel, readInt7);
                            break;
                        case 5:
                            str21 = f5.h(parcel, readInt7);
                            break;
                        case 6:
                            arrayList3 = f5.e(parcel, readInt7);
                            break;
                        case 7:
                            z19 = f5.n(parcel, readInt7);
                            break;
                        case '\b':
                            str22 = f5.h(parcel, readInt7);
                            break;
                    }
                }
                f5.m(parcel, z18);
                e eVar = new e();
                eVar.a = arrayList2;
                eVar.b = str20;
                eVar.c = str21;
                eVar.d = arrayList3;
                eVar.e = z19;
                eVar.f = str22;
                return eVar;
            case 7:
                int z20 = f5.z(parcel);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String str23 = null;
                ArrayList arrayList7 = arrayList5;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                k8.f fVar = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                k8.c cVar2 = null;
                int i13 = 0;
                boolean z21 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    k8.f fVar2 = fVar;
                    switch ((char) readInt8) {
                        case 2:
                            str23 = f5.h(parcel, readInt8);
                            break;
                        case 3:
                            str26 = f5.h(parcel, readInt8);
                            break;
                        case 4:
                            str27 = f5.h(parcel, readInt8);
                            break;
                        case 5:
                            str28 = f5.h(parcel, readInt8);
                            break;
                        case 6:
                            str29 = f5.h(parcel, readInt8);
                            break;
                        case 7:
                            str30 = f5.h(parcel, readInt8);
                            break;
                        case '\b':
                            str31 = f5.h(parcel, readInt8);
                            break;
                        case '\t':
                            str32 = f5.h(parcel, readInt8);
                            break;
                        case '\n':
                            str25 = f5.h(parcel, readInt8);
                            break;
                        case 11:
                            str24 = f5.h(parcel, readInt8);
                            break;
                        case '\f':
                            i13 = f5.u(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList4 = f5.l(parcel, readInt8, k8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (k8.f) f5.g(parcel, readInt8, k8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList7 = f5.l(parcel, readInt8, LatLng.CREATOR);
                            break;
                        case 16:
                            str33 = f5.h(parcel, readInt8);
                            break;
                        case 17:
                            str34 = f5.h(parcel, readInt8);
                            break;
                        case 18:
                            arrayList8 = f5.l(parcel, readInt8, k8.b.CREATOR);
                            break;
                        case 19:
                            z21 = f5.n(parcel, readInt8);
                            break;
                        case 20:
                            arrayList9 = f5.l(parcel, readInt8, k8.g.CREATOR);
                            break;
                        case 21:
                            arrayList10 = f5.l(parcel, readInt8, k8.e.CREATOR);
                            break;
                        case 22:
                            arrayList11 = f5.l(parcel, readInt8, k8.g.CREATOR);
                            break;
                        case 23:
                            cVar2 = (k8.c) f5.g(parcel, readInt8, k8.c.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt8);
                            break;
                    }
                    fVar = fVar2;
                }
                f5.m(parcel, z20);
                f fVar3 = new f();
                fVar3.a = str23;
                fVar3.b = str26;
                fVar3.c = str27;
                fVar3.d = str28;
                fVar3.e = str29;
                fVar3.f = str30;
                fVar3.h = str31;
                fVar3.n = str32;
                fVar3.r = str25;
                fVar3.s = str24;
                fVar3.v = i13;
                fVar3.w = arrayList4;
                fVar3.x = fVar;
                fVar3.y = arrayList7;
                fVar3.B = str33;
                fVar3.C = str34;
                fVar3.D = arrayList8;
                fVar3.E = z21;
                fVar3.F = arrayList9;
                fVar3.G = arrayList10;
                fVar3.H = arrayList11;
                fVar3.I = cVar2;
                return fVar3;
            case 8:
                int z22 = f5.z(parcel);
                String str35 = null;
                String str36 = null;
                String[] strArr2 = null;
                String str37 = null;
                q qVar4 = null;
                q qVar5 = null;
                f[] fVarArr = null;
                g[] gVarArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                d[] dVarArr2 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str35 = f5.h(parcel, readInt9);
                            break;
                        case 3:
                            str36 = f5.h(parcel, readInt9);
                            break;
                        case 4:
                            strArr2 = f5.i(parcel, readInt9);
                            break;
                        case 5:
                            str37 = f5.h(parcel, readInt9);
                            break;
                        case 6:
                            qVar4 = (q) f5.g(parcel, readInt9, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) f5.g(parcel, readInt9, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) f5.k(parcel, readInt9, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) f5.k(parcel, readInt9, g.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) f5.g(parcel, readInt9, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) f5.g(parcel, readInt9, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) f5.k(parcel, readInt9, d.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt9);
                            break;
                    }
                }
                f5.m(parcel, z22);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str35;
                maskedWallet.b = str36;
                maskedWallet.c = strArr2;
                maskedWallet.d = str37;
                maskedWallet.e = qVar4;
                maskedWallet.f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress4;
                maskedWallet.s = userAddress5;
                maskedWallet.v = dVarArr2;
                return maskedWallet;
            case 9:
                int z23 = f5.z(parcel);
                int i14 = 0;
                String str38 = null;
                String str39 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 1) {
                        i14 = f5.u(parcel, readInt10);
                    } else if (c13 == 2) {
                        str38 = f5.h(parcel, readInt10);
                    } else if (c13 == 3) {
                        str39 = f5.h(parcel, readInt10);
                    } else if (c13 != 4) {
                        f5.y(parcel, readInt10);
                    } else {
                        commonWalletObject = (CommonWalletObject) f5.g(parcel, readInt10, CommonWalletObject.CREATOR);
                    }
                }
                f5.m(parcel, z23);
                return new g(i14, str38, str39, commonWalletObject);
            case 10:
                int z24 = f5.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        f5.y(parcel, readInt11);
                    } else {
                        pendingIntent = (PendingIntent) f5.g(parcel, readInt11, PendingIntent.CREATOR);
                    }
                }
                f5.m(parcel, z24);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 11:
                return new k4.a(parcel);
            case 12:
                return new k4.b(parcel);
            case 13:
                ArrayList arrayList12 = new ArrayList();
                parcel.readList(arrayList12, k4.c.class.getClassLoader());
                return new k4.d(arrayList12);
            case 14:
                return new k4.c(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 15:
                return new k4.e(parcel);
            case 16:
                int z25 = f5.z(parcel);
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                String str40 = null;
                ArrayList arrayList16 = arrayList15;
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                String str41 = null;
                String str42 = null;
                k8.f fVar4 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                int i15 = 0;
                boolean z26 = false;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    String str50 = str42;
                    switch ((char) readInt12) {
                        case 2:
                            str40 = f5.h(parcel, readInt12);
                            break;
                        case 3:
                            str43 = f5.h(parcel, readInt12);
                            break;
                        case 4:
                            str44 = f5.h(parcel, readInt12);
                            break;
                        case 5:
                            str45 = f5.h(parcel, readInt12);
                            break;
                        case 6:
                            str46 = f5.h(parcel, readInt12);
                            break;
                        case 7:
                            str47 = f5.h(parcel, readInt12);
                            break;
                        case '\b':
                            str48 = f5.h(parcel, readInt12);
                            break;
                        case '\t':
                            str41 = f5.h(parcel, readInt12);
                            break;
                        case '\n':
                            i15 = f5.u(parcel, readInt12);
                            break;
                        case 11:
                            arrayList13 = f5.l(parcel, readInt12, k8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (k8.f) f5.g(parcel, readInt12, k8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList14 = f5.l(parcel, readInt12, LatLng.CREATOR);
                            break;
                        case 14:
                            str42 = f5.h(parcel, readInt12);
                            continue;
                        case 15:
                            str49 = f5.h(parcel, readInt12);
                            break;
                        case 16:
                            arrayList16 = f5.l(parcel, readInt12, k8.b.CREATOR);
                            break;
                        case 17:
                            z26 = f5.n(parcel, readInt12);
                            break;
                        case 18:
                            arrayList17 = f5.l(parcel, readInt12, k8.g.CREATOR);
                            break;
                        case 19:
                            arrayList18 = f5.l(parcel, readInt12, k8.e.CREATOR);
                            break;
                        case 20:
                            arrayList19 = f5.l(parcel, readInt12, k8.g.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt12);
                            break;
                    }
                    str42 = str50;
                }
                f5.m(parcel, z25);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.a = str40;
                commonWalletObject2.b = str43;
                commonWalletObject2.c = str44;
                commonWalletObject2.d = str45;
                commonWalletObject2.e = str46;
                commonWalletObject2.f = str47;
                commonWalletObject2.h = str48;
                commonWalletObject2.n = str41;
                commonWalletObject2.r = i15;
                commonWalletObject2.s = arrayList13;
                commonWalletObject2.v = fVar4;
                commonWalletObject2.w = arrayList14;
                commonWalletObject2.x = str42;
                commonWalletObject2.y = str49;
                commonWalletObject2.B = arrayList16;
                commonWalletObject2.C = z26;
                commonWalletObject2.D = arrayList17;
                commonWalletObject2.E = arrayList18;
                commonWalletObject2.F = arrayList19;
                return commonWalletObject2;
            case 17:
                int z27 = f5.z(parcel);
                String str51 = null;
                String str52 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 2) {
                        str51 = f5.h(parcel, readInt13);
                    } else if (c14 != 3) {
                        f5.y(parcel, readInt13);
                    } else {
                        str52 = f5.h(parcel, readInt13);
                    }
                }
                f5.m(parcel, z27);
                k8.a aVar = new k8.a();
                aVar.a = str51;
                aVar.b = str52;
                return aVar;
            case 18:
                int z28 = f5.z(parcel);
                ArrayList arrayList20 = new ArrayList();
                String str53 = null;
                String str54 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 2) {
                        str53 = f5.h(parcel, readInt14);
                    } else if (c15 == 3) {
                        str54 = f5.h(parcel, readInt14);
                    } else if (c15 != 4) {
                        f5.y(parcel, readInt14);
                    } else {
                        arrayList20 = f5.l(parcel, readInt14, k8.a.CREATOR);
                    }
                }
                f5.m(parcel, z28);
                k8.b bVar2 = new k8.b();
                bVar2.a = str53;
                bVar2.b = str54;
                bVar2.c = arrayList20;
                return bVar2;
            case 19:
                int z29 = f5.z(parcel);
                int i16 = 0;
                String str55 = null;
                long j10 = 0;
                int i17 = -1;
                double d = 0.0d;
                String str56 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            i16 = f5.u(parcel, readInt15);
                            break;
                        case 3:
                            str55 = f5.h(parcel, readInt15);
                            break;
                        case 4:
                            d = f5.q(parcel, readInt15);
                            break;
                        case 5:
                            str56 = f5.h(parcel, readInt15);
                            break;
                        case 6:
                            j10 = f5.w(parcel, readInt15);
                            break;
                        case 7:
                            i17 = f5.u(parcel, readInt15);
                            break;
                        default:
                            f5.y(parcel, readInt15);
                            break;
                    }
                }
                f5.m(parcel, z29);
                k8.d dVar2 = new k8.d();
                dVar2.a = i16;
                dVar2.b = str55;
                dVar2.c = d;
                dVar2.d = str56;
                dVar2.e = j10;
                dVar2.f = i17;
                return dVar2;
            case 20:
                int z30 = f5.z(parcel);
                String str57 = null;
                k8.d dVar3 = null;
                k8.f fVar5 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 2) {
                        str57 = f5.h(parcel, readInt16);
                    } else if (c16 == 3) {
                        dVar3 = (k8.d) f5.g(parcel, readInt16, k8.d.CREATOR);
                    } else if (c16 != 5) {
                        f5.y(parcel, readInt16);
                    } else {
                        fVar5 = (k8.f) f5.g(parcel, readInt16, k8.f.CREATOR);
                    }
                }
                f5.m(parcel, z30);
                k8.c cVar3 = new k8.c();
                cVar3.a = str57;
                cVar3.b = dVar3;
                cVar3.c = fVar5;
                return cVar3;
            case 21:
                int z31 = f5.z(parcel);
                String str58 = null;
                String str59 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 2) {
                        str58 = f5.h(parcel, readInt17);
                    } else if (c17 != 3) {
                        f5.y(parcel, readInt17);
                    } else {
                        str59 = f5.h(parcel, readInt17);
                    }
                }
                f5.m(parcel, z31);
                k8.e eVar2 = new k8.e();
                eVar2.a = str58;
                eVar2.b = str59;
                return eVar2;
            case 22:
                int z32 = f5.z(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt18 = parcel.readInt();
                    char c18 = (char) readInt18;
                    if (c18 == 2) {
                        j11 = f5.w(parcel, readInt18);
                    } else if (c18 != 3) {
                        f5.y(parcel, readInt18);
                    } else {
                        j12 = f5.w(parcel, readInt18);
                    }
                }
                f5.m(parcel, z32);
                k8.f fVar6 = new k8.f();
                fVar6.a = j11;
                fVar6.b = j12;
                return fVar6;
            case 23:
                int z33 = f5.z(parcel);
                String str60 = null;
                String str61 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        str60 = f5.h(parcel, readInt19);
                    } else if (c19 != 3) {
                        f5.y(parcel, readInt19);
                    } else {
                        str61 = f5.h(parcel, readInt19);
                    }
                }
                f5.m(parcel, z33);
                k8.g gVar = new k8.g();
                gVar.a = str60;
                gVar.b = str61;
                return gVar;
            case 24:
                int z34 = f5.z(parcel);
                String str62 = null;
                String str63 = null;
                k8.f fVar7 = null;
                k8.g gVar2 = null;
                k8.g gVar3 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 2) {
                        str62 = f5.h(parcel, readInt20);
                    } else if (c20 == 3) {
                        str63 = f5.h(parcel, readInt20);
                    } else if (c20 == 4) {
                        fVar7 = (k8.f) f5.g(parcel, readInt20, k8.f.CREATOR);
                    } else if (c20 == 5) {
                        gVar2 = (k8.g) f5.g(parcel, readInt20, k8.g.CREATOR);
                    } else if (c20 != 6) {
                        f5.y(parcel, readInt20);
                    } else {
                        gVar3 = (k8.g) f5.g(parcel, readInt20, k8.g.CREATOR);
                    }
                }
                f5.m(parcel, z34);
                k8.h hVar2 = new k8.h();
                hVar2.a = str62;
                hVar2.b = str63;
                hVar2.c = fVar7;
                hVar2.d = gVar2;
                hVar2.e = gVar3;
                return hVar2;
            case 25:
                return new ParcelImpl(parcel);
            case 26:
                return new l4.a(parcel);
            case 27:
                return new l4.e(parcel);
            case 28:
                return new l4.f();
            default:
                return new l4.i(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new s[i10];
            case 1:
                return new q[i10];
            case 2:
                return new b[i10];
            case 3:
                return new c[i10];
            case 4:
                return new FullWallet[i10];
            case 5:
                return new d[i10];
            case 6:
                return new e[i10];
            case 7:
                return new f[i10];
            case 8:
                return new MaskedWallet[i10];
            case 9:
                return new g[i10];
            case 10:
                return new h[i10];
            case 11:
                return new k4.a[i10];
            case 12:
                return new k4.b[i10];
            case 13:
                return new k4.d[i10];
            case 14:
                return new k4.c[i10];
            case 15:
                return new k4.e[i10];
            case 16:
                return new CommonWalletObject[i10];
            case 17:
                return new k8.a[i10];
            case 18:
                return new k8.b[i10];
            case 19:
                return new k8.d[i10];
            case 20:
                return new k8.c[i10];
            case 21:
                return new k8.e[i10];
            case 22:
                return new k8.f[i10];
            case 23:
                return new k8.g[i10];
            case 24:
                return new k8.h[i10];
            case 25:
                return new ParcelImpl[i10];
            case 26:
                return new l4.a[i10];
            case 27:
                return new l4.e[i10];
            case 28:
                return new l4.f[i10];
            default:
                return new l4.i[i10];
        }
    }
}
