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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import m.n0;
import w7.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g0.z(parcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            z11 = g0.n(parcel, readInt);
                            break;
                        case 2:
                            z12 = g0.n(parcel, readInt);
                            break;
                        case 3:
                            z13 = g0.n(parcel, readInt);
                            break;
                        case 4:
                            z14 = g0.n(parcel, readInt);
                            break;
                        case 5:
                            z15 = g0.n(parcel, readInt);
                            break;
                        case 6:
                            z16 = g0.n(parcel, readInt);
                            break;
                        default:
                            g0.y(parcel, readInt);
                            break;
                    }
                }
                g0.m(parcel, z10);
                return new f(z11, z12, z13, z14, z15, z16);
            case 1:
                int z17 = g0.z(parcel);
                int i10 = 1;
                int i11 = 1;
                long j10 = -1;
                long j11 = -1;
                while (parcel.dataPosition() < z17) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i10 = g0.u(parcel, readInt2);
                    } else if (c10 == 2) {
                        i11 = g0.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        j10 = g0.w(parcel, readInt2);
                    } else if (c10 != 4) {
                        g0.y(parcel, readInt2);
                    } else {
                        j11 = g0.w(parcel, readInt2);
                    }
                }
                g0.m(parcel, z17);
                return new h(j10, j11, i10, i11);
            case 2:
                int z18 = g0.z(parcel);
                long j12 = Long.MAX_VALUE;
                int i12 = 0;
                boolean z19 = false;
                String str = null;
                r7.j jVar = null;
                while (parcel.dataPosition() < z18) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        j12 = g0.w(parcel, readInt3);
                    } else if (c11 == 2) {
                        i12 = g0.u(parcel, readInt3);
                    } else if (c11 == 3) {
                        z19 = g0.n(parcel, readInt3);
                    } else if (c11 == 4) {
                        str = g0.h(parcel, readInt3);
                    } else if (c11 != 5) {
                        g0.y(parcel, readInt3);
                    } else {
                        jVar = (r7.j) g0.g(parcel, readInt3, r7.j.CREATOR);
                    }
                }
                g0.m(parcel, z18);
                return new a(j12, i12, z19, str, jVar);
            case 3:
                int z20 = g0.z(parcel);
                int i13 = 1000;
                int i14 = 1;
                int i15 = 1;
                long j13 = 0;
                h[] hVarArr = null;
                while (parcel.dataPosition() < z20) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i14 = g0.u(parcel, readInt4);
                            break;
                        case 2:
                            i15 = g0.u(parcel, readInt4);
                            break;
                        case 3:
                            j13 = g0.w(parcel, readInt4);
                            break;
                        case 4:
                            i13 = g0.u(parcel, readInt4);
                            break;
                        case 5:
                            hVarArr = (h[]) g0.k(parcel, readInt4, h.CREATOR);
                            break;
                        case 6:
                            g0.n(parcel, readInt4);
                            break;
                        default:
                            g0.y(parcel, readInt4);
                            break;
                    }
                }
                g0.m(parcel, z20);
                return new LocationAvailability(i13, i14, i15, j13, hVarArr);
            case 4:
                int z21 = g0.z(parcel);
                WorkSource workSource = new WorkSource();
                int i16 = 102;
                long j14 = 3600000;
                long j15 = 600000;
                long j16 = 0;
                long j17 = Long.MAX_VALUE;
                long j18 = Long.MAX_VALUE;
                int i17 = Integer.MAX_VALUE;
                float f7 = 0.0f;
                boolean z22 = false;
                int i18 = 0;
                int i19 = 0;
                boolean z23 = false;
                long j19 = -1;
                String str2 = null;
                r7.j jVar2 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i16 = g0.u(parcel, readInt5);
                            break;
                        case 2:
                            j14 = g0.w(parcel, readInt5);
                            break;
                        case 3:
                            j15 = g0.w(parcel, readInt5);
                            break;
                        case 4:
                        default:
                            g0.y(parcel, readInt5);
                            break;
                        case 5:
                            j17 = g0.w(parcel, readInt5);
                            break;
                        case 6:
                            i17 = g0.u(parcel, readInt5);
                            break;
                        case 7:
                            f7 = g0.r(parcel, readInt5);
                            break;
                        case '\b':
                            j16 = g0.w(parcel, readInt5);
                            break;
                        case '\t':
                            z22 = g0.n(parcel, readInt5);
                            break;
                        case '\n':
                            j18 = g0.w(parcel, readInt5);
                            break;
                        case 11:
                            j19 = g0.w(parcel, readInt5);
                            break;
                        case '\f':
                            i18 = g0.u(parcel, readInt5);
                            break;
                        case '\r':
                            i19 = g0.u(parcel, readInt5);
                            break;
                        case 14:
                            str2 = g0.h(parcel, readInt5);
                            break;
                        case 15:
                            z23 = g0.n(parcel, readInt5);
                            break;
                        case 16:
                            workSource = (WorkSource) g0.g(parcel, readInt5, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar2 = (r7.j) g0.g(parcel, readInt5, r7.j.CREATOR);
                            break;
                    }
                }
                g0.m(parcel, z21);
                return new LocationRequest(i16, j14, j15, j16, j17, j18, i17, f7, z22, j19, i18, i19, str2, z23, workSource, jVar2);
            case 5:
                int z24 = g0.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z24) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        g0.y(parcel, readInt6);
                    } else {
                        list = g0.l(parcel, readInt6, Location.CREATOR);
                    }
                }
                g0.m(parcel, z24);
                return new LocationResult(list);
            case 6:
                int z25 = g0.z(parcel);
                ArrayList arrayList = null;
                boolean z26 = false;
                boolean z27 = false;
                while (parcel.dataPosition() < z25) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        arrayList = g0.l(parcel, readInt7, LocationRequest.CREATOR);
                    } else if (c12 == 2) {
                        z26 = g0.n(parcel, readInt7);
                    } else if (c12 != 3) {
                        g0.y(parcel, readInt7);
                    } else {
                        z27 = g0.n(parcel, readInt7);
                    }
                }
                g0.m(parcel, z25);
                return new c(arrayList, z26, z27);
            case 7:
                int z28 = g0.z(parcel);
                boolean z29 = false;
                long j20 = 0;
                long j21 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        z29 = g0.n(parcel, readInt8);
                    } else if (c13 == 2) {
                        j21 = g0.w(parcel, readInt8);
                    } else if (c13 != 3) {
                        g0.y(parcel, readInt8);
                    } else {
                        j20 = g0.w(parcel, readInt8);
                    }
                }
                g0.m(parcel, z28);
                return new i6.b(j20, j21, z29);
            case 8:
                int z30 = g0.z(parcel);
                d2 d2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                k8.a[] aVarArr = null;
                boolean z31 = true;
                while (parcel.dataPosition() < z30) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            d2Var = (d2) g0.g(parcel, readInt9, d2.CREATOR);
                            break;
                        case 3:
                            bArr = g0.b(parcel, readInt9);
                            break;
                        case 4:
                            iArr = g0.d(parcel, readInt9);
                            break;
                        case 5:
                            strArr = g0.i(parcel, readInt9);
                            break;
                        case 6:
                            iArr2 = g0.d(parcel, readInt9);
                            break;
                        case 7:
                            bArr2 = g0.c(parcel, readInt9);
                            break;
                        case '\b':
                            z31 = g0.n(parcel, readInt9);
                            break;
                        case '\t':
                            aVarArr = (k8.a[]) g0.k(parcel, readInt9, k8.a.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt9);
                            break;
                    }
                }
                g0.m(parcel, z30);
                return new i6.c(d2Var, bArr, iArr, strArr, iArr2, bArr2, z31, aVarArr);
            case 9:
                int z32 = g0.z(parcel);
                LatLng latLng = null;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (parcel.dataPosition() < z32) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 2) {
                        latLng = (LatLng) g0.g(parcel, readInt10, LatLng.CREATOR);
                    } else if (c14 == 3) {
                        f10 = g0.r(parcel, readInt10);
                    } else if (c14 == 4) {
                        f11 = g0.r(parcel, readInt10);
                    } else if (c14 != 5) {
                        g0.y(parcel, readInt10);
                    } else {
                        f12 = g0.r(parcel, readInt10);
                    }
                }
                g0.m(parcel, z32);
                return new CameraPosition(latLng, f10, f11, f12);
            case 10:
                int z33 = g0.z(parcel);
                LatLng latLng2 = null;
                float f13 = 0.0f;
                int i20 = 0;
                int i21 = 0;
                boolean z34 = false;
                boolean z35 = false;
                double d = 0.0d;
                float f14 = 0.0f;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            latLng2 = (LatLng) g0.g(parcel, readInt11, LatLng.CREATOR);
                            break;
                        case 3:
                            d = g0.q(parcel, readInt11);
                            break;
                        case 4:
                            f14 = g0.r(parcel, readInt11);
                            break;
                        case 5:
                            i20 = g0.u(parcel, readInt11);
                            break;
                        case 6:
                            i21 = g0.u(parcel, readInt11);
                            break;
                        case 7:
                            f13 = g0.r(parcel, readInt11);
                            break;
                        case '\b':
                            z34 = g0.n(parcel, readInt11);
                            break;
                        case '\t':
                            z35 = g0.n(parcel, readInt11);
                            break;
                        case '\n':
                            arrayList2 = g0.l(parcel, readInt11, j8.g.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt11);
                            break;
                    }
                }
                g0.m(parcel, z33);
                j8.b bVar = new j8.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f14;
                bVar.d = i20;
                bVar.e = i21;
                bVar.f = f13;
                bVar.h = z34;
                bVar.n = z35;
                bVar.r = arrayList2;
                return bVar;
            case 11:
                int z36 = g0.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 2) {
                        latLng3 = (LatLng) g0.g(parcel, readInt12, LatLng.CREATOR);
                    } else if (c15 != 3) {
                        g0.y(parcel, readInt12);
                    } else {
                        latLng4 = (LatLng) g0.g(parcel, readInt12, LatLng.CREATOR);
                    }
                }
                g0.m(parcel, z36);
                return new LatLngBounds(latLng3, latLng4);
            case 12:
                int z37 = g0.z(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z37) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        d10 = g0.q(parcel, readInt13);
                    } else if (c16 != 3) {
                        g0.y(parcel, readInt13);
                    } else {
                        d11 = g0.q(parcel, readInt13);
                    }
                }
                g0.m(parcel, z37);
                return new LatLng(d10, d11);
            case 13:
                int z38 = g0.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        g0.y(parcel, readInt14);
                    } else {
                        str3 = g0.h(parcel, readInt14);
                    }
                }
                g0.m(parcel, z38);
                return new j8.d(str3);
            case 14:
                int z39 = g0.z(parcel);
                boolean z40 = false;
                boolean z41 = false;
                boolean z42 = false;
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
                while (parcel.dataPosition() < z39) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            latLng5 = (LatLng) g0.g(parcel, readInt15, LatLng.CREATOR);
                            break;
                        case 3:
                            str4 = g0.h(parcel, readInt15);
                            break;
                        case 4:
                            str5 = g0.h(parcel, readInt15);
                            break;
                        case 5:
                            iBinder = g0.t(parcel, readInt15);
                            break;
                        case 6:
                            f17 = g0.r(parcel, readInt15);
                            break;
                        case 7:
                            f18 = g0.r(parcel, readInt15);
                            break;
                        case '\b':
                            z40 = g0.n(parcel, readInt15);
                            break;
                        case '\t':
                            z41 = g0.n(parcel, readInt15);
                            break;
                        case '\n':
                            z42 = g0.n(parcel, readInt15);
                            break;
                        case 11:
                            f19 = g0.r(parcel, readInt15);
                            break;
                        case '\f':
                            f15 = g0.r(parcel, readInt15);
                            break;
                        case '\r':
                            f20 = g0.r(parcel, readInt15);
                            break;
                        case 14:
                            f16 = g0.r(parcel, readInt15);
                            break;
                        case 15:
                            f21 = g0.r(parcel, readInt15);
                            break;
                        default:
                            g0.y(parcel, readInt15);
                            break;
                    }
                }
                g0.m(parcel, z39);
                j8.f fVar = new j8.f();
                fVar.e = 0.5f;
                fVar.f = 1.0f;
                fVar.n = true;
                fVar.r = false;
                fVar.s = 0.0f;
                fVar.w = 0.5f;
                fVar.x = 0.0f;
                fVar.y = 1.0f;
                fVar.a = latLng5;
                fVar.b = str4;
                fVar.c = str5;
                if (iBinder == null) {
                    fVar.d = null;
                } else {
                    fVar.d = new k6.h(x6.b.M0(iBinder));
                }
                fVar.e = f17;
                fVar.f = f18;
                fVar.h = z40;
                fVar.n = z41;
                fVar.r = z42;
                fVar.s = f19;
                fVar.w = f15;
                fVar.x = f20;
                fVar.y = f16;
                fVar.D = f21;
                return fVar;
            case 15:
                int z43 = g0.z(parcel);
                int i22 = 0;
                Float f22 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 2) {
                        i22 = g0.u(parcel, readInt16);
                    } else if (c17 != 3) {
                        g0.y(parcel, readInt16);
                    } else {
                        f22 = g0.s(parcel, readInt16);
                    }
                }
                g0.m(parcel, z43);
                return new j8.g(i22, f22);
            case 16:
                int z44 = g0.z(parcel);
                PendingIntent pendingIntent = null;
                int i23 = 0;
                int i24 = 0;
                String str6 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 1) {
                        i23 = g0.u(parcel, readInt17);
                    } else if (c18 == 2) {
                        i24 = g0.u(parcel, readInt17);
                    } else if (c18 == 3) {
                        pendingIntent = (PendingIntent) g0.g(parcel, readInt17, PendingIntent.CREATOR);
                    } else if (c18 != 4) {
                        g0.y(parcel, readInt17);
                    } else {
                        str6 = g0.h(parcel, readInt17);
                    }
                }
                g0.m(parcel, z44);
                return new k6.a(i23, i24, pendingIntent, str6);
            case 17:
                int z45 = g0.z(parcel);
                long j22 = -1;
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        str7 = g0.h(parcel, readInt18);
                    } else if (c19 == 2) {
                        i25 = g0.u(parcel, readInt18);
                    } else if (c19 != 3) {
                        g0.y(parcel, readInt18);
                    } else {
                        j22 = g0.w(parcel, readInt18);
                    }
                }
                g0.m(parcel, z45);
                return new k6.c(i25, str7, j22);
            case 18:
                int z46 = g0.z(parcel);
                String str8 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr3 = null;
                byte[][] bArr8 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str8 = g0.h(parcel, readInt19);
                            break;
                        case 3:
                            bArr3 = g0.b(parcel, readInt19);
                            break;
                        case 4:
                            bArr4 = g0.c(parcel, readInt19);
                            break;
                        case 5:
                            bArr5 = g0.c(parcel, readInt19);
                            break;
                        case 6:
                            bArr6 = g0.c(parcel, readInt19);
                            break;
                        case 7:
                            bArr7 = g0.c(parcel, readInt19);
                            break;
                        case '\b':
                            iArr3 = g0.d(parcel, readInt19);
                            break;
                        case '\t':
                            bArr8 = g0.c(parcel, readInt19);
                            break;
                        default:
                            g0.y(parcel, readInt19);
                            break;
                    }
                }
                g0.m(parcel, z46);
                return new k8.a(str8, bArr3, bArr4, bArr5, bArr6, bArr7, iArr3, bArr8);
            case 19:
                int z47 = g0.z(parcel);
                String[] strArr2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < z47) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 1) {
                        strArr2 = g0.i(parcel, readInt20);
                    } else if (c20 == 2) {
                        cursorWindowArr = (CursorWindow[]) g0.k(parcel, readInt20, CursorWindow.CREATOR);
                    } else if (c20 == 3) {
                        i27 = g0.u(parcel, readInt20);
                    } else if (c20 == 4) {
                        bundle = g0.a(parcel, readInt20);
                    } else if (c20 != 1000) {
                        g0.y(parcel, readInt20);
                    } else {
                        i26 = g0.u(parcel, readInt20);
                    }
                }
                g0.m(parcel, z47);
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
            case 20:
                int z48 = g0.z(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 1) {
                        str9 = g0.h(parcel, readInt21);
                    } else if (c21 != 2) {
                        g0.y(parcel, readInt21);
                    } else {
                        str10 = g0.h(parcel, readInt21);
                    }
                }
                g0.m(parcel, z48);
                l8.a aVar = new l8.a();
                aVar.a = str9;
                aVar.b = str10;
                return aVar;
            case 21:
                int z49 = g0.z(parcel);
                String str11 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        g0.y(parcel, readInt22);
                    } else {
                        str11 = g0.h(parcel, readInt22);
                    }
                }
                g0.m(parcel, z49);
                l8.b bVar2 = new l8.b();
                bVar2.a = str11;
                return bVar2;
            case 22:
                int z50 = g0.z(parcel);
                while (parcel.dataPosition() < z50) {
                    g0.y(parcel, parcel.readInt());
                }
                g0.m(parcel, z50);
                return new l8.c();
            case 23:
                int z51 = g0.z(parcel);
                while (parcel.dataPosition() < z51) {
                    g0.y(parcel, parcel.readInt());
                }
                g0.m(parcel, z51);
                return new l8.d();
            case 24:
                n0 n0Var = new n0(parcel);
                n0Var.a = parcel.readByte() != 0;
                return n0Var;
            case 25:
                int z52 = g0.z(parcel);
                int i31 = 0;
                int i32 = 0;
                Uri uri = null;
                int i33 = 0;
                while (parcel.dataPosition() < z52) {
                    int readInt23 = parcel.readInt();
                    char c22 = (char) readInt23;
                    if (c22 == 1) {
                        i31 = g0.u(parcel, readInt23);
                    } else if (c22 == 2) {
                        uri = (Uri) g0.g(parcel, readInt23, Uri.CREATOR);
                    } else if (c22 == 3) {
                        i33 = g0.u(parcel, readInt23);
                    } else if (c22 != 4) {
                        g0.y(parcel, readInt23);
                    } else {
                        i32 = g0.u(parcel, readInt23);
                    }
                }
                g0.m(parcel, z52);
                return new m6.a(i31, uri, i33, i32);
            case 26:
                int z53 = g0.z(parcel);
                String str12 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 2) {
                        g0.y(parcel, readInt24);
                    } else {
                        str12 = g0.h(parcel, readInt24);
                    }
                }
                g0.m(parcel, z53);
                return new m8.e(str12);
            case 27:
                int z54 = g0.z(parcel);
                String str13 = null;
                int i34 = 0;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < z54) {
                    int readInt25 = parcel.readInt();
                    char c23 = (char) readInt25;
                    if (c23 == 2) {
                        str13 = g0.h(parcel, readInt25);
                    } else if (c23 == 3) {
                        bArr9 = g0.b(parcel, readInt25);
                    } else if (c23 != 4) {
                        g0.y(parcel, readInt25);
                    } else {
                        i34 = g0.u(parcel, readInt25);
                    }
                }
                g0.m(parcel, z54);
                return new m8.a(i34, str13, bArr9);
            case 28:
                int z55 = g0.z(parcel);
                long j23 = 0;
                m8.a[] aVarArr2 = null;
                int i35 = 0;
                boolean z56 = false;
                while (parcel.dataPosition() < z55) {
                    int readInt26 = parcel.readInt();
                    char c24 = (char) readInt26;
                    if (c24 == 2) {
                        j23 = g0.w(parcel, readInt26);
                    } else if (c24 == 3) {
                        aVarArr2 = (m8.a[]) g0.k(parcel, readInt26, m8.a.CREATOR);
                    } else if (c24 == 4) {
                        i35 = g0.u(parcel, readInt26);
                    } else if (c24 != 5) {
                        g0.y(parcel, readInt26);
                    } else {
                        z56 = g0.n(parcel, readInt26);
                    }
                }
                g0.m(parcel, z55);
                return new m8.f(j23, aVarArr2, i35, z56);
            default:
                int z57 = g0.z(parcel);
                String str14 = null;
                while (parcel.dataPosition() < z57) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 2) {
                        g0.y(parcel, readInt27);
                    } else {
                        str14 = g0.h(parcel, readInt27);
                    }
                }
                g0.m(parcel, z57);
                return new m8.g(str14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new f[i10];
            case 1:
                return new h[i10];
            case 2:
                return new a[i10];
            case 3:
                return new LocationAvailability[i10];
            case 4:
                return new LocationRequest[i10];
            case 5:
                return new LocationResult[i10];
            case 6:
                return new c[i10];
            case 7:
                return new i6.b[i10];
            case 8:
                return new i6.c[i10];
            case 9:
                return new CameraPosition[i10];
            case 10:
                return new j8.b[i10];
            case 11:
                return new LatLngBounds[i10];
            case 12:
                return new LatLng[i10];
            case 13:
                return new j8.d[i10];
            case 14:
                return new j8.f[i10];
            case 15:
                return new j8.g[i10];
            case 16:
                return new k6.a[i10];
            case 17:
                return new k6.c[i10];
            case 18:
                return new k8.a[i10];
            case 19:
                return new DataHolder[i10];
            case 20:
                return new l8.a[i10];
            case 21:
                return new l8.b[i10];
            case 22:
                return new l8.c[i10];
            case 23:
                return new l8.d[i10];
            case 24:
                return new n0[i10];
            case 25:
                return new m6.a[i10];
            case 26:
                return new m8.e[i10];
            case 27:
                return new m8.a[i10];
            case 28:
                return new m8.f[i10];
            default:
                return new m8.g[i10];
        }
    }
}
