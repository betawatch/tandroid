package g8;

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
import h8.i;
import h8.j;
import h8.k;
import h8.l;
import h8.m;
import h8.n;
import h8.q;
import h8.r;
import h8.s;
import i8.h;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                PointF[] pointFArr = null;
                int i10 = 0;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        pointFArr = (PointF[]) ce.b.l(parcel, readInt, PointF.CREATOR);
                    } else if (c3 != 3) {
                        ce.b.z(parcel, readInt);
                    } else {
                        i10 = ce.b.v(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new a(pointFArr, i10);
            case 1:
                int A2 = ce.b.A(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                a[] aVarArr = null;
                int i11 = 0;
                int i12 = 0;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = Float.MAX_VALUE;
                float f14 = Float.MAX_VALUE;
                float f15 = Float.MAX_VALUE;
                float f16 = 0.0f;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = -1.0f;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = ce.b.v(parcel, readInt2);
                            break;
                        case 2:
                            i12 = ce.b.v(parcel, readInt2);
                            break;
                        case 3:
                            f9 = ce.b.s(parcel, readInt2);
                            break;
                        case 4:
                            f10 = ce.b.s(parcel, readInt2);
                            break;
                        case 5:
                            f11 = ce.b.s(parcel, readInt2);
                            break;
                        case 6:
                            f12 = ce.b.s(parcel, readInt2);
                            break;
                        case 7:
                            f13 = ce.b.s(parcel, readInt2);
                            break;
                        case '\b':
                            f14 = ce.b.s(parcel, readInt2);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) ce.b.l(parcel, readInt2, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f16 = ce.b.s(parcel, readInt2);
                            break;
                        case 11:
                            f17 = ce.b.s(parcel, readInt2);
                            break;
                        case '\f':
                            f18 = ce.b.s(parcel, readInt2);
                            break;
                        case '\r':
                            aVarArr = (a[]) ce.b.l(parcel, readInt2, a.CREATOR);
                            break;
                        case 14:
                            f15 = ce.b.s(parcel, readInt2);
                            break;
                        case 15:
                            f19 = ce.b.s(parcel, readInt2);
                            break;
                        default:
                            ce.b.z(parcel, readInt2);
                            break;
                    }
                }
                ce.b.n(parcel, A2);
                return new FaceParcel(i11, i12, f9, f10, f11, f12, f13, f14, f15, landmarkParcelArr, f16, f17, f18, aVarArr, f19);
            case 2:
                int A3 = ce.b.A(parcel);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z10 = false;
                boolean z11 = false;
                float f20 = -1.0f;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            i13 = ce.b.v(parcel, readInt3);
                            break;
                        case 3:
                            i14 = ce.b.v(parcel, readInt3);
                            break;
                        case 4:
                            i15 = ce.b.v(parcel, readInt3);
                            break;
                        case 5:
                            z10 = ce.b.o(parcel, readInt3);
                            break;
                        case 6:
                            z11 = ce.b.o(parcel, readInt3);
                            break;
                        case 7:
                            f20 = ce.b.s(parcel, readInt3);
                            break;
                        default:
                            ce.b.z(parcel, readInt3);
                            break;
                    }
                }
                ce.b.n(parcel, A3);
                c cVar = new c();
                cVar.a = i13;
                cVar.b = i14;
                cVar.c = i15;
                cVar.d = z10;
                cVar.e = z11;
                cVar.f = f20;
                return cVar;
            case 3:
                int A4 = ce.b.A(parcel);
                int i16 = 0;
                int i17 = 0;
                float f21 = 0.0f;
                float f22 = 0.0f;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        i16 = ce.b.v(parcel, readInt4);
                    } else if (c6 == 2) {
                        f21 = ce.b.s(parcel, readInt4);
                    } else if (c6 == 3) {
                        f22 = ce.b.s(parcel, readInt4);
                    } else if (c6 != 4) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        i17 = ce.b.v(parcel, readInt4);
                    }
                }
                ce.b.n(parcel, A4);
                return new LandmarkParcel(i16, f21, f22, i17);
            case 4:
                return new h4.a(parcel);
            case 5:
                return new h4.b(parcel);
            case 6:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, h4.c.class.getClassLoader());
                return new h4.d(arrayList);
            case 7:
                return new h4.c(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 8:
                return new h4.e(parcel);
            case 9:
                int A5 = ce.b.A(parcel);
                String str = null;
                h8.b bVar = null;
                UserAddress userAddress = null;
                k kVar = null;
                String str2 = null;
                Bundle bundle = null;
                String str3 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str = ce.b.i(parcel, readInt5);
                            break;
                        case 2:
                            bVar = (h8.b) ce.b.h(parcel, readInt5, h8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) ce.b.h(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar = (k) ce.b.h(parcel, readInt5, k.CREATOR);
                            break;
                        case 5:
                            str2 = ce.b.i(parcel, readInt5);
                            break;
                        case 6:
                            bundle = ce.b.b(parcel, readInt5);
                            break;
                        case 7:
                            str3 = ce.b.i(parcel, readInt5);
                            break;
                        case '\b':
                            bundle2 = ce.b.b(parcel, readInt5);
                            break;
                        default:
                            ce.b.z(parcel, readInt5);
                            break;
                    }
                }
                ce.b.n(parcel, A5);
                i iVar = new i();
                iVar.a = str;
                iVar.b = bVar;
                iVar.c = userAddress;
                iVar.d = kVar;
                iVar.e = str2;
                iVar.f = bundle;
                iVar.h = str3;
                iVar.n = bundle2;
                return iVar;
            case 10:
                int A6 = ce.b.A(parcel);
                boolean z12 = false;
                h8.c cVar2 = null;
                m mVar = null;
                ArrayList arrayList2 = null;
                l lVar = null;
                n nVar = null;
                String str4 = null;
                Bundle bundle3 = null;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = true;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            z12 = ce.b.o(parcel, readInt6);
                            break;
                        case 2:
                            z13 = ce.b.o(parcel, readInt6);
                            break;
                        case 3:
                            cVar2 = (h8.c) ce.b.h(parcel, readInt6, h8.c.CREATOR);
                            break;
                        case 4:
                            z14 = ce.b.o(parcel, readInt6);
                            break;
                        case 5:
                            mVar = (m) ce.b.h(parcel, readInt6, m.CREATOR);
                            break;
                        case 6:
                            arrayList2 = ce.b.f(parcel, readInt6);
                            break;
                        case 7:
                            lVar = (l) ce.b.h(parcel, readInt6, l.CREATOR);
                            break;
                        case '\b':
                            nVar = (n) ce.b.h(parcel, readInt6, n.CREATOR);
                            break;
                        case '\t':
                            z15 = ce.b.o(parcel, readInt6);
                            break;
                        case '\n':
                            str4 = ce.b.i(parcel, readInt6);
                            break;
                        case 11:
                            bundle3 = ce.b.b(parcel, readInt6);
                            break;
                        default:
                            ce.b.z(parcel, readInt6);
                            break;
                    }
                }
                ce.b.n(parcel, A6);
                j jVar = new j();
                jVar.a = z12;
                jVar.b = z13;
                jVar.c = cVar2;
                jVar.d = z14;
                jVar.e = mVar;
                jVar.f = arrayList2;
                jVar.h = lVar;
                jVar.n = nVar;
                jVar.r = z15;
                jVar.s = str4;
                jVar.v = bundle3;
                return jVar;
            case 11:
                int A7 = ce.b.A(parcel);
                int i18 = 0;
                String str5 = null;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    char c10 = (char) readInt7;
                    if (c10 == 2) {
                        i18 = ce.b.v(parcel, readInt7);
                    } else if (c10 != 3) {
                        ce.b.z(parcel, readInt7);
                    } else {
                        str5 = ce.b.i(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                k kVar2 = new k();
                kVar2.a = i18;
                kVar2.b = str5;
                return kVar2;
            case 12:
                int A8 = ce.b.A(parcel);
                int i19 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    char c11 = (char) readInt8;
                    if (c11 == 2) {
                        i19 = ce.b.v(parcel, readInt8);
                    } else if (c11 != 3) {
                        ce.b.z(parcel, readInt8);
                    } else {
                        bundle4 = ce.b.b(parcel, readInt8);
                    }
                }
                ce.b.n(parcel, A8);
                l lVar2 = new l();
                new Bundle();
                lVar2.a = i19;
                lVar2.b = bundle4;
                return lVar2;
            case 13:
                int A9 = ce.b.A(parcel);
                String str6 = null;
                String str7 = null;
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 2) {
                        str6 = ce.b.i(parcel, readInt9);
                    } else if (c12 == 3) {
                        str7 = ce.b.i(parcel, readInt9);
                    } else if (c12 == 4) {
                        i20 = ce.b.v(parcel, readInt9);
                    } else if (c12 != 5) {
                        ce.b.z(parcel, readInt9);
                    } else {
                        i21 = ce.b.v(parcel, readInt9);
                    }
                }
                ce.b.n(parcel, A9);
                return new r(i20, i21, str6, str7);
            case 14:
                int A10 = ce.b.A(parcel);
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        ce.b.z(parcel, readInt10);
                    } else {
                        arrayList3 = ce.b.k(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A10);
                m mVar2 = new m();
                mVar2.a = arrayList3;
                return mVar2;
            case 15:
                int A11 = ce.b.A(parcel);
                int i22 = 0;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    char c13 = (char) readInt11;
                    if (c13 == 1) {
                        i22 = ce.b.v(parcel, readInt11);
                    } else if (c13 == 2) {
                        str8 = ce.b.i(parcel, readInt11);
                    } else if (c13 != 3) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        str9 = ce.b.i(parcel, readInt11);
                    }
                }
                ce.b.n(parcel, A11);
                n nVar2 = new n();
                nVar2.a = i22;
                nVar2.b = str8;
                nVar2.c = str9;
                return nVar2;
            case 16:
                int A12 = ce.b.A(parcel);
                String str10 = null;
                Bundle bundle5 = null;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 == 2) {
                        str10 = ce.b.i(parcel, readInt12);
                    } else if (c14 != 3) {
                        ce.b.z(parcel, readInt12);
                    } else {
                        bundle5 = ce.b.b(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A12);
                s sVar = new s();
                sVar.a = str10;
                sVar.b = bundle5;
                return sVar;
            case 17:
                int A13 = ce.b.A(parcel);
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
                boolean z16 = false;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str11 = ce.b.i(parcel, readInt13);
                            break;
                        case 3:
                            str12 = ce.b.i(parcel, readInt13);
                            break;
                        case 4:
                            str13 = ce.b.i(parcel, readInt13);
                            break;
                        case 5:
                            str14 = ce.b.i(parcel, readInt13);
                            break;
                        case 6:
                            str15 = ce.b.i(parcel, readInt13);
                            break;
                        case 7:
                            str16 = ce.b.i(parcel, readInt13);
                            break;
                        case '\b':
                            str17 = ce.b.i(parcel, readInt13);
                            break;
                        case '\t':
                            str18 = ce.b.i(parcel, readInt13);
                            break;
                        case '\n':
                            str19 = ce.b.i(parcel, readInt13);
                            break;
                        case 11:
                            z16 = ce.b.o(parcel, readInt13);
                            break;
                        case '\f':
                            str20 = ce.b.i(parcel, readInt13);
                            break;
                        default:
                            ce.b.z(parcel, readInt13);
                            break;
                    }
                }
                ce.b.n(parcel, A13);
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
                qVar.s = z16;
                qVar.v = str20;
                return qVar;
            case 18:
                int A14 = ce.b.A(parcel);
                String str21 = null;
                String str22 = null;
                String str23 = null;
                UserAddress userAddress2 = null;
                int i23 = 0;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 1) {
                        str21 = ce.b.i(parcel, readInt14);
                    } else if (c15 == 2) {
                        str22 = ce.b.i(parcel, readInt14);
                    } else if (c15 == 3) {
                        str23 = ce.b.i(parcel, readInt14);
                    } else if (c15 == 4) {
                        i23 = ce.b.v(parcel, readInt14);
                    } else if (c15 != 5) {
                        ce.b.z(parcel, readInt14);
                    } else {
                        userAddress2 = (UserAddress) ce.b.h(parcel, readInt14, UserAddress.CREATOR);
                    }
                }
                ce.b.n(parcel, A14);
                h8.b bVar2 = new h8.b();
                bVar2.a = str21;
                bVar2.b = str22;
                bVar2.c = str23;
                bVar2.d = i23;
                bVar2.e = userAddress2;
                return bVar2;
            case 19:
                int A15 = ce.b.A(parcel);
                ArrayList arrayList4 = null;
                boolean z17 = false;
                int i24 = 0;
                boolean z18 = true;
                while (parcel.dataPosition() < A15) {
                    int readInt15 = parcel.readInt();
                    char c16 = (char) readInt15;
                    if (c16 == 1) {
                        arrayList4 = ce.b.f(parcel, readInt15);
                    } else if (c16 == 2) {
                        z18 = ce.b.o(parcel, readInt15);
                    } else if (c16 == 3) {
                        z17 = ce.b.o(parcel, readInt15);
                    } else if (c16 != 4) {
                        ce.b.z(parcel, readInt15);
                    } else {
                        i24 = ce.b.v(parcel, readInt15);
                    }
                }
                ce.b.n(parcel, A15);
                h8.c cVar3 = new h8.c();
                cVar3.a = arrayList4;
                cVar3.b = z18;
                cVar3.c = z17;
                cVar3.d = i24;
                return cVar3;
            case 20:
                int A16 = ce.b.A(parcel);
                String str24 = null;
                String str25 = null;
                r rVar = null;
                String str26 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                h8.d[] dVarArr = null;
                k kVar3 = null;
                while (parcel.dataPosition() < A16) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            str24 = ce.b.i(parcel, readInt16);
                            break;
                        case 3:
                            str25 = ce.b.i(parcel, readInt16);
                            break;
                        case 4:
                            rVar = (r) ce.b.h(parcel, readInt16, r.CREATOR);
                            break;
                        case 5:
                            str26 = ce.b.i(parcel, readInt16);
                            break;
                        case 6:
                            qVar2 = (q) ce.b.h(parcel, readInt16, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) ce.b.h(parcel, readInt16, q.CREATOR);
                            break;
                        case '\b':
                            strArr = ce.b.j(parcel, readInt16);
                            break;
                        case '\t':
                            userAddress3 = (UserAddress) ce.b.h(parcel, readInt16, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) ce.b.h(parcel, readInt16, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (h8.d[]) ce.b.l(parcel, readInt16, h8.d.CREATOR);
                            break;
                        case '\f':
                            kVar3 = (k) ce.b.h(parcel, readInt16, k.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt16);
                            break;
                    }
                }
                ce.b.n(parcel, A16);
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
            case 21:
                int A17 = ce.b.A(parcel);
                String str27 = null;
                String str28 = null;
                int i25 = 0;
                while (parcel.dataPosition() < A17) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 2) {
                        str27 = ce.b.i(parcel, readInt17);
                    } else if (c17 == 3) {
                        str28 = ce.b.i(parcel, readInt17);
                    } else if (c17 != 4) {
                        ce.b.z(parcel, readInt17);
                    } else {
                        i25 = ce.b.v(parcel, readInt17);
                    }
                }
                ce.b.n(parcel, A17);
                h8.d dVar = new h8.d();
                dVar.a = str27;
                dVar.b = str28;
                dVar.c = i25;
                return dVar;
            case 22:
                int A18 = ce.b.A(parcel);
                ArrayList arrayList5 = null;
                String str29 = null;
                String str30 = null;
                ArrayList arrayList6 = null;
                String str31 = null;
                boolean z19 = false;
                while (parcel.dataPosition() < A18) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            arrayList5 = ce.b.f(parcel, readInt18);
                            break;
                        case 3:
                        default:
                            ce.b.z(parcel, readInt18);
                            break;
                        case 4:
                            str29 = ce.b.i(parcel, readInt18);
                            break;
                        case 5:
                            str30 = ce.b.i(parcel, readInt18);
                            break;
                        case 6:
                            arrayList6 = ce.b.f(parcel, readInt18);
                            break;
                        case 7:
                            z19 = ce.b.o(parcel, readInt18);
                            break;
                        case '\b':
                            str31 = ce.b.i(parcel, readInt18);
                            break;
                    }
                }
                ce.b.n(parcel, A18);
                h8.e eVar = new h8.e();
                eVar.a = arrayList5;
                eVar.b = str29;
                eVar.c = str30;
                eVar.d = arrayList6;
                eVar.e = z19;
                eVar.f = str31;
                return eVar;
            case 23:
                int A19 = ce.b.A(parcel);
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                String str32 = null;
                ArrayList arrayList10 = arrayList8;
                ArrayList arrayList11 = arrayList9;
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                String str33 = null;
                i8.f fVar = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                i8.c cVar4 = null;
                String str43 = null;
                int i26 = 0;
                boolean z20 = false;
                while (parcel.dataPosition() < A19) {
                    int readInt19 = parcel.readInt();
                    i8.f fVar2 = fVar;
                    switch ((char) readInt19) {
                        case 2:
                            str32 = ce.b.i(parcel, readInt19);
                            break;
                        case 3:
                            str36 = ce.b.i(parcel, readInt19);
                            break;
                        case 4:
                            str37 = ce.b.i(parcel, readInt19);
                            break;
                        case 5:
                            str38 = ce.b.i(parcel, readInt19);
                            break;
                        case 6:
                            str39 = ce.b.i(parcel, readInt19);
                            break;
                        case 7:
                            str40 = ce.b.i(parcel, readInt19);
                            break;
                        case '\b':
                            str41 = ce.b.i(parcel, readInt19);
                            break;
                        case '\t':
                            str33 = ce.b.i(parcel, readInt19);
                            break;
                        case '\n':
                            str35 = ce.b.i(parcel, readInt19);
                            break;
                        case 11:
                            str34 = ce.b.i(parcel, readInt19);
                            break;
                        case '\f':
                            i26 = ce.b.v(parcel, readInt19);
                            break;
                        case '\r':
                            arrayList7 = ce.b.m(parcel, readInt19, h.CREATOR);
                            break;
                        case 14:
                            fVar = (i8.f) ce.b.h(parcel, readInt19, i8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList10 = ce.b.m(parcel, readInt19, LatLng.CREATOR);
                            break;
                        case 16:
                            str43 = ce.b.i(parcel, readInt19);
                            break;
                        case 17:
                            str42 = ce.b.i(parcel, readInt19);
                            break;
                        case 18:
                            arrayList11 = ce.b.m(parcel, readInt19, i8.b.CREATOR);
                            break;
                        case 19:
                            z20 = ce.b.o(parcel, readInt19);
                            break;
                        case 20:
                            arrayList12 = ce.b.m(parcel, readInt19, i8.g.CREATOR);
                            break;
                        case 21:
                            arrayList13 = ce.b.m(parcel, readInt19, i8.e.CREATOR);
                            break;
                        case 22:
                            arrayList14 = ce.b.m(parcel, readInt19, i8.g.CREATOR);
                            break;
                        case 23:
                            cVar4 = (i8.c) ce.b.h(parcel, readInt19, i8.c.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt19);
                            break;
                    }
                    fVar = fVar2;
                }
                ce.b.n(parcel, A19);
                h8.f fVar3 = new h8.f();
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
                fVar3.w = arrayList7;
                fVar3.x = fVar;
                fVar3.y = arrayList10;
                fVar3.A = str43;
                fVar3.B = str42;
                fVar3.C = arrayList11;
                fVar3.D = z20;
                fVar3.E = arrayList12;
                fVar3.F = arrayList13;
                fVar3.G = arrayList14;
                fVar3.H = cVar4;
                return fVar3;
            case 24:
                int A20 = ce.b.A(parcel);
                String str44 = null;
                String str45 = null;
                String[] strArr2 = null;
                String str46 = null;
                q qVar4 = null;
                q qVar5 = null;
                h8.f[] fVarArr = null;
                h8.g[] gVarArr = null;
                UserAddress userAddress5 = null;
                UserAddress userAddress6 = null;
                h8.d[] dVarArr2 = null;
                while (parcel.dataPosition() < A20) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            str44 = ce.b.i(parcel, readInt20);
                            break;
                        case 3:
                            str45 = ce.b.i(parcel, readInt20);
                            break;
                        case 4:
                            strArr2 = ce.b.j(parcel, readInt20);
                            break;
                        case 5:
                            str46 = ce.b.i(parcel, readInt20);
                            break;
                        case 6:
                            qVar4 = (q) ce.b.h(parcel, readInt20, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) ce.b.h(parcel, readInt20, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (h8.f[]) ce.b.l(parcel, readInt20, h8.f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (h8.g[]) ce.b.l(parcel, readInt20, h8.g.CREATOR);
                            break;
                        case '\n':
                            userAddress5 = (UserAddress) ce.b.h(parcel, readInt20, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress6 = (UserAddress) ce.b.h(parcel, readInt20, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (h8.d[]) ce.b.l(parcel, readInt20, h8.d.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt20);
                            break;
                    }
                }
                ce.b.n(parcel, A20);
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
            case 25:
                int A21 = ce.b.A(parcel);
                int i27 = 0;
                String str47 = null;
                String str48 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < A21) {
                    int readInt21 = parcel.readInt();
                    char c18 = (char) readInt21;
                    if (c18 == 1) {
                        i27 = ce.b.v(parcel, readInt21);
                    } else if (c18 == 2) {
                        str47 = ce.b.i(parcel, readInt21);
                    } else if (c18 == 3) {
                        str48 = ce.b.i(parcel, readInt21);
                    } else if (c18 != 4) {
                        ce.b.z(parcel, readInt21);
                    } else {
                        commonWalletObject = (CommonWalletObject) ce.b.h(parcel, readInt21, CommonWalletObject.CREATOR);
                    }
                }
                ce.b.n(parcel, A21);
                return new h8.g(i27, str47, str48, commonWalletObject);
            case 26:
                int A22 = ce.b.A(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < A22) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        ce.b.z(parcel, readInt22);
                    } else {
                        pendingIntent = (PendingIntent) ce.b.h(parcel, readInt22, PendingIntent.CREATOR);
                    }
                }
                ce.b.n(parcel, A22);
                h8.h hVar = new h8.h();
                hVar.a = pendingIntent;
                return hVar;
            case 27:
                return new i4.a(parcel);
            case 28:
                return new i4.e(parcel);
            default:
                return new i4.f();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new a[i10];
            case 1:
                return new FaceParcel[i10];
            case 2:
                return new c[i10];
            case 3:
                return new LandmarkParcel[i10];
            case 4:
                return new h4.a[i10];
            case 5:
                return new h4.b[i10];
            case 6:
                return new h4.d[i10];
            case 7:
                return new h4.c[i10];
            case 8:
                return new h4.e[i10];
            case 9:
                return new i[i10];
            case 10:
                return new j[i10];
            case 11:
                return new k[i10];
            case 12:
                return new l[i10];
            case 13:
                return new r[i10];
            case 14:
                return new m[i10];
            case 15:
                return new n[i10];
            case 16:
                return new s[i10];
            case 17:
                return new q[i10];
            case 18:
                return new h8.b[i10];
            case 19:
                return new h8.c[i10];
            case 20:
                return new FullWallet[i10];
            case 21:
                return new h8.d[i10];
            case 22:
                return new h8.e[i10];
            case 23:
                return new h8.f[i10];
            case 24:
                return new MaskedWallet[i10];
            case 25:
                return new h8.g[i10];
            case 26:
                return new h8.h[i10];
            case 27:
                return new i4.a[i10];
            case 28:
                return new i4.e[i10];
            default:
                return new i4.f[i10];
        }
    }
}
