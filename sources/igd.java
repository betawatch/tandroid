// default package

import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class igd implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ igd(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        float f = 0.0f;
        double d = 0.0d;
        long j = 0;
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ArrayList arrayList = null;
        String str8 = null;
        PointF[] pointFArr = null;
        String str9 = null;
        switch (this.a) {
            case 0:
                int z = gte.z(parcel);
                while (parcel.dataPosition() < z) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        gte.y(parcel, readInt);
                    } else {
                        i = gte.u(parcel, readInt);
                    }
                }
                gte.m(parcel, z);
                return new cgd(i);
            case 1:
                int z2 = gte.z(parcel);
                long j2 = 0;
                long j3 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        j2 = gte.w(parcel, readInt2);
                    } else if (c == 3) {
                        j3 = gte.w(parcel, readInt2);
                    } else if (c == 4) {
                        z3 = gte.n(parcel, readInt2);
                    } else if (c != 5) {
                        gte.y(parcel, readInt2);
                    } else {
                        z4 = gte.n(parcel, readInt2);
                    }
                }
                gte.m(parcel, z2);
                return new er6(j2, j3, z3, z4);
            case 2:
                int z5 = gte.z(parcel);
                float f2 = 0.0f;
                int i2 = 0;
                boolean z6 = false;
                boolean z7 = false;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            latLng = (LatLng) gte.g(parcel, readInt3, LatLng.CREATOR);
                            break;
                        case 3:
                            d = gte.q(parcel, readInt3);
                            break;
                        case 4:
                            f = gte.r(parcel, readInt3);
                            break;
                        case 5:
                            i = gte.u(parcel, readInt3);
                            break;
                        case 6:
                            i2 = gte.u(parcel, readInt3);
                            break;
                        case 7:
                            f2 = gte.r(parcel, readInt3);
                            break;
                        case '\b':
                            z6 = gte.n(parcel, readInt3);
                            break;
                        case '\t':
                            z7 = gte.n(parcel, readInt3);
                            break;
                        case '\n':
                            arrayList2 = gte.l(parcel, readInt3, my7.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt3);
                            break;
                    }
                }
                gte.m(parcel, z5);
                hh2 hh2Var = new hh2();
                hh2Var.a = latLng;
                hh2Var.b = d;
                hh2Var.c = f;
                hh2Var.d = i;
                hh2Var.e = i2;
                hh2Var.f = f2;
                hh2Var.h = z6;
                hh2Var.n = z7;
                hh2Var.r = arrayList2;
                return hh2Var;
            case 3:
                int z8 = gte.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 2) {
                        str9 = gte.h(parcel, readInt4);
                    } else if (c2 == 3) {
                        bArr = gte.b(parcel, readInt4);
                    } else if (c2 != 4) {
                        gte.y(parcel, readInt4);
                    } else {
                        i = gte.u(parcel, readInt4);
                    }
                }
                gte.m(parcel, z8);
                return new nc5(i, str9, bArr);
            case 4:
                int z9 = gte.z(parcel);
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 2) {
                        pointFArr = (PointF[]) gte.k(parcel, readInt5, PointF.CREATOR);
                    } else if (c3 != 3) {
                        gte.y(parcel, readInt5);
                    } else {
                        i = gte.u(parcel, readInt5);
                    }
                }
                gte.m(parcel, z9);
                return new u4d(pointFArr, i);
            case 5:
                int z10 = gte.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                boolean z11 = false;
                pnb pnbVar = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    String str19 = str12;
                    switch ((char) readInt6) {
                        case 2:
                            str8 = gte.h(parcel, readInt6);
                            break;
                        case 3:
                            str13 = gte.h(parcel, readInt6);
                            break;
                        case 4:
                            str14 = gte.h(parcel, readInt6);
                            break;
                        case 5:
                            str15 = gte.h(parcel, readInt6);
                            break;
                        case 6:
                            str16 = gte.h(parcel, readInt6);
                            break;
                        case 7:
                            str17 = gte.h(parcel, readInt6);
                            break;
                        case '\b':
                            str11 = gte.h(parcel, readInt6);
                            break;
                        case '\t':
                            str10 = gte.h(parcel, readInt6);
                            break;
                        case '\n':
                            i = gte.u(parcel, readInt6);
                            break;
                        case 11:
                            arrayList3 = gte.l(parcel, readInt6, uoc.CREATOR);
                            break;
                        case '\f':
                            pnbVar = (pnb) gte.g(parcel, readInt6, pnb.CREATOR);
                            break;
                        case '\r':
                            arrayList4 = gte.l(parcel, readInt6, LatLng.CREATOR);
                            break;
                        case 14:
                            str12 = gte.h(parcel, readInt6);
                            continue;
                        case 15:
                            str18 = gte.h(parcel, readInt6);
                            break;
                        case 16:
                            arrayList6 = gte.l(parcel, readInt6, uw5.CREATOR);
                            break;
                        case 17:
                            z11 = gte.n(parcel, readInt6);
                            break;
                        case 18:
                            arrayList7 = gte.l(parcel, readInt6, r6c.CREATOR);
                            break;
                        case 19:
                            arrayList8 = gte.l(parcel, readInt6, phb.CREATOR);
                            break;
                        case 20:
                            arrayList9 = gte.l(parcel, readInt6, r6c.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt6);
                            break;
                    }
                    str12 = str19;
                }
                gte.m(parcel, z10);
                CommonWalletObject commonWalletObject = new CommonWalletObject();
                commonWalletObject.a = str8;
                commonWalletObject.b = str13;
                commonWalletObject.c = str14;
                commonWalletObject.d = str15;
                commonWalletObject.e = str16;
                commonWalletObject.f = str17;
                commonWalletObject.h = str11;
                commonWalletObject.n = str10;
                commonWalletObject.r = i;
                commonWalletObject.s = arrayList3;
                commonWalletObject.w = pnbVar;
                commonWalletObject.x = arrayList4;
                commonWalletObject.y = str12;
                commonWalletObject.E = str18;
                commonWalletObject.F = arrayList6;
                commonWalletObject.G = z11;
                commonWalletObject.H = arrayList7;
                commonWalletObject.I = arrayList8;
                commonWalletObject.J = arrayList9;
                return commonWalletObject;
            case 6:
                int z12 = gte.z(parcel);
                boolean z13 = true;
                int i3 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        i = gte.u(parcel, readInt7);
                    } else if (c4 == 2) {
                        i3 = gte.u(parcel, readInt7);
                    } else if (c4 == 3) {
                        i4 = gte.u(parcel, readInt7);
                    } else if (c4 != 4) {
                        gte.y(parcel, readInt7);
                    } else {
                        z13 = gte.n(parcel, readInt7);
                    }
                }
                gte.m(parcel, z12);
                return new jp2(i, i3, i4, z13);
            case 7:
                int z14 = gte.z(parcel);
                w8c w8cVar = null;
                wyd wydVar = null;
                y40 y40Var = null;
                lce lceVar = null;
                String str20 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 1) {
                        w8cVar = (w8c) gte.g(parcel, readInt8, w8c.CREATOR);
                    } else if (c5 == 2) {
                        wydVar = (wyd) gte.g(parcel, readInt8, wyd.CREATOR);
                    } else if (c5 == 3) {
                        y40Var = (y40) gte.g(parcel, readInt8, y40.CREATOR);
                    } else if (c5 == 4) {
                        lceVar = (lce) gte.g(parcel, readInt8, lce.CREATOR);
                    } else if (c5 != 5) {
                        gte.y(parcel, readInt8);
                    } else {
                        str20 = gte.h(parcel, readInt8);
                    }
                }
                gte.m(parcel, z14);
                return new x40(w8cVar, wydVar, y40Var, lceVar, str20);
            case 8:
                int z15 = gte.z(parcel);
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 2) {
                        j4 = gte.w(parcel, readInt9);
                    } else if (c6 == 3) {
                        j5 = gte.w(parcel, readInt9);
                    } else if (c6 == 4) {
                        str21 = gte.h(parcel, readInt9);
                    } else if (c6 == 5) {
                        str22 = gte.h(parcel, readInt9);
                    } else if (c6 != 6) {
                        gte.y(parcel, readInt9);
                    } else {
                        j6 = gte.w(parcel, readInt9);
                    }
                }
                gte.m(parcel, z15);
                return new aa(j4, j5, str21, str22, j6);
            case 9:
                int z16 = gte.z(parcel);
                double d2 = 0.0d;
                long j7 = 0;
                long j8 = 0;
                String str23 = null;
                MediaInfo mediaInfo = null;
                yr6 yr6Var = null;
                Boolean bool = null;
                long[] jArr = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            mediaInfo = (MediaInfo) gte.g(parcel, readInt10, MediaInfo.CREATOR);
                            break;
                        case 3:
                            yr6Var = (yr6) gte.g(parcel, readInt10, yr6.CREATOR);
                            break;
                        case 4:
                            bool = gte.o(parcel, readInt10);
                            break;
                        case 5:
                            j7 = gte.w(parcel, readInt10);
                            break;
                        case 6:
                            d2 = gte.q(parcel, readInt10);
                            break;
                        case 7:
                            jArr = gte.f(parcel, readInt10);
                            break;
                        case '\b':
                            str23 = gte.h(parcel, readInt10);
                            break;
                        case '\t':
                            str24 = gte.h(parcel, readInt10);
                            break;
                        case '\n':
                            str25 = gte.h(parcel, readInt10);
                            break;
                        case 11:
                            str26 = gte.h(parcel, readInt10);
                            break;
                        case '\f':
                            str27 = gte.h(parcel, readInt10);
                            break;
                        case '\r':
                            j8 = gte.w(parcel, readInt10);
                            break;
                        default:
                            gte.y(parcel, readInt10);
                            break;
                    }
                }
                gte.m(parcel, z16);
                Pattern pattern = id1.a;
                if (str23 != null) {
                    try {
                        jSONObject = new JSONObject(str23);
                    } catch (JSONException unused) {
                    }
                    return new gr6(mediaInfo, yr6Var, bool, j7, d2, jArr, jSONObject, str24, str25, str26, str27, j8);
                }
                jSONObject = null;
                return new gr6(mediaInfo, yr6Var, bool, j7, d2, jArr, jSONObject, str24, str25, str26, str27, j8);
            case 10:
                int z17 = gte.z(parcel);
                while (parcel.dataPosition() < z17) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        gte.y(parcel, readInt11);
                    } else {
                        i = gte.u(parcel, readInt11);
                    }
                }
                gte.m(parcel, z17);
                return new cid(i);
            case 11:
                int z18 = gte.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z18) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 2) {
                        arrayList = gte.l(parcel, readInt12, vsc.CREATOR);
                    } else if (c7 == 3) {
                        bundle = gte.a(parcel, readInt12);
                    } else if (c7 != 4) {
                        gte.y(parcel, readInt12);
                    } else {
                        i = gte.u(parcel, readInt12);
                    }
                }
                gte.m(parcel, z18);
                return new ir6(arrayList, bundle, i);
            case 12:
                int z19 = gte.z(parcel);
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 2) {
                        i = gte.u(parcel, readInt13);
                    } else if (c8 == 3) {
                        str7 = gte.h(parcel, readInt13);
                    } else if (c8 == 4) {
                        arrayList10 = gte.l(parcel, readInt13, ir6.CREATOR);
                    } else if (c8 == 5) {
                        arrayList11 = gte.l(parcel, readInt13, vsc.CREATOR);
                    } else if (c8 != 6) {
                        gte.y(parcel, readInt13);
                    } else {
                        d = gte.q(parcel, readInt13);
                    }
                }
                gte.m(parcel, z19);
                xr6 xr6Var = new xr6();
                xr6Var.a = i;
                xr6Var.b = str7;
                xr6Var.c = arrayList10;
                xr6Var.d = arrayList11;
                xr6Var.e = d;
                return xr6Var;
            case 13:
                int z20 = gte.z(parcel);
                int i5 = 0;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        i5 = gte.u(parcel, readInt14);
                    } else if (c9 == 2) {
                        z21 = gte.n(parcel, readInt14);
                    } else if (c9 == 3) {
                        z22 = gte.n(parcel, readInt14);
                    } else if (c9 == 4) {
                        z23 = gte.n(parcel, readInt14);
                    } else if (c9 != 5) {
                        gte.y(parcel, readInt14);
                    } else {
                        z24 = gte.n(parcel, readInt14);
                    }
                }
                gte.m(parcel, z20);
                return new rid(i5, z21, z22, z23, z24);
            case 14:
                int z25 = gte.z(parcel);
                int i6 = 0;
                int i7 = 0;
                boolean z26 = false;
                String str28 = null;
                String str29 = null;
                xr6 xr6Var2 = null;
                ArrayList arrayList12 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            str6 = gte.h(parcel, readInt15);
                            break;
                        case 3:
                            str28 = gte.h(parcel, readInt15);
                            break;
                        case 4:
                            i = gte.u(parcel, readInt15);
                            break;
                        case 5:
                            str29 = gte.h(parcel, readInt15);
                            break;
                        case 6:
                            xr6Var2 = (xr6) gte.g(parcel, readInt15, xr6.CREATOR);
                            break;
                        case 7:
                            i6 = gte.u(parcel, readInt15);
                            break;
                        case '\b':
                            arrayList12 = gte.l(parcel, readInt15, zr6.CREATOR);
                            break;
                        case '\t':
                            i7 = gte.u(parcel, readInt15);
                            break;
                        case '\n':
                            j = gte.w(parcel, readInt15);
                            break;
                        case 11:
                            z26 = gte.n(parcel, readInt15);
                            break;
                        default:
                            gte.y(parcel, readInt15);
                            break;
                    }
                }
                gte.m(parcel, z25);
                yr6 yr6Var2 = new yr6();
                yr6Var2.a = str6;
                yr6Var2.b = str28;
                yr6Var2.c = i;
                yr6Var2.d = str29;
                yr6Var2.e = xr6Var2;
                yr6Var2.f = i6;
                yr6Var2.h = arrayList12;
                yr6Var2.n = i7;
                yr6Var2.r = j;
                yr6Var2.s = z26;
                return yr6Var2;
            case 15:
                int z27 = gte.z(parcel);
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                int i8 = 0;
                boolean z28 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str30 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            mediaInfo2 = (MediaInfo) gte.g(parcel, readInt16, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i8 = gte.u(parcel, readInt16);
                            break;
                        case 4:
                            z28 = gte.n(parcel, readInt16);
                            break;
                        case 5:
                            d3 = gte.q(parcel, readInt16);
                            break;
                        case 6:
                            d4 = gte.q(parcel, readInt16);
                            break;
                        case 7:
                            d5 = gte.q(parcel, readInt16);
                            break;
                        case '\b':
                            jArr2 = gte.f(parcel, readInt16);
                            break;
                        case '\t':
                            str30 = gte.h(parcel, readInt16);
                            break;
                        default:
                            gte.y(parcel, readInt16);
                            break;
                    }
                }
                gte.m(parcel, z27);
                return new zr6(mediaInfo2, i8, z28, d3, d4, d5, jArr2, str30);
            case 16:
                int z29 = gte.z(parcel);
                double d6 = 0.0d;
                double d7 = 0.0d;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z30 = false;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z31 = false;
                MediaInfo mediaInfo3 = null;
                long[] jArr3 = null;
                String str31 = null;
                ArrayList arrayList13 = null;
                aa aaVar = null;
                bbc bbcVar = null;
                er6 er6Var = null;
                yr6 yr6Var3 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            mediaInfo3 = (MediaInfo) gte.g(parcel, readInt17, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j9 = gte.w(parcel, readInt17);
                            break;
                        case 4:
                            i9 = gte.u(parcel, readInt17);
                            break;
                        case 5:
                            d6 = gte.q(parcel, readInt17);
                            break;
                        case 6:
                            i10 = gte.u(parcel, readInt17);
                            break;
                        case 7:
                            i11 = gte.u(parcel, readInt17);
                            break;
                        case '\b':
                            j10 = gte.w(parcel, readInt17);
                            break;
                        case '\t':
                            j11 = gte.w(parcel, readInt17);
                            break;
                        case '\n':
                            d7 = gte.q(parcel, readInt17);
                            break;
                        case 11:
                            z30 = gte.n(parcel, readInt17);
                            break;
                        case '\f':
                            jArr3 = gte.f(parcel, readInt17);
                            break;
                        case '\r':
                            i12 = gte.u(parcel, readInt17);
                            break;
                        case 14:
                            i13 = gte.u(parcel, readInt17);
                            break;
                        case 15:
                            str31 = gte.h(parcel, readInt17);
                            break;
                        case 16:
                            i14 = gte.u(parcel, readInt17);
                            break;
                        case 17:
                            arrayList13 = gte.l(parcel, readInt17, zr6.CREATOR);
                            break;
                        case 18:
                            z31 = gte.n(parcel, readInt17);
                            break;
                        case 19:
                            aaVar = (aa) gte.g(parcel, readInt17, aa.CREATOR);
                            break;
                        case 20:
                            bbcVar = (bbc) gte.g(parcel, readInt17, bbc.CREATOR);
                            break;
                        case 21:
                            er6Var = (er6) gte.g(parcel, readInt17, er6.CREATOR);
                            break;
                        case 22:
                            yr6Var3 = (yr6) gte.g(parcel, readInt17, yr6.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt17);
                            break;
                    }
                }
                gte.m(parcel, z29);
                return new fy6(mediaInfo3, j9, i9, d6, i10, i11, j10, j11, d7, z30, jArr3, i12, i13, str31, i14, arrayList13, z31, aaVar, bbcVar, er6Var, yr6Var3);
            case 17:
                int z32 = gte.z(parcel);
                long j12 = 0;
                int i15 = 0;
                int i16 = 0;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                ArrayList arrayList14 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            j12 = gte.w(parcel, readInt18);
                            break;
                        case 3:
                            i15 = gte.u(parcel, readInt18);
                            break;
                        case 4:
                            str33 = gte.h(parcel, readInt18);
                            break;
                        case 5:
                            str34 = gte.h(parcel, readInt18);
                            break;
                        case 6:
                            str35 = gte.h(parcel, readInt18);
                            break;
                        case 7:
                            str36 = gte.h(parcel, readInt18);
                            break;
                        case '\b':
                            i16 = gte.u(parcel, readInt18);
                            break;
                        case '\t':
                            arrayList14 = gte.j(parcel, readInt18);
                            break;
                        case '\n':
                            str32 = gte.h(parcel, readInt18);
                            break;
                        default:
                            gte.y(parcel, readInt18);
                            break;
                    }
                }
                gte.m(parcel, z32);
                Pattern pattern2 = id1.a;
                if (str32 != null) {
                    try {
                        jSONObject2 = new JSONObject(str32);
                    } catch (JSONException unused2) {
                    }
                    return new MediaTrack(j12, i15, str33, str34, str35, str36, i16, arrayList14, jSONObject2);
                }
                jSONObject2 = null;
                return new MediaTrack(j12, i15, str33, str34, str35, str36, i16, arrayList14, jSONObject2);
            case 18:
                int z33 = gte.z(parcel);
                long j13 = 0;
                long j14 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 1) {
                        z34 = gte.n(parcel, readInt19);
                    } else if (c10 == 2) {
                        j14 = gte.w(parcel, readInt19);
                    } else if (c10 != 3) {
                        gte.y(parcel, readInt19);
                    } else {
                        j13 = gte.w(parcel, readInt19);
                    }
                }
                gte.m(parcel, z33);
                return new tgd(j13, j14, z34);
            case 19:
                int z35 = gte.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        gte.y(parcel, readInt20);
                    } else {
                        str5 = gte.h(parcel, readInt20);
                    }
                }
                gte.m(parcel, z35);
                r44 r44Var = new r44();
                r44Var.a = str5;
                return r44Var;
            case 20:
                int z36 = gte.z(parcel);
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            i = gte.u(parcel, readInt21);
                            break;
                        case 3:
                            i17 = gte.u(parcel, readInt21);
                            break;
                        case 4:
                            i18 = gte.u(parcel, readInt21);
                            break;
                        case 5:
                            i19 = gte.u(parcel, readInt21);
                            break;
                        case 6:
                            i20 = gte.u(parcel, readInt21);
                            break;
                        case 7:
                            i21 = gte.u(parcel, readInt21);
                            break;
                        case '\b':
                            z37 = gte.n(parcel, readInt21);
                            break;
                        case '\t':
                            str4 = gte.h(parcel, readInt21);
                            break;
                        default:
                            gte.y(parcel, readInt21);
                            break;
                    }
                }
                gte.m(parcel, z36);
                me0 me0Var = new me0();
                me0Var.a = i;
                me0Var.b = i17;
                me0Var.c = i18;
                me0Var.d = i19;
                me0Var.e = i20;
                me0Var.f = i21;
                me0Var.h = z37;
                me0Var.n = str4;
                return me0Var;
            case 21:
                int z38 = gte.z(parcel);
                float f3 = Float.MAX_VALUE;
                float f4 = Float.MAX_VALUE;
                float f5 = Float.MAX_VALUE;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = -1.0f;
                int i22 = 0;
                int i23 = 0;
                LandmarkParcel[] landmarkParcelArr = null;
                u4d[] u4dVarArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            i22 = gte.u(parcel, readInt22);
                            break;
                        case 2:
                            i23 = gte.u(parcel, readInt22);
                            break;
                        case 3:
                            f6 = gte.r(parcel, readInt22);
                            break;
                        case 4:
                            f7 = gte.r(parcel, readInt22);
                            break;
                        case 5:
                            f8 = gte.r(parcel, readInt22);
                            break;
                        case 6:
                            f9 = gte.r(parcel, readInt22);
                            break;
                        case 7:
                            f3 = gte.r(parcel, readInt22);
                            break;
                        case '\b':
                            f4 = gte.r(parcel, readInt22);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) gte.k(parcel, readInt22, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f10 = gte.r(parcel, readInt22);
                            break;
                        case 11:
                            f11 = gte.r(parcel, readInt22);
                            break;
                        case '\f':
                            f12 = gte.r(parcel, readInt22);
                            break;
                        case '\r':
                            u4dVarArr = (u4d[]) gte.k(parcel, readInt22, u4d.CREATOR);
                            break;
                        case 14:
                            f5 = gte.r(parcel, readInt22);
                            break;
                        case 15:
                            f13 = gte.r(parcel, readInt22);
                            break;
                        default:
                            gte.y(parcel, readInt22);
                            break;
                    }
                }
                gte.m(parcel, z38);
                return new FaceParcel(i22, i23, f6, f7, f8, f9, f3, f4, f5, landmarkParcelArr, f10, f11, f12, u4dVarArr, f13);
            case 22:
                int z39 = gte.z(parcel);
                String str37 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    char c11 = (char) readInt23;
                    if (c11 == 2) {
                        str3 = gte.h(parcel, readInt23);
                    } else if (c11 != 3) {
                        gte.y(parcel, readInt23);
                    } else {
                        str37 = gte.h(parcel, readInt23);
                    }
                }
                gte.m(parcel, z39);
                tw5 tw5Var = new tw5();
                tw5Var.a = str3;
                tw5Var.b = str37;
                return tw5Var;
            case 23:
                int z40 = gte.z(parcel);
                int i24 = 0;
                int i25 = 0;
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                int i26 = 0;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                ArrayList arrayList15 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            str38 = gte.h(parcel, readInt24);
                            break;
                        case 3:
                            str39 = gte.h(parcel, readInt24);
                            break;
                        case 4:
                            i24 = gte.u(parcel, readInt24);
                            break;
                        case 5:
                            i25 = gte.u(parcel, readInt24);
                            break;
                        case 6:
                            z41 = gte.n(parcel, readInt24);
                            break;
                        case 7:
                            z42 = gte.n(parcel, readInt24);
                            break;
                        case '\b':
                            str40 = gte.h(parcel, readInt24);
                            break;
                        case '\t':
                            z43 = gte.n(parcel, readInt24);
                            break;
                        case '\n':
                            str41 = gte.h(parcel, readInt24);
                            break;
                        case 11:
                            str42 = gte.h(parcel, readInt24);
                            break;
                        case '\f':
                            i26 = gte.u(parcel, readInt24);
                            break;
                        case '\r':
                            arrayList15 = gte.j(parcel, readInt24);
                            break;
                        default:
                            gte.y(parcel, readInt24);
                            break;
                    }
                }
                gte.m(parcel, z40);
                return new ConnectionConfiguration(str38, str39, i24, i25, z41, z42, str40, z43, str41, str42, i26, arrayList15);
            case 24:
                int z44 = gte.z(parcel);
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                kbd kbdVar = null;
                String str47 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str43 = gte.h(parcel, readInt25);
                            break;
                        case 2:
                            str44 = gte.h(parcel, readInt25);
                            break;
                        case 3:
                            str45 = gte.h(parcel, readInt25);
                            break;
                        case 4:
                            str46 = gte.h(parcel, readInt25);
                            break;
                        case 5:
                            kbdVar = (kbd) gte.g(parcel, readInt25, kbd.CREATOR);
                            break;
                        case 6:
                            str47 = gte.h(parcel, readInt25);
                            break;
                        case 7:
                            bundle2 = gte.a(parcel, readInt25);
                            break;
                        default:
                            gte.y(parcel, readInt25);
                            break;
                    }
                }
                gte.m(parcel, z44);
                return new fhd(str43, str44, str45, str46, kbdVar, str47, bundle2);
            case 25:
                int z45 = gte.z(parcel);
                while (parcel.dataPosition() < z45) {
                    int readInt26 = parcel.readInt();
                    char c12 = (char) readInt26;
                    if (c12 == 1) {
                        i = gte.u(parcel, readInt26);
                    } else if (c12 != 2) {
                        gte.y(parcel, readInt26);
                    } else {
                        str2 = gte.h(parcel, readInt26);
                    }
                }
                gte.m(parcel, z45);
                return new Scope(i, str2);
            case 26:
                int z46 = gte.z(parcel);
                v84 v84Var = null;
                ycf ycfVar = null;
                t7c t7cVar = null;
                whf whfVar = null;
                n5d n5dVar = null;
                z5d z5dVar = null;
                hff hffVar = null;
                s6d s6dVar = null;
                dz4 dz4Var = null;
                w7d w7dVar = null;
                had hadVar = null;
                d7d d7dVar = null;
                while (parcel.dataPosition() < z46) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            v84Var = (v84) gte.g(parcel, readInt27, v84.CREATOR);
                            break;
                        case 3:
                            ycfVar = (ycf) gte.g(parcel, readInt27, ycf.CREATOR);
                            break;
                        case 4:
                            t7cVar = (t7c) gte.g(parcel, readInt27, t7c.CREATOR);
                            break;
                        case 5:
                            whfVar = (whf) gte.g(parcel, readInt27, whf.CREATOR);
                            break;
                        case 6:
                            n5dVar = (n5d) gte.g(parcel, readInt27, n5d.CREATOR);
                            break;
                        case 7:
                            z5dVar = (z5d) gte.g(parcel, readInt27, z5d.CREATOR);
                            break;
                        case '\b':
                            hffVar = (hff) gte.g(parcel, readInt27, hff.CREATOR);
                            break;
                        case '\t':
                            s6dVar = (s6d) gte.g(parcel, readInt27, s6d.CREATOR);
                            break;
                        case '\n':
                            dz4Var = (dz4) gte.g(parcel, readInt27, dz4.CREATOR);
                            break;
                        case 11:
                            w7dVar = (w7d) gte.g(parcel, readInt27, w7d.CREATOR);
                            break;
                        case '\f':
                            hadVar = (had) gte.g(parcel, readInt27, had.CREATOR);
                            break;
                        case '\r':
                            d7dVar = (d7d) gte.g(parcel, readInt27, d7d.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt27);
                            break;
                    }
                }
                gte.m(parcel, z46);
                return new w40(v84Var, ycfVar, t7cVar, whfVar, n5dVar, z5dVar, hffVar, s6dVar, dz4Var, w7dVar, hadVar, d7dVar);
            case 27:
                int z47 = gte.z(parcel);
                String str48 = null;
                String str49 = null;
                ArrayList arrayList16 = null;
                String str50 = null;
                Uri uri = null;
                String str51 = null;
                String str52 = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 2:
                            str48 = gte.h(parcel, readInt28);
                            break;
                        case 3:
                            str49 = gte.h(parcel, readInt28);
                            break;
                        case 4:
                            gte.l(parcel, readInt28, vsc.CREATOR);
                            break;
                        case 5:
                            arrayList16 = gte.j(parcel, readInt28);
                            break;
                        case 6:
                            str50 = gte.h(parcel, readInt28);
                            break;
                        case 7:
                            uri = (Uri) gte.g(parcel, readInt28, Uri.CREATOR);
                            break;
                        case '\b':
                            str51 = gte.h(parcel, readInt28);
                            break;
                        case '\t':
                            str52 = gte.h(parcel, readInt28);
                            break;
                        case '\n':
                            bool2 = gte.o(parcel, readInt28);
                            break;
                        case 11:
                            bool3 = gte.o(parcel, readInt28);
                            break;
                        default:
                            gte.y(parcel, readInt28);
                            break;
                    }
                }
                gte.m(parcel, z47);
                return new wr(str48, str49, arrayList16, str50, uri, str51, str52, bool2, bool3);
            case 28:
                int z48 = gte.z(parcel);
                long j15 = Long.MAX_VALUE;
                boolean z49 = false;
                boolean z50 = false;
                boolean z51 = false;
                boolean z52 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayList17 = null;
                String str53 = null;
                String str54 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt29 = parcel.readInt();
                    char c13 = (char) readInt29;
                    if (c13 == 1) {
                        locationRequest = (LocationRequest) gte.g(parcel, readInt29, LocationRequest.CREATOR);
                    } else if (c13 != 5) {
                        switch (c13) {
                            case '\b':
                                z49 = gte.n(parcel, readInt29);
                                break;
                            case '\t':
                                z50 = gte.n(parcel, readInt29);
                                break;
                            case '\n':
                                str53 = gte.h(parcel, readInt29);
                                break;
                            case 11:
                                z51 = gte.n(parcel, readInt29);
                                break;
                            case '\f':
                                z52 = gte.n(parcel, readInt29);
                                break;
                            case '\r':
                                str54 = gte.h(parcel, readInt29);
                                break;
                            case 14:
                                j15 = gte.w(parcel, readInt29);
                                break;
                            default:
                                gte.y(parcel, readInt29);
                                break;
                        }
                    } else {
                        arrayList17 = gte.l(parcel, readInt29, ji2.CREATOR);
                    }
                }
                gte.m(parcel, z48);
                return new jod(locationRequest, arrayList17, z49, z50, str53, z51, z52, str54, j15);
            default:
                int z53 = gte.z(parcel);
                String str55 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt30 = parcel.readInt();
                    char c14 = (char) readInt30;
                    if (c14 == 2) {
                        str = gte.h(parcel, readInt30);
                    } else if (c14 != 3) {
                        gte.y(parcel, readInt30);
                    } else {
                        str55 = gte.h(parcel, readInt30);
                    }
                }
                gte.m(parcel, z53);
                return new DataItemAssetParcelable(str, str55);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cgd[i];
            case 1:
                return new er6[i];
            case 2:
                return new hh2[i];
            case 3:
                return new nc5[i];
            case 4:
                return new u4d[i];
            case 5:
                return new CommonWalletObject[i];
            case 6:
                return new jp2[i];
            case 7:
                return new x40[i];
            case 8:
                return new aa[i];
            case 9:
                return new gr6[i];
            case 10:
                return new cid[i];
            case 11:
                return new ir6[i];
            case 12:
                return new xr6[i];
            case 13:
                return new rid[i];
            case 14:
                return new yr6[i];
            case 15:
                return new zr6[i];
            case 16:
                return new fy6[i];
            case 17:
                return new MediaTrack[i];
            case 18:
                return new tgd[i];
            case 19:
                return new r44[i];
            case 20:
                return new me0[i];
            case 21:
                return new FaceParcel[i];
            case 22:
                return new tw5[i];
            case 23:
                return new ConnectionConfiguration[i];
            case 24:
                return new fhd[i];
            case 25:
                return new Scope[i];
            case 26:
                return new w40[i];
            case 27:
                return new wr[i];
            case 28:
                return new jod[i];
            default:
                return new DataItemAssetParcelable[i];
        }
    }
}
