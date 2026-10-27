package h8;

import a8.bf;
import android.app.PendingIntent;
import android.database.CursorWindow;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
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
import java.util.ArrayList;
import java.util.List;
import m.n0;
import n4.r;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        switch (this.a) {
            case 0:
                int z10 = bf.z(parcel);
                Status status = null;
                h hVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        status = (Status) bf.g(parcel, readInt, Status.CREATOR);
                    } else if (c10 != 2) {
                        bf.y(parcel, readInt);
                    } else {
                        hVar = (h) bf.g(parcel, readInt, h.CREATOR);
                    }
                }
                bf.m(parcel, z10);
                return new g(status, hVar);
            case 1:
                int z11 = bf.z(parcel);
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
                            z12 = bf.n(parcel, readInt2);
                            break;
                        case 2:
                            z13 = bf.n(parcel, readInt2);
                            break;
                        case 3:
                            z14 = bf.n(parcel, readInt2);
                            break;
                        case 4:
                            z15 = bf.n(parcel, readInt2);
                            break;
                        case 5:
                            z16 = bf.n(parcel, readInt2);
                            break;
                        case 6:
                            z17 = bf.n(parcel, readInt2);
                            break;
                        default:
                            bf.y(parcel, readInt2);
                            break;
                    }
                }
                bf.m(parcel, z11);
                return new h(z12, z13, z14, z15, z16, z17);
            case 2:
                int z18 = bf.z(parcel);
                int i10 = 1;
                int i11 = 1;
                long j10 = -1;
                long j11 = -1;
                while (parcel.dataPosition() < z18) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i10 = bf.u(parcel, readInt3);
                    } else if (c11 == 2) {
                        i11 = bf.u(parcel, readInt3);
                    } else if (c11 == 3) {
                        j10 = bf.w(parcel, readInt3);
                    } else if (c11 != 4) {
                        bf.y(parcel, readInt3);
                    } else {
                        j11 = bf.w(parcel, readInt3);
                    }
                }
                bf.m(parcel, z18);
                return new k(j10, i10, i11, j11);
            case 3:
                int z19 = bf.z(parcel);
                long j12 = Long.MAX_VALUE;
                int i12 = 0;
                boolean z20 = false;
                String str = null;
                s7.j jVar = null;
                while (parcel.dataPosition() < z19) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        j12 = bf.w(parcel, readInt4);
                    } else if (c12 == 2) {
                        i12 = bf.u(parcel, readInt4);
                    } else if (c12 == 3) {
                        z20 = bf.n(parcel, readInt4);
                    } else if (c12 == 4) {
                        str = bf.h(parcel, readInt4);
                    } else if (c12 != 5) {
                        bf.y(parcel, readInt4);
                    } else {
                        jVar = (s7.j) bf.g(parcel, readInt4, s7.j.CREATOR);
                    }
                }
                bf.m(parcel, z19);
                return new b(j12, i12, z20, str, jVar);
            case 4:
                int z21 = bf.z(parcel);
                int i13 = 1000;
                int i14 = 1;
                int i15 = 1;
                long j13 = 0;
                k[] kVarArr = null;
                while (parcel.dataPosition() < z21) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i14 = bf.u(parcel, readInt5);
                            break;
                        case 2:
                            i15 = bf.u(parcel, readInt5);
                            break;
                        case 3:
                            j13 = bf.w(parcel, readInt5);
                            break;
                        case 4:
                            i13 = bf.u(parcel, readInt5);
                            break;
                        case 5:
                            kVarArr = (k[]) bf.k(parcel, readInt5, k.CREATOR);
                            break;
                        case 6:
                            bf.n(parcel, readInt5);
                            break;
                        default:
                            bf.y(parcel, readInt5);
                            break;
                    }
                }
                bf.m(parcel, z21);
                return new LocationAvailability(i13, i14, i15, j13, kVarArr);
            case 5:
                int z22 = bf.z(parcel);
                WorkSource workSource = new WorkSource();
                int i16 = 102;
                long j14 = 3600000;
                long j15 = 600000;
                long j16 = 0;
                long j17 = Long.MAX_VALUE;
                long j18 = Long.MAX_VALUE;
                int i17 = Integer.MAX_VALUE;
                float f7 = 0.0f;
                boolean z23 = false;
                int i18 = 0;
                int i19 = 0;
                boolean z24 = false;
                long j19 = -1;
                String str2 = null;
                s7.j jVar2 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i16 = bf.u(parcel, readInt6);
                            break;
                        case 2:
                            j14 = bf.w(parcel, readInt6);
                            break;
                        case 3:
                            j15 = bf.w(parcel, readInt6);
                            break;
                        case 4:
                        default:
                            bf.y(parcel, readInt6);
                            break;
                        case 5:
                            j17 = bf.w(parcel, readInt6);
                            break;
                        case 6:
                            i17 = bf.u(parcel, readInt6);
                            break;
                        case 7:
                            f7 = bf.r(parcel, readInt6);
                            break;
                        case '\b':
                            j16 = bf.w(parcel, readInt6);
                            break;
                        case '\t':
                            z23 = bf.n(parcel, readInt6);
                            break;
                        case '\n':
                            j18 = bf.w(parcel, readInt6);
                            break;
                        case 11:
                            j19 = bf.w(parcel, readInt6);
                            break;
                        case '\f':
                            i18 = bf.u(parcel, readInt6);
                            break;
                        case '\r':
                            i19 = bf.u(parcel, readInt6);
                            break;
                        case 14:
                            str2 = bf.h(parcel, readInt6);
                            break;
                        case 15:
                            z24 = bf.n(parcel, readInt6);
                            break;
                        case 16:
                            workSource = (WorkSource) bf.g(parcel, readInt6, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar2 = (s7.j) bf.g(parcel, readInt6, s7.j.CREATOR);
                            break;
                    }
                }
                bf.m(parcel, z22);
                return new LocationRequest(i16, j14, j15, j16, j17, j18, i17, f7, z23, j19, i18, i19, str2, z24, workSource, jVar2);
            case 6:
                int z25 = bf.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z25) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        bf.y(parcel, readInt7);
                    } else {
                        list = bf.l(parcel, readInt7, Location.CREATOR);
                    }
                }
                bf.m(parcel, z25);
                return new LocationResult(list);
            case 7:
                int z26 = bf.z(parcel);
                ArrayList arrayList = null;
                boolean z27 = false;
                boolean z28 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        arrayList = bf.l(parcel, readInt8, LocationRequest.CREATOR);
                    } else if (c13 == 2) {
                        z27 = bf.n(parcel, readInt8);
                    } else if (c13 != 3) {
                        bf.y(parcel, readInt8);
                    } else {
                        z28 = bf.n(parcel, readInt8);
                    }
                }
                bf.m(parcel, z26);
                return new e(arrayList, z27, z28);
            case 8:
                int z29 = bf.z(parcel);
                boolean z30 = false;
                long j20 = 0;
                long j21 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        z30 = bf.n(parcel, readInt9);
                    } else if (c14 == 2) {
                        j21 = bf.w(parcel, readInt9);
                    } else if (c14 != 3) {
                        bf.y(parcel, readInt9);
                    } else {
                        j20 = bf.w(parcel, readInt9);
                    }
                }
                bf.m(parcel, z29);
                return new j6.b(j20, j21, z30);
            case 9:
                int z31 = bf.z(parcel);
                b2 b2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                l8.a[] aVarArr = null;
                boolean z32 = true;
                while (parcel.dataPosition() < z31) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            b2Var = (b2) bf.g(parcel, readInt10, b2.CREATOR);
                            break;
                        case 3:
                            bArr = bf.b(parcel, readInt10);
                            break;
                        case 4:
                            iArr = bf.d(parcel, readInt10);
                            break;
                        case 5:
                            strArr = bf.i(parcel, readInt10);
                            break;
                        case 6:
                            iArr2 = bf.d(parcel, readInt10);
                            break;
                        case 7:
                            bArr2 = bf.c(parcel, readInt10);
                            break;
                        case '\b':
                            z32 = bf.n(parcel, readInt10);
                            break;
                        case '\t':
                            aVarArr = (l8.a[]) bf.k(parcel, readInt10, l8.a.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt10);
                            break;
                    }
                }
                bf.m(parcel, z31);
                return new j6.c(b2Var, bArr, iArr, strArr, iArr2, bArr2, z32, aVarArr);
            case 10:
                int z33 = bf.z(parcel);
                LatLng latLng = null;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (parcel.dataPosition() < z33) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 2) {
                        latLng = (LatLng) bf.g(parcel, readInt11, LatLng.CREATOR);
                    } else if (c15 == 3) {
                        f10 = bf.r(parcel, readInt11);
                    } else if (c15 == 4) {
                        f11 = bf.r(parcel, readInt11);
                    } else if (c15 != 5) {
                        bf.y(parcel, readInt11);
                    } else {
                        f12 = bf.r(parcel, readInt11);
                    }
                }
                bf.m(parcel, z33);
                return new CameraPosition(latLng, f10, f11, f12);
            case 11:
                int z34 = bf.z(parcel);
                LatLng latLng2 = null;
                float f13 = 0.0f;
                int i20 = 0;
                int i21 = 0;
                boolean z35 = false;
                boolean z36 = false;
                double d = 0.0d;
                float f14 = 0.0f;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            latLng2 = (LatLng) bf.g(parcel, readInt12, LatLng.CREATOR);
                            break;
                        case 3:
                            d = bf.q(parcel, readInt12);
                            break;
                        case 4:
                            f14 = bf.r(parcel, readInt12);
                            break;
                        case 5:
                            i20 = bf.u(parcel, readInt12);
                            break;
                        case 6:
                            i21 = bf.u(parcel, readInt12);
                            break;
                        case 7:
                            f13 = bf.r(parcel, readInt12);
                            break;
                        case '\b':
                            z35 = bf.n(parcel, readInt12);
                            break;
                        case '\t':
                            z36 = bf.n(parcel, readInt12);
                            break;
                        case '\n':
                            arrayList2 = bf.l(parcel, readInt12, k8.h.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt12);
                            break;
                    }
                }
                bf.m(parcel, z34);
                k8.b bVar = new k8.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f14;
                bVar.d = i20;
                bVar.e = i21;
                bVar.f = f13;
                bVar.h = z35;
                bVar.n = z36;
                bVar.r = arrayList2;
                return bVar;
            case 12:
                int z37 = bf.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        latLng3 = (LatLng) bf.g(parcel, readInt13, LatLng.CREATOR);
                    } else if (c16 != 3) {
                        bf.y(parcel, readInt13);
                    } else {
                        latLng4 = (LatLng) bf.g(parcel, readInt13, LatLng.CREATOR);
                    }
                }
                bf.m(parcel, z37);
                return new LatLngBounds(latLng3, latLng4);
            case 13:
                int z38 = bf.z(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z38) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 2) {
                        d10 = bf.q(parcel, readInt14);
                    } else if (c17 != 3) {
                        bf.y(parcel, readInt14);
                    } else {
                        d11 = bf.q(parcel, readInt14);
                    }
                }
                bf.m(parcel, z38);
                return new LatLng(d10, d11);
            case 14:
                int z39 = bf.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 2) {
                        bf.y(parcel, readInt15);
                    } else {
                        str3 = bf.h(parcel, readInt15);
                    }
                }
                bf.m(parcel, z39);
                return new k8.e(str3);
            case 15:
                int z40 = bf.z(parcel);
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                float f15 = 0.5f;
                float f16 = 1.0f;
                LatLng latLng5 = null;
                String str4 = null;
                String str5 = null;
                IBinder iBinder = null;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                while (parcel.dataPosition() < z40) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            latLng5 = (LatLng) bf.g(parcel, readInt16, LatLng.CREATOR);
                            break;
                        case 3:
                            str4 = bf.h(parcel, readInt16);
                            break;
                        case 4:
                            str5 = bf.h(parcel, readInt16);
                            break;
                        case 5:
                            iBinder = bf.t(parcel, readInt16);
                            break;
                        case 6:
                            f17 = bf.r(parcel, readInt16);
                            break;
                        case 7:
                            f18 = bf.r(parcel, readInt16);
                            break;
                        case '\b':
                            z41 = bf.n(parcel, readInt16);
                            break;
                        case '\t':
                            z42 = bf.n(parcel, readInt16);
                            break;
                        case '\n':
                            z43 = bf.n(parcel, readInt16);
                            break;
                        case 11:
                            f19 = bf.r(parcel, readInt16);
                            break;
                        case '\f':
                            f15 = bf.r(parcel, readInt16);
                            break;
                        case '\r':
                            f20 = bf.r(parcel, readInt16);
                            break;
                        case 14:
                            f16 = bf.r(parcel, readInt16);
                            break;
                        case 15:
                            f21 = bf.r(parcel, readInt16);
                            break;
                        default:
                            bf.y(parcel, readInt16);
                            break;
                    }
                }
                bf.m(parcel, z40);
                k8.g gVar = new k8.g();
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
                    gVar.d = new jg.i(y6.b.K0(iBinder));
                }
                gVar.e = f17;
                gVar.f = f18;
                gVar.h = z41;
                gVar.n = z42;
                gVar.r = z43;
                gVar.s = f19;
                gVar.v = f15;
                gVar.w = f20;
                gVar.x = f16;
                gVar.y = f21;
                return gVar;
            case 16:
                int z44 = bf.z(parcel);
                int i22 = 0;
                Float f22 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        i22 = bf.u(parcel, readInt17);
                    } else if (c18 != 3) {
                        bf.y(parcel, readInt17);
                    } else {
                        f22 = bf.s(parcel, readInt17);
                    }
                }
                bf.m(parcel, z44);
                return new k8.h(i22, f22);
            case 17:
                int z45 = bf.z(parcel);
                PendingIntent pendingIntent = null;
                int i23 = 0;
                int i24 = 0;
                String str6 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        i23 = bf.u(parcel, readInt18);
                    } else if (c19 == 2) {
                        i24 = bf.u(parcel, readInt18);
                    } else if (c19 == 3) {
                        pendingIntent = (PendingIntent) bf.g(parcel, readInt18, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        bf.y(parcel, readInt18);
                    } else {
                        str6 = bf.h(parcel, readInt18);
                    }
                }
                bf.m(parcel, z45);
                return new l6.a(i23, i24, pendingIntent, str6);
            case 18:
                int z46 = bf.z(parcel);
                long j22 = -1;
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt19 = parcel.readInt();
                    char c20 = (char) readInt19;
                    if (c20 == 1) {
                        str7 = bf.h(parcel, readInt19);
                    } else if (c20 == 2) {
                        i25 = bf.u(parcel, readInt19);
                    } else if (c20 != 3) {
                        bf.y(parcel, readInt19);
                    } else {
                        j22 = bf.w(parcel, readInt19);
                    }
                }
                bf.m(parcel, z46);
                return new l6.c(i25, str7, j22);
            case 19:
                int z47 = bf.z(parcel);
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
                            str8 = bf.h(parcel, readInt20);
                            break;
                        case 3:
                            bArr3 = bf.b(parcel, readInt20);
                            break;
                        case 4:
                            bArr4 = bf.c(parcel, readInt20);
                            break;
                        case 5:
                            bArr5 = bf.c(parcel, readInt20);
                            break;
                        case 6:
                            bArr6 = bf.c(parcel, readInt20);
                            break;
                        case 7:
                            bArr7 = bf.c(parcel, readInt20);
                            break;
                        case '\b':
                            iArr3 = bf.d(parcel, readInt20);
                            break;
                        case '\t':
                            bArr8 = bf.c(parcel, readInt20);
                            break;
                        default:
                            bf.y(parcel, readInt20);
                            break;
                    }
                }
                bf.m(parcel, z47);
                return new l8.a(str8, bArr3, bArr4, bArr5, bArr6, bArr7, iArr3, bArr8);
            case 20:
                n0 n0Var = new n0(parcel);
                n0Var.a = parcel.readByte() != 0;
                return n0Var;
            case 21:
                int z48 = bf.z(parcel);
                String[] strArr2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < z48) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 1) {
                        strArr2 = bf.i(parcel, readInt21);
                    } else if (c21 == 2) {
                        cursorWindowArr = (CursorWindow[]) bf.k(parcel, readInt21, CursorWindow.CREATOR);
                    } else if (c21 == 3) {
                        i27 = bf.u(parcel, readInt21);
                    } else if (c21 == 4) {
                        bundle = bf.a(parcel, readInt21);
                    } else if (c21 != 1000) {
                        bf.y(parcel, readInt21);
                    } else {
                        i26 = bf.u(parcel, readInt21);
                    }
                }
                bf.m(parcel, z48);
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
            case 22:
                int z49 = bf.z(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 1) {
                        str9 = bf.h(parcel, readInt22);
                    } else if (c22 != 2) {
                        bf.y(parcel, readInt22);
                    } else {
                        str10 = bf.h(parcel, readInt22);
                    }
                }
                bf.m(parcel, z49);
                m8.a aVar = new m8.a();
                aVar.a = str9;
                aVar.b = str10;
                return aVar;
            case 23:
                int z50 = bf.z(parcel);
                String str11 = null;
                while (parcel.dataPosition() < z50) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        bf.y(parcel, readInt23);
                    } else {
                        str11 = bf.h(parcel, readInt23);
                    }
                }
                bf.m(parcel, z50);
                m8.b bVar2 = new m8.b();
                bVar2.a = str11;
                return bVar2;
            case 24:
                int z51 = bf.z(parcel);
                while (parcel.dataPosition() < z51) {
                    bf.y(parcel, parcel.readInt());
                }
                bf.m(parcel, z51);
                return new m8.c();
            case 25:
                int z52 = bf.z(parcel);
                while (parcel.dataPosition() < z52) {
                    bf.y(parcel, parcel.readInt());
                }
                bf.m(parcel, z52);
                return new m8.d();
            case 26:
                MediaDescription mediaDescription = (MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel);
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle o10 = e2.n0.o(mediaDescription.getExtras());
                if (o10 != null) {
                    o10 = new Bundle(o10);
                }
                Bundle bundle2 = null;
                if (o10 != null) {
                    uri = (Uri) o10.getParcelable("android.support.v4.media.description.MEDIA_URI");
                    if (uri != null) {
                        if (!o10.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || o10.size() != 2) {
                            o10.remove("android.support.v4.media.description.MEDIA_URI");
                            o10.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                        }
                        if (uri == null) {
                            uri = mediaDescription.getMediaUri();
                        }
                        n4.h hVar2 = new n4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle2, uri);
                        hVar2.s = mediaDescription;
                        return hVar2;
                    }
                } else {
                    uri = null;
                }
                bundle2 = o10;
                if (uri == null) {
                }
                n4.h hVar22 = new n4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle2, uri);
                hVar22.s = mediaDescription;
                return hVar22;
            case 27:
                return new n4.i(parcel);
            case 28:
                return new n4.q(parcel);
            default:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new r(token, null);
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
                return new j6.b[i10];
            case 9:
                return new j6.c[i10];
            case 10:
                return new CameraPosition[i10];
            case 11:
                return new k8.b[i10];
            case 12:
                return new LatLngBounds[i10];
            case 13:
                return new LatLng[i10];
            case 14:
                return new k8.e[i10];
            case 15:
                return new k8.g[i10];
            case 16:
                return new k8.h[i10];
            case 17:
                return new l6.a[i10];
            case 18:
                return new l6.c[i10];
            case 19:
                return new l8.a[i10];
            case 20:
                return new n0[i10];
            case 21:
                return new DataHolder[i10];
            case 22:
                return new m8.a[i10];
            case 23:
                return new m8.b[i10];
            case 24:
                return new m8.c[i10];
            case 25:
                return new m8.d[i10];
            case 26:
                return new n4.h[i10];
            case 27:
                return new n4.i[i10];
            case 28:
                return new n4.q[i10];
            default:
                return new r[i10];
        }
    }
}
