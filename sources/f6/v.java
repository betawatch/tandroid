package f6;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.ac;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        float f10 = 0.0f;
        double d = 0.0d;
        long j3 = 0;
        boolean z10 = false;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
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
                int z11 = ac.z(parcel);
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
                            str6 = ac.h(parcel, readInt);
                            break;
                        case 3:
                            str7 = ac.h(parcel, readInt);
                            break;
                        case 4:
                            j10 = ac.w(parcel, readInt);
                            break;
                        case 5:
                            str8 = ac.h(parcel, readInt);
                            break;
                        case 6:
                            str9 = ac.h(parcel, readInt);
                            break;
                        case 7:
                            str10 = ac.h(parcel, readInt);
                            break;
                        case '\b':
                            str11 = ac.h(parcel, readInt);
                            break;
                        case '\t':
                            str12 = ac.h(parcel, readInt);
                            break;
                        case '\n':
                            str13 = ac.h(parcel, readInt);
                            break;
                        case 11:
                            j11 = ac.w(parcel, readInt);
                            break;
                        case '\f':
                            str14 = ac.h(parcel, readInt);
                            break;
                        case '\r':
                            tVar = (t) ac.g(parcel, readInt, t.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt);
                            break;
                    }
                }
                ac.m(parcel, z11);
                return new a(str6, str7, j10, str8, str9, str10, str11, str12, str13, j11, str14, tVar);
            case 1:
                int z12 = ac.z(parcel);
                String str15 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        str = ac.h(parcel, readInt2);
                    } else if (c10 != 2) {
                        ac.y(parcel, readInt2);
                    } else {
                        str15 = ac.h(parcel, readInt2);
                    }
                }
                ac.m(parcel, z12);
                return new h(str, str15);
            case 2:
                int z13 = ac.z(parcel);
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        f10 = ac.r(parcel, readInt3);
                    } else if (c11 == 3) {
                        f11 = ac.r(parcel, readInt3);
                    } else if (c11 != 4) {
                        ac.y(parcel, readInt3);
                    } else {
                        f12 = ac.r(parcel, readInt3);
                    }
                }
                ac.m(parcel, z13);
                return new w(f10, f11, f12);
            case 3:
                int z14 = ac.z(parcel);
                w wVar2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        wVar = (w) ac.g(parcel, readInt4, w.CREATOR);
                    } else if (c12 != 3) {
                        ac.y(parcel, readInt4);
                    } else {
                        wVar2 = (w) ac.g(parcel, readInt4, w.CREATOR);
                    }
                }
                ac.m(parcel, z14);
                return new x(wVar, wVar2);
            case 4:
                int z15 = ac.z(parcel);
                long j12 = 0;
                long j13 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                String str16 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            j12 = ac.w(parcel, readInt5);
                            break;
                        case 3:
                            str16 = ac.h(parcel, readInt5);
                            break;
                        case 4:
                            j13 = ac.w(parcel, readInt5);
                            break;
                        case 5:
                            z16 = ac.n(parcel, readInt5);
                            break;
                        case 6:
                            strArr = ac.i(parcel, readInt5);
                            break;
                        case 7:
                            z17 = ac.n(parcel, readInt5);
                            break;
                        case '\b':
                            z18 = ac.n(parcel, readInt5);
                            break;
                        default:
                            ac.y(parcel, readInt5);
                            break;
                    }
                }
                ac.m(parcel, z15);
                return new b(j12, str16, j13, z16, strArr, z17, z18);
            case 5:
                int z19 = ac.z(parcel);
                boolean z20 = false;
                h hVar = null;
                while (parcel.dataPosition() < z19) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 2) {
                        z10 = ac.n(parcel, readInt6);
                    } else if (c13 == 3) {
                        str5 = ac.h(parcel, readInt6);
                    } else if (c13 == 4) {
                        z20 = ac.n(parcel, readInt6);
                    } else if (c13 != 5) {
                        ac.y(parcel, readInt6);
                    } else {
                        hVar = (h) ac.g(parcel, readInt6, h.CREATOR);
                    }
                }
                ac.m(parcel, z19);
                return new i(z10, str5, z20, hVar);
            case 6:
                int z21 = ac.z(parcel);
                long j14 = 0;
                String str17 = null;
                String str18 = null;
                Integer num = null;
                String str19 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 2) {
                        str18 = ac.h(parcel, readInt7);
                    } else if (c14 == 3) {
                        j14 = ac.w(parcel, readInt7);
                    } else if (c14 == 4) {
                        num = ac.v(parcel, readInt7);
                    } else if (c14 == 5) {
                        str19 = ac.h(parcel, readInt7);
                    } else if (c14 != 6) {
                        ac.y(parcel, readInt7);
                    } else {
                        str17 = ac.h(parcel, readInt7);
                    }
                }
                ac.m(parcel, z21);
                Pattern pattern = j6.a.a;
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
                int z22 = ac.z(parcel);
                long j15 = 0;
                long j16 = 0;
                int i13 = 0;
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
                while (parcel.dataPosition() < z22) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str20 = ac.h(parcel, readInt8);
                            break;
                        case 3:
                            i13 = ac.u(parcel, readInt8);
                            break;
                        case 4:
                            str21 = ac.h(parcel, readInt8);
                            break;
                        case 5:
                            lVar = (l) ac.g(parcel, readInt8, l.CREATOR);
                            break;
                        case 6:
                            j15 = ac.w(parcel, readInt8);
                            break;
                        case 7:
                            arrayList2 = ac.l(parcel, readInt8, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            sVar = (s) ac.g(parcel, readInt8, s.CREATOR);
                            break;
                        case '\t':
                            str22 = ac.h(parcel, readInt8);
                            break;
                        case '\n':
                            arrayList3 = ac.l(parcel, readInt8, b.CREATOR);
                            break;
                        case 11:
                            arrayList4 = ac.l(parcel, readInt8, a.CREATOR);
                            break;
                        case '\f':
                            str23 = ac.h(parcel, readInt8);
                            break;
                        case '\r':
                            tVar2 = (t) ac.g(parcel, readInt8, t.CREATOR);
                            break;
                        case 14:
                            j16 = ac.w(parcel, readInt8);
                            break;
                        case 15:
                            str24 = ac.h(parcel, readInt8);
                            break;
                        case 16:
                            str25 = ac.h(parcel, readInt8);
                            break;
                        case 17:
                            str26 = ac.h(parcel, readInt8);
                            break;
                        case 18:
                            str27 = ac.h(parcel, readInt8);
                            break;
                        default:
                            ac.y(parcel, readInt8);
                            break;
                    }
                }
                ac.m(parcel, z22);
                return new MediaInfo(str20, i13, str21, lVar, j15, arrayList2, sVar, str22, arrayList3, arrayList4, str23, tVar2, j16, str24, str25, str26, str27);
            case 8:
                int z23 = ac.z(parcel);
                long j17 = 0;
                long j18 = 0;
                boolean z24 = false;
                boolean z25 = false;
                while (parcel.dataPosition() < z23) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        j17 = ac.w(parcel, readInt9);
                    } else if (c15 == 3) {
                        j18 = ac.w(parcel, readInt9);
                    } else if (c15 == 4) {
                        z24 = ac.n(parcel, readInt9);
                    } else if (c15 != 5) {
                        ac.y(parcel, readInt9);
                    } else {
                        z25 = ac.n(parcel, readInt9);
                    }
                }
                ac.m(parcel, z23);
                return new j(j17, j18, z24, z25);
            case 9:
                int z26 = ac.z(parcel);
                long j19 = 0;
                long j20 = 0;
                long j21 = 0;
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        j19 = ac.w(parcel, readInt10);
                    } else if (c16 == 3) {
                        j20 = ac.w(parcel, readInt10);
                    } else if (c16 == 4) {
                        str28 = ac.h(parcel, readInt10);
                    } else if (c16 == 5) {
                        str29 = ac.h(parcel, readInt10);
                    } else if (c16 != 6) {
                        ac.y(parcel, readInt10);
                    } else {
                        j21 = ac.w(parcel, readInt10);
                    }
                }
                ac.m(parcel, z26);
                return new c(j19, j20, str28, str29, j21);
            case 10:
                int z27 = ac.z(parcel);
                double d2 = 0.0d;
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
                            mediaInfo = (MediaInfo) ac.g(parcel, readInt11, MediaInfo.CREATOR);
                            break;
                        case 3:
                            nVar = (n) ac.g(parcel, readInt11, n.CREATOR);
                            break;
                        case 4:
                            bool = ac.o(parcel, readInt11);
                            break;
                        case 5:
                            j22 = ac.w(parcel, readInt11);
                            break;
                        case 6:
                            d2 = ac.q(parcel, readInt11);
                            break;
                        case 7:
                            jArr = ac.f(parcel, readInt11);
                            break;
                        case '\b':
                            str30 = ac.h(parcel, readInt11);
                            break;
                        case '\t':
                            str31 = ac.h(parcel, readInt11);
                            break;
                        case '\n':
                            str32 = ac.h(parcel, readInt11);
                            break;
                        case 11:
                            str33 = ac.h(parcel, readInt11);
                            break;
                        case '\f':
                            str34 = ac.h(parcel, readInt11);
                            break;
                        case '\r':
                            j23 = ac.w(parcel, readInt11);
                            break;
                        default:
                            ac.y(parcel, readInt11);
                            break;
                    }
                }
                ac.m(parcel, z27);
                Pattern pattern2 = j6.a.a;
                if (str30 != null) {
                    try {
                        jSONObject2 = new JSONObject(str30);
                    } catch (JSONException unused2) {
                    }
                    return new k(mediaInfo, nVar, bool, j22, d2, jArr, jSONObject2, str31, str32, str33, str34, j23);
                }
                jSONObject2 = null;
                return new k(mediaInfo, nVar, bool, j22, d2, jArr, jSONObject2, str31, str32, str33, str34, j23);
            case 11:
                int z28 = ac.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z28) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 2) {
                        arrayList = ac.l(parcel, readInt12, p6.a.CREATOR);
                    } else if (c17 == 3) {
                        bundle = ac.a(parcel, readInt12);
                    } else if (c17 != 4) {
                        ac.y(parcel, readInt12);
                    } else {
                        i12 = ac.u(parcel, readInt12);
                    }
                }
                ac.m(parcel, z28);
                return new l(arrayList, bundle, i12);
            case 12:
                int z29 = ac.z(parcel);
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 2) {
                        i11 = ac.u(parcel, readInt13);
                    } else if (c18 == 3) {
                        str4 = ac.h(parcel, readInt13);
                    } else if (c18 == 4) {
                        arrayList5 = ac.l(parcel, readInt13, l.CREATOR);
                    } else if (c18 == 5) {
                        arrayList6 = ac.l(parcel, readInt13, p6.a.CREATOR);
                    } else if (c18 != 6) {
                        ac.y(parcel, readInt13);
                    } else {
                        d = ac.q(parcel, readInt13);
                    }
                }
                ac.m(parcel, z29);
                m mVar = new m();
                mVar.a = i11;
                mVar.b = str4;
                mVar.c = arrayList5;
                mVar.d = arrayList6;
                mVar.e = d;
                return mVar;
            case 13:
                int z30 = ac.z(parcel);
                int i14 = 0;
                int i15 = 0;
                boolean z31 = false;
                String str35 = null;
                String str36 = null;
                m mVar2 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str3 = ac.h(parcel, readInt14);
                            break;
                        case 3:
                            str35 = ac.h(parcel, readInt14);
                            break;
                        case 4:
                            i10 = ac.u(parcel, readInt14);
                            break;
                        case 5:
                            str36 = ac.h(parcel, readInt14);
                            break;
                        case 6:
                            mVar2 = (m) ac.g(parcel, readInt14, m.CREATOR);
                            break;
                        case 7:
                            i14 = ac.u(parcel, readInt14);
                            break;
                        case '\b':
                            arrayList7 = ac.l(parcel, readInt14, o.CREATOR);
                            break;
                        case '\t':
                            i15 = ac.u(parcel, readInt14);
                            break;
                        case '\n':
                            j3 = ac.w(parcel, readInt14);
                            break;
                        case 11:
                            z31 = ac.n(parcel, readInt14);
                            break;
                        default:
                            ac.y(parcel, readInt14);
                            break;
                    }
                }
                ac.m(parcel, z30);
                n nVar2 = new n();
                nVar2.a = str3;
                nVar2.b = str35;
                nVar2.c = i10;
                nVar2.d = str36;
                nVar2.e = mVar2;
                nVar2.f = i14;
                nVar2.h = arrayList7;
                nVar2.n = i15;
                nVar2.r = j3;
                nVar2.s = z31;
                return nVar2;
            case 14:
                int z32 = ac.z(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                double d12 = 0.0d;
                int i16 = 0;
                boolean z33 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str37 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            mediaInfo2 = (MediaInfo) ac.g(parcel, readInt15, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i16 = ac.u(parcel, readInt15);
                            break;
                        case 4:
                            z33 = ac.n(parcel, readInt15);
                            break;
                        case 5:
                            d10 = ac.q(parcel, readInt15);
                            break;
                        case 6:
                            d11 = ac.q(parcel, readInt15);
                            break;
                        case 7:
                            d12 = ac.q(parcel, readInt15);
                            break;
                        case '\b':
                            jArr2 = ac.f(parcel, readInt15);
                            break;
                        case '\t':
                            str37 = ac.h(parcel, readInt15);
                            break;
                        default:
                            ac.y(parcel, readInt15);
                            break;
                    }
                }
                ac.m(parcel, z32);
                return new o(mediaInfo2, i16, z33, d10, d11, d12, jArr2, str37);
            case 15:
                int z34 = ac.z(parcel);
                double d13 = 0.0d;
                double d14 = 0.0d;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                boolean z35 = false;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                boolean z36 = false;
                MediaInfo mediaInfo3 = null;
                long[] jArr3 = null;
                String str38 = null;
                ArrayList arrayList8 = null;
                c cVar = null;
                u uVar = null;
                j jVar = null;
                n nVar3 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            mediaInfo3 = (MediaInfo) ac.g(parcel, readInt16, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j24 = ac.w(parcel, readInt16);
                            break;
                        case 4:
                            i17 = ac.u(parcel, readInt16);
                            break;
                        case 5:
                            d13 = ac.q(parcel, readInt16);
                            break;
                        case 6:
                            i18 = ac.u(parcel, readInt16);
                            break;
                        case 7:
                            i19 = ac.u(parcel, readInt16);
                            break;
                        case '\b':
                            j25 = ac.w(parcel, readInt16);
                            break;
                        case '\t':
                            j26 = ac.w(parcel, readInt16);
                            break;
                        case '\n':
                            d14 = ac.q(parcel, readInt16);
                            break;
                        case 11:
                            z35 = ac.n(parcel, readInt16);
                            break;
                        case '\f':
                            jArr3 = ac.f(parcel, readInt16);
                            break;
                        case '\r':
                            i20 = ac.u(parcel, readInt16);
                            break;
                        case 14:
                            i21 = ac.u(parcel, readInt16);
                            break;
                        case 15:
                            str38 = ac.h(parcel, readInt16);
                            break;
                        case 16:
                            i22 = ac.u(parcel, readInt16);
                            break;
                        case 17:
                            arrayList8 = ac.l(parcel, readInt16, o.CREATOR);
                            break;
                        case 18:
                            z36 = ac.n(parcel, readInt16);
                            break;
                        case 19:
                            cVar = (c) ac.g(parcel, readInt16, c.CREATOR);
                            break;
                        case 20:
                            uVar = (u) ac.g(parcel, readInt16, u.CREATOR);
                            break;
                        case 21:
                            jVar = (j) ac.g(parcel, readInt16, j.CREATOR);
                            break;
                        case 22:
                            nVar3 = (n) ac.g(parcel, readInt16, n.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt16);
                            break;
                    }
                }
                ac.m(parcel, z34);
                return new q(mediaInfo3, j24, i17, d13, i18, i19, j25, j26, d14, z35, jArr3, i20, i21, str38, i22, arrayList8, z36, cVar, uVar, jVar, nVar3);
            case 16:
                int z37 = ac.z(parcel);
                long j27 = 0;
                int i23 = 0;
                int i24 = 0;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                ArrayList arrayList9 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            j27 = ac.w(parcel, readInt17);
                            break;
                        case 3:
                            i23 = ac.u(parcel, readInt17);
                            break;
                        case 4:
                            str40 = ac.h(parcel, readInt17);
                            break;
                        case 5:
                            str41 = ac.h(parcel, readInt17);
                            break;
                        case 6:
                            str42 = ac.h(parcel, readInt17);
                            break;
                        case 7:
                            str43 = ac.h(parcel, readInt17);
                            break;
                        case '\b':
                            i24 = ac.u(parcel, readInt17);
                            break;
                        case '\t':
                            arrayList9 = ac.j(parcel, readInt17);
                            break;
                        case '\n':
                            str39 = ac.h(parcel, readInt17);
                            break;
                        default:
                            ac.y(parcel, readInt17);
                            break;
                    }
                }
                ac.m(parcel, z37);
                Pattern pattern3 = j6.a.a;
                if (str39 != null) {
                    try {
                        jSONObject3 = new JSONObject(str39);
                    } catch (JSONException unused3) {
                    }
                    return new MediaTrack(j27, i23, str40, str41, str42, str43, i24, arrayList9, jSONObject3);
                }
                jSONObject3 = null;
                return new MediaTrack(j27, i23, str40, str41, str42, str43, i24, arrayList9, jSONObject3);
            case 17:
                int z38 = ac.z(parcel);
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
                            str44 = ac.h(parcel, readInt18);
                            break;
                        case 3:
                            str45 = ac.h(parcel, readInt18);
                            break;
                        case 4:
                            ac.l(parcel, readInt18, p6.a.CREATOR);
                            break;
                        case 5:
                            arrayList10 = ac.j(parcel, readInt18);
                            break;
                        case 6:
                            str46 = ac.h(parcel, readInt18);
                            break;
                        case 7:
                            uri = (Uri) ac.g(parcel, readInt18, Uri.CREATOR);
                            break;
                        case '\b':
                            str47 = ac.h(parcel, readInt18);
                            break;
                        case '\t':
                            str48 = ac.h(parcel, readInt18);
                            break;
                        case '\n':
                            bool2 = ac.o(parcel, readInt18);
                            break;
                        case 11:
                            bool3 = ac.o(parcel, readInt18);
                            break;
                        default:
                            ac.y(parcel, readInt18);
                            break;
                    }
                }
                ac.m(parcel, z38);
                return new d(str44, str45, arrayList10, str46, uri, str47, str48, bool2, bool3);
            case 18:
                int z39 = ac.z(parcel);
                k kVar = null;
                String str49 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        kVar = (k) ac.g(parcel, readInt19, k.CREATOR);
                    } else if (c19 != 3) {
                        ac.y(parcel, readInt19);
                    } else {
                        str49 = ac.h(parcel, readInt19);
                    }
                }
                ac.m(parcel, z39);
                Pattern pattern4 = j6.a.a;
                if (str49 != null) {
                    try {
                        jSONObject4 = new JSONObject(str49);
                    } catch (JSONException unused4) {
                    }
                }
                return new r(kVar, jSONObject4);
            case 19:
                int z40 = ac.z(parcel);
                float f13 = 0.0f;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                String str50 = null;
                String str51 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            f13 = ac.r(parcel, readInt20);
                            break;
                        case 3:
                            i25 = ac.u(parcel, readInt20);
                            break;
                        case 4:
                            i26 = ac.u(parcel, readInt20);
                            break;
                        case 5:
                            i27 = ac.u(parcel, readInt20);
                            break;
                        case 6:
                            i28 = ac.u(parcel, readInt20);
                            break;
                        case 7:
                            i29 = ac.u(parcel, readInt20);
                            break;
                        case '\b':
                            i30 = ac.u(parcel, readInt20);
                            break;
                        case '\t':
                            i31 = ac.u(parcel, readInt20);
                            break;
                        case '\n':
                            str50 = ac.h(parcel, readInt20);
                            break;
                        case 11:
                            i32 = ac.u(parcel, readInt20);
                            break;
                        case '\f':
                            i33 = ac.u(parcel, readInt20);
                            break;
                        case '\r':
                            str51 = ac.h(parcel, readInt20);
                            break;
                        default:
                            ac.y(parcel, readInt20);
                            break;
                    }
                }
                ac.m(parcel, z40);
                return new s(f13, i25, i26, i27, i28, i29, i30, i31, str50, i32, i33, str51);
            case 20:
                int z41 = ac.z(parcel);
                String str52 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c20 = (char) readInt21;
                    if (c20 == 2) {
                        str2 = ac.h(parcel, readInt21);
                    } else if (c20 != 3) {
                        ac.y(parcel, readInt21);
                    } else {
                        str52 = ac.h(parcel, readInt21);
                    }
                }
                ac.m(parcel, z41);
                return new t(str2, str52);
            case 21:
                int z42 = ac.z(parcel);
                int i34 = 0;
                int i35 = 0;
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    char c21 = (char) readInt22;
                    if (c21 == 2) {
                        i7 = ac.u(parcel, readInt22);
                    } else if (c21 == 3) {
                        i34 = ac.u(parcel, readInt22);
                    } else if (c21 != 4) {
                        ac.y(parcel, readInt22);
                    } else {
                        i35 = ac.u(parcel, readInt22);
                    }
                }
                ac.m(parcel, z42);
                return new u(i7, i34, i35);
            default:
                int z43 = ac.z(parcel);
                int i36 = -1;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                boolean z44 = false;
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
                j6.y yVar = null;
                Integer num2 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str53 = ac.h(parcel, readInt23);
                            break;
                        case 3:
                            str54 = ac.h(parcel, readInt23);
                            break;
                        case 4:
                            str55 = ac.h(parcel, readInt23);
                            break;
                        case 5:
                            str56 = ac.h(parcel, readInt23);
                            break;
                        case 6:
                            str57 = ac.h(parcel, readInt23);
                            break;
                        case 7:
                            i37 = ac.u(parcel, readInt23);
                            break;
                        case '\b':
                            arrayList11 = ac.l(parcel, readInt23, p6.a.CREATOR);
                            break;
                        case '\t':
                            i38 = ac.u(parcel, readInt23);
                            break;
                        case '\n':
                            i36 = ac.u(parcel, readInt23);
                            break;
                        case 11:
                            str58 = ac.h(parcel, readInt23);
                            break;
                        case '\f':
                            str59 = ac.h(parcel, readInt23);
                            break;
                        case '\r':
                            i39 = ac.u(parcel, readInt23);
                            break;
                        case 14:
                            str60 = ac.h(parcel, readInt23);
                            break;
                        case 15:
                            bArr = ac.b(parcel, readInt23);
                            break;
                        case 16:
                            str61 = ac.h(parcel, readInt23);
                            break;
                        case 17:
                            z44 = ac.n(parcel, readInt23);
                            break;
                        case 18:
                            yVar = (j6.y) ac.g(parcel, readInt23, j6.y.CREATOR);
                            break;
                        case 19:
                            num2 = ac.v(parcel, readInt23);
                            break;
                        default:
                            ac.y(parcel, readInt23);
                            break;
                    }
                }
                ac.m(parcel, z43);
                return new CastDevice(str53, str54, str55, str56, str57, i37, arrayList11, i38, i36, str58, str59, i39, str60, bArr, str61, z44, yVar, num2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new a[i7];
            case 1:
                return new h[i7];
            case 2:
                return new w[i7];
            case 3:
                return new x[i7];
            case 4:
                return new b[i7];
            case 5:
                return new i[i7];
            case 6:
                return new MediaError[i7];
            case 7:
                return new MediaInfo[i7];
            case 8:
                return new j[i7];
            case 9:
                return new c[i7];
            case 10:
                return new k[i7];
            case 11:
                return new l[i7];
            case 12:
                return new m[i7];
            case 13:
                return new n[i7];
            case 14:
                return new o[i7];
            case 15:
                return new q[i7];
            case 16:
                return new MediaTrack[i7];
            case 17:
                return new d[i7];
            case 18:
                return new r[i7];
            case 19:
                return new s[i7];
            case 20:
                return new t[i7];
            case 21:
                return new u[i7];
            default:
                return new CastDevice[i7];
        }
    }
}
