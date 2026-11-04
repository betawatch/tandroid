package i7;

import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import gi.v5;
import java.util.ArrayList;
import java.util.List;
import m.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i3) {
        this.a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                while (parcel.dataPosition() < z10) {
                    g6.e.y(parcel, parcel.readInt());
                }
                g6.e.m(parcel, z10);
                return new o();
            case 1:
                int z11 = g6.e.z(parcel);
                while (parcel.dataPosition() < z11) {
                    g6.e.y(parcel, parcel.readInt());
                }
                g6.e.m(parcel, z11);
                return new q();
            case 2:
                int z12 = g6.e.z(parcel);
                while (parcel.dataPosition() < z12) {
                    g6.e.y(parcel, parcel.readInt());
                }
                g6.e.m(parcel, z12);
                return new r();
            case 3:
                int z13 = g6.e.z(parcel);
                Status status = null;
                i8.f fVar = null;
                while (parcel.dataPosition() < z13) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        status = (Status) g6.e.g(parcel, readInt, Status.CREATOR);
                    } else if (c2 != 2) {
                        g6.e.y(parcel, readInt);
                    } else {
                        fVar = (i8.f) g6.e.g(parcel, readInt, i8.f.CREATOR);
                    }
                }
                g6.e.m(parcel, z13);
                return new i8.e(status, fVar);
            case 4:
                int z14 = g6.e.z(parcel);
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            z15 = g6.e.n(parcel, readInt2);
                            break;
                        case 2:
                            z16 = g6.e.n(parcel, readInt2);
                            break;
                        case 3:
                            z17 = g6.e.n(parcel, readInt2);
                            break;
                        case 4:
                            z18 = g6.e.n(parcel, readInt2);
                            break;
                        case 5:
                            z19 = g6.e.n(parcel, readInt2);
                            break;
                        case 6:
                            z20 = g6.e.n(parcel, readInt2);
                            break;
                        default:
                            g6.e.y(parcel, readInt2);
                            break;
                    }
                }
                g6.e.m(parcel, z14);
                return new i8.f(z15, z16, z17, z18, z19, z20);
            case 5:
                int z21 = g6.e.z(parcel);
                int i3 = 1;
                int i10 = 1;
                long j10 = -1;
                long j11 = -1;
                while (parcel.dataPosition() < z21) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i3 = g6.e.u(parcel, readInt3);
                    } else if (c10 == 2) {
                        i10 = g6.e.u(parcel, readInt3);
                    } else if (c10 == 3) {
                        j10 = g6.e.w(parcel, readInt3);
                    } else if (c10 != 4) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        j11 = g6.e.w(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z21);
                return new i8.g(j10, j11, i3, i10);
            case 6:
                int z22 = g6.e.z(parcel);
                long j12 = Long.MAX_VALUE;
                int i11 = 0;
                boolean z23 = false;
                String str = null;
                t7.j jVar = null;
                while (parcel.dataPosition() < z22) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        j12 = g6.e.w(parcel, readInt4);
                    } else if (c11 == 2) {
                        i11 = g6.e.u(parcel, readInt4);
                    } else if (c11 == 3) {
                        z23 = g6.e.n(parcel, readInt4);
                    } else if (c11 == 4) {
                        str = g6.e.h(parcel, readInt4);
                    } else if (c11 != 5) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        jVar = (t7.j) g6.e.g(parcel, readInt4, t7.j.CREATOR);
                    }
                }
                g6.e.m(parcel, z22);
                return new i8.a(j12, i11, z23, str, jVar);
            case 7:
                int z24 = g6.e.z(parcel);
                int i12 = 1000;
                int i13 = 1;
                int i14 = 1;
                long j13 = 0;
                i8.g[] gVarArr = null;
                while (parcel.dataPosition() < z24) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i13 = g6.e.u(parcel, readInt5);
                            break;
                        case 2:
                            i14 = g6.e.u(parcel, readInt5);
                            break;
                        case 3:
                            j13 = g6.e.w(parcel, readInt5);
                            break;
                        case 4:
                            i12 = g6.e.u(parcel, readInt5);
                            break;
                        case 5:
                            gVarArr = (i8.g[]) g6.e.k(parcel, readInt5, i8.g.CREATOR);
                            break;
                        case 6:
                            g6.e.n(parcel, readInt5);
                            break;
                        default:
                            g6.e.y(parcel, readInt5);
                            break;
                    }
                }
                g6.e.m(parcel, z24);
                return new LocationAvailability(i12, i13, i14, j13, gVarArr);
            case 8:
                int z25 = g6.e.z(parcel);
                WorkSource workSource = new WorkSource();
                int i15 = 102;
                long j14 = 3600000;
                long j15 = 600000;
                long j16 = 0;
                long j17 = Long.MAX_VALUE;
                long j18 = Long.MAX_VALUE;
                int i16 = Integer.MAX_VALUE;
                float f10 = 0.0f;
                boolean z26 = false;
                int i17 = 0;
                int i18 = 0;
                boolean z27 = false;
                long j19 = -1;
                String str2 = null;
                t7.j jVar2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i15 = g6.e.u(parcel, readInt6);
                            break;
                        case 2:
                            j14 = g6.e.w(parcel, readInt6);
                            break;
                        case 3:
                            j15 = g6.e.w(parcel, readInt6);
                            break;
                        case 4:
                        default:
                            g6.e.y(parcel, readInt6);
                            break;
                        case 5:
                            j17 = g6.e.w(parcel, readInt6);
                            break;
                        case 6:
                            i16 = g6.e.u(parcel, readInt6);
                            break;
                        case 7:
                            f10 = g6.e.r(parcel, readInt6);
                            break;
                        case '\b':
                            j16 = g6.e.w(parcel, readInt6);
                            break;
                        case '\t':
                            z26 = g6.e.n(parcel, readInt6);
                            break;
                        case '\n':
                            j18 = g6.e.w(parcel, readInt6);
                            break;
                        case 11:
                            j19 = g6.e.w(parcel, readInt6);
                            break;
                        case '\f':
                            i17 = g6.e.u(parcel, readInt6);
                            break;
                        case '\r':
                            i18 = g6.e.u(parcel, readInt6);
                            break;
                        case 14:
                            str2 = g6.e.h(parcel, readInt6);
                            break;
                        case 15:
                            z27 = g6.e.n(parcel, readInt6);
                            break;
                        case 16:
                            workSource = (WorkSource) g6.e.g(parcel, readInt6, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar2 = (t7.j) g6.e.g(parcel, readInt6, t7.j.CREATOR);
                            break;
                    }
                }
                g6.e.m(parcel, z25);
                return new LocationRequest(i15, j14, j15, j16, j17, j18, i16, f10, z26, j19, i17, i18, str2, z27, workSource, jVar2);
            case 9:
                int z28 = g6.e.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z28) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        g6.e.y(parcel, readInt7);
                    } else {
                        list = g6.e.l(parcel, readInt7, Location.CREATOR);
                    }
                }
                g6.e.m(parcel, z28);
                return new LocationResult(list);
            case 10:
                int z29 = g6.e.z(parcel);
                ArrayList arrayList = null;
                boolean z30 = false;
                boolean z31 = false;
                while (parcel.dataPosition() < z29) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 1) {
                        arrayList = g6.e.l(parcel, readInt8, LocationRequest.CREATOR);
                    } else if (c12 == 2) {
                        z30 = g6.e.n(parcel, readInt8);
                    } else if (c12 != 3) {
                        g6.e.y(parcel, readInt8);
                    } else {
                        z31 = g6.e.n(parcel, readInt8);
                    }
                }
                g6.e.m(parcel, z29);
                return new i8.c(arrayList, z30, z31);
            case 11:
                int z32 = g6.e.z(parcel);
                boolean z33 = false;
                long j20 = 0;
                long j21 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 1) {
                        z33 = g6.e.n(parcel, readInt9);
                    } else if (c13 == 2) {
                        j21 = g6.e.w(parcel, readInt9);
                    } else if (c13 != 3) {
                        g6.e.y(parcel, readInt9);
                    } else {
                        j20 = g6.e.w(parcel, readInt9);
                    }
                }
                g6.e.m(parcel, z32);
                return new k6.b(j20, j21, z33);
            case 12:
                int z34 = g6.e.z(parcel);
                b2 b2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                m8.a[] aVarArr = null;
                boolean z35 = true;
                while (parcel.dataPosition() < z34) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            b2Var = (b2) g6.e.g(parcel, readInt10, b2.CREATOR);
                            break;
                        case 3:
                            bArr = g6.e.b(parcel, readInt10);
                            break;
                        case 4:
                            iArr = g6.e.d(parcel, readInt10);
                            break;
                        case 5:
                            strArr = g6.e.i(parcel, readInt10);
                            break;
                        case 6:
                            iArr2 = g6.e.d(parcel, readInt10);
                            break;
                        case 7:
                            bArr2 = g6.e.c(parcel, readInt10);
                            break;
                        case '\b':
                            z35 = g6.e.n(parcel, readInt10);
                            break;
                        case '\t':
                            aVarArr = (m8.a[]) g6.e.k(parcel, readInt10, m8.a.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt10);
                            break;
                    }
                }
                g6.e.m(parcel, z34);
                return new k6.c(b2Var, bArr, iArr, strArr, iArr2, bArr2, z35, aVarArr);
            case 13:
                int z36 = g6.e.z(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < z36) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        g6.e.y(parcel, readInt11);
                    } else {
                        intent = (Intent) g6.e.g(parcel, readInt11, Intent.CREATOR);
                    }
                }
                g6.e.m(parcel, z36);
                return new l6.a(intent);
            case 14:
                return new l6.f(parcel.readStrongBinder());
            case 15:
                int z37 = g6.e.z(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                int i19 = 0;
                while (parcel.dataPosition() < z37) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str3 = g6.e.h(parcel, readInt12);
                            break;
                        case 2:
                            str4 = g6.e.h(parcel, readInt12);
                            break;
                        case 3:
                            str5 = g6.e.h(parcel, readInt12);
                            break;
                        case 4:
                            str6 = g6.e.h(parcel, readInt12);
                            break;
                        case 5:
                            str7 = g6.e.h(parcel, readInt12);
                            break;
                        case 6:
                            i19 = g6.e.u(parcel, readInt12);
                            break;
                        case 7:
                            str8 = g6.e.h(parcel, readInt12);
                            break;
                        default:
                            g6.e.y(parcel, readInt12);
                            break;
                    }
                }
                g6.e.m(parcel, z37);
                return new l6.b(str3, str4, str5, str6, str7, i19, str8);
            case 16:
                int z38 = g6.e.z(parcel);
                LatLng latLng = null;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                while (parcel.dataPosition() < z38) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 2) {
                        latLng = (LatLng) g6.e.g(parcel, readInt13, LatLng.CREATOR);
                    } else if (c14 == 3) {
                        f11 = g6.e.r(parcel, readInt13);
                    } else if (c14 == 4) {
                        f12 = g6.e.r(parcel, readInt13);
                    } else if (c14 != 5) {
                        g6.e.y(parcel, readInt13);
                    } else {
                        f13 = g6.e.r(parcel, readInt13);
                    }
                }
                g6.e.m(parcel, z38);
                return new CameraPosition(latLng, f11, f12, f13);
            case 17:
                int z39 = g6.e.z(parcel);
                LatLng latLng2 = null;
                float f14 = 0.0f;
                int i20 = 0;
                int i21 = 0;
                boolean z40 = false;
                boolean z41 = false;
                double d = 0.0d;
                float f15 = 0.0f;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            latLng2 = (LatLng) g6.e.g(parcel, readInt14, LatLng.CREATOR);
                            break;
                        case 3:
                            d = g6.e.q(parcel, readInt14);
                            break;
                        case 4:
                            f15 = g6.e.r(parcel, readInt14);
                            break;
                        case 5:
                            i20 = g6.e.u(parcel, readInt14);
                            break;
                        case 6:
                            i21 = g6.e.u(parcel, readInt14);
                            break;
                        case 7:
                            f14 = g6.e.r(parcel, readInt14);
                            break;
                        case '\b':
                            z40 = g6.e.n(parcel, readInt14);
                            break;
                        case '\t':
                            z41 = g6.e.n(parcel, readInt14);
                            break;
                        case '\n':
                            arrayList2 = g6.e.l(parcel, readInt14, l8.h.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt14);
                            break;
                    }
                }
                g6.e.m(parcel, z39);
                l8.b bVar = new l8.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f15;
                bVar.d = i20;
                bVar.e = i21;
                bVar.f = f14;
                bVar.h = z40;
                bVar.n = z41;
                bVar.r = arrayList2;
                return bVar;
            case 18:
                int z42 = g6.e.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt15 = parcel.readInt();
                    char c15 = (char) readInt15;
                    if (c15 == 2) {
                        latLng3 = (LatLng) g6.e.g(parcel, readInt15, LatLng.CREATOR);
                    } else if (c15 != 3) {
                        g6.e.y(parcel, readInt15);
                    } else {
                        latLng4 = (LatLng) g6.e.g(parcel, readInt15, LatLng.CREATOR);
                    }
                }
                g6.e.m(parcel, z42);
                return new LatLngBounds(latLng3, latLng4);
            case 19:
                int z43 = g6.e.z(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z43) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 2) {
                        d10 = g6.e.q(parcel, readInt16);
                    } else if (c16 != 3) {
                        g6.e.y(parcel, readInt16);
                    } else {
                        d11 = g6.e.q(parcel, readInt16);
                    }
                }
                g6.e.m(parcel, z43);
                return new LatLng(d10, d11);
            case 20:
                int z44 = g6.e.z(parcel);
                String str9 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 2) {
                        g6.e.y(parcel, readInt17);
                    } else {
                        str9 = g6.e.h(parcel, readInt17);
                    }
                }
                g6.e.m(parcel, z44);
                return new l8.e(str9);
            case 21:
                int z45 = g6.e.z(parcel);
                boolean z46 = false;
                boolean z47 = false;
                boolean z48 = false;
                float f16 = 0.5f;
                float f17 = 1.0f;
                LatLng latLng5 = null;
                String str10 = null;
                String str11 = null;
                IBinder iBinder = null;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                float f22 = 0.0f;
                while (parcel.dataPosition() < z45) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            latLng5 = (LatLng) g6.e.g(parcel, readInt18, LatLng.CREATOR);
                            break;
                        case 3:
                            str10 = g6.e.h(parcel, readInt18);
                            break;
                        case 4:
                            str11 = g6.e.h(parcel, readInt18);
                            break;
                        case 5:
                            iBinder = g6.e.t(parcel, readInt18);
                            break;
                        case 6:
                            f18 = g6.e.r(parcel, readInt18);
                            break;
                        case 7:
                            f19 = g6.e.r(parcel, readInt18);
                            break;
                        case '\b':
                            z46 = g6.e.n(parcel, readInt18);
                            break;
                        case '\t':
                            z47 = g6.e.n(parcel, readInt18);
                            break;
                        case '\n':
                            z48 = g6.e.n(parcel, readInt18);
                            break;
                        case 11:
                            f20 = g6.e.r(parcel, readInt18);
                            break;
                        case '\f':
                            f16 = g6.e.r(parcel, readInt18);
                            break;
                        case '\r':
                            f21 = g6.e.r(parcel, readInt18);
                            break;
                        case 14:
                            f17 = g6.e.r(parcel, readInt18);
                            break;
                        case 15:
                            f22 = g6.e.r(parcel, readInt18);
                            break;
                        default:
                            g6.e.y(parcel, readInt18);
                            break;
                    }
                }
                g6.e.m(parcel, z45);
                l8.g gVar = new l8.g();
                gVar.e = 0.5f;
                gVar.f = 1.0f;
                gVar.n = true;
                gVar.r = false;
                gVar.s = 0.0f;
                gVar.w = 0.5f;
                gVar.x = 0.0f;
                gVar.y = 1.0f;
                gVar.a = latLng5;
                gVar.b = str10;
                gVar.c = str11;
                if (iBinder == null) {
                    gVar.d = null;
                } else {
                    gVar.d = new v5(z6.b.M0(iBinder));
                }
                gVar.e = f18;
                gVar.f = f19;
                gVar.h = z46;
                gVar.n = z47;
                gVar.r = z48;
                gVar.s = f20;
                gVar.w = f16;
                gVar.x = f21;
                gVar.y = f17;
                gVar.E = f22;
                return gVar;
            case 22:
                int z49 = g6.e.z(parcel);
                int i22 = 0;
                Float f23 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt19 = parcel.readInt();
                    char c17 = (char) readInt19;
                    if (c17 == 2) {
                        i22 = g6.e.u(parcel, readInt19);
                    } else if (c17 != 3) {
                        g6.e.y(parcel, readInt19);
                    } else {
                        f23 = g6.e.s(parcel, readInt19);
                    }
                }
                g6.e.m(parcel, z49);
                return new l8.h(i22, f23);
            case 23:
                n0 n0Var = new n0(parcel);
                n0Var.a = parcel.readByte() != 0;
                return n0Var;
            case 24:
                int z50 = g6.e.z(parcel);
                PendingIntent pendingIntent = null;
                String str12 = null;
                Integer num = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z50) {
                    int readInt20 = parcel.readInt();
                    char c18 = (char) readInt20;
                    if (c18 == 1) {
                        i23 = g6.e.u(parcel, readInt20);
                    } else if (c18 == 2) {
                        i24 = g6.e.u(parcel, readInt20);
                    } else if (c18 == 3) {
                        pendingIntent = (PendingIntent) g6.e.g(parcel, readInt20, PendingIntent.CREATOR);
                    } else if (c18 == 4) {
                        str12 = g6.e.h(parcel, readInt20);
                    } else if (c18 != 5) {
                        g6.e.y(parcel, readInt20);
                    } else {
                        num = g6.e.v(parcel, readInt20);
                    }
                }
                g6.e.m(parcel, z50);
                return new m6.a(i23, i24, pendingIntent, str12, num);
            case 25:
                int z51 = g6.e.z(parcel);
                int i25 = 0;
                boolean z52 = false;
                long j22 = -1;
                String str13 = null;
                while (parcel.dataPosition() < z51) {
                    int readInt21 = parcel.readInt();
                    char c19 = (char) readInt21;
                    if (c19 == 1) {
                        str13 = g6.e.h(parcel, readInt21);
                    } else if (c19 == 2) {
                        i25 = g6.e.u(parcel, readInt21);
                    } else if (c19 == 3) {
                        j22 = g6.e.w(parcel, readInt21);
                    } else if (c19 != 4) {
                        g6.e.y(parcel, readInt21);
                    } else {
                        z52 = g6.e.n(parcel, readInt21);
                    }
                }
                g6.e.m(parcel, z51);
                return new m6.c(str13, i25, j22, z52);
            case 26:
                int z53 = g6.e.z(parcel);
                String str14 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr3 = null;
                byte[][] bArr8 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str14 = g6.e.h(parcel, readInt22);
                            break;
                        case 3:
                            bArr3 = g6.e.b(parcel, readInt22);
                            break;
                        case 4:
                            bArr4 = g6.e.c(parcel, readInt22);
                            break;
                        case 5:
                            bArr5 = g6.e.c(parcel, readInt22);
                            break;
                        case 6:
                            bArr6 = g6.e.c(parcel, readInt22);
                            break;
                        case 7:
                            bArr7 = g6.e.c(parcel, readInt22);
                            break;
                        case '\b':
                            iArr3 = g6.e.d(parcel, readInt22);
                            break;
                        case '\t':
                            bArr8 = g6.e.c(parcel, readInt22);
                            break;
                        default:
                            g6.e.y(parcel, readInt22);
                            break;
                    }
                }
                g6.e.m(parcel, z53);
                return new m8.a(str14, bArr3, bArr4, bArr5, bArr6, bArr7, iArr3, bArr8);
            case 27:
                int z54 = g6.e.z(parcel);
                String[] strArr2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < z54) {
                    int readInt23 = parcel.readInt();
                    char c20 = (char) readInt23;
                    if (c20 == 1) {
                        strArr2 = g6.e.i(parcel, readInt23);
                    } else if (c20 == 2) {
                        cursorWindowArr = (CursorWindow[]) g6.e.k(parcel, readInt23, CursorWindow.CREATOR);
                    } else if (c20 == 3) {
                        i27 = g6.e.u(parcel, readInt23);
                    } else if (c20 == 4) {
                        bundle = g6.e.a(parcel, readInt23);
                    } else if (c20 != 1000) {
                        g6.e.y(parcel, readInt23);
                    } else {
                        i26 = g6.e.u(parcel, readInt23);
                    }
                }
                g6.e.m(parcel, z54);
                DataHolder dataHolder = new DataHolder(i26, strArr2, cursorWindowArr, i27, bundle);
                dataHolder.c = new Bundle();
                int i28 = 0;
                while (true) {
                    String[] strArr3 = dataHolder.b;
                    if (i28 >= strArr3.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int i29 = 0;
                        for (int i30 = 0; i30 < cursorWindowArr2.length; i30++) {
                            dataHolder.h[i30] = i29;
                            i29 += cursorWindowArr2[i30].getNumRows() - (i29 - cursorWindowArr2[i30].getStartPosition());
                        }
                        dataHolder.n = i29;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr3[i28], i28);
                    i28++;
                }
            case 28:
                int z55 = g6.e.z(parcel);
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < z55) {
                    int readInt24 = parcel.readInt();
                    char c21 = (char) readInt24;
                    if (c21 == 1) {
                        str15 = g6.e.h(parcel, readInt24);
                    } else if (c21 != 2) {
                        g6.e.y(parcel, readInt24);
                    } else {
                        str16 = g6.e.h(parcel, readInt24);
                    }
                }
                g6.e.m(parcel, z55);
                n8.a aVar = new n8.a();
                aVar.a = str15;
                aVar.b = str16;
                return aVar;
            default:
                int z56 = g6.e.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z56) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        g6.e.y(parcel, readInt25);
                    } else {
                        str17 = g6.e.h(parcel, readInt25);
                    }
                }
                g6.e.m(parcel, z56);
                n8.b bVar2 = new n8.b();
                bVar2.a = str17;
                return bVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new o[i3];
            case 1:
                return new q[i3];
            case 2:
                return new r[i3];
            case 3:
                return new i8.e[i3];
            case 4:
                return new i8.f[i3];
            case 5:
                return new i8.g[i3];
            case 6:
                return new i8.a[i3];
            case 7:
                return new LocationAvailability[i3];
            case 8:
                return new LocationRequest[i3];
            case 9:
                return new LocationResult[i3];
            case 10:
                return new i8.c[i3];
            case 11:
                return new k6.b[i3];
            case 12:
                return new k6.c[i3];
            case 13:
                return new l6.a[i3];
            case 14:
                return new l6.f[i3];
            case 15:
                return new l6.b[i3];
            case 16:
                return new CameraPosition[i3];
            case 17:
                return new l8.b[i3];
            case 18:
                return new LatLngBounds[i3];
            case 19:
                return new LatLng[i3];
            case 20:
                return new l8.e[i3];
            case 21:
                return new l8.g[i3];
            case 22:
                return new l8.h[i3];
            case 23:
                return new n0[i3];
            case 24:
                return new m6.a[i3];
            case 25:
                return new m6.c[i3];
            case 26:
                return new m8.a[i3];
            case 27:
                return new DataHolder[i3];
            case 28:
                return new n8.a[i3];
            default:
                return new n8.b[i3];
        }
    }
}
