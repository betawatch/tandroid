// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ime implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ime(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        double d = 0.0d;
        int i = -1;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        byte b = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z2 = false;
        int i11 = 0;
        switch (this.a) {
            case 0:
                int z3 = aye.z(parcel);
                float f = 0.5f;
                float f2 = 1.0f;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                LatLng latLng = null;
                String str = null;
                String str2 = null;
                IBinder iBinder = null;
                float f3 = 0.0f;
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                while (parcel.dataPosition() < z3) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            latLng = (LatLng) aye.g(parcel, readInt, LatLng.CREATOR);
                            break;
                        case 3:
                            str = aye.h(parcel, readInt);
                            break;
                        case 4:
                            str2 = aye.h(parcel, readInt);
                            break;
                        case 5:
                            iBinder = aye.t(parcel, readInt);
                            break;
                        case 6:
                            f3 = aye.r(parcel, readInt);
                            break;
                        case 7:
                            f4 = aye.r(parcel, readInt);
                            break;
                        case '\b':
                            z4 = aye.n(parcel, readInt);
                            break;
                        case '\t':
                            z5 = aye.n(parcel, readInt);
                            break;
                        case '\n':
                            z6 = aye.n(parcel, readInt);
                            break;
                        case 11:
                            f5 = aye.r(parcel, readInt);
                            break;
                        case '\f':
                            f = aye.r(parcel, readInt);
                            break;
                        case '\r':
                            f6 = aye.r(parcel, readInt);
                            break;
                        case 14:
                            f2 = aye.r(parcel, readInt);
                            break;
                        case 15:
                            f7 = aye.r(parcel, readInt);
                            break;
                        default:
                            aye.y(parcel, readInt);
                            break;
                    }
                }
                aye.m(parcel, z3);
                el6 el6Var = new el6();
                el6Var.e = 0.5f;
                el6Var.f = 1.0f;
                el6Var.n = true;
                el6Var.r = false;
                el6Var.s = 0.0f;
                el6Var.w = 0.5f;
                el6Var.x = 0.0f;
                el6Var.y = 1.0f;
                el6Var.a = latLng;
                el6Var.b = str;
                el6Var.c = str2;
                if (iBinder == null) {
                    el6Var.d = null;
                } else {
                    el6Var.d = new zm9(br7.T(iBinder));
                }
                el6Var.e = f3;
                el6Var.f = f4;
                el6Var.h = z4;
                el6Var.n = z5;
                el6Var.r = z6;
                el6Var.s = f5;
                el6Var.w = f;
                el6Var.x = f6;
                el6Var.y = f2;
                el6Var.E = f7;
                return el6Var;
            case 1:
                int z7 = aye.z(parcel);
                boolean z8 = false;
                while (parcel.dataPosition() < z7) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        i2 = aye.u(parcel, readInt2);
                    } else if (c != 3) {
                        aye.y(parcel, readInt2);
                    } else {
                        z8 = aye.n(parcel, readInt2);
                    }
                }
                aye.m(parcel, z7);
                return new yge(i2, z8);
            case 2:
                int z9 = aye.z(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str9 = aye.h(parcel, readInt3);
                            break;
                        case 3:
                            str3 = aye.h(parcel, readInt3);
                            break;
                        case 4:
                            str4 = aye.h(parcel, readInt3);
                            break;
                        case 5:
                            str5 = aye.h(parcel, readInt3);
                            break;
                        case 6:
                            str6 = aye.h(parcel, readInt3);
                            break;
                        case 7:
                            str7 = aye.h(parcel, readInt3);
                            break;
                        case '\b':
                            str8 = aye.h(parcel, readInt3);
                            break;
                        default:
                            aye.y(parcel, readInt3);
                            break;
                    }
                }
                aye.m(parcel, z9);
                ue0 ue0Var = new ue0();
                ue0Var.a = str9;
                ue0Var.b = str3;
                ue0Var.c = str4;
                ue0Var.d = str5;
                ue0Var.e = str6;
                ue0Var.f = str7;
                ue0Var.h = str8;
                return ue0Var;
            case 3:
                int z10 = aye.z(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i11 = aye.u(parcel, readInt4);
                            break;
                        case 3:
                            str11 = aye.h(parcel, readInt4);
                            break;
                        case 4:
                            d = aye.q(parcel, readInt4);
                            break;
                        case 5:
                            str10 = aye.h(parcel, readInt4);
                            break;
                        case 6:
                            j = aye.w(parcel, readInt4);
                            break;
                        case 7:
                            i = aye.u(parcel, readInt4);
                            break;
                        default:
                            aye.y(parcel, readInt4);
                            break;
                    }
                }
                aye.m(parcel, z10);
                hi6 hi6Var = new hi6();
                hi6Var.a = i11;
                hi6Var.b = str11;
                hi6Var.c = d;
                hi6Var.d = str10;
                hi6Var.e = j;
                hi6Var.f = i;
                return hi6Var;
            case 4:
                int z11 = aye.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z11) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        z2 = aye.n(parcel, readInt5);
                    } else if (c2 != 2) {
                        aye.y(parcel, readInt5);
                    } else {
                        bArr = aye.b(parcel, readInt5);
                    }
                }
                aye.m(parcel, z11);
                return new bhe(z2, bArr == null ? null : gfe.o(bArr.length, bArr));
            case 5:
                int z12 = aye.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 2) {
                        i10 = aye.u(parcel, readInt6);
                    } else if (c3 != 3) {
                        aye.y(parcel, readInt6);
                    } else {
                        z13 = aye.n(parcel, readInt6);
                    }
                }
                aye.m(parcel, z12);
                qwe qweVar = new qwe();
                qweVar.a = i10;
                qweVar.b = z13;
                return qweVar;
            case 6:
                int z14 = aye.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        aye.y(parcel, readInt7);
                    } else {
                        bArr2 = aye.b(parcel, readInt7);
                    }
                }
                aye.m(parcel, z14);
                return new hme(bArr2);
            case 7:
                int z15 = aye.z(parcel);
                Float f8 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 2) {
                        i9 = aye.u(parcel, readInt8);
                    } else if (c4 != 3) {
                        aye.y(parcel, readInt8);
                    } else {
                        f8 = aye.s(parcel, readInt8);
                    }
                }
                aye.m(parcel, z15);
                return new s18(i9, f8);
            case 8:
                int z16 = aye.z(parcel);
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                byte[] bArr3 = null;
                String str12 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 2) {
                        str12 = aye.h(parcel, readInt9);
                    } else if (c5 == 3) {
                        dataHolder = (DataHolder) aye.g(parcel, readInt9, DataHolder.CREATOR);
                    } else if (c5 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) aye.g(parcel, readInt9, ParcelFileDescriptor.CREATOR);
                    } else if (c5 == 5) {
                        j = aye.w(parcel, readInt9);
                    } else if (c5 != 6) {
                        aye.y(parcel, readInt9);
                    } else {
                        bArr3 = aye.b(parcel, readInt9);
                    }
                }
                aye.m(parcel, z16);
                fs9 fs9Var = new fs9();
                fs9Var.a = str12;
                fs9Var.b = dataHolder;
                fs9Var.c = parcelFileDescriptor;
                fs9Var.d = j;
                fs9Var.e = bArr3;
                return fs9Var;
            case 9:
                int z17 = aye.z(parcel);
                double d2 = 0.0d;
                while (parcel.dataPosition() < z17) {
                    int readInt10 = parcel.readInt();
                    char c6 = (char) readInt10;
                    if (c6 == 2) {
                        d = aye.q(parcel, readInt10);
                    } else if (c6 != 3) {
                        aye.y(parcel, readInt10);
                    } else {
                        d2 = aye.q(parcel, readInt10);
                    }
                }
                aye.m(parcel, z17);
                te0 te0Var = new te0();
                te0Var.a = d;
                te0Var.b = d2;
                return te0Var;
            case 10:
                int z18 = aye.z(parcel);
                hi6 hi6Var2 = null;
                prb prbVar = null;
                String str13 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt11 = parcel.readInt();
                    char c7 = (char) readInt11;
                    if (c7 == 2) {
                        str13 = aye.h(parcel, readInt11);
                    } else if (c7 == 3) {
                        hi6Var2 = (hi6) aye.g(parcel, readInt11, hi6.CREATOR);
                    } else if (c7 != 5) {
                        aye.y(parcel, readInt11);
                    } else {
                        prbVar = (prb) aye.g(parcel, readInt11, prb.CREATOR);
                    }
                }
                aye.m(parcel, z18);
                gi6 gi6Var = new gi6();
                gi6Var.a = str13;
                gi6Var.b = hi6Var2;
                gi6Var.c = prbVar;
                return gi6Var;
            case 11:
                int z19 = aye.z(parcel);
                byte b2 = 0;
                String str14 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 2) {
                        b = aye.p(parcel, readInt12);
                    } else if (c8 == 3) {
                        b2 = aye.p(parcel, readInt12);
                    } else if (c8 != 4) {
                        aye.y(parcel, readInt12);
                    } else {
                        str14 = aye.h(parcel, readInt12);
                    }
                }
                aye.m(parcel, z19);
                return new kme(b, b2, str14);
            case 12:
                int z20 = aye.z(parcel);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 2) {
                        bArr4 = aye.b(parcel, readInt13);
                    } else if (c9 == 3) {
                        bArr5 = aye.b(parcel, readInt13);
                    } else if (c9 == 4) {
                        bArr6 = aye.b(parcel, readInt13);
                    } else if (c9 == 5) {
                        bArr7 = aye.b(parcel, readInt13);
                    } else if (c9 != 6) {
                        aye.y(parcel, readInt13);
                    } else {
                        bArr8 = aye.b(parcel, readInt13);
                    }
                }
                aye.m(parcel, z20);
                return new b50(bArr4, bArr5, bArr6, bArr7, bArr8);
            case 13:
                int z21 = aye.z(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 1) {
                        str17 = aye.h(parcel, readInt14);
                    } else if (c10 == 2) {
                        str15 = aye.h(parcel, readInt14);
                    } else if (c10 != 3) {
                        aye.y(parcel, readInt14);
                    } else {
                        str16 = aye.h(parcel, readInt14);
                    }
                }
                aye.m(parcel, z21);
                return new mme(str17, str15, str16);
            case 14:
                int z22 = aye.z(parcel);
                int i12 = 0;
                int i13 = 0;
                float f9 = 0.0f;
                while (parcel.dataPosition() < z22) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 2) {
                        i8 = aye.u(parcel, readInt15);
                    } else if (c11 == 3) {
                        i12 = aye.u(parcel, readInt15);
                    } else if (c11 == 4) {
                        f9 = aye.r(parcel, readInt15);
                    } else if (c11 != 5) {
                        aye.y(parcel, readInt15);
                    } else {
                        i13 = aye.u(parcel, readInt15);
                    }
                }
                aye.m(parcel, z22);
                return new hre(i8, i12, f9, i13);
            case 15:
                int z23 = aye.z(parcel);
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 2) {
                        str19 = aye.h(parcel, readInt16);
                    } else if (c12 != 3) {
                        aye.y(parcel, readInt16);
                    } else {
                        str18 = aye.h(parcel, readInt16);
                    }
                }
                aye.m(parcel, z23);
                we0 we0Var = new we0();
                we0Var.a = str19;
                we0Var.b = str18;
                return we0Var;
            case 16:
                int z24 = aye.z(parcel);
                String str20 = null;
                String str21 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 2) {
                        str21 = aye.h(parcel, readInt17);
                    } else if (c13 != 3) {
                        aye.y(parcel, readInt17);
                    } else {
                        str20 = aye.h(parcel, readInt17);
                    }
                }
                aye.m(parcel, z24);
                llb llbVar = new llb();
                llbVar.a = str21;
                llbVar.b = str20;
                return llbVar;
            case 17:
                int z25 = aye.z(parcel);
                a94[] a94VarArr = null;
                ys2 ys2Var = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z25) {
                    int readInt18 = parcel.readInt();
                    char c14 = (char) readInt18;
                    if (c14 == 1) {
                        bundle = aye.a(parcel, readInt18);
                    } else if (c14 == 2) {
                        a94VarArr = (a94[]) aye.k(parcel, readInt18, a94.CREATOR);
                    } else if (c14 == 3) {
                        i7 = aye.u(parcel, readInt18);
                    } else if (c14 != 4) {
                        aye.y(parcel, readInt18);
                    } else {
                        ys2Var = (ys2) aye.g(parcel, readInt18, ys2.CREATOR);
                    }
                }
                aye.m(parcel, z25);
                ore oreVar = new ore();
                oreVar.a = bundle;
                oreVar.b = a94VarArr;
                oreVar.c = i7;
                oreVar.d = ys2Var;
                return oreVar;
            case 18:
                int z26 = aye.z(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                String[] strArr = null;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt19 = parcel.readInt();
                    char c15 = (char) readInt19;
                    if (c15 == 2) {
                        bArr11 = aye.b(parcel, readInt19);
                    } else if (c15 == 3) {
                        bArr9 = aye.b(parcel, readInt19);
                    } else if (c15 == 4) {
                        bArr10 = aye.b(parcel, readInt19);
                    } else if (c15 != 5) {
                        aye.y(parcel, readInt19);
                    } else {
                        strArr = aye.i(parcel, readInt19);
                    }
                }
                aye.m(parcel, z26);
                return new c50(bArr11, bArr9, bArr10, strArr);
            case 19:
                int z27 = aye.z(parcel);
                while (parcel.dataPosition() < z27) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        aye.y(parcel, readInt20);
                    } else {
                        z = aye.n(parcel, readInt20);
                    }
                }
                aye.m(parcel, z27);
                return new sre(z);
            case 20:
                int z28 = aye.z(parcel);
                byte[] bArr12 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        aye.y(parcel, readInt21);
                    } else {
                        bArr12 = aye.b(parcel, readInt21);
                    }
                }
                aye.m(parcel, z28);
                return new rwe(bArr12);
            case 21:
                int z29 = aye.z(parcel);
                String str22 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt22 = parcel.readInt();
                    char c16 = (char) readInt22;
                    if (c16 == 2) {
                        i6 = aye.u(parcel, readInt22);
                    } else if (c16 != 3) {
                        aye.y(parcel, readInt22);
                    } else {
                        str22 = aye.h(parcel, readInt22);
                    }
                }
                aye.m(parcel, z29);
                ve0 ve0Var = new ve0();
                ve0Var.a = i6;
                ve0Var.b = str22;
                return ve0Var;
            case 22:
                int z30 = aye.z(parcel);
                String str23 = null;
                ecd ecdVar = null;
                String str24 = null;
                o9d o9dVar = null;
                o9d o9dVar2 = null;
                String[] strArr2 = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                dr5[] dr5VarArr = null;
                b38 b38Var = null;
                String str25 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str25 = aye.h(parcel, readInt23);
                            break;
                        case 3:
                            str23 = aye.h(parcel, readInt23);
                            break;
                        case 4:
                            ecdVar = (ecd) aye.g(parcel, readInt23, ecd.CREATOR);
                            break;
                        case 5:
                            str24 = aye.h(parcel, readInt23);
                            break;
                        case 6:
                            o9dVar = (o9d) aye.g(parcel, readInt23, o9d.CREATOR);
                            break;
                        case 7:
                            o9dVar2 = (o9d) aye.g(parcel, readInt23, o9d.CREATOR);
                            break;
                        case '\b':
                            strArr2 = aye.i(parcel, readInt23);
                            break;
                        case '\t':
                            userAddress = (UserAddress) aye.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress2 = (UserAddress) aye.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case 11:
                            dr5VarArr = (dr5[]) aye.k(parcel, readInt23, dr5.CREATOR);
                            break;
                        case '\f':
                            b38Var = (b38) aye.g(parcel, readInt23, b38.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt23);
                            break;
                    }
                }
                aye.m(parcel, z30);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str25;
                fullWallet.b = str23;
                fullWallet.c = ecdVar;
                fullWallet.d = str24;
                fullWallet.e = o9dVar;
                fullWallet.f = o9dVar2;
                fullWallet.h = strArr2;
                fullWallet.n = userAddress;
                fullWallet.r = userAddress2;
                fullWallet.s = dr5VarArr;
                fullWallet.w = b38Var;
                return fullWallet;
            case 23:
                int z31 = aye.z(parcel);
                long j2 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt24 = parcel.readInt();
                    char c17 = (char) readInt24;
                    if (c17 == 2) {
                        j = aye.w(parcel, readInt24);
                    } else if (c17 != 3) {
                        aye.y(parcel, readInt24);
                    } else {
                        j2 = aye.w(parcel, readInt24);
                    }
                }
                aye.m(parcel, z31);
                prb prbVar2 = new prb();
                prbVar2.a = j;
                prbVar2.b = j2;
                return prbVar2;
            case 24:
                int z32 = aye.z(parcel);
                boolean z33 = false;
                boolean z34 = false;
                int i14 = 0;
                an9 an9Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            an9Var = (an9) aye.g(parcel, readInt25, an9.CREATOR);
                            break;
                        case 2:
                            z33 = aye.n(parcel, readInt25);
                            break;
                        case 3:
                            z34 = aye.n(parcel, readInt25);
                            break;
                        case 4:
                            iArr = aye.d(parcel, readInt25);
                            break;
                        case 5:
                            i14 = aye.u(parcel, readInt25);
                            break;
                        case 6:
                            iArr2 = aye.d(parcel, readInt25);
                            break;
                        default:
                            aye.y(parcel, readInt25);
                            break;
                    }
                }
                aye.m(parcel, z32);
                return new ys2(an9Var, z33, z34, iArr, i14, iArr2);
            case 25:
                int z35 = aye.z(parcel);
                int i15 = 0;
                String str26 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt26 = parcel.readInt();
                    char c18 = (char) readInt26;
                    if (c18 == 2) {
                        i5 = aye.u(parcel, readInt26);
                    } else if (c18 == 3) {
                        str26 = aye.h(parcel, readInt26);
                    } else if (c18 != 4) {
                        aye.y(parcel, readInt26);
                    } else {
                        i15 = aye.u(parcel, readInt26);
                    }
                }
                aye.m(parcel, z35);
                return new d50(i5, i15, str26);
            case 26:
                int z36 = aye.z(parcel);
                hhf hhfVar = null;
                byte[] bArr13 = null;
                String str27 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt27 = parcel.readInt();
                    char c19 = (char) readInt27;
                    if (c19 == 1) {
                        str27 = aye.h(parcel, readInt27);
                    } else if (c19 == 3) {
                        hhfVar = (hhf) aye.g(parcel, readInt27, hhf.CREATOR);
                    } else if (c19 == 4) {
                        i = aye.u(parcel, readInt27);
                    } else if (c19 != 5) {
                        aye.y(parcel, readInt27);
                    } else {
                        bArr13 = aye.b(parcel, readInt27);
                    }
                }
                aye.m(parcel, z36);
                return new wwe(str27, hhfVar, i, bArr13);
            case 27:
                int z37 = aye.z(parcel);
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt28 = parcel.readInt();
                    char c20 = (char) readInt28;
                    if (c20 == 2) {
                        str29 = aye.h(parcel, readInt28);
                    } else if (c20 == 3) {
                        str28 = aye.h(parcel, readInt28);
                    } else if (c20 != 4) {
                        aye.y(parcel, readInt28);
                    } else {
                        i4 = aye.u(parcel, readInt28);
                    }
                }
                aye.m(parcel, z37);
                ye0 ye0Var = new ye0();
                ye0Var.a = str29;
                ye0Var.b = str28;
                ye0Var.c = i4;
                return ye0Var;
            case 28:
                int z38 = aye.z(parcel);
                int i16 = 0;
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z38) {
                    int readInt29 = parcel.readInt();
                    char c21 = (char) readInt29;
                    if (c21 == 1) {
                        i3 = aye.u(parcel, readInt29);
                    } else if (c21 == 2) {
                        f11 = aye.r(parcel, readInt29);
                    } else if (c21 == 3) {
                        f10 = aye.r(parcel, readInt29);
                    } else if (c21 != 4) {
                        aye.y(parcel, readInt29);
                    } else {
                        i16 = aye.u(parcel, readInt29);
                    }
                }
                aye.m(parcel, z38);
                return new LandmarkParcel(i3, f11, f10, i16);
            default:
                int z39 = aye.z(parcel);
                String str30 = null;
                String str31 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt30 = parcel.readInt();
                    char c22 = (char) readInt30;
                    if (c22 == 2) {
                        str31 = aye.h(parcel, readInt30);
                    } else if (c22 != 3) {
                        aye.y(parcel, readInt30);
                    } else {
                        str30 = aye.h(parcel, readInt30);
                    }
                }
                aye.m(parcel, z39);
                rac racVar = new rac();
                racVar.a = str31;
                racVar.b = str30;
                return racVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new el6[i];
            case 1:
                return new yge[i];
            case 2:
                return new ue0[i];
            case 3:
                return new hi6[i];
            case 4:
                return new bhe[i];
            case 5:
                return new qwe[i];
            case 6:
                return new hme[i];
            case 7:
                return new s18[i];
            case 8:
                return new fs9[i];
            case 9:
                return new te0[i];
            case 10:
                return new gi6[i];
            case 11:
                return new kme[i];
            case 12:
                return new b50[i];
            case 13:
                return new mme[i];
            case 14:
                return new hre[i];
            case 15:
                return new we0[i];
            case 16:
                return new llb[i];
            case 17:
                return new ore[i];
            case 18:
                return new c50[i];
            case 19:
                return new sre[i];
            case 20:
                return new rwe[i];
            case 21:
                return new ve0[i];
            case 22:
                return new FullWallet[i];
            case 23:
                return new prb[i];
            case 24:
                return new ys2[i];
            case 25:
                return new d50[i];
            case 26:
                return new wwe[i];
            case 27:
                return new ye0[i];
            case 28:
                return new LandmarkParcel[i];
            default:
                return new rac[i];
        }
    }
}
