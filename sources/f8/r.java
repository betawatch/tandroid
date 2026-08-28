package f8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import g7.o8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                int i9 = 0;
                Bundle bundle = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i9 = o8.u(parcel, readInt);
                    } else if (c10 != 3) {
                        o8.y(parcel, readInt);
                    } else {
                        bundle = o8.a(parcel, readInt);
                    }
                }
                o8.m(parcel, z10);
                l lVar = new l();
                new Bundle();
                lVar.a = i9;
                lVar.b = bundle;
                return lVar;
            case 1:
                int z11 = o8.z(parcel);
                String str = null;
                String str2 = null;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        str = o8.h(parcel, readInt2);
                    } else if (c11 == 3) {
                        str2 = o8.h(parcel, readInt2);
                    } else if (c11 == 4) {
                        i10 = o8.u(parcel, readInt2);
                    } else if (c11 != 5) {
                        o8.y(parcel, readInt2);
                    } else {
                        i11 = o8.u(parcel, readInt2);
                    }
                }
                o8.m(parcel, z11);
                return new s(i10, i11, str, str2);
            case 2:
                int z12 = o8.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        o8.y(parcel, readInt3);
                    } else {
                        arrayList = o8.j(parcel, readInt3);
                    }
                }
                o8.m(parcel, z12);
                m mVar = new m();
                mVar.a = arrayList;
                return mVar;
            case 3:
                int z13 = o8.z(parcel);
                int i12 = 0;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        i12 = o8.u(parcel, readInt4);
                    } else if (c12 == 2) {
                        str3 = o8.h(parcel, readInt4);
                    } else if (c12 != 3) {
                        o8.y(parcel, readInt4);
                    } else {
                        str4 = o8.h(parcel, readInt4);
                    }
                }
                o8.m(parcel, z13);
                n nVar = new n();
                nVar.a = i12;
                nVar.b = str3;
                nVar.c = str4;
                return nVar;
            case 4:
                int z14 = o8.z(parcel);
                String str5 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 == 2) {
                        str5 = o8.h(parcel, readInt5);
                    } else if (c13 != 3) {
                        o8.y(parcel, readInt5);
                    } else {
                        bundle2 = o8.a(parcel, readInt5);
                    }
                }
                o8.m(parcel, z14);
                t tVar = new t();
                tVar.a = str5;
                tVar.b = bundle2;
                return tVar;
            case 5:
                int z15 = o8.z(parcel);
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
                boolean z16 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            str6 = o8.h(parcel, readInt6);
                            break;
                        case 3:
                            str7 = o8.h(parcel, readInt6);
                            break;
                        case 4:
                            str8 = o8.h(parcel, readInt6);
                            break;
                        case 5:
                            str9 = o8.h(parcel, readInt6);
                            break;
                        case 6:
                            str10 = o8.h(parcel, readInt6);
                            break;
                        case 7:
                            str11 = o8.h(parcel, readInt6);
                            break;
                        case '\b':
                            str12 = o8.h(parcel, readInt6);
                            break;
                        case '\t':
                            str13 = o8.h(parcel, readInt6);
                            break;
                        case '\n':
                            str14 = o8.h(parcel, readInt6);
                            break;
                        case 11:
                            z16 = o8.n(parcel, readInt6);
                            break;
                        case '\f':
                            str15 = o8.h(parcel, readInt6);
                            break;
                        default:
                            o8.y(parcel, readInt6);
                            break;
                    }
                }
                o8.m(parcel, z15);
                q qVar = new q();
                qVar.a = str6;
                qVar.b = str7;
                qVar.c = str8;
                qVar.d = str9;
                qVar.e = str10;
                qVar.f = str11;
                qVar.h = str12;
                qVar.n = str13;
                qVar.r = str14;
                qVar.s = z16;
                qVar.v = str15;
                return qVar;
            case 6:
                int z17 = o8.z(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                UserAddress userAddress = null;
                int i13 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 1) {
                        str16 = o8.h(parcel, readInt7);
                    } else if (c14 == 2) {
                        str17 = o8.h(parcel, readInt7);
                    } else if (c14 == 3) {
                        str18 = o8.h(parcel, readInt7);
                    } else if (c14 == 4) {
                        i13 = o8.u(parcel, readInt7);
                    } else if (c14 != 5) {
                        o8.y(parcel, readInt7);
                    } else {
                        userAddress = (UserAddress) o8.g(parcel, readInt7, UserAddress.CREATOR);
                    }
                }
                o8.m(parcel, z17);
                b bVar = new b();
                bVar.a = str16;
                bVar.b = str17;
                bVar.c = str18;
                bVar.d = i13;
                bVar.e = userAddress;
                return bVar;
            case 7:
                int z18 = o8.z(parcel);
                ArrayList arrayList2 = null;
                boolean z19 = false;
                int i14 = 0;
                boolean z20 = true;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 1) {
                        arrayList2 = o8.e(parcel, readInt8);
                    } else if (c15 == 2) {
                        z20 = o8.n(parcel, readInt8);
                    } else if (c15 == 3) {
                        z19 = o8.n(parcel, readInt8);
                    } else if (c15 != 4) {
                        o8.y(parcel, readInt8);
                    } else {
                        i14 = o8.u(parcel, readInt8);
                    }
                }
                o8.m(parcel, z18);
                c cVar = new c();
                cVar.a = arrayList2;
                cVar.b = z20;
                cVar.c = z19;
                cVar.d = i14;
                return cVar;
            case 8:
                int z21 = o8.z(parcel);
                String str19 = null;
                String str20 = null;
                s sVar = null;
                String str21 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress2 = null;
                UserAddress userAddress3 = null;
                d[] dVarArr = null;
                k kVar = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str19 = o8.h(parcel, readInt9);
                            break;
                        case 3:
                            str20 = o8.h(parcel, readInt9);
                            break;
                        case 4:
                            sVar = (s) o8.g(parcel, readInt9, s.CREATOR);
                            break;
                        case 5:
                            str21 = o8.h(parcel, readInt9);
                            break;
                        case 6:
                            qVar2 = (q) o8.g(parcel, readInt9, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) o8.g(parcel, readInt9, q.CREATOR);
                            break;
                        case '\b':
                            strArr = o8.i(parcel, readInt9);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) o8.g(parcel, readInt9, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) o8.g(parcel, readInt9, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) o8.k(parcel, readInt9, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) o8.g(parcel, readInt9, k.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt9);
                            break;
                    }
                }
                o8.m(parcel, z21);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str19;
                fullWallet.b = str20;
                fullWallet.c = sVar;
                fullWallet.d = str21;
                fullWallet.e = qVar2;
                fullWallet.f = qVar3;
                fullWallet.h = strArr;
                fullWallet.n = userAddress2;
                fullWallet.r = userAddress3;
                fullWallet.s = dVarArr;
                fullWallet.v = kVar;
                return fullWallet;
            case 9:
                int z22 = o8.z(parcel);
                String str22 = null;
                String str23 = null;
                int i15 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        str22 = o8.h(parcel, readInt10);
                    } else if (c16 == 3) {
                        str23 = o8.h(parcel, readInt10);
                    } else if (c16 != 4) {
                        o8.y(parcel, readInt10);
                    } else {
                        i15 = o8.u(parcel, readInt10);
                    }
                }
                o8.m(parcel, z22);
                d dVar = new d();
                dVar.a = str22;
                dVar.b = str23;
                dVar.c = i15;
                return dVar;
            case 10:
                int z23 = o8.z(parcel);
                ArrayList arrayList3 = null;
                String str24 = null;
                String str25 = null;
                ArrayList arrayList4 = null;
                String str26 = null;
                boolean z24 = false;
                while (parcel.dataPosition() < z23) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            arrayList3 = o8.e(parcel, readInt11);
                            break;
                        case 3:
                        default:
                            o8.y(parcel, readInt11);
                            break;
                        case 4:
                            str24 = o8.h(parcel, readInt11);
                            break;
                        case 5:
                            str25 = o8.h(parcel, readInt11);
                            break;
                        case 6:
                            arrayList4 = o8.e(parcel, readInt11);
                            break;
                        case 7:
                            z24 = o8.n(parcel, readInt11);
                            break;
                        case '\b':
                            str26 = o8.h(parcel, readInt11);
                            break;
                    }
                }
                o8.m(parcel, z23);
                e eVar = new e();
                eVar.a = arrayList3;
                eVar.b = str24;
                eVar.c = str25;
                eVar.d = arrayList4;
                eVar.e = z24;
                eVar.f = str26;
                return eVar;
            case 11:
                int z25 = o8.z(parcel);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str27 = null;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                g8.f fVar = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                g8.c cVar2 = null;
                int i16 = 0;
                boolean z26 = false;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    g8.f fVar2 = fVar;
                    switch ((char) readInt12) {
                        case 2:
                            str27 = o8.h(parcel, readInt12);
                            break;
                        case 3:
                            str30 = o8.h(parcel, readInt12);
                            break;
                        case 4:
                            str31 = o8.h(parcel, readInt12);
                            break;
                        case 5:
                            str32 = o8.h(parcel, readInt12);
                            break;
                        case 6:
                            str33 = o8.h(parcel, readInt12);
                            break;
                        case 7:
                            str34 = o8.h(parcel, readInt12);
                            break;
                        case '\b':
                            str35 = o8.h(parcel, readInt12);
                            break;
                        case '\t':
                            str36 = o8.h(parcel, readInt12);
                            break;
                        case '\n':
                            str29 = o8.h(parcel, readInt12);
                            break;
                        case 11:
                            str28 = o8.h(parcel, readInt12);
                            break;
                        case '\f':
                            i16 = o8.u(parcel, readInt12);
                            break;
                        case '\r':
                            arrayList5 = o8.l(parcel, readInt12, g8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (g8.f) o8.g(parcel, readInt12, g8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList8 = o8.l(parcel, readInt12, LatLng.CREATOR);
                            break;
                        case 16:
                            str37 = o8.h(parcel, readInt12);
                            break;
                        case 17:
                            str38 = o8.h(parcel, readInt12);
                            break;
                        case 18:
                            arrayList9 = o8.l(parcel, readInt12, g8.b.CREATOR);
                            break;
                        case 19:
                            z26 = o8.n(parcel, readInt12);
                            break;
                        case 20:
                            arrayList10 = o8.l(parcel, readInt12, g8.g.CREATOR);
                            break;
                        case 21:
                            arrayList11 = o8.l(parcel, readInt12, g8.e.CREATOR);
                            break;
                        case 22:
                            arrayList12 = o8.l(parcel, readInt12, g8.g.CREATOR);
                            break;
                        case 23:
                            cVar2 = (g8.c) o8.g(parcel, readInt12, g8.c.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt12);
                            break;
                    }
                    fVar = fVar2;
                }
                o8.m(parcel, z25);
                f fVar3 = new f();
                fVar3.a = str27;
                fVar3.b = str30;
                fVar3.c = str31;
                fVar3.d = str32;
                fVar3.e = str33;
                fVar3.f = str34;
                fVar3.h = str35;
                fVar3.n = str36;
                fVar3.r = str29;
                fVar3.s = str28;
                fVar3.v = i16;
                fVar3.w = arrayList5;
                fVar3.x = fVar;
                fVar3.y = arrayList8;
                fVar3.A = str37;
                fVar3.B = str38;
                fVar3.C = arrayList9;
                fVar3.D = z26;
                fVar3.E = arrayList10;
                fVar3.F = arrayList11;
                fVar3.G = arrayList12;
                fVar3.H = cVar2;
                return fVar3;
            case 12:
                int z27 = o8.z(parcel);
                String str39 = null;
                String str40 = null;
                String[] strArr2 = null;
                String str41 = null;
                q qVar4 = null;
                q qVar5 = null;
                f[] fVarArr = null;
                g[] gVarArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                d[] dVarArr2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str39 = o8.h(parcel, readInt13);
                            break;
                        case 3:
                            str40 = o8.h(parcel, readInt13);
                            break;
                        case 4:
                            strArr2 = o8.i(parcel, readInt13);
                            break;
                        case 5:
                            str41 = o8.h(parcel, readInt13);
                            break;
                        case 6:
                            qVar4 = (q) o8.g(parcel, readInt13, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) o8.g(parcel, readInt13, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) o8.k(parcel, readInt13, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) o8.k(parcel, readInt13, g.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) o8.g(parcel, readInt13, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) o8.g(parcel, readInt13, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) o8.k(parcel, readInt13, d.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt13);
                            break;
                    }
                }
                o8.m(parcel, z27);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str39;
                maskedWallet.b = str40;
                maskedWallet.c = strArr2;
                maskedWallet.d = str41;
                maskedWallet.e = qVar4;
                maskedWallet.f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress4;
                maskedWallet.s = userAddress5;
                maskedWallet.v = dVarArr2;
                return maskedWallet;
            case 13:
                int z28 = o8.z(parcel);
                int i17 = 0;
                String str42 = null;
                String str43 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 1) {
                        i17 = o8.u(parcel, readInt14);
                    } else if (c17 == 2) {
                        str42 = o8.h(parcel, readInt14);
                    } else if (c17 == 3) {
                        str43 = o8.h(parcel, readInt14);
                    } else if (c17 != 4) {
                        o8.y(parcel, readInt14);
                    } else {
                        commonWalletObject = (CommonWalletObject) o8.g(parcel, readInt14, CommonWalletObject.CREATOR);
                    }
                }
                o8.m(parcel, z28);
                return new g(i17, str42, str43, commonWalletObject);
            case 14:
                int z29 = o8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z29) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        o8.y(parcel, readInt15);
                    } else {
                        pendingIntent = (PendingIntent) o8.g(parcel, readInt15, PendingIntent.CREATOR);
                    }
                }
                o8.m(parcel, z29);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 15:
                return new g4.a(parcel);
            case 16:
                return new g4.e(parcel);
            case 17:
                return new g4.f();
            case 18:
                return new g4.i(parcel);
            case 19:
                return new g4.j(parcel.readLong(), parcel.readLong());
            case 20:
                int z30 = o8.z(parcel);
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                String str44 = null;
                ArrayList arrayList16 = arrayList15;
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                String str45 = null;
                String str46 = null;
                g8.f fVar4 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                String str51 = null;
                String str52 = null;
                String str53 = null;
                int i18 = 0;
                boolean z31 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    String str54 = str46;
                    switch ((char) readInt16) {
                        case 2:
                            str44 = o8.h(parcel, readInt16);
                            break;
                        case 3:
                            str47 = o8.h(parcel, readInt16);
                            break;
                        case 4:
                            str48 = o8.h(parcel, readInt16);
                            break;
                        case 5:
                            str49 = o8.h(parcel, readInt16);
                            break;
                        case 6:
                            str50 = o8.h(parcel, readInt16);
                            break;
                        case 7:
                            str51 = o8.h(parcel, readInt16);
                            break;
                        case '\b':
                            str52 = o8.h(parcel, readInt16);
                            break;
                        case '\t':
                            str45 = o8.h(parcel, readInt16);
                            break;
                        case '\n':
                            i18 = o8.u(parcel, readInt16);
                            break;
                        case 11:
                            arrayList13 = o8.l(parcel, readInt16, g8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (g8.f) o8.g(parcel, readInt16, g8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList14 = o8.l(parcel, readInt16, LatLng.CREATOR);
                            break;
                        case 14:
                            str46 = o8.h(parcel, readInt16);
                            continue;
                        case 15:
                            str53 = o8.h(parcel, readInt16);
                            break;
                        case 16:
                            arrayList16 = o8.l(parcel, readInt16, g8.b.CREATOR);
                            break;
                        case 17:
                            z31 = o8.n(parcel, readInt16);
                            break;
                        case 18:
                            arrayList17 = o8.l(parcel, readInt16, g8.g.CREATOR);
                            break;
                        case 19:
                            arrayList18 = o8.l(parcel, readInt16, g8.e.CREATOR);
                            break;
                        case 20:
                            arrayList19 = o8.l(parcel, readInt16, g8.g.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt16);
                            break;
                    }
                    str46 = str54;
                }
                o8.m(parcel, z30);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.a = str44;
                commonWalletObject2.b = str47;
                commonWalletObject2.c = str48;
                commonWalletObject2.d = str49;
                commonWalletObject2.e = str50;
                commonWalletObject2.f = str51;
                commonWalletObject2.h = str52;
                commonWalletObject2.n = str45;
                commonWalletObject2.r = i18;
                commonWalletObject2.s = arrayList13;
                commonWalletObject2.v = fVar4;
                commonWalletObject2.w = arrayList14;
                commonWalletObject2.x = str46;
                commonWalletObject2.y = str53;
                commonWalletObject2.A = arrayList16;
                commonWalletObject2.B = z31;
                commonWalletObject2.C = arrayList17;
                commonWalletObject2.D = arrayList18;
                commonWalletObject2.E = arrayList19;
                return commonWalletObject2;
            case 21:
                int z32 = o8.z(parcel);
                String str55 = null;
                String str56 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        str55 = o8.h(parcel, readInt17);
                    } else if (c18 != 3) {
                        o8.y(parcel, readInt17);
                    } else {
                        str56 = o8.h(parcel, readInt17);
                    }
                }
                o8.m(parcel, z32);
                g8.a aVar = new g8.a();
                aVar.a = str55;
                aVar.b = str56;
                return aVar;
            case 22:
                int z33 = o8.z(parcel);
                ArrayList arrayList20 = new ArrayList();
                String str57 = null;
                String str58 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 2) {
                        str57 = o8.h(parcel, readInt18);
                    } else if (c19 == 3) {
                        str58 = o8.h(parcel, readInt18);
                    } else if (c19 != 4) {
                        o8.y(parcel, readInt18);
                    } else {
                        arrayList20 = o8.l(parcel, readInt18, g8.a.CREATOR);
                    }
                }
                o8.m(parcel, z33);
                g8.b bVar2 = new g8.b();
                bVar2.a = str57;
                bVar2.b = str58;
                bVar2.c = arrayList20;
                return bVar2;
            case 23:
                int z34 = o8.z(parcel);
                int i19 = 0;
                String str59 = null;
                long j10 = 0;
                int i20 = -1;
                double d = 0.0d;
                String str60 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            i19 = o8.u(parcel, readInt19);
                            break;
                        case 3:
                            str59 = o8.h(parcel, readInt19);
                            break;
                        case 4:
                            d = o8.q(parcel, readInt19);
                            break;
                        case 5:
                            str60 = o8.h(parcel, readInt19);
                            break;
                        case 6:
                            j10 = o8.w(parcel, readInt19);
                            break;
                        case 7:
                            i20 = o8.u(parcel, readInt19);
                            break;
                        default:
                            o8.y(parcel, readInt19);
                            break;
                    }
                }
                o8.m(parcel, z34);
                g8.d dVar2 = new g8.d();
                dVar2.a = i19;
                dVar2.b = str59;
                dVar2.c = d;
                dVar2.d = str60;
                dVar2.e = j10;
                dVar2.f = i20;
                return dVar2;
            case 24:
                int z35 = o8.z(parcel);
                String str61 = null;
                g8.d dVar3 = null;
                g8.f fVar5 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 2) {
                        str61 = o8.h(parcel, readInt20);
                    } else if (c20 == 3) {
                        dVar3 = (g8.d) o8.g(parcel, readInt20, g8.d.CREATOR);
                    } else if (c20 != 5) {
                        o8.y(parcel, readInt20);
                    } else {
                        fVar5 = (g8.f) o8.g(parcel, readInt20, g8.f.CREATOR);
                    }
                }
                o8.m(parcel, z35);
                g8.c cVar3 = new g8.c();
                cVar3.a = str61;
                cVar3.b = dVar3;
                cVar3.c = fVar5;
                return cVar3;
            case 25:
                int z36 = o8.z(parcel);
                String str62 = null;
                String str63 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 2) {
                        str62 = o8.h(parcel, readInt21);
                    } else if (c21 != 3) {
                        o8.y(parcel, readInt21);
                    } else {
                        str63 = o8.h(parcel, readInt21);
                    }
                }
                o8.m(parcel, z36);
                g8.e eVar2 = new g8.e();
                eVar2.a = str62;
                eVar2.b = str63;
                return eVar2;
            case 26:
                int z37 = o8.z(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z37) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 2) {
                        j11 = o8.w(parcel, readInt22);
                    } else if (c22 != 3) {
                        o8.y(parcel, readInt22);
                    } else {
                        j12 = o8.w(parcel, readInt22);
                    }
                }
                o8.m(parcel, z37);
                g8.f fVar6 = new g8.f();
                fVar6.a = j11;
                fVar6.b = j12;
                return fVar6;
            case 27:
                int z38 = o8.z(parcel);
                String str64 = null;
                String str65 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 2) {
                        str64 = o8.h(parcel, readInt23);
                    } else if (c23 != 3) {
                        o8.y(parcel, readInt23);
                    } else {
                        str65 = o8.h(parcel, readInt23);
                    }
                }
                o8.m(parcel, z38);
                g8.g gVar = new g8.g();
                gVar.a = str64;
                gVar.b = str65;
                return gVar;
            case 28:
                int z39 = o8.z(parcel);
                String str66 = null;
                String str67 = null;
                g8.f fVar7 = null;
                g8.g gVar2 = null;
                g8.g gVar3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt24 = parcel.readInt();
                    char c24 = (char) readInt24;
                    if (c24 == 2) {
                        str66 = o8.h(parcel, readInt24);
                    } else if (c24 == 3) {
                        str67 = o8.h(parcel, readInt24);
                    } else if (c24 == 4) {
                        fVar7 = (g8.f) o8.g(parcel, readInt24, g8.f.CREATOR);
                    } else if (c24 == 5) {
                        gVar2 = (g8.g) o8.g(parcel, readInt24, g8.g.CREATOR);
                    } else if (c24 != 6) {
                        o8.y(parcel, readInt24);
                    } else {
                        gVar3 = (g8.g) o8.g(parcel, readInt24, g8.g.CREATOR);
                    }
                }
                o8.m(parcel, z39);
                g8.h hVar2 = new g8.h();
                hVar2.a = str66;
                hVar2.b = str67;
                hVar2.c = fVar7;
                hVar2.d = gVar2;
                hVar2.e = gVar3;
                return hVar2;
            default:
                return new h4.a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new l[i9];
            case 1:
                return new s[i9];
            case 2:
                return new m[i9];
            case 3:
                return new n[i9];
            case 4:
                return new t[i9];
            case 5:
                return new q[i9];
            case 6:
                return new b[i9];
            case 7:
                return new c[i9];
            case 8:
                return new FullWallet[i9];
            case 9:
                return new d[i9];
            case 10:
                return new e[i9];
            case 11:
                return new f[i9];
            case 12:
                return new MaskedWallet[i9];
            case 13:
                return new g[i9];
            case 14:
                return new h[i9];
            case 15:
                return new g4.a[i9];
            case 16:
                return new g4.e[i9];
            case 17:
                return new g4.f[i9];
            case 18:
                return new g4.i[i9];
            case 19:
                return new g4.j[i9];
            case 20:
                return new CommonWalletObject[i9];
            case 21:
                return new g8.a[i9];
            case 22:
                return new g8.b[i9];
            case 23:
                return new g8.d[i9];
            case 24:
                return new g8.c[i9];
            case 25:
                return new g8.e[i9];
            case 26:
                return new g8.f[i9];
            case 27:
                return new g8.g[i9];
            case 28:
                return new g8.h[i9];
            default:
                return new h4.a[i9];
        }
    }
}
