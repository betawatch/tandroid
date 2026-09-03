package b9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b6.v;
import b6.w;
import c8.f;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.q;
import d7.g;
import d7.i;
import d7.k;
import d7.l;
import d7.m;
import f2.h0;
import f8.h;
import f8.j;
import j7.l0;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z4 = false;
        boolean z10 = false;
        int i17 = 0;
        boolean z11 = false;
        int i18 = 0;
        int i19 = 0;
        c.b bVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        h hVar = null;
        String str6 = null;
        String str7 = null;
        String[] strArr = null;
        PendingIntent pendingIntent = null;
        Status status = null;
        Bundle bundle = null;
        String str8 = null;
        String str9 = null;
        g[] gVarArr = null;
        Bundle bundle2 = null;
        y5.a aVar = null;
        v vVar = null;
        ArrayList arrayList = null;
        Intent intent = null;
        switch (this.a) {
            case 0:
                int z12 = l0.z(parcel);
                String str10 = null;
                String str11 = null;
                byte[] bArr = null;
                int i20 = 0;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i20 = l0.u(parcel, readInt);
                            break;
                        case 2:
                            z13 = l0.n(parcel, readInt);
                            break;
                        case 3:
                            str10 = l0.h(parcel, readInt);
                            break;
                        case 4:
                            str11 = l0.h(parcel, readInt);
                            break;
                        case 5:
                            bArr = l0.b(parcel, readInt);
                            break;
                        case 6:
                            z14 = l0.n(parcel, readInt);
                            break;
                        default:
                            l0.y(parcel, readInt);
                            break;
                    }
                }
                l0.m(parcel, z12);
                return new a(i20, z13, str10, str11, bArr, z14);
            case 1:
                c.d dVar = new c.d();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i21 = c.c.b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.b)) {
                        c.a aVar2 = new c.a();
                        aVar2.a = readStrongBinder;
                        bVar = aVar2;
                    } else {
                        bVar = (c.b) queryLocalInterface;
                    }
                }
                dVar.a = bVar;
                return dVar;
            case 2:
                int z15 = l0.z(parcel);
                int i22 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        i11 = l0.u(parcel, readInt2);
                    } else if (c3 == 2) {
                        i22 = l0.u(parcel, readInt2);
                    } else if (c3 != 3) {
                        l0.y(parcel, readInt2);
                    } else {
                        intent = (Intent) l0.g(parcel, readInt2, Intent.CREATOR);
                    }
                }
                l0.m(parcel, z15);
                return new c8.b(i11, i22, intent);
            case 3:
                int z16 = l0.z(parcel);
                String str12 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        arrayList = l0.j(parcel, readInt3);
                    } else if (c10 != 2) {
                        l0.y(parcel, readInt3);
                    } else {
                        str12 = l0.h(parcel, readInt3);
                    }
                }
                l0.m(parcel, z16);
                return new f(str12, arrayList);
            case 4:
                int z17 = l0.z(parcel);
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i19 = l0.u(parcel, readInt4);
                    } else if (c11 != 2) {
                        l0.y(parcel, readInt4);
                    } else {
                        vVar = (v) l0.g(parcel, readInt4, v.CREATOR);
                    }
                }
                l0.m(parcel, z17);
                return new c8.g(i19, vVar);
            case 5:
                int z18 = l0.z(parcel);
                w wVar = null;
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        i18 = l0.u(parcel, readInt5);
                    } else if (c12 == 2) {
                        aVar = (y5.a) l0.g(parcel, readInt5, y5.a.CREATOR);
                    } else if (c12 != 3) {
                        l0.y(parcel, readInt5);
                    } else {
                        wVar = (w) l0.g(parcel, readInt5, w.CREATOR);
                    }
                }
                l0.m(parcel, z18);
                return new c8.h(i18, aVar, wVar);
            case 6:
                int z19 = l0.z(parcel);
                while (parcel.dataPosition() < z19) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        l0.y(parcel, readInt6);
                    } else {
                        bundle2 = l0.a(parcel, readInt6);
                    }
                }
                l0.m(parcel, z19);
                return new q(bundle2);
            case 7:
                int z20 = l0.z(parcel);
                String str13 = null;
                Account account = null;
                while (parcel.dataPosition() < z20) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        gVarArr = (g[]) l0.k(parcel, readInt7, g.CREATOR);
                    } else if (c13 == 2) {
                        str13 = l0.h(parcel, readInt7);
                    } else if (c13 == 3) {
                        z11 = l0.n(parcel, readInt7);
                    } else if (c13 != 4) {
                        l0.y(parcel, readInt7);
                    } else {
                        account = (Account) l0.g(parcel, readInt7, Account.CREATOR);
                    }
                }
                l0.m(parcel, z20);
                return new d7.e(gVarArr, str13, z11, account);
            case 8:
                int z21 = l0.z(parcel);
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 1) {
                        str9 = l0.h(parcel, readInt8);
                    } else if (c14 == 2) {
                        str14 = l0.h(parcel, readInt8);
                    } else if (c14 != 3) {
                        l0.y(parcel, readInt8);
                    } else {
                        str15 = l0.h(parcel, readInt8);
                    }
                }
                l0.m(parcel, z21);
                return new d7.f(str9, str14, str15);
            case 9:
                int z22 = l0.z(parcel);
                k kVar = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 1) {
                        str8 = l0.h(parcel, readInt9);
                    } else if (c15 == 3) {
                        kVar = (k) l0.g(parcel, readInt9, k.CREATOR);
                    } else if (c15 == 4) {
                        i10 = l0.u(parcel, readInt9);
                    } else if (c15 != 5) {
                        l0.y(parcel, readInt9);
                    } else {
                        bArr2 = l0.b(parcel, readInt9);
                    }
                }
                l0.m(parcel, z22);
                return new g(str8, kVar, i10, bArr2);
            case 10:
                int z23 = l0.z(parcel);
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 1) {
                        i17 = l0.u(parcel, readInt10);
                    } else if (c16 != 2) {
                        l0.y(parcel, readInt10);
                    } else {
                        bundle = l0.a(parcel, readInt10);
                    }
                }
                l0.m(parcel, z23);
                return new d7.h(i17, bundle);
            case 11:
                int z24 = l0.z(parcel);
                ArrayList arrayList2 = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 1) {
                        status = (Status) l0.g(parcel, readInt11, Status.CREATOR);
                    } else if (c17 == 2) {
                        arrayList2 = l0.l(parcel, readInt11, m.CREATOR);
                    } else if (c17 != 3) {
                        l0.y(parcel, readInt11);
                    } else {
                        strArr2 = l0.i(parcel, readInt11);
                    }
                }
                l0.m(parcel, z24);
                i iVar = new i();
                iVar.a = status;
                iVar.b = arrayList2;
                iVar.c = strArr2;
                return iVar;
            case 12:
                int z25 = l0.z(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                d7.h[] hVarArr = null;
                String str19 = null;
                l lVar = null;
                boolean z26 = false;
                int i23 = 1;
                boolean z27 = false;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 11) {
                        str19 = l0.h(parcel, readInt12);
                    } else if (c18 != '\f') {
                        switch (c18) {
                            case 1:
                                str16 = l0.h(parcel, readInt12);
                                break;
                            case 2:
                                str17 = l0.h(parcel, readInt12);
                                break;
                            case 3:
                                z26 = l0.n(parcel, readInt12);
                                break;
                            case 4:
                                i23 = l0.u(parcel, readInt12);
                                break;
                            case 5:
                                z27 = l0.n(parcel, readInt12);
                                break;
                            case 6:
                                str18 = l0.h(parcel, readInt12);
                                break;
                            case 7:
                                hVarArr = (d7.h[]) l0.k(parcel, readInt12, d7.h.CREATOR);
                                break;
                            default:
                                l0.y(parcel, readInt12);
                                break;
                        }
                    } else {
                        lVar = (l) l0.g(parcel, readInt12, l.CREATOR);
                    }
                }
                l0.m(parcel, z25);
                return new k(str16, str17, z26, i23, z27, str18, hVarArr, str19, lVar);
            case 13:
                int z28 = l0.z(parcel);
                while (parcel.dataPosition() < z28) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        l0.y(parcel, readInt13);
                    } else {
                        z10 = l0.n(parcel, readInt13);
                    }
                }
                l0.m(parcel, z28);
                return new l(z10);
            case 14:
                int z29 = l0.z(parcel);
                long j10 = 0;
                d7.f fVar = null;
                String str20 = null;
                d7.e eVar = null;
                String str21 = null;
                int i24 = 0;
                boolean z30 = false;
                int i25 = -1;
                int i26 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            fVar = (d7.f) l0.g(parcel, readInt14, d7.f.CREATOR);
                            break;
                        case 2:
                            j10 = l0.w(parcel, readInt14);
                            break;
                        case 3:
                            i24 = l0.u(parcel, readInt14);
                            break;
                        case 4:
                            str20 = l0.h(parcel, readInt14);
                            break;
                        case 5:
                            eVar = (d7.e) l0.g(parcel, readInt14, d7.e.CREATOR);
                            break;
                        case 6:
                            z30 = l0.n(parcel, readInt14);
                            break;
                        case 7:
                            i25 = l0.u(parcel, readInt14);
                            break;
                        case '\b':
                            i26 = l0.u(parcel, readInt14);
                            break;
                        case '\t':
                            str21 = l0.h(parcel, readInt14);
                            break;
                        default:
                            l0.y(parcel, readInt14);
                            break;
                    }
                }
                l0.m(parcel, z29);
                return new m(fVar, j10, i24, str20, eVar, z30, i25, i26, str21);
            case 15:
                h0 h0Var = new h0();
                h0Var.a = parcel.readInt();
                h0Var.b = parcel.readInt();
                h0Var.c = parcel.readInt() == 1;
                return h0Var;
            case 16:
                String readString = parcel.readString();
                readString.getClass();
                return new f4.a(parcel.readInt(), readString);
            case 17:
                int z31 = l0.z(parcel);
                int i27 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt15 = parcel.readInt();
                    char c19 = (char) readInt15;
                    if (c19 == 1) {
                        z4 = l0.n(parcel, readInt15);
                    } else if (c19 != 2) {
                        l0.y(parcel, readInt15);
                    } else {
                        i27 = l0.u(parcel, readInt15);
                    }
                }
                l0.m(parcel, z31);
                return new f6.a(i27, z4);
            case 18:
                int z32 = l0.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        l0.y(parcel, readInt16);
                    } else {
                        pendingIntent = (PendingIntent) l0.g(parcel, readInt16, PendingIntent.CREATOR);
                    }
                }
                l0.m(parcel, z32);
                return new f6.b(pendingIntent);
            case 19:
                int z33 = l0.z(parcel);
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt17 = parcel.readInt();
                    char c20 = (char) readInt17;
                    if (c20 == 1) {
                        i16 = l0.u(parcel, readInt17);
                    } else if (c20 != 2) {
                        l0.y(parcel, readInt17);
                    } else {
                        z34 = l0.n(parcel, readInt17);
                    }
                }
                l0.m(parcel, z33);
                return new f6.c(i16, z34);
            case 20:
                int z35 = l0.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt18 = parcel.readInt();
                    char c21 = (char) readInt18;
                    if (c21 == 2) {
                        i15 = l0.u(parcel, readInt18);
                    } else if (c21 != 3) {
                        l0.y(parcel, readInt18);
                    } else {
                        strArr = l0.i(parcel, readInt18);
                    }
                }
                l0.m(parcel, z35);
                f8.a aVar3 = new f8.a();
                aVar3.a = i15;
                aVar3.b = strArr;
                return aVar3;
            case 21:
                int z36 = l0.z(parcel);
                String str22 = null;
                Point[] pointArr = null;
                f8.f fVar2 = null;
                f8.i iVar2 = null;
                j jVar = null;
                f8.l lVar2 = null;
                f8.k kVar2 = null;
                f8.g gVar = null;
                byte[] bArr3 = null;
                f8.d dVar2 = null;
                f8.c cVar = null;
                f8.e eVar2 = null;
                int i28 = 0;
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt19 = parcel.readInt();
                    f8.g gVar2 = gVar;
                    switch ((char) readInt19) {
                        case 2:
                            i14 = l0.u(parcel, readInt19);
                            break;
                        case 3:
                            str7 = l0.h(parcel, readInt19);
                            break;
                        case 4:
                            str22 = l0.h(parcel, readInt19);
                            break;
                        case 5:
                            i28 = l0.u(parcel, readInt19);
                            break;
                        case 6:
                            pointArr = (Point[]) l0.k(parcel, readInt19, Point.CREATOR);
                            break;
                        case 7:
                            fVar2 = (f8.f) l0.g(parcel, readInt19, f8.f.CREATOR);
                            break;
                        case '\b':
                            iVar2 = (f8.i) l0.g(parcel, readInt19, f8.i.CREATOR);
                            break;
                        case '\t':
                            jVar = (j) l0.g(parcel, readInt19, j.CREATOR);
                            break;
                        case '\n':
                            lVar2 = (f8.l) l0.g(parcel, readInt19, f8.l.CREATOR);
                            break;
                        case 11:
                            kVar2 = (f8.k) l0.g(parcel, readInt19, f8.k.CREATOR);
                            break;
                        case '\f':
                            gVar = (f8.g) l0.g(parcel, readInt19, f8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (f8.c) l0.g(parcel, readInt19, f8.c.CREATOR);
                            break;
                        case 14:
                            dVar2 = (f8.d) l0.g(parcel, readInt19, f8.d.CREATOR);
                            break;
                        case 15:
                            eVar2 = (f8.e) l0.g(parcel, readInt19, f8.e.CREATOR);
                            break;
                        case 16:
                            bArr3 = l0.b(parcel, readInt19);
                            break;
                        case 17:
                            z37 = l0.n(parcel, readInt19);
                            break;
                        default:
                            l0.y(parcel, readInt19);
                            break;
                    }
                    gVar = gVar2;
                }
                l0.m(parcel, z36);
                f8.m mVar = new f8.m();
                mVar.a = i14;
                mVar.b = str7;
                mVar.B = bArr3;
                mVar.c = str22;
                mVar.d = i28;
                mVar.e = pointArr;
                mVar.C = z37;
                mVar.f = fVar2;
                mVar.h = iVar2;
                mVar.n = jVar;
                mVar.r = lVar2;
                mVar.s = kVar2;
                mVar.v = gVar;
                mVar.w = cVar;
                mVar.x = dVar2;
                mVar.y = eVar2;
                return mVar;
            case 22:
                int z38 = l0.z(parcel);
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                boolean z39 = false;
                while (parcel.dataPosition() < z38) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            i13 = l0.u(parcel, readInt20);
                            break;
                        case 3:
                            i29 = l0.u(parcel, readInt20);
                            break;
                        case 4:
                            i30 = l0.u(parcel, readInt20);
                            break;
                        case 5:
                            i31 = l0.u(parcel, readInt20);
                            break;
                        case 6:
                            i32 = l0.u(parcel, readInt20);
                            break;
                        case 7:
                            i33 = l0.u(parcel, readInt20);
                            break;
                        case '\b':
                            z39 = l0.n(parcel, readInt20);
                            break;
                        case '\t':
                            str6 = l0.h(parcel, readInt20);
                            break;
                        default:
                            l0.y(parcel, readInt20);
                            break;
                    }
                }
                l0.m(parcel, z38);
                f8.b bVar2 = new f8.b();
                bVar2.a = i13;
                bVar2.b = i29;
                bVar2.c = i30;
                bVar2.d = i31;
                bVar2.e = i32;
                bVar2.f = i33;
                bVar2.h = z39;
                bVar2.n = str6;
                return bVar2;
            case 23:
                int z40 = l0.z(parcel);
                String str23 = null;
                String str24 = null;
                f8.i[] iVarArr = null;
                f8.f[] fVarArr = null;
                String[] strArr3 = null;
                f8.a[] aVarArr = null;
                while (parcel.dataPosition() < z40) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            hVar = (h) l0.g(parcel, readInt21, h.CREATOR);
                            break;
                        case 3:
                            str23 = l0.h(parcel, readInt21);
                            break;
                        case 4:
                            str24 = l0.h(parcel, readInt21);
                            break;
                        case 5:
                            iVarArr = (f8.i[]) l0.k(parcel, readInt21, f8.i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (f8.f[]) l0.k(parcel, readInt21, f8.f.CREATOR);
                            break;
                        case 7:
                            strArr3 = l0.i(parcel, readInt21);
                            break;
                        case '\b':
                            aVarArr = (f8.a[]) l0.k(parcel, readInt21, f8.a.CREATOR);
                            break;
                        default:
                            l0.y(parcel, readInt21);
                            break;
                    }
                }
                l0.m(parcel, z40);
                f8.d dVar3 = new f8.d();
                dVar3.a = hVar;
                dVar3.b = str23;
                dVar3.c = str24;
                dVar3.d = iVarArr;
                dVar3.e = fVarArr;
                dVar3.f = strArr3;
                dVar3.h = aVarArr;
                return dVar3;
            case 24:
                int z41 = l0.z(parcel);
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                f8.b bVar3 = null;
                f8.b bVar4 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str5 = l0.h(parcel, readInt22);
                            break;
                        case 3:
                            str25 = l0.h(parcel, readInt22);
                            break;
                        case 4:
                            str26 = l0.h(parcel, readInt22);
                            break;
                        case 5:
                            str27 = l0.h(parcel, readInt22);
                            break;
                        case 6:
                            str28 = l0.h(parcel, readInt22);
                            break;
                        case 7:
                            bVar3 = (f8.b) l0.g(parcel, readInt22, f8.b.CREATOR);
                            break;
                        case '\b':
                            bVar4 = (f8.b) l0.g(parcel, readInt22, f8.b.CREATOR);
                            break;
                        default:
                            l0.y(parcel, readInt22);
                            break;
                    }
                }
                l0.m(parcel, z41);
                f8.c cVar2 = new f8.c();
                cVar2.a = str5;
                cVar2.b = str25;
                cVar2.c = str26;
                cVar2.d = str27;
                cVar2.e = str28;
                cVar2.f = bVar3;
                cVar2.h = bVar4;
                return cVar2;
            case 25:
                int z42 = l0.z(parcel);
                String str29 = null;
                String str30 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt23 = parcel.readInt();
                    char c22 = (char) readInt23;
                    if (c22 == 2) {
                        i12 = l0.u(parcel, readInt23);
                    } else if (c22 == 3) {
                        str4 = l0.h(parcel, readInt23);
                    } else if (c22 == 4) {
                        str29 = l0.h(parcel, readInt23);
                    } else if (c22 != 5) {
                        l0.y(parcel, readInt23);
                    } else {
                        str30 = l0.h(parcel, readInt23);
                    }
                }
                l0.m(parcel, z42);
                f8.f fVar3 = new f8.f();
                fVar3.a = i12;
                fVar3.b = str4;
                fVar3.c = str29;
                fVar3.d = str30;
                return fVar3;
            case 26:
                int z43 = l0.z(parcel);
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt24 = parcel.readInt();
                    String str44 = str42;
                    switch ((char) readInt24) {
                        case 2:
                            str3 = l0.h(parcel, readInt24);
                            break;
                        case 3:
                            str31 = l0.h(parcel, readInt24);
                            break;
                        case 4:
                            str32 = l0.h(parcel, readInt24);
                            break;
                        case 5:
                            str33 = l0.h(parcel, readInt24);
                            break;
                        case 6:
                            str34 = l0.h(parcel, readInt24);
                            break;
                        case 7:
                            str35 = l0.h(parcel, readInt24);
                            break;
                        case '\b':
                            str36 = l0.h(parcel, readInt24);
                            break;
                        case '\t':
                            str37 = l0.h(parcel, readInt24);
                            break;
                        case '\n':
                            str38 = l0.h(parcel, readInt24);
                            break;
                        case 11:
                            str39 = l0.h(parcel, readInt24);
                            break;
                        case '\f':
                            str40 = l0.h(parcel, readInt24);
                            break;
                        case '\r':
                            str41 = l0.h(parcel, readInt24);
                            break;
                        case 14:
                            str42 = l0.h(parcel, readInt24);
                            continue;
                        case 15:
                            str43 = l0.h(parcel, readInt24);
                            break;
                        default:
                            l0.y(parcel, readInt24);
                            break;
                    }
                    str42 = str44;
                }
                l0.m(parcel, z43);
                f8.e eVar3 = new f8.e();
                eVar3.a = str3;
                eVar3.b = str31;
                eVar3.c = str32;
                eVar3.d = str33;
                eVar3.e = str34;
                eVar3.f = str35;
                eVar3.h = str36;
                eVar3.n = str37;
                eVar3.r = str38;
                eVar3.s = str39;
                eVar3.v = str40;
                eVar3.w = str41;
                eVar3.x = str42;
                eVar3.y = str43;
                return eVar3;
            case 27:
                int z44 = l0.z(parcel);
                String str45 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 2:
                            str2 = l0.h(parcel, readInt25);
                            break;
                        case 3:
                            str45 = l0.h(parcel, readInt25);
                            break;
                        case 4:
                            str46 = l0.h(parcel, readInt25);
                            break;
                        case 5:
                            str47 = l0.h(parcel, readInt25);
                            break;
                        case 6:
                            str48 = l0.h(parcel, readInt25);
                            break;
                        case 7:
                            str49 = l0.h(parcel, readInt25);
                            break;
                        case '\b':
                            str50 = l0.h(parcel, readInt25);
                            break;
                        default:
                            l0.y(parcel, readInt25);
                            break;
                    }
                }
                l0.m(parcel, z44);
                h hVar2 = new h();
                hVar2.a = str2;
                hVar2.b = str45;
                hVar2.c = str46;
                hVar2.d = str47;
                hVar2.e = str48;
                hVar2.f = str49;
                hVar2.h = str50;
                return hVar2;
            case 28:
                int z45 = l0.z(parcel);
                double d = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z45) {
                    int readInt26 = parcel.readInt();
                    char c23 = (char) readInt26;
                    if (c23 == 2) {
                        d = l0.q(parcel, readInt26);
                    } else if (c23 != 3) {
                        l0.y(parcel, readInt26);
                    } else {
                        d10 = l0.q(parcel, readInt26);
                    }
                }
                l0.m(parcel, z45);
                f8.g gVar3 = new f8.g();
                gVar3.a = d;
                gVar3.b = d10;
                return gVar3;
            default:
                int z46 = l0.z(parcel);
                String str51 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt27 = parcel.readInt();
                    char c24 = (char) readInt27;
                    if (c24 == 2) {
                        str = l0.h(parcel, readInt27);
                    } else if (c24 != 3) {
                        l0.y(parcel, readInt27);
                    } else {
                        str51 = l0.h(parcel, readInt27);
                    }
                }
                l0.m(parcel, z46);
                j jVar2 = new j();
                jVar2.a = str;
                jVar2.b = str51;
                return jVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new a[i10];
            case 1:
                return new c.d[i10];
            case 2:
                return new c8.b[i10];
            case 3:
                return new f[i10];
            case 4:
                return new c8.g[i10];
            case 5:
                return new c8.h[i10];
            case 6:
                return new q[i10];
            case 7:
                return new d7.e[i10];
            case 8:
                return new d7.f[i10];
            case 9:
                return new g[i10];
            case 10:
                return new d7.h[i10];
            case 11:
                return new i[i10];
            case 12:
                return new k[i10];
            case 13:
                return new l[i10];
            case 14:
                return new m[i10];
            case 15:
                return new h0[i10];
            case 16:
                return new f4.a[i10];
            case 17:
                return new f6.a[i10];
            case 18:
                return new f6.b[i10];
            case 19:
                return new f6.c[i10];
            case 20:
                return new f8.a[i10];
            case 21:
                return new f8.m[i10];
            case 22:
                return new f8.b[i10];
            case 23:
                return new f8.d[i10];
            case 24:
                return new f8.c[i10];
            case 25:
                return new f8.f[i10];
            case 26:
                return new f8.e[i10];
            case 27:
                return new h[i10];
            case 28:
                return new f8.g[i10];
            default:
                return new j[i10];
        }
    }
}
