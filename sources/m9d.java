// default package

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.identity.intents.model.UserAddress;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class m9d implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ m9d(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = 0;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        byte[][] bArr = null;
        String str6 = null;
        String str7 = null;
        Bundle bundle = null;
        String str8 = null;
        xr xrVar = null;
        cd1 cd1Var = null;
        String str9 = null;
        Status status = null;
        Intent intent = null;
        switch (this.a) {
            case 0:
                int z7 = aye.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        i = aye.u(parcel, readInt);
                    } else if (c != 3) {
                        aye.y(parcel, readInt);
                    } else {
                        strArr = aye.i(parcel, readInt);
                    }
                }
                aye.m(parcel, z7);
                ne0 ne0Var = new ne0();
                ne0Var.a = i;
                ne0Var.b = strArr;
                return ne0Var;
            case 1:
                int z8 = aye.z(parcel);
                while (parcel.dataPosition() < z8) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        aye.y(parcel, readInt2);
                    } else {
                        intent = (Intent) aye.g(parcel, readInt2, Intent.CREATOR);
                    }
                }
                aye.m(parcel, z8);
                return new wj2(intent);
            case 2:
                int z9 = aye.z(parcel);
                int i8 = 0;
                int i9 = 0;
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                while (parcel.dataPosition() < z9) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i8 = aye.u(parcel, readInt3);
                    } else if (c2 == 2) {
                        i9 = aye.u(parcel, readInt3);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) aye.g(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c2 == 4) {
                        str10 = aye.h(parcel, readInt3);
                    } else if (c2 != 5) {
                        aye.y(parcel, readInt3);
                    } else {
                        num = aye.v(parcel, readInt3);
                    }
                }
                aye.m(parcel, z9);
                return new ws2(i8, i9, pendingIntent, str10, num);
            case 3:
                int z10 = aye.z(parcel);
                qd6 qd6Var = null;
                while (parcel.dataPosition() < z10) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        status = (Status) aye.g(parcel, readInt4, Status.CREATOR);
                    } else if (c3 != 2) {
                        aye.y(parcel, readInt4);
                    } else {
                        qd6Var = (qd6) aye.g(parcel, readInt4, qd6.CREATOR);
                    }
                }
                aye.m(parcel, z10);
                return new pd6(status, qd6Var);
            case 4:
                int z11 = aye.z(parcel);
                bd1 bd1Var = null;
                UserAddress userAddress = null;
                b38 b38Var = null;
                String str11 = null;
                Bundle bundle2 = null;
                String str12 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str9 = aye.h(parcel, readInt5);
                            break;
                        case 2:
                            bd1Var = (bd1) aye.g(parcel, readInt5, bd1.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) aye.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 4:
                            b38Var = (b38) aye.g(parcel, readInt5, b38.CREATOR);
                            break;
                        case 5:
                            str11 = aye.h(parcel, readInt5);
                            break;
                        case 6:
                            bundle2 = aye.a(parcel, readInt5);
                            break;
                        case 7:
                            str12 = aye.h(parcel, readInt5);
                            break;
                        case '\b':
                            bundle3 = aye.a(parcel, readInt5);
                            break;
                        default:
                            aye.y(parcel, readInt5);
                            break;
                    }
                }
                aye.m(parcel, z11);
                u18 u18Var = new u18();
                u18Var.a = str9;
                u18Var.b = bd1Var;
                u18Var.c = userAddress;
                u18Var.d = b38Var;
                u18Var.e = str11;
                u18Var.f = bundle2;
                u18Var.h = str12;
                u18Var.n = bundle3;
                return u18Var;
            case 5:
                int z12 = aye.z(parcel);
                long j2 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                boolean z13 = false;
                boolean z14 = false;
                ArrayList arrayList2 = null;
                int[] iArr = null;
                String str13 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < z12) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            arrayList2 = aye.j(parcel, readInt6);
                            break;
                        case 3:
                            iArr = aye.d(parcel, readInt6);
                            break;
                        case 4:
                            j2 = aye.w(parcel, readInt6);
                            break;
                        case 5:
                            str13 = aye.h(parcel, readInt6);
                            break;
                        case 6:
                            i10 = aye.u(parcel, readInt6);
                            break;
                        case 7:
                            i11 = aye.u(parcel, readInt6);
                            break;
                        case '\b':
                            i12 = aye.u(parcel, readInt6);
                            break;
                        case '\t':
                            i13 = aye.u(parcel, readInt6);
                            break;
                        case '\n':
                            i14 = aye.u(parcel, readInt6);
                            break;
                        case 11:
                            i15 = aye.u(parcel, readInt6);
                            break;
                        case '\f':
                            i16 = aye.u(parcel, readInt6);
                            break;
                        case '\r':
                            i17 = aye.u(parcel, readInt6);
                            break;
                        case 14:
                            i18 = aye.u(parcel, readInt6);
                            break;
                        case 15:
                            i19 = aye.u(parcel, readInt6);
                            break;
                        case 16:
                            i20 = aye.u(parcel, readInt6);
                            break;
                        case 17:
                            i21 = aye.u(parcel, readInt6);
                            break;
                        case 18:
                            i22 = aye.u(parcel, readInt6);
                            break;
                        case 19:
                            i23 = aye.u(parcel, readInt6);
                            break;
                        case 20:
                            i24 = aye.u(parcel, readInt6);
                            break;
                        case 21:
                            i25 = aye.u(parcel, readInt6);
                            break;
                        case 22:
                            i26 = aye.u(parcel, readInt6);
                            break;
                        case 23:
                            i27 = aye.u(parcel, readInt6);
                            break;
                        case 24:
                            i28 = aye.u(parcel, readInt6);
                            break;
                        case 25:
                            i29 = aye.u(parcel, readInt6);
                            break;
                        case 26:
                            i30 = aye.u(parcel, readInt6);
                            break;
                        case 27:
                            i31 = aye.u(parcel, readInt6);
                            break;
                        case 28:
                            i32 = aye.u(parcel, readInt6);
                            break;
                        case 29:
                            i33 = aye.u(parcel, readInt6);
                            break;
                        case jn7.S /* 30 */:
                            i34 = aye.u(parcel, readInt6);
                            break;
                        case 31:
                            i35 = aye.u(parcel, readInt6);
                            break;
                        case ' ':
                            i36 = aye.u(parcel, readInt6);
                            break;
                        case '!':
                            iBinder = aye.t(parcel, readInt6);
                            break;
                        case '\"':
                            z13 = aye.n(parcel, readInt6);
                            break;
                        case '#':
                            z14 = aye.n(parcel, readInt6);
                            break;
                        default:
                            aye.y(parcel, readInt6);
                            break;
                    }
                }
                aye.m(parcel, z12);
                return new po7(arrayList2, iArr, j2, str13, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder, z13, z14);
            case 6:
                int z15 = aye.z(parcel);
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 2) {
                        i7 = aye.u(parcel, readInt7);
                    } else if (c4 == 3) {
                        z16 = aye.n(parcel, readInt7);
                    } else if (c4 != 4) {
                        aye.y(parcel, readInt7);
                    } else {
                        z17 = aye.n(parcel, readInt7);
                    }
                }
                aye.m(parcel, z15);
                return new rmf(i7, z16, z17);
            case 7:
                int z18 = aye.z(parcel);
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        aye.y(parcel, readInt8);
                    } else {
                        z6 = aye.n(parcel, readInt8);
                    }
                }
                aye.m(parcel, z18);
                return new mmf(z6);
            case 8:
                int z19 = aye.z(parcel);
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            z20 = aye.n(parcel, readInt9);
                            break;
                        case 2:
                            z21 = aye.n(parcel, readInt9);
                            break;
                        case 3:
                            z22 = aye.n(parcel, readInt9);
                            break;
                        case 4:
                            z23 = aye.n(parcel, readInt9);
                            break;
                        case 5:
                            z24 = aye.n(parcel, readInt9);
                            break;
                        case 6:
                            z25 = aye.n(parcel, readInt9);
                            break;
                        default:
                            aye.y(parcel, readInt9);
                            break;
                    }
                }
                aye.m(parcel, z19);
                return new qd6(z20, z21, z22, z23, z24, z25);
            case 9:
                int z26 = aye.z(parcel);
                boolean z27 = false;
                boolean z28 = false;
                eka ekaVar = null;
                ArrayList arrayList3 = null;
                c38 c38Var = null;
                m2c m2cVar = null;
                String str14 = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            z5 = aye.n(parcel, readInt10);
                            break;
                        case 2:
                            z27 = aye.n(parcel, readInt10);
                            break;
                        case 3:
                            cd1Var = (cd1) aye.g(parcel, readInt10, cd1.CREATOR);
                            break;
                        case 4:
                            z28 = aye.n(parcel, readInt10);
                            break;
                        case 5:
                            ekaVar = (eka) aye.g(parcel, readInt10, eka.CREATOR);
                            break;
                        case 6:
                            arrayList3 = aye.e(parcel, readInt10);
                            break;
                        case 7:
                            c38Var = (c38) aye.g(parcel, readInt10, c38.CREATOR);
                            break;
                        case '\b':
                            m2cVar = (m2c) aye.g(parcel, readInt10, m2c.CREATOR);
                            break;
                        case '\t':
                            z = aye.n(parcel, readInt10);
                            break;
                        case '\n':
                            str14 = aye.h(parcel, readInt10);
                            break;
                        case 11:
                            bundle4 = aye.a(parcel, readInt10);
                            break;
                        default:
                            aye.y(parcel, readInt10);
                            break;
                    }
                }
                aye.m(parcel, z26);
                v18 v18Var = new v18();
                v18Var.a = z5;
                v18Var.b = z27;
                v18Var.c = cd1Var;
                v18Var.d = z28;
                v18Var.e = ekaVar;
                v18Var.f = arrayList3;
                v18Var.h = c38Var;
                v18Var.n = m2cVar;
                v18Var.r = z;
                v18Var.s = str14;
                v18Var.w = bundle4;
                return v18Var;
            case 10:
                int z29 = aye.z(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                int i37 = 0;
                int i38 = 0;
                ued uedVar = null;
                while (parcel.dataPosition() < z29) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            d = aye.q(parcel, readInt11);
                            break;
                        case 3:
                            z4 = aye.n(parcel, readInt11);
                            break;
                        case 4:
                            i37 = aye.u(parcel, readInt11);
                            break;
                        case 5:
                            xrVar = (xr) aye.g(parcel, readInt11, xr.CREATOR);
                            break;
                        case 6:
                            i38 = aye.u(parcel, readInt11);
                            break;
                        case 7:
                            uedVar = (ued) aye.g(parcel, readInt11, ued.CREATOR);
                            break;
                        case '\b':
                            d2 = aye.q(parcel, readInt11);
                            break;
                        default:
                            aye.y(parcel, readInt11);
                            break;
                    }
                }
                aye.m(parcel, z29);
                fad fadVar = new fad();
                fadVar.a = d;
                fadVar.b = z4;
                fadVar.c = i37;
                fadVar.d = xrVar;
                fadVar.e = i38;
                fadVar.f = uedVar;
                fadVar.h = d2;
                return fadVar;
            case 11:
                int z30 = aye.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        aye.y(parcel, readInt12);
                    } else {
                        j = aye.w(parcel, readInt12);
                    }
                }
                aye.m(parcel, z30);
                return new gad(j);
            case 12:
                int z31 = aye.z(parcel);
                long j3 = -1;
                long j4 = -1;
                int i39 = 1;
                int i40 = 1;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    char c5 = (char) readInt13;
                    if (c5 == 1) {
                        i39 = aye.u(parcel, readInt13);
                    } else if (c5 == 2) {
                        i40 = aye.u(parcel, readInt13);
                    } else if (c5 == 3) {
                        j3 = aye.w(parcel, readInt13);
                    } else if (c5 != 4) {
                        aye.y(parcel, readInt13);
                    } else {
                        j4 = aye.w(parcel, readInt13);
                    }
                }
                aye.m(parcel, z31);
                return new oad(i39, i40, j3, j4);
            case 13:
                int z32 = aye.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    char c6 = (char) readInt14;
                    if (c6 == 2) {
                        i6 = aye.u(parcel, readInt14);
                    } else if (c6 != 3) {
                        aye.y(parcel, readInt14);
                    } else {
                        str8 = aye.h(parcel, readInt14);
                    }
                }
                aye.m(parcel, z32);
                b38 b38Var2 = new b38();
                b38Var2.a = i6;
                b38Var2.b = str8;
                return b38Var2;
            case 14:
                int z33 = aye.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        aye.y(parcel, readInt15);
                    } else {
                        z3 = aye.n(parcel, readInt15);
                    }
                }
                aye.m(parcel, z33);
                return new sad(z3);
            case 15:
                int z34 = aye.z(parcel);
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    char c7 = (char) readInt16;
                    if (c7 == 2) {
                        i5 = aye.u(parcel, readInt16);
                    } else if (c7 != 3) {
                        aye.y(parcel, readInt16);
                    } else {
                        bundle = aye.a(parcel, readInt16);
                    }
                }
                aye.m(parcel, z34);
                c38 c38Var2 = new c38();
                c38Var2.a = i5;
                c38Var2.b = bundle;
                return c38Var2;
            case 16:
                int z35 = aye.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        aye.y(parcel, readInt17);
                    } else {
                        z2 = aye.n(parcel, readInt17);
                    }
                }
                aye.m(parcel, z35);
                return new h15(z2);
            case 17:
                int z36 = aye.z(parcel);
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                boolean z37 = false;
                boolean z38 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt18 = parcel.readInt();
                    char c8 = (char) readInt18;
                    if (c8 == 1) {
                        i41 = aye.u(parcel, readInt18);
                    } else if (c8 == 2) {
                        z37 = aye.n(parcel, readInt18);
                    } else if (c8 == 3) {
                        z38 = aye.n(parcel, readInt18);
                    } else if (c8 == 4) {
                        i42 = aye.u(parcel, readInt18);
                    } else if (c8 != 5) {
                        aye.y(parcel, readInt18);
                    } else {
                        i43 = aye.u(parcel, readInt18);
                    }
                }
                aye.m(parcel, z36);
                return new an9(i41, i42, i43, z37, z38);
            case 18:
                int z39 = aye.z(parcel);
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        aye.y(parcel, readInt19);
                    } else {
                        str7 = aye.h(parcel, readInt19);
                    }
                }
                aye.m(parcel, z39);
                return new lbd(str7);
            case 19:
                int z40 = aye.z(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    char c9 = (char) readInt20;
                    if (c9 == 1) {
                        bArr2 = aye.b(parcel, readInt20);
                    } else if (c9 == 2) {
                        bArr3 = aye.b(parcel, readInt20);
                    } else if (c9 == 3) {
                        bArr4 = aye.b(parcel, readInt20);
                    } else if (c9 != 4) {
                        aye.y(parcel, readInt20);
                    } else {
                        i4 = aye.u(parcel, readInt20);
                    }
                }
                aye.m(parcel, z40);
                return new wbd(bArr2 == null ? null : gfe.o(bArr2.length, bArr2), bArr3 == null ? null : gfe.o(bArr3.length, bArr3), bArr4 != null ? gfe.o(bArr4.length, bArr4) : null, i4);
            case 20:
                int z41 = aye.z(parcel);
                int i44 = 0;
                String str15 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c10 = (char) readInt21;
                    if (c10 == 2) {
                        str6 = aye.h(parcel, readInt21);
                    } else if (c10 == 3) {
                        str15 = aye.h(parcel, readInt21);
                    } else if (c10 == 4) {
                        i3 = aye.u(parcel, readInt21);
                    } else if (c10 != 5) {
                        aye.y(parcel, readInt21);
                    } else {
                        i44 = aye.u(parcel, readInt21);
                    }
                }
                aye.m(parcel, z41);
                return new ecd(i3, i44, str6, str15);
            case 21:
                int z42 = aye.z(parcel);
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        aye.y(parcel, readInt22);
                    } else {
                        bArr = aye.c(parcel, readInt22);
                    }
                }
                aye.m(parcel, z42);
                return new pcd(bArr);
            case 22:
                int z43 = aye.z(parcel);
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        aye.y(parcel, readInt23);
                    } else {
                        arrayList = aye.j(parcel, readInt23);
                    }
                }
                aye.m(parcel, z43);
                eka ekaVar2 = new eka();
                ekaVar2.a = arrayList;
                return ekaVar2;
            case 23:
                int z44 = aye.z(parcel);
                yx8 yx8Var = null;
                by8 by8Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList4 = null;
                Double d3 = null;
                ArrayList arrayList5 = null;
                f50 f50Var = null;
                Integer num2 = null;
                aub aubVar = null;
                String str16 = null;
                y40 y40Var = null;
                String str17 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z44) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            yx8Var = (yx8) aye.g(parcel, readInt24, yx8.CREATOR);
                            break;
                        case 3:
                            by8Var = (by8) aye.g(parcel, readInt24, by8.CREATOR);
                            break;
                        case 4:
                            bArr5 = aye.b(parcel, readInt24);
                            break;
                        case 5:
                            arrayList4 = aye.l(parcel, readInt24, xx8.CREATOR);
                            break;
                        case 6:
                            int x = aye.x(parcel, readInt24);
                            if (x != 0) {
                                aye.B(parcel, x, 8);
                                d3 = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d3 = null;
                                break;
                            }
                        case 7:
                            arrayList5 = aye.l(parcel, readInt24, wx8.CREATOR);
                            break;
                        case '\b':
                            f50Var = (f50) aye.g(parcel, readInt24, f50.CREATOR);
                            break;
                        case '\t':
                            num2 = aye.v(parcel, readInt24);
                            break;
                        case '\n':
                            aubVar = (aub) aye.g(parcel, readInt24, aub.CREATOR);
                            break;
                        case 11:
                            str16 = aye.h(parcel, readInt24);
                            break;
                        case '\f':
                            y40Var = (y40) aye.g(parcel, readInt24, y40.CREATOR);
                            break;
                        case '\r':
                            str17 = aye.h(parcel, readInt24);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) aye.g(parcel, readInt24, ResultReceiver.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt24);
                            break;
                    }
                }
                aye.m(parcel, z44);
                return new vx8(yx8Var, by8Var, bArr5, arrayList4, d3, arrayList5, f50Var, num2, aubVar, str16, y40Var, str17, resultReceiver);
            case 24:
                int z45 = aye.z(parcel);
                String str18 = null;
                String str19 = null;
                byte[] bArr6 = null;
                c50 c50Var = null;
                b50 b50Var = null;
                d50 d50Var = null;
                z40 z40Var = null;
                String str20 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str18 = aye.h(parcel, readInt25);
                            break;
                        case 2:
                            str19 = aye.h(parcel, readInt25);
                            break;
                        case 3:
                            bArr6 = aye.b(parcel, readInt25);
                            break;
                        case 4:
                            c50Var = (c50) aye.g(parcel, readInt25, c50.CREATOR);
                            break;
                        case 5:
                            b50Var = (b50) aye.g(parcel, readInt25, b50.CREATOR);
                            break;
                        case 6:
                            d50Var = (d50) aye.g(parcel, readInt25, d50.CREATOR);
                            break;
                        case 7:
                            z40Var = (z40) aye.g(parcel, readInt25, z40.CREATOR);
                            break;
                        case '\b':
                            str20 = aye.h(parcel, readInt25);
                            break;
                        case '\t':
                            aye.h(parcel, readInt25);
                            break;
                        default:
                            aye.y(parcel, readInt25);
                            break;
                    }
                }
                aye.m(parcel, z45);
                return new tx8(str18, str19, bArr6, c50Var, b50Var, d50Var, z40Var, str20);
            case 25:
                int z46 = aye.z(parcel);
                String str21 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt26 = parcel.readInt();
                    char c11 = (char) readInt26;
                    if (c11 == 1) {
                        i2 = aye.u(parcel, readInt26);
                    } else if (c11 == 2) {
                        str5 = aye.h(parcel, readInt26);
                    } else if (c11 != 3) {
                        aye.y(parcel, readInt26);
                    } else {
                        str21 = aye.h(parcel, readInt26);
                    }
                }
                aye.m(parcel, z46);
                m2c m2cVar2 = new m2c();
                m2cVar2.a = i2;
                m2cVar2.b = str5;
                m2cVar2.c = str21;
                return m2cVar2;
            case 26:
                int z47 = aye.z(parcel);
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt27 = parcel.readInt();
                    char c12 = (char) readInt27;
                    if (c12 == 2) {
                        str4 = aye.h(parcel, readInt27);
                    } else if (c12 != 3) {
                        aye.y(parcel, readInt27);
                    } else {
                        arrayList6 = aye.l(parcel, readInt27, qde.CREATOR);
                    }
                }
                aye.m(parcel, z47);
                return new idd(str4, arrayList6);
            case 27:
                int z48 = aye.z(parcel);
                byte[] bArr7 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt28 = parcel.readInt();
                    char c13 = (char) readInt28;
                    if (c13 == 2) {
                        str3 = aye.h(parcel, readInt28);
                    } else if (c13 == 3) {
                        bArr7 = aye.b(parcel, readInt28);
                    } else if (c13 != 4) {
                        aye.y(parcel, readInt28);
                    } else {
                        arrayList7 = aye.l(parcel, readInt28, Transport.CREATOR);
                    }
                }
                aye.m(parcel, z48);
                return new wx8(str3, bArr7, arrayList7);
            case 28:
                int z49 = aye.z(parcel);
                Integer num3 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt29 = parcel.readInt();
                    char c14 = (char) readInt29;
                    if (c14 == 2) {
                        str2 = aye.h(parcel, readInt29);
                    } else if (c14 != 3) {
                        aye.y(parcel, readInt29);
                    } else {
                        num3 = aye.v(parcel, readInt29);
                    }
                }
                aye.m(parcel, z49);
                return new xx8(str2, num3.intValue());
            default:
                int z50 = aye.z(parcel);
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < z50) {
                    int readInt30 = parcel.readInt();
                    char c15 = (char) readInt30;
                    if (c15 == 2) {
                        str = aye.h(parcel, readInt30);
                    } else if (c15 == 3) {
                        str22 = aye.h(parcel, readInt30);
                    } else if (c15 != 4) {
                        aye.y(parcel, readInt30);
                    } else {
                        str23 = aye.h(parcel, readInt30);
                    }
                }
                aye.m(parcel, z50);
                return new yx8(str, str22, str23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ne0[i];
            case 1:
                return new wj2[i];
            case 2:
                return new ws2[i];
            case 3:
                return new pd6[i];
            case 4:
                return new u18[i];
            case 5:
                return new po7[i];
            case 6:
                return new rmf[i];
            case 7:
                return new mmf[i];
            case 8:
                return new qd6[i];
            case 9:
                return new v18[i];
            case 10:
                return new fad[i];
            case 11:
                return new gad[i];
            case 12:
                return new oad[i];
            case 13:
                return new b38[i];
            case 14:
                return new sad[i];
            case 15:
                return new c38[i];
            case 16:
                return new h15[i];
            case 17:
                return new an9[i];
            case 18:
                return new lbd[i];
            case 19:
                return new wbd[i];
            case 20:
                return new ecd[i];
            case 21:
                return new pcd[i];
            case 22:
                return new eka[i];
            case 23:
                return new vx8[i];
            case 24:
                return new tx8[i];
            case 25:
                return new m2c[i];
            case 26:
                return new idd[i];
            case 27:
                return new wx8[i];
            case 28:
                return new xx8[i];
            default:
                return new yx8[i];
        }
    }
}
