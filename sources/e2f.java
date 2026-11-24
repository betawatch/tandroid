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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e2f implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ e2f(byte b) {
        this.a = b;
    }

    public static void a(dv4 dv4Var, Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = dv4Var.a;
        mve.q(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = dv4Var.b;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = dv4Var.c;
        mve.q(parcel, 3, 4);
        parcel.writeInt(i4);
        mve.l(parcel, 4, dv4Var.d);
        mve.f(parcel, 5, dv4Var.e);
        mve.o(parcel, 6, dv4Var.f, i);
        mve.b(parcel, 7, dv4Var.h);
        mve.k(parcel, 8, dv4Var.n, i);
        mve.o(parcel, 10, dv4Var.r, i);
        mve.o(parcel, 11, dv4Var.s, i);
        boolean z = dv4Var.w;
        mve.q(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = dv4Var.x;
        mve.q(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = dv4Var.y;
        mve.q(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        mve.l(parcel, 15, dv4Var.E);
        mve.s(parcel, r);
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
                int z = jve.z(parcel);
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
                            i = jve.u(parcel, readInt);
                            break;
                        case 3:
                            str8 = jve.h(parcel, readInt);
                            break;
                        case 4:
                            str9 = jve.h(parcel, readInt);
                            break;
                        case 5:
                            str10 = jve.h(parcel, readInt);
                            break;
                        case 6:
                            str11 = jve.h(parcel, readInt);
                            break;
                        case 7:
                            str12 = jve.h(parcel, readInt);
                            break;
                        case '\b':
                            str13 = jve.h(parcel, readInt);
                            break;
                        case '\t':
                            b = jve.p(parcel, readInt);
                            break;
                        case '\n':
                            b2 = jve.p(parcel, readInt);
                            break;
                        case 11:
                            b3 = jve.p(parcel, readInt);
                            break;
                        case '\f':
                            b4 = jve.p(parcel, readInt);
                            break;
                        case '\r':
                            str14 = jve.h(parcel, readInt);
                            break;
                        default:
                            jve.y(parcel, readInt);
                            break;
                    }
                }
                jve.m(parcel, z);
                return new oye(i, str8, str9, str10, str11, str12, str13, b, b2, b3, b4, str14);
            case 1:
                int z2 = jve.z(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = dv4.F;
                o94[] o94VarArr = dv4.G;
                o94[] o94VarArr2 = o94VarArr;
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
                            i2 = jve.u(parcel, readInt2);
                            break;
                        case 2:
                            i3 = jve.u(parcel, readInt2);
                            break;
                        case 3:
                            i4 = jve.u(parcel, readInt2);
                            break;
                        case 4:
                            str15 = jve.h(parcel, readInt2);
                            break;
                        case 5:
                            iBinder = jve.t(parcel, readInt2);
                            break;
                        case 6:
                            scopeArr = (Scope[]) jve.k(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = jve.a(parcel, readInt2);
                            break;
                        case '\b':
                            account = (Account) jve.g(parcel, readInt2, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            jve.y(parcel, readInt2);
                            break;
                        case '\n':
                            o94VarArr = (o94[]) jve.k(parcel, readInt2, o94.CREATOR);
                            break;
                        case 11:
                            o94VarArr2 = (o94[]) jve.k(parcel, readInt2, o94.CREATOR);
                            break;
                        case '\f':
                            z3 = jve.n(parcel, readInt2);
                            break;
                        case '\r':
                            i5 = jve.u(parcel, readInt2);
                            break;
                        case 14:
                            z4 = jve.n(parcel, readInt2);
                            break;
                        case 15:
                            str16 = jve.h(parcel, readInt2);
                            break;
                    }
                }
                jve.m(parcel, z2);
                return new dv4(i2, i3, i4, str15, iBinder, scopeArr, bundle2, account, o94VarArr, o94VarArr2, z3, i5, z4, str16);
            case 2:
                int z5 = jve.z(parcel);
                Boolean bool = null;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 2) {
                        str = jve.h(parcel, readInt3);
                    } else if (c == 3) {
                        bool = jve.o(parcel, readInt3);
                    } else if (c == 4) {
                        str17 = jve.h(parcel, readInt3);
                    } else if (c != 5) {
                        jve.y(parcel, readInt3);
                    } else {
                        str18 = jve.h(parcel, readInt3);
                    }
                }
                jve.m(parcel, z5);
                return new d60(str, bool, str17, str18);
            case 3:
                int z6 = jve.z(parcel);
                int i6 = 0;
                while (parcel.dataPosition() < z6) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        jve.y(parcel, readInt4);
                    } else {
                        i6 = jve.u(parcel, readInt4);
                    }
                }
                jve.m(parcel, z6);
                return new qye(i6);
            case 4:
                int z7 = jve.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        jve.y(parcel, readInt5);
                    } else {
                        bArr = jve.b(parcel, readInt5);
                    }
                }
                jve.m(parcel, z7);
                return new c2f(bArr);
            case 5:
                int z8 = jve.z(parcel);
                String str19 = null;
                while (parcel.dataPosition() < z8) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 2) {
                        str7 = jve.h(parcel, readInt6);
                    } else if (c2 != 3) {
                        jve.y(parcel, readInt6);
                    } else {
                        str19 = jve.h(parcel, readInt6);
                    }
                }
                jve.m(parcel, z8);
                vf0 vf0Var = new vf0();
                vf0Var.a = str7;
                vf0Var.b = str19;
                return vf0Var;
            case 6:
                int z9 = jve.z(parcel);
                int i7 = 0;
                while (parcel.dataPosition() < z9) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        i7 = jve.u(parcel, readInt7);
                    } else if (c3 != 2) {
                        jve.y(parcel, readInt7);
                    } else {
                        bundle = jve.a(parcel, readInt7);
                    }
                }
                jve.m(parcel, z9);
                return new y1f(i7, bundle);
            case 7:
                int z10 = jve.z(parcel);
                double d = 0.0d;
                String str20 = null;
                ArrayList arrayList5 = null;
                b26 b26Var = null;
                je1 je1Var = null;
                ArrayList arrayList6 = null;
                epe epeVar = null;
                qye qyeVar = null;
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
                            str20 = jve.h(parcel, readInt8);
                            break;
                        case 3:
                            arrayList5 = jve.j(parcel, readInt8);
                            break;
                        case 4:
                            z11 = jve.n(parcel, readInt8);
                            break;
                        case 5:
                            b26Var = (b26) jve.g(parcel, readInt8, b26.CREATOR);
                            break;
                        case 6:
                            z12 = jve.n(parcel, readInt8);
                            break;
                        case 7:
                            je1Var = (je1) jve.g(parcel, readInt8, je1.CREATOR);
                            break;
                        case '\b':
                            z13 = jve.n(parcel, readInt8);
                            break;
                        case '\t':
                            d = jve.q(parcel, readInt8);
                            break;
                        case '\n':
                            z14 = jve.n(parcel, readInt8);
                            break;
                        case 11:
                            z15 = jve.n(parcel, readInt8);
                            break;
                        case '\f':
                            z16 = jve.n(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList6 = jve.j(parcel, readInt8);
                            break;
                        case 14:
                            z17 = jve.n(parcel, readInt8);
                            break;
                        case 15:
                            jve.u(parcel, readInt8);
                            break;
                        case 16:
                            z18 = jve.n(parcel, readInt8);
                            break;
                        case 17:
                            epeVar = (epe) jve.g(parcel, readInt8, epe.CREATOR);
                            break;
                        case 18:
                            qyeVar = (qye) jve.g(parcel, readInt8, qye.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt8);
                            break;
                    }
                }
                jve.m(parcel, z10);
                return new le1(str20, arrayList5, z11, b26Var, z12, je1Var, z13, d, z14, z15, z16, arrayList6, z17, z18, epeVar, qyeVar);
            case 8:
                int z19 = jve.z(parcel);
                String str21 = null;
                int i8 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c4 = (char) readInt9;
                    if (c4 == 2) {
                        str6 = jve.h(parcel, readInt9);
                    } else if (c4 == 3) {
                        str21 = jve.h(parcel, readInt9);
                    } else if (c4 != 4) {
                        jve.y(parcel, readInt9);
                    } else {
                        i8 = jve.u(parcel, readInt9);
                    }
                }
                jve.m(parcel, z19);
                ar5 ar5Var = new ar5();
                ar5Var.a = str6;
                ar5Var.b = str21;
                ar5Var.c = i8;
                return ar5Var;
            case 9:
                int z20 = jve.z(parcel);
                String str22 = null;
                qpb qpbVar = null;
                s8c s8cVar = null;
                s8c s8cVar2 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 2) {
                        str5 = jve.h(parcel, readInt10);
                    } else if (c5 == 3) {
                        str22 = jve.h(parcel, readInt10);
                    } else if (c5 == 4) {
                        qpbVar = (qpb) jve.g(parcel, readInt10, qpb.CREATOR);
                    } else if (c5 == 5) {
                        s8cVar = (s8c) jve.g(parcel, readInt10, s8c.CREATOR);
                    } else if (c5 != 6) {
                        jve.y(parcel, readInt10);
                    } else {
                        s8cVar2 = (s8c) jve.g(parcel, readInt10, s8c.CREATOR);
                    }
                }
                jve.m(parcel, z20);
                wqc wqcVar = new wqc();
                wqcVar.a = str5;
                wqcVar.b = str22;
                wqcVar.c = qpbVar;
                wqcVar.d = s8cVar;
                wqcVar.e = s8cVar2;
                return wqcVar;
            case 10:
                int z21 = jve.z(parcel);
                String str23 = null;
                int i9 = 0;
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        str4 = jve.h(parcel, readInt11);
                    } else if (c6 == 2) {
                        f = jve.r(parcel, readInt11);
                    } else if (c6 == 3) {
                        str23 = jve.h(parcel, readInt11);
                    } else if (c6 != 4) {
                        jve.y(parcel, readInt11);
                    } else {
                        i9 = jve.u(parcel, readInt11);
                    }
                }
                jve.m(parcel, z21);
                return new f8f(f, i9, str4, str23);
            case 11:
                int z22 = jve.z(parcel);
                int i10 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        f = jve.r(parcel, readInt12);
                    } else if (c7 != 2) {
                        jve.y(parcel, readInt12);
                    } else {
                        i10 = jve.u(parcel, readInt12);
                    }
                }
                jve.m(parcel, z22);
                return new k8f(f, i10);
            case 12:
                int z23 = jve.z(parcel);
                ArrayList arrayList7 = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 1) {
                        status = (Status) jve.g(parcel, readInt13, Status.CREATOR);
                    } else if (c8 == 2) {
                        arrayList7 = jve.l(parcel, readInt13, ojf.CREATOR);
                    } else if (c8 != 3) {
                        jve.y(parcel, readInt13);
                    } else {
                        strArr2 = jve.i(parcel, readInt13);
                    }
                }
                jve.m(parcel, z23);
                y6f y6fVar = new y6f();
                y6fVar.a = status;
                y6fVar.b = arrayList7;
                y6fVar.c = strArr2;
                return y6fVar;
            case 13:
                int z24 = jve.z(parcel);
                while (parcel.dataPosition() < z24) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        jve.y(parcel, readInt14);
                    } else {
                        pendingIntent = (PendingIntent) jve.g(parcel, readInt14, PendingIntent.CREATOR);
                    }
                }
                jve.m(parcel, z24);
                return new c7f(pendingIntent);
            case 14:
                int z25 = jve.z(parcel);
                String str24 = null;
                String str25 = null;
                boe boeVar = null;
                String str26 = null;
                String str27 = null;
                Float f2 = null;
                yef yefVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            str24 = jve.h(parcel, readInt15);
                            break;
                        case 2:
                            str25 = jve.h(parcel, readInt15);
                            break;
                        case 3:
                            boeVar = (boe) jve.g(parcel, readInt15, boe.CREATOR);
                            break;
                        case 4:
                            str26 = jve.h(parcel, readInt15);
                            break;
                        case 5:
                            str27 = jve.h(parcel, readInt15);
                            break;
                        case 6:
                            f2 = jve.s(parcel, readInt15);
                            break;
                        case 7:
                            yefVar = (yef) jve.g(parcel, readInt15, yef.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt15);
                            break;
                    }
                }
                jve.m(parcel, z25);
                return new d7f(str24, str25, boeVar, str26, str27, f2, yefVar);
            case 15:
                try {
                    return s61.a(parcel.readInt());
                } catch (r61 e) {
                    rjb.m(e);
                    return null;
                }
            case 16:
                int z26 = jve.z(parcel);
                String str28 = null;
                String str29 = null;
                ArrayList arrayList8 = null;
                String str30 = null;
                boolean z27 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            arrayList4 = jve.e(parcel, readInt16);
                            break;
                        case 3:
                        default:
                            jve.y(parcel, readInt16);
                            break;
                        case 4:
                            str28 = jve.h(parcel, readInt16);
                            break;
                        case 5:
                            str29 = jve.h(parcel, readInt16);
                            break;
                        case 6:
                            arrayList8 = jve.e(parcel, readInt16);
                            break;
                        case 7:
                            z27 = jve.n(parcel, readInt16);
                            break;
                        case '\b':
                            str30 = jve.h(parcel, readInt16);
                            break;
                    }
                }
                jve.m(parcel, z26);
                mt5 mt5Var = new mt5();
                mt5Var.a = arrayList4;
                mt5Var.b = str28;
                mt5Var.c = str29;
                mt5Var.d = arrayList8;
                mt5Var.e = z27;
                mt5Var.f = str30;
                return mt5Var;
            case 17:
                int z28 = jve.z(parcel);
                int[] iArr = null;
                RemoteViews remoteViews = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c9 = (char) readInt17;
                    if (c9 == 1) {
                        strArr = jve.i(parcel, readInt17);
                    } else if (c9 == 2) {
                        iArr = jve.d(parcel, readInt17);
                    } else if (c9 == 3) {
                        remoteViews = (RemoteViews) jve.g(parcel, readInt17, RemoteViews.CREATOR);
                    } else if (c9 != 4) {
                        jve.y(parcel, readInt17);
                    } else {
                        bArr2 = jve.b(parcel, readInt17);
                    }
                }
                jve.m(parcel, z28);
                hbf hbfVar = new hbf();
                hbfVar.a = strArr;
                hbfVar.b = iArr;
                hbfVar.c = remoteViews;
                hbfVar.d = bArr2;
                return hbfVar;
            case 18:
                int z29 = jve.z(parcel);
                boe boeVar2 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    char c10 = (char) readInt18;
                    if (c10 == 1) {
                        i11 = jve.u(parcel, readInt18);
                    } else if (c10 == 2) {
                        arrayList3 = jve.l(parcel, readInt18, d7f.CREATOR);
                    } else if (c10 != 3) {
                        jve.y(parcel, readInt18);
                    } else {
                        boeVar2 = (boe) jve.g(parcel, readInt18, boe.CREATOR);
                    }
                }
                jve.m(parcel, z29);
                return new ibf(i11, arrayList3, boeVar2);
            case 19:
                int z30 = jve.z(parcel);
                long j = 0;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt19 = parcel.readInt();
                    char c11 = (char) readInt19;
                    if (c11 == 1) {
                        j = jve.w(parcel, readInt19);
                    } else if (c11 == 2) {
                        bArr3 = jve.b(parcel, readInt19);
                    } else if (c11 == 3) {
                        bArr4 = jve.b(parcel, readInt19);
                    } else if (c11 != 4) {
                        jve.y(parcel, readInt19);
                    } else {
                        bArr5 = jve.b(parcel, readInt19);
                    }
                }
                jve.m(parcel, z30);
                return new nbf(j, bArr3, bArr4, bArr5);
            case 20:
                int z31 = jve.z(parcel);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = arrayList10;
                ArrayList arrayList13 = arrayList11;
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                qpb qpbVar2 = null;
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
                ci6 ci6Var = null;
                int i12 = 0;
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt20 = parcel.readInt();
                    qpb qpbVar3 = qpbVar2;
                    switch ((char) readInt20) {
                        case 2:
                            str3 = jve.h(parcel, readInt20);
                            break;
                        case 3:
                            str35 = jve.h(parcel, readInt20);
                            break;
                        case 4:
                            str36 = jve.h(parcel, readInt20);
                            break;
                        case 5:
                            str37 = jve.h(parcel, readInt20);
                            break;
                        case 6:
                            str38 = jve.h(parcel, readInt20);
                            break;
                        case 7:
                            str39 = jve.h(parcel, readInt20);
                            break;
                        case '\b':
                            str33 = jve.h(parcel, readInt20);
                            break;
                        case '\t':
                            str32 = jve.h(parcel, readInt20);
                            break;
                        case '\n':
                            str31 = jve.h(parcel, readInt20);
                            break;
                        case 11:
                            str34 = jve.h(parcel, readInt20);
                            break;
                        case '\f':
                            i12 = jve.u(parcel, readInt20);
                            break;
                        case '\r':
                            arrayList9 = jve.l(parcel, readInt20, wqc.CREATOR);
                            break;
                        case 14:
                            qpbVar2 = (qpb) jve.g(parcel, readInt20, qpb.CREATOR);
                            continue;
                        case 15:
                            arrayList12 = jve.l(parcel, readInt20, LatLng.CREATOR);
                            break;
                        case 16:
                            str40 = jve.h(parcel, readInt20);
                            break;
                        case 17:
                            str41 = jve.h(parcel, readInt20);
                            break;
                        case 18:
                            arrayList13 = jve.l(parcel, readInt20, uy5.CREATOR);
                            break;
                        case 19:
                            z32 = jve.n(parcel, readInt20);
                            break;
                        case 20:
                            arrayList14 = jve.l(parcel, readInt20, s8c.CREATOR);
                            break;
                        case 21:
                            arrayList15 = jve.l(parcel, readInt20, qjb.CREATOR);
                            break;
                        case 22:
                            arrayList16 = jve.l(parcel, readInt20, s8c.CREATOR);
                            break;
                        case 23:
                            ci6Var = (ci6) jve.g(parcel, readInt20, ci6.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt20);
                            break;
                    }
                    qpbVar2 = qpbVar3;
                }
                jve.m(parcel, z31);
                ei6 ei6Var = new ei6();
                ei6Var.a = str3;
                ei6Var.b = str35;
                ei6Var.c = str36;
                ei6Var.d = str37;
                ei6Var.e = str38;
                ei6Var.f = str39;
                ei6Var.h = str33;
                ei6Var.n = str32;
                ei6Var.r = str31;
                ei6Var.s = str34;
                ei6Var.w = i12;
                ei6Var.x = arrayList9;
                ei6Var.y = qpbVar2;
                ei6Var.E = arrayList12;
                ei6Var.F = str40;
                ei6Var.G = str41;
                ei6Var.H = arrayList13;
                ei6Var.I = z32;
                ei6Var.J = arrayList14;
                ei6Var.K = arrayList15;
                ei6Var.L = arrayList16;
                ei6Var.M = ci6Var;
                return ei6Var;
            case 21:
                int z33 = jve.z(parcel);
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
                ckf ckfVar = null;
                Integer num = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            str42 = jve.h(parcel, readInt21);
                            break;
                        case 3:
                            str43 = jve.h(parcel, readInt21);
                            break;
                        case 4:
                            str44 = jve.h(parcel, readInt21);
                            break;
                        case 5:
                            str45 = jve.h(parcel, readInt21);
                            break;
                        case 6:
                            str46 = jve.h(parcel, readInt21);
                            break;
                        case 7:
                            i14 = jve.u(parcel, readInt21);
                            break;
                        case '\b':
                            arrayList17 = jve.l(parcel, readInt21, wuc.CREATOR);
                            break;
                        case '\t':
                            i15 = jve.u(parcel, readInt21);
                            break;
                        case '\n':
                            i13 = jve.u(parcel, readInt21);
                            break;
                        case 11:
                            str47 = jve.h(parcel, readInt21);
                            break;
                        case '\f':
                            str48 = jve.h(parcel, readInt21);
                            break;
                        case '\r':
                            i16 = jve.u(parcel, readInt21);
                            break;
                        case 14:
                            str49 = jve.h(parcel, readInt21);
                            break;
                        case 15:
                            bArr6 = jve.b(parcel, readInt21);
                            break;
                        case 16:
                            str50 = jve.h(parcel, readInt21);
                            break;
                        case 17:
                            z34 = jve.n(parcel, readInt21);
                            break;
                        case 18:
                            ckfVar = (ckf) jve.g(parcel, readInt21, ckf.CREATOR);
                            break;
                        case 19:
                            num = jve.v(parcel, readInt21);
                            break;
                        default:
                            jve.y(parcel, readInt21);
                            break;
                    }
                }
                jve.m(parcel, z33);
                return new CastDevice(str42, str43, str44, str45, str46, i14, arrayList17, i15, i13, str47, str48, i16, str49, bArr6, str50, z34, ckfVar, num);
            case 22:
                int z35 = jve.z(parcel);
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
                            str51 = jve.h(parcel, readInt22);
                            break;
                        case 3:
                            i17 = jve.u(parcel, readInt22);
                            break;
                        case 4:
                            i18 = jve.u(parcel, readInt22);
                            break;
                        case 5:
                            str52 = jve.h(parcel, readInt22);
                            break;
                        case 6:
                            str53 = jve.h(parcel, readInt22);
                            break;
                        case 7:
                            z36 = jve.n(parcel, readInt22);
                            break;
                        case '\b':
                            str54 = jve.h(parcel, readInt22);
                            break;
                        case '\t':
                            z37 = jve.n(parcel, readInt22);
                            break;
                        case '\n':
                            i19 = jve.u(parcel, readInt22);
                            break;
                        default:
                            jve.y(parcel, readInt22);
                            break;
                    }
                }
                jve.m(parcel, z35);
                return new gdf(str51, i17, i18, str52, str53, z36, str54, z37, i19);
            case 23:
                int z38 = jve.z(parcel);
                String str55 = null;
                String[] strArr3 = null;
                String str56 = null;
                x6d x6dVar = null;
                x6d x6dVar2 = null;
                ei6[] ei6VarArr = null;
                jq7[] jq7VarArr = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                ar5[] ar5VarArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str2 = jve.h(parcel, readInt23);
                            break;
                        case 3:
                            str55 = jve.h(parcel, readInt23);
                            break;
                        case 4:
                            strArr3 = jve.i(parcel, readInt23);
                            break;
                        case 5:
                            str56 = jve.h(parcel, readInt23);
                            break;
                        case 6:
                            x6dVar = (x6d) jve.g(parcel, readInt23, x6d.CREATOR);
                            break;
                        case 7:
                            x6dVar2 = (x6d) jve.g(parcel, readInt23, x6d.CREATOR);
                            break;
                        case '\b':
                            ei6VarArr = (ei6[]) jve.k(parcel, readInt23, ei6.CREATOR);
                            break;
                        case '\t':
                            jq7VarArr = (jq7[]) jve.k(parcel, readInt23, jq7.CREATOR);
                            break;
                        case '\n':
                            userAddress = (UserAddress) jve.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress2 = (UserAddress) jve.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case '\f':
                            ar5VarArr = (ar5[]) jve.k(parcel, readInt23, ar5.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt23);
                            break;
                    }
                }
                jve.m(parcel, z38);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str2;
                maskedWallet.b = str55;
                maskedWallet.c = strArr3;
                maskedWallet.d = str56;
                maskedWallet.e = x6dVar;
                maskedWallet.f = x6dVar2;
                maskedWallet.h = ei6VarArr;
                maskedWallet.n = jq7VarArr;
                maskedWallet.r = userAddress;
                maskedWallet.s = userAddress2;
                maskedWallet.w = ar5VarArr;
                return maskedWallet;
            case 24:
                int z39 = jve.z(parcel);
                boolean z40 = false;
                while (parcel.dataPosition() < z39) {
                    int readInt24 = parcel.readInt();
                    char c12 = (char) readInt24;
                    if (c12 == 1) {
                        z40 = jve.n(parcel, readInt24);
                    } else if (c12 != 2) {
                        jve.y(parcel, readInt24);
                    } else {
                        arrayList2 = jve.j(parcel, readInt24);
                    }
                }
                jve.m(parcel, z39);
                return new yef(arrayList2, z40);
            case 25:
                int z41 = jve.z(parcel);
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        jve.y(parcel, readInt25);
                    } else {
                        arrayList = jve.l(parcel, readInt25, nbf.CREATOR);
                    }
                }
                jve.m(parcel, z41);
                return new zef(arrayList);
            case 26:
                int z42 = jve.z(parcel);
                int i20 = 1;
                String str57 = null;
                String str58 = null;
                String str59 = null;
                y1f[] y1fVarArr = null;
                String str60 = null;
                jhf jhfVar = null;
                boolean z43 = false;
                boolean z44 = false;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    char c13 = (char) readInt26;
                    if (c13 == 11) {
                        str60 = jve.h(parcel, readInt26);
                    } else if (c13 != '\f') {
                        switch (c13) {
                            case 1:
                                str57 = jve.h(parcel, readInt26);
                                break;
                            case 2:
                                str58 = jve.h(parcel, readInt26);
                                break;
                            case 3:
                                z43 = jve.n(parcel, readInt26);
                                break;
                            case 4:
                                i20 = jve.u(parcel, readInt26);
                                break;
                            case 5:
                                z44 = jve.n(parcel, readInt26);
                                break;
                            case 6:
                                str59 = jve.h(parcel, readInt26);
                                break;
                            case 7:
                                y1fVarArr = (y1f[]) jve.k(parcel, readInt26, y1f.CREATOR);
                                break;
                            default:
                                jve.y(parcel, readInt26);
                                break;
                        }
                    } else {
                        jhfVar = (jhf) jve.g(parcel, readInt26, jhf.CREATOR);
                    }
                }
                jve.m(parcel, z42);
                return new sef(str57, str58, z43, i20, z44, str59, y1fVarArr, str60, jhfVar);
            case 27:
                int z45 = jve.z(parcel);
                long j2 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z45) {
                    int readInt27 = parcel.readInt();
                    char c14 = (char) readInt27;
                    if (c14 == 1) {
                        i21 = jve.u(parcel, readInt27);
                    } else if (c14 == 2) {
                        i22 = jve.u(parcel, readInt27);
                    } else if (c14 == 3) {
                        i23 = jve.u(parcel, readInt27);
                    } else if (c14 == 4) {
                        i24 = jve.u(parcel, readInt27);
                    } else if (c14 != 5) {
                        jve.y(parcel, readInt27);
                    } else {
                        j2 = jve.w(parcel, readInt27);
                    }
                }
                jve.m(parcel, z45);
                return new ghf(i21, i22, i23, j2, i24);
            case 28:
                int z46 = jve.z(parcel);
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
                            int x = jve.x(parcel, readInt28);
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
                            bitmap = (Bitmap) jve.g(parcel, readInt28, Bitmap.CREATOR);
                            break;
                        case 3:
                            i25 = jve.u(parcel, readInt28);
                            break;
                        case 4:
                            i26 = jve.u(parcel, readInt28);
                            break;
                        case 5:
                            i27 = jve.u(parcel, readInt28);
                            break;
                        case 6:
                            i28 = jve.u(parcel, readInt28);
                            break;
                        case 7:
                            i29 = jve.u(parcel, readInt28);
                            break;
                        default:
                            jve.y(parcel, readInt28);
                            break;
                    }
                }
                jve.m(parcel, z46);
                return new shf(fArr, bitmap, i25, i26, i27, i28, i29);
            default:
                int z47 = jve.z(parcel);
                ArrayList arrayList18 = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList19 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt29 = parcel.readInt();
                    char c15 = (char) readInt29;
                    if (c15 == 1) {
                        arrayList18 = jve.l(parcel, readInt29, shf.CREATOR);
                    } else if (c15 == 2) {
                        int x2 = jve.x(parcel, readInt29);
                        int dataPosition2 = parcel.dataPosition();
                        if (x2 == 0) {
                            fArr2 = null;
                        } else {
                            float[] createFloatArray2 = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + x2);
                            fArr2 = createFloatArray2;
                        }
                    } else if (c15 == 3) {
                        bitmap2 = (Bitmap) jve.g(parcel, readInt29, Bitmap.CREATOR);
                    } else if (c15 != 4) {
                        jve.y(parcel, readInt29);
                    } else {
                        int x3 = jve.x(parcel, readInt29);
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
                jve.m(parcel, z47);
                return new uhf(arrayList18, fArr2, bitmap2, arrayList19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oye[i];
            case 1:
                return new dv4[i];
            case 2:
                return new d60[i];
            case 3:
                return new qye[i];
            case 4:
                return new c2f[i];
            case 5:
                return new vf0[i];
            case 6:
                return new y1f[i];
            case 7:
                return new le1[i];
            case 8:
                return new ar5[i];
            case 9:
                return new wqc[i];
            case 10:
                return new f8f[i];
            case 11:
                return new k8f[i];
            case 12:
                return new y6f[i];
            case 13:
                return new c7f[i];
            case 14:
                return new d7f[i];
            case 15:
                return new s61[i];
            case 16:
                return new mt5[i];
            case 17:
                return new hbf[i];
            case 18:
                return new ibf[i];
            case 19:
                return new nbf[i];
            case 20:
                return new ei6[i];
            case 21:
                return new CastDevice[i];
            case 22:
                return new gdf[i];
            case 23:
                return new MaskedWallet[i];
            case 24:
                return new yef[i];
            case 25:
                return new zef[i];
            case 26:
                return new sef[i];
            case 27:
                return new ghf[i];
            case 28:
                return new shf[i];
            default:
                return new uhf[i];
        }
    }
}
