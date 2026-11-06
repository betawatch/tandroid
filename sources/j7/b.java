package j7;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.WorkSource;
import c8.wb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import m.o0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z9 = wb.z(parcel);
                boolean z10 = false;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        wb.y(parcel, readInt);
                    } else {
                        z10 = wb.n(parcel, readInt);
                    }
                }
                wb.m(parcel, z9);
                return new a(z10);
            case 1:
                int z11 = wb.z(parcel);
                while (parcel.dataPosition() < z11) {
                    wb.y(parcel, parcel.readInt());
                }
                wb.m(parcel, z11);
                return new c();
            case 2:
                int z12 = wb.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        wb.y(parcel, readInt2);
                    } else {
                        z13 = wb.n(parcel, readInt2);
                    }
                }
                wb.m(parcel, z12);
                return new d(z13);
            case 3:
                int z14 = wb.z(parcel);
                boolean z15 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        wb.y(parcel, readInt3);
                    } else {
                        z15 = wb.n(parcel, readInt3);
                    }
                }
                wb.m(parcel, z14);
                return new e(z15);
            case 4:
                int z16 = wb.z(parcel);
                PendingIntent pendingIntent = null;
                h hVar = null;
                while (parcel.dataPosition() < z16) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        pendingIntent = (PendingIntent) wb.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c10 != 2) {
                        wb.y(parcel, readInt4);
                    } else {
                        hVar = (h) wb.g(parcel, readInt4, h.CREATOR);
                    }
                }
                wb.m(parcel, z16);
                return new f(pendingIntent, hVar);
            case 5:
                int z17 = wb.z(parcel);
                String str = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str2 = null;
                String str3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z17) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str = wb.h(parcel, readInt5);
                            break;
                        case 2:
                            bundle = wb.a(parcel, readInt5);
                            break;
                        case 3:
                            bundle2 = wb.a(parcel, readInt5);
                            break;
                        case 4:
                            str2 = wb.h(parcel, readInt5);
                            break;
                        case 5:
                            str3 = wb.h(parcel, readInt5);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) wb.g(parcel, readInt5, ResultReceiver.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt5);
                            break;
                    }
                }
                wb.m(parcel, z17);
                return new g(str, bundle, bundle2, str2, str3, resultReceiver);
            case 6:
                int z18 = wb.z(parcel);
                String str4 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        str4 = wb.h(parcel, readInt6);
                    } else if (c11 != 2) {
                        wb.y(parcel, readInt6);
                    } else {
                        bundle3 = wb.a(parcel, readInt6);
                    }
                }
                wb.m(parcel, z18);
                return new h(str4, bundle3);
            case 7:
                int z19 = wb.z(parcel);
                String str5 = "";
                String str6 = str5;
                String str7 = str6;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str8 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str5 = wb.h(parcel, readInt7);
                            break;
                        case 2:
                            bundle4 = wb.a(parcel, readInt7);
                            break;
                        case 3:
                            bundle5 = wb.a(parcel, readInt7);
                            break;
                        case 4:
                            str8 = wb.h(parcel, readInt7);
                            break;
                        case 5:
                            str6 = wb.h(parcel, readInt7);
                            break;
                        case 6:
                            str7 = wb.h(parcel, readInt7);
                            break;
                        default:
                            wb.y(parcel, readInt7);
                            break;
                    }
                }
                wb.m(parcel, z19);
                return new i(str5, bundle4, bundle5, str8, str6, str7);
            case 8:
                int z20 = wb.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        wb.y(parcel, readInt8);
                    } else {
                        bundle6 = wb.a(parcel, readInt8);
                    }
                }
                wb.m(parcel, z20);
                return new j(bundle6);
            case 9:
                int z21 = wb.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        wb.y(parcel, readInt9);
                    } else {
                        bundle7 = wb.a(parcel, readInt9);
                    }
                }
                wb.m(parcel, z21);
                return new k(bundle7);
            case 10:
                int z22 = wb.z(parcel);
                ArrayList arrayList = null;
                Bundle bundle8 = null;
                String str9 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    char c12 = (char) readInt10;
                    if (c12 == 1) {
                        arrayList = wb.l(parcel, readInt10, i.CREATOR);
                    } else if (c12 == 2) {
                        bundle8 = wb.a(parcel, readInt10);
                    } else if (c12 == 3) {
                        str9 = wb.h(parcel, readInt10);
                    } else if (c12 != 4) {
                        wb.y(parcel, readInt10);
                    } else {
                        resultReceiver2 = (ResultReceiver) wb.g(parcel, readInt10, ResultReceiver.CREATOR);
                    }
                }
                wb.m(parcel, z22);
                return new GetCredentialRequest(arrayList, bundle8, str9, resultReceiver2);
            case 11:
                int z23 = wb.z(parcel);
                Bundle bundle9 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        wb.y(parcel, readInt11);
                    } else {
                        bundle9 = wb.a(parcel, readInt11);
                    }
                }
                wb.m(parcel, z23);
                return new l(bundle9);
            case 12:
                int z24 = wb.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        wb.y(parcel, readInt12);
                    } else {
                        pendingIntent2 = (PendingIntent) wb.g(parcel, readInt12, PendingIntent.CREATOR);
                    }
                }
                wb.m(parcel, z24);
                return new m(pendingIntent2);
            case 13:
                int z25 = wb.z(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        wb.y(parcel, readInt13);
                    } else {
                        pendingIntent3 = (PendingIntent) wb.g(parcel, readInt13, PendingIntent.CREATOR);
                    }
                }
                wb.m(parcel, z25);
                return new n(pendingIntent3);
            case 14:
                int z26 = wb.z(parcel);
                while (parcel.dataPosition() < z26) {
                    wb.y(parcel, parcel.readInt());
                }
                wb.m(parcel, z26);
                return new o();
            case 15:
                int z27 = wb.z(parcel);
                while (parcel.dataPosition() < z27) {
                    wb.y(parcel, parcel.readInt());
                }
                wb.m(parcel, z27);
                return new p();
            case 16:
                int z28 = wb.z(parcel);
                while (parcel.dataPosition() < z28) {
                    wb.y(parcel, parcel.readInt());
                }
                wb.m(parcel, z28);
                return new q();
            case 17:
                int z29 = wb.z(parcel);
                while (parcel.dataPosition() < z29) {
                    wb.y(parcel, parcel.readInt());
                }
                wb.m(parcel, z29);
                return new r();
            case 18:
                int z30 = wb.z(parcel);
                Status status = null;
                j8.f fVar = null;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    char c13 = (char) readInt14;
                    if (c13 == 1) {
                        status = (Status) wb.g(parcel, readInt14, Status.CREATOR);
                    } else if (c13 != 2) {
                        wb.y(parcel, readInt14);
                    } else {
                        fVar = (j8.f) wb.g(parcel, readInt14, j8.f.CREATOR);
                    }
                }
                wb.m(parcel, z30);
                return new j8.e(status, fVar);
            case 19:
                int z31 = wb.z(parcel);
                boolean z32 = false;
                boolean z33 = false;
                boolean z34 = false;
                boolean z35 = false;
                boolean z36 = false;
                boolean z37 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            z32 = wb.n(parcel, readInt15);
                            break;
                        case 2:
                            z33 = wb.n(parcel, readInt15);
                            break;
                        case 3:
                            z34 = wb.n(parcel, readInt15);
                            break;
                        case 4:
                            z35 = wb.n(parcel, readInt15);
                            break;
                        case 5:
                            z36 = wb.n(parcel, readInt15);
                            break;
                        case 6:
                            z37 = wb.n(parcel, readInt15);
                            break;
                        default:
                            wb.y(parcel, readInt15);
                            break;
                    }
                }
                wb.m(parcel, z31);
                return new j8.f(z32, z33, z34, z35, z36, z37);
            case 20:
                int z38 = wb.z(parcel);
                int i7 = 1;
                int i10 = 1;
                long j3 = -1;
                long j10 = -1;
                while (parcel.dataPosition() < z38) {
                    int readInt16 = parcel.readInt();
                    char c14 = (char) readInt16;
                    if (c14 == 1) {
                        i7 = wb.u(parcel, readInt16);
                    } else if (c14 == 2) {
                        i10 = wb.u(parcel, readInt16);
                    } else if (c14 == 3) {
                        j3 = wb.w(parcel, readInt16);
                    } else if (c14 != 4) {
                        wb.y(parcel, readInt16);
                    } else {
                        j10 = wb.w(parcel, readInt16);
                    }
                }
                wb.m(parcel, z38);
                return new j8.g(j3, j10, i7, i10);
            case 21:
                int z39 = wb.z(parcel);
                long j11 = Long.MAX_VALUE;
                int i11 = 0;
                boolean z40 = false;
                String str10 = null;
                u7.j jVar = null;
                while (parcel.dataPosition() < z39) {
                    int readInt17 = parcel.readInt();
                    char c15 = (char) readInt17;
                    if (c15 == 1) {
                        j11 = wb.w(parcel, readInt17);
                    } else if (c15 == 2) {
                        i11 = wb.u(parcel, readInt17);
                    } else if (c15 == 3) {
                        z40 = wb.n(parcel, readInt17);
                    } else if (c15 == 4) {
                        str10 = wb.h(parcel, readInt17);
                    } else if (c15 != 5) {
                        wb.y(parcel, readInt17);
                    } else {
                        jVar = (u7.j) wb.g(parcel, readInt17, u7.j.CREATOR);
                    }
                }
                wb.m(parcel, z39);
                return new j8.a(j11, i11, z40, str10, jVar);
            case 22:
                int z41 = wb.z(parcel);
                int i12 = 1000;
                int i13 = 1;
                int i14 = 1;
                long j12 = 0;
                j8.g[] gVarArr = null;
                while (parcel.dataPosition() < z41) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            i13 = wb.u(parcel, readInt18);
                            break;
                        case 2:
                            i14 = wb.u(parcel, readInt18);
                            break;
                        case 3:
                            j12 = wb.w(parcel, readInt18);
                            break;
                        case 4:
                            i12 = wb.u(parcel, readInt18);
                            break;
                        case 5:
                            gVarArr = (j8.g[]) wb.k(parcel, readInt18, j8.g.CREATOR);
                            break;
                        case 6:
                            wb.n(parcel, readInt18);
                            break;
                        default:
                            wb.y(parcel, readInt18);
                            break;
                    }
                }
                wb.m(parcel, z41);
                return new LocationAvailability(i12, i13, i14, j12, gVarArr);
            case 23:
                int z42 = wb.z(parcel);
                WorkSource workSource = new WorkSource();
                int i15 = 102;
                long j13 = 3600000;
                long j14 = 600000;
                long j15 = 0;
                long j16 = Long.MAX_VALUE;
                long j17 = Long.MAX_VALUE;
                int i16 = Integer.MAX_VALUE;
                float f10 = 0.0f;
                boolean z43 = false;
                int i17 = 0;
                int i18 = 0;
                boolean z44 = false;
                long j18 = -1;
                String str11 = null;
                u7.j jVar2 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            i15 = wb.u(parcel, readInt19);
                            break;
                        case 2:
                            j13 = wb.w(parcel, readInt19);
                            break;
                        case 3:
                            j14 = wb.w(parcel, readInt19);
                            break;
                        case 4:
                        default:
                            wb.y(parcel, readInt19);
                            break;
                        case 5:
                            j16 = wb.w(parcel, readInt19);
                            break;
                        case 6:
                            i16 = wb.u(parcel, readInt19);
                            break;
                        case 7:
                            f10 = wb.r(parcel, readInt19);
                            break;
                        case '\b':
                            j15 = wb.w(parcel, readInt19);
                            break;
                        case '\t':
                            z43 = wb.n(parcel, readInt19);
                            break;
                        case '\n':
                            j17 = wb.w(parcel, readInt19);
                            break;
                        case 11:
                            j18 = wb.w(parcel, readInt19);
                            break;
                        case '\f':
                            i17 = wb.u(parcel, readInt19);
                            break;
                        case '\r':
                            i18 = wb.u(parcel, readInt19);
                            break;
                        case 14:
                            str11 = wb.h(parcel, readInt19);
                            break;
                        case 15:
                            z44 = wb.n(parcel, readInt19);
                            break;
                        case 16:
                            workSource = (WorkSource) wb.g(parcel, readInt19, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar2 = (u7.j) wb.g(parcel, readInt19, u7.j.CREATOR);
                            break;
                    }
                }
                wb.m(parcel, z42);
                return new LocationRequest(i15, j13, j14, j15, j16, j17, i16, f10, z43, j18, i17, i18, str11, z44, workSource, jVar2);
            case 24:
                int z45 = wb.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z45) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        wb.y(parcel, readInt20);
                    } else {
                        list = wb.l(parcel, readInt20, Location.CREATOR);
                    }
                }
                wb.m(parcel, z45);
                return new LocationResult(list);
            case 25:
                int z46 = wb.z(parcel);
                ArrayList arrayList2 = null;
                boolean z47 = false;
                boolean z48 = false;
                while (parcel.dataPosition() < z46) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 1) {
                        arrayList2 = wb.l(parcel, readInt21, LocationRequest.CREATOR);
                    } else if (c16 == 2) {
                        z47 = wb.n(parcel, readInt21);
                    } else if (c16 != 3) {
                        wb.y(parcel, readInt21);
                    } else {
                        z48 = wb.n(parcel, readInt21);
                    }
                }
                wb.m(parcel, z46);
                return new j8.c(arrayList2, z47, z48);
            case 26:
                int z49 = wb.z(parcel);
                boolean z50 = false;
                long j19 = 0;
                long j20 = 0;
                while (parcel.dataPosition() < z49) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 1) {
                        z50 = wb.n(parcel, readInt22);
                    } else if (c17 == 2) {
                        j20 = wb.w(parcel, readInt22);
                    } else if (c17 != 3) {
                        wb.y(parcel, readInt22);
                    } else {
                        j19 = wb.w(parcel, readInt22);
                    }
                }
                wb.m(parcel, z49);
                return new l6.b(j19, j20, z50);
            case 27:
                int z51 = wb.z(parcel);
                c2 c2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                n8.a[] aVarArr = null;
                boolean z52 = true;
                while (parcel.dataPosition() < z51) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            c2Var = (c2) wb.g(parcel, readInt23, c2.CREATOR);
                            break;
                        case 3:
                            bArr = wb.b(parcel, readInt23);
                            break;
                        case 4:
                            iArr = wb.d(parcel, readInt23);
                            break;
                        case 5:
                            strArr = wb.i(parcel, readInt23);
                            break;
                        case 6:
                            iArr2 = wb.d(parcel, readInt23);
                            break;
                        case 7:
                            bArr2 = wb.c(parcel, readInt23);
                            break;
                        case '\b':
                            z52 = wb.n(parcel, readInt23);
                            break;
                        case '\t':
                            aVarArr = (n8.a[]) wb.k(parcel, readInt23, n8.a.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt23);
                            break;
                    }
                }
                wb.m(parcel, z51);
                return new l6.c(c2Var, bArr, iArr, strArr, iArr2, bArr2, z52, aVarArr);
            case 28:
                o0 o0Var = new o0(parcel);
                o0Var.a = parcel.readByte() != 0;
                return o0Var;
            default:
                int z53 = wb.z(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < z53) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        wb.y(parcel, readInt24);
                    } else {
                        intent = (Intent) wb.g(parcel, readInt24, Intent.CREATOR);
                    }
                }
                wb.m(parcel, z53);
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
                return new o0[i7];
            default:
                return new m6.a[i7];
        }
    }
}
