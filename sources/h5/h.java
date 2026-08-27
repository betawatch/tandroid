package h5;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import h7.q8;
import java.util.ArrayList;
import m.o0;
import n5.b0;
import n5.c0;
import n6.a1;
import n6.m0;
import n6.u;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        q8.y(parcel, readInt);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, readInt, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, z10);
                return new f(pendingIntent);
            case 1:
                int z11 = q8.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList = null;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            z12 = q8.n(parcel, readInt2);
                            break;
                        case 2:
                            str = q8.h(parcel, readInt2);
                            break;
                        case 3:
                            str2 = q8.h(parcel, readInt2);
                            break;
                        case 4:
                            z13 = q8.n(parcel, readInt2);
                            break;
                        case 5:
                            str3 = q8.h(parcel, readInt2);
                            break;
                        case 6:
                            arrayList = q8.j(parcel, readInt2);
                            break;
                        case 7:
                            z14 = q8.n(parcel, readInt2);
                            break;
                        default:
                            q8.y(parcel, readInt2);
                            break;
                    }
                }
                q8.m(parcel, z11);
                return new a(z12, str, str2, z13, str3, arrayList, z14);
            case 2:
                int z15 = q8.z(parcel);
                String str4 = null;
                boolean z16 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        z16 = q8.n(parcel, readInt3);
                    } else if (c10 != 2) {
                        q8.y(parcel, readInt3);
                    } else {
                        str4 = q8.h(parcel, readInt3);
                    }
                }
                q8.m(parcel, z15);
                return new b(str4, z16);
            case 3:
                int z17 = q8.z(parcel);
                byte[] bArr = null;
                String str5 = null;
                boolean z18 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        z18 = q8.n(parcel, readInt4);
                    } else if (c11 == 2) {
                        bArr = q8.b(parcel, readInt4);
                    } else if (c11 != 3) {
                        q8.y(parcel, readInt4);
                    } else {
                        str5 = q8.h(parcel, readInt4);
                    }
                }
                q8.m(parcel, z17);
                return new c(z18, bArr, str5);
            case 4:
                int z19 = q8.z(parcel);
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        q8.y(parcel, readInt5);
                    } else {
                        z20 = q8.n(parcel, readInt5);
                    }
                }
                q8.m(parcel, z19);
                return new d(z20);
            case 5:
                int z21 = q8.z(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                Uri uri = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                u uVar = null;
                while (parcel.dataPosition() < z21) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            str6 = q8.h(parcel, readInt6);
                            break;
                        case 2:
                            str7 = q8.h(parcel, readInt6);
                            break;
                        case 3:
                            str8 = q8.h(parcel, readInt6);
                            break;
                        case 4:
                            str9 = q8.h(parcel, readInt6);
                            break;
                        case 5:
                            uri = (Uri) q8.g(parcel, readInt6, Uri.CREATOR);
                            break;
                        case 6:
                            str10 = q8.h(parcel, readInt6);
                            break;
                        case 7:
                            str11 = q8.h(parcel, readInt6);
                            break;
                        case '\b':
                            str12 = q8.h(parcel, readInt6);
                            break;
                        case '\t':
                            uVar = (u) q8.g(parcel, readInt6, u.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt6);
                            break;
                    }
                }
                q8.m(parcel, z21);
                return new g(str6, str7, str8, str9, uri, str10, str11, str12, uVar);
            case 6:
                int z22 = q8.z(parcel);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                String str13 = null;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str14 = null;
                String str15 = null;
                h8.f fVar = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                int i10 = 0;
                boolean z23 = false;
                while (parcel.dataPosition() < z22) {
                    int readInt7 = parcel.readInt();
                    String str23 = str15;
                    switch ((char) readInt7) {
                        case 2:
                            str13 = q8.h(parcel, readInt7);
                            break;
                        case 3:
                            str16 = q8.h(parcel, readInt7);
                            break;
                        case 4:
                            str17 = q8.h(parcel, readInt7);
                            break;
                        case 5:
                            str18 = q8.h(parcel, readInt7);
                            break;
                        case 6:
                            str19 = q8.h(parcel, readInt7);
                            break;
                        case 7:
                            str20 = q8.h(parcel, readInt7);
                            break;
                        case '\b':
                            str21 = q8.h(parcel, readInt7);
                            break;
                        case '\t':
                            str14 = q8.h(parcel, readInt7);
                            break;
                        case '\n':
                            i10 = q8.u(parcel, readInt7);
                            break;
                        case 11:
                            arrayList2 = q8.l(parcel, readInt7, h8.h.CREATOR);
                            break;
                        case '\f':
                            fVar = (h8.f) q8.g(parcel, readInt7, h8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList3 = q8.l(parcel, readInt7, LatLng.CREATOR);
                            break;
                        case 14:
                            str15 = q8.h(parcel, readInt7);
                            continue;
                        case 15:
                            str22 = q8.h(parcel, readInt7);
                            break;
                        case 16:
                            arrayList4 = q8.l(parcel, readInt7, h8.b.CREATOR);
                            break;
                        case 17:
                            z23 = q8.n(parcel, readInt7);
                            break;
                        case 18:
                            arrayList5 = q8.l(parcel, readInt7, h8.g.CREATOR);
                            break;
                        case 19:
                            arrayList6 = q8.l(parcel, readInt7, h8.e.CREATOR);
                            break;
                        case 20:
                            arrayList7 = q8.l(parcel, readInt7, h8.g.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt7);
                            break;
                    }
                    str15 = str23;
                }
                q8.m(parcel, z22);
                CommonWalletObject commonWalletObject = new CommonWalletObject();
                commonWalletObject.a = str13;
                commonWalletObject.b = str16;
                commonWalletObject.c = str17;
                commonWalletObject.d = str18;
                commonWalletObject.e = str19;
                commonWalletObject.f = str20;
                commonWalletObject.h = str21;
                commonWalletObject.n = str14;
                commonWalletObject.r = i10;
                commonWalletObject.s = arrayList2;
                commonWalletObject.v = fVar;
                commonWalletObject.w = arrayList3;
                commonWalletObject.x = str15;
                commonWalletObject.y = str22;
                commonWalletObject.A = arrayList4;
                commonWalletObject.B = z23;
                commonWalletObject.C = arrayList5;
                commonWalletObject.D = arrayList6;
                commonWalletObject.E = arrayList7;
                return commonWalletObject;
            case 7:
                int z24 = q8.z(parcel);
                String str24 = null;
                String str25 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        str24 = q8.h(parcel, readInt8);
                    } else if (c12 != 3) {
                        q8.y(parcel, readInt8);
                    } else {
                        str25 = q8.h(parcel, readInt8);
                    }
                }
                q8.m(parcel, z24);
                h8.a aVar = new h8.a();
                aVar.a = str24;
                aVar.b = str25;
                return aVar;
            case 8:
                int z25 = q8.z(parcel);
                ArrayList arrayList8 = new ArrayList();
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        str26 = q8.h(parcel, readInt9);
                    } else if (c13 == 3) {
                        str27 = q8.h(parcel, readInt9);
                    } else if (c13 != 4) {
                        q8.y(parcel, readInt9);
                    } else {
                        arrayList8 = q8.l(parcel, readInt9, h8.a.CREATOR);
                    }
                }
                q8.m(parcel, z25);
                h8.b bVar = new h8.b();
                bVar.a = str26;
                bVar.b = str27;
                bVar.c = arrayList8;
                return bVar;
            case 9:
                int z26 = q8.z(parcel);
                int i11 = 0;
                String str28 = null;
                long j10 = 0;
                int i12 = -1;
                double d = 0.0d;
                String str29 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i11 = q8.u(parcel, readInt10);
                            break;
                        case 3:
                            str28 = q8.h(parcel, readInt10);
                            break;
                        case 4:
                            d = q8.q(parcel, readInt10);
                            break;
                        case 5:
                            str29 = q8.h(parcel, readInt10);
                            break;
                        case 6:
                            j10 = q8.w(parcel, readInt10);
                            break;
                        case 7:
                            i12 = q8.u(parcel, readInt10);
                            break;
                        default:
                            q8.y(parcel, readInt10);
                            break;
                    }
                }
                q8.m(parcel, z26);
                h8.d dVar = new h8.d();
                dVar.a = i11;
                dVar.b = str28;
                dVar.c = d;
                dVar.d = str29;
                dVar.e = j10;
                dVar.f = i12;
                return dVar;
            case 10:
                int z27 = q8.z(parcel);
                String str30 = null;
                h8.d dVar2 = null;
                h8.f fVar2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 2) {
                        str30 = q8.h(parcel, readInt11);
                    } else if (c14 == 3) {
                        dVar2 = (h8.d) q8.g(parcel, readInt11, h8.d.CREATOR);
                    } else if (c14 != 5) {
                        q8.y(parcel, readInt11);
                    } else {
                        fVar2 = (h8.f) q8.g(parcel, readInt11, h8.f.CREATOR);
                    }
                }
                q8.m(parcel, z27);
                h8.c cVar = new h8.c();
                cVar.a = str30;
                cVar.b = dVar2;
                cVar.c = fVar2;
                return cVar;
            case 11:
                int z28 = q8.z(parcel);
                String str31 = null;
                String str32 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 2) {
                        str31 = q8.h(parcel, readInt12);
                    } else if (c15 != 3) {
                        q8.y(parcel, readInt12);
                    } else {
                        str32 = q8.h(parcel, readInt12);
                    }
                }
                q8.m(parcel, z28);
                h8.e eVar = new h8.e();
                eVar.a = str31;
                eVar.b = str32;
                return eVar;
            case 12:
                int z29 = q8.z(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        j11 = q8.w(parcel, readInt13);
                    } else if (c16 != 3) {
                        q8.y(parcel, readInt13);
                    } else {
                        j12 = q8.w(parcel, readInt13);
                    }
                }
                q8.m(parcel, z29);
                h8.f fVar3 = new h8.f();
                fVar3.a = j11;
                fVar3.b = j12;
                return fVar3;
            case 13:
                int z30 = q8.z(parcel);
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 2) {
                        str33 = q8.h(parcel, readInt14);
                    } else if (c17 != 3) {
                        q8.y(parcel, readInt14);
                    } else {
                        str34 = q8.h(parcel, readInt14);
                    }
                }
                q8.m(parcel, z30);
                h8.g gVar = new h8.g();
                gVar.a = str33;
                gVar.b = str34;
                return gVar;
            case 14:
                int z31 = q8.z(parcel);
                String str35 = null;
                String str36 = null;
                h8.f fVar4 = null;
                h8.g gVar2 = null;
                h8.g gVar3 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 2) {
                        str35 = q8.h(parcel, readInt15);
                    } else if (c18 == 3) {
                        str36 = q8.h(parcel, readInt15);
                    } else if (c18 == 4) {
                        fVar4 = (h8.f) q8.g(parcel, readInt15, h8.f.CREATOR);
                    } else if (c18 == 5) {
                        gVar2 = (h8.g) q8.g(parcel, readInt15, h8.g.CREATOR);
                    } else if (c18 != 6) {
                        q8.y(parcel, readInt15);
                    } else {
                        gVar3 = (h8.g) q8.g(parcel, readInt15, h8.g.CREATOR);
                    }
                }
                q8.m(parcel, z31);
                h8.h hVar = new h8.h();
                hVar.a = str35;
                hVar.b = str36;
                hVar.c = fVar4;
                hVar.d = gVar2;
                hVar.e = gVar3;
                return hVar;
            case 15:
                return new i4.b(parcel);
            case 16:
                int z32 = q8.z(parcel);
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                ArrayList arrayList9 = null;
                int i13 = 0;
                int i14 = 0;
                boolean z33 = false;
                boolean z34 = false;
                boolean z35 = false;
                int i15 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            str37 = q8.h(parcel, readInt16);
                            break;
                        case 3:
                            str38 = q8.h(parcel, readInt16);
                            break;
                        case 4:
                            i13 = q8.u(parcel, readInt16);
                            break;
                        case 5:
                            i14 = q8.u(parcel, readInt16);
                            break;
                        case 6:
                            z33 = q8.n(parcel, readInt16);
                            break;
                        case 7:
                            z34 = q8.n(parcel, readInt16);
                            break;
                        case '\b':
                            str39 = q8.h(parcel, readInt16);
                            break;
                        case '\t':
                            z35 = q8.n(parcel, readInt16);
                            break;
                        case '\n':
                            str40 = q8.h(parcel, readInt16);
                            break;
                        case 11:
                            str41 = q8.h(parcel, readInt16);
                            break;
                        case '\f':
                            i15 = q8.u(parcel, readInt16);
                            break;
                        case '\r':
                            arrayList9 = q8.j(parcel, readInt16);
                            break;
                        default:
                            q8.y(parcel, readInt16);
                            break;
                    }
                }
                q8.m(parcel, z32);
                return new ConnectionConfiguration(str37, str38, i13, i14, z33, z34, str39, z35, str40, str41, i15, arrayList9);
            case 17:
                int z36 = q8.z(parcel);
                Bundle bundle = null;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    char c19 = (char) readInt17;
                    if (c19 == 1) {
                        i16 = q8.u(parcel, readInt17);
                    } else if (c19 == 2) {
                        i17 = q8.u(parcel, readInt17);
                    } else if (c19 != 3) {
                        q8.y(parcel, readInt17);
                    } else {
                        bundle = q8.a(parcel, readInt17);
                    }
                }
                q8.m(parcel, z36);
                return new k5.a(i16, i17, bundle);
            case 18:
                int z37 = q8.z(parcel);
                String str42 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    char c20 = (char) readInt18;
                    if (c20 == 2) {
                        str42 = q8.h(parcel, readInt18);
                    } else if (c20 != 5) {
                        q8.y(parcel, readInt18);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) q8.g(parcel, readInt18, GoogleSignInOptions.CREATOR);
                    }
                }
                q8.m(parcel, z37);
                return new SignInConfiguration(str42, googleSignInOptions);
            case 19:
                return new ParcelImpl(parcel);
            case 20:
                return new l3.d(parcel);
            case 21:
                return new l3.c(parcel);
            case 22:
                try {
                    return Transport.a(parcel.readString());
                } catch (l6.a e9) {
                    throw new RuntimeException(e9);
                }
            case 23:
                o0 o0Var = new o0(parcel);
                o0Var.a = parcel.readByte() != 0;
                return o0Var;
            case 24:
                int z38 = q8.z(parcel);
                boolean z39 = false;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 2) {
                        q8.y(parcel, readInt19);
                    } else {
                        z39 = q8.n(parcel, readInt19);
                    }
                }
                q8.m(parcel, z38);
                return new b0(z39);
            case 25:
                int z40 = q8.z(parcel);
                int i18 = 0;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        q8.y(parcel, readInt20);
                    } else {
                        i18 = q8.u(parcel, readInt20);
                    }
                }
                q8.m(parcel, z40);
                return new c0(i18);
            case 26:
                int z41 = q8.z(parcel);
                String str43 = null;
                ArrayList arrayList10 = null;
                m5.i iVar = null;
                o5.a aVar2 = null;
                ArrayList arrayList11 = null;
                b0 b0Var = null;
                c0 c0Var = null;
                double d10 = 0.0d;
                boolean z42 = false;
                boolean z43 = false;
                boolean z44 = false;
                boolean z45 = false;
                boolean z46 = false;
                boolean z47 = false;
                boolean z48 = false;
                boolean z49 = false;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            str43 = q8.h(parcel, readInt21);
                            break;
                        case 3:
                            arrayList10 = q8.j(parcel, readInt21);
                            break;
                        case 4:
                            z42 = q8.n(parcel, readInt21);
                            break;
                        case 5:
                            iVar = (m5.i) q8.g(parcel, readInt21, m5.i.CREATOR);
                            break;
                        case 6:
                            z43 = q8.n(parcel, readInt21);
                            break;
                        case 7:
                            aVar2 = (o5.a) q8.g(parcel, readInt21, o5.a.CREATOR);
                            break;
                        case '\b':
                            z44 = q8.n(parcel, readInt21);
                            break;
                        case '\t':
                            d10 = q8.q(parcel, readInt21);
                            break;
                        case '\n':
                            z45 = q8.n(parcel, readInt21);
                            break;
                        case 11:
                            z46 = q8.n(parcel, readInt21);
                            break;
                        case '\f':
                            z47 = q8.n(parcel, readInt21);
                            break;
                        case '\r':
                            arrayList11 = q8.j(parcel, readInt21);
                            break;
                        case 14:
                            z48 = q8.n(parcel, readInt21);
                            break;
                        case 15:
                            q8.u(parcel, readInt21);
                            break;
                        case 16:
                            z49 = q8.n(parcel, readInt21);
                            break;
                        case 17:
                            b0Var = (b0) q8.g(parcel, readInt21, b0.CREATOR);
                            break;
                        case 18:
                            c0Var = (c0) q8.g(parcel, readInt21, c0.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt21);
                            break;
                    }
                }
                q8.m(parcel, z41);
                return new n5.b(str43, arrayList10, z42, iVar, z43, aVar2, z44, d10, z45, z46, z47, arrayList11, z48, z49, b0Var, c0Var);
            case 27:
                try {
                    return n6.c.a(parcel.readString());
                } catch (n6.b e10) {
                    throw new RuntimeException(e10);
                }
            case 28:
                int z50 = q8.z(parcel);
                boolean z51 = false;
                while (parcel.dataPosition() < z50) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        q8.y(parcel, readInt22);
                    } else {
                        z51 = q8.n(parcel, readInt22);
                    }
                }
                q8.m(parcel, z50);
                return new a1(z51);
            default:
                int z52 = q8.z(parcel);
                long j13 = 0;
                while (parcel.dataPosition() < z52) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        q8.y(parcel, readInt23);
                    } else {
                        j13 = q8.w(parcel, readInt23);
                    }
                }
                q8.m(parcel, z52);
                return new m0(j13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new f[i10];
            case 1:
                return new a[i10];
            case 2:
                return new b[i10];
            case 3:
                return new c[i10];
            case 4:
                return new d[i10];
            case 5:
                return new g[i10];
            case 6:
                return new CommonWalletObject[i10];
            case 7:
                return new h8.a[i10];
            case 8:
                return new h8.b[i10];
            case 9:
                return new h8.d[i10];
            case 10:
                return new h8.c[i10];
            case 11:
                return new h8.e[i10];
            case 12:
                return new h8.f[i10];
            case 13:
                return new h8.g[i10];
            case 14:
                return new h8.h[i10];
            case 15:
                return new i4.b[i10];
            case 16:
                return new ConnectionConfiguration[i10];
            case 17:
                return new k5.a[i10];
            case 18:
                return new SignInConfiguration[i10];
            case 19:
                return new ParcelImpl[i10];
            case 20:
                return new l3.d[i10];
            case 21:
                return new l3.c[i10];
            case 22:
                return new Transport[i10];
            case 23:
                return new o0[i10];
            case 24:
                return new b0[i10];
            case 25:
                return new c0[i10];
            case 26:
                return new n5.b[i10];
            case 27:
                return new n6.c[i10];
            case 28:
                return new a1[i10];
            default:
                return new m0[i10];
        }
    }
}
