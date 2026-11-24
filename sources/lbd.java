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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lbd implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ lbd(byte b) {
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
        pgd pgdVar = null;
        ArrayList arrayList = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        obd obdVar = null;
        String str12 = null;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int z5 = jve.z(parcel);
                String str13 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str = jve.h(parcel, readInt);
                    } else if (c != 2) {
                        jve.y(parcel, readInt);
                    } else {
                        str13 = jve.h(parcel, readInt);
                    }
                }
                jve.m(parcel, z5);
                return new y33(str, str13);
            case 1:
                try {
                    return sw8.a(parcel.readString());
                } catch (rw8 e) {
                    rjb.m(e);
                    return null;
                }
            case 2:
                int z6 = jve.z(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < z6) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 2) {
                        bArr = jve.b(parcel, readInt2);
                    } else if (c2 == 3) {
                        str14 = jve.h(parcel, readInt2);
                    } else if (c2 == 4) {
                        str15 = jve.h(parcel, readInt2);
                    } else if (c2 != 5) {
                        jve.y(parcel, readInt2);
                    } else {
                        str16 = jve.h(parcel, readInt2);
                    }
                }
                jve.m(parcel, z6);
                return new tw8(str14, bArr, str15, str16);
            case 3:
                int z7 = jve.z(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 2) {
                        f = jve.r(parcel, readInt3);
                    } else if (c3 == 3) {
                        f2 = jve.r(parcel, readInt3);
                    } else if (c3 != 4) {
                        jve.y(parcel, readInt3);
                    } else {
                        f3 = jve.r(parcel, readInt3);
                    }
                }
                jve.m(parcel, z7);
                return new obd(f, f2, f3);
            case 4:
                int z8 = jve.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 2) {
                        str12 = jve.h(parcel, readInt4);
                    } else if (c4 != 3) {
                        jve.y(parcel, readInt4);
                    } else {
                        bundle = jve.a(parcel, readInt4);
                    }
                }
                jve.m(parcel, z8);
                ubd ubdVar = new ubd();
                ubdVar.a = str12;
                ubdVar.b = bundle;
                return ubdVar;
            case 5:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return bc9.a(readString);
                } catch (ac9 e2) {
                    rjb.m(e2);
                    return null;
                }
            case 6:
                int z9 = jve.z(parcel);
                obd obdVar2 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 2) {
                        obdVar = (obd) jve.g(parcel, readInt5, obd.CREATOR);
                    } else if (c5 != 3) {
                        jve.y(parcel, readInt5);
                    } else {
                        obdVar2 = (obd) jve.g(parcel, readInt5, obd.CREATOR);
                    }
                }
                jve.m(parcel, z9);
                return new dcd(obdVar, obdVar2);
            case 7:
                int z10 = jve.z(parcel);
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        jve.y(parcel, readInt6);
                    } else {
                        str11 = jve.h(parcel, readInt6);
                    }
                }
                jve.m(parcel, z10);
                return new jcd(str11);
            case 8:
                try {
                    return yrb.a(parcel.readString());
                } catch (zrb e3) {
                    rjb.m(e3);
                    return null;
                }
            case 9:
                int z11 = jve.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        str10 = jve.h(parcel, readInt7);
                    } else if (c6 != 3) {
                        jve.y(parcel, readInt7);
                    } else {
                        str17 = jve.h(parcel, readInt7);
                    }
                }
                jve.m(parcel, z11);
                return new asb(str10, str17);
            case 10:
                try {
                    return dz.a(parcel.readString());
                } catch (cz e4) {
                    rjb.m(e4);
                    return null;
                }
            case 11:
                int z12 = jve.z(parcel);
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
                            str9 = jve.h(parcel, readInt8);
                            break;
                        case 3:
                            str18 = jve.h(parcel, readInt8);
                            break;
                        case 4:
                            str19 = jve.h(parcel, readInt8);
                            break;
                        case 5:
                            str20 = jve.h(parcel, readInt8);
                            break;
                        case 6:
                            str21 = jve.h(parcel, readInt8);
                            break;
                        case 7:
                            str22 = jve.h(parcel, readInt8);
                            break;
                        case '\b':
                            str23 = jve.h(parcel, readInt8);
                            break;
                        case '\t':
                            str24 = jve.h(parcel, readInt8);
                            break;
                        case '\n':
                            str25 = jve.h(parcel, readInt8);
                            break;
                        case 11:
                            str26 = jve.h(parcel, readInt8);
                            break;
                        case '\f':
                            str27 = jve.h(parcel, readInt8);
                            break;
                        case '\r':
                            str28 = jve.h(parcel, readInt8);
                            break;
                        case 14:
                            z = jve.n(parcel, readInt8);
                            continue;
                        case 15:
                            str29 = jve.h(parcel, readInt8);
                            break;
                        case 16:
                            str30 = jve.h(parcel, readInt8);
                            break;
                        default:
                            jve.y(parcel, readInt8);
                            break;
                    }
                    z = z13;
                }
                jve.m(parcel, z12);
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
                int z14 = jve.z(parcel);
                String str31 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        str8 = jve.h(parcel, readInt9);
                    } else if (c7 != 2) {
                        jve.y(parcel, readInt9);
                    } else {
                        str31 = jve.h(parcel, readInt9);
                    }
                }
                jve.m(parcel, z14);
                b64 b64Var = new b64();
                b64Var.a = str8;
                b64Var.b = str31;
                return b64Var;
            case 13:
                int z15 = jve.z(parcel);
                while (parcel.dataPosition() < z15) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        jve.y(parcel, readInt10);
                    } else {
                        str7 = jve.h(parcel, readInt10);
                    }
                }
                jve.m(parcel, z15);
                return new u6d(str7);
            case 14:
                int z16 = jve.z(parcel);
                int i5 = 0;
                boolean z17 = false;
                String str32 = null;
                Point[] pointArr = null;
                qf0 qf0Var = null;
                tf0 tf0Var = null;
                uf0 uf0Var = null;
                wf0 wf0Var = null;
                vf0 vf0Var = null;
                rf0 rf0Var = null;
                byte[] bArr2 = null;
                of0 of0Var = null;
                nf0 nf0Var = null;
                pf0 pf0Var = null;
                while (parcel.dataPosition() < z16) {
                    int readInt11 = parcel.readInt();
                    rf0 rf0Var2 = rf0Var;
                    switch ((char) readInt11) {
                        case 2:
                            i4 = jve.u(parcel, readInt11);
                            break;
                        case 3:
                            str6 = jve.h(parcel, readInt11);
                            break;
                        case 4:
                            str32 = jve.h(parcel, readInt11);
                            break;
                        case 5:
                            i5 = jve.u(parcel, readInt11);
                            break;
                        case 6:
                            pointArr = (Point[]) jve.k(parcel, readInt11, Point.CREATOR);
                            break;
                        case 7:
                            qf0Var = (qf0) jve.g(parcel, readInt11, qf0.CREATOR);
                            break;
                        case '\b':
                            tf0Var = (tf0) jve.g(parcel, readInt11, tf0.CREATOR);
                            break;
                        case '\t':
                            uf0Var = (uf0) jve.g(parcel, readInt11, uf0.CREATOR);
                            break;
                        case '\n':
                            wf0Var = (wf0) jve.g(parcel, readInt11, wf0.CREATOR);
                            break;
                        case 11:
                            vf0Var = (vf0) jve.g(parcel, readInt11, vf0.CREATOR);
                            break;
                        case '\f':
                            rf0Var = (rf0) jve.g(parcel, readInt11, rf0.CREATOR);
                            continue;
                        case '\r':
                            nf0Var = (nf0) jve.g(parcel, readInt11, nf0.CREATOR);
                            break;
                        case 14:
                            of0Var = (of0) jve.g(parcel, readInt11, of0.CREATOR);
                            break;
                        case 15:
                            pf0Var = (pf0) jve.g(parcel, readInt11, pf0.CREATOR);
                            break;
                        case 16:
                            bArr2 = jve.b(parcel, readInt11);
                            break;
                        case 17:
                            z17 = jve.n(parcel, readInt11);
                            break;
                        default:
                            jve.y(parcel, readInt11);
                            break;
                    }
                    rf0Var = rf0Var2;
                }
                jve.m(parcel, z16);
                xf0 xf0Var = new xf0();
                xf0Var.a = i4;
                xf0Var.b = str6;
                xf0Var.F = bArr2;
                xf0Var.c = str32;
                xf0Var.d = i5;
                xf0Var.e = pointArr;
                xf0Var.G = z17;
                xf0Var.f = qf0Var;
                xf0Var.h = tf0Var;
                xf0Var.n = uf0Var;
                xf0Var.r = wf0Var;
                xf0Var.s = vf0Var;
                xf0Var.w = rf0Var;
                xf0Var.x = nf0Var;
                xf0Var.y = of0Var;
                xf0Var.E = pf0Var;
                return xf0Var;
            case 15:
                int z18 = jve.z(parcel);
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
                            str5 = jve.h(parcel, readInt12);
                            break;
                        case 3:
                            str33 = jve.h(parcel, readInt12);
                            break;
                        case 4:
                            str34 = jve.h(parcel, readInt12);
                            break;
                        case 5:
                            str35 = jve.h(parcel, readInt12);
                            break;
                        case 6:
                            str36 = jve.h(parcel, readInt12);
                            break;
                        case 7:
                            str37 = jve.h(parcel, readInt12);
                            break;
                        case '\b':
                            str38 = jve.h(parcel, readInt12);
                            break;
                        case '\t':
                            str39 = jve.h(parcel, readInt12);
                            break;
                        case '\n':
                            str40 = jve.h(parcel, readInt12);
                            break;
                        case 11:
                            z4 = jve.n(parcel, readInt12);
                            break;
                        case '\f':
                            str41 = jve.h(parcel, readInt12);
                            break;
                        default:
                            jve.y(parcel, readInt12);
                            break;
                    }
                }
                jve.m(parcel, z18);
                x6d x6dVar = new x6d();
                x6dVar.a = str5;
                x6dVar.b = str33;
                x6dVar.c = str34;
                x6dVar.d = str35;
                x6dVar.e = str36;
                x6dVar.f = str37;
                x6dVar.h = str38;
                x6dVar.n = str39;
                x6dVar.r = str40;
                x6dVar.s = z4;
                x6dVar.w = str41;
                return x6dVar;
            case 16:
                int z19 = jve.z(parcel);
                while (parcel.dataPosition() < z19) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        jve.y(parcel, readInt13);
                    } else {
                        str4 = jve.h(parcel, readInt13);
                    }
                }
                jve.m(parcel, z19);
                return new c7d(str4);
            case 17:
                return new kpd(parcel.readStrongBinder());
            case 18:
                int z20 = jve.z(parcel);
                long j = -1;
                int i6 = 0;
                boolean z21 = false;
                String str42 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt14 = parcel.readInt();
                    char c8 = (char) readInt14;
                    if (c8 == 1) {
                        str42 = jve.h(parcel, readInt14);
                    } else if (c8 == 2) {
                        i6 = jve.u(parcel, readInt14);
                    } else if (c8 == 3) {
                        j = jve.w(parcel, readInt14);
                    } else if (c8 != 4) {
                        jve.y(parcel, readInt14);
                    } else {
                        z21 = jve.n(parcel, readInt14);
                    }
                }
                jve.m(parcel, z20);
                return new o94(str42, i6, j, z21);
            case 19:
                int z22 = jve.z(parcel);
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
                            j2 = jve.w(parcel, readInt15);
                            break;
                        case 3:
                            str43 = jve.h(parcel, readInt15);
                            break;
                        case 4:
                            j3 = jve.w(parcel, readInt15);
                            break;
                        case 5:
                            z23 = jve.n(parcel, readInt15);
                            break;
                        case 6:
                            strArr = jve.i(parcel, readInt15);
                            break;
                        case 7:
                            z24 = jve.n(parcel, readInt15);
                            break;
                        case '\b':
                            z25 = jve.n(parcel, readInt15);
                            break;
                        default:
                            jve.y(parcel, readInt15);
                            break;
                    }
                }
                jve.m(parcel, z22);
                return new z9(j2, str43, j3, z23, strArr, z24, z25);
            case 20:
                int z26 = jve.z(parcel);
                while (parcel.dataPosition() < z26) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        jve.y(parcel, readInt16);
                    } else {
                        z3 = jve.n(parcel, readInt16);
                    }
                }
                jve.m(parcel, z26);
                return new u9c(z3);
            case 21:
                try {
                    return v9c.a(parcel.readString());
                } catch (ged e5) {
                    rjb.m(e5);
                    return null;
                }
            case 22:
                int z27 = jve.z(parcel);
                while (parcel.dataPosition() < z27) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        jve.y(parcel, readInt17);
                    } else {
                        arrayList = jve.l(parcel, readInt17, yac.CREATOR);
                    }
                }
                jve.m(parcel, z27);
                return new xac(arrayList);
            case 23:
                int z28 = jve.z(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt18 = parcel.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 1) {
                        i3 = jve.u(parcel, readInt18);
                    } else if (c9 == 2) {
                        jve.A(parcel, readInt18, 4);
                        s = (short) parcel.readInt();
                    } else if (c9 != 3) {
                        jve.y(parcel, readInt18);
                    } else {
                        jve.A(parcel, readInt18, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                jve.m(parcel, z28);
                return new yac(i3, s, s2);
            case 24:
                int z29 = jve.z(parcel);
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 2) {
                        pgdVar = (pgd) jve.g(parcel, readInt19, pgd.CREATOR);
                    } else if (c10 == 3) {
                        i2 = jve.u(parcel, readInt19);
                    } else if (c10 == 4) {
                        i7 = jve.u(parcel, readInt19);
                    } else if (c10 != 5) {
                        jve.y(parcel, readInt19);
                    } else {
                        i8 = jve.u(parcel, readInt19);
                    }
                }
                jve.m(parcel, z29);
                return new ved(pgdVar, i2, i7, i8);
            case 25:
                int z30 = jve.z(parcel);
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt20 = parcel.readInt();
                    char c11 = (char) readInt20;
                    if (c11 == 2) {
                        str3 = jve.h(parcel, readInt20);
                    } else if (c11 == 3) {
                        str44 = jve.h(parcel, readInt20);
                    } else if (c11 != 4) {
                        jve.y(parcel, readInt20);
                    } else {
                        str45 = jve.h(parcel, readInt20);
                    }
                }
                jve.m(parcel, z30);
                return new pgd(str3, str44, str45);
            case 26:
                int z31 = jve.z(parcel);
                boolean z32 = false;
                y33 y33Var = null;
                while (parcel.dataPosition() < z31) {
                    int readInt21 = parcel.readInt();
                    char c12 = (char) readInt21;
                    if (c12 == 2) {
                        z2 = jve.n(parcel, readInt21);
                    } else if (c12 == 3) {
                        str2 = jve.h(parcel, readInt21);
                    } else if (c12 == 4) {
                        z32 = jve.n(parcel, readInt21);
                    } else if (c12 != 5) {
                        jve.y(parcel, readInt21);
                    } else {
                        y33Var = (y33) jve.g(parcel, readInt21, y33.CREATOR);
                    }
                }
                jve.m(parcel, z31);
                return new b26(z2, str2, z32, y33Var);
            case 27:
                int z33 = jve.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 2) {
                        jve.y(parcel, readInt22);
                    } else {
                        i = jve.u(parcel, readInt22);
                    }
                }
                jve.m(parcel, z33);
                return new thd(i);
            case 28:
                int z34 = jve.z(parcel);
                long j4 = 0;
                String str46 = null;
                String str47 = null;
                Integer num = null;
                String str48 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt23 = parcel.readInt();
                    char c13 = (char) readInt23;
                    if (c13 == 2) {
                        str47 = jve.h(parcel, readInt23);
                    } else if (c13 == 3) {
                        j4 = jve.w(parcel, readInt23);
                    } else if (c13 == 4) {
                        num = jve.v(parcel, readInt23);
                    } else if (c13 == 5) {
                        str48 = jve.h(parcel, readInt23);
                    } else if (c13 != 6) {
                        jve.y(parcel, readInt23);
                    } else {
                        str46 = jve.h(parcel, readInt23);
                    }
                }
                jve.m(parcel, z34);
                Pattern pattern = qe1.a;
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
                int z35 = jve.z(parcel);
                long j5 = 0;
                long j6 = 0;
                int i9 = 0;
                String str49 = null;
                String str50 = null;
                it6 it6Var = null;
                ArrayList arrayList2 = null;
                ykb ykbVar = null;
                String str51 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                String str52 = null;
                ebc ebcVar = null;
                String str53 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            str49 = jve.h(parcel, readInt24);
                            break;
                        case 3:
                            i9 = jve.u(parcel, readInt24);
                            break;
                        case 4:
                            str50 = jve.h(parcel, readInt24);
                            break;
                        case 5:
                            it6Var = (it6) jve.g(parcel, readInt24, it6.CREATOR);
                            break;
                        case 6:
                            j5 = jve.w(parcel, readInt24);
                            break;
                        case 7:
                            arrayList2 = jve.l(parcel, readInt24, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            ykbVar = (ykb) jve.g(parcel, readInt24, ykb.CREATOR);
                            break;
                        case '\t':
                            str51 = jve.h(parcel, readInt24);
                            break;
                        case '\n':
                            arrayList3 = jve.l(parcel, readInt24, z9.CREATOR);
                            break;
                        case 11:
                            arrayList4 = jve.l(parcel, readInt24, y9.CREATOR);
                            break;
                        case '\f':
                            str52 = jve.h(parcel, readInt24);
                            break;
                        case '\r':
                            ebcVar = (ebc) jve.g(parcel, readInt24, ebc.CREATOR);
                            break;
                        case 14:
                            j6 = jve.w(parcel, readInt24);
                            break;
                        case 15:
                            str53 = jve.h(parcel, readInt24);
                            break;
                        case 16:
                            str54 = jve.h(parcel, readInt24);
                            break;
                        case 17:
                            str55 = jve.h(parcel, readInt24);
                            break;
                        case 18:
                            str56 = jve.h(parcel, readInt24);
                            break;
                        default:
                            jve.y(parcel, readInt24);
                            break;
                    }
                }
                jve.m(parcel, z35);
                return new MediaInfo(str49, i9, str50, it6Var, j5, arrayList2, ykbVar, str51, arrayList3, arrayList4, str52, ebcVar, j6, str53, str54, str55, str56);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new y33[i];
            case 1:
                return new sw8[i];
            case 2:
                return new tw8[i];
            case 3:
                return new obd[i];
            case 4:
                return new ubd[i];
            case 5:
                return new bc9[i];
            case 6:
                return new dcd[i];
            case 7:
                return new jcd[i];
            case 8:
                return new yrb[i];
            case 9:
                return new asb[i];
            case 10:
                return new dz[i];
            case 11:
                return new UserAddress[i];
            case 12:
                return new b64[i];
            case 13:
                return new u6d[i];
            case 14:
                return new xf0[i];
            case 15:
                return new x6d[i];
            case 16:
                return new c7d[i];
            case 17:
                return new kpd[i];
            case 18:
                return new o94[i];
            case 19:
                return new z9[i];
            case 20:
                return new u9c[i];
            case 21:
                return new v9c[i];
            case 22:
                return new xac[i];
            case 23:
                return new yac[i];
            case 24:
                return new ved[i];
            case 25:
                return new pgd[i];
            case 26:
                return new b26[i];
            case 27:
                return new thd[i];
            case 28:
                return new MediaError[i];
            default:
                return new MediaInfo[i];
        }
    }
}
