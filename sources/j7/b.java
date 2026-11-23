package j7;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.WorkSource;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import m.n0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = bc.z(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        bc.y(parcel, readInt);
                    } else {
                        z11 = bc.n(parcel, readInt);
                    }
                }
                bc.m(parcel, z10);
                return new a(z11);
            case 1:
                int z12 = bc.z(parcel);
                while (parcel.dataPosition() < z12) {
                    bc.y(parcel, parcel.readInt());
                }
                bc.m(parcel, z12);
                return new c();
            case 2:
                int z13 = bc.z(parcel);
                boolean z14 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        bc.y(parcel, readInt2);
                    } else {
                        z14 = bc.n(parcel, readInt2);
                    }
                }
                bc.m(parcel, z13);
                return new d(z14);
            case 3:
                int z15 = bc.z(parcel);
                boolean z16 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        bc.y(parcel, readInt3);
                    } else {
                        z16 = bc.n(parcel, readInt3);
                    }
                }
                bc.m(parcel, z15);
                return new e(z16);
            case 4:
                int z17 = bc.z(parcel);
                PendingIntent pendingIntent = null;
                h hVar = null;
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        pendingIntent = (PendingIntent) bc.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c10 != 2) {
                        bc.y(parcel, readInt4);
                    } else {
                        hVar = (h) bc.g(parcel, readInt4, h.CREATOR);
                    }
                }
                bc.m(parcel, z17);
                return new f(pendingIntent, hVar);
            case 5:
                int z18 = bc.z(parcel);
                String str = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str2 = null;
                String str3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str = bc.h(parcel, readInt5);
                            break;
                        case 2:
                            bundle = bc.a(parcel, readInt5);
                            break;
                        case 3:
                            bundle2 = bc.a(parcel, readInt5);
                            break;
                        case 4:
                            str2 = bc.h(parcel, readInt5);
                            break;
                        case 5:
                            str3 = bc.h(parcel, readInt5);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) bc.g(parcel, readInt5, ResultReceiver.CREATOR);
                            break;
                        default:
                            bc.y(parcel, readInt5);
                            break;
                    }
                }
                bc.m(parcel, z18);
                return new g(str, bundle, bundle2, str2, str3, resultReceiver);
            case 6:
                int z19 = bc.z(parcel);
                String str4 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        str4 = bc.h(parcel, readInt6);
                    } else if (c11 != 2) {
                        bc.y(parcel, readInt6);
                    } else {
                        bundle3 = bc.a(parcel, readInt6);
                    }
                }
                bc.m(parcel, z19);
                return new h(str4, bundle3);
            case 7:
                int z20 = bc.z(parcel);
                String str5 = "";
                String str6 = str5;
                String str7 = str6;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str8 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str5 = bc.h(parcel, readInt7);
                            break;
                        case 2:
                            bundle4 = bc.a(parcel, readInt7);
                            break;
                        case 3:
                            bundle5 = bc.a(parcel, readInt7);
                            break;
                        case 4:
                            str8 = bc.h(parcel, readInt7);
                            break;
                        case 5:
                            str6 = bc.h(parcel, readInt7);
                            break;
                        case 6:
                            str7 = bc.h(parcel, readInt7);
                            break;
                        default:
                            bc.y(parcel, readInt7);
                            break;
                    }
                }
                bc.m(parcel, z20);
                return new i(str5, bundle4, bundle5, str8, str6, str7);
            case 8:
                int z21 = bc.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        bc.y(parcel, readInt8);
                    } else {
                        bundle6 = bc.a(parcel, readInt8);
                    }
                }
                bc.m(parcel, z21);
                return new j(bundle6);
            case 9:
                int z22 = bc.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        bc.y(parcel, readInt9);
                    } else {
                        bundle7 = bc.a(parcel, readInt9);
                    }
                }
                bc.m(parcel, z22);
                return new k(bundle7);
            case 10:
                int z23 = bc.z(parcel);
                ArrayList arrayList = null;
                Bundle bundle8 = null;
                String str9 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c12 = (char) readInt10;
                    if (c12 == 1) {
                        arrayList = bc.l(parcel, readInt10, i.CREATOR);
                    } else if (c12 == 2) {
                        bundle8 = bc.a(parcel, readInt10);
                    } else if (c12 == 3) {
                        str9 = bc.h(parcel, readInt10);
                    } else if (c12 != 4) {
                        bc.y(parcel, readInt10);
                    } else {
                        resultReceiver2 = (ResultReceiver) bc.g(parcel, readInt10, ResultReceiver.CREATOR);
                    }
                }
                bc.m(parcel, z23);
                return new GetCredentialRequest(arrayList, bundle8, str9, resultReceiver2);
            case 11:
                int z24 = bc.z(parcel);
                Bundle bundle9 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        bc.y(parcel, readInt11);
                    } else {
                        bundle9 = bc.a(parcel, readInt11);
                    }
                }
                bc.m(parcel, z24);
                return new l(bundle9);
            case 12:
                int z25 = bc.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        bc.y(parcel, readInt12);
                    } else {
                        pendingIntent2 = (PendingIntent) bc.g(parcel, readInt12, PendingIntent.CREATOR);
                    }
                }
                bc.m(parcel, z25);
                return new m(pendingIntent2);
            case 13:
                int z26 = bc.z(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        bc.y(parcel, readInt13);
                    } else {
                        pendingIntent3 = (PendingIntent) bc.g(parcel, readInt13, PendingIntent.CREATOR);
                    }
                }
                bc.m(parcel, z26);
                return new n(pendingIntent3);
            case 14:
                int z27 = bc.z(parcel);
                while (parcel.dataPosition() < z27) {
                    bc.y(parcel, parcel.readInt());
                }
                bc.m(parcel, z27);
                return new o();
            case 15:
                int z28 = bc.z(parcel);
                while (parcel.dataPosition() < z28) {
                    bc.y(parcel, parcel.readInt());
                }
                bc.m(parcel, z28);
                return new p();
            case 16:
                int z29 = bc.z(parcel);
                while (parcel.dataPosition() < z29) {
                    bc.y(parcel, parcel.readInt());
                }
                bc.m(parcel, z29);
                return new q();
            case 17:
                int z30 = bc.z(parcel);
                while (parcel.dataPosition() < z30) {
                    bc.y(parcel, parcel.readInt());
                }
                bc.m(parcel, z30);
                return new r();
            case 18:
                int z31 = bc.z(parcel);
                Status status = null;
                j8.f fVar = null;
                while (parcel.dataPosition() < z31) {
                    int readInt14 = parcel.readInt();
                    char c13 = (char) readInt14;
                    if (c13 == 1) {
                        status = (Status) bc.g(parcel, readInt14, Status.CREATOR);
                    } else if (c13 != 2) {
                        bc.y(parcel, readInt14);
                    } else {
                        fVar = (j8.f) bc.g(parcel, readInt14, j8.f.CREATOR);
                    }
                }
                bc.m(parcel, z31);
                return new j8.e(status, fVar);
            case 19:
                int z32 = bc.z(parcel);
                boolean z33 = false;
                boolean z34 = false;
                boolean z35 = false;
                boolean z36 = false;
                boolean z37 = false;
                boolean z38 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            z33 = bc.n(parcel, readInt15);
                            break;
                        case 2:
                            z34 = bc.n(parcel, readInt15);
                            break;
                        case 3:
                            z35 = bc.n(parcel, readInt15);
                            break;
                        case 4:
                            z36 = bc.n(parcel, readInt15);
                            break;
                        case 5:
                            z37 = bc.n(parcel, readInt15);
                            break;
                        case 6:
                            z38 = bc.n(parcel, readInt15);
                            break;
                        default:
                            bc.y(parcel, readInt15);
                            break;
                    }
                }
                bc.m(parcel, z32);
                return new j8.f(z33, z34, z35, z36, z37, z38);
            case 20:
                int z39 = bc.z(parcel);
                int i7 = 1;
                int i10 = 1;
                long j3 = -1;
                long j10 = -1;
                while (parcel.dataPosition() < z39) {
                    int readInt16 = parcel.readInt();
                    char c14 = (char) readInt16;
                    if (c14 == 1) {
                        i7 = bc.u(parcel, readInt16);
                    } else if (c14 == 2) {
                        i10 = bc.u(parcel, readInt16);
                    } else if (c14 == 3) {
                        j3 = bc.w(parcel, readInt16);
                    } else if (c14 != 4) {
                        bc.y(parcel, readInt16);
                    } else {
                        j10 = bc.w(parcel, readInt16);
                    }
                }
                bc.m(parcel, z39);
                return new j8.g(j3, j10, i7, i10);
            case 21:
                int z40 = bc.z(parcel);
                long j11 = Long.MAX_VALUE;
                int i11 = 0;
                boolean z41 = false;
                String str10 = null;
                u7.j jVar = null;
                while (parcel.dataPosition() < z40) {
                    int readInt17 = parcel.readInt();
                    char c15 = (char) readInt17;
                    if (c15 == 1) {
                        j11 = bc.w(parcel, readInt17);
                    } else if (c15 == 2) {
                        i11 = bc.u(parcel, readInt17);
                    } else if (c15 == 3) {
                        z41 = bc.n(parcel, readInt17);
                    } else if (c15 == 4) {
                        str10 = bc.h(parcel, readInt17);
                    } else if (c15 != 5) {
                        bc.y(parcel, readInt17);
                    } else {
                        jVar = (u7.j) bc.g(parcel, readInt17, u7.j.CREATOR);
                    }
                }
                bc.m(parcel, z40);
                return new j8.a(j11, i11, z41, str10, jVar);
            case 22:
                int z42 = bc.z(parcel);
                int i12 = 1000;
                int i13 = 1;
                int i14 = 1;
                long j12 = 0;
                j8.g[] gVarArr = null;
                while (parcel.dataPosition() < z42) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            i13 = bc.u(parcel, readInt18);
                            break;
                        case 2:
                            i14 = bc.u(parcel, readInt18);
                            break;
                        case 3:
                            j12 = bc.w(parcel, readInt18);
                            break;
                        case 4:
                            i12 = bc.u(parcel, readInt18);
                            break;
                        case 5:
                            gVarArr = (j8.g[]) bc.k(parcel, readInt18, j8.g.CREATOR);
                            break;
                        case 6:
                            bc.n(parcel, readInt18);
                            break;
                        default:
                            bc.y(parcel, readInt18);
                            break;
                    }
                }
                bc.m(parcel, z42);
                return new LocationAvailability(i12, i13, i14, j12, gVarArr);
            case 23:
                int z43 = bc.z(parcel);
                WorkSource workSource = new WorkSource();
                int i15 = 102;
                long j13 = 3600000;
                long j14 = 600000;
                long j15 = 0;
                long j16 = Long.MAX_VALUE;
                long j17 = Long.MAX_VALUE;
                int i16 = Integer.MAX_VALUE;
                float f10 = 0.0f;
                boolean z44 = false;
                int i17 = 0;
                int i18 = 0;
                boolean z45 = false;
                long j18 = -1;
                String str11 = null;
                u7.j jVar2 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            i15 = bc.u(parcel, readInt19);
                            break;
                        case 2:
                            j13 = bc.w(parcel, readInt19);
                            break;
                        case 3:
                            j14 = bc.w(parcel, readInt19);
                            break;
                        case 4:
                        default:
                            bc.y(parcel, readInt19);
                            break;
                        case 5:
                            j16 = bc.w(parcel, readInt19);
                            break;
                        case 6:
                            i16 = bc.u(parcel, readInt19);
                            break;
                        case 7:
                            f10 = bc.r(parcel, readInt19);
                            break;
                        case '\b':
                            j15 = bc.w(parcel, readInt19);
                            break;
                        case '\t':
                            z44 = bc.n(parcel, readInt19);
                            break;
                        case '\n':
                            j17 = bc.w(parcel, readInt19);
                            break;
                        case 11:
                            j18 = bc.w(parcel, readInt19);
                            break;
                        case '\f':
                            i17 = bc.u(parcel, readInt19);
                            break;
                        case '\r':
                            i18 = bc.u(parcel, readInt19);
                            break;
                        case 14:
                            str11 = bc.h(parcel, readInt19);
                            break;
                        case 15:
                            z45 = bc.n(parcel, readInt19);
                            break;
                        case 16:
                            workSource = (WorkSource) bc.g(parcel, readInt19, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar2 = (u7.j) bc.g(parcel, readInt19, u7.j.CREATOR);
                            break;
                    }
                }
                bc.m(parcel, z43);
                return new LocationRequest(i15, j13, j14, j15, j16, j17, i16, f10, z44, j18, i17, i18, str11, z45, workSource, jVar2);
            case 24:
                int z46 = bc.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z46) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        bc.y(parcel, readInt20);
                    } else {
                        list = bc.l(parcel, readInt20, Location.CREATOR);
                    }
                }
                bc.m(parcel, z46);
                return new LocationResult(list);
            case 25:
                int z47 = bc.z(parcel);
                ArrayList arrayList2 = null;
                boolean z48 = false;
                boolean z49 = false;
                while (parcel.dataPosition() < z47) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 1) {
                        arrayList2 = bc.l(parcel, readInt21, LocationRequest.CREATOR);
                    } else if (c16 == 2) {
                        z48 = bc.n(parcel, readInt21);
                    } else if (c16 != 3) {
                        bc.y(parcel, readInt21);
                    } else {
                        z49 = bc.n(parcel, readInt21);
                    }
                }
                bc.m(parcel, z47);
                return new j8.c(arrayList2, z48, z49);
            case 26:
                int z50 = bc.z(parcel);
                boolean z51 = false;
                long j19 = 0;
                long j20 = 0;
                while (parcel.dataPosition() < z50) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 1) {
                        z51 = bc.n(parcel, readInt22);
                    } else if (c17 == 2) {
                        j20 = bc.w(parcel, readInt22);
                    } else if (c17 != 3) {
                        bc.y(parcel, readInt22);
                    } else {
                        j19 = bc.w(parcel, readInt22);
                    }
                }
                bc.m(parcel, z50);
                return new l6.b(j19, j20, z51);
            case 27:
                int z52 = bc.z(parcel);
                b2 b2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                n8.a[] aVarArr = null;
                boolean z53 = true;
                while (parcel.dataPosition() < z52) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            b2Var = (b2) bc.g(parcel, readInt23, b2.CREATOR);
                            break;
                        case 3:
                            bArr = bc.b(parcel, readInt23);
                            break;
                        case 4:
                            iArr = bc.d(parcel, readInt23);
                            break;
                        case 5:
                            strArr = bc.i(parcel, readInt23);
                            break;
                        case 6:
                            iArr2 = bc.d(parcel, readInt23);
                            break;
                        case 7:
                            bArr2 = bc.c(parcel, readInt23);
                            break;
                        case '\b':
                            z53 = bc.n(parcel, readInt23);
                            break;
                        case '\t':
                            aVarArr = (n8.a[]) bc.k(parcel, readInt23, n8.a.CREATOR);
                            break;
                        default:
                            bc.y(parcel, readInt23);
                            break;
                    }
                }
                bc.m(parcel, z52);
                return new l6.c(b2Var, bArr, iArr, strArr, iArr2, bArr2, z53, aVarArr);
            case 28:
                n0 n0Var = new n0(parcel);
                n0Var.a = parcel.readByte() != 0;
                return n0Var;
            default:
                int z54 = bc.z(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < z54) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        bc.y(parcel, readInt24);
                    } else {
                        intent = (Intent) bc.g(parcel, readInt24, Intent.CREATOR);
                    }
                }
                bc.m(parcel, z54);
                return new m6.a(intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new a[i7];
            case 1:
                return new c[i7];
            case 2:
                return new d[i7];
            case 3:
                return new e[i7];
            case 4:
                return new f[i7];
            case 5:
                return new g[i7];
            case 6:
                return new h[i7];
            case 7:
                return new i[i7];
            case 8:
                return new j[i7];
            case 9:
                return new k[i7];
            case 10:
                return new GetCredentialRequest[i7];
            case 11:
                return new l[i7];
            case 12:
                return new m[i7];
            case 13:
                return new n[i7];
            case 14:
                return new o[i7];
            case 15:
                return new p[i7];
            case 16:
                return new q[i7];
            case 17:
                return new r[i7];
            case 18:
                return new j8.e[i7];
            case 19:
                return new j8.f[i7];
            case 20:
                return new j8.g[i7];
            case 21:
                return new j8.a[i7];
            case 22:
                return new LocationAvailability[i7];
            case 23:
                return new LocationRequest[i7];
            case 24:
                return new LocationResult[i7];
            case 25:
                return new j8.c[i7];
            case 26:
                return new l6.b[i7];
            case 27:
                return new l6.c[i7];
            case 28:
                return new n0[i7];
            default:
                return new m6.a[i7];
        }
    }
}
