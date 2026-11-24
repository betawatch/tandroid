// default package

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b1d implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ b1d(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        int i7 = 0;
        ArrayList arrayList = null;
        LatLng latLng = null;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        ds2 ds2Var = null;
        j3d j3dVar = null;
        ArrayList arrayList2 = null;
        Uri uri = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        Intent intent = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                int z5 = gte.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = gte.u(parcel, readInt);
                    } else if (c != 2) {
                        gte.y(parcel, readInt);
                    } else {
                        arrayList = gte.l(parcel, readInt, sd7.CREATOR);
                    }
                }
                gte.m(parcel, z5);
                return new mgb(i, arrayList);
            case 1:
                int z6 = gte.z(parcel);
                while (parcel.dataPosition() < z6) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        gte.y(parcel, readInt2);
                    } else {
                        pendingIntent2 = (PendingIntent) gte.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                gte.m(parcel, z6);
                return new ne7(pendingIntent2);
            case 2:
                int z7 = gte.z(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i7 = gte.u(parcel, readInt3);
                    } else if (c2 == 2) {
                        i8 = gte.u(parcel, readInt3);
                    } else if (c2 != 3) {
                        gte.y(parcel, readInt3);
                    } else {
                        intent = (Intent) gte.g(parcel, readInt3, Intent.CREATOR);
                    }
                }
                gte.m(parcel, z7);
                return new a1d(i7, i8, intent);
            case 3:
                int z8 = gte.z(parcel);
                long j = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Uri uri2 = null;
                String str7 = null;
                String str8 = null;
                ArrayList arrayList5 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str3 = gte.h(parcel, readInt4);
                            break;
                        case 3:
                            str4 = gte.h(parcel, readInt4);
                            break;
                        case 4:
                            str5 = gte.h(parcel, readInt4);
                            break;
                        case 5:
                            str6 = gte.h(parcel, readInt4);
                            break;
                        case 6:
                            uri2 = (Uri) gte.g(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            str7 = gte.h(parcel, readInt4);
                            break;
                        case '\b':
                            j = gte.w(parcel, readInt4);
                            break;
                        case '\t':
                            str8 = gte.h(parcel, readInt4);
                            break;
                        case '\n':
                            arrayList5 = gte.l(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 11:
                            str9 = gte.h(parcel, readInt4);
                            break;
                        case '\f':
                            str10 = gte.h(parcel, readInt4);
                            break;
                        default:
                            gte.y(parcel, readInt4);
                            break;
                    }
                }
                gte.m(parcel, z8);
                return new GoogleSignInAccount(str3, str4, str5, str6, uri2, str7, j, str8, arrayList5, str9, str10);
            case 4:
                int z9 = gte.z(parcel);
                long j2 = 0;
                int i9 = 0;
                int i10 = 0;
                boolean z10 = false;
                String str11 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        i9 = gte.u(parcel, readInt5);
                    } else if (c3 == 2) {
                        str11 = gte.h(parcel, readInt5);
                    } else if (c3 == 3) {
                        j2 = gte.w(parcel, readInt5);
                    } else if (c3 == 4) {
                        i10 = gte.u(parcel, readInt5);
                    } else if (c3 != 5) {
                        gte.y(parcel, readInt5);
                    } else {
                        z10 = gte.n(parcel, readInt5);
                    }
                }
                gte.m(parcel, z9);
                return new n1d(i9, i10, j2, str11, z10);
            case 5:
                int z11 = gte.z(parcel);
                boolean z12 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        i6 = gte.u(parcel, readInt6);
                    } else if (c4 != 2) {
                        gte.y(parcel, readInt6);
                    } else {
                        z12 = gte.n(parcel, readInt6);
                    }
                }
                gte.m(parcel, z11);
                return new oe7(i6, z12);
            case 6:
                int z13 = gte.z(parcel);
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        arrayList4 = gte.l(parcel, readInt7, f84.CREATOR);
                    } else if (c5 == 2) {
                        z4 = gte.n(parcel, readInt7);
                    } else if (c5 == 3) {
                        str12 = gte.h(parcel, readInt7);
                    } else if (c5 != 4) {
                        gte.y(parcel, readInt7);
                    } else {
                        str13 = gte.h(parcel, readInt7);
                    }
                }
                gte.m(parcel, z13);
                return new eo(arrayList4, z4, str12, str13);
            case 7:
                int z14 = gte.z(parcel);
                int i11 = 0;
                int i12 = 0;
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z14) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        strArr = gte.i(parcel, readInt8);
                    } else if (c6 == 2) {
                        cursorWindowArr = (CursorWindow[]) gte.k(parcel, readInt8, CursorWindow.CREATOR);
                    } else if (c6 == 3) {
                        i12 = gte.u(parcel, readInt8);
                    } else if (c6 == 4) {
                        bundle = gte.a(parcel, readInt8);
                    } else if (c6 != 1000) {
                        gte.y(parcel, readInt8);
                    } else {
                        i11 = gte.u(parcel, readInt8);
                    }
                }
                gte.m(parcel, z14);
                DataHolder dataHolder = new DataHolder(i11, strArr, cursorWindowArr, i12, bundle);
                dataHolder.c = new Bundle();
                int i13 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.b;
                    if (i13 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int i14 = 0;
                        for (int i15 = 0; i15 < cursorWindowArr2.length; i15++) {
                            dataHolder.h[i15] = i14;
                            i14 += cursorWindowArr2[i15].getNumRows() - (i14 - cursorWindowArr2[i15].getStartPosition());
                        }
                        dataHolder.n = i14;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr2[i13], i13);
                    i13++;
                }
            case 8:
                int z15 = gte.z(parcel);
                int i16 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                ArrayList arrayList6 = null;
                Account account2 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i16 = gte.u(parcel, readInt9);
                            break;
                        case 2:
                            arrayList6 = gte.l(parcel, readInt9, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) gte.g(parcel, readInt9, Account.CREATOR);
                            break;
                        case 4:
                            z16 = gte.n(parcel, readInt9);
                            break;
                        case 5:
                            z17 = gte.n(parcel, readInt9);
                            break;
                        case 6:
                            z18 = gte.n(parcel, readInt9);
                            break;
                        case 7:
                            str14 = gte.h(parcel, readInt9);
                            break;
                        case '\b':
                            str15 = gte.h(parcel, readInt9);
                            break;
                        case '\t':
                            arrayList3 = gte.l(parcel, readInt9, az4.CREATOR);
                            break;
                        case '\n':
                            str16 = gte.h(parcel, readInt9);
                            break;
                        default:
                            gte.y(parcel, readInt9);
                            break;
                    }
                }
                gte.m(parcel, z15);
                return new GoogleSignInOptions(i16, arrayList6, account2, z16, z17, z18, str14, str15, GoogleSignInOptions.c(arrayList3), str16);
            case 9:
                int z19 = gte.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        i5 = gte.u(parcel, readInt10);
                    } else if (c7 == 2) {
                        uri = (Uri) gte.g(parcel, readInt10, Uri.CREATOR);
                    } else if (c7 == 3) {
                        i17 = gte.u(parcel, readInt10);
                    } else if (c7 != 4) {
                        gte.y(parcel, readInt10);
                    } else {
                        i18 = gte.u(parcel, readInt10);
                    }
                }
                gte.m(parcel, z19);
                return new vsc(i5, uri, i17, i18);
            case 10:
                int z20 = gte.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        arrayList2 = gte.j(parcel, readInt11);
                    } else if (c8 != 2) {
                        gte.y(parcel, readInt11);
                    } else {
                        str17 = gte.h(parcel, readInt11);
                    }
                }
                gte.m(parcel, z20);
                return new u2d(str17, arrayList2);
            case 11:
                int z21 = gte.z(parcel);
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i4 = gte.u(parcel, readInt12);
                    } else if (c9 != 2) {
                        gte.y(parcel, readInt12);
                    } else {
                        j3dVar = (j3d) gte.g(parcel, readInt12, j3d.CREATOR);
                    }
                }
                gte.m(parcel, z21);
                return new w2d(i4, j3dVar);
            case 12:
                int z22 = gte.z(parcel);
                l3d l3dVar = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i3 = gte.u(parcel, readInt13);
                    } else if (c10 == 2) {
                        ds2Var = (ds2) gte.g(parcel, readInt13, ds2.CREATOR);
                    } else if (c10 != 3) {
                        gte.y(parcel, readInt13);
                    } else {
                        l3dVar = (l3d) gte.g(parcel, readInt13, l3d.CREATOR);
                    }
                }
                gte.m(parcel, z22);
                return new c3d(i3, ds2Var, l3dVar);
            case 13:
                int z23 = gte.z(parcel);
                long j3 = 0;
                long j4 = 0;
                int i19 = -1;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i20 = gte.u(parcel, readInt14);
                            break;
                        case 2:
                            i21 = gte.u(parcel, readInt14);
                            break;
                        case 3:
                            i22 = gte.u(parcel, readInt14);
                            break;
                        case 4:
                            j3 = gte.w(parcel, readInt14);
                            break;
                        case 5:
                            j4 = gte.w(parcel, readInt14);
                            break;
                        case 6:
                            str18 = gte.h(parcel, readInt14);
                            break;
                        case 7:
                            str19 = gte.h(parcel, readInt14);
                            break;
                        case '\b':
                            i23 = gte.u(parcel, readInt14);
                            break;
                        case '\t':
                            i19 = gte.u(parcel, readInt14);
                            break;
                        default:
                            gte.y(parcel, readInt14);
                            break;
                    }
                }
                gte.m(parcel, z23);
                return new sd7(i20, i21, i22, j3, j4, str18, str19, i23, i19);
            case 14:
                int z24 = gte.z(parcel);
                int i24 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 1) {
                        i2 = gte.u(parcel, readInt15);
                    } else if (c11 == 2) {
                        account = (Account) gte.g(parcel, readInt15, Account.CREATOR);
                    } else if (c11 == 3) {
                        i24 = gte.u(parcel, readInt15);
                    } else if (c11 != 4) {
                        gte.y(parcel, readInt15);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) gte.g(parcel, readInt15, GoogleSignInAccount.CREATOR);
                    }
                }
                gte.m(parcel, z24);
                return new j3d(i2, account, i24, googleSignInAccount2);
            case 15:
                int z25 = gte.z(parcel);
                int i25 = 0;
                boolean z26 = false;
                boolean z27 = false;
                IBinder iBinder = null;
                ds2 ds2Var2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 1) {
                        i25 = gte.u(parcel, readInt16);
                    } else if (c12 == 2) {
                        iBinder = gte.t(parcel, readInt16);
                    } else if (c12 == 3) {
                        ds2Var2 = (ds2) gte.g(parcel, readInt16, ds2.CREATOR);
                    } else if (c12 == 4) {
                        z26 = gte.n(parcel, readInt16);
                    } else if (c12 != 5) {
                        gte.y(parcel, readInt16);
                    } else {
                        z27 = gte.n(parcel, readInt16);
                    }
                }
                gte.m(parcel, z25);
                return new l3d(i25, iBinder, ds2Var2, z26, z27);
            case 16:
                int z28 = gte.z(parcel);
                String str20 = "";
                String str21 = "";
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 4) {
                        str20 = gte.h(parcel, readInt17);
                    } else if (c13 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) gte.g(parcel, readInt17, GoogleSignInAccount.CREATOR);
                    } else if (c13 != '\b') {
                        gte.y(parcel, readInt17);
                    } else {
                        str21 = gte.h(parcel, readInt17);
                    }
                }
                gte.m(parcel, z28);
                return new SignInAccount(str20, googleSignInAccount, str21);
            case 17:
                int z29 = gte.z(parcel);
                boolean z30 = false;
                int i26 = 0;
                boolean z31 = false;
                gh0 gh0Var = null;
                dh0 dh0Var = null;
                String str22 = null;
                fh0 fh0Var = null;
                eh0 eh0Var = null;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            gh0Var = (gh0) gte.g(parcel, readInt18, gh0.CREATOR);
                            break;
                        case 2:
                            dh0Var = (dh0) gte.g(parcel, readInt18, dh0.CREATOR);
                            break;
                        case 3:
                            str22 = gte.h(parcel, readInt18);
                            break;
                        case 4:
                            z30 = gte.n(parcel, readInt18);
                            break;
                        case 5:
                            i26 = gte.u(parcel, readInt18);
                            break;
                        case 6:
                            fh0Var = (fh0) gte.g(parcel, readInt18, fh0.CREATOR);
                            break;
                        case 7:
                            eh0Var = (eh0) gte.g(parcel, readInt18, eh0.CREATOR);
                            break;
                        case '\b':
                            z31 = gte.n(parcel, readInt18);
                            break;
                        default:
                            gte.y(parcel, readInt18);
                            break;
                    }
                }
                gte.m(parcel, z29);
                return new hh0(gh0Var, dh0Var, str22, z30, i26, fh0Var, eh0Var, z31);
            case 18:
                int z32 = gte.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        gte.y(parcel, readInt19);
                    } else {
                        pendingIntent = (PendingIntent) gte.g(parcel, readInt19, PendingIntent.CREATOR);
                    }
                }
                gte.m(parcel, z32);
                return new ih0(pendingIntent);
            case 19:
                int z33 = gte.z(parcel);
                boolean z34 = false;
                boolean z35 = false;
                boolean z36 = false;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            z34 = gte.n(parcel, readInt20);
                            break;
                        case 2:
                            str23 = gte.h(parcel, readInt20);
                            break;
                        case 3:
                            str24 = gte.h(parcel, readInt20);
                            break;
                        case 4:
                            z35 = gte.n(parcel, readInt20);
                            break;
                        case 5:
                            str25 = gte.h(parcel, readInt20);
                            break;
                        case 6:
                            arrayList7 = gte.j(parcel, readInt20);
                            break;
                        case 7:
                            z36 = gte.n(parcel, readInt20);
                            break;
                        default:
                            gte.y(parcel, readInt20);
                            break;
                    }
                }
                gte.m(parcel, z33);
                return new dh0(z34, str23, str24, z35, str25, arrayList7, z36);
            case 20:
                int z37 = gte.z(parcel);
                while (parcel.dataPosition() < z37) {
                    int readInt21 = parcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        z3 = gte.n(parcel, readInt21);
                    } else if (c14 != 2) {
                        gte.y(parcel, readInt21);
                    } else {
                        str2 = gte.h(parcel, readInt21);
                    }
                }
                gte.m(parcel, z37);
                return new eh0(str2, z3);
            case 21:
                int z38 = gte.z(parcel);
                String str26 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    char c15 = (char) readInt22;
                    if (c15 == 1) {
                        z2 = gte.n(parcel, readInt22);
                    } else if (c15 == 2) {
                        bArr = gte.b(parcel, readInt22);
                    } else if (c15 != 3) {
                        gte.y(parcel, readInt22);
                    } else {
                        str26 = gte.h(parcel, readInt22);
                    }
                }
                gte.m(parcel, z38);
                return new fh0(z2, bArr, str26);
            case 22:
                int z39 = gte.z(parcel);
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        gte.y(parcel, readInt23);
                    } else {
                        z = gte.n(parcel, readInt23);
                    }
                }
                gte.m(parcel, z39);
                return new gh0(z);
            case 23:
                int z40 = gte.z(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < z40) {
                    int readInt24 = parcel.readInt();
                    char c16 = (char) readInt24;
                    if (c16 == 2) {
                        str = gte.h(parcel, readInt24);
                    } else if (c16 != 5) {
                        gte.y(parcel, readInt24);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) gte.g(parcel, readInt24, GoogleSignInOptions.CREATOR);
                    }
                }
                gte.m(parcel, z40);
                return new SignInConfiguration(str, googleSignInOptions);
            case 24:
                int z41 = gte.z(parcel);
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                Uri uri3 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                ku8 ku8Var = null;
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str27 = gte.h(parcel, readInt25);
                            break;
                        case 2:
                            str28 = gte.h(parcel, readInt25);
                            break;
                        case 3:
                            str29 = gte.h(parcel, readInt25);
                            break;
                        case 4:
                            str30 = gte.h(parcel, readInt25);
                            break;
                        case 5:
                            uri3 = (Uri) gte.g(parcel, readInt25, Uri.CREATOR);
                            break;
                        case 6:
                            str31 = gte.h(parcel, readInt25);
                            break;
                        case 7:
                            str32 = gte.h(parcel, readInt25);
                            break;
                        case '\b':
                            str33 = gte.h(parcel, readInt25);
                            break;
                        case '\t':
                            ku8Var = (ku8) gte.g(parcel, readInt25, ku8.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt25);
                            break;
                    }
                }
                gte.m(parcel, z41);
                return new fha(str27, str28, str29, str30, uri3, str31, str32, str33, ku8Var);
            case 25:
                try {
                    return Transport.a(parcel.readString());
                } catch (c1c e) {
                    sdb.b(e);
                    return null;
                }
            case 26:
                try {
                    return ay.a(parcel.readString());
                } catch (zx e2) {
                    sdb.b(e2);
                    return null;
                }
            case 27:
                int z42 = gte.z(parcel);
                long j5 = 0;
                long j6 = 0;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                d9c d9cVar = null;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            str34 = gte.h(parcel, readInt26);
                            break;
                        case 3:
                            str35 = gte.h(parcel, readInt26);
                            break;
                        case 4:
                            j5 = gte.w(parcel, readInt26);
                            break;
                        case 5:
                            str36 = gte.h(parcel, readInt26);
                            break;
                        case 6:
                            str37 = gte.h(parcel, readInt26);
                            break;
                        case 7:
                            str38 = gte.h(parcel, readInt26);
                            break;
                        case '\b':
                            str39 = gte.h(parcel, readInt26);
                            break;
                        case '\t':
                            str40 = gte.h(parcel, readInt26);
                            break;
                        case '\n':
                            str41 = gte.h(parcel, readInt26);
                            break;
                        case 11:
                            j6 = gte.w(parcel, readInt26);
                            break;
                        case '\f':
                            str42 = gte.h(parcel, readInt26);
                            break;
                        case '\r':
                            d9cVar = (d9c) gte.g(parcel, readInt26, d9c.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt26);
                            break;
                    }
                }
                gte.m(parcel, z42);
                return new y9(str34, str35, j5, str36, str37, str38, str39, str40, str41, j6, str42, d9cVar);
            case 28:
                int z43 = gte.z(parcel);
                boolean z44 = false;
                boolean z45 = false;
                String str43 = null;
                String str44 = null;
                IBinder iBinder2 = null;
                ql7 ql7Var = null;
                while (parcel.dataPosition() < z43) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            str43 = gte.h(parcel, readInt27);
                            break;
                        case 3:
                            str44 = gte.h(parcel, readInt27);
                            break;
                        case 4:
                            iBinder2 = gte.t(parcel, readInt27);
                            break;
                        case 5:
                            ql7Var = (ql7) gte.g(parcel, readInt27, ql7.CREATOR);
                            break;
                        case 6:
                            z44 = gte.n(parcel, readInt27);
                            break;
                        case 7:
                            z45 = gte.n(parcel, readInt27);
                            break;
                        default:
                            gte.y(parcel, readInt27);
                            break;
                    }
                }
                gte.m(parcel, z43);
                return new bd1(str43, str44, iBinder2, ql7Var, z44, z45);
            default:
                int z46 = gte.z(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < z46) {
                    int readInt28 = parcel.readInt();
                    char c17 = (char) readInt28;
                    if (c17 == 2) {
                        latLng = (LatLng) gte.g(parcel, readInt28, LatLng.CREATOR);
                    } else if (c17 == 3) {
                        f = gte.r(parcel, readInt28);
                    } else if (c17 == 4) {
                        f2 = gte.r(parcel, readInt28);
                    } else if (c17 != 5) {
                        gte.y(parcel, readInt28);
                    } else {
                        f3 = gte.r(parcel, readInt28);
                    }
                }
                gte.m(parcel, z46);
                return new CameraPosition(latLng, f, f2, f3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mgb[i];
            case 1:
                return new ne7[i];
            case 2:
                return new a1d[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new n1d[i];
            case 5:
                return new oe7[i];
            case 6:
                return new eo[i];
            case 7:
                return new DataHolder[i];
            case 8:
                return new GoogleSignInOptions[i];
            case 9:
                return new vsc[i];
            case 10:
                return new u2d[i];
            case 11:
                return new w2d[i];
            case 12:
                return new c3d[i];
            case 13:
                return new sd7[i];
            case 14:
                return new j3d[i];
            case 15:
                return new l3d[i];
            case 16:
                return new SignInAccount[i];
            case 17:
                return new hh0[i];
            case 18:
                return new ih0[i];
            case 19:
                return new dh0[i];
            case 20:
                return new eh0[i];
            case 21:
                return new fh0[i];
            case 22:
                return new gh0[i];
            case 23:
                return new SignInConfiguration[i];
            case 24:
                return new fha[i];
            case 25:
                return new Transport[i];
            case 26:
                return new ay[i];
            case 27:
                return new y9[i];
            case 28:
                return new bd1[i];
            default:
                return new CameraPosition[i];
        }
    }
}
