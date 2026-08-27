package f4;

import android.app.PendingIntent;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import g4.i;
import g4.j;
import g8.k;
import g8.l;
import g8.m;
import g8.n;
import g8.q;
import g8.r;
import g8.s;
import h7.q8;
import h8.g;
import h8.h;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new f(parcel);
            case 1:
                int z10 = q8.z(parcel);
                PointF[] pointFArr = null;
                int i10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        pointFArr = (PointF[]) q8.k(parcel, readInt, PointF.CREATOR);
                    } else if (c10 != 3) {
                        q8.y(parcel, readInt);
                    } else {
                        i10 = q8.u(parcel, readInt);
                    }
                }
                q8.m(parcel, z10);
                return new f8.a(pointFArr, i10);
            case 2:
                int z11 = q8.z(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                f8.a[] aVarArr = null;
                int i11 = 0;
                int i12 = 0;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                float f14 = Float.MAX_VALUE;
                float f15 = Float.MAX_VALUE;
                float f16 = Float.MAX_VALUE;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = -1.0f;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = q8.u(parcel, readInt2);
                            break;
                        case 2:
                            i12 = q8.u(parcel, readInt2);
                            break;
                        case 3:
                            f10 = q8.r(parcel, readInt2);
                            break;
                        case 4:
                            f11 = q8.r(parcel, readInt2);
                            break;
                        case 5:
                            f12 = q8.r(parcel, readInt2);
                            break;
                        case 6:
                            f13 = q8.r(parcel, readInt2);
                            break;
                        case 7:
                            f14 = q8.r(parcel, readInt2);
                            break;
                        case '\b':
                            f15 = q8.r(parcel, readInt2);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) q8.k(parcel, readInt2, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f17 = q8.r(parcel, readInt2);
                            break;
                        case 11:
                            f18 = q8.r(parcel, readInt2);
                            break;
                        case '\f':
                            f19 = q8.r(parcel, readInt2);
                            break;
                        case '\r':
                            aVarArr = (f8.a[]) q8.k(parcel, readInt2, f8.a.CREATOR);
                            break;
                        case 14:
                            f16 = q8.r(parcel, readInt2);
                            break;
                        case 15:
                            f20 = q8.r(parcel, readInt2);
                            break;
                        default:
                            q8.y(parcel, readInt2);
                            break;
                    }
                }
                q8.m(parcel, z11);
                return new FaceParcel(i11, i12, f10, f11, f12, f13, f14, f15, f16, landmarkParcelArr, f17, f18, f19, aVarArr, f20);
            case 3:
                int z12 = q8.z(parcel);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z13 = false;
                boolean z14 = false;
                float f21 = -1.0f;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            i13 = q8.u(parcel, readInt3);
                            break;
                        case 3:
                            i14 = q8.u(parcel, readInt3);
                            break;
                        case 4:
                            i15 = q8.u(parcel, readInt3);
                            break;
                        case 5:
                            z13 = q8.n(parcel, readInt3);
                            break;
                        case 6:
                            z14 = q8.n(parcel, readInt3);
                            break;
                        case 7:
                            f21 = q8.r(parcel, readInt3);
                            break;
                        default:
                            q8.y(parcel, readInt3);
                            break;
                    }
                }
                q8.m(parcel, z12);
                f8.b bVar = new f8.b();
                bVar.a = i13;
                bVar.b = i14;
                bVar.c = i15;
                bVar.d = z13;
                bVar.e = z14;
                bVar.f = f21;
                return bVar;
            case 4:
                int z15 = q8.z(parcel);
                int i16 = 0;
                int i17 = 0;
                float f22 = 0.0f;
                float f23 = 0.0f;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i16 = q8.u(parcel, readInt4);
                    } else if (c11 == 2) {
                        f22 = q8.r(parcel, readInt4);
                    } else if (c11 == 3) {
                        f23 = q8.r(parcel, readInt4);
                    } else if (c11 != 4) {
                        q8.y(parcel, readInt4);
                    } else {
                        i17 = q8.u(parcel, readInt4);
                    }
                }
                q8.m(parcel, z15);
                return new LandmarkParcel(i16, f22, f23, i17);
            case 5:
                return new g4.a(parcel);
            case 6:
                return new g4.e(parcel);
            case 7:
                return new g4.f();
            case 8:
                return new i(parcel);
            case 9:
                return new j(parcel.readLong(), parcel.readLong());
            case 10:
                int z16 = q8.z(parcel);
                String str = null;
                g8.b bVar2 = null;
                UserAddress userAddress = null;
                k kVar = null;
                String str2 = null;
                Bundle bundle = null;
                String str3 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str = q8.h(parcel, readInt5);
                            break;
                        case 2:
                            bVar2 = (g8.b) q8.g(parcel, readInt5, g8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) q8.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar = (k) q8.g(parcel, readInt5, k.CREATOR);
                            break;
                        case 5:
                            str2 = q8.h(parcel, readInt5);
                            break;
                        case 6:
                            bundle = q8.a(parcel, readInt5);
                            break;
                        case 7:
                            str3 = q8.h(parcel, readInt5);
                            break;
                        case '\b':
                            bundle2 = q8.a(parcel, readInt5);
                            break;
                        default:
                            q8.y(parcel, readInt5);
                            break;
                    }
                }
                q8.m(parcel, z16);
                g8.i iVar = new g8.i();
                iVar.a = str;
                iVar.b = bVar2;
                iVar.c = userAddress;
                iVar.d = kVar;
                iVar.e = str2;
                iVar.f = bundle;
                iVar.h = str3;
                iVar.n = bundle2;
                return iVar;
            case 11:
                int z17 = q8.z(parcel);
                boolean z18 = false;
                g8.c cVar = null;
                m mVar = null;
                ArrayList arrayList = null;
                l lVar = null;
                n nVar = null;
                String str4 = null;
                Bundle bundle3 = null;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = true;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            z18 = q8.n(parcel, readInt6);
                            break;
                        case 2:
                            z19 = q8.n(parcel, readInt6);
                            break;
                        case 3:
                            cVar = (g8.c) q8.g(parcel, readInt6, g8.c.CREATOR);
                            break;
                        case 4:
                            z20 = q8.n(parcel, readInt6);
                            break;
                        case 5:
                            mVar = (m) q8.g(parcel, readInt6, m.CREATOR);
                            break;
                        case 6:
                            arrayList = q8.e(parcel, readInt6);
                            break;
                        case 7:
                            lVar = (l) q8.g(parcel, readInt6, l.CREATOR);
                            break;
                        case '\b':
                            nVar = (n) q8.g(parcel, readInt6, n.CREATOR);
                            break;
                        case '\t':
                            z21 = q8.n(parcel, readInt6);
                            break;
                        case '\n':
                            str4 = q8.h(parcel, readInt6);
                            break;
                        case 11:
                            bundle3 = q8.a(parcel, readInt6);
                            break;
                        default:
                            q8.y(parcel, readInt6);
                            break;
                    }
                }
                q8.m(parcel, z17);
                g8.j jVar = new g8.j();
                jVar.a = z18;
                jVar.b = z19;
                jVar.c = cVar;
                jVar.d = z20;
                jVar.e = mVar;
                jVar.f = arrayList;
                jVar.h = lVar;
                jVar.n = nVar;
                jVar.r = z21;
                jVar.s = str4;
                jVar.v = bundle3;
                return jVar;
            case 12:
                int z22 = q8.z(parcel);
                int i18 = 0;
                String str5 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 2) {
                        i18 = q8.u(parcel, readInt7);
                    } else if (c12 != 3) {
                        q8.y(parcel, readInt7);
                    } else {
                        str5 = q8.h(parcel, readInt7);
                    }
                }
                q8.m(parcel, z22);
                k kVar2 = new k();
                kVar2.a = i18;
                kVar2.b = str5;
                return kVar2;
            case 13:
                int z23 = q8.z(parcel);
                int i19 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 2) {
                        i19 = q8.u(parcel, readInt8);
                    } else if (c13 != 3) {
                        q8.y(parcel, readInt8);
                    } else {
                        bundle4 = q8.a(parcel, readInt8);
                    }
                }
                q8.m(parcel, z23);
                l lVar2 = new l();
                new Bundle();
                lVar2.a = i19;
                lVar2.b = bundle4;
                return lVar2;
            case 14:
                int z24 = q8.z(parcel);
                String str6 = null;
                String str7 = null;
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < z24) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 2) {
                        str6 = q8.h(parcel, readInt9);
                    } else if (c14 == 3) {
                        str7 = q8.h(parcel, readInt9);
                    } else if (c14 == 4) {
                        i20 = q8.u(parcel, readInt9);
                    } else if (c14 != 5) {
                        q8.y(parcel, readInt9);
                    } else {
                        i21 = q8.u(parcel, readInt9);
                    }
                }
                q8.m(parcel, z24);
                return new r(i20, i21, str6, str7);
            case 15:
                int z25 = q8.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        q8.y(parcel, readInt10);
                    } else {
                        arrayList2 = q8.j(parcel, readInt10);
                    }
                }
                q8.m(parcel, z25);
                m mVar2 = new m();
                mVar2.a = arrayList2;
                return mVar2;
            case 16:
                int z26 = q8.z(parcel);
                int i22 = 0;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 1) {
                        i22 = q8.u(parcel, readInt11);
                    } else if (c15 == 2) {
                        str8 = q8.h(parcel, readInt11);
                    } else if (c15 != 3) {
                        q8.y(parcel, readInt11);
                    } else {
                        str9 = q8.h(parcel, readInt11);
                    }
                }
                q8.m(parcel, z26);
                n nVar2 = new n();
                nVar2.a = i22;
                nVar2.b = str8;
                nVar2.c = str9;
                return nVar2;
            case 17:
                int z27 = q8.z(parcel);
                String str10 = null;
                Bundle bundle5 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 2) {
                        str10 = q8.h(parcel, readInt12);
                    } else if (c16 != 3) {
                        q8.y(parcel, readInt12);
                    } else {
                        bundle5 = q8.a(parcel, readInt12);
                    }
                }
                q8.m(parcel, z27);
                s sVar = new s();
                sVar.a = str10;
                sVar.b = bundle5;
                return sVar;
            case 18:
                int z28 = q8.z(parcel);
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
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str11 = q8.h(parcel, readInt13);
                            break;
                        case 3:
                            str12 = q8.h(parcel, readInt13);
                            break;
                        case 4:
                            str13 = q8.h(parcel, readInt13);
                            break;
                        case 5:
                            str14 = q8.h(parcel, readInt13);
                            break;
                        case 6:
                            str15 = q8.h(parcel, readInt13);
                            break;
                        case 7:
                            str16 = q8.h(parcel, readInt13);
                            break;
                        case '\b':
                            str17 = q8.h(parcel, readInt13);
                            break;
                        case '\t':
                            str18 = q8.h(parcel, readInt13);
                            break;
                        case '\n':
                            str19 = q8.h(parcel, readInt13);
                            break;
                        case 11:
                            z29 = q8.n(parcel, readInt13);
                            break;
                        case '\f':
                            str20 = q8.h(parcel, readInt13);
                            break;
                        default:
                            q8.y(parcel, readInt13);
                            break;
                    }
                }
                q8.m(parcel, z28);
                q qVar = new q();
                qVar.a = str11;
                qVar.b = str12;
                qVar.c = str13;
                qVar.d = str14;
                qVar.e = str15;
                qVar.f = str16;
                qVar.h = str17;
                qVar.n = str18;
                qVar.r = str19;
                qVar.s = z29;
                qVar.v = str20;
                return qVar;
            case 19:
                int z30 = q8.z(parcel);
                String str21 = null;
                String str22 = null;
                String str23 = null;
                UserAddress userAddress2 = null;
                int i23 = 0;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 1) {
                        str21 = q8.h(parcel, readInt14);
                    } else if (c17 == 2) {
                        str22 = q8.h(parcel, readInt14);
                    } else if (c17 == 3) {
                        str23 = q8.h(parcel, readInt14);
                    } else if (c17 == 4) {
                        i23 = q8.u(parcel, readInt14);
                    } else if (c17 != 5) {
                        q8.y(parcel, readInt14);
                    } else {
                        userAddress2 = (UserAddress) q8.g(parcel, readInt14, UserAddress.CREATOR);
                    }
                }
                q8.m(parcel, z30);
                g8.b bVar3 = new g8.b();
                bVar3.a = str21;
                bVar3.b = str22;
                bVar3.c = str23;
                bVar3.d = i23;
                bVar3.e = userAddress2;
                return bVar3;
            case 20:
                int z31 = q8.z(parcel);
                ArrayList arrayList3 = null;
                boolean z32 = false;
                int i24 = 0;
                boolean z33 = true;
                while (parcel.dataPosition() < z31) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 1) {
                        arrayList3 = q8.e(parcel, readInt15);
                    } else if (c18 == 2) {
                        z33 = q8.n(parcel, readInt15);
                    } else if (c18 == 3) {
                        z32 = q8.n(parcel, readInt15);
                    } else if (c18 != 4) {
                        q8.y(parcel, readInt15);
                    } else {
                        i24 = q8.u(parcel, readInt15);
                    }
                }
                q8.m(parcel, z31);
                g8.c cVar2 = new g8.c();
                cVar2.a = arrayList3;
                cVar2.b = z33;
                cVar2.c = z32;
                cVar2.d = i24;
                return cVar2;
            case 21:
                int z34 = q8.z(parcel);
                String str24 = null;
                String str25 = null;
                r rVar = null;
                String str26 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                g8.d[] dVarArr = null;
                k kVar3 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            str24 = q8.h(parcel, readInt16);
                            break;
                        case 3:
                            str25 = q8.h(parcel, readInt16);
                            break;
                        case 4:
                            rVar = (r) q8.g(parcel, readInt16, r.CREATOR);
                            break;
                        case 5:
                            str26 = q8.h(parcel, readInt16);
                            break;
                        case 6:
                            qVar2 = (q) q8.g(parcel, readInt16, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) q8.g(parcel, readInt16, q.CREATOR);
                            break;
                        case '\b':
                            strArr = q8.i(parcel, readInt16);
                            break;
                        case '\t':
                            userAddress3 = (UserAddress) q8.g(parcel, readInt16, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) q8.g(parcel, readInt16, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (g8.d[]) q8.k(parcel, readInt16, g8.d.CREATOR);
                            break;
                        case '\f':
                            kVar3 = (k) q8.g(parcel, readInt16, k.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt16);
                            break;
                    }
                }
                q8.m(parcel, z34);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str24;
                fullWallet.b = str25;
                fullWallet.c = rVar;
                fullWallet.d = str26;
                fullWallet.e = qVar2;
                fullWallet.f = qVar3;
                fullWallet.h = strArr;
                fullWallet.n = userAddress3;
                fullWallet.r = userAddress4;
                fullWallet.s = dVarArr;
                fullWallet.v = kVar3;
                return fullWallet;
            case 22:
                int z35 = q8.z(parcel);
                String str27 = null;
                String str28 = null;
                int i25 = 0;
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    char c19 = (char) readInt17;
                    if (c19 == 2) {
                        str27 = q8.h(parcel, readInt17);
                    } else if (c19 == 3) {
                        str28 = q8.h(parcel, readInt17);
                    } else if (c19 != 4) {
                        q8.y(parcel, readInt17);
                    } else {
                        i25 = q8.u(parcel, readInt17);
                    }
                }
                q8.m(parcel, z35);
                g8.d dVar = new g8.d();
                dVar.a = str27;
                dVar.b = str28;
                dVar.c = i25;
                return dVar;
            case 23:
                int z36 = q8.z(parcel);
                ArrayList arrayList4 = null;
                String str29 = null;
                String str30 = null;
                ArrayList arrayList5 = null;
                String str31 = null;
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            arrayList4 = q8.e(parcel, readInt18);
                            break;
                        case 3:
                        default:
                            q8.y(parcel, readInt18);
                            break;
                        case 4:
                            str29 = q8.h(parcel, readInt18);
                            break;
                        case 5:
                            str30 = q8.h(parcel, readInt18);
                            break;
                        case 6:
                            arrayList5 = q8.e(parcel, readInt18);
                            break;
                        case 7:
                            z37 = q8.n(parcel, readInt18);
                            break;
                        case '\b':
                            str31 = q8.h(parcel, readInt18);
                            break;
                    }
                }
                q8.m(parcel, z36);
                g8.e eVar = new g8.e();
                eVar.a = arrayList4;
                eVar.b = str29;
                eVar.c = str30;
                eVar.d = arrayList5;
                eVar.e = z37;
                eVar.f = str31;
                return eVar;
            case 24:
                int z38 = q8.z(parcel);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                String str32 = null;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = arrayList8;
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                String str33 = null;
                h8.f fVar = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                h8.c cVar3 = null;
                String str43 = null;
                int i26 = 0;
                boolean z39 = false;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    h8.f fVar2 = fVar;
                    switch ((char) readInt19) {
                        case 2:
                            str32 = q8.h(parcel, readInt19);
                            break;
                        case 3:
                            str36 = q8.h(parcel, readInt19);
                            break;
                        case 4:
                            str37 = q8.h(parcel, readInt19);
                            break;
                        case 5:
                            str38 = q8.h(parcel, readInt19);
                            break;
                        case 6:
                            str39 = q8.h(parcel, readInt19);
                            break;
                        case 7:
                            str40 = q8.h(parcel, readInt19);
                            break;
                        case '\b':
                            str41 = q8.h(parcel, readInt19);
                            break;
                        case '\t':
                            str33 = q8.h(parcel, readInt19);
                            break;
                        case '\n':
                            str35 = q8.h(parcel, readInt19);
                            break;
                        case 11:
                            str34 = q8.h(parcel, readInt19);
                            break;
                        case '\f':
                            i26 = q8.u(parcel, readInt19);
                            break;
                        case '\r':
                            arrayList6 = q8.l(parcel, readInt19, h.CREATOR);
                            break;
                        case 14:
                            fVar = (h8.f) q8.g(parcel, readInt19, h8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList9 = q8.l(parcel, readInt19, LatLng.CREATOR);
                            break;
                        case 16:
                            str43 = q8.h(parcel, readInt19);
                            break;
                        case 17:
                            str42 = q8.h(parcel, readInt19);
                            break;
                        case 18:
                            arrayList10 = q8.l(parcel, readInt19, h8.b.CREATOR);
                            break;
                        case 19:
                            z39 = q8.n(parcel, readInt19);
                            break;
                        case 20:
                            arrayList11 = q8.l(parcel, readInt19, g.CREATOR);
                            break;
                        case 21:
                            arrayList12 = q8.l(parcel, readInt19, h8.e.CREATOR);
                            break;
                        case 22:
                            arrayList13 = q8.l(parcel, readInt19, g.CREATOR);
                            break;
                        case 23:
                            cVar3 = (h8.c) q8.g(parcel, readInt19, h8.c.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt19);
                            break;
                    }
                    fVar = fVar2;
                }
                q8.m(parcel, z38);
                g8.f fVar3 = new g8.f();
                fVar3.a = str32;
                fVar3.b = str36;
                fVar3.c = str37;
                fVar3.d = str38;
                fVar3.e = str39;
                fVar3.f = str40;
                fVar3.h = str41;
                fVar3.n = str33;
                fVar3.r = str35;
                fVar3.s = str34;
                fVar3.v = i26;
                fVar3.w = arrayList6;
                fVar3.x = fVar;
                fVar3.y = arrayList9;
                fVar3.A = str43;
                fVar3.B = str42;
                fVar3.C = arrayList10;
                fVar3.D = z39;
                fVar3.E = arrayList11;
                fVar3.F = arrayList12;
                fVar3.G = arrayList13;
                fVar3.H = cVar3;
                return fVar3;
            case 25:
                int z40 = q8.z(parcel);
                String str44 = null;
                String str45 = null;
                String[] strArr2 = null;
                String str46 = null;
                q qVar4 = null;
                q qVar5 = null;
                g8.f[] fVarArr = null;
                g8.g[] gVarArr = null;
                UserAddress userAddress5 = null;
                UserAddress userAddress6 = null;
                g8.d[] dVarArr2 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            str44 = q8.h(parcel, readInt20);
                            break;
                        case 3:
                            str45 = q8.h(parcel, readInt20);
                            break;
                        case 4:
                            strArr2 = q8.i(parcel, readInt20);
                            break;
                        case 5:
                            str46 = q8.h(parcel, readInt20);
                            break;
                        case 6:
                            qVar4 = (q) q8.g(parcel, readInt20, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) q8.g(parcel, readInt20, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (g8.f[]) q8.k(parcel, readInt20, g8.f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g8.g[]) q8.k(parcel, readInt20, g8.g.CREATOR);
                            break;
                        case '\n':
                            userAddress5 = (UserAddress) q8.g(parcel, readInt20, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress6 = (UserAddress) q8.g(parcel, readInt20, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (g8.d[]) q8.k(parcel, readInt20, g8.d.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt20);
                            break;
                    }
                }
                q8.m(parcel, z40);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str44;
                maskedWallet.b = str45;
                maskedWallet.c = strArr2;
                maskedWallet.d = str46;
                maskedWallet.e = qVar4;
                maskedWallet.f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress5;
                maskedWallet.s = userAddress6;
                maskedWallet.v = dVarArr2;
                return maskedWallet;
            case 26:
                int z41 = q8.z(parcel);
                int i27 = 0;
                String str47 = null;
                String str48 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c20 = (char) readInt21;
                    if (c20 == 1) {
                        i27 = q8.u(parcel, readInt21);
                    } else if (c20 == 2) {
                        str47 = q8.h(parcel, readInt21);
                    } else if (c20 == 3) {
                        str48 = q8.h(parcel, readInt21);
                    } else if (c20 != 4) {
                        q8.y(parcel, readInt21);
                    } else {
                        commonWalletObject = (CommonWalletObject) q8.g(parcel, readInt21, CommonWalletObject.CREATOR);
                    }
                }
                q8.m(parcel, z41);
                return new g8.g(i27, str47, str48, commonWalletObject);
            case 27:
                int z42 = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        q8.y(parcel, readInt22);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, readInt22, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, z42);
                g8.h hVar = new g8.h();
                hVar.a = pendingIntent;
                return hVar;
            case 28:
                return new h4.a(parcel);
            default:
                int z43 = q8.z(parcel);
                h5.d dVar2 = null;
                h5.a aVar = null;
                String str49 = null;
                h5.c cVar4 = null;
                h5.b bVar4 = null;
                boolean z44 = false;
                int i28 = 0;
                boolean z45 = false;
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            dVar2 = (h5.d) q8.g(parcel, readInt23, h5.d.CREATOR);
                            break;
                        case 2:
                            aVar = (h5.a) q8.g(parcel, readInt23, h5.a.CREATOR);
                            break;
                        case 3:
                            str49 = q8.h(parcel, readInt23);
                            break;
                        case 4:
                            z44 = q8.n(parcel, readInt23);
                            break;
                        case 5:
                            i28 = q8.u(parcel, readInt23);
                            break;
                        case 6:
                            cVar4 = (h5.c) q8.g(parcel, readInt23, h5.c.CREATOR);
                            break;
                        case 7:
                            bVar4 = (h5.b) q8.g(parcel, readInt23, h5.b.CREATOR);
                            break;
                        case '\b':
                            z45 = q8.n(parcel, readInt23);
                            break;
                        default:
                            q8.y(parcel, readInt23);
                            break;
                    }
                }
                q8.m(parcel, z43);
                return new h5.e(dVar2, aVar, str49, z44, i28, cVar4, bVar4, z45);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new f[i10];
            case 1:
                return new f8.a[i10];
            case 2:
                return new FaceParcel[i10];
            case 3:
                return new f8.b[i10];
            case 4:
                return new LandmarkParcel[i10];
            case 5:
                return new g4.a[i10];
            case 6:
                return new g4.e[i10];
            case 7:
                return new g4.f[i10];
            case 8:
                return new i[i10];
            case 9:
                return new j[i10];
            case 10:
                return new g8.i[i10];
            case 11:
                return new g8.j[i10];
            case 12:
                return new k[i10];
            case 13:
                return new l[i10];
            case 14:
                return new r[i10];
            case 15:
                return new m[i10];
            case 16:
                return new n[i10];
            case 17:
                return new s[i10];
            case 18:
                return new q[i10];
            case 19:
                return new g8.b[i10];
            case 20:
                return new g8.c[i10];
            case 21:
                return new FullWallet[i10];
            case 22:
                return new g8.d[i10];
            case 23:
                return new g8.e[i10];
            case 24:
                return new g8.f[i10];
            case 25:
                return new MaskedWallet[i10];
            case 26:
                return new g8.g[i10];
            case 27:
                return new g8.h[i10];
            case 28:
                return new h4.a[i10];
            default:
                return new h5.e[i10];
        }
    }
}
