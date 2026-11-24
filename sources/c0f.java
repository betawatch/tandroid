// default package

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.MaskedWallet;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c0f implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ c0f(byte b) {
        this.a = b;
    }

    public static void a(ct4 ct4Var, Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = ct4Var.a;
        jte.q(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = ct4Var.b;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = ct4Var.c;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i4);
        jte.l(parcel, 4, ct4Var.d);
        jte.f(parcel, 5, ct4Var.e);
        jte.o(parcel, 6, ct4Var.f, i);
        jte.b(parcel, 7, ct4Var.h);
        jte.k(parcel, 8, ct4Var.n, i);
        jte.o(parcel, 10, ct4Var.r, i);
        jte.o(parcel, 11, ct4Var.s, i);
        boolean z = ct4Var.w;
        jte.q(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = ct4Var.x;
        jte.q(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = ct4Var.y;
        jte.q(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jte.l(parcel, 15, ct4Var.E);
        jte.s(parcel, r);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList3 = null;
        String[] strArr = null;
        ArrayList arrayList4 = null;
        PendingIntent pendingIntent = null;
        Status status = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Bundle bundle = null;
        String str7 = null;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int z = gte.z(parcel);
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                int i = 0;
                byte b = 0;
                byte b2 = 0;
                byte b3 = 0;
                byte b4 = 0;
                while (parcel.dataPosition() < z) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            i = gte.u(parcel, readInt);
                            break;
                        case 3:
                            str8 = gte.h(parcel, readInt);
                            break;
                        case 4:
                            str9 = gte.h(parcel, readInt);
                            break;
                        case 5:
                            str10 = gte.h(parcel, readInt);
                            break;
                        case 6:
                            str11 = gte.h(parcel, readInt);
                            break;
                        case 7:
                            str12 = gte.h(parcel, readInt);
                            break;
                        case '\b':
                            str13 = gte.h(parcel, readInt);
                            break;
                        case '\t':
                            b = gte.p(parcel, readInt);
                            break;
                        case '\n':
                            b2 = gte.p(parcel, readInt);
                            break;
                        case 11:
                            b3 = gte.p(parcel, readInt);
                            break;
                        case '\f':
                            b4 = gte.p(parcel, readInt);
                            break;
                        case '\r':
                            str14 = gte.h(parcel, readInt);
                            break;
                        default:
                            gte.y(parcel, readInt);
                            break;
                    }
                }
                gte.m(parcel, z);
                return new mwe(i, str8, str9, str10, str11, str12, str13, b, b2, b3, b4, str14);
            case 1:
                int z2 = gte.z(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = ct4.F;
                f84[] f84VarArr = ct4.G;
                f84[] f84VarArr2 = f84VarArr;
                String str15 = null;
                IBinder iBinder = null;
                Account account = null;
                String str16 = null;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                boolean z3 = false;
                int i5 = 0;
                boolean z4 = false;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i2 = gte.u(parcel, readInt2);
                            break;
                        case 2:
                            i3 = gte.u(parcel, readInt2);
                            break;
                        case 3:
                            i4 = gte.u(parcel, readInt2);
                            break;
                        case 4:
                            str15 = gte.h(parcel, readInt2);
                            break;
                        case 5:
                            iBinder = gte.t(parcel, readInt2);
                            break;
                        case 6:
                            scopeArr = (Scope[]) gte.k(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = gte.a(parcel, readInt2);
                            break;
                        case '\b':
                            account = (Account) gte.g(parcel, readInt2, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            gte.y(parcel, readInt2);
                            break;
                        case '\n':
                            f84VarArr = (f84[]) gte.k(parcel, readInt2, f84.CREATOR);
                            break;
                        case 11:
                            f84VarArr2 = (f84[]) gte.k(parcel, readInt2, f84.CREATOR);
                            break;
                        case '\f':
                            z3 = gte.n(parcel, readInt2);
                            break;
                        case '\r':
                            i5 = gte.u(parcel, readInt2);
                            break;
                        case 14:
                            z4 = gte.n(parcel, readInt2);
                            break;
                        case 15:
                            str16 = gte.h(parcel, readInt2);
                            break;
                    }
                }
                gte.m(parcel, z2);
                return new ct4(i2, i3, i4, str15, iBinder, scopeArr, bundle2, account, f84VarArr, f84VarArr2, z3, i5, z4, str16);
            case 2:
                int z5 = gte.z(parcel);
                Boolean bool = null;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 2) {
                        str = gte.h(parcel, readInt3);
                    } else if (c == 3) {
                        bool = gte.o(parcel, readInt3);
                    } else if (c == 4) {
                        str17 = gte.h(parcel, readInt3);
                    } else if (c != 5) {
                        gte.y(parcel, readInt3);
                    } else {
                        str18 = gte.h(parcel, readInt3);
                    }
                }
                gte.m(parcel, z5);
                return new d50(str, bool, str17, str18);
            case 3:
                int z6 = gte.z(parcel);
                int i6 = 0;
                while (parcel.dataPosition() < z6) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        gte.y(parcel, readInt4);
                    } else {
                        i6 = gte.u(parcel, readInt4);
                    }
                }
                gte.m(parcel, z6);
                return new owe(i6);
            case 4:
                int z7 = gte.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        gte.y(parcel, readInt5);
                    } else {
                        bArr = gte.b(parcel, readInt5);
                    }
                }
                gte.m(parcel, z7);
                return new a0f(bArr);
            case 5:
                int z8 = gte.z(parcel);
                String str19 = null;
                while (parcel.dataPosition() < z8) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 2) {
                        str7 = gte.h(parcel, readInt6);
                    } else if (c2 != 3) {
                        gte.y(parcel, readInt6);
                    } else {
                        str19 = gte.h(parcel, readInt6);
                    }
                }
                gte.m(parcel, z8);
                ve0 ve0Var = new ve0();
                ve0Var.a = str7;
                ve0Var.b = str19;
                return ve0Var;
            case 6:
                int z9 = gte.z(parcel);
                int i7 = 0;
                while (parcel.dataPosition() < z9) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        i7 = gte.u(parcel, readInt7);
                    } else if (c3 != 2) {
                        gte.y(parcel, readInt7);
                    } else {
                        bundle = gte.a(parcel, readInt7);
                    }
                }
                gte.m(parcel, z9);
                return new wze(i7, bundle);
            case 7:
                int z10 = gte.z(parcel);
                double d = 0.0d;
                String str20 = null;
                ArrayList arrayList5 = null;
                b06 b06Var = null;
                bd1 bd1Var = null;
                ArrayList arrayList6 = null;
                bne bneVar = null;
                owe oweVar = null;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str20 = gte.h(parcel, readInt8);
                            break;
                        case 3:
                            arrayList5 = gte.j(parcel, readInt8);
                            break;
                        case 4:
                            z11 = gte.n(parcel, readInt8);
                            break;
                        case 5:
                            b06Var = (b06) gte.g(parcel, readInt8, b06.CREATOR);
                            break;
                        case 6:
                            z12 = gte.n(parcel, readInt8);
                            break;
                        case 7:
                            bd1Var = (bd1) gte.g(parcel, readInt8, bd1.CREATOR);
                            break;
                        case '\b':
                            z13 = gte.n(parcel, readInt8);
                            break;
                        case '\t':
                            d = gte.q(parcel, readInt8);
                            break;
                        case '\n':
                            z14 = gte.n(parcel, readInt8);
                            break;
                        case 11:
                            z15 = gte.n(parcel, readInt8);
                            break;
                        case '\f':
                            z16 = gte.n(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList6 = gte.j(parcel, readInt8);
                            break;
                        case 14:
                            z17 = gte.n(parcel, readInt8);
                            break;
                        case 15:
                            gte.u(parcel, readInt8);
                            break;
                        case 16:
                            z18 = gte.n(parcel, readInt8);
                            break;
                        case 17:
                            bneVar = (bne) gte.g(parcel, readInt8, bne.CREATOR);
                            break;
                        case 18:
                            oweVar = (owe) gte.g(parcel, readInt8, owe.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt8);
                            break;
                    }
                }
                gte.m(parcel, z10);
                return new dd1(str20, arrayList5, z11, b06Var, z12, bd1Var, z13, d, z14, z15, z16, arrayList6, z17, z18, bneVar, oweVar);
            case 8:
                int z19 = gte.z(parcel);
                String str21 = null;
                int i8 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c4 = (char) readInt9;
                    if (c4 == 2) {
                        str6 = gte.h(parcel, readInt9);
                    } else if (c4 == 3) {
                        str21 = gte.h(parcel, readInt9);
                    } else if (c4 != 4) {
                        gte.y(parcel, readInt9);
                    } else {
                        i8 = gte.u(parcel, readInt9);
                    }
                }
                gte.m(parcel, z19);
                ap5 ap5Var = new ap5();
                ap5Var.a = str6;
                ap5Var.b = str21;
                ap5Var.c = i8;
                return ap5Var;
            case 9:
                int z20 = gte.z(parcel);
                String str22 = null;
                pnb pnbVar = null;
                r6c r6cVar = null;
                r6c r6cVar2 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 2) {
                        str5 = gte.h(parcel, readInt10);
                    } else if (c5 == 3) {
                        str22 = gte.h(parcel, readInt10);
                    } else if (c5 == 4) {
                        pnbVar = (pnb) gte.g(parcel, readInt10, pnb.CREATOR);
                    } else if (c5 == 5) {
                        r6cVar = (r6c) gte.g(parcel, readInt10, r6c.CREATOR);
                    } else if (c5 != 6) {
                        gte.y(parcel, readInt10);
                    } else {
                        r6cVar2 = (r6c) gte.g(parcel, readInt10, r6c.CREATOR);
                    }
                }
                gte.m(parcel, z20);
                uoc uocVar = new uoc();
                uocVar.a = str5;
                uocVar.b = str22;
                uocVar.c = pnbVar;
                uocVar.d = r6cVar;
                uocVar.e = r6cVar2;
                return uocVar;
            case 10:
                int z21 = gte.z(parcel);
                String str23 = null;
                int i9 = 0;
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        str4 = gte.h(parcel, readInt11);
                    } else if (c6 == 2) {
                        f = gte.r(parcel, readInt11);
                    } else if (c6 == 3) {
                        str23 = gte.h(parcel, readInt11);
                    } else if (c6 != 4) {
                        gte.y(parcel, readInt11);
                    } else {
                        i9 = gte.u(parcel, readInt11);
                    }
                }
                gte.m(parcel, z21);
                return new d6f(f, i9, str4, str23);
            case 11:
                int z22 = gte.z(parcel);
                int i10 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        f = gte.r(parcel, readInt12);
                    } else if (c7 != 2) {
                        gte.y(parcel, readInt12);
                    } else {
                        i10 = gte.u(parcel, readInt12);
                    }
                }
                gte.m(parcel, z22);
                return new i6f(f, i10);
            case 12:
                int z23 = gte.z(parcel);
                ArrayList arrayList7 = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 1) {
                        status = (Status) gte.g(parcel, readInt13, Status.CREATOR);
                    } else if (c8 == 2) {
                        arrayList7 = gte.l(parcel, readInt13, nhf.CREATOR);
                    } else if (c8 != 3) {
                        gte.y(parcel, readInt13);
                    } else {
                        strArr2 = gte.i(parcel, readInt13);
                    }
                }
                gte.m(parcel, z23);
                w4f w4fVar = new w4f();
                w4fVar.a = status;
                w4fVar.b = arrayList7;
                w4fVar.c = strArr2;
                return w4fVar;
            case 13:
                int z24 = gte.z(parcel);
                while (parcel.dataPosition() < z24) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        gte.y(parcel, readInt14);
                    } else {
                        pendingIntent = (PendingIntent) gte.g(parcel, readInt14, PendingIntent.CREATOR);
                    }
                }
                gte.m(parcel, z24);
                return new a5f(pendingIntent);
            case 14:
                int z25 = gte.z(parcel);
                String str24 = null;
                String str25 = null;
                zle zleVar = null;
                String str26 = null;
                String str27 = null;
                Float f2 = null;
                xcf xcfVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            str24 = gte.h(parcel, readInt15);
                            break;
                        case 2:
                            str25 = gte.h(parcel, readInt15);
                            break;
                        case 3:
                            zleVar = (zle) gte.g(parcel, readInt15, zle.CREATOR);
                            break;
                        case 4:
                            str26 = gte.h(parcel, readInt15);
                            break;
                        case 5:
                            str27 = gte.h(parcel, readInt15);
                            break;
                        case 6:
                            f2 = gte.s(parcel, readInt15);
                            break;
                        case 7:
                            xcfVar = (xcf) gte.g(parcel, readInt15, xcf.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt15);
                            break;
                    }
                }
                gte.m(parcel, z25);
                return new b5f(str24, str25, zleVar, str26, str27, f2, xcfVar);
            case 15:
                try {
                    return l51.a(parcel.readInt());
                } catch (k51 e) {
                    sdb.b(e);
                    return null;
                }
            case 16:
                int z26 = gte.z(parcel);
                String str28 = null;
                String str29 = null;
                ArrayList arrayList8 = null;
                String str30 = null;
                boolean z27 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            arrayList4 = gte.e(parcel, readInt16);
                            break;
                        case 3:
                        default:
                            gte.y(parcel, readInt16);
                            break;
                        case 4:
                            str28 = gte.h(parcel, readInt16);
                            break;
                        case 5:
                            str29 = gte.h(parcel, readInt16);
                            break;
                        case 6:
                            arrayList8 = gte.e(parcel, readInt16);
                            break;
                        case 7:
                            z27 = gte.n(parcel, readInt16);
                            break;
                        case '\b':
                            str30 = gte.h(parcel, readInt16);
                            break;
                    }
                }
                gte.m(parcel, z26);
                nr5 nr5Var = new nr5();
                nr5Var.a = arrayList4;
                nr5Var.b = str28;
                nr5Var.c = str29;
                nr5Var.d = arrayList8;
                nr5Var.e = z27;
                nr5Var.f = str30;
                return nr5Var;
            case 17:
                int z28 = gte.z(parcel);
                int[] iArr = null;
                RemoteViews remoteViews = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c9 = (char) readInt17;
                    if (c9 == 1) {
                        strArr = gte.i(parcel, readInt17);
                    } else if (c9 == 2) {
                        iArr = gte.d(parcel, readInt17);
                    } else if (c9 == 3) {
                        remoteViews = (RemoteViews) gte.g(parcel, readInt17, RemoteViews.CREATOR);
                    } else if (c9 != 4) {
                        gte.y(parcel, readInt17);
                    } else {
                        bArr2 = gte.b(parcel, readInt17);
                    }
                }
                gte.m(parcel, z28);
                f9f f9fVar = new f9f();
                f9fVar.a = strArr;
                f9fVar.b = iArr;
                f9fVar.c = remoteViews;
                f9fVar.d = bArr2;
                return f9fVar;
            case 18:
                int z29 = gte.z(parcel);
                zle zleVar2 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    char c10 = (char) readInt18;
                    if (c10 == 1) {
                        i11 = gte.u(parcel, readInt18);
                    } else if (c10 == 2) {
                        arrayList3 = gte.l(parcel, readInt18, b5f.CREATOR);
                    } else if (c10 != 3) {
                        gte.y(parcel, readInt18);
                    } else {
                        zleVar2 = (zle) gte.g(parcel, readInt18, zle.CREATOR);
                    }
                }
                gte.m(parcel, z29);
                return new g9f(i11, arrayList3, zleVar2);
            case 19:
                int z30 = gte.z(parcel);
                long j = 0;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt19 = parcel.readInt();
                    char c11 = (char) readInt19;
                    if (c11 == 1) {
                        j = gte.w(parcel, readInt19);
                    } else if (c11 == 2) {
                        bArr3 = gte.b(parcel, readInt19);
                    } else if (c11 == 3) {
                        bArr4 = gte.b(parcel, readInt19);
                    } else if (c11 != 4) {
                        gte.y(parcel, readInt19);
                    } else {
                        bArr5 = gte.b(parcel, readInt19);
                    }
                }
                gte.m(parcel, z30);
                return new l9f(j, bArr3, bArr4, bArr5);
            case 20:
                int z31 = gte.z(parcel);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = arrayList10;
                ArrayList arrayList13 = arrayList11;
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                pnb pnbVar2 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                cg6 cg6Var = null;
                int i12 = 0;
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt20 = parcel.readInt();
                    pnb pnbVar3 = pnbVar2;
                    switch ((char) readInt20) {
                        case 2:
                            str3 = gte.h(parcel, readInt20);
                            break;
                        case 3:
                            str35 = gte.h(parcel, readInt20);
                            break;
                        case 4:
                            str36 = gte.h(parcel, readInt20);
                            break;
                        case 5:
                            str37 = gte.h(parcel, readInt20);
                            break;
                        case 6:
                            str38 = gte.h(parcel, readInt20);
                            break;
                        case 7:
                            str39 = gte.h(parcel, readInt20);
                            break;
                        case '\b':
                            str33 = gte.h(parcel, readInt20);
                            break;
                        case '\t':
                            str32 = gte.h(parcel, readInt20);
                            break;
                        case '\n':
                            str31 = gte.h(parcel, readInt20);
                            break;
                        case 11:
                            str34 = gte.h(parcel, readInt20);
                            break;
                        case '\f':
                            i12 = gte.u(parcel, readInt20);
                            break;
                        case '\r':
                            arrayList9 = gte.l(parcel, readInt20, uoc.CREATOR);
                            break;
                        case 14:
                            pnbVar2 = (pnb) gte.g(parcel, readInt20, pnb.CREATOR);
                            continue;
                        case 15:
                            arrayList12 = gte.l(parcel, readInt20, LatLng.CREATOR);
                            break;
                        case 16:
                            str40 = gte.h(parcel, readInt20);
                            break;
                        case 17:
                            str41 = gte.h(parcel, readInt20);
                            break;
                        case 18:
                            arrayList13 = gte.l(parcel, readInt20, uw5.CREATOR);
                            break;
                        case 19:
                            z32 = gte.n(parcel, readInt20);
                            break;
                        case 20:
                            arrayList14 = gte.l(parcel, readInt20, r6c.CREATOR);
                            break;
                        case 21:
                            arrayList15 = gte.l(parcel, readInt20, phb.CREATOR);
                            break;
                        case 22:
                            arrayList16 = gte.l(parcel, readInt20, r6c.CREATOR);
                            break;
                        case 23:
                            cg6Var = (cg6) gte.g(parcel, readInt20, cg6.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt20);
                            break;
                    }
                    pnbVar2 = pnbVar3;
                }
                gte.m(parcel, z31);
                eg6 eg6Var = new eg6();
                eg6Var.a = str3;
                eg6Var.b = str35;
                eg6Var.c = str36;
                eg6Var.d = str37;
                eg6Var.e = str38;
                eg6Var.f = str39;
                eg6Var.h = str33;
                eg6Var.n = str32;
                eg6Var.r = str31;
                eg6Var.s = str34;
                eg6Var.w = i12;
                eg6Var.x = arrayList9;
                eg6Var.y = pnbVar2;
                eg6Var.E = arrayList12;
                eg6Var.F = str40;
                eg6Var.G = str41;
                eg6Var.H = arrayList13;
                eg6Var.I = z32;
                eg6Var.J = arrayList14;
                eg6Var.K = arrayList15;
                eg6Var.L = arrayList16;
                eg6Var.M = cg6Var;
                return eg6Var;
            case 21:
                int z33 = gte.z(parcel);
                int i13 = -1;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                ArrayList arrayList17 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                byte[] bArr6 = null;
                String str50 = null;
                bif bifVar = null;
                Integer num = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            str42 = gte.h(parcel, readInt21);
                            break;
                        case 3:
                            str43 = gte.h(parcel, readInt21);
                            break;
                        case 4:
                            str44 = gte.h(parcel, readInt21);
                            break;
                        case 5:
                            str45 = gte.h(parcel, readInt21);
                            break;
                        case 6:
                            str46 = gte.h(parcel, readInt21);
                            break;
                        case 7:
                            i14 = gte.u(parcel, readInt21);
                            break;
                        case '\b':
                            arrayList17 = gte.l(parcel, readInt21, vsc.CREATOR);
                            break;
                        case '\t':
                            i15 = gte.u(parcel, readInt21);
                            break;
                        case '\n':
                            i13 = gte.u(parcel, readInt21);
                            break;
                        case 11:
                            str47 = gte.h(parcel, readInt21);
                            break;
                        case '\f':
                            str48 = gte.h(parcel, readInt21);
                            break;
                        case '\r':
                            i16 = gte.u(parcel, readInt21);
                            break;
                        case 14:
                            str49 = gte.h(parcel, readInt21);
                            break;
                        case 15:
                            bArr6 = gte.b(parcel, readInt21);
                            break;
                        case 16:
                            str50 = gte.h(parcel, readInt21);
                            break;
                        case 17:
                            z34 = gte.n(parcel, readInt21);
                            break;
                        case 18:
                            bifVar = (bif) gte.g(parcel, readInt21, bif.CREATOR);
                            break;
                        case 19:
                            num = gte.v(parcel, readInt21);
                            break;
                        default:
                            gte.y(parcel, readInt21);
                            break;
                    }
                }
                gte.m(parcel, z33);
                return new CastDevice(str42, str43, str44, str45, str46, i14, arrayList17, i15, i13, str47, str48, i16, str49, bArr6, str50, z34, bifVar, num);
            case 22:
                int z35 = gte.z(parcel);
                boolean z36 = true;
                String str51 = null;
                String str52 = null;
                String str53 = null;
                String str54 = null;
                int i17 = 0;
                int i18 = 0;
                boolean z37 = false;
                int i19 = 0;
                while (parcel.dataPosition() < z35) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str51 = gte.h(parcel, readInt22);
                            break;
                        case 3:
                            i17 = gte.u(parcel, readInt22);
                            break;
                        case 4:
                            i18 = gte.u(parcel, readInt22);
                            break;
                        case 5:
                            str52 = gte.h(parcel, readInt22);
                            break;
                        case 6:
                            str53 = gte.h(parcel, readInt22);
                            break;
                        case 7:
                            z36 = gte.n(parcel, readInt22);
                            break;
                        case '\b':
                            str54 = gte.h(parcel, readInt22);
                            break;
                        case '\t':
                            z37 = gte.n(parcel, readInt22);
                            break;
                        case '\n':
                            i19 = gte.u(parcel, readInt22);
                            break;
                        default:
                            gte.y(parcel, readInt22);
                            break;
                    }
                }
                gte.m(parcel, z35);
                return new fbf(str51, i17, i18, str52, str53, z36, str54, z37, i19);
            case 23:
                int z38 = gte.z(parcel);
                String str55 = null;
                String[] strArr3 = null;
                String str56 = null;
                v4d v4dVar = null;
                v4d v4dVar2 = null;
                eg6[] eg6VarArr = null;
                go7[] go7VarArr = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                ap5[] ap5VarArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str2 = gte.h(parcel, readInt23);
                            break;
                        case 3:
                            str55 = gte.h(parcel, readInt23);
                            break;
                        case 4:
                            strArr3 = gte.i(parcel, readInt23);
                            break;
                        case 5:
                            str56 = gte.h(parcel, readInt23);
                            break;
                        case 6:
                            v4dVar = (v4d) gte.g(parcel, readInt23, v4d.CREATOR);
                            break;
                        case 7:
                            v4dVar2 = (v4d) gte.g(parcel, readInt23, v4d.CREATOR);
                            break;
                        case '\b':
                            eg6VarArr = (eg6[]) gte.k(parcel, readInt23, eg6.CREATOR);
                            break;
                        case '\t':
                            go7VarArr = (go7[]) gte.k(parcel, readInt23, go7.CREATOR);
                            break;
                        case '\n':
                            userAddress = (UserAddress) gte.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress2 = (UserAddress) gte.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case '\f':
                            ap5VarArr = (ap5[]) gte.k(parcel, readInt23, ap5.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt23);
                            break;
                    }
                }
                gte.m(parcel, z38);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str2;
                maskedWallet.b = str55;
                maskedWallet.c = strArr3;
                maskedWallet.d = str56;
                maskedWallet.e = v4dVar;
                maskedWallet.f = v4dVar2;
                maskedWallet.h = eg6VarArr;
                maskedWallet.n = go7VarArr;
                maskedWallet.r = userAddress;
                maskedWallet.s = userAddress2;
                maskedWallet.w = ap5VarArr;
                return maskedWallet;
            case 24:
                int z39 = gte.z(parcel);
                boolean z40 = false;
                while (parcel.dataPosition() < z39) {
                    int readInt24 = parcel.readInt();
                    char c12 = (char) readInt24;
                    if (c12 == 1) {
                        z40 = gte.n(parcel, readInt24);
                    } else if (c12 != 2) {
                        gte.y(parcel, readInt24);
                    } else {
                        arrayList2 = gte.j(parcel, readInt24);
                    }
                }
                gte.m(parcel, z39);
                return new xcf(arrayList2, z40);
            case 25:
                int z41 = gte.z(parcel);
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        gte.y(parcel, readInt25);
                    } else {
                        arrayList = gte.l(parcel, readInt25, l9f.CREATOR);
                    }
                }
                gte.m(parcel, z41);
                return new ycf(arrayList);
            case 26:
                int z42 = gte.z(parcel);
                int i20 = 1;
                String str57 = null;
                String str58 = null;
                String str59 = null;
                wze[] wzeVarArr = null;
                String str60 = null;
                iff iffVar = null;
                boolean z43 = false;
                boolean z44 = false;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    char c13 = (char) readInt26;
                    if (c13 == 11) {
                        str60 = gte.h(parcel, readInt26);
                    } else if (c13 != '\f') {
                        switch (c13) {
                            case 1:
                                str57 = gte.h(parcel, readInt26);
                                break;
                            case 2:
                                str58 = gte.h(parcel, readInt26);
                                break;
                            case 3:
                                z43 = gte.n(parcel, readInt26);
                                break;
                            case 4:
                                i20 = gte.u(parcel, readInt26);
                                break;
                            case 5:
                                z44 = gte.n(parcel, readInt26);
                                break;
                            case 6:
                                str59 = gte.h(parcel, readInt26);
                                break;
                            case 7:
                                wzeVarArr = (wze[]) gte.k(parcel, readInt26, wze.CREATOR);
                                break;
                            default:
                                gte.y(parcel, readInt26);
                                break;
                        }
                    } else {
                        iffVar = (iff) gte.g(parcel, readInt26, iff.CREATOR);
                    }
                }
                gte.m(parcel, z42);
                return new rcf(str57, str58, z43, i20, z44, str59, wzeVarArr, str60, iffVar);
            case 27:
                int z45 = gte.z(parcel);
                long j2 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z45) {
                    int readInt27 = parcel.readInt();
                    char c14 = (char) readInt27;
                    if (c14 == 1) {
                        i21 = gte.u(parcel, readInt27);
                    } else if (c14 == 2) {
                        i22 = gte.u(parcel, readInt27);
                    } else if (c14 == 3) {
                        i23 = gte.u(parcel, readInt27);
                    } else if (c14 == 4) {
                        i24 = gte.u(parcel, readInt27);
                    } else if (c14 != 5) {
                        gte.y(parcel, readInt27);
                    } else {
                        j2 = gte.w(parcel, readInt27);
                    }
                }
                gte.m(parcel, z45);
                return new fff(i21, i22, i23, j2, i24);
            case 28:
                int z46 = gte.z(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < z46) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 1:
                            int x = gte.x(parcel, readInt28);
                            int dataPosition = parcel.dataPosition();
                            if (x == 0) {
                                fArr = null;
                                break;
                            } else {
                                float[] createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + x);
                                fArr = createFloatArray;
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) gte.g(parcel, readInt28, Bitmap.CREATOR);
                            break;
                        case 3:
                            i25 = gte.u(parcel, readInt28);
                            break;
                        case 4:
                            i26 = gte.u(parcel, readInt28);
                            break;
                        case 5:
                            i27 = gte.u(parcel, readInt28);
                            break;
                        case 6:
                            i28 = gte.u(parcel, readInt28);
                            break;
                        case 7:
                            i29 = gte.u(parcel, readInt28);
                            break;
                        default:
                            gte.y(parcel, readInt28);
                            break;
                    }
                }
                gte.m(parcel, z46);
                return new rff(fArr, bitmap, i25, i26, i27, i28, i29);
            default:
                int z47 = gte.z(parcel);
                ArrayList arrayList18 = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList19 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt29 = parcel.readInt();
                    char c15 = (char) readInt29;
                    if (c15 == 1) {
                        arrayList18 = gte.l(parcel, readInt29, rff.CREATOR);
                    } else if (c15 == 2) {
                        int x2 = gte.x(parcel, readInt29);
                        int dataPosition2 = parcel.dataPosition();
                        if (x2 == 0) {
                            fArr2 = null;
                        } else {
                            float[] createFloatArray2 = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + x2);
                            fArr2 = createFloatArray2;
                        }
                    } else if (c15 == 3) {
                        bitmap2 = (Bitmap) gte.g(parcel, readInt29, Bitmap.CREATOR);
                    } else if (c15 != 4) {
                        gte.y(parcel, readInt29);
                    } else {
                        int x3 = gte.x(parcel, readInt29);
                        int dataPosition3 = parcel.dataPosition();
                        if (x3 == 0) {
                            arrayList19 = null;
                        } else {
                            ArrayList arrayList20 = new ArrayList();
                            int readInt30 = parcel.readInt();
                            for (int i30 = 0; i30 < readInt30; i30++) {
                                arrayList20.add(Float.valueOf(parcel.readFloat()));
                            }
                            parcel.setDataPosition(dataPosition3 + x3);
                            arrayList19 = arrayList20;
                        }
                    }
                }
                gte.m(parcel, z47);
                return new tff(arrayList18, fArr2, bitmap2, arrayList19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mwe[i];
            case 1:
                return new ct4[i];
            case 2:
                return new d50[i];
            case 3:
                return new owe[i];
            case 4:
                return new a0f[i];
            case 5:
                return new ve0[i];
            case 6:
                return new wze[i];
            case 7:
                return new dd1[i];
            case 8:
                return new ap5[i];
            case 9:
                return new uoc[i];
            case 10:
                return new d6f[i];
            case 11:
                return new i6f[i];
            case 12:
                return new w4f[i];
            case 13:
                return new a5f[i];
            case 14:
                return new b5f[i];
            case 15:
                return new l51[i];
            case 16:
                return new nr5[i];
            case 17:
                return new f9f[i];
            case 18:
                return new g9f[i];
            case 19:
                return new l9f[i];
            case 20:
                return new eg6[i];
            case 21:
                return new CastDevice[i];
            case 22:
                return new fbf[i];
            case 23:
                return new MaskedWallet[i];
            case 24:
                return new xcf[i];
            case 25:
                return new ycf[i];
            case 26:
                return new rcf[i];
            case 27:
                return new fff[i];
            case 28:
                return new rff[i];
            default:
                return new tff[i];
        }
    }
}
