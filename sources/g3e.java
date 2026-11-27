// default package

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g3e implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ g3e(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z2 = false;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        byte[] bArr = null;
        String str3 = null;
        String str4 = null;
        Status status = null;
        wwe[] wweVarArr = null;
        aud audVar = null;
        String str5 = null;
        String str6 = null;
        fjd fjdVar = null;
        String str7 = null;
        ArrayList arrayList2 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        switch (this.a) {
            case 0:
                int z3 = aye.z(parcel);
                while (parcel.dataPosition() < z3) {
                    aye.y(parcel, parcel.readInt());
                }
                aye.m(parcel, z3);
                return new pp5();
            case 1:
                int z4 = aye.z(parcel);
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                oe0 oe0Var = null;
                oe0 oe0Var2 = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = aye.h(parcel, readInt);
                            break;
                        case 3:
                            str13 = aye.h(parcel, readInt);
                            break;
                        case 4:
                            str14 = aye.h(parcel, readInt);
                            break;
                        case 5:
                            str15 = aye.h(parcel, readInt);
                            break;
                        case 6:
                            str16 = aye.h(parcel, readInt);
                            break;
                        case 7:
                            oe0Var = (oe0) aye.g(parcel, readInt, oe0.CREATOR);
                            break;
                        case '\b':
                            oe0Var2 = (oe0) aye.g(parcel, readInt, oe0.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt);
                            break;
                    }
                }
                aye.m(parcel, z4);
                pe0 pe0Var = new pe0();
                pe0Var.a = str;
                pe0Var.b = str13;
                pe0Var.c = str14;
                pe0Var.d = str15;
                pe0Var.e = str16;
                pe0Var.f = oe0Var;
                pe0Var.h = oe0Var2;
                return pe0Var;
            case 2:
                int z5 = aye.z(parcel);
                boolean z6 = true;
                vff vffVar = null;
                byte[] bArr2 = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr3 = null;
                g74[] g74VarArr = null;
                while (parcel.dataPosition() < z5) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            vffVar = (vff) aye.g(parcel, readInt2, vff.CREATOR);
                            break;
                        case 3:
                            bArr2 = aye.b(parcel, readInt2);
                            break;
                        case 4:
                            iArr = aye.d(parcel, readInt2);
                            break;
                        case 5:
                            strArr = aye.i(parcel, readInt2);
                            break;
                        case 6:
                            iArr2 = aye.d(parcel, readInt2);
                            break;
                        case 7:
                            bArr3 = aye.c(parcel, readInt2);
                            break;
                        case '\b':
                            z6 = aye.n(parcel, readInt2);
                            break;
                        case '\t':
                            g74VarArr = (g74[]) aye.k(parcel, readInt2, g74.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt2);
                            break;
                    }
                }
                aye.m(parcel, z5);
                return new cyd(vffVar, bArr2, iArr, strArr, iArr2, bArr3, z6, g74VarArr);
            case 3:
                int z7 = aye.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                String str17 = null;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 2) {
                        str12 = aye.h(parcel, readInt3);
                    } else if (c == 3) {
                        str17 = aye.h(parcel, readInt3);
                    } else if (c != 4) {
                        aye.y(parcel, readInt3);
                    } else {
                        arrayList3 = aye.l(parcel, readInt3, yy5.CREATOR);
                    }
                }
                aye.m(parcel, z7);
                zy5 zy5Var = new zy5();
                zy5Var.a = str12;
                zy5Var.b = str17;
                zy5Var.c = arrayList3;
                return zy5Var;
            case 4:
                int z8 = aye.z(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        str11 = aye.h(parcel, readInt4);
                    } else if (c2 == 2) {
                        i = aye.u(parcel, readInt4);
                    } else if (c2 != 3) {
                        aye.y(parcel, readInt4);
                    } else {
                        i15 = aye.u(parcel, readInt4);
                    }
                }
                aye.m(parcel, z8);
                return new qqe(str11, i, i15);
            case 5:
                int z9 = aye.z(parcel);
                byte[] bArr4 = null;
                String str18 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 2) {
                        i14 = aye.u(parcel, readInt5);
                    } else if (c3 == 3) {
                        str10 = aye.h(parcel, readInt5);
                    } else if (c3 == 4) {
                        bArr4 = aye.b(parcel, readInt5);
                    } else if (c3 != 5) {
                        aye.y(parcel, readInt5);
                    } else {
                        str18 = aye.h(parcel, readInt5);
                    }
                }
                aye.m(parcel, z9);
                return new x9e(i14, str10, str18, bArr4);
            case 6:
                int z10 = aye.z(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 2) {
                        d = aye.q(parcel, readInt6);
                    } else if (c4 != 3) {
                        aye.y(parcel, readInt6);
                    } else {
                        d2 = aye.q(parcel, readInt6);
                    }
                }
                aye.m(parcel, z10);
                return new LatLng(d, d2);
            case 7:
                int z11 = aye.z(parcel);
                while (parcel.dataPosition() < z11) {
                    aye.y(parcel, parcel.readInt());
                }
                aye.m(parcel, z11);
                return new qp5();
            case 8:
                int z12 = aye.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        aye.y(parcel, readInt7);
                    } else {
                        str9 = aye.h(parcel, readInt7);
                    }
                }
                aye.m(parcel, z12);
                return new h3e(str9);
            case 9:
                int z13 = aye.z(parcel);
                String str19 = null;
                String str20 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 2) {
                        i13 = aye.u(parcel, readInt8);
                    } else if (c5 == 3) {
                        str8 = aye.h(parcel, readInt8);
                    } else if (c5 == 4) {
                        str19 = aye.h(parcel, readInt8);
                    } else if (c5 != 5) {
                        aye.y(parcel, readInt8);
                    } else {
                        str20 = aye.h(parcel, readInt8);
                    }
                }
                aye.m(parcel, z13);
                se0 se0Var = new se0();
                se0Var.a = i13;
                se0Var.b = str8;
                se0Var.c = str19;
                se0Var.d = str20;
                return se0Var;
            case 10:
                int z14 = aye.z(parcel);
                boolean z15 = true;
                int i16 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        arrayList2 = aye.e(parcel, readInt9);
                    } else if (c6 == 2) {
                        z15 = aye.n(parcel, readInt9);
                    } else if (c6 == 3) {
                        z2 = aye.n(parcel, readInt9);
                    } else if (c6 != 4) {
                        aye.y(parcel, readInt9);
                    } else {
                        i16 = aye.u(parcel, readInt9);
                    }
                }
                aye.m(parcel, z14);
                cd1 cd1Var = new cd1();
                cd1Var.a = arrayList2;
                cd1Var.b = z15;
                cd1Var.c = z2;
                cd1Var.d = i16;
                return cd1Var;
            case 11:
                int z16 = aye.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        aye.y(parcel, readInt10);
                    } else {
                        i12 = aye.u(parcel, readInt10);
                    }
                }
                aye.m(parcel, z16);
                return new j3e(i12);
            case 12:
                int z17 = aye.z(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt11 = parcel.readInt();
                    char c7 = (char) readInt11;
                    if (c7 == 1) {
                        bArr5 = aye.b(parcel, readInt11);
                    } else if (c7 != 2) {
                        aye.y(parcel, readInt11);
                    } else {
                        bArr6 = aye.b(parcel, readInt11);
                    }
                }
                aye.m(parcel, z17);
                return new m3e(bArr5 == null ? null : gfe.o(bArr5.length, bArr5), bArr6 != null ? gfe.o(bArr6.length, bArr6) : null);
            case 13:
                int z18 = aye.z(parcel);
                boolean z19 = false;
                String str21 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 2) {
                        str7 = aye.h(parcel, readInt12);
                    } else if (c8 == 3) {
                        str21 = aye.h(parcel, readInt12);
                    } else if (c8 == 4) {
                        i11 = aye.u(parcel, readInt12);
                    } else if (c8 != 5) {
                        aye.y(parcel, readInt12);
                    } else {
                        z19 = aye.n(parcel, readInt12);
                    }
                }
                aye.m(parcel, z18);
                return new qde(i11, str7, str21, z19);
            case 14:
                int z20 = aye.z(parcel);
                while (parcel.dataPosition() < z20) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 2) {
                        i10 = aye.u(parcel, readInt13);
                    } else if (c9 != 3) {
                        aye.y(parcel, readInt13);
                    } else {
                        fjdVar = (fjd) aye.g(parcel, readInt13, fjd.CREATOR);
                    }
                }
                aye.m(parcel, z20);
                return new cee(i10, fjdVar);
            case 15:
                int z21 = aye.z(parcel);
                String str22 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 2) {
                        str6 = aye.h(parcel, readInt14);
                    } else if (c10 == 3) {
                        str22 = aye.h(parcel, readInt14);
                    } else if (c10 != 4) {
                        aye.y(parcel, readInt14);
                    } else {
                        j = aye.w(parcel, readInt14);
                    }
                }
                aye.m(parcel, z21);
                return new mee(j, str6, str22);
            case 16:
                int z22 = aye.z(parcel);
                while (parcel.dataPosition() < z22) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 2) {
                        i9 = aye.u(parcel, readInt15);
                    } else if (c11 != 3) {
                        aye.y(parcel, readInt15);
                    } else {
                        str5 = aye.h(parcel, readInt15);
                    }
                }
                aye.m(parcel, z22);
                return new afe(i9, str5);
            case 17:
                int z23 = aye.z(parcel);
                while (parcel.dataPosition() < z23) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 2) {
                        i8 = aye.u(parcel, readInt16);
                    } else if (c12 != 3) {
                        aye.y(parcel, readInt16);
                    } else {
                        audVar = (aud) aye.g(parcel, readInt16, aud.CREATOR);
                    }
                }
                aye.m(parcel, z23);
                return new mfe(i8, audVar);
            case 18:
                int z24 = aye.z(parcel);
                while (parcel.dataPosition() < z24) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 2) {
                        aye.y(parcel, readInt17);
                    } else {
                        i7 = aye.u(parcel, readInt17);
                    }
                }
                aye.m(parcel, z24);
                return new kge(i7);
            case 19:
                int z25 = aye.z(parcel);
                String str23 = null;
                Account account = null;
                while (parcel.dataPosition() < z25) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        wweVarArr = (wwe[]) aye.k(parcel, readInt18, wwe.CREATOR);
                    } else if (c13 == 2) {
                        str23 = aye.h(parcel, readInt18);
                    } else if (c13 == 3) {
                        z = aye.n(parcel, readInt18);
                    } else if (c13 != 4) {
                        aye.y(parcel, readInt18);
                    } else {
                        account = (Account) aye.g(parcel, readInt18, Account.CREATOR);
                    }
                }
                aye.m(parcel, z25);
                return new lae(wweVarArr, str23, z, account);
            case 20:
                int z26 = aye.z(parcel);
                while (parcel.dataPosition() < z26) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        aye.y(parcel, readInt19);
                    } else {
                        status = (Status) aye.g(parcel, readInt19, Status.CREATOR);
                    }
                }
                aye.m(parcel, z26);
                return new mae(status);
            case 21:
                int z27 = aye.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z27) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 == 2) {
                        i6 = aye.u(parcel, readInt20);
                    } else if (c14 == 3) {
                        i17 = aye.u(parcel, readInt20);
                    } else if (c14 != 4) {
                        aye.y(parcel, readInt20);
                    } else {
                        i18 = aye.u(parcel, readInt20);
                    }
                }
                aye.m(parcel, z27);
                return new hm5(i6, i17, i18);
            case 22:
                int z28 = aye.z(parcel);
                while (parcel.dataPosition() < z28) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        aye.y(parcel, readInt21);
                    } else {
                        str4 = aye.h(parcel, readInt21);
                    }
                }
                aye.m(parcel, z28);
                return new kk6(str4);
            case 23:
                int z29 = aye.z(parcel);
                String str24 = null;
                byte[] bArr7 = null;
                byte[][] bArr8 = null;
                byte[][] bArr9 = null;
                byte[][] bArr10 = null;
                byte[][] bArr11 = null;
                int[] iArr3 = null;
                byte[][] bArr12 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str24 = aye.h(parcel, readInt22);
                            break;
                        case 3:
                            bArr7 = aye.b(parcel, readInt22);
                            break;
                        case 4:
                            bArr8 = aye.c(parcel, readInt22);
                            break;
                        case 5:
                            bArr9 = aye.c(parcel, readInt22);
                            break;
                        case 6:
                            bArr10 = aye.c(parcel, readInt22);
                            break;
                        case 7:
                            bArr11 = aye.c(parcel, readInt22);
                            break;
                        case '\b':
                            iArr3 = aye.d(parcel, readInt22);
                            break;
                        case '\t':
                            bArr12 = aye.c(parcel, readInt22);
                            break;
                        default:
                            aye.y(parcel, readInt22);
                            break;
                    }
                }
                aye.m(parcel, z29);
                return new g74(str24, bArr7, bArr8, bArr9, bArr10, bArr11, iArr3, bArr12);
            case 24:
                int z30 = aye.z(parcel);
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt23 = parcel.readInt();
                    String str38 = str37;
                    switch ((char) readInt23) {
                        case 2:
                            str3 = aye.h(parcel, readInt23);
                            break;
                        case 3:
                            str26 = aye.h(parcel, readInt23);
                            break;
                        case 4:
                            str27 = aye.h(parcel, readInt23);
                            break;
                        case 5:
                            str28 = aye.h(parcel, readInt23);
                            break;
                        case 6:
                            str29 = aye.h(parcel, readInt23);
                            break;
                        case 7:
                            str30 = aye.h(parcel, readInt23);
                            break;
                        case '\b':
                            str31 = aye.h(parcel, readInt23);
                            break;
                        case '\t':
                            str32 = aye.h(parcel, readInt23);
                            break;
                        case '\n':
                            str33 = aye.h(parcel, readInt23);
                            break;
                        case 11:
                            str34 = aye.h(parcel, readInt23);
                            break;
                        case '\f':
                            str35 = aye.h(parcel, readInt23);
                            break;
                        case '\r':
                            str36 = aye.h(parcel, readInt23);
                            break;
                        case 14:
                            str37 = aye.h(parcel, readInt23);
                            continue;
                        case 15:
                            str25 = aye.h(parcel, readInt23);
                            break;
                        default:
                            aye.y(parcel, readInt23);
                            break;
                    }
                    str37 = str38;
                }
                aye.m(parcel, z30);
                re0 re0Var = new re0();
                re0Var.a = str3;
                re0Var.b = str26;
                re0Var.c = str27;
                re0Var.d = str28;
                re0Var.e = str29;
                re0Var.f = str30;
                re0Var.h = str31;
                re0Var.n = str32;
                re0Var.r = str33;
                re0Var.s = str34;
                re0Var.w = str35;
                re0Var.x = str36;
                re0Var.y = str37;
                re0Var.E = str25;
                return re0Var;
            case 25:
                return new BinderWrapper(parcel);
            case 26:
                int z31 = aye.z(parcel);
                int i19 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt24 = parcel.readInt();
                    char c15 = (char) readInt24;
                    if (c15 == 1) {
                        i5 = aye.u(parcel, readInt24);
                    } else if (c15 == 2) {
                        i19 = aye.u(parcel, readInt24);
                    } else if (c15 != 3) {
                        aye.y(parcel, readInt24);
                    } else {
                        bArr = aye.b(parcel, readInt24);
                    }
                }
                aye.m(parcel, z31);
                return new jhe(i5, i19, bArr);
            case 27:
                int z32 = aye.z(parcel);
                int i20 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt25 = parcel.readInt();
                    char c16 = (char) readInt25;
                    if (c16 == 2) {
                        i4 = aye.u(parcel, readInt25);
                    } else if (c16 != 3) {
                        aye.y(parcel, readInt25);
                    } else {
                        i20 = aye.u(parcel, readInt25);
                    }
                }
                aye.m(parcel, z32);
                return new vhe(i4, i20);
            case 28:
                int z33 = aye.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt26 = parcel.readInt();
                    char c17 = (char) readInt26;
                    if (c17 == 2) {
                        i3 = aye.u(parcel, readInt26);
                    } else if (c17 == 3) {
                        j = aye.w(parcel, readInt26);
                    } else if (c17 != 4) {
                        aye.y(parcel, readInt26);
                    } else {
                        arrayList = aye.l(parcel, readInt26, mee.CREATOR);
                    }
                }
                aye.m(parcel, z33);
                return new nie(i3, j, arrayList);
            default:
                int z34 = aye.z(parcel);
                float f = 0.0f;
                String str39 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt27 = parcel.readInt();
                    char c18 = (char) readInt27;
                    if (c18 == 2) {
                        str39 = aye.h(parcel, readInt27);
                    } else if (c18 == 3) {
                        f = aye.r(parcel, readInt27);
                    } else if (c18 == 4) {
                        str2 = aye.h(parcel, readInt27);
                    } else if (c18 != 5) {
                        aye.y(parcel, readInt27);
                    } else {
                        i2 = aye.u(parcel, readInt27);
                    }
                }
                aye.m(parcel, z34);
                return new tge(f, i2, str2, str39);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new pp5[i];
            case 1:
                return new pe0[i];
            case 2:
                return new cyd[i];
            case 3:
                return new zy5[i];
            case 4:
                return new qqe[i];
            case 5:
                return new x9e[i];
            case 6:
                return new LatLng[i];
            case 7:
                return new qp5[i];
            case 8:
                return new h3e[i];
            case 9:
                return new se0[i];
            case 10:
                return new cd1[i];
            case 11:
                return new j3e[i];
            case 12:
                return new m3e[i];
            case 13:
                return new qde[i];
            case 14:
                return new cee[i];
            case 15:
                return new mee[i];
            case 16:
                return new afe[i];
            case 17:
                return new mfe[i];
            case 18:
                return new kge[i];
            case 19:
                return new lae[i];
            case 20:
                return new mae[i];
            case 21:
                return new hm5[i];
            case 22:
                return new kk6[i];
            case 23:
                return new g74[i];
            case 24:
                return new re0[i];
            case 25:
                return new BinderWrapper[i];
            case 26:
                return new jhe[i];
            case 27:
                return new vhe[i];
            case 28:
                return new nie[i];
            default:
                return new tge[i];
        }
    }
}
