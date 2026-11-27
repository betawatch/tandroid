// default package

import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.identity.intents.model.UserAddress;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ced implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ced(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        fjd fjdVar = null;
        ArrayList arrayList = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        fed fedVar = null;
        String str12 = null;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int z5 = aye.z(parcel);
                String str13 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str = aye.h(parcel, readInt);
                    } else if (c != 2) {
                        aye.y(parcel, readInt);
                    } else {
                        str13 = aye.h(parcel, readInt);
                    }
                }
                aye.m(parcel, z5);
                return new f33(str, str13);
            case 1:
                try {
                    return ay8.a(parcel.readString());
                } catch (zx8 e) {
                    grb.m(e);
                    return null;
                }
            case 2:
                int z6 = aye.z(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < z6) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 2) {
                        bArr = aye.b(parcel, readInt2);
                    } else if (c2 == 3) {
                        str14 = aye.h(parcel, readInt2);
                    } else if (c2 == 4) {
                        str15 = aye.h(parcel, readInt2);
                    } else if (c2 != 5) {
                        aye.y(parcel, readInt2);
                    } else {
                        str16 = aye.h(parcel, readInt2);
                    }
                }
                aye.m(parcel, z6);
                return new by8(str14, bArr, str15, str16);
            case 3:
                int z7 = aye.z(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 2) {
                        f = aye.r(parcel, readInt3);
                    } else if (c3 == 3) {
                        f2 = aye.r(parcel, readInt3);
                    } else if (c3 != 4) {
                        aye.y(parcel, readInt3);
                    } else {
                        f3 = aye.r(parcel, readInt3);
                    }
                }
                aye.m(parcel, z7);
                return new fed(f, f2, f3);
            case 4:
                int z8 = aye.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 2) {
                        str12 = aye.h(parcel, readInt4);
                    } else if (c4 != 3) {
                        aye.y(parcel, readInt4);
                    } else {
                        bundle = aye.a(parcel, readInt4);
                    }
                }
                aye.m(parcel, z8);
                led ledVar = new led();
                ledVar.a = str12;
                ledVar.b = bundle;
                return ledVar;
            case 5:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return pd9.a(readString);
                } catch (od9 e2) {
                    grb.m(e2);
                    return null;
                }
            case 6:
                int z9 = aye.z(parcel);
                fed fedVar2 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 2) {
                        fedVar = (fed) aye.g(parcel, readInt5, fed.CREATOR);
                    } else if (c5 != 3) {
                        aye.y(parcel, readInt5);
                    } else {
                        fedVar2 = (fed) aye.g(parcel, readInt5, fed.CREATOR);
                    }
                }
                aye.m(parcel, z9);
                return new ued(fedVar, fedVar2);
            case 7:
                int z10 = aye.z(parcel);
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        aye.y(parcel, readInt6);
                    } else {
                        str11 = aye.h(parcel, readInt6);
                    }
                }
                aye.m(parcel, z10);
                return new afd(str11);
            case 8:
                try {
                    return ytb.a(parcel.readString());
                } catch (ztb e3) {
                    grb.m(e3);
                    return null;
                }
            case 9:
                int z11 = aye.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        str10 = aye.h(parcel, readInt7);
                    } else if (c6 != 3) {
                        aye.y(parcel, readInt7);
                    } else {
                        str17 = aye.h(parcel, readInt7);
                    }
                }
                aye.m(parcel, z11);
                return new aub(str10, str17);
            case 10:
                try {
                    return ey.a(parcel.readString());
                } catch (dy e4) {
                    grb.m(e4);
                    return null;
                }
            case 11:
                int z12 = aye.z(parcel);
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt8 = parcel.readInt();
                    boolean z13 = z;
                    switch ((char) readInt8) {
                        case 2:
                            str9 = aye.h(parcel, readInt8);
                            break;
                        case 3:
                            str18 = aye.h(parcel, readInt8);
                            break;
                        case 4:
                            str19 = aye.h(parcel, readInt8);
                            break;
                        case 5:
                            str20 = aye.h(parcel, readInt8);
                            break;
                        case 6:
                            str21 = aye.h(parcel, readInt8);
                            break;
                        case 7:
                            str22 = aye.h(parcel, readInt8);
                            break;
                        case '\b':
                            str23 = aye.h(parcel, readInt8);
                            break;
                        case '\t':
                            str24 = aye.h(parcel, readInt8);
                            break;
                        case '\n':
                            str25 = aye.h(parcel, readInt8);
                            break;
                        case 11:
                            str26 = aye.h(parcel, readInt8);
                            break;
                        case '\f':
                            str27 = aye.h(parcel, readInt8);
                            break;
                        case '\r':
                            str28 = aye.h(parcel, readInt8);
                            break;
                        case 14:
                            z = aye.n(parcel, readInt8);
                            continue;
                        case 15:
                            str29 = aye.h(parcel, readInt8);
                            break;
                        case 16:
                            str30 = aye.h(parcel, readInt8);
                            break;
                        default:
                            aye.y(parcel, readInt8);
                            break;
                    }
                    z = z13;
                }
                aye.m(parcel, z12);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str9;
                userAddress.b = str18;
                userAddress.c = str19;
                userAddress.d = str20;
                userAddress.e = str21;
                userAddress.f = str22;
                userAddress.h = str23;
                userAddress.n = str24;
                userAddress.r = str25;
                userAddress.s = str26;
                userAddress.w = str27;
                userAddress.x = str28;
                userAddress.y = z;
                userAddress.E = str29;
                userAddress.F = str30;
                return userAddress;
            case 12:
                int z14 = aye.z(parcel);
                String str31 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        str8 = aye.h(parcel, readInt9);
                    } else if (c7 != 2) {
                        aye.y(parcel, readInt9);
                    } else {
                        str31 = aye.h(parcel, readInt9);
                    }
                }
                aye.m(parcel, z14);
                m54 m54Var = new m54();
                m54Var.a = str8;
                m54Var.b = str31;
                return m54Var;
            case 13:
                int z15 = aye.z(parcel);
                while (parcel.dataPosition() < z15) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        aye.y(parcel, readInt10);
                    } else {
                        str7 = aye.h(parcel, readInt10);
                    }
                }
                aye.m(parcel, z15);
                return new l9d(str7);
            case 14:
                int z16 = aye.z(parcel);
                int i5 = 0;
                boolean z17 = false;
                String str32 = null;
                Point[] pointArr = null;
                se0 se0Var = null;
                ve0 ve0Var = null;
                we0 we0Var = null;
                ye0 ye0Var = null;
                xe0 xe0Var = null;
                te0 te0Var = null;
                byte[] bArr2 = null;
                qe0 qe0Var = null;
                pe0 pe0Var = null;
                re0 re0Var = null;
                while (parcel.dataPosition() < z16) {
                    int readInt11 = parcel.readInt();
                    te0 te0Var2 = te0Var;
                    switch ((char) readInt11) {
                        case 2:
                            i4 = aye.u(parcel, readInt11);
                            break;
                        case 3:
                            str6 = aye.h(parcel, readInt11);
                            break;
                        case 4:
                            str32 = aye.h(parcel, readInt11);
                            break;
                        case 5:
                            i5 = aye.u(parcel, readInt11);
                            break;
                        case 6:
                            pointArr = (Point[]) aye.k(parcel, readInt11, Point.CREATOR);
                            break;
                        case 7:
                            se0Var = (se0) aye.g(parcel, readInt11, se0.CREATOR);
                            break;
                        case '\b':
                            ve0Var = (ve0) aye.g(parcel, readInt11, ve0.CREATOR);
                            break;
                        case '\t':
                            we0Var = (we0) aye.g(parcel, readInt11, we0.CREATOR);
                            break;
                        case '\n':
                            ye0Var = (ye0) aye.g(parcel, readInt11, ye0.CREATOR);
                            break;
                        case 11:
                            xe0Var = (xe0) aye.g(parcel, readInt11, xe0.CREATOR);
                            break;
                        case '\f':
                            te0Var = (te0) aye.g(parcel, readInt11, te0.CREATOR);
                            continue;
                        case '\r':
                            pe0Var = (pe0) aye.g(parcel, readInt11, pe0.CREATOR);
                            break;
                        case 14:
                            qe0Var = (qe0) aye.g(parcel, readInt11, qe0.CREATOR);
                            break;
                        case 15:
                            re0Var = (re0) aye.g(parcel, readInt11, re0.CREATOR);
                            break;
                        case 16:
                            bArr2 = aye.b(parcel, readInt11);
                            break;
                        case 17:
                            z17 = aye.n(parcel, readInt11);
                            break;
                        default:
                            aye.y(parcel, readInt11);
                            break;
                    }
                    te0Var = te0Var2;
                }
                aye.m(parcel, z16);
                ze0 ze0Var = new ze0();
                ze0Var.a = i4;
                ze0Var.b = str6;
                ze0Var.F = bArr2;
                ze0Var.c = str32;
                ze0Var.d = i5;
                ze0Var.e = pointArr;
                ze0Var.G = z17;
                ze0Var.f = se0Var;
                ze0Var.h = ve0Var;
                ze0Var.n = we0Var;
                ze0Var.r = ye0Var;
                ze0Var.s = xe0Var;
                ze0Var.w = te0Var;
                ze0Var.x = pe0Var;
                ze0Var.y = qe0Var;
                ze0Var.E = re0Var;
                return ze0Var;
            case 15:
                int z18 = aye.z(parcel);
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            str5 = aye.h(parcel, readInt12);
                            break;
                        case 3:
                            str33 = aye.h(parcel, readInt12);
                            break;
                        case 4:
                            str34 = aye.h(parcel, readInt12);
                            break;
                        case 5:
                            str35 = aye.h(parcel, readInt12);
                            break;
                        case 6:
                            str36 = aye.h(parcel, readInt12);
                            break;
                        case 7:
                            str37 = aye.h(parcel, readInt12);
                            break;
                        case '\b':
                            str38 = aye.h(parcel, readInt12);
                            break;
                        case '\t':
                            str39 = aye.h(parcel, readInt12);
                            break;
                        case '\n':
                            str40 = aye.h(parcel, readInt12);
                            break;
                        case 11:
                            z4 = aye.n(parcel, readInt12);
                            break;
                        case '\f':
                            str41 = aye.h(parcel, readInt12);
                            break;
                        default:
                            aye.y(parcel, readInt12);
                            break;
                    }
                }
                aye.m(parcel, z18);
                o9d o9dVar = new o9d();
                o9dVar.a = str5;
                o9dVar.b = str33;
                o9dVar.c = str34;
                o9dVar.d = str35;
                o9dVar.e = str36;
                o9dVar.f = str37;
                o9dVar.h = str38;
                o9dVar.n = str39;
                o9dVar.r = str40;
                o9dVar.s = z4;
                o9dVar.w = str41;
                return o9dVar;
            case 16:
                int z19 = aye.z(parcel);
                while (parcel.dataPosition() < z19) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        aye.y(parcel, readInt13);
                    } else {
                        str4 = aye.h(parcel, readInt13);
                    }
                }
                aye.m(parcel, z19);
                return new t9d(str4);
            case 17:
                return new yrd(parcel.readStrongBinder());
            case 18:
                int z20 = aye.z(parcel);
                long j = -1;
                int i6 = 0;
                boolean z21 = false;
                String str42 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt14 = parcel.readInt();
                    char c8 = (char) readInt14;
                    if (c8 == 1) {
                        str42 = aye.h(parcel, readInt14);
                    } else if (c8 == 2) {
                        i6 = aye.u(parcel, readInt14);
                    } else if (c8 == 3) {
                        j = aye.w(parcel, readInt14);
                    } else if (c8 != 4) {
                        aye.y(parcel, readInt14);
                    } else {
                        z21 = aye.n(parcel, readInt14);
                    }
                }
                aye.m(parcel, z20);
                return new a94(str42, i6, j, z21);
            case 19:
                int z22 = aye.z(parcel);
                long j2 = 0;
                long j3 = 0;
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                String str43 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z22) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            j2 = aye.w(parcel, readInt15);
                            break;
                        case 3:
                            str43 = aye.h(parcel, readInt15);
                            break;
                        case 4:
                            j3 = aye.w(parcel, readInt15);
                            break;
                        case 5:
                            z23 = aye.n(parcel, readInt15);
                            break;
                        case 6:
                            strArr = aye.i(parcel, readInt15);
                            break;
                        case 7:
                            z24 = aye.n(parcel, readInt15);
                            break;
                        case '\b':
                            z25 = aye.n(parcel, readInt15);
                            break;
                        default:
                            aye.y(parcel, readInt15);
                            break;
                    }
                }
                aye.m(parcel, z22);
                return new aa(j2, str43, j3, z23, strArr, z24, z25);
            case 20:
                int z26 = aye.z(parcel);
                while (parcel.dataPosition() < z26) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        aye.y(parcel, readInt16);
                    } else {
                        z3 = aye.n(parcel, readInt16);
                    }
                }
                aye.m(parcel, z26);
                return new tbc(z3);
            case 21:
                try {
                    return ubc.a(parcel.readString());
                } catch (xgd e5) {
                    grb.m(e5);
                    return null;
                }
            case 22:
                int z27 = aye.z(parcel);
                while (parcel.dataPosition() < z27) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        aye.y(parcel, readInt17);
                    } else {
                        arrayList = aye.l(parcel, readInt17, xcc.CREATOR);
                    }
                }
                aye.m(parcel, z27);
                return new wcc(arrayList);
            case 23:
                int z28 = aye.z(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt18 = parcel.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 1) {
                        i3 = aye.u(parcel, readInt18);
                    } else if (c9 == 2) {
                        aye.A(parcel, readInt18, 4);
                        s = (short) parcel.readInt();
                    } else if (c9 != 3) {
                        aye.y(parcel, readInt18);
                    } else {
                        aye.A(parcel, readInt18, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                aye.m(parcel, z28);
                return new xcc(i3, s, s2);
            case 24:
                int z29 = aye.z(parcel);
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 2) {
                        fjdVar = (fjd) aye.g(parcel, readInt19, fjd.CREATOR);
                    } else if (c10 == 3) {
                        i2 = aye.u(parcel, readInt19);
                    } else if (c10 == 4) {
                        i7 = aye.u(parcel, readInt19);
                    } else if (c10 != 5) {
                        aye.y(parcel, readInt19);
                    } else {
                        i8 = aye.u(parcel, readInt19);
                    }
                }
                aye.m(parcel, z29);
                return new mhd(fjdVar, i2, i7, i8);
            case 25:
                int z30 = aye.z(parcel);
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt20 = parcel.readInt();
                    char c11 = (char) readInt20;
                    if (c11 == 2) {
                        str3 = aye.h(parcel, readInt20);
                    } else if (c11 == 3) {
                        str44 = aye.h(parcel, readInt20);
                    } else if (c11 != 4) {
                        aye.y(parcel, readInt20);
                    } else {
                        str45 = aye.h(parcel, readInt20);
                    }
                }
                aye.m(parcel, z30);
                return new fjd(str3, str44, str45);
            case 26:
                int z31 = aye.z(parcel);
                boolean z32 = false;
                f33 f33Var = null;
                while (parcel.dataPosition() < z31) {
                    int readInt21 = parcel.readInt();
                    char c12 = (char) readInt21;
                    if (c12 == 2) {
                        z2 = aye.n(parcel, readInt21);
                    } else if (c12 == 3) {
                        str2 = aye.h(parcel, readInt21);
                    } else if (c12 == 4) {
                        z32 = aye.n(parcel, readInt21);
                    } else if (c12 != 5) {
                        aye.y(parcel, readInt21);
                    } else {
                        f33Var = (f33) aye.g(parcel, readInt21, f33.CREATOR);
                    }
                }
                aye.m(parcel, z31);
                return new f26(z2, str2, z32, f33Var);
            case 27:
                int z33 = aye.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 2) {
                        aye.y(parcel, readInt22);
                    } else {
                        i = aye.u(parcel, readInt22);
                    }
                }
                aye.m(parcel, z33);
                return new jkd(i);
            case 28:
                int z34 = aye.z(parcel);
                long j4 = 0;
                String str46 = null;
                String str47 = null;
                Integer num = null;
                String str48 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt23 = parcel.readInt();
                    char c13 = (char) readInt23;
                    if (c13 == 2) {
                        str47 = aye.h(parcel, readInt23);
                    } else if (c13 == 3) {
                        j4 = aye.w(parcel, readInt23);
                    } else if (c13 == 4) {
                        num = aye.v(parcel, readInt23);
                    } else if (c13 == 5) {
                        str48 = aye.h(parcel, readInt23);
                    } else if (c13 != 6) {
                        aye.y(parcel, readInt23);
                    } else {
                        str46 = aye.h(parcel, readInt23);
                    }
                }
                aye.m(parcel, z34);
                Pattern pattern = qd1.a;
                if (str46 != null) {
                    try {
                        jSONObject = new JSONObject(str46);
                    } catch (JSONException unused) {
                    }
                    return new MediaError(str47, j4, num, str48, jSONObject);
                }
                jSONObject = null;
                return new MediaError(str47, j4, num, str48, jSONObject);
            default:
                int z35 = aye.z(parcel);
                long j5 = 0;
                long j6 = 0;
                int i9 = 0;
                String str49 = null;
                String str50 = null;
                mt6 mt6Var = null;
                ArrayList arrayList2 = null;
                tmb tmbVar = null;
                String str51 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                String str52 = null;
                ddc ddcVar = null;
                String str53 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            str49 = aye.h(parcel, readInt24);
                            break;
                        case 3:
                            i9 = aye.u(parcel, readInt24);
                            break;
                        case 4:
                            str50 = aye.h(parcel, readInt24);
                            break;
                        case 5:
                            mt6Var = (mt6) aye.g(parcel, readInt24, mt6.CREATOR);
                            break;
                        case 6:
                            j5 = aye.w(parcel, readInt24);
                            break;
                        case 7:
                            arrayList2 = aye.l(parcel, readInt24, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            tmbVar = (tmb) aye.g(parcel, readInt24, tmb.CREATOR);
                            break;
                        case '\t':
                            str51 = aye.h(parcel, readInt24);
                            break;
                        case '\n':
                            arrayList3 = aye.l(parcel, readInt24, aa.CREATOR);
                            break;
                        case 11:
                            arrayList4 = aye.l(parcel, readInt24, z9.CREATOR);
                            break;
                        case '\f':
                            str52 = aye.h(parcel, readInt24);
                            break;
                        case '\r':
                            ddcVar = (ddc) aye.g(parcel, readInt24, ddc.CREATOR);
                            break;
                        case 14:
                            j6 = aye.w(parcel, readInt24);
                            break;
                        case 15:
                            str53 = aye.h(parcel, readInt24);
                            break;
                        case 16:
                            str54 = aye.h(parcel, readInt24);
                            break;
                        case 17:
                            str55 = aye.h(parcel, readInt24);
                            break;
                        case 18:
                            str56 = aye.h(parcel, readInt24);
                            break;
                        default:
                            aye.y(parcel, readInt24);
                            break;
                    }
                }
                aye.m(parcel, z35);
                return new MediaInfo(str49, i9, str50, mt6Var, j5, arrayList2, tmbVar, str51, arrayList3, arrayList4, str52, ddcVar, j6, str53, str54, str55, str56);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f33[i];
            case 1:
                return new ay8[i];
            case 2:
                return new by8[i];
            case 3:
                return new fed[i];
            case 4:
                return new led[i];
            case 5:
                return new pd9[i];
            case 6:
                return new ued[i];
            case 7:
                return new afd[i];
            case 8:
                return new ytb[i];
            case 9:
                return new aub[i];
            case 10:
                return new ey[i];
            case 11:
                return new UserAddress[i];
            case 12:
                return new m54[i];
            case 13:
                return new l9d[i];
            case 14:
                return new ze0[i];
            case 15:
                return new o9d[i];
            case 16:
                return new t9d[i];
            case 17:
                return new yrd[i];
            case 18:
                return new a94[i];
            case 19:
                return new aa[i];
            case 20:
                return new tbc[i];
            case 21:
                return new ubc[i];
            case 22:
                return new wcc[i];
            case 23:
                return new xcc[i];
            case 24:
                return new mhd[i];
            case 25:
                return new fjd[i];
            case 26:
                return new f26[i];
            case 27:
                return new jkd[i];
            case 28:
                return new MediaError[i];
            default:
                return new MediaInfo[i];
        }
    }
}
