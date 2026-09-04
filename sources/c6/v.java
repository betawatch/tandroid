package c6;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        float f7 = 0.0f;
        double d = 0.0d;
        long j3 = 0;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        String str = null;
        String str2 = null;
        r14 = null;
        JSONObject jSONObject4 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        String str5 = null;
        w wVar = null;
        switch (this.a) {
            case 0:
                int z11 = w7.d0.z(parcel);
                long j10 = 0;
                long j11 = 0;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                t tVar = null;
                while (parcel.dataPosition() < z11) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str6 = w7.d0.h(parcel, readInt);
                            break;
                        case 3:
                            str7 = w7.d0.h(parcel, readInt);
                            break;
                        case 4:
                            j10 = w7.d0.w(parcel, readInt);
                            break;
                        case 5:
                            str8 = w7.d0.h(parcel, readInt);
                            break;
                        case 6:
                            str9 = w7.d0.h(parcel, readInt);
                            break;
                        case 7:
                            str10 = w7.d0.h(parcel, readInt);
                            break;
                        case '\b':
                            str11 = w7.d0.h(parcel, readInt);
                            break;
                        case '\t':
                            str12 = w7.d0.h(parcel, readInt);
                            break;
                        case '\n':
                            str13 = w7.d0.h(parcel, readInt);
                            break;
                        case 11:
                            j11 = w7.d0.w(parcel, readInt);
                            break;
                        case '\f':
                            str14 = w7.d0.h(parcel, readInt);
                            break;
                        case '\r':
                            tVar = (t) w7.d0.g(parcel, readInt, t.CREATOR);
                            break;
                        default:
                            w7.d0.y(parcel, readInt);
                            break;
                    }
                }
                w7.d0.m(parcel, z11);
                return new a(str6, str7, j10, str8, str9, str10, str11, str12, str13, j11, str14, tVar);
            case 1:
                int z12 = w7.d0.z(parcel);
                String str15 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        str = w7.d0.h(parcel, readInt2);
                    } else if (c10 != 2) {
                        w7.d0.y(parcel, readInt2);
                    } else {
                        str15 = w7.d0.h(parcel, readInt2);
                    }
                }
                w7.d0.m(parcel, z12);
                return new h(str, str15);
            case 2:
                int z13 = w7.d0.z(parcel);
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        f7 = w7.d0.r(parcel, readInt3);
                    } else if (c11 == 3) {
                        f10 = w7.d0.r(parcel, readInt3);
                    } else if (c11 != 4) {
                        w7.d0.y(parcel, readInt3);
                    } else {
                        f11 = w7.d0.r(parcel, readInt3);
                    }
                }
                w7.d0.m(parcel, z13);
                return new w(f7, f10, f11);
            case 3:
                int z14 = w7.d0.z(parcel);
                w wVar2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        wVar = (w) w7.d0.g(parcel, readInt4, w.CREATOR);
                    } else if (c12 != 3) {
                        w7.d0.y(parcel, readInt4);
                    } else {
                        wVar2 = (w) w7.d0.g(parcel, readInt4, w.CREATOR);
                    }
                }
                w7.d0.m(parcel, z14);
                return new x(wVar, wVar2);
            case 4:
                int z15 = w7.d0.z(parcel);
                long j12 = 0;
                long j13 = 0;
                String str16 = null;
                String[] strArr = null;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            j12 = w7.d0.w(parcel, readInt5);
                            break;
                        case 3:
                            str16 = w7.d0.h(parcel, readInt5);
                            break;
                        case 4:
                            j13 = w7.d0.w(parcel, readInt5);
                            break;
                        case 5:
                            z16 = w7.d0.n(parcel, readInt5);
                            break;
                        case 6:
                            strArr = w7.d0.i(parcel, readInt5);
                            break;
                        case 7:
                            z17 = w7.d0.n(parcel, readInt5);
                            break;
                        case '\b':
                            z18 = w7.d0.n(parcel, readInt5);
                            break;
                        default:
                            w7.d0.y(parcel, readInt5);
                            break;
                    }
                }
                w7.d0.m(parcel, z15);
                return new b(j12, str16, j13, z16, strArr, z17, z18);
            case 5:
                int z19 = w7.d0.z(parcel);
                h hVar = null;
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 2) {
                        z10 = w7.d0.n(parcel, readInt6);
                    } else if (c13 == 3) {
                        str5 = w7.d0.h(parcel, readInt6);
                    } else if (c13 == 4) {
                        z20 = w7.d0.n(parcel, readInt6);
                    } else if (c13 != 5) {
                        w7.d0.y(parcel, readInt6);
                    } else {
                        hVar = (h) w7.d0.g(parcel, readInt6, h.CREATOR);
                    }
                }
                w7.d0.m(parcel, z19);
                return new i(z10, str5, z20, hVar);
            case 6:
                int z21 = w7.d0.z(parcel);
                long j14 = 0;
                String str17 = null;
                String str18 = null;
                Integer num = null;
                String str19 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 2) {
                        str18 = w7.d0.h(parcel, readInt7);
                    } else if (c14 == 3) {
                        j14 = w7.d0.w(parcel, readInt7);
                    } else if (c14 == 4) {
                        num = w7.d0.v(parcel, readInt7);
                    } else if (c14 == 5) {
                        str19 = w7.d0.h(parcel, readInt7);
                    } else if (c14 != 6) {
                        w7.d0.y(parcel, readInt7);
                    } else {
                        str17 = w7.d0.h(parcel, readInt7);
                    }
                }
                w7.d0.m(parcel, z21);
                Pattern pattern = g6.a.a;
                if (str17 != null) {
                    try {
                        jSONObject = new JSONObject(str17);
                    } catch (JSONException unused) {
                    }
                    return new MediaError(str18, j14, num, str19, jSONObject);
                }
                jSONObject = null;
                return new MediaError(str18, j14, num, str19, jSONObject);
            case 7:
                int z22 = w7.d0.z(parcel);
                long j15 = 0;
                long j16 = 0;
                String str20 = null;
                String str21 = null;
                l lVar = null;
                ArrayList arrayList2 = null;
                s sVar = null;
                String str22 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                String str23 = null;
                t tVar2 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                int i14 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str20 = w7.d0.h(parcel, readInt8);
                            break;
                        case 3:
                            i14 = w7.d0.u(parcel, readInt8);
                            break;
                        case 4:
                            str21 = w7.d0.h(parcel, readInt8);
                            break;
                        case 5:
                            lVar = (l) w7.d0.g(parcel, readInt8, l.CREATOR);
                            break;
                        case 6:
                            j15 = w7.d0.w(parcel, readInt8);
                            break;
                        case 7:
                            arrayList2 = w7.d0.l(parcel, readInt8, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            sVar = (s) w7.d0.g(parcel, readInt8, s.CREATOR);
                            break;
                        case '\t':
                            str22 = w7.d0.h(parcel, readInt8);
                            break;
                        case '\n':
                            arrayList3 = w7.d0.l(parcel, readInt8, b.CREATOR);
                            break;
                        case 11:
                            arrayList4 = w7.d0.l(parcel, readInt8, a.CREATOR);
                            break;
                        case '\f':
                            str23 = w7.d0.h(parcel, readInt8);
                            break;
                        case '\r':
                            tVar2 = (t) w7.d0.g(parcel, readInt8, t.CREATOR);
                            break;
                        case 14:
                            j16 = w7.d0.w(parcel, readInt8);
                            break;
                        case 15:
                            str24 = w7.d0.h(parcel, readInt8);
                            break;
                        case 16:
                            str25 = w7.d0.h(parcel, readInt8);
                            break;
                        case 17:
                            str26 = w7.d0.h(parcel, readInt8);
                            break;
                        case 18:
                            str27 = w7.d0.h(parcel, readInt8);
                            break;
                        default:
                            w7.d0.y(parcel, readInt8);
                            break;
                    }
                }
                w7.d0.m(parcel, z22);
                return new MediaInfo(str20, i14, str21, lVar, j15, arrayList2, sVar, str22, arrayList3, arrayList4, str23, tVar2, j16, str24, str25, str26, str27);
            case 8:
                int z23 = w7.d0.z(parcel);
                long j17 = 0;
                long j18 = 0;
                boolean z24 = false;
                boolean z25 = false;
                while (parcel.dataPosition() < z23) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        j17 = w7.d0.w(parcel, readInt9);
                    } else if (c15 == 3) {
                        j18 = w7.d0.w(parcel, readInt9);
                    } else if (c15 == 4) {
                        z24 = w7.d0.n(parcel, readInt9);
                    } else if (c15 != 5) {
                        w7.d0.y(parcel, readInt9);
                    } else {
                        z25 = w7.d0.n(parcel, readInt9);
                    }
                }
                w7.d0.m(parcel, z23);
                return new j(j17, j18, z24, z25);
            case 9:
                int z26 = w7.d0.z(parcel);
                long j19 = 0;
                long j20 = 0;
                long j21 = 0;
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        j19 = w7.d0.w(parcel, readInt10);
                    } else if (c16 == 3) {
                        j20 = w7.d0.w(parcel, readInt10);
                    } else if (c16 == 4) {
                        str28 = w7.d0.h(parcel, readInt10);
                    } else if (c16 == 5) {
                        str29 = w7.d0.h(parcel, readInt10);
                    } else if (c16 != 6) {
                        w7.d0.y(parcel, readInt10);
                    } else {
                        j21 = w7.d0.w(parcel, readInt10);
                    }
                }
                w7.d0.m(parcel, z26);
                return new c(j19, j20, str28, str29, j21);
            case 10:
                int z27 = w7.d0.z(parcel);
                double d10 = 0.0d;
                long j22 = 0;
                long j23 = 0;
                String str30 = null;
                MediaInfo mediaInfo = null;
                n nVar = null;
                Boolean bool = null;
                long[] jArr = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            mediaInfo = (MediaInfo) w7.d0.g(parcel, readInt11, MediaInfo.CREATOR);
                            break;
                        case 3:
                            nVar = (n) w7.d0.g(parcel, readInt11, n.CREATOR);
                            break;
                        case 4:
                            bool = w7.d0.o(parcel, readInt11);
                            break;
                        case 5:
                            j22 = w7.d0.w(parcel, readInt11);
                            break;
                        case 6:
                            d10 = w7.d0.q(parcel, readInt11);
                            break;
                        case 7:
                            jArr = w7.d0.f(parcel, readInt11);
                            break;
                        case '\b':
                            str30 = w7.d0.h(parcel, readInt11);
                            break;
                        case '\t':
                            str31 = w7.d0.h(parcel, readInt11);
                            break;
                        case '\n':
                            str32 = w7.d0.h(parcel, readInt11);
                            break;
                        case 11:
                            str33 = w7.d0.h(parcel, readInt11);
                            break;
                        case '\f':
                            str34 = w7.d0.h(parcel, readInt11);
                            break;
                        case '\r':
                            j23 = w7.d0.w(parcel, readInt11);
                            break;
                        default:
                            w7.d0.y(parcel, readInt11);
                            break;
                    }
                }
                w7.d0.m(parcel, z27);
                Pattern pattern2 = g6.a.a;
                if (str30 != null) {
                    try {
                        jSONObject2 = new JSONObject(str30);
                    } catch (JSONException unused2) {
                    }
                    return new k(mediaInfo, nVar, bool, j22, d10, jArr, jSONObject2, str31, str32, str33, str34, j23);
                }
                jSONObject2 = null;
                return new k(mediaInfo, nVar, bool, j22, d10, jArr, jSONObject2, str31, str32, str33, str34, j23);
            case 11:
                int z28 = w7.d0.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z28) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 2) {
                        arrayList = w7.d0.l(parcel, readInt12, m6.a.CREATOR);
                    } else if (c17 == 3) {
                        bundle = w7.d0.a(parcel, readInt12);
                    } else if (c17 != 4) {
                        w7.d0.y(parcel, readInt12);
                    } else {
                        i13 = w7.d0.u(parcel, readInt12);
                    }
                }
                w7.d0.m(parcel, z28);
                return new l(arrayList, bundle, i13);
            case 12:
                int z29 = w7.d0.z(parcel);
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 2) {
                        i12 = w7.d0.u(parcel, readInt13);
                    } else if (c18 == 3) {
                        str4 = w7.d0.h(parcel, readInt13);
                    } else if (c18 == 4) {
                        arrayList5 = w7.d0.l(parcel, readInt13, l.CREATOR);
                    } else if (c18 == 5) {
                        arrayList6 = w7.d0.l(parcel, readInt13, m6.a.CREATOR);
                    } else if (c18 != 6) {
                        w7.d0.y(parcel, readInt13);
                    } else {
                        d = w7.d0.q(parcel, readInt13);
                    }
                }
                w7.d0.m(parcel, z29);
                m mVar = new m();
                mVar.a = i12;
                mVar.b = str4;
                mVar.c = arrayList5;
                mVar.d = arrayList6;
                mVar.e = d;
                return mVar;
            case 13:
                int z30 = w7.d0.z(parcel);
                String str35 = null;
                String str36 = null;
                m mVar2 = null;
                ArrayList arrayList7 = null;
                int i15 = 0;
                int i16 = 0;
                boolean z31 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str3 = w7.d0.h(parcel, readInt14);
                            break;
                        case 3:
                            str35 = w7.d0.h(parcel, readInt14);
                            break;
                        case 4:
                            i11 = w7.d0.u(parcel, readInt14);
                            break;
                        case 5:
                            str36 = w7.d0.h(parcel, readInt14);
                            break;
                        case 6:
                            mVar2 = (m) w7.d0.g(parcel, readInt14, m.CREATOR);
                            break;
                        case 7:
                            i15 = w7.d0.u(parcel, readInt14);
                            break;
                        case '\b':
                            arrayList7 = w7.d0.l(parcel, readInt14, o.CREATOR);
                            break;
                        case '\t':
                            i16 = w7.d0.u(parcel, readInt14);
                            break;
                        case '\n':
                            j3 = w7.d0.w(parcel, readInt14);
                            break;
                        case 11:
                            z31 = w7.d0.n(parcel, readInt14);
                            break;
                        default:
                            w7.d0.y(parcel, readInt14);
                            break;
                    }
                }
                w7.d0.m(parcel, z30);
                n nVar2 = new n();
                nVar2.a = str3;
                nVar2.b = str35;
                nVar2.c = i11;
                nVar2.d = str36;
                nVar2.e = mVar2;
                nVar2.f = i15;
                nVar2.h = arrayList7;
                nVar2.n = i16;
                nVar2.r = j3;
                nVar2.s = z31;
                return nVar2;
            case 14:
                int z32 = w7.d0.z(parcel);
                double d11 = 0.0d;
                double d12 = 0.0d;
                double d13 = 0.0d;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str37 = null;
                int i17 = 0;
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            mediaInfo2 = (MediaInfo) w7.d0.g(parcel, readInt15, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i17 = w7.d0.u(parcel, readInt15);
                            break;
                        case 4:
                            z33 = w7.d0.n(parcel, readInt15);
                            break;
                        case 5:
                            d11 = w7.d0.q(parcel, readInt15);
                            break;
                        case 6:
                            d12 = w7.d0.q(parcel, readInt15);
                            break;
                        case 7:
                            d13 = w7.d0.q(parcel, readInt15);
                            break;
                        case '\b':
                            jArr2 = w7.d0.f(parcel, readInt15);
                            break;
                        case '\t':
                            str37 = w7.d0.h(parcel, readInt15);
                            break;
                        default:
                            w7.d0.y(parcel, readInt15);
                            break;
                    }
                }
                w7.d0.m(parcel, z32);
                return new o(mediaInfo2, i17, z33, d11, d12, d13, jArr2, str37);
            case 15:
                int z34 = w7.d0.z(parcel);
                double d14 = 0.0d;
                double d15 = 0.0d;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                MediaInfo mediaInfo3 = null;
                long[] jArr3 = null;
                String str38 = null;
                ArrayList arrayList8 = null;
                c cVar = null;
                u uVar = null;
                j jVar = null;
                n nVar3 = null;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z35 = false;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z36 = false;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            mediaInfo3 = (MediaInfo) w7.d0.g(parcel, readInt16, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j24 = w7.d0.w(parcel, readInt16);
                            break;
                        case 4:
                            i18 = w7.d0.u(parcel, readInt16);
                            break;
                        case 5:
                            d14 = w7.d0.q(parcel, readInt16);
                            break;
                        case 6:
                            i19 = w7.d0.u(parcel, readInt16);
                            break;
                        case 7:
                            i20 = w7.d0.u(parcel, readInt16);
                            break;
                        case '\b':
                            j25 = w7.d0.w(parcel, readInt16);
                            break;
                        case '\t':
                            j26 = w7.d0.w(parcel, readInt16);
                            break;
                        case '\n':
                            d15 = w7.d0.q(parcel, readInt16);
                            break;
                        case 11:
                            z35 = w7.d0.n(parcel, readInt16);
                            break;
                        case '\f':
                            jArr3 = w7.d0.f(parcel, readInt16);
                            break;
                        case '\r':
                            i21 = w7.d0.u(parcel, readInt16);
                            break;
                        case 14:
                            i22 = w7.d0.u(parcel, readInt16);
                            break;
                        case 15:
                            str38 = w7.d0.h(parcel, readInt16);
                            break;
                        case 16:
                            i23 = w7.d0.u(parcel, readInt16);
                            break;
                        case 17:
                            arrayList8 = w7.d0.l(parcel, readInt16, o.CREATOR);
                            break;
                        case 18:
                            z36 = w7.d0.n(parcel, readInt16);
                            break;
                        case 19:
                            cVar = (c) w7.d0.g(parcel, readInt16, c.CREATOR);
                            break;
                        case 20:
                            uVar = (u) w7.d0.g(parcel, readInt16, u.CREATOR);
                            break;
                        case 21:
                            jVar = (j) w7.d0.g(parcel, readInt16, j.CREATOR);
                            break;
                        case 22:
                            nVar3 = (n) w7.d0.g(parcel, readInt16, n.CREATOR);
                            break;
                        default:
                            w7.d0.y(parcel, readInt16);
                            break;
                    }
                }
                w7.d0.m(parcel, z34);
                return new q(mediaInfo3, j24, i18, d14, i19, i20, j25, j26, d15, z35, jArr3, i21, i22, str38, i23, arrayList8, z36, cVar, uVar, jVar, nVar3);
            case 16:
                int z37 = w7.d0.z(parcel);
                long j27 = 0;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                ArrayList arrayList9 = null;
                int i24 = 0;
                int i25 = 0;
                while (parcel.dataPosition() < z37) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            j27 = w7.d0.w(parcel, readInt17);
                            break;
                        case 3:
                            i24 = w7.d0.u(parcel, readInt17);
                            break;
                        case 4:
                            str40 = w7.d0.h(parcel, readInt17);
                            break;
                        case 5:
                            str41 = w7.d0.h(parcel, readInt17);
                            break;
                        case 6:
                            str42 = w7.d0.h(parcel, readInt17);
                            break;
                        case 7:
                            str43 = w7.d0.h(parcel, readInt17);
                            break;
                        case '\b':
                            i25 = w7.d0.u(parcel, readInt17);
                            break;
                        case '\t':
                            arrayList9 = w7.d0.j(parcel, readInt17);
                            break;
                        case '\n':
                            str39 = w7.d0.h(parcel, readInt17);
                            break;
                        default:
                            w7.d0.y(parcel, readInt17);
                            break;
                    }
                }
                w7.d0.m(parcel, z37);
                Pattern pattern3 = g6.a.a;
                if (str39 != null) {
                    try {
                        jSONObject3 = new JSONObject(str39);
                    } catch (JSONException unused3) {
                    }
                    return new MediaTrack(j27, i24, str40, str41, str42, str43, i25, arrayList9, jSONObject3);
                }
                jSONObject3 = null;
                return new MediaTrack(j27, i24, str40, str41, str42, str43, i25, arrayList9, jSONObject3);
            case 17:
                int z38 = w7.d0.z(parcel);
                String str44 = null;
                String str45 = null;
                ArrayList arrayList10 = null;
                String str46 = null;
                Uri uri = null;
                String str47 = null;
                String str48 = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            str44 = w7.d0.h(parcel, readInt18);
                            break;
                        case 3:
                            str45 = w7.d0.h(parcel, readInt18);
                            break;
                        case 4:
                            w7.d0.l(parcel, readInt18, m6.a.CREATOR);
                            break;
                        case 5:
                            arrayList10 = w7.d0.j(parcel, readInt18);
                            break;
                        case 6:
                            str46 = w7.d0.h(parcel, readInt18);
                            break;
                        case 7:
                            uri = (Uri) w7.d0.g(parcel, readInt18, Uri.CREATOR);
                            break;
                        case '\b':
                            str47 = w7.d0.h(parcel, readInt18);
                            break;
                        case '\t':
                            str48 = w7.d0.h(parcel, readInt18);
                            break;
                        case '\n':
                            bool2 = w7.d0.o(parcel, readInt18);
                            break;
                        case 11:
                            bool3 = w7.d0.o(parcel, readInt18);
                            break;
                        default:
                            w7.d0.y(parcel, readInt18);
                            break;
                    }
                }
                w7.d0.m(parcel, z38);
                return new d(str44, str45, arrayList10, str46, uri, str47, str48, bool2, bool3);
            case 18:
                int z39 = w7.d0.z(parcel);
                k kVar = null;
                String str49 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        kVar = (k) w7.d0.g(parcel, readInt19, k.CREATOR);
                    } else if (c19 != 3) {
                        w7.d0.y(parcel, readInt19);
                    } else {
                        str49 = w7.d0.h(parcel, readInt19);
                    }
                }
                w7.d0.m(parcel, z39);
                Pattern pattern4 = g6.a.a;
                if (str49 != null) {
                    try {
                        jSONObject4 = new JSONObject(str49);
                    } catch (JSONException unused4) {
                    }
                }
                return new r(kVar, jSONObject4);
            case 19:
                int z40 = w7.d0.z(parcel);
                String str50 = null;
                String str51 = null;
                float f12 = 0.0f;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            f12 = w7.d0.r(parcel, readInt20);
                            break;
                        case 3:
                            i26 = w7.d0.u(parcel, readInt20);
                            break;
                        case 4:
                            i27 = w7.d0.u(parcel, readInt20);
                            break;
                        case 5:
                            i28 = w7.d0.u(parcel, readInt20);
                            break;
                        case 6:
                            i29 = w7.d0.u(parcel, readInt20);
                            break;
                        case 7:
                            i30 = w7.d0.u(parcel, readInt20);
                            break;
                        case '\b':
                            i31 = w7.d0.u(parcel, readInt20);
                            break;
                        case '\t':
                            i32 = w7.d0.u(parcel, readInt20);
                            break;
                        case '\n':
                            str50 = w7.d0.h(parcel, readInt20);
                            break;
                        case 11:
                            i33 = w7.d0.u(parcel, readInt20);
                            break;
                        case '\f':
                            i34 = w7.d0.u(parcel, readInt20);
                            break;
                        case '\r':
                            str51 = w7.d0.h(parcel, readInt20);
                            break;
                        default:
                            w7.d0.y(parcel, readInt20);
                            break;
                    }
                }
                w7.d0.m(parcel, z40);
                return new s(f12, i26, i27, i28, i29, i30, i31, i32, str50, i33, i34, str51);
            case 20:
                int z41 = w7.d0.z(parcel);
                String str52 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c20 = (char) readInt21;
                    if (c20 == 2) {
                        str2 = w7.d0.h(parcel, readInt21);
                    } else if (c20 != 3) {
                        w7.d0.y(parcel, readInt21);
                    } else {
                        str52 = w7.d0.h(parcel, readInt21);
                    }
                }
                w7.d0.m(parcel, z41);
                return new t(str2, str52);
            case 21:
                int z42 = w7.d0.z(parcel);
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    char c21 = (char) readInt22;
                    if (c21 == 2) {
                        i10 = w7.d0.u(parcel, readInt22);
                    } else if (c21 == 3) {
                        i35 = w7.d0.u(parcel, readInt22);
                    } else if (c21 != 4) {
                        w7.d0.y(parcel, readInt22);
                    } else {
                        i36 = w7.d0.u(parcel, readInt22);
                    }
                }
                w7.d0.m(parcel, z42);
                return new u(i10, i35, i36);
            default:
                int z43 = w7.d0.z(parcel);
                String str53 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                String str57 = null;
                ArrayList arrayList11 = null;
                String str58 = null;
                String str59 = null;
                String str60 = null;
                byte[] bArr = null;
                String str61 = null;
                g6.x xVar = null;
                Integer num2 = null;
                int i37 = 0;
                int i38 = 0;
                int i39 = -1;
                int i40 = 0;
                boolean z44 = false;
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str53 = w7.d0.h(parcel, readInt23);
                            break;
                        case 3:
                            str54 = w7.d0.h(parcel, readInt23);
                            break;
                        case 4:
                            str55 = w7.d0.h(parcel, readInt23);
                            break;
                        case 5:
                            str56 = w7.d0.h(parcel, readInt23);
                            break;
                        case 6:
                            str57 = w7.d0.h(parcel, readInt23);
                            break;
                        case 7:
                            i37 = w7.d0.u(parcel, readInt23);
                            break;
                        case '\b':
                            arrayList11 = w7.d0.l(parcel, readInt23, m6.a.CREATOR);
                            break;
                        case '\t':
                            i38 = w7.d0.u(parcel, readInt23);
                            break;
                        case '\n':
                            i39 = w7.d0.u(parcel, readInt23);
                            break;
                        case 11:
                            str58 = w7.d0.h(parcel, readInt23);
                            break;
                        case '\f':
                            str59 = w7.d0.h(parcel, readInt23);
                            break;
                        case '\r':
                            i40 = w7.d0.u(parcel, readInt23);
                            break;
                        case 14:
                            str60 = w7.d0.h(parcel, readInt23);
                            break;
                        case 15:
                            bArr = w7.d0.b(parcel, readInt23);
                            break;
                        case 16:
                            str61 = w7.d0.h(parcel, readInt23);
                            break;
                        case 17:
                            z44 = w7.d0.n(parcel, readInt23);
                            break;
                        case 18:
                            xVar = (g6.x) w7.d0.g(parcel, readInt23, g6.x.CREATOR);
                            break;
                        case 19:
                            num2 = w7.d0.v(parcel, readInt23);
                            break;
                        default:
                            w7.d0.y(parcel, readInt23);
                            break;
                    }
                }
                w7.d0.m(parcel, z43);
                return new CastDevice(str53, str54, str55, str56, str57, i37, arrayList11, i38, i39, str58, str59, i40, str60, bArr, str61, z44, xVar, num2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new a[i10];
            case 1:
                return new h[i10];
            case 2:
                return new w[i10];
            case 3:
                return new x[i10];
            case 4:
                return new b[i10];
            case 5:
                return new i[i10];
            case 6:
                return new MediaError[i10];
            case 7:
                return new MediaInfo[i10];
            case 8:
                return new j[i10];
            case 9:
                return new c[i10];
            case 10:
                return new k[i10];
            case 11:
                return new l[i10];
            case 12:
                return new m[i10];
            case 13:
                return new n[i10];
            case 14:
                return new o[i10];
            case 15:
                return new q[i10];
            case 16:
                return new MediaTrack[i10];
            case 17:
                return new d[i10];
            case 18:
                return new r[i10];
            case 19:
                return new s[i10];
            case 20:
                return new t[i10];
            case 21:
                return new u[i10];
            default:
                return new CastDevice[i10];
        }
    }
}
