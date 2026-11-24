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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j9d implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ j9d(byte b) {
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
        oed oedVar = null;
        ArrayList arrayList = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        m9d m9dVar = null;
        String str12 = null;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int z5 = gte.z(parcel);
                String str13 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str = gte.h(parcel, readInt);
                    } else if (c != 2) {
                        gte.y(parcel, readInt);
                    } else {
                        str13 = gte.h(parcel, readInt);
                    }
                }
                gte.m(parcel, z5);
                return new n23(str, str13);
            case 1:
                try {
                    return ru8.a(parcel.readString());
                } catch (qu8 e) {
                    sdb.b(e);
                    return null;
                }
            case 2:
                int z6 = gte.z(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < z6) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 2) {
                        bArr = gte.b(parcel, readInt2);
                    } else if (c2 == 3) {
                        str14 = gte.h(parcel, readInt2);
                    } else if (c2 == 4) {
                        str15 = gte.h(parcel, readInt2);
                    } else if (c2 != 5) {
                        gte.y(parcel, readInt2);
                    } else {
                        str16 = gte.h(parcel, readInt2);
                    }
                }
                gte.m(parcel, z6);
                return new su8(str14, bArr, str15, str16);
            case 3:
                int z7 = gte.z(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 2) {
                        f = gte.r(parcel, readInt3);
                    } else if (c3 == 3) {
                        f2 = gte.r(parcel, readInt3);
                    } else if (c3 != 4) {
                        gte.y(parcel, readInt3);
                    } else {
                        f3 = gte.r(parcel, readInt3);
                    }
                }
                gte.m(parcel, z7);
                return new m9d(f, f2, f3);
            case 4:
                int z8 = gte.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 2) {
                        str12 = gte.h(parcel, readInt4);
                    } else if (c4 != 3) {
                        gte.y(parcel, readInt4);
                    } else {
                        bundle = gte.a(parcel, readInt4);
                    }
                }
                gte.m(parcel, z8);
                s9d s9dVar = new s9d();
                s9dVar.a = str12;
                s9dVar.b = bundle;
                return s9dVar;
            case 5:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return ba9.a(readString);
                } catch (aa9 e2) {
                    sdb.b(e2);
                    return null;
                }
            case 6:
                int z9 = gte.z(parcel);
                m9d m9dVar2 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 2) {
                        m9dVar = (m9d) gte.g(parcel, readInt5, m9d.CREATOR);
                    } else if (c5 != 3) {
                        gte.y(parcel, readInt5);
                    } else {
                        m9dVar2 = (m9d) gte.g(parcel, readInt5, m9d.CREATOR);
                    }
                }
                gte.m(parcel, z9);
                return new bad(m9dVar, m9dVar2);
            case 7:
                int z10 = gte.z(parcel);
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        gte.y(parcel, readInt6);
                    } else {
                        str11 = gte.h(parcel, readInt6);
                    }
                }
                gte.m(parcel, z10);
                return new had(str11);
            case 8:
                try {
                    return xpb.a(parcel.readString());
                } catch (ypb e3) {
                    sdb.b(e3);
                    return null;
                }
            case 9:
                int z11 = gte.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        str10 = gte.h(parcel, readInt7);
                    } else if (c6 != 3) {
                        gte.y(parcel, readInt7);
                    } else {
                        str17 = gte.h(parcel, readInt7);
                    }
                }
                gte.m(parcel, z11);
                return new zpb(str10, str17);
            case 10:
                try {
                    return dy.a(parcel.readString());
                } catch (cy e4) {
                    sdb.b(e4);
                    return null;
                }
            case 11:
                int z12 = gte.z(parcel);
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
                            str9 = gte.h(parcel, readInt8);
                            break;
                        case 3:
                            str18 = gte.h(parcel, readInt8);
                            break;
                        case 4:
                            str19 = gte.h(parcel, readInt8);
                            break;
                        case 5:
                            str20 = gte.h(parcel, readInt8);
                            break;
                        case 6:
                            str21 = gte.h(parcel, readInt8);
                            break;
                        case 7:
                            str22 = gte.h(parcel, readInt8);
                            break;
                        case '\b':
                            str23 = gte.h(parcel, readInt8);
                            break;
                        case '\t':
                            str24 = gte.h(parcel, readInt8);
                            break;
                        case '\n':
                            str25 = gte.h(parcel, readInt8);
                            break;
                        case 11:
                            str26 = gte.h(parcel, readInt8);
                            break;
                        case '\f':
                            str27 = gte.h(parcel, readInt8);
                            break;
                        case '\r':
                            str28 = gte.h(parcel, readInt8);
                            break;
                        case 14:
                            z = gte.n(parcel, readInt8);
                            continue;
                        case 15:
                            str29 = gte.h(parcel, readInt8);
                            break;
                        case 16:
                            str30 = gte.h(parcel, readInt8);
                            break;
                        default:
                            gte.y(parcel, readInt8);
                            break;
                    }
                    z = z13;
                }
                gte.m(parcel, z12);
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
                int z14 = gte.z(parcel);
                String str31 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        str8 = gte.h(parcel, readInt9);
                    } else if (c7 != 2) {
                        gte.y(parcel, readInt9);
                    } else {
                        str31 = gte.h(parcel, readInt9);
                    }
                }
                gte.m(parcel, z14);
                q44 q44Var = new q44();
                q44Var.a = str8;
                q44Var.b = str31;
                return q44Var;
            case 13:
                int z15 = gte.z(parcel);
                while (parcel.dataPosition() < z15) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        gte.y(parcel, readInt10);
                    } else {
                        str7 = gte.h(parcel, readInt10);
                    }
                }
                gte.m(parcel, z15);
                return new s4d(str7);
            case 14:
                int z16 = gte.z(parcel);
                int i5 = 0;
                boolean z17 = false;
                String str32 = null;
                Point[] pointArr = null;
                qe0 qe0Var = null;
                te0 te0Var = null;
                ue0 ue0Var = null;
                we0 we0Var = null;
                ve0 ve0Var = null;
                re0 re0Var = null;
                byte[] bArr2 = null;
                oe0 oe0Var = null;
                ne0 ne0Var = null;
                pe0 pe0Var = null;
                while (parcel.dataPosition() < z16) {
                    int readInt11 = parcel.readInt();
                    re0 re0Var2 = re0Var;
                    switch ((char) readInt11) {
                        case 2:
                            i4 = gte.u(parcel, readInt11);
                            break;
                        case 3:
                            str6 = gte.h(parcel, readInt11);
                            break;
                        case 4:
                            str32 = gte.h(parcel, readInt11);
                            break;
                        case 5:
                            i5 = gte.u(parcel, readInt11);
                            break;
                        case 6:
                            pointArr = (Point[]) gte.k(parcel, readInt11, Point.CREATOR);
                            break;
                        case 7:
                            qe0Var = (qe0) gte.g(parcel, readInt11, qe0.CREATOR);
                            break;
                        case '\b':
                            te0Var = (te0) gte.g(parcel, readInt11, te0.CREATOR);
                            break;
                        case '\t':
                            ue0Var = (ue0) gte.g(parcel, readInt11, ue0.CREATOR);
                            break;
                        case '\n':
                            we0Var = (we0) gte.g(parcel, readInt11, we0.CREATOR);
                            break;
                        case 11:
                            ve0Var = (ve0) gte.g(parcel, readInt11, ve0.CREATOR);
                            break;
                        case '\f':
                            re0Var = (re0) gte.g(parcel, readInt11, re0.CREATOR);
                            continue;
                        case '\r':
                            ne0Var = (ne0) gte.g(parcel, readInt11, ne0.CREATOR);
                            break;
                        case 14:
                            oe0Var = (oe0) gte.g(parcel, readInt11, oe0.CREATOR);
                            break;
                        case 15:
                            pe0Var = (pe0) gte.g(parcel, readInt11, pe0.CREATOR);
                            break;
                        case 16:
                            bArr2 = gte.b(parcel, readInt11);
                            break;
                        case 17:
                            z17 = gte.n(parcel, readInt11);
                            break;
                        default:
                            gte.y(parcel, readInt11);
                            break;
                    }
                    re0Var = re0Var2;
                }
                gte.m(parcel, z16);
                xe0 xe0Var = new xe0();
                xe0Var.a = i4;
                xe0Var.b = str6;
                xe0Var.F = bArr2;
                xe0Var.c = str32;
                xe0Var.d = i5;
                xe0Var.e = pointArr;
                xe0Var.G = z17;
                xe0Var.f = qe0Var;
                xe0Var.h = te0Var;
                xe0Var.n = ue0Var;
                xe0Var.r = we0Var;
                xe0Var.s = ve0Var;
                xe0Var.w = re0Var;
                xe0Var.x = ne0Var;
                xe0Var.y = oe0Var;
                xe0Var.E = pe0Var;
                return xe0Var;
            case 15:
                int z18 = gte.z(parcel);
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
                            str5 = gte.h(parcel, readInt12);
                            break;
                        case 3:
                            str33 = gte.h(parcel, readInt12);
                            break;
                        case 4:
                            str34 = gte.h(parcel, readInt12);
                            break;
                        case 5:
                            str35 = gte.h(parcel, readInt12);
                            break;
                        case 6:
                            str36 = gte.h(parcel, readInt12);
                            break;
                        case 7:
                            str37 = gte.h(parcel, readInt12);
                            break;
                        case '\b':
                            str38 = gte.h(parcel, readInt12);
                            break;
                        case '\t':
                            str39 = gte.h(parcel, readInt12);
                            break;
                        case '\n':
                            str40 = gte.h(parcel, readInt12);
                            break;
                        case 11:
                            z4 = gte.n(parcel, readInt12);
                            break;
                        case '\f':
                            str41 = gte.h(parcel, readInt12);
                            break;
                        default:
                            gte.y(parcel, readInt12);
                            break;
                    }
                }
                gte.m(parcel, z18);
                v4d v4dVar = new v4d();
                v4dVar.a = str5;
                v4dVar.b = str33;
                v4dVar.c = str34;
                v4dVar.d = str35;
                v4dVar.e = str36;
                v4dVar.f = str37;
                v4dVar.h = str38;
                v4dVar.n = str39;
                v4dVar.r = str40;
                v4dVar.s = z4;
                v4dVar.w = str41;
                return v4dVar;
            case 16:
                int z19 = gte.z(parcel);
                while (parcel.dataPosition() < z19) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        gte.y(parcel, readInt13);
                    } else {
                        str4 = gte.h(parcel, readInt13);
                    }
                }
                gte.m(parcel, z19);
                return new a5d(str4);
            case 17:
                return new hnd(parcel.readStrongBinder());
            case 18:
                int z20 = gte.z(parcel);
                long j = -1;
                int i6 = 0;
                boolean z21 = false;
                String str42 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt14 = parcel.readInt();
                    char c8 = (char) readInt14;
                    if (c8 == 1) {
                        str42 = gte.h(parcel, readInt14);
                    } else if (c8 == 2) {
                        i6 = gte.u(parcel, readInt14);
                    } else if (c8 == 3) {
                        j = gte.w(parcel, readInt14);
                    } else if (c8 != 4) {
                        gte.y(parcel, readInt14);
                    } else {
                        z21 = gte.n(parcel, readInt14);
                    }
                }
                gte.m(parcel, z20);
                return new f84(str42, i6, j, z21);
            case 19:
                int z22 = gte.z(parcel);
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
                            j2 = gte.w(parcel, readInt15);
                            break;
                        case 3:
                            str43 = gte.h(parcel, readInt15);
                            break;
                        case 4:
                            j3 = gte.w(parcel, readInt15);
                            break;
                        case 5:
                            z23 = gte.n(parcel, readInt15);
                            break;
                        case 6:
                            strArr = gte.i(parcel, readInt15);
                            break;
                        case 7:
                            z24 = gte.n(parcel, readInt15);
                            break;
                        case '\b':
                            z25 = gte.n(parcel, readInt15);
                            break;
                        default:
                            gte.y(parcel, readInt15);
                            break;
                    }
                }
                gte.m(parcel, z22);
                return new z9(j2, str43, j3, z23, strArr, z24, z25);
            case 20:
                int z26 = gte.z(parcel);
                while (parcel.dataPosition() < z26) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        gte.y(parcel, readInt16);
                    } else {
                        z3 = gte.n(parcel, readInt16);
                    }
                }
                gte.m(parcel, z26);
                return new t7c(z3);
            case 21:
                try {
                    return u7c.a(parcel.readString());
                } catch (ecd e5) {
                    sdb.b(e5);
                    return null;
                }
            case 22:
                int z27 = gte.z(parcel);
                while (parcel.dataPosition() < z27) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        gte.y(parcel, readInt17);
                    } else {
                        arrayList = gte.l(parcel, readInt17, x8c.CREATOR);
                    }
                }
                gte.m(parcel, z27);
                return new w8c(arrayList);
            case 23:
                int z28 = gte.z(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt18 = parcel.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 1) {
                        i3 = gte.u(parcel, readInt18);
                    } else if (c9 == 2) {
                        gte.A(parcel, readInt18, 4);
                        s = (short) parcel.readInt();
                    } else if (c9 != 3) {
                        gte.y(parcel, readInt18);
                    } else {
                        gte.A(parcel, readInt18, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                gte.m(parcel, z28);
                return new x8c(i3, s, s2);
            case 24:
                int z29 = gte.z(parcel);
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 2) {
                        oedVar = (oed) gte.g(parcel, readInt19, oed.CREATOR);
                    } else if (c10 == 3) {
                        i2 = gte.u(parcel, readInt19);
                    } else if (c10 == 4) {
                        i7 = gte.u(parcel, readInt19);
                    } else if (c10 != 5) {
                        gte.y(parcel, readInt19);
                    } else {
                        i8 = gte.u(parcel, readInt19);
                    }
                }
                gte.m(parcel, z29);
                return new tcd(oedVar, i2, i7, i8);
            case 25:
                int z30 = gte.z(parcel);
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt20 = parcel.readInt();
                    char c11 = (char) readInt20;
                    if (c11 == 2) {
                        str3 = gte.h(parcel, readInt20);
                    } else if (c11 == 3) {
                        str44 = gte.h(parcel, readInt20);
                    } else if (c11 != 4) {
                        gte.y(parcel, readInt20);
                    } else {
                        str45 = gte.h(parcel, readInt20);
                    }
                }
                gte.m(parcel, z30);
                return new oed(str3, str44, str45);
            case 26:
                int z31 = gte.z(parcel);
                boolean z32 = false;
                n23 n23Var = null;
                while (parcel.dataPosition() < z31) {
                    int readInt21 = parcel.readInt();
                    char c12 = (char) readInt21;
                    if (c12 == 2) {
                        z2 = gte.n(parcel, readInt21);
                    } else if (c12 == 3) {
                        str2 = gte.h(parcel, readInt21);
                    } else if (c12 == 4) {
                        z32 = gte.n(parcel, readInt21);
                    } else if (c12 != 5) {
                        gte.y(parcel, readInt21);
                    } else {
                        n23Var = (n23) gte.g(parcel, readInt21, n23.CREATOR);
                    }
                }
                gte.m(parcel, z31);
                return new b06(z2, str2, z32, n23Var);
            case 27:
                int z33 = gte.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 2) {
                        gte.y(parcel, readInt22);
                    } else {
                        i = gte.u(parcel, readInt22);
                    }
                }
                gte.m(parcel, z33);
                return new sfd(i);
            case 28:
                int z34 = gte.z(parcel);
                long j4 = 0;
                String str46 = null;
                String str47 = null;
                Integer num = null;
                String str48 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt23 = parcel.readInt();
                    char c13 = (char) readInt23;
                    if (c13 == 2) {
                        str47 = gte.h(parcel, readInt23);
                    } else if (c13 == 3) {
                        j4 = gte.w(parcel, readInt23);
                    } else if (c13 == 4) {
                        num = gte.v(parcel, readInt23);
                    } else if (c13 == 5) {
                        str48 = gte.h(parcel, readInt23);
                    } else if (c13 != 6) {
                        gte.y(parcel, readInt23);
                    } else {
                        str46 = gte.h(parcel, readInt23);
                    }
                }
                gte.m(parcel, z34);
                Pattern pattern = id1.a;
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
                int z35 = gte.z(parcel);
                long j5 = 0;
                long j6 = 0;
                int i9 = 0;
                String str49 = null;
                String str50 = null;
                ir6 ir6Var = null;
                ArrayList arrayList2 = null;
                xib xibVar = null;
                String str51 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                String str52 = null;
                d9c d9cVar = null;
                String str53 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            str49 = gte.h(parcel, readInt24);
                            break;
                        case 3:
                            i9 = gte.u(parcel, readInt24);
                            break;
                        case 4:
                            str50 = gte.h(parcel, readInt24);
                            break;
                        case 5:
                            ir6Var = (ir6) gte.g(parcel, readInt24, ir6.CREATOR);
                            break;
                        case 6:
                            j5 = gte.w(parcel, readInt24);
                            break;
                        case 7:
                            arrayList2 = gte.l(parcel, readInt24, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            xibVar = (xib) gte.g(parcel, readInt24, xib.CREATOR);
                            break;
                        case '\t':
                            str51 = gte.h(parcel, readInt24);
                            break;
                        case '\n':
                            arrayList3 = gte.l(parcel, readInt24, z9.CREATOR);
                            break;
                        case 11:
                            arrayList4 = gte.l(parcel, readInt24, y9.CREATOR);
                            break;
                        case '\f':
                            str52 = gte.h(parcel, readInt24);
                            break;
                        case '\r':
                            d9cVar = (d9c) gte.g(parcel, readInt24, d9c.CREATOR);
                            break;
                        case 14:
                            j6 = gte.w(parcel, readInt24);
                            break;
                        case 15:
                            str53 = gte.h(parcel, readInt24);
                            break;
                        case 16:
                            str54 = gte.h(parcel, readInt24);
                            break;
                        case 17:
                            str55 = gte.h(parcel, readInt24);
                            break;
                        case 18:
                            str56 = gte.h(parcel, readInt24);
                            break;
                        default:
                            gte.y(parcel, readInt24);
                            break;
                    }
                }
                gte.m(parcel, z35);
                return new MediaInfo(str49, i9, str50, ir6Var, j5, arrayList2, xibVar, str51, arrayList3, arrayList4, str52, d9cVar, j6, str53, str54, str55, str56);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new n23[i];
            case 1:
                return new ru8[i];
            case 2:
                return new su8[i];
            case 3:
                return new m9d[i];
            case 4:
                return new s9d[i];
            case 5:
                return new ba9[i];
            case 6:
                return new bad[i];
            case 7:
                return new had[i];
            case 8:
                return new xpb[i];
            case 9:
                return new zpb[i];
            case 10:
                return new dy[i];
            case 11:
                return new UserAddress[i];
            case 12:
                return new q44[i];
            case 13:
                return new s4d[i];
            case 14:
                return new xe0[i];
            case 15:
                return new v4d[i];
            case 16:
                return new a5d[i];
            case 17:
                return new hnd[i];
            case 18:
                return new f84[i];
            case 19:
                return new z9[i];
            case 20:
                return new t7c[i];
            case 21:
                return new u7c[i];
            case 22:
                return new w8c[i];
            case 23:
                return new x8c[i];
            case 24:
                return new tcd[i];
            case 25:
                return new oed[i];
            case 26:
                return new b06[i];
            case 27:
                return new sfd[i];
            case 28:
                return new MediaError[i];
            default:
                return new MediaInfo[i];
        }
    }
}
