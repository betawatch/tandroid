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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jid implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ jid(byte b) {
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
                int z = jve.z(parcel);
                while (parcel.dataPosition() < z) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        jve.y(parcel, readInt);
                    } else {
                        i = jve.u(parcel, readInt);
                    }
                }
                jve.m(parcel, z);
                return new did(i);
            case 1:
                int z2 = jve.z(parcel);
                long j2 = 0;
                long j3 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        j2 = jve.w(parcel, readInt2);
                    } else if (c == 3) {
                        j3 = jve.w(parcel, readInt2);
                    } else if (c == 4) {
                        z3 = jve.n(parcel, readInt2);
                    } else if (c != 5) {
                        jve.y(parcel, readInt2);
                    } else {
                        z4 = jve.n(parcel, readInt2);
                    }
                }
                jve.m(parcel, z2);
                return new et6(j2, j3, z3, z4);
            case 2:
                int z5 = jve.z(parcel);
                float f2 = 0.0f;
                int i2 = 0;
                boolean z6 = false;
                boolean z7 = false;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            latLng = (LatLng) jve.g(parcel, readInt3, LatLng.CREATOR);
                            break;
                        case 3:
                            d = jve.q(parcel, readInt3);
                            break;
                        case 4:
                            f = jve.r(parcel, readInt3);
                            break;
                        case 5:
                            i = jve.u(parcel, readInt3);
                            break;
                        case 6:
                            i2 = jve.u(parcel, readInt3);
                            break;
                        case 7:
                            f2 = jve.r(parcel, readInt3);
                            break;
                        case '\b':
                            z6 = jve.n(parcel, readInt3);
                            break;
                        case '\t':
                            z7 = jve.n(parcel, readInt3);
                            break;
                        case '\n':
                            arrayList2 = jve.l(parcel, readInt3, o08.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt3);
                            break;
                    }
                }
                jve.m(parcel, z5);
                vi2 vi2Var = new vi2();
                vi2Var.a = latLng;
                vi2Var.b = d;
                vi2Var.c = f;
                vi2Var.d = i;
                vi2Var.e = i2;
                vi2Var.f = f2;
                vi2Var.h = z6;
                vi2Var.n = z7;
                vi2Var.r = arrayList2;
                return vi2Var;
            case 3:
                int z8 = jve.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 2) {
                        str9 = jve.h(parcel, readInt4);
                    } else if (c2 == 3) {
                        bArr = jve.b(parcel, readInt4);
                    } else if (c2 != 4) {
                        jve.y(parcel, readInt4);
                    } else {
                        i = jve.u(parcel, readInt4);
                    }
                }
                jve.m(parcel, z8);
                return new le5(i, str9, bArr);
            case 4:
                int z9 = jve.z(parcel);
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 2) {
                        pointFArr = (PointF[]) jve.k(parcel, readInt5, PointF.CREATOR);
                    } else if (c3 != 3) {
                        jve.y(parcel, readInt5);
                    } else {
                        i = jve.u(parcel, readInt5);
                    }
                }
                jve.m(parcel, z9);
                return new w6d(pointFArr, i);
            case 5:
                int z10 = jve.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                boolean z11 = false;
                qpb qpbVar = null;
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
                            str8 = jve.h(parcel, readInt6);
                            break;
                        case 3:
                            str13 = jve.h(parcel, readInt6);
                            break;
                        case 4:
                            str14 = jve.h(parcel, readInt6);
                            break;
                        case 5:
                            str15 = jve.h(parcel, readInt6);
                            break;
                        case 6:
                            str16 = jve.h(parcel, readInt6);
                            break;
                        case 7:
                            str17 = jve.h(parcel, readInt6);
                            break;
                        case '\b':
                            str11 = jve.h(parcel, readInt6);
                            break;
                        case '\t':
                            str10 = jve.h(parcel, readInt6);
                            break;
                        case '\n':
                            i = jve.u(parcel, readInt6);
                            break;
                        case 11:
                            arrayList3 = jve.l(parcel, readInt6, wqc.CREATOR);
                            break;
                        case '\f':
                            qpbVar = (qpb) jve.g(parcel, readInt6, qpb.CREATOR);
                            break;
                        case '\r':
                            arrayList4 = jve.l(parcel, readInt6, LatLng.CREATOR);
                            break;
                        case 14:
                            str12 = jve.h(parcel, readInt6);
                            continue;
                        case 15:
                            str18 = jve.h(parcel, readInt6);
                            break;
                        case 16:
                            arrayList6 = jve.l(parcel, readInt6, uy5.CREATOR);
                            break;
                        case 17:
                            z11 = jve.n(parcel, readInt6);
                            break;
                        case 18:
                            arrayList7 = jve.l(parcel, readInt6, s8c.CREATOR);
                            break;
                        case 19:
                            arrayList8 = jve.l(parcel, readInt6, qjb.CREATOR);
                            break;
                        case 20:
                            arrayList9 = jve.l(parcel, readInt6, s8c.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt6);
                            break;
                    }
                    str12 = str19;
                }
                jve.m(parcel, z10);
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
                commonWalletObject.w = qpbVar;
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
                int z12 = jve.z(parcel);
                boolean z13 = true;
                int i3 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        i = jve.u(parcel, readInt7);
                    } else if (c4 == 2) {
                        i3 = jve.u(parcel, readInt7);
                    } else if (c4 == 3) {
                        i4 = jve.u(parcel, readInt7);
                    } else if (c4 != 4) {
                        jve.y(parcel, readInt7);
                    } else {
                        z13 = jve.n(parcel, readInt7);
                    }
                }
                jve.m(parcel, z12);
                return new uq2(i, i3, i4, z13);
            case 7:
                int z14 = jve.z(parcel);
                xac xacVar = null;
                z0e z0eVar = null;
                y50 y50Var = null;
                mee meeVar = null;
                String str20 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 1) {
                        xacVar = (xac) jve.g(parcel, readInt8, xac.CREATOR);
                    } else if (c5 == 2) {
                        z0eVar = (z0e) jve.g(parcel, readInt8, z0e.CREATOR);
                    } else if (c5 == 3) {
                        y50Var = (y50) jve.g(parcel, readInt8, y50.CREATOR);
                    } else if (c5 == 4) {
                        meeVar = (mee) jve.g(parcel, readInt8, mee.CREATOR);
                    } else if (c5 != 5) {
                        jve.y(parcel, readInt8);
                    } else {
                        str20 = jve.h(parcel, readInt8);
                    }
                }
                jve.m(parcel, z14);
                return new x50(xacVar, z0eVar, y50Var, meeVar, str20);
            case 8:
                int z15 = jve.z(parcel);
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 2) {
                        j4 = jve.w(parcel, readInt9);
                    } else if (c6 == 3) {
                        j5 = jve.w(parcel, readInt9);
                    } else if (c6 == 4) {
                        str21 = jve.h(parcel, readInt9);
                    } else if (c6 == 5) {
                        str22 = jve.h(parcel, readInt9);
                    } else if (c6 != 6) {
                        jve.y(parcel, readInt9);
                    } else {
                        j6 = jve.w(parcel, readInt9);
                    }
                }
                jve.m(parcel, z15);
                return new aa(j4, j5, str21, str22, j6);
            case 9:
                int z16 = jve.z(parcel);
                double d2 = 0.0d;
                long j7 = 0;
                long j8 = 0;
                String str23 = null;
                MediaInfo mediaInfo = null;
                zt6 zt6Var = null;
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
                            mediaInfo = (MediaInfo) jve.g(parcel, readInt10, MediaInfo.CREATOR);
                            break;
                        case 3:
                            zt6Var = (zt6) jve.g(parcel, readInt10, zt6.CREATOR);
                            break;
                        case 4:
                            bool = jve.o(parcel, readInt10);
                            break;
                        case 5:
                            j7 = jve.w(parcel, readInt10);
                            break;
                        case 6:
                            d2 = jve.q(parcel, readInt10);
                            break;
                        case 7:
                            jArr = jve.f(parcel, readInt10);
                            break;
                        case '\b':
                            str23 = jve.h(parcel, readInt10);
                            break;
                        case '\t':
                            str24 = jve.h(parcel, readInt10);
                            break;
                        case '\n':
                            str25 = jve.h(parcel, readInt10);
                            break;
                        case 11:
                            str26 = jve.h(parcel, readInt10);
                            break;
                        case '\f':
                            str27 = jve.h(parcel, readInt10);
                            break;
                        case '\r':
                            j8 = jve.w(parcel, readInt10);
                            break;
                        default:
                            jve.y(parcel, readInt10);
                            break;
                    }
                }
                jve.m(parcel, z16);
                Pattern pattern = qe1.a;
                if (str23 != null) {
                    try {
                        jSONObject = new JSONObject(str23);
                    } catch (JSONException unused) {
                    }
                    return new gt6(mediaInfo, zt6Var, bool, j7, d2, jArr, jSONObject, str24, str25, str26, str27, j8);
                }
                jSONObject = null;
                return new gt6(mediaInfo, zt6Var, bool, j7, d2, jArr, jSONObject, str24, str25, str26, str27, j8);
            case 10:
                int z17 = jve.z(parcel);
                while (parcel.dataPosition() < z17) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        jve.y(parcel, readInt11);
                    } else {
                        i = jve.u(parcel, readInt11);
                    }
                }
                jve.m(parcel, z17);
                return new dkd(i);
            case 11:
                int z18 = jve.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z18) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 2) {
                        arrayList = jve.l(parcel, readInt12, wuc.CREATOR);
                    } else if (c7 == 3) {
                        bundle = jve.a(parcel, readInt12);
                    } else if (c7 != 4) {
                        jve.y(parcel, readInt12);
                    } else {
                        i = jve.u(parcel, readInt12);
                    }
                }
                jve.m(parcel, z18);
                return new it6(arrayList, bundle, i);
            case 12:
                int z19 = jve.z(parcel);
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 2) {
                        i = jve.u(parcel, readInt13);
                    } else if (c8 == 3) {
                        str7 = jve.h(parcel, readInt13);
                    } else if (c8 == 4) {
                        arrayList10 = jve.l(parcel, readInt13, it6.CREATOR);
                    } else if (c8 == 5) {
                        arrayList11 = jve.l(parcel, readInt13, wuc.CREATOR);
                    } else if (c8 != 6) {
                        jve.y(parcel, readInt13);
                    } else {
                        d = jve.q(parcel, readInt13);
                    }
                }
                jve.m(parcel, z19);
                yt6 yt6Var = new yt6();
                yt6Var.a = i;
                yt6Var.b = str7;
                yt6Var.c = arrayList10;
                yt6Var.d = arrayList11;
                yt6Var.e = d;
                return yt6Var;
            case 13:
                int z20 = jve.z(parcel);
                int i5 = 0;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        i5 = jve.u(parcel, readInt14);
                    } else if (c9 == 2) {
                        z21 = jve.n(parcel, readInt14);
                    } else if (c9 == 3) {
                        z22 = jve.n(parcel, readInt14);
                    } else if (c9 == 4) {
                        z23 = jve.n(parcel, readInt14);
                    } else if (c9 != 5) {
                        jve.y(parcel, readInt14);
                    } else {
                        z24 = jve.n(parcel, readInt14);
                    }
                }
                jve.m(parcel, z20);
                return new tkd(i5, z21, z22, z23, z24);
            case 14:
                int z25 = jve.z(parcel);
                int i6 = 0;
                int i7 = 0;
                boolean z26 = false;
                String str28 = null;
                String str29 = null;
                yt6 yt6Var2 = null;
                ArrayList arrayList12 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            str6 = jve.h(parcel, readInt15);
                            break;
                        case 3:
                            str28 = jve.h(parcel, readInt15);
                            break;
                        case 4:
                            i = jve.u(parcel, readInt15);
                            break;
                        case 5:
                            str29 = jve.h(parcel, readInt15);
                            break;
                        case 6:
                            yt6Var2 = (yt6) jve.g(parcel, readInt15, yt6.CREATOR);
                            break;
                        case 7:
                            i6 = jve.u(parcel, readInt15);
                            break;
                        case '\b':
                            arrayList12 = jve.l(parcel, readInt15, au6.CREATOR);
                            break;
                        case '\t':
                            i7 = jve.u(parcel, readInt15);
                            break;
                        case '\n':
                            j = jve.w(parcel, readInt15);
                            break;
                        case 11:
                            z26 = jve.n(parcel, readInt15);
                            break;
                        default:
                            jve.y(parcel, readInt15);
                            break;
                    }
                }
                jve.m(parcel, z25);
                zt6 zt6Var2 = new zt6();
                zt6Var2.a = str6;
                zt6Var2.b = str28;
                zt6Var2.c = i;
                zt6Var2.d = str29;
                zt6Var2.e = yt6Var2;
                zt6Var2.f = i6;
                zt6Var2.h = arrayList12;
                zt6Var2.n = i7;
                zt6Var2.r = j;
                zt6Var2.s = z26;
                return zt6Var2;
            case 15:
                int z27 = jve.z(parcel);
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
                            mediaInfo2 = (MediaInfo) jve.g(parcel, readInt16, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i8 = jve.u(parcel, readInt16);
                            break;
                        case 4:
                            z28 = jve.n(parcel, readInt16);
                            break;
                        case 5:
                            d3 = jve.q(parcel, readInt16);
                            break;
                        case 6:
                            d4 = jve.q(parcel, readInt16);
                            break;
                        case 7:
                            d5 = jve.q(parcel, readInt16);
                            break;
                        case '\b':
                            jArr2 = jve.f(parcel, readInt16);
                            break;
                        case '\t':
                            str30 = jve.h(parcel, readInt16);
                            break;
                        default:
                            jve.y(parcel, readInt16);
                            break;
                    }
                }
                jve.m(parcel, z27);
                return new au6(mediaInfo2, i8, z28, d3, d4, d5, jArr2, str30);
            case 16:
                int z29 = jve.z(parcel);
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
                edc edcVar = null;
                et6 et6Var = null;
                zt6 zt6Var3 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            mediaInfo3 = (MediaInfo) jve.g(parcel, readInt17, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j9 = jve.w(parcel, readInt17);
                            break;
                        case 4:
                            i9 = jve.u(parcel, readInt17);
                            break;
                        case 5:
                            d6 = jve.q(parcel, readInt17);
                            break;
                        case 6:
                            i10 = jve.u(parcel, readInt17);
                            break;
                        case 7:
                            i11 = jve.u(parcel, readInt17);
                            break;
                        case '\b':
                            j10 = jve.w(parcel, readInt17);
                            break;
                        case '\t':
                            j11 = jve.w(parcel, readInt17);
                            break;
                        case '\n':
                            d7 = jve.q(parcel, readInt17);
                            break;
                        case 11:
                            z30 = jve.n(parcel, readInt17);
                            break;
                        case '\f':
                            jArr3 = jve.f(parcel, readInt17);
                            break;
                        case '\r':
                            i12 = jve.u(parcel, readInt17);
                            break;
                        case 14:
                            i13 = jve.u(parcel, readInt17);
                            break;
                        case 15:
                            str31 = jve.h(parcel, readInt17);
                            break;
                        case 16:
                            i14 = jve.u(parcel, readInt17);
                            break;
                        case 17:
                            arrayList13 = jve.l(parcel, readInt17, au6.CREATOR);
                            break;
                        case 18:
                            z31 = jve.n(parcel, readInt17);
                            break;
                        case 19:
                            aaVar = (aa) jve.g(parcel, readInt17, aa.CREATOR);
                            break;
                        case 20:
                            edcVar = (edc) jve.g(parcel, readInt17, edc.CREATOR);
                            break;
                        case 21:
                            et6Var = (et6) jve.g(parcel, readInt17, et6.CREATOR);
                            break;
                        case 22:
                            zt6Var3 = (zt6) jve.g(parcel, readInt17, zt6.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt17);
                            break;
                    }
                }
                jve.m(parcel, z29);
                return new f07(mediaInfo3, j9, i9, d6, i10, i11, j10, j11, d7, z30, jArr3, i12, i13, str31, i14, arrayList13, z31, aaVar, edcVar, et6Var, zt6Var3);
            case 17:
                int z32 = jve.z(parcel);
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
                            j12 = jve.w(parcel, readInt18);
                            break;
                        case 3:
                            i15 = jve.u(parcel, readInt18);
                            break;
                        case 4:
                            str33 = jve.h(parcel, readInt18);
                            break;
                        case 5:
                            str34 = jve.h(parcel, readInt18);
                            break;
                        case 6:
                            str35 = jve.h(parcel, readInt18);
                            break;
                        case 7:
                            str36 = jve.h(parcel, readInt18);
                            break;
                        case '\b':
                            i16 = jve.u(parcel, readInt18);
                            break;
                        case '\t':
                            arrayList14 = jve.j(parcel, readInt18);
                            break;
                        case '\n':
                            str32 = jve.h(parcel, readInt18);
                            break;
                        default:
                            jve.y(parcel, readInt18);
                            break;
                    }
                }
                jve.m(parcel, z32);
                Pattern pattern2 = qe1.a;
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
                int z33 = jve.z(parcel);
                long j13 = 0;
                long j14 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 1) {
                        z34 = jve.n(parcel, readInt19);
                    } else if (c10 == 2) {
                        j14 = jve.w(parcel, readInt19);
                    } else if (c10 != 3) {
                        jve.y(parcel, readInt19);
                    } else {
                        j13 = jve.w(parcel, readInt19);
                    }
                }
                jve.m(parcel, z33);
                return new uid(j13, j14, z34);
            case 19:
                int z35 = jve.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        jve.y(parcel, readInt20);
                    } else {
                        str5 = jve.h(parcel, readInt20);
                    }
                }
                jve.m(parcel, z35);
                c64 c64Var = new c64();
                c64Var.a = str5;
                return c64Var;
            case 20:
                int z36 = jve.z(parcel);
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
                            i = jve.u(parcel, readInt21);
                            break;
                        case 3:
                            i17 = jve.u(parcel, readInt21);
                            break;
                        case 4:
                            i18 = jve.u(parcel, readInt21);
                            break;
                        case 5:
                            i19 = jve.u(parcel, readInt21);
                            break;
                        case 6:
                            i20 = jve.u(parcel, readInt21);
                            break;
                        case 7:
                            i21 = jve.u(parcel, readInt21);
                            break;
                        case '\b':
                            z37 = jve.n(parcel, readInt21);
                            break;
                        case '\t':
                            str4 = jve.h(parcel, readInt21);
                            break;
                        default:
                            jve.y(parcel, readInt21);
                            break;
                    }
                }
                jve.m(parcel, z36);
                mf0 mf0Var = new mf0();
                mf0Var.a = i;
                mf0Var.b = i17;
                mf0Var.c = i18;
                mf0Var.d = i19;
                mf0Var.e = i20;
                mf0Var.f = i21;
                mf0Var.h = z37;
                mf0Var.n = str4;
                return mf0Var;
            case 21:
                int z38 = jve.z(parcel);
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
                w6d[] w6dVarArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            i22 = jve.u(parcel, readInt22);
                            break;
                        case 2:
                            i23 = jve.u(parcel, readInt22);
                            break;
                        case 3:
                            f6 = jve.r(parcel, readInt22);
                            break;
                        case 4:
                            f7 = jve.r(parcel, readInt22);
                            break;
                        case 5:
                            f8 = jve.r(parcel, readInt22);
                            break;
                        case 6:
                            f9 = jve.r(parcel, readInt22);
                            break;
                        case 7:
                            f3 = jve.r(parcel, readInt22);
                            break;
                        case '\b':
                            f4 = jve.r(parcel, readInt22);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) jve.k(parcel, readInt22, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f10 = jve.r(parcel, readInt22);
                            break;
                        case 11:
                            f11 = jve.r(parcel, readInt22);
                            break;
                        case '\f':
                            f12 = jve.r(parcel, readInt22);
                            break;
                        case '\r':
                            w6dVarArr = (w6d[]) jve.k(parcel, readInt22, w6d.CREATOR);
                            break;
                        case 14:
                            f5 = jve.r(parcel, readInt22);
                            break;
                        case 15:
                            f13 = jve.r(parcel, readInt22);
                            break;
                        default:
                            jve.y(parcel, readInt22);
                            break;
                    }
                }
                jve.m(parcel, z38);
                return new FaceParcel(i22, i23, f6, f7, f8, f9, f3, f4, f5, landmarkParcelArr, f10, f11, f12, w6dVarArr, f13);
            case 22:
                int z39 = jve.z(parcel);
                String str37 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    char c11 = (char) readInt23;
                    if (c11 == 2) {
                        str3 = jve.h(parcel, readInt23);
                    } else if (c11 != 3) {
                        jve.y(parcel, readInt23);
                    } else {
                        str37 = jve.h(parcel, readInt23);
                    }
                }
                jve.m(parcel, z39);
                ty5 ty5Var = new ty5();
                ty5Var.a = str3;
                ty5Var.b = str37;
                return ty5Var;
            case 23:
                int z40 = jve.z(parcel);
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
                            str38 = jve.h(parcel, readInt24);
                            break;
                        case 3:
                            str39 = jve.h(parcel, readInt24);
                            break;
                        case 4:
                            i24 = jve.u(parcel, readInt24);
                            break;
                        case 5:
                            i25 = jve.u(parcel, readInt24);
                            break;
                        case 6:
                            z41 = jve.n(parcel, readInt24);
                            break;
                        case 7:
                            z42 = jve.n(parcel, readInt24);
                            break;
                        case '\b':
                            str40 = jve.h(parcel, readInt24);
                            break;
                        case '\t':
                            z43 = jve.n(parcel, readInt24);
                            break;
                        case '\n':
                            str41 = jve.h(parcel, readInt24);
                            break;
                        case 11:
                            str42 = jve.h(parcel, readInt24);
                            break;
                        case '\f':
                            i26 = jve.u(parcel, readInt24);
                            break;
                        case '\r':
                            arrayList15 = jve.j(parcel, readInt24);
                            break;
                        default:
                            jve.y(parcel, readInt24);
                            break;
                    }
                }
                jve.m(parcel, z40);
                return new ConnectionConfiguration(str38, str39, i24, i25, z41, z42, str40, z43, str41, str42, i26, arrayList15);
            case 24:
                int z44 = jve.z(parcel);
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                mdd mddVar = null;
                String str47 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str43 = jve.h(parcel, readInt25);
                            break;
                        case 2:
                            str44 = jve.h(parcel, readInt25);
                            break;
                        case 3:
                            str45 = jve.h(parcel, readInt25);
                            break;
                        case 4:
                            str46 = jve.h(parcel, readInt25);
                            break;
                        case 5:
                            mddVar = (mdd) jve.g(parcel, readInt25, mdd.CREATOR);
                            break;
                        case 6:
                            str47 = jve.h(parcel, readInt25);
                            break;
                        case 7:
                            bundle2 = jve.a(parcel, readInt25);
                            break;
                        default:
                            jve.y(parcel, readInt25);
                            break;
                    }
                }
                jve.m(parcel, z44);
                return new gjd(str43, str44, str45, str46, mddVar, str47, bundle2);
            case 25:
                int z45 = jve.z(parcel);
                while (parcel.dataPosition() < z45) {
                    int readInt26 = parcel.readInt();
                    char c12 = (char) readInt26;
                    if (c12 == 1) {
                        i = jve.u(parcel, readInt26);
                    } else if (c12 != 2) {
                        jve.y(parcel, readInt26);
                    } else {
                        str2 = jve.h(parcel, readInt26);
                    }
                }
                jve.m(parcel, z45);
                return new Scope(i, str2);
            case 26:
                int z46 = jve.z(parcel);
                va4 va4Var = null;
                zef zefVar = null;
                u9c u9cVar = null;
                xjf xjfVar = null;
                p7d p7dVar = null;
                b8d b8dVar = null;
                ihf ihfVar = null;
                u8d u8dVar = null;
                c15 c15Var = null;
                y9d y9dVar = null;
                jcd jcdVar = null;
                f9d f9dVar = null;
                while (parcel.dataPosition() < z46) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            va4Var = (va4) jve.g(parcel, readInt27, va4.CREATOR);
                            break;
                        case 3:
                            zefVar = (zef) jve.g(parcel, readInt27, zef.CREATOR);
                            break;
                        case 4:
                            u9cVar = (u9c) jve.g(parcel, readInt27, u9c.CREATOR);
                            break;
                        case 5:
                            xjfVar = (xjf) jve.g(parcel, readInt27, xjf.CREATOR);
                            break;
                        case 6:
                            p7dVar = (p7d) jve.g(parcel, readInt27, p7d.CREATOR);
                            break;
                        case 7:
                            b8dVar = (b8d) jve.g(parcel, readInt27, b8d.CREATOR);
                            break;
                        case '\b':
                            ihfVar = (ihf) jve.g(parcel, readInt27, ihf.CREATOR);
                            break;
                        case '\t':
                            u8dVar = (u8d) jve.g(parcel, readInt27, u8d.CREATOR);
                            break;
                        case '\n':
                            c15Var = (c15) jve.g(parcel, readInt27, c15.CREATOR);
                            break;
                        case 11:
                            y9dVar = (y9d) jve.g(parcel, readInt27, y9d.CREATOR);
                            break;
                        case '\f':
                            jcdVar = (jcd) jve.g(parcel, readInt27, jcd.CREATOR);
                            break;
                        case '\r':
                            f9dVar = (f9d) jve.g(parcel, readInt27, f9d.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt27);
                            break;
                    }
                }
                jve.m(parcel, z46);
                return new w50(va4Var, zefVar, u9cVar, xjfVar, p7dVar, b8dVar, ihfVar, u8dVar, c15Var, y9dVar, jcdVar, f9dVar);
            case 27:
                int z47 = jve.z(parcel);
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
                            str48 = jve.h(parcel, readInt28);
                            break;
                        case 3:
                            str49 = jve.h(parcel, readInt28);
                            break;
                        case 4:
                            jve.l(parcel, readInt28, wuc.CREATOR);
                            break;
                        case 5:
                            arrayList16 = jve.j(parcel, readInt28);
                            break;
                        case 6:
                            str50 = jve.h(parcel, readInt28);
                            break;
                        case 7:
                            uri = (Uri) jve.g(parcel, readInt28, Uri.CREATOR);
                            break;
                        case '\b':
                            str51 = jve.h(parcel, readInt28);
                            break;
                        case '\t':
                            str52 = jve.h(parcel, readInt28);
                            break;
                        case '\n':
                            bool2 = jve.o(parcel, readInt28);
                            break;
                        case 11:
                            bool3 = jve.o(parcel, readInt28);
                            break;
                        default:
                            jve.y(parcel, readInt28);
                            break;
                    }
                }
                jve.m(parcel, z47);
                return new ws(str48, str49, arrayList16, str50, uri, str51, str52, bool2, bool3);
            case 28:
                int z48 = jve.z(parcel);
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
                        locationRequest = (LocationRequest) jve.g(parcel, readInt29, LocationRequest.CREATOR);
                    } else if (c13 != 5) {
                        switch (c13) {
                            case '\b':
                                z49 = jve.n(parcel, readInt29);
                                break;
                            case '\t':
                                z50 = jve.n(parcel, readInt29);
                                break;
                            case '\n':
                                str53 = jve.h(parcel, readInt29);
                                break;
                            case 11:
                                z51 = jve.n(parcel, readInt29);
                                break;
                            case '\f':
                                z52 = jve.n(parcel, readInt29);
                                break;
                            case '\r':
                                str54 = jve.h(parcel, readInt29);
                                break;
                            case 14:
                                j15 = jve.w(parcel, readInt29);
                                break;
                            default:
                                jve.y(parcel, readInt29);
                                break;
                        }
                    } else {
                        arrayList17 = jve.l(parcel, readInt29, xj2.CREATOR);
                    }
                }
                jve.m(parcel, z48);
                return new mqd(locationRequest, arrayList17, z49, z50, str53, z51, z52, str54, j15);
            default:
                int z53 = jve.z(parcel);
                String str55 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt30 = parcel.readInt();
                    char c14 = (char) readInt30;
                    if (c14 == 2) {
                        str = jve.h(parcel, readInt30);
                    } else if (c14 != 3) {
                        jve.y(parcel, readInt30);
                    } else {
                        str55 = jve.h(parcel, readInt30);
                    }
                }
                jve.m(parcel, z53);
                return new DataItemAssetParcelable(str, str55);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new did[i];
            case 1:
                return new et6[i];
            case 2:
                return new vi2[i];
            case 3:
                return new le5[i];
            case 4:
                return new w6d[i];
            case 5:
                return new CommonWalletObject[i];
            case 6:
                return new uq2[i];
            case 7:
                return new x50[i];
            case 8:
                return new aa[i];
            case 9:
                return new gt6[i];
            case 10:
                return new dkd[i];
            case 11:
                return new it6[i];
            case 12:
                return new yt6[i];
            case 13:
                return new tkd[i];
            case 14:
                return new zt6[i];
            case 15:
                return new au6[i];
            case 16:
                return new f07[i];
            case 17:
                return new MediaTrack[i];
            case 18:
                return new uid[i];
            case 19:
                return new c64[i];
            case 20:
                return new mf0[i];
            case 21:
                return new FaceParcel[i];
            case 22:
                return new ty5[i];
            case 23:
                return new ConnectionConfiguration[i];
            case 24:
                return new gjd[i];
            case 25:
                return new Scope[i];
            case 26:
                return new w50[i];
            case 27:
                return new ws[i];
            case 28:
                return new mqd[i];
            default:
                return new DataItemAssetParcelable[i];
        }
    }
}
