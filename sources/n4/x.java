package n4;

import a8.bf;
import a8.df;
import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;
import o6.f0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i10) {
        this.a = i10;
    }

    public static void a(o6.f fVar, Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = fVar.a;
        df.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.b;
        df.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.c;
        df.s(parcel, 3, 4);
        parcel.writeInt(i13);
        df.l(parcel, 4, fVar.d);
        df.f(parcel, 5, fVar.e);
        df.o(parcel, 6, fVar.f, i10);
        df.b(parcel, 7, fVar.h);
        df.k(parcel, 8, fVar.n, i10);
        df.o(parcel, 10, fVar.r, i10);
        df.o(parcel, 11, fVar.s, i10);
        boolean z10 = fVar.v;
        df.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.w;
        df.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.x;
        df.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        df.l(parcel, 15, fVar.y);
        df.r(parcel, q5);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new z(parcel);
            case 1:
                return new y(parcel);
            case 2:
                return new a0(parcel.readInt(), parcel.readFloat());
            case 3:
                int z10 = bf.z(parcel);
                int i10 = 0;
                int i11 = 0;
                Uri uri = null;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i10 = bf.u(parcel, readInt);
                    } else if (c10 == 2) {
                        uri = (Uri) bf.g(parcel, readInt, Uri.CREATOR);
                    } else if (c10 == 3) {
                        i12 = bf.u(parcel, readInt);
                    } else if (c10 != 4) {
                        bf.y(parcel, readInt);
                    } else {
                        i11 = bf.u(parcel, readInt);
                    }
                }
                bf.m(parcel, z10);
                return new n6.a(i10, uri, i12, i11);
            case 4:
                int z11 = bf.z(parcel);
                String str = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        bf.y(parcel, readInt2);
                    } else {
                        str = bf.h(parcel, readInt2);
                    }
                }
                bf.m(parcel, z11);
                return new n8.e(str);
            case 5:
                int z12 = bf.z(parcel);
                String str2 = null;
                int i13 = 0;
                byte[] bArr = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str2 = bf.h(parcel, readInt3);
                    } else if (c11 == 3) {
                        bArr = bf.b(parcel, readInt3);
                    } else if (c11 != 4) {
                        bf.y(parcel, readInt3);
                    } else {
                        i13 = bf.u(parcel, readInt3);
                    }
                }
                bf.m(parcel, z12);
                return new n8.a(i13, str2, bArr);
            case 6:
                int z13 = bf.z(parcel);
                long j10 = 0;
                n8.a[] aVarArr = null;
                int i14 = 0;
                boolean z14 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        j10 = bf.w(parcel, readInt4);
                    } else if (c12 == 3) {
                        aVarArr = (n8.a[]) bf.k(parcel, readInt4, n8.a.CREATOR);
                    } else if (c12 == 4) {
                        i14 = bf.u(parcel, readInt4);
                    } else if (c12 != 5) {
                        bf.y(parcel, readInt4);
                    } else {
                        z14 = bf.n(parcel, readInt4);
                    }
                }
                bf.m(parcel, z13);
                return new n8.f(j10, aVarArr, i14, z14);
            case 7:
                int z15 = bf.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        bf.y(parcel, readInt5);
                    } else {
                        str3 = bf.h(parcel, readInt5);
                    }
                }
                bf.m(parcel, z15);
                return new n8.g(str3);
            case 8:
                int z16 = bf.z(parcel);
                int i15 = 0;
                boolean z17 = false;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 2) {
                        i15 = bf.u(parcel, readInt6);
                    } else if (c13 != 3) {
                        bf.y(parcel, readInt6);
                    } else {
                        z17 = bf.n(parcel, readInt6);
                    }
                }
                bf.m(parcel, z16);
                return new n8.h(i15, z17);
            case 9:
                int z18 = bf.z(parcel);
                String str4 = null;
                byte[] bArr2 = null;
                long j11 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 2) {
                        str4 = bf.h(parcel, readInt7);
                    } else if (c14 == 3) {
                        dataHolder = (DataHolder) bf.g(parcel, readInt7, DataHolder.CREATOR);
                    } else if (c14 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) bf.g(parcel, readInt7, ParcelFileDescriptor.CREATOR);
                    } else if (c14 == 5) {
                        j11 = bf.w(parcel, readInt7);
                    } else if (c14 != 6) {
                        bf.y(parcel, readInt7);
                    } else {
                        bArr2 = bf.b(parcel, readInt7);
                    }
                }
                bf.m(parcel, z18);
                n8.b bVar = new n8.b();
                bVar.a = str4;
                bVar.b = dataHolder;
                bVar.c = parcelFileDescriptor;
                bVar.d = j11;
                bVar.e = bArr2;
                return bVar;
            case 10:
                int z19 = bf.z(parcel);
                String str5 = null;
                int i16 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 1) {
                        i16 = bf.u(parcel, readInt8);
                    } else if (c15 != 2) {
                        bf.y(parcel, readInt8);
                    } else {
                        str5 = bf.h(parcel, readInt8);
                    }
                }
                bf.m(parcel, z19);
                return new o6.d(i16, str5);
            case 11:
                int z20 = bf.z(parcel);
                ArrayList arrayList = null;
                int i17 = 0;
                while (parcel.dataPosition() < z20) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        i17 = bf.u(parcel, readInt9);
                    } else if (c16 != 2) {
                        bf.y(parcel, readInt9);
                    } else {
                        arrayList = bf.l(parcel, readInt9, o6.j.CREATOR);
                    }
                }
                bf.m(parcel, z20);
                return new o6.o(i17, arrayList);
            case 12:
                int z21 = bf.z(parcel);
                int i18 = -1;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                String str6 = null;
                String str7 = null;
                long j12 = 0;
                long j13 = 0;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i19 = bf.u(parcel, readInt10);
                            break;
                        case 2:
                            i20 = bf.u(parcel, readInt10);
                            break;
                        case 3:
                            i21 = bf.u(parcel, readInt10);
                            break;
                        case 4:
                            j12 = bf.w(parcel, readInt10);
                            break;
                        case 5:
                            j13 = bf.w(parcel, readInt10);
                            break;
                        case 6:
                            str6 = bf.h(parcel, readInt10);
                            break;
                        case 7:
                            str7 = bf.h(parcel, readInt10);
                            break;
                        case '\b':
                            i22 = bf.u(parcel, readInt10);
                            break;
                        case '\t':
                            i18 = bf.u(parcel, readInt10);
                            break;
                        default:
                            bf.y(parcel, readInt10);
                            break;
                    }
                }
                bf.m(parcel, z21);
                return new o6.j(i19, i20, i21, j12, j13, str6, str7, i22, i18);
            case 13:
                int z22 = bf.z(parcel);
                Account account = null;
                int i23 = 0;
                int i24 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 1) {
                        i23 = bf.u(parcel, readInt11);
                    } else if (c17 == 2) {
                        account = (Account) bf.g(parcel, readInt11, Account.CREATOR);
                    } else if (c17 == 3) {
                        i24 = bf.u(parcel, readInt11);
                    } else if (c17 != 4) {
                        bf.y(parcel, readInt11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) bf.g(parcel, readInt11, GoogleSignInAccount.CREATOR);
                    }
                }
                bf.m(parcel, z22);
                return new o6.u(i23, account, i24, googleSignInAccount);
            case 14:
                int z23 = bf.z(parcel);
                int i25 = 0;
                boolean z24 = false;
                boolean z25 = false;
                IBinder iBinder = null;
                l6.a aVar = null;
                while (parcel.dataPosition() < z23) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 1) {
                        i25 = bf.u(parcel, readInt12);
                    } else if (c18 == 2) {
                        iBinder = bf.t(parcel, readInt12);
                    } else if (c18 == 3) {
                        aVar = (l6.a) bf.g(parcel, readInt12, l6.a.CREATOR);
                    } else if (c18 == 4) {
                        z24 = bf.n(parcel, readInt12);
                    } else if (c18 != 5) {
                        bf.y(parcel, readInt12);
                    } else {
                        z25 = bf.n(parcel, readInt12);
                    }
                }
                bf.m(parcel, z23);
                return new o6.v(i25, iBinder, aVar, z24, z25);
            case 15:
                int z26 = bf.z(parcel);
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z27 = false;
                boolean z28 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 == 1) {
                        i26 = bf.u(parcel, readInt13);
                    } else if (c19 == 2) {
                        z27 = bf.n(parcel, readInt13);
                    } else if (c19 == 3) {
                        z28 = bf.n(parcel, readInt13);
                    } else if (c19 == 4) {
                        i27 = bf.u(parcel, readInt13);
                    } else if (c19 != 5) {
                        bf.y(parcel, readInt13);
                    } else {
                        i28 = bf.u(parcel, readInt13);
                    }
                }
                bf.m(parcel, z26);
                return new o6.n(i26, i27, i28, z27, z28);
            case 16:
                return new BinderWrapper(parcel);
            case 17:
                int z29 = bf.z(parcel);
                Bundle bundle = null;
                o6.e eVar = null;
                int i29 = 0;
                l6.c[] cVarArr = null;
                while (parcel.dataPosition() < z29) {
                    int readInt14 = parcel.readInt();
                    char c20 = (char) readInt14;
                    if (c20 == 1) {
                        bundle = bf.a(parcel, readInt14);
                    } else if (c20 == 2) {
                        cVarArr = (l6.c[]) bf.k(parcel, readInt14, l6.c.CREATOR);
                    } else if (c20 == 3) {
                        i29 = bf.u(parcel, readInt14);
                    } else if (c20 != 4) {
                        bf.y(parcel, readInt14);
                    } else {
                        eVar = (o6.e) bf.g(parcel, readInt14, o6.e.CREATOR);
                    }
                }
                bf.m(parcel, z29);
                f0 f0Var = new f0();
                f0Var.a = bundle;
                f0Var.b = cVarArr;
                f0Var.c = i29;
                f0Var.d = eVar;
                return f0Var;
            case 18:
                int z30 = bf.z(parcel);
                o6.n nVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z31 = false;
                boolean z32 = false;
                int i30 = 0;
                while (parcel.dataPosition() < z30) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            nVar = (o6.n) bf.g(parcel, readInt15, o6.n.CREATOR);
                            break;
                        case 2:
                            z31 = bf.n(parcel, readInt15);
                            break;
                        case 3:
                            z32 = bf.n(parcel, readInt15);
                            break;
                        case 4:
                            iArr = bf.d(parcel, readInt15);
                            break;
                        case 5:
                            i30 = bf.u(parcel, readInt15);
                            break;
                        case 6:
                            iArr2 = bf.d(parcel, readInt15);
                            break;
                        default:
                            bf.y(parcel, readInt15);
                            break;
                    }
                }
                bf.m(parcel, z30);
                return new o6.e(nVar, z31, z32, iArr, i30, iArr2);
            case 19:
                int z33 = bf.z(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = o6.f.E;
                String str8 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str9 = null;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                boolean z34 = false;
                int i34 = 0;
                boolean z35 = false;
                l6.c[] cVarArr2 = o6.f.F;
                l6.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < z33) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i31 = bf.u(parcel, readInt16);
                            break;
                        case 2:
                            i32 = bf.u(parcel, readInt16);
                            break;
                        case 3:
                            i33 = bf.u(parcel, readInt16);
                            break;
                        case 4:
                            str8 = bf.h(parcel, readInt16);
                            break;
                        case 5:
                            iBinder2 = bf.t(parcel, readInt16);
                            break;
                        case 6:
                            scopeArr = (Scope[]) bf.k(parcel, readInt16, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = bf.a(parcel, readInt16);
                            break;
                        case '\b':
                            account2 = (Account) bf.g(parcel, readInt16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            bf.y(parcel, readInt16);
                            break;
                        case '\n':
                            cVarArr2 = (l6.c[]) bf.k(parcel, readInt16, l6.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (l6.c[]) bf.k(parcel, readInt16, l6.c.CREATOR);
                            break;
                        case '\f':
                            z34 = bf.n(parcel, readInt16);
                            break;
                        case '\r':
                            i34 = bf.u(parcel, readInt16);
                            break;
                        case 14:
                            z35 = bf.n(parcel, readInt16);
                            break;
                        case 15:
                            str9 = bf.h(parcel, readInt16);
                            break;
                    }
                }
                bf.m(parcel, z33);
                return new o6.f(i31, i32, i33, str8, iBinder2, scopeArr, bundle2, account2, cVarArr2, cVarArr3, z34, i34, z35, str9);
            case 20:
                int z36 = bf.z(parcel);
                Intent intent = null;
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    char c21 = (char) readInt17;
                    if (c21 == 1) {
                        i35 = bf.u(parcel, readInt17);
                    } else if (c21 == 2) {
                        i36 = bf.u(parcel, readInt17);
                    } else if (c21 != 3) {
                        bf.y(parcel, readInt17);
                    } else {
                        intent = (Intent) bf.g(parcel, readInt17, Intent.CREATOR);
                    }
                }
                bf.m(parcel, z36);
                return new p8.b(i35, i36, intent);
            case 21:
                int z37 = bf.z(parcel);
                ArrayList arrayList2 = null;
                String str10 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    char c22 = (char) readInt18;
                    if (c22 == 1) {
                        arrayList2 = bf.j(parcel, readInt18);
                    } else if (c22 != 2) {
                        bf.y(parcel, readInt18);
                    } else {
                        str10 = bf.h(parcel, readInt18);
                    }
                }
                bf.m(parcel, z37);
                return new p8.f(str10, arrayList2);
            case 22:
                int z38 = bf.z(parcel);
                o6.u uVar = null;
                int i37 = 0;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    char c23 = (char) readInt19;
                    if (c23 == 1) {
                        i37 = bf.u(parcel, readInt19);
                    } else if (c23 != 2) {
                        bf.y(parcel, readInt19);
                    } else {
                        uVar = (o6.u) bf.g(parcel, readInt19, o6.u.CREATOR);
                    }
                }
                bf.m(parcel, z38);
                return new p8.g(i37, uVar);
            case 23:
                int z39 = bf.z(parcel);
                l6.a aVar2 = null;
                int i38 = 0;
                o6.v vVar = null;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    char c24 = (char) readInt20;
                    if (c24 == 1) {
                        i38 = bf.u(parcel, readInt20);
                    } else if (c24 == 2) {
                        aVar2 = (l6.a) bf.g(parcel, readInt20, l6.a.CREATOR);
                    } else if (c24 != 3) {
                        bf.y(parcel, readInt20);
                    } else {
                        vVar = (o6.v) bf.g(parcel, readInt20, o6.v.CREATOR);
                    }
                }
                bf.m(parcel, z39);
                return new p8.h(i38, aVar2, vVar);
            case 24:
                int z40 = bf.z(parcel);
                q7.g[] gVarArr = null;
                Account account3 = null;
                boolean z41 = false;
                String str11 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt21 = parcel.readInt();
                    char c25 = (char) readInt21;
                    if (c25 == 1) {
                        gVarArr = (q7.g[]) bf.k(parcel, readInt21, q7.g.CREATOR);
                    } else if (c25 == 2) {
                        str11 = bf.h(parcel, readInt21);
                    } else if (c25 == 3) {
                        z41 = bf.n(parcel, readInt21);
                    } else if (c25 != 4) {
                        bf.y(parcel, readInt21);
                    } else {
                        account3 = (Account) bf.g(parcel, readInt21, Account.CREATOR);
                    }
                }
                bf.m(parcel, z40);
                return new q7.e(gVarArr, str11, z41, account3);
            case 25:
                int z42 = bf.z(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    char c26 = (char) readInt22;
                    if (c26 == 1) {
                        str12 = bf.h(parcel, readInt22);
                    } else if (c26 == 2) {
                        str13 = bf.h(parcel, readInt22);
                    } else if (c26 != 3) {
                        bf.y(parcel, readInt22);
                    } else {
                        str14 = bf.h(parcel, readInt22);
                    }
                }
                bf.m(parcel, z42);
                return new q7.f(str12, str13, str14);
            case 26:
                int z43 = bf.z(parcel);
                String str15 = null;
                byte[] bArr3 = null;
                int i39 = -1;
                q7.k kVar = null;
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    char c27 = (char) readInt23;
                    if (c27 == 1) {
                        str15 = bf.h(parcel, readInt23);
                    } else if (c27 == 3) {
                        kVar = (q7.k) bf.g(parcel, readInt23, q7.k.CREATOR);
                    } else if (c27 == 4) {
                        i39 = bf.u(parcel, readInt23);
                    } else if (c27 != 5) {
                        bf.y(parcel, readInt23);
                    } else {
                        bArr3 = bf.b(parcel, readInt23);
                    }
                }
                bf.m(parcel, z43);
                return new q7.g(str15, kVar, i39, bArr3);
            case 27:
                int z44 = bf.z(parcel);
                int i40 = 0;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt24 = parcel.readInt();
                    char c28 = (char) readInt24;
                    if (c28 == 1) {
                        i40 = bf.u(parcel, readInt24);
                    } else if (c28 != 2) {
                        bf.y(parcel, readInt24);
                    } else {
                        bundle3 = bf.a(parcel, readInt24);
                    }
                }
                bf.m(parcel, z44);
                return new q7.h(i40, bundle3);
            case 28:
                int z45 = bf.z(parcel);
                Status status = null;
                ArrayList arrayList3 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z45) {
                    int readInt25 = parcel.readInt();
                    char c29 = (char) readInt25;
                    if (c29 == 1) {
                        status = (Status) bf.g(parcel, readInt25, Status.CREATOR);
                    } else if (c29 == 2) {
                        arrayList3 = bf.l(parcel, readInt25, q7.n.CREATOR);
                    } else if (c29 != 3) {
                        bf.y(parcel, readInt25);
                    } else {
                        strArr = bf.i(parcel, readInt25);
                    }
                }
                bf.m(parcel, z45);
                q7.i iVar = new q7.i();
                iVar.a = status;
                iVar.b = arrayList3;
                iVar.c = strArr;
                return iVar;
            default:
                int z46 = bf.z(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                q7.h[] hVarArr = null;
                String str19 = null;
                q7.l lVar = null;
                boolean z47 = false;
                boolean z48 = false;
                int i41 = 1;
                while (parcel.dataPosition() < z46) {
                    int readInt26 = parcel.readInt();
                    char c30 = (char) readInt26;
                    if (c30 == 11) {
                        str19 = bf.h(parcel, readInt26);
                    } else if (c30 != '\f') {
                        switch (c30) {
                            case 1:
                                str16 = bf.h(parcel, readInt26);
                                break;
                            case 2:
                                str17 = bf.h(parcel, readInt26);
                                break;
                            case 3:
                                z47 = bf.n(parcel, readInt26);
                                break;
                            case 4:
                                i41 = bf.u(parcel, readInt26);
                                break;
                            case 5:
                                z48 = bf.n(parcel, readInt26);
                                break;
                            case 6:
                                str18 = bf.h(parcel, readInt26);
                                break;
                            case 7:
                                hVarArr = (q7.h[]) bf.k(parcel, readInt26, q7.h.CREATOR);
                                break;
                            default:
                                bf.y(parcel, readInt26);
                                break;
                        }
                    } else {
                        lVar = (q7.l) bf.g(parcel, readInt26, q7.l.CREATOR);
                    }
                }
                bf.m(parcel, z46);
                return new q7.k(str16, str17, z47, i41, z48, str18, hVarArr, str19, lVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new z[i10];
            case 1:
                return new y[i10];
            case 2:
                return new a0[i10];
            case 3:
                return new n6.a[i10];
            case 4:
                return new n8.e[i10];
            case 5:
                return new n8.a[i10];
            case 6:
                return new n8.f[i10];
            case 7:
                return new n8.g[i10];
            case 8:
                return new n8.h[i10];
            case 9:
                return new n8.b[i10];
            case 10:
                return new o6.d[i10];
            case 11:
                return new o6.o[i10];
            case 12:
                return new o6.j[i10];
            case 13:
                return new o6.u[i10];
            case 14:
                return new o6.v[i10];
            case 15:
                return new o6.n[i10];
            case 16:
                return new BinderWrapper[i10];
            case 17:
                return new f0[i10];
            case 18:
                return new o6.e[i10];
            case 19:
                return new o6.f[i10];
            case 20:
                return new p8.b[i10];
            case 21:
                return new p8.f[i10];
            case 22:
                return new p8.g[i10];
            case 23:
                return new p8.h[i10];
            case 24:
                return new q7.e[i10];
            case 25:
                return new q7.f[i10];
            case 26:
                return new q7.g[i10];
            case 27:
                return new q7.h[i10];
            case 28:
                return new q7.i[i10];
            default:
                return new q7.k[i10];
        }
    }
}
