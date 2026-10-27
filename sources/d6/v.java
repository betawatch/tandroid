package d6;

import a8.bf;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        long j10 = 0;
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
                int z11 = bf.z(parcel);
                long j11 = 0;
                long j12 = 0;
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
                            str6 = bf.h(parcel, readInt);
                            break;
                        case 3:
                            str7 = bf.h(parcel, readInt);
                            break;
                        case 4:
                            j11 = bf.w(parcel, readInt);
                            break;
                        case 5:
                            str8 = bf.h(parcel, readInt);
                            break;
                        case 6:
                            str9 = bf.h(parcel, readInt);
                            break;
                        case 7:
                            str10 = bf.h(parcel, readInt);
                            break;
                        case '\b':
                            str11 = bf.h(parcel, readInt);
                            break;
                        case '\t':
                            str12 = bf.h(parcel, readInt);
                            break;
                        case '\n':
                            str13 = bf.h(parcel, readInt);
                            break;
                        case 11:
                            j12 = bf.w(parcel, readInt);
                            break;
                        case '\f':
                            str14 = bf.h(parcel, readInt);
                            break;
                        case '\r':
                            tVar = (t) bf.g(parcel, readInt, t.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt);
                            break;
                    }
                }
                bf.m(parcel, z11);
                return new a(str6, str7, j11, str8, str9, str10, str11, str12, str13, j12, str14, tVar);
            case 1:
                int z12 = bf.z(parcel);
                String str15 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        str = bf.h(parcel, readInt2);
                    } else if (c10 != 2) {
                        bf.y(parcel, readInt2);
                    } else {
                        str15 = bf.h(parcel, readInt2);
                    }
                }
                bf.m(parcel, z12);
                return new h(str, str15);
            case 2:
                int z13 = bf.z(parcel);
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        f7 = bf.r(parcel, readInt3);
                    } else if (c11 == 3) {
                        f10 = bf.r(parcel, readInt3);
                    } else if (c11 != 4) {
                        bf.y(parcel, readInt3);
                    } else {
                        f11 = bf.r(parcel, readInt3);
                    }
                }
                bf.m(parcel, z13);
                return new w(f7, f10, f11);
            case 3:
                int z14 = bf.z(parcel);
                w wVar2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        wVar = (w) bf.g(parcel, readInt4, w.CREATOR);
                    } else if (c12 != 3) {
                        bf.y(parcel, readInt4);
                    } else {
                        wVar2 = (w) bf.g(parcel, readInt4, w.CREATOR);
                    }
                }
                bf.m(parcel, z14);
                return new x(wVar, wVar2);
            case 4:
                int z15 = bf.z(parcel);
                long j13 = 0;
                long j14 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                String str16 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            j13 = bf.w(parcel, readInt5);
                            break;
                        case 3:
                            str16 = bf.h(parcel, readInt5);
                            break;
                        case 4:
                            j14 = bf.w(parcel, readInt5);
                            break;
                        case 5:
                            z16 = bf.n(parcel, readInt5);
                            break;
                        case 6:
                            strArr = bf.i(parcel, readInt5);
                            break;
                        case 7:
                            z17 = bf.n(parcel, readInt5);
                            break;
                        case '\b':
                            z18 = bf.n(parcel, readInt5);
                            break;
                        default:
                            bf.y(parcel, readInt5);
                            break;
                    }
                }
                bf.m(parcel, z15);
                return new b(j13, str16, j14, z16, strArr, z17, z18);
            case 5:
                int z19 = bf.z(parcel);
                boolean z20 = false;
                h hVar = null;
                while (parcel.dataPosition() < z19) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 2) {
                        z10 = bf.n(parcel, readInt6);
                    } else if (c13 == 3) {
                        str5 = bf.h(parcel, readInt6);
                    } else if (c13 == 4) {
                        z20 = bf.n(parcel, readInt6);
                    } else if (c13 != 5) {
                        bf.y(parcel, readInt6);
                    } else {
                        hVar = (h) bf.g(parcel, readInt6, h.CREATOR);
                    }
                }
                bf.m(parcel, z19);
                return new i(z10, str5, z20, hVar);
            case 6:
                int z21 = bf.z(parcel);
                long j15 = 0;
                String str17 = null;
                String str18 = null;
                Integer num = null;
                String str19 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 2) {
                        str18 = bf.h(parcel, readInt7);
                    } else if (c14 == 3) {
                        j15 = bf.w(parcel, readInt7);
                    } else if (c14 == 4) {
                        num = bf.v(parcel, readInt7);
                    } else if (c14 == 5) {
                        str19 = bf.h(parcel, readInt7);
                    } else if (c14 != 6) {
                        bf.y(parcel, readInt7);
                    } else {
                        str17 = bf.h(parcel, readInt7);
                    }
                }
                bf.m(parcel, z21);
                Pattern pattern = h6.a.a;
                if (str17 != null) {
                    try {
                        jSONObject = new JSONObject(str17);
                    } catch (JSONException unused) {
                    }
                    return new MediaError(str18, j15, num, str19, jSONObject);
                }
                jSONObject = null;
                return new MediaError(str18, j15, num, str19, jSONObject);
            case 7:
                int z22 = bf.z(parcel);
                long j16 = 0;
                long j17 = 0;
                int i14 = 0;
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
                            str20 = bf.h(parcel, readInt8);
                            break;
                        case 3:
                            i14 = bf.u(parcel, readInt8);
                            break;
                        case 4:
                            str21 = bf.h(parcel, readInt8);
                            break;
                        case 5:
                            lVar = (l) bf.g(parcel, readInt8, l.CREATOR);
                            break;
                        case 6:
                            j16 = bf.w(parcel, readInt8);
                            break;
                        case 7:
                            arrayList2 = bf.l(parcel, readInt8, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            sVar = (s) bf.g(parcel, readInt8, s.CREATOR);
                            break;
                        case '\t':
                            str22 = bf.h(parcel, readInt8);
                            break;
                        case '\n':
                            arrayList3 = bf.l(parcel, readInt8, b.CREATOR);
                            break;
                        case 11:
                            arrayList4 = bf.l(parcel, readInt8, a.CREATOR);
                            break;
                        case '\f':
                            str23 = bf.h(parcel, readInt8);
                            break;
                        case '\r':
                            tVar2 = (t) bf.g(parcel, readInt8, t.CREATOR);
                            break;
                        case 14:
                            j17 = bf.w(parcel, readInt8);
                            break;
                        case 15:
                            str24 = bf.h(parcel, readInt8);
                            break;
                        case 16:
                            str25 = bf.h(parcel, readInt8);
                            break;
                        case 17:
                            str26 = bf.h(parcel, readInt8);
                            break;
                        case 18:
                            str27 = bf.h(parcel, readInt8);
                            break;
                        default:
                            bf.y(parcel, readInt8);
                            break;
                    }
                }
                bf.m(parcel, z22);
                return new MediaInfo(str20, i14, str21, lVar, j16, arrayList2, sVar, str22, arrayList3, arrayList4, str23, tVar2, j17, str24, str25, str26, str27);
            case 8:
                int z23 = bf.z(parcel);
                long j18 = 0;
                long j19 = 0;
                boolean z24 = false;
                boolean z25 = false;
                while (parcel.dataPosition() < z23) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        j18 = bf.w(parcel, readInt9);
                    } else if (c15 == 3) {
                        j19 = bf.w(parcel, readInt9);
                    } else if (c15 == 4) {
                        z24 = bf.n(parcel, readInt9);
                    } else if (c15 != 5) {
                        bf.y(parcel, readInt9);
                    } else {
                        z25 = bf.n(parcel, readInt9);
                    }
                }
                bf.m(parcel, z23);
                return new j(j18, j19, z24, z25);
            case 9:
                int z26 = bf.z(parcel);
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        j20 = bf.w(parcel, readInt10);
                    } else if (c16 == 3) {
                        j21 = bf.w(parcel, readInt10);
                    } else if (c16 == 4) {
                        str28 = bf.h(parcel, readInt10);
                    } else if (c16 == 5) {
                        str29 = bf.h(parcel, readInt10);
                    } else if (c16 != 6) {
                        bf.y(parcel, readInt10);
                    } else {
                        j22 = bf.w(parcel, readInt10);
                    }
                }
                bf.m(parcel, z26);
                return new c(j20, j21, str28, str29, j22);
            case 10:
                int z27 = bf.z(parcel);
                double d10 = 0.0d;
                long j23 = 0;
                long j24 = 0;
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
                            mediaInfo = (MediaInfo) bf.g(parcel, readInt11, MediaInfo.CREATOR);
                            break;
                        case 3:
                            nVar = (n) bf.g(parcel, readInt11, n.CREATOR);
                            break;
                        case 4:
                            bool = bf.o(parcel, readInt11);
                            break;
                        case 5:
                            j23 = bf.w(parcel, readInt11);
                            break;
                        case 6:
                            d10 = bf.q(parcel, readInt11);
                            break;
                        case 7:
                            jArr = bf.f(parcel, readInt11);
                            break;
                        case '\b':
                            str30 = bf.h(parcel, readInt11);
                            break;
                        case '\t':
                            str31 = bf.h(parcel, readInt11);
                            break;
                        case '\n':
                            str32 = bf.h(parcel, readInt11);
                            break;
                        case 11:
                            str33 = bf.h(parcel, readInt11);
                            break;
                        case '\f':
                            str34 = bf.h(parcel, readInt11);
                            break;
                        case '\r':
                            j24 = bf.w(parcel, readInt11);
                            break;
                        default:
                            bf.y(parcel, readInt11);
                            break;
                    }
                }
                bf.m(parcel, z27);
                Pattern pattern2 = h6.a.a;
                if (str30 != null) {
                    try {
                        jSONObject2 = new JSONObject(str30);
                    } catch (JSONException unused2) {
                    }
                    return new k(mediaInfo, nVar, bool, j23, d10, jArr, jSONObject2, str31, str32, str33, str34, j24);
                }
                jSONObject2 = null;
                return new k(mediaInfo, nVar, bool, j23, d10, jArr, jSONObject2, str31, str32, str33, str34, j24);
            case 11:
                int z28 = bf.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z28) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 2) {
                        arrayList = bf.l(parcel, readInt12, n6.a.CREATOR);
                    } else if (c17 == 3) {
                        bundle = bf.a(parcel, readInt12);
                    } else if (c17 != 4) {
                        bf.y(parcel, readInt12);
                    } else {
                        i13 = bf.u(parcel, readInt12);
                    }
                }
                bf.m(parcel, z28);
                return new l(arrayList, bundle, i13);
            case 12:
                int z29 = bf.z(parcel);
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 2) {
                        i12 = bf.u(parcel, readInt13);
                    } else if (c18 == 3) {
                        str4 = bf.h(parcel, readInt13);
                    } else if (c18 == 4) {
                        arrayList5 = bf.l(parcel, readInt13, l.CREATOR);
                    } else if (c18 == 5) {
                        arrayList6 = bf.l(parcel, readInt13, n6.a.CREATOR);
                    } else if (c18 != 6) {
                        bf.y(parcel, readInt13);
                    } else {
                        d = bf.q(parcel, readInt13);
                    }
                }
                bf.m(parcel, z29);
                m mVar = new m();
                mVar.a = i12;
                mVar.b = str4;
                mVar.c = arrayList5;
                mVar.d = arrayList6;
                mVar.e = d;
                return mVar;
            case 13:
                int z30 = bf.z(parcel);
                int i15 = 0;
                int i16 = 0;
                boolean z31 = false;
                String str35 = null;
                String str36 = null;
                m mVar2 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str3 = bf.h(parcel, readInt14);
                            break;
                        case 3:
                            str35 = bf.h(parcel, readInt14);
                            break;
                        case 4:
                            i11 = bf.u(parcel, readInt14);
                            break;
                        case 5:
                            str36 = bf.h(parcel, readInt14);
                            break;
                        case 6:
                            mVar2 = (m) bf.g(parcel, readInt14, m.CREATOR);
                            break;
                        case 7:
                            i15 = bf.u(parcel, readInt14);
                            break;
                        case '\b':
                            arrayList7 = bf.l(parcel, readInt14, o.CREATOR);
                            break;
                        case '\t':
                            i16 = bf.u(parcel, readInt14);
                            break;
                        case '\n':
                            j10 = bf.w(parcel, readInt14);
                            break;
                        case 11:
                            z31 = bf.n(parcel, readInt14);
                            break;
                        default:
                            bf.y(parcel, readInt14);
                            break;
                    }
                }
                bf.m(parcel, z30);
                n nVar2 = new n();
                nVar2.a = str3;
                nVar2.b = str35;
                nVar2.c = i11;
                nVar2.d = str36;
                nVar2.e = mVar2;
                nVar2.f = i15;
                nVar2.h = arrayList7;
                nVar2.n = i16;
                nVar2.r = j10;
                nVar2.s = z31;
                return nVar2;
            case 14:
                int z32 = bf.z(parcel);
                double d11 = 0.0d;
                double d12 = 0.0d;
                double d13 = 0.0d;
                int i17 = 0;
                boolean z33 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str37 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            mediaInfo2 = (MediaInfo) bf.g(parcel, readInt15, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i17 = bf.u(parcel, readInt15);
                            break;
                        case 4:
                            z33 = bf.n(parcel, readInt15);
                            break;
                        case 5:
                            d11 = bf.q(parcel, readInt15);
                            break;
                        case 6:
                            d12 = bf.q(parcel, readInt15);
                            break;
                        case 7:
                            d13 = bf.q(parcel, readInt15);
                            break;
                        case '\b':
                            jArr2 = bf.f(parcel, readInt15);
                            break;
                        case '\t':
                            str37 = bf.h(parcel, readInt15);
                            break;
                        default:
                            bf.y(parcel, readInt15);
                            break;
                    }
                }
                bf.m(parcel, z32);
                return new o(mediaInfo2, i17, z33, d11, d12, d13, jArr2, str37);
            case 15:
                int z34 = bf.z(parcel);
                double d14 = 0.0d;
                double d15 = 0.0d;
                long j25 = 0;
                long j26 = 0;
                long j27 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z35 = false;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
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
                            mediaInfo3 = (MediaInfo) bf.g(parcel, readInt16, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j25 = bf.w(parcel, readInt16);
                            break;
                        case 4:
                            i18 = bf.u(parcel, readInt16);
                            break;
                        case 5:
                            d14 = bf.q(parcel, readInt16);
                            break;
                        case 6:
                            i19 = bf.u(parcel, readInt16);
                            break;
                        case 7:
                            i20 = bf.u(parcel, readInt16);
                            break;
                        case '\b':
                            j26 = bf.w(parcel, readInt16);
                            break;
                        case '\t':
                            j27 = bf.w(parcel, readInt16);
                            break;
                        case '\n':
                            d15 = bf.q(parcel, readInt16);
                            break;
                        case 11:
                            z35 = bf.n(parcel, readInt16);
                            break;
                        case '\f':
                            jArr3 = bf.f(parcel, readInt16);
                            break;
                        case '\r':
                            i21 = bf.u(parcel, readInt16);
                            break;
                        case 14:
                            i22 = bf.u(parcel, readInt16);
                            break;
                        case 15:
                            str38 = bf.h(parcel, readInt16);
                            break;
                        case 16:
                            i23 = bf.u(parcel, readInt16);
                            break;
                        case 17:
                            arrayList8 = bf.l(parcel, readInt16, o.CREATOR);
                            break;
                        case 18:
                            z36 = bf.n(parcel, readInt16);
                            break;
                        case 19:
                            cVar = (c) bf.g(parcel, readInt16, c.CREATOR);
                            break;
                        case 20:
                            uVar = (u) bf.g(parcel, readInt16, u.CREATOR);
                            break;
                        case 21:
                            jVar = (j) bf.g(parcel, readInt16, j.CREATOR);
                            break;
                        case 22:
                            nVar3 = (n) bf.g(parcel, readInt16, n.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt16);
                            break;
                    }
                }
                bf.m(parcel, z34);
                return new q(mediaInfo3, j25, i18, d14, i19, i20, j26, j27, d15, z35, jArr3, i21, i22, str38, i23, arrayList8, z36, cVar, uVar, jVar, nVar3);
            case 16:
                int z37 = bf.z(parcel);
                long j28 = 0;
                int i24 = 0;
                int i25 = 0;
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
                            j28 = bf.w(parcel, readInt17);
                            break;
                        case 3:
                            i24 = bf.u(parcel, readInt17);
                            break;
                        case 4:
                            str40 = bf.h(parcel, readInt17);
                            break;
                        case 5:
                            str41 = bf.h(parcel, readInt17);
                            break;
                        case 6:
                            str42 = bf.h(parcel, readInt17);
                            break;
                        case 7:
                            str43 = bf.h(parcel, readInt17);
                            break;
                        case '\b':
                            i25 = bf.u(parcel, readInt17);
                            break;
                        case '\t':
                            arrayList9 = bf.j(parcel, readInt17);
                            break;
                        case '\n':
                            str39 = bf.h(parcel, readInt17);
                            break;
                        default:
                            bf.y(parcel, readInt17);
                            break;
                    }
                }
                bf.m(parcel, z37);
                Pattern pattern3 = h6.a.a;
                if (str39 != null) {
                    try {
                        jSONObject3 = new JSONObject(str39);
                    } catch (JSONException unused3) {
                    }
                    return new MediaTrack(j28, i24, str40, str41, str42, str43, i25, arrayList9, jSONObject3);
                }
                jSONObject3 = null;
                return new MediaTrack(j28, i24, str40, str41, str42, str43, i25, arrayList9, jSONObject3);
            case 17:
                int z38 = bf.z(parcel);
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
                            str44 = bf.h(parcel, readInt18);
                            break;
                        case 3:
                            str45 = bf.h(parcel, readInt18);
                            break;
                        case 4:
                            bf.l(parcel, readInt18, n6.a.CREATOR);
                            break;
                        case 5:
                            arrayList10 = bf.j(parcel, readInt18);
                            break;
                        case 6:
                            str46 = bf.h(parcel, readInt18);
                            break;
                        case 7:
                            uri = (Uri) bf.g(parcel, readInt18, Uri.CREATOR);
                            break;
                        case '\b':
                            str47 = bf.h(parcel, readInt18);
                            break;
                        case '\t':
                            str48 = bf.h(parcel, readInt18);
                            break;
                        case '\n':
                            bool2 = bf.o(parcel, readInt18);
                            break;
                        case 11:
                            bool3 = bf.o(parcel, readInt18);
                            break;
                        default:
                            bf.y(parcel, readInt18);
                            break;
                    }
                }
                bf.m(parcel, z38);
                return new d(str44, str45, arrayList10, str46, uri, str47, str48, bool2, bool3);
            case 18:
                int z39 = bf.z(parcel);
                k kVar = null;
                String str49 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        kVar = (k) bf.g(parcel, readInt19, k.CREATOR);
                    } else if (c19 != 3) {
                        bf.y(parcel, readInt19);
                    } else {
                        str49 = bf.h(parcel, readInt19);
                    }
                }
                bf.m(parcel, z39);
                Pattern pattern4 = h6.a.a;
                if (str49 != null) {
                    try {
                        jSONObject4 = new JSONObject(str49);
                    } catch (JSONException unused4) {
                    }
                }
                return new r(kVar, jSONObject4);
            case 19:
                int z40 = bf.z(parcel);
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
                String str50 = null;
                String str51 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            f12 = bf.r(parcel, readInt20);
                            break;
                        case 3:
                            i26 = bf.u(parcel, readInt20);
                            break;
                        case 4:
                            i27 = bf.u(parcel, readInt20);
                            break;
                        case 5:
                            i28 = bf.u(parcel, readInt20);
                            break;
                        case 6:
                            i29 = bf.u(parcel, readInt20);
                            break;
                        case 7:
                            i30 = bf.u(parcel, readInt20);
                            break;
                        case '\b':
                            i31 = bf.u(parcel, readInt20);
                            break;
                        case '\t':
                            i32 = bf.u(parcel, readInt20);
                            break;
                        case '\n':
                            str50 = bf.h(parcel, readInt20);
                            break;
                        case 11:
                            i33 = bf.u(parcel, readInt20);
                            break;
                        case '\f':
                            i34 = bf.u(parcel, readInt20);
                            break;
                        case '\r':
                            str51 = bf.h(parcel, readInt20);
                            break;
                        default:
                            bf.y(parcel, readInt20);
                            break;
                    }
                }
                bf.m(parcel, z40);
                return new s(f12, i26, i27, i28, i29, i30, i31, i32, str50, i33, i34, str51);
            case 20:
                int z41 = bf.z(parcel);
                String str52 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c20 = (char) readInt21;
                    if (c20 == 2) {
                        str2 = bf.h(parcel, readInt21);
                    } else if (c20 != 3) {
                        bf.y(parcel, readInt21);
                    } else {
                        str52 = bf.h(parcel, readInt21);
                    }
                }
                bf.m(parcel, z41);
                return new t(str2, str52);
            case 21:
                int z42 = bf.z(parcel);
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    char c21 = (char) readInt22;
                    if (c21 == 2) {
                        i10 = bf.u(parcel, readInt22);
                    } else if (c21 == 3) {
                        i35 = bf.u(parcel, readInt22);
                    } else if (c21 != 4) {
                        bf.y(parcel, readInt22);
                    } else {
                        i36 = bf.u(parcel, readInt22);
                    }
                }
                bf.m(parcel, z42);
                return new u(i10, i35, i36);
            default:
                int z43 = bf.z(parcel);
                int i37 = -1;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
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
                h6.x xVar = null;
                Integer num2 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str53 = bf.h(parcel, readInt23);
                            break;
                        case 3:
                            str54 = bf.h(parcel, readInt23);
                            break;
                        case 4:
                            str55 = bf.h(parcel, readInt23);
                            break;
                        case 5:
                            str56 = bf.h(parcel, readInt23);
                            break;
                        case 6:
                            str57 = bf.h(parcel, readInt23);
                            break;
                        case 7:
                            i38 = bf.u(parcel, readInt23);
                            break;
                        case '\b':
                            arrayList11 = bf.l(parcel, readInt23, n6.a.CREATOR);
                            break;
                        case '\t':
                            i39 = bf.u(parcel, readInt23);
                            break;
                        case '\n':
                            i37 = bf.u(parcel, readInt23);
                            break;
                        case 11:
                            str58 = bf.h(parcel, readInt23);
                            break;
                        case '\f':
                            str59 = bf.h(parcel, readInt23);
                            break;
                        case '\r':
                            i40 = bf.u(parcel, readInt23);
                            break;
                        case 14:
                            str60 = bf.h(parcel, readInt23);
                            break;
                        case 15:
                            bArr = bf.b(parcel, readInt23);
                            break;
                        case 16:
                            str61 = bf.h(parcel, readInt23);
                            break;
                        case 17:
                            z44 = bf.n(parcel, readInt23);
                            break;
                        case 18:
                            xVar = (h6.x) bf.g(parcel, readInt23, h6.x.CREATOR);
                            break;
                        case 19:
                            num2 = bf.v(parcel, readInt23);
                            break;
                        default:
                            bf.y(parcel, readInt23);
                            break;
                    }
                }
                bf.m(parcel, z43);
                return new CastDevice(str53, str54, str55, str56, str57, i38, arrayList11, i39, i37, str58, str59, i40, str60, bArr, str61, z44, xVar, num2);
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
