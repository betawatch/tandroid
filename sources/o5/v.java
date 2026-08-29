package o5;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        float f9 = 0.0f;
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
                int A = ce.b.A(parcel);
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
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str6 = ce.b.i(parcel, readInt);
                            break;
                        case 3:
                            str7 = ce.b.i(parcel, readInt);
                            break;
                        case 4:
                            j11 = ce.b.x(parcel, readInt);
                            break;
                        case 5:
                            str8 = ce.b.i(parcel, readInt);
                            break;
                        case 6:
                            str9 = ce.b.i(parcel, readInt);
                            break;
                        case 7:
                            str10 = ce.b.i(parcel, readInt);
                            break;
                        case '\b':
                            str11 = ce.b.i(parcel, readInt);
                            break;
                        case '\t':
                            str12 = ce.b.i(parcel, readInt);
                            break;
                        case '\n':
                            str13 = ce.b.i(parcel, readInt);
                            break;
                        case 11:
                            j12 = ce.b.x(parcel, readInt);
                            break;
                        case '\f':
                            str14 = ce.b.i(parcel, readInt);
                            break;
                        case '\r':
                            tVar = (t) ce.b.h(parcel, readInt, t.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt);
                            break;
                    }
                }
                ce.b.n(parcel, A);
                return new a(str6, str7, j11, str8, str9, str10, str11, str12, str13, j12, str14, tVar);
            case 1:
                int A2 = ce.b.A(parcel);
                String str15 = null;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        str = ce.b.i(parcel, readInt2);
                    } else if (c3 != 2) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        str15 = ce.b.i(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new h(str, str15);
            case 2:
                int A3 = ce.b.A(parcel);
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 2) {
                        f9 = ce.b.s(parcel, readInt3);
                    } else if (c6 == 3) {
                        f10 = ce.b.s(parcel, readInt3);
                    } else if (c6 != 4) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        f11 = ce.b.s(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new w(f9, f10, f11);
            case 3:
                int A4 = ce.b.A(parcel);
                w wVar2 = null;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 2) {
                        wVar = (w) ce.b.h(parcel, readInt4, w.CREATOR);
                    } else if (c10 != 3) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        wVar2 = (w) ce.b.h(parcel, readInt4, w.CREATOR);
                    }
                }
                ce.b.n(parcel, A4);
                return new x(wVar, wVar2);
            case 4:
                int A5 = ce.b.A(parcel);
                long j13 = 0;
                long j14 = 0;
                String str16 = null;
                String[] strArr = null;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            j13 = ce.b.x(parcel, readInt5);
                            break;
                        case 3:
                            str16 = ce.b.i(parcel, readInt5);
                            break;
                        case 4:
                            j14 = ce.b.x(parcel, readInt5);
                            break;
                        case 5:
                            z11 = ce.b.o(parcel, readInt5);
                            break;
                        case 6:
                            strArr = ce.b.j(parcel, readInt5);
                            break;
                        case 7:
                            z12 = ce.b.o(parcel, readInt5);
                            break;
                        case '\b':
                            z13 = ce.b.o(parcel, readInt5);
                            break;
                        default:
                            ce.b.z(parcel, readInt5);
                            break;
                    }
                }
                ce.b.n(parcel, A5);
                return new b(j13, str16, j14, z11, strArr, z12, z13);
            case 5:
                int A6 = ce.b.A(parcel);
                h hVar = null;
                boolean z14 = false;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 2) {
                        z10 = ce.b.o(parcel, readInt6);
                    } else if (c11 == 3) {
                        str5 = ce.b.i(parcel, readInt6);
                    } else if (c11 == 4) {
                        z14 = ce.b.o(parcel, readInt6);
                    } else if (c11 != 5) {
                        ce.b.z(parcel, readInt6);
                    } else {
                        hVar = (h) ce.b.h(parcel, readInt6, h.CREATOR);
                    }
                }
                ce.b.n(parcel, A6);
                return new i(z10, str5, z14, hVar);
            case 6:
                int A7 = ce.b.A(parcel);
                long j15 = 0;
                String str17 = null;
                String str18 = null;
                Integer num = null;
                String str19 = null;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 2) {
                        str18 = ce.b.i(parcel, readInt7);
                    } else if (c12 == 3) {
                        j15 = ce.b.x(parcel, readInt7);
                    } else if (c12 == 4) {
                        num = ce.b.w(parcel, readInt7);
                    } else if (c12 == 5) {
                        str19 = ce.b.i(parcel, readInt7);
                    } else if (c12 != 6) {
                        ce.b.z(parcel, readInt7);
                    } else {
                        str17 = ce.b.i(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                Pattern pattern = s5.a.a;
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
                int A8 = ce.b.A(parcel);
                long j16 = 0;
                long j17 = 0;
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
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str20 = ce.b.i(parcel, readInt8);
                            break;
                        case 3:
                            i14 = ce.b.v(parcel, readInt8);
                            break;
                        case 4:
                            str21 = ce.b.i(parcel, readInt8);
                            break;
                        case 5:
                            lVar = (l) ce.b.h(parcel, readInt8, l.CREATOR);
                            break;
                        case 6:
                            j16 = ce.b.x(parcel, readInt8);
                            break;
                        case 7:
                            arrayList2 = ce.b.m(parcel, readInt8, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            sVar = (s) ce.b.h(parcel, readInt8, s.CREATOR);
                            break;
                        case '\t':
                            str22 = ce.b.i(parcel, readInt8);
                            break;
                        case '\n':
                            arrayList3 = ce.b.m(parcel, readInt8, b.CREATOR);
                            break;
                        case 11:
                            arrayList4 = ce.b.m(parcel, readInt8, a.CREATOR);
                            break;
                        case '\f':
                            str23 = ce.b.i(parcel, readInt8);
                            break;
                        case '\r':
                            tVar2 = (t) ce.b.h(parcel, readInt8, t.CREATOR);
                            break;
                        case 14:
                            j17 = ce.b.x(parcel, readInt8);
                            break;
                        case 15:
                            str24 = ce.b.i(parcel, readInt8);
                            break;
                        case 16:
                            str25 = ce.b.i(parcel, readInt8);
                            break;
                        case 17:
                            str26 = ce.b.i(parcel, readInt8);
                            break;
                        case 18:
                            str27 = ce.b.i(parcel, readInt8);
                            break;
                        default:
                            ce.b.z(parcel, readInt8);
                            break;
                    }
                }
                ce.b.n(parcel, A8);
                return new MediaInfo(str20, i14, str21, lVar, j16, arrayList2, sVar, str22, arrayList3, arrayList4, str23, tVar2, j17, str24, str25, str26, str27);
            case 8:
                int A9 = ce.b.A(parcel);
                long j18 = 0;
                long j19 = 0;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        j18 = ce.b.x(parcel, readInt9);
                    } else if (c13 == 3) {
                        j19 = ce.b.x(parcel, readInt9);
                    } else if (c13 == 4) {
                        z15 = ce.b.o(parcel, readInt9);
                    } else if (c13 != 5) {
                        ce.b.z(parcel, readInt9);
                    } else {
                        z16 = ce.b.o(parcel, readInt9);
                    }
                }
                ce.b.n(parcel, A9);
                return new j(j18, j19, z15, z16);
            case 9:
                int A10 = ce.b.A(parcel);
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 2) {
                        j20 = ce.b.x(parcel, readInt10);
                    } else if (c14 == 3) {
                        j21 = ce.b.x(parcel, readInt10);
                    } else if (c14 == 4) {
                        str28 = ce.b.i(parcel, readInt10);
                    } else if (c14 == 5) {
                        str29 = ce.b.i(parcel, readInt10);
                    } else if (c14 != 6) {
                        ce.b.z(parcel, readInt10);
                    } else {
                        j22 = ce.b.x(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A10);
                return new c(j20, j21, str28, str29, j22);
            case 10:
                int A11 = ce.b.A(parcel);
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
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            mediaInfo = (MediaInfo) ce.b.h(parcel, readInt11, MediaInfo.CREATOR);
                            break;
                        case 3:
                            nVar = (n) ce.b.h(parcel, readInt11, n.CREATOR);
                            break;
                        case 4:
                            bool = ce.b.p(parcel, readInt11);
                            break;
                        case 5:
                            j23 = ce.b.x(parcel, readInt11);
                            break;
                        case 6:
                            d10 = ce.b.r(parcel, readInt11);
                            break;
                        case 7:
                            jArr = ce.b.g(parcel, readInt11);
                            break;
                        case '\b':
                            str30 = ce.b.i(parcel, readInt11);
                            break;
                        case '\t':
                            str31 = ce.b.i(parcel, readInt11);
                            break;
                        case '\n':
                            str32 = ce.b.i(parcel, readInt11);
                            break;
                        case 11:
                            str33 = ce.b.i(parcel, readInt11);
                            break;
                        case '\f':
                            str34 = ce.b.i(parcel, readInt11);
                            break;
                        case '\r':
                            j24 = ce.b.x(parcel, readInt11);
                            break;
                        default:
                            ce.b.z(parcel, readInt11);
                            break;
                    }
                }
                ce.b.n(parcel, A11);
                Pattern pattern2 = s5.a.a;
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
                int A12 = ce.b.A(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 2) {
                        arrayList = ce.b.m(parcel, readInt12, y5.a.CREATOR);
                    } else if (c15 == 3) {
                        bundle = ce.b.b(parcel, readInt12);
                    } else if (c15 != 4) {
                        ce.b.z(parcel, readInt12);
                    } else {
                        i13 = ce.b.v(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A12);
                return new l(arrayList, bundle, i13);
            case 12:
                int A13 = ce.b.A(parcel);
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        i12 = ce.b.v(parcel, readInt13);
                    } else if (c16 == 3) {
                        str4 = ce.b.i(parcel, readInt13);
                    } else if (c16 == 4) {
                        arrayList5 = ce.b.m(parcel, readInt13, l.CREATOR);
                    } else if (c16 == 5) {
                        arrayList6 = ce.b.m(parcel, readInt13, y5.a.CREATOR);
                    } else if (c16 != 6) {
                        ce.b.z(parcel, readInt13);
                    } else {
                        d = ce.b.r(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A13);
                m mVar = new m();
                mVar.a = i12;
                mVar.b = str4;
                mVar.c = arrayList5;
                mVar.d = arrayList6;
                mVar.e = d;
                return mVar;
            case 13:
                int A14 = ce.b.A(parcel);
                String str35 = null;
                String str36 = null;
                m mVar2 = null;
                ArrayList arrayList7 = null;
                int i15 = 0;
                int i16 = 0;
                boolean z17 = false;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str3 = ce.b.i(parcel, readInt14);
                            break;
                        case 3:
                            str35 = ce.b.i(parcel, readInt14);
                            break;
                        case 4:
                            i11 = ce.b.v(parcel, readInt14);
                            break;
                        case 5:
                            str36 = ce.b.i(parcel, readInt14);
                            break;
                        case 6:
                            mVar2 = (m) ce.b.h(parcel, readInt14, m.CREATOR);
                            break;
                        case 7:
                            i15 = ce.b.v(parcel, readInt14);
                            break;
                        case '\b':
                            arrayList7 = ce.b.m(parcel, readInt14, o.CREATOR);
                            break;
                        case '\t':
                            i16 = ce.b.v(parcel, readInt14);
                            break;
                        case '\n':
                            j10 = ce.b.x(parcel, readInt14);
                            break;
                        case 11:
                            z17 = ce.b.o(parcel, readInt14);
                            break;
                        default:
                            ce.b.z(parcel, readInt14);
                            break;
                    }
                }
                ce.b.n(parcel, A14);
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
                nVar2.s = z17;
                return nVar2;
            case 14:
                int A15 = ce.b.A(parcel);
                double d11 = 0.0d;
                double d12 = 0.0d;
                double d13 = 0.0d;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str37 = null;
                int i17 = 0;
                boolean z18 = false;
                while (parcel.dataPosition() < A15) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            mediaInfo2 = (MediaInfo) ce.b.h(parcel, readInt15, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i17 = ce.b.v(parcel, readInt15);
                            break;
                        case 4:
                            z18 = ce.b.o(parcel, readInt15);
                            break;
                        case 5:
                            d11 = ce.b.r(parcel, readInt15);
                            break;
                        case 6:
                            d12 = ce.b.r(parcel, readInt15);
                            break;
                        case 7:
                            d13 = ce.b.r(parcel, readInt15);
                            break;
                        case '\b':
                            jArr2 = ce.b.g(parcel, readInt15);
                            break;
                        case '\t':
                            str37 = ce.b.i(parcel, readInt15);
                            break;
                        default:
                            ce.b.z(parcel, readInt15);
                            break;
                    }
                }
                ce.b.n(parcel, A15);
                return new o(mediaInfo2, i17, z18, d11, d12, d13, jArr2, str37);
            case 15:
                int A16 = ce.b.A(parcel);
                double d14 = 0.0d;
                double d15 = 0.0d;
                long j25 = 0;
                long j26 = 0;
                long j27 = 0;
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
                boolean z19 = false;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z20 = false;
                while (parcel.dataPosition() < A16) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            mediaInfo3 = (MediaInfo) ce.b.h(parcel, readInt16, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j25 = ce.b.x(parcel, readInt16);
                            break;
                        case 4:
                            i18 = ce.b.v(parcel, readInt16);
                            break;
                        case 5:
                            d14 = ce.b.r(parcel, readInt16);
                            break;
                        case 6:
                            i19 = ce.b.v(parcel, readInt16);
                            break;
                        case 7:
                            i20 = ce.b.v(parcel, readInt16);
                            break;
                        case '\b':
                            j26 = ce.b.x(parcel, readInt16);
                            break;
                        case '\t':
                            j27 = ce.b.x(parcel, readInt16);
                            break;
                        case '\n':
                            d15 = ce.b.r(parcel, readInt16);
                            break;
                        case 11:
                            z19 = ce.b.o(parcel, readInt16);
                            break;
                        case '\f':
                            jArr3 = ce.b.g(parcel, readInt16);
                            break;
                        case '\r':
                            i21 = ce.b.v(parcel, readInt16);
                            break;
                        case 14:
                            i22 = ce.b.v(parcel, readInt16);
                            break;
                        case 15:
                            str38 = ce.b.i(parcel, readInt16);
                            break;
                        case 16:
                            i23 = ce.b.v(parcel, readInt16);
                            break;
                        case 17:
                            arrayList8 = ce.b.m(parcel, readInt16, o.CREATOR);
                            break;
                        case 18:
                            z20 = ce.b.o(parcel, readInt16);
                            break;
                        case 19:
                            cVar = (c) ce.b.h(parcel, readInt16, c.CREATOR);
                            break;
                        case 20:
                            uVar = (u) ce.b.h(parcel, readInt16, u.CREATOR);
                            break;
                        case 21:
                            jVar = (j) ce.b.h(parcel, readInt16, j.CREATOR);
                            break;
                        case 22:
                            nVar3 = (n) ce.b.h(parcel, readInt16, n.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt16);
                            break;
                    }
                }
                ce.b.n(parcel, A16);
                return new q(mediaInfo3, j25, i18, d14, i19, i20, j26, j27, d15, z19, jArr3, i21, i22, str38, i23, arrayList8, z20, cVar, uVar, jVar, nVar3);
            case 16:
                int A17 = ce.b.A(parcel);
                long j28 = 0;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                ArrayList arrayList9 = null;
                int i24 = 0;
                int i25 = 0;
                while (parcel.dataPosition() < A17) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            j28 = ce.b.x(parcel, readInt17);
                            break;
                        case 3:
                            i24 = ce.b.v(parcel, readInt17);
                            break;
                        case 4:
                            str40 = ce.b.i(parcel, readInt17);
                            break;
                        case 5:
                            str41 = ce.b.i(parcel, readInt17);
                            break;
                        case 6:
                            str42 = ce.b.i(parcel, readInt17);
                            break;
                        case 7:
                            str43 = ce.b.i(parcel, readInt17);
                            break;
                        case '\b':
                            i25 = ce.b.v(parcel, readInt17);
                            break;
                        case '\t':
                            arrayList9 = ce.b.k(parcel, readInt17);
                            break;
                        case '\n':
                            str39 = ce.b.i(parcel, readInt17);
                            break;
                        default:
                            ce.b.z(parcel, readInt17);
                            break;
                    }
                }
                ce.b.n(parcel, A17);
                Pattern pattern3 = s5.a.a;
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
                int A18 = ce.b.A(parcel);
                String str44 = null;
                String str45 = null;
                ArrayList arrayList10 = null;
                String str46 = null;
                Uri uri = null;
                String str47 = null;
                String str48 = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                while (parcel.dataPosition() < A18) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            str44 = ce.b.i(parcel, readInt18);
                            break;
                        case 3:
                            str45 = ce.b.i(parcel, readInt18);
                            break;
                        case 4:
                            ce.b.m(parcel, readInt18, y5.a.CREATOR);
                            break;
                        case 5:
                            arrayList10 = ce.b.k(parcel, readInt18);
                            break;
                        case 6:
                            str46 = ce.b.i(parcel, readInt18);
                            break;
                        case 7:
                            uri = (Uri) ce.b.h(parcel, readInt18, Uri.CREATOR);
                            break;
                        case '\b':
                            str47 = ce.b.i(parcel, readInt18);
                            break;
                        case '\t':
                            str48 = ce.b.i(parcel, readInt18);
                            break;
                        case '\n':
                            bool2 = ce.b.p(parcel, readInt18);
                            break;
                        case 11:
                            bool3 = ce.b.p(parcel, readInt18);
                            break;
                        default:
                            ce.b.z(parcel, readInt18);
                            break;
                    }
                }
                ce.b.n(parcel, A18);
                return new d(str44, str45, arrayList10, str46, uri, str47, str48, bool2, bool3);
            case 18:
                int A19 = ce.b.A(parcel);
                k kVar = null;
                String str49 = null;
                while (parcel.dataPosition() < A19) {
                    int readInt19 = parcel.readInt();
                    char c17 = (char) readInt19;
                    if (c17 == 2) {
                        kVar = (k) ce.b.h(parcel, readInt19, k.CREATOR);
                    } else if (c17 != 3) {
                        ce.b.z(parcel, readInt19);
                    } else {
                        str49 = ce.b.i(parcel, readInt19);
                    }
                }
                ce.b.n(parcel, A19);
                Pattern pattern4 = s5.a.a;
                if (str49 != null) {
                    try {
                        jSONObject4 = new JSONObject(str49);
                    } catch (JSONException unused4) {
                    }
                }
                return new r(kVar, jSONObject4);
            case 19:
                int A20 = ce.b.A(parcel);
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
                while (parcel.dataPosition() < A20) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            f12 = ce.b.s(parcel, readInt20);
                            break;
                        case 3:
                            i26 = ce.b.v(parcel, readInt20);
                            break;
                        case 4:
                            i27 = ce.b.v(parcel, readInt20);
                            break;
                        case 5:
                            i28 = ce.b.v(parcel, readInt20);
                            break;
                        case 6:
                            i29 = ce.b.v(parcel, readInt20);
                            break;
                        case 7:
                            i30 = ce.b.v(parcel, readInt20);
                            break;
                        case '\b':
                            i31 = ce.b.v(parcel, readInt20);
                            break;
                        case '\t':
                            i32 = ce.b.v(parcel, readInt20);
                            break;
                        case '\n':
                            str50 = ce.b.i(parcel, readInt20);
                            break;
                        case 11:
                            i33 = ce.b.v(parcel, readInt20);
                            break;
                        case '\f':
                            i34 = ce.b.v(parcel, readInt20);
                            break;
                        case '\r':
                            str51 = ce.b.i(parcel, readInt20);
                            break;
                        default:
                            ce.b.z(parcel, readInt20);
                            break;
                    }
                }
                ce.b.n(parcel, A20);
                return new s(f12, i26, i27, i28, i29, i30, i31, i32, str50, i33, i34, str51);
            case 20:
                int A21 = ce.b.A(parcel);
                String str52 = null;
                while (parcel.dataPosition() < A21) {
                    int readInt21 = parcel.readInt();
                    char c18 = (char) readInt21;
                    if (c18 == 2) {
                        str2 = ce.b.i(parcel, readInt21);
                    } else if (c18 != 3) {
                        ce.b.z(parcel, readInt21);
                    } else {
                        str52 = ce.b.i(parcel, readInt21);
                    }
                }
                ce.b.n(parcel, A21);
                return new t(str2, str52);
            case 21:
                int A22 = ce.b.A(parcel);
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < A22) {
                    int readInt22 = parcel.readInt();
                    char c19 = (char) readInt22;
                    if (c19 == 2) {
                        i10 = ce.b.v(parcel, readInt22);
                    } else if (c19 == 3) {
                        i35 = ce.b.v(parcel, readInt22);
                    } else if (c19 != 4) {
                        ce.b.z(parcel, readInt22);
                    } else {
                        i36 = ce.b.v(parcel, readInt22);
                    }
                }
                ce.b.n(parcel, A22);
                return new u(i10, i35, i36);
            default:
                int A23 = ce.b.A(parcel);
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
                s5.y yVar = null;
                Integer num2 = null;
                int i37 = 0;
                int i38 = 0;
                int i39 = -1;
                int i40 = 0;
                boolean z21 = false;
                while (parcel.dataPosition() < A23) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str53 = ce.b.i(parcel, readInt23);
                            break;
                        case 3:
                            str54 = ce.b.i(parcel, readInt23);
                            break;
                        case 4:
                            str55 = ce.b.i(parcel, readInt23);
                            break;
                        case 5:
                            str56 = ce.b.i(parcel, readInt23);
                            break;
                        case 6:
                            str57 = ce.b.i(parcel, readInt23);
                            break;
                        case 7:
                            i37 = ce.b.v(parcel, readInt23);
                            break;
                        case '\b':
                            arrayList11 = ce.b.m(parcel, readInt23, y5.a.CREATOR);
                            break;
                        case '\t':
                            i38 = ce.b.v(parcel, readInt23);
                            break;
                        case '\n':
                            i39 = ce.b.v(parcel, readInt23);
                            break;
                        case 11:
                            str58 = ce.b.i(parcel, readInt23);
                            break;
                        case '\f':
                            str59 = ce.b.i(parcel, readInt23);
                            break;
                        case '\r':
                            i40 = ce.b.v(parcel, readInt23);
                            break;
                        case 14:
                            str60 = ce.b.i(parcel, readInt23);
                            break;
                        case 15:
                            bArr = ce.b.c(parcel, readInt23);
                            break;
                        case 16:
                            str61 = ce.b.i(parcel, readInt23);
                            break;
                        case 17:
                            z21 = ce.b.o(parcel, readInt23);
                            break;
                        case 18:
                            yVar = (s5.y) ce.b.h(parcel, readInt23, s5.y.CREATOR);
                            break;
                        case 19:
                            num2 = ce.b.w(parcel, readInt23);
                            break;
                        default:
                            ce.b.z(parcel, readInt23);
                            break;
                    }
                }
                ce.b.n(parcel, A23);
                return new CastDevice(str53, str54, str55, str56, str57, i37, arrayList11, i38, i39, str58, str59, i40, str60, bArr, str61, z21, yVar, num2);
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
