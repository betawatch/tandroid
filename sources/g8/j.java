package g8;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import m.n0;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import w7.d0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = d0.z(parcel);
                Status status = null;
                h hVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        status = (Status) d0.g(parcel, readInt, Status.CREATOR);
                    } else if (c10 != 2) {
                        d0.y(parcel, readInt);
                    } else {
                        hVar = (h) d0.g(parcel, readInt, h.CREATOR);
                    }
                }
                d0.m(parcel, z10);
                return new g(status, hVar);
            case 1:
                int z11 = d0.z(parcel);
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            z12 = d0.n(parcel, readInt2);
                            break;
                        case 2:
                            z13 = d0.n(parcel, readInt2);
                            break;
                        case 3:
                            z14 = d0.n(parcel, readInt2);
                            break;
                        case 4:
                            z15 = d0.n(parcel, readInt2);
                            break;
                        case 5:
                            z16 = d0.n(parcel, readInt2);
                            break;
                        case 6:
                            z17 = d0.n(parcel, readInt2);
                            break;
                        default:
                            d0.y(parcel, readInt2);
                            break;
                    }
                }
                d0.m(parcel, z11);
                return new h(z12, z13, z14, z15, z16, z17);
            case 2:
                int z18 = d0.z(parcel);
                long j3 = -1;
                long j10 = -1;
                int i10 = 1;
                int i11 = 1;
                while (parcel.dataPosition() < z18) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i10 = d0.u(parcel, readInt3);
                    } else if (c11 == 2) {
                        i11 = d0.u(parcel, readInt3);
                    } else if (c11 == 3) {
                        j3 = d0.w(parcel, readInt3);
                    } else if (c11 != 4) {
                        d0.y(parcel, readInt3);
                    } else {
                        j10 = d0.w(parcel, readInt3);
                    }
                }
                d0.m(parcel, z18);
                return new k(j3, i10, i11, j10);
            case 3:
                int z19 = d0.z(parcel);
                long j11 = Long.MAX_VALUE;
                String str = null;
                r7.j jVar = null;
                int i12 = 0;
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        j11 = d0.w(parcel, readInt4);
                    } else if (c12 == 2) {
                        i12 = d0.u(parcel, readInt4);
                    } else if (c12 == 3) {
                        z20 = d0.n(parcel, readInt4);
                    } else if (c12 == 4) {
                        str = d0.h(parcel, readInt4);
                    } else if (c12 != 5) {
                        d0.y(parcel, readInt4);
                    } else {
                        jVar = (r7.j) d0.g(parcel, readInt4, r7.j.CREATOR);
                    }
                }
                d0.m(parcel, z19);
                return new b(j11, i12, z20, str, jVar);
            case 4:
                int z21 = d0.z(parcel);
                long j12 = 0;
                k[] kVarArr = null;
                int i13 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                int i14 = 1;
                int i15 = 1;
                while (parcel.dataPosition() < z21) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i14 = d0.u(parcel, readInt5);
                            break;
                        case 2:
                            i15 = d0.u(parcel, readInt5);
                            break;
                        case 3:
                            j12 = d0.w(parcel, readInt5);
                            break;
                        case 4:
                            i13 = d0.u(parcel, readInt5);
                            break;
                        case 5:
                            kVarArr = (k[]) d0.k(parcel, readInt5, k.CREATOR);
                            break;
                        case 6:
                            d0.n(parcel, readInt5);
                            break;
                        default:
                            d0.y(parcel, readInt5);
                            break;
                    }
                }
                d0.m(parcel, z21);
                return new LocationAvailability(i13, i14, i15, j12, kVarArr);
            case 5:
                int z22 = d0.z(parcel);
                WorkSource workSource = new WorkSource();
                long j13 = 3600000;
                long j14 = 600000;
                long j15 = 0;
                long j16 = Long.MAX_VALUE;
                long j17 = Long.MAX_VALUE;
                long j18 = -1;
                String str2 = null;
                r7.j jVar2 = null;
                int i16 = 102;
                int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                float f7 = 0.0f;
                boolean z23 = false;
                int i18 = 0;
                int i19 = 0;
                boolean z24 = false;
                while (parcel.dataPosition() < z22) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i16 = d0.u(parcel, readInt6);
                            break;
                        case 2:
                            j13 = d0.w(parcel, readInt6);
                            break;
                        case 3:
                            j14 = d0.w(parcel, readInt6);
                            break;
                        case 4:
                        default:
                            d0.y(parcel, readInt6);
                            break;
                        case 5:
                            j16 = d0.w(parcel, readInt6);
                            break;
                        case 6:
                            i17 = d0.u(parcel, readInt6);
                            break;
                        case 7:
                            f7 = d0.r(parcel, readInt6);
                            break;
                        case '\b':
                            j15 = d0.w(parcel, readInt6);
                            break;
                        case '\t':
                            z23 = d0.n(parcel, readInt6);
                            break;
                        case '\n':
                            j17 = d0.w(parcel, readInt6);
                            break;
                        case 11:
                            j18 = d0.w(parcel, readInt6);
                            break;
                        case '\f':
                            i18 = d0.u(parcel, readInt6);
                            break;
                        case '\r':
                            i19 = d0.u(parcel, readInt6);
                            break;
                        case 14:
                            str2 = d0.h(parcel, readInt6);
                            break;
                        case 15:
                            z24 = d0.n(parcel, readInt6);
                            break;
                        case 16:
                            workSource = (WorkSource) d0.g(parcel, readInt6, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar2 = (r7.j) d0.g(parcel, readInt6, r7.j.CREATOR);
                            break;
                    }
                }
                d0.m(parcel, z22);
                return new LocationRequest(i16, j13, j14, j15, j16, j17, i17, f7, z23, j18, i18, i19, str2, z24, workSource, jVar2);
            case 6:
                int z25 = d0.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z25) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        d0.y(parcel, readInt7);
                    } else {
                        list = d0.l(parcel, readInt7, Location.CREATOR);
                    }
                }
                d0.m(parcel, z25);
                return new LocationResult(list);
            case 7:
                int z26 = d0.z(parcel);
                ArrayList arrayList = null;
                boolean z27 = false;
                boolean z28 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        arrayList = d0.l(parcel, readInt8, LocationRequest.CREATOR);
                    } else if (c13 == 2) {
                        z27 = d0.n(parcel, readInt8);
                    } else if (c13 != 3) {
                        d0.y(parcel, readInt8);
                    } else {
                        z28 = d0.n(parcel, readInt8);
                    }
                }
                d0.m(parcel, z26);
                return new e(arrayList, z27, z28);
            case 8:
                int z29 = d0.z(parcel);
                long j19 = 0;
                long j20 = 0;
                boolean z30 = false;
                while (parcel.dataPosition() < z29) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        z30 = d0.n(parcel, readInt9);
                    } else if (c14 == 2) {
                        j20 = d0.w(parcel, readInt9);
                    } else if (c14 != 3) {
                        d0.y(parcel, readInt9);
                    } else {
                        j19 = d0.w(parcel, readInt9);
                    }
                }
                d0.m(parcel, z29);
                return new i6.b(j19, j20, z30);
            case 9:
                int z31 = d0.z(parcel);
                c2 c2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                k8.a[] aVarArr = null;
                boolean z32 = true;
                while (parcel.dataPosition() < z31) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            c2Var = (c2) d0.g(parcel, readInt10, c2.CREATOR);
                            break;
                        case 3:
                            bArr = d0.b(parcel, readInt10);
                            break;
                        case 4:
                            iArr = d0.d(parcel, readInt10);
                            break;
                        case 5:
                            strArr = d0.i(parcel, readInt10);
                            break;
                        case 6:
                            iArr2 = d0.d(parcel, readInt10);
                            break;
                        case 7:
                            bArr2 = d0.c(parcel, readInt10);
                            break;
                        case '\b':
                            z32 = d0.n(parcel, readInt10);
                            break;
                        case '\t':
                            aVarArr = (k8.a[]) d0.k(parcel, readInt10, k8.a.CREATOR);
                            break;
                        default:
                            d0.y(parcel, readInt10);
                            break;
                    }
                }
                d0.m(parcel, z31);
                return new i6.c(c2Var, bArr, iArr, strArr, iArr2, bArr2, z32, aVarArr);
            case 10:
                int z33 = d0.z(parcel);
                LatLng latLng = null;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (parcel.dataPosition() < z33) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 2) {
                        latLng = (LatLng) d0.g(parcel, readInt11, LatLng.CREATOR);
                    } else if (c15 == 3) {
                        f10 = d0.r(parcel, readInt11);
                    } else if (c15 == 4) {
                        f11 = d0.r(parcel, readInt11);
                    } else if (c15 != 5) {
                        d0.y(parcel, readInt11);
                    } else {
                        f12 = d0.r(parcel, readInt11);
                    }
                }
                d0.m(parcel, z33);
                return new CameraPosition(latLng, f10, f11, f12);
            case 11:
                int z34 = d0.z(parcel);
                LatLng latLng2 = null;
                double d = 0.0d;
                float f13 = 0.0f;
                float f14 = 0.0f;
                int i20 = 0;
                int i21 = 0;
                boolean z35 = false;
                boolean z36 = false;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            latLng2 = (LatLng) d0.g(parcel, readInt12, LatLng.CREATOR);
                            break;
                        case 3:
                            d = d0.q(parcel, readInt12);
                            break;
                        case 4:
                            f13 = d0.r(parcel, readInt12);
                            break;
                        case 5:
                            i20 = d0.u(parcel, readInt12);
                            break;
                        case 6:
                            i21 = d0.u(parcel, readInt12);
                            break;
                        case 7:
                            f14 = d0.r(parcel, readInt12);
                            break;
                        case '\b':
                            z35 = d0.n(parcel, readInt12);
                            break;
                        case '\t':
                            z36 = d0.n(parcel, readInt12);
                            break;
                        case '\n':
                            arrayList2 = d0.l(parcel, readInt12, j8.h.CREATOR);
                            break;
                        default:
                            d0.y(parcel, readInt12);
                            break;
                    }
                }
                d0.m(parcel, z34);
                j8.b bVar = new j8.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f13;
                bVar.d = i20;
                bVar.e = i21;
                bVar.f = f14;
                bVar.h = z35;
                bVar.n = z36;
                bVar.r = arrayList2;
                return bVar;
            case 12:
                int z37 = d0.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        latLng3 = (LatLng) d0.g(parcel, readInt13, LatLng.CREATOR);
                    } else if (c16 != 3) {
                        d0.y(parcel, readInt13);
                    } else {
                        latLng4 = (LatLng) d0.g(parcel, readInt13, LatLng.CREATOR);
                    }
                }
                d0.m(parcel, z37);
                return new LatLngBounds(latLng3, latLng4);
            case 13:
                int z38 = d0.z(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z38) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 2) {
                        d10 = d0.q(parcel, readInt14);
                    } else if (c17 != 3) {
                        d0.y(parcel, readInt14);
                    } else {
                        d11 = d0.q(parcel, readInt14);
                    }
                }
                d0.m(parcel, z38);
                return new LatLng(d10, d11);
            case 14:
                int z39 = d0.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 2) {
                        d0.y(parcel, readInt15);
                    } else {
                        str3 = d0.h(parcel, readInt15);
                    }
                }
                d0.m(parcel, z39);
                return new j8.e(str3);
            case 15:
                int z40 = d0.z(parcel);
                LatLng latLng5 = null;
                String str4 = null;
                String str5 = null;
                IBinder iBinder = null;
                float f15 = 0.0f;
                float f16 = 0.0f;
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                float f17 = 0.0f;
                float f18 = 0.5f;
                float f19 = 0.0f;
                float f20 = 1.0f;
                float f21 = 0.0f;
                while (parcel.dataPosition() < z40) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            latLng5 = (LatLng) d0.g(parcel, readInt16, LatLng.CREATOR);
                            break;
                        case 3:
                            str4 = d0.h(parcel, readInt16);
                            break;
                        case 4:
                            str5 = d0.h(parcel, readInt16);
                            break;
                        case 5:
                            iBinder = d0.t(parcel, readInt16);
                            break;
                        case 6:
                            f15 = d0.r(parcel, readInt16);
                            break;
                        case 7:
                            f16 = d0.r(parcel, readInt16);
                            break;
                        case '\b':
                            z41 = d0.n(parcel, readInt16);
                            break;
                        case '\t':
                            z42 = d0.n(parcel, readInt16);
                            break;
                        case '\n':
                            z43 = d0.n(parcel, readInt16);
                            break;
                        case 11:
                            f17 = d0.r(parcel, readInt16);
                            break;
                        case '\f':
                            f18 = d0.r(parcel, readInt16);
                            break;
                        case '\r':
                            f19 = d0.r(parcel, readInt16);
                            break;
                        case 14:
                            f20 = d0.r(parcel, readInt16);
                            break;
                        case 15:
                            f21 = d0.r(parcel, readInt16);
                            break;
                        default:
                            d0.y(parcel, readInt16);
                            break;
                    }
                }
                d0.m(parcel, z40);
                j8.g gVar = new j8.g();
                gVar.e = 0.5f;
                gVar.f = 1.0f;
                gVar.n = true;
                gVar.r = false;
                gVar.s = 0.0f;
                gVar.v = 0.5f;
                gVar.w = 0.0f;
                gVar.x = 1.0f;
                gVar.a = latLng5;
                gVar.b = str4;
                gVar.c = str5;
                if (iBinder == null) {
                    gVar.d = null;
                } else {
                    gVar.d = new a6.i(x6.b.L0(iBinder));
                }
                gVar.e = f15;
                gVar.f = f16;
                gVar.h = z41;
                gVar.n = z42;
                gVar.r = z43;
                gVar.s = f17;
                gVar.v = f18;
                gVar.w = f19;
                gVar.x = f20;
                gVar.y = f21;
                return gVar;
            case 16:
                int z44 = d0.z(parcel);
                int i22 = 0;
                Float f22 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        i22 = d0.u(parcel, readInt17);
                    } else if (c18 != 3) {
                        d0.y(parcel, readInt17);
                    } else {
                        f22 = d0.s(parcel, readInt17);
                    }
                }
                d0.m(parcel, z44);
                return new j8.h(i22, f22);
            case 17:
                int z45 = d0.z(parcel);
                PendingIntent pendingIntent = null;
                String str6 = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z45) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        i23 = d0.u(parcel, readInt18);
                    } else if (c19 == 2) {
                        i24 = d0.u(parcel, readInt18);
                    } else if (c19 == 3) {
                        pendingIntent = (PendingIntent) d0.g(parcel, readInt18, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        d0.y(parcel, readInt18);
                    } else {
                        str6 = d0.h(parcel, readInt18);
                    }
                }
                d0.m(parcel, z45);
                return new k6.a(i23, i24, pendingIntent, str6);
            case 18:
                int z46 = d0.z(parcel);
                long j21 = -1;
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt19 = parcel.readInt();
                    char c20 = (char) readInt19;
                    if (c20 == 1) {
                        str7 = d0.h(parcel, readInt19);
                    } else if (c20 == 2) {
                        i25 = d0.u(parcel, readInt19);
                    } else if (c20 != 3) {
                        d0.y(parcel, readInt19);
                    } else {
                        j21 = d0.w(parcel, readInt19);
                    }
                }
                d0.m(parcel, z46);
                return new k6.c(i25, str7, j21);
            case 19:
                int z47 = d0.z(parcel);
                String str8 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr3 = null;
                byte[][] bArr8 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            str8 = d0.h(parcel, readInt20);
                            break;
                        case 3:
                            bArr3 = d0.b(parcel, readInt20);
                            break;
                        case 4:
                            bArr4 = d0.c(parcel, readInt20);
                            break;
                        case 5:
                            bArr5 = d0.c(parcel, readInt20);
                            break;
                        case 6:
                            bArr6 = d0.c(parcel, readInt20);
                            break;
                        case 7:
                            bArr7 = d0.c(parcel, readInt20);
                            break;
                        case '\b':
                            iArr3 = d0.d(parcel, readInt20);
                            break;
                        case '\t':
                            bArr8 = d0.c(parcel, readInt20);
                            break;
                        default:
                            d0.y(parcel, readInt20);
                            break;
                    }
                }
                d0.m(parcel, z47);
                return new k8.a(str8, bArr3, bArr4, bArr5, bArr6, bArr7, iArr3, bArr8);
            case 20:
                int z48 = d0.z(parcel);
                String[] strArr2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < z48) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 1) {
                        strArr2 = d0.i(parcel, readInt21);
                    } else if (c21 == 2) {
                        cursorWindowArr = (CursorWindow[]) d0.k(parcel, readInt21, CursorWindow.CREATOR);
                    } else if (c21 == 3) {
                        i27 = d0.u(parcel, readInt21);
                    } else if (c21 == 4) {
                        bundle = d0.a(parcel, readInt21);
                    } else if (c21 != 1000) {
                        d0.y(parcel, readInt21);
                    } else {
                        i26 = d0.u(parcel, readInt21);
                    }
                }
                d0.m(parcel, z48);
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
            case 21:
                int z49 = d0.z(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 1) {
                        str9 = d0.h(parcel, readInt22);
                    } else if (c22 != 2) {
                        d0.y(parcel, readInt22);
                    } else {
                        str10 = d0.h(parcel, readInt22);
                    }
                }
                d0.m(parcel, z49);
                l8.a aVar = new l8.a();
                aVar.a = str9;
                aVar.b = str10;
                return aVar;
            case 22:
                int z50 = d0.z(parcel);
                String str11 = null;
                while (parcel.dataPosition() < z50) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        d0.y(parcel, readInt23);
                    } else {
                        str11 = d0.h(parcel, readInt23);
                    }
                }
                d0.m(parcel, z50);
                l8.b bVar2 = new l8.b();
                bVar2.a = str11;
                return bVar2;
            case 23:
                int z51 = d0.z(parcel);
                while (parcel.dataPosition() < z51) {
                    d0.y(parcel, parcel.readInt());
                }
                d0.m(parcel, z51);
                return new l8.c();
            case 24:
                int z52 = d0.z(parcel);
                while (parcel.dataPosition() < z52) {
                    d0.y(parcel, parcel.readInt());
                }
                d0.m(parcel, z52);
                return new l8.d();
            case 25:
                n0 n0Var = new n0(parcel);
                n0Var.a = parcel.readByte() != 0;
                return n0Var;
            case 26:
                int z53 = d0.z(parcel);
                int i31 = 0;
                Uri uri = null;
                int i32 = 0;
                int i33 = 0;
                while (parcel.dataPosition() < z53) {
                    int readInt24 = parcel.readInt();
                    char c23 = (char) readInt24;
                    if (c23 == 1) {
                        i31 = d0.u(parcel, readInt24);
                    } else if (c23 == 2) {
                        uri = (Uri) d0.g(parcel, readInt24, Uri.CREATOR);
                    } else if (c23 == 3) {
                        i32 = d0.u(parcel, readInt24);
                    } else if (c23 != 4) {
                        d0.y(parcel, readInt24);
                    } else {
                        i33 = d0.u(parcel, readInt24);
                    }
                }
                d0.m(parcel, z53);
                return new m6.a(i31, uri, i32, i33);
            case 27:
                int z54 = d0.z(parcel);
                String str12 = null;
                while (parcel.dataPosition() < z54) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 2) {
                        d0.y(parcel, readInt25);
                    } else {
                        str12 = d0.h(parcel, readInt25);
                    }
                }
                d0.m(parcel, z54);
                return new m8.e(str12);
            case 28:
                int z55 = d0.z(parcel);
                String str13 = null;
                byte[] bArr9 = null;
                int i34 = 0;
                while (parcel.dataPosition() < z55) {
                    int readInt26 = parcel.readInt();
                    char c24 = (char) readInt26;
                    if (c24 == 2) {
                        str13 = d0.h(parcel, readInt26);
                    } else if (c24 == 3) {
                        bArr9 = d0.b(parcel, readInt26);
                    } else if (c24 != 4) {
                        d0.y(parcel, readInt26);
                    } else {
                        i34 = d0.u(parcel, readInt26);
                    }
                }
                d0.m(parcel, z55);
                return new m8.a(str13, bArr9, i34);
            default:
                int z56 = d0.z(parcel);
                long j22 = 0;
                m8.a[] aVarArr2 = null;
                int i35 = 0;
                boolean z57 = false;
                while (parcel.dataPosition() < z56) {
                    int readInt27 = parcel.readInt();
                    char c25 = (char) readInt27;
                    if (c25 == 2) {
                        j22 = d0.w(parcel, readInt27);
                    } else if (c25 == 3) {
                        aVarArr2 = (m8.a[]) d0.k(parcel, readInt27, m8.a.CREATOR);
                    } else if (c25 == 4) {
                        i35 = d0.u(parcel, readInt27);
                    } else if (c25 != 5) {
                        d0.y(parcel, readInt27);
                    } else {
                        z57 = d0.n(parcel, readInt27);
                    }
                }
                d0.m(parcel, z56);
                return new m8.f(j22, aVarArr2, i35, z57);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new g[i10];
            case 1:
                return new h[i10];
            case 2:
                return new k[i10];
            case 3:
                return new b[i10];
            case 4:
                return new LocationAvailability[i10];
            case 5:
                return new LocationRequest[i10];
            case 6:
                return new LocationResult[i10];
            case 7:
                return new e[i10];
            case 8:
                return new i6.b[i10];
            case 9:
                return new i6.c[i10];
            case 10:
                return new CameraPosition[i10];
            case 11:
                return new j8.b[i10];
            case 12:
                return new LatLngBounds[i10];
            case 13:
                return new LatLng[i10];
            case 14:
                return new j8.e[i10];
            case 15:
                return new j8.g[i10];
            case 16:
                return new j8.h[i10];
            case 17:
                return new k6.a[i10];
            case 18:
                return new k6.c[i10];
            case 19:
                return new k8.a[i10];
            case 20:
                return new DataHolder[i10];
            case 21:
                return new l8.a[i10];
            case 22:
                return new l8.b[i10];
            case 23:
                return new l8.c[i10];
            case 24:
                return new l8.d[i10];
            case 25:
                return new n0[i10];
            case 26:
                return new m6.a[i10];
            case 27:
                return new m8.e[i10];
            case 28:
                return new m8.a[i10];
            default:
                return new m8.f[i10];
        }
    }
}
