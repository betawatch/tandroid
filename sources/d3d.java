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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d3d implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ d3d(byte b) {
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
        ot2 ot2Var = null;
        l5d l5dVar = null;
        ArrayList arrayList2 = null;
        Uri uri = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        Intent intent = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                int z5 = jve.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = jve.u(parcel, readInt);
                    } else if (c != 2) {
                        jve.y(parcel, readInt);
                    } else {
                        arrayList = jve.l(parcel, readInt, uf7.CREATOR);
                    }
                }
                jve.m(parcel, z5);
                return new nib(i, arrayList);
            case 1:
                int z6 = jve.z(parcel);
                while (parcel.dataPosition() < z6) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        jve.y(parcel, readInt2);
                    } else {
                        pendingIntent2 = (PendingIntent) jve.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                jve.m(parcel, z6);
                return new pg7(pendingIntent2);
            case 2:
                int z7 = jve.z(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i7 = jve.u(parcel, readInt3);
                    } else if (c2 == 2) {
                        i8 = jve.u(parcel, readInt3);
                    } else if (c2 != 3) {
                        jve.y(parcel, readInt3);
                    } else {
                        intent = (Intent) jve.g(parcel, readInt3, Intent.CREATOR);
                    }
                }
                jve.m(parcel, z7);
                return new c3d(i7, i8, intent);
            case 3:
                int z8 = jve.z(parcel);
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
                            str3 = jve.h(parcel, readInt4);
                            break;
                        case 3:
                            str4 = jve.h(parcel, readInt4);
                            break;
                        case 4:
                            str5 = jve.h(parcel, readInt4);
                            break;
                        case 5:
                            str6 = jve.h(parcel, readInt4);
                            break;
                        case 6:
                            uri2 = (Uri) jve.g(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            str7 = jve.h(parcel, readInt4);
                            break;
                        case '\b':
                            j = jve.w(parcel, readInt4);
                            break;
                        case '\t':
                            str8 = jve.h(parcel, readInt4);
                            break;
                        case '\n':
                            arrayList5 = jve.l(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 11:
                            str9 = jve.h(parcel, readInt4);
                            break;
                        case '\f':
                            str10 = jve.h(parcel, readInt4);
                            break;
                        default:
                            jve.y(parcel, readInt4);
                            break;
                    }
                }
                jve.m(parcel, z8);
                return new GoogleSignInAccount(str3, str4, str5, str6, uri2, str7, j, str8, arrayList5, str9, str10);
            case 4:
                int z9 = jve.z(parcel);
                long j2 = 0;
                int i9 = 0;
                int i10 = 0;
                boolean z10 = false;
                String str11 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        i9 = jve.u(parcel, readInt5);
                    } else if (c3 == 2) {
                        str11 = jve.h(parcel, readInt5);
                    } else if (c3 == 3) {
                        j2 = jve.w(parcel, readInt5);
                    } else if (c3 == 4) {
                        i10 = jve.u(parcel, readInt5);
                    } else if (c3 != 5) {
                        jve.y(parcel, readInt5);
                    } else {
                        z10 = jve.n(parcel, readInt5);
                    }
                }
                jve.m(parcel, z9);
                return new p3d(i9, i10, j2, str11, z10);
            case 5:
                int z11 = jve.z(parcel);
                boolean z12 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        i6 = jve.u(parcel, readInt6);
                    } else if (c4 != 2) {
                        jve.y(parcel, readInt6);
                    } else {
                        z12 = jve.n(parcel, readInt6);
                    }
                }
                jve.m(parcel, z11);
                return new qg7(i6, z12);
            case 6:
                int z13 = jve.z(parcel);
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        arrayList4 = jve.l(parcel, readInt7, o94.CREATOR);
                    } else if (c5 == 2) {
                        z4 = jve.n(parcel, readInt7);
                    } else if (c5 == 3) {
                        str12 = jve.h(parcel, readInt7);
                    } else if (c5 != 4) {
                        jve.y(parcel, readInt7);
                    } else {
                        str13 = jve.h(parcel, readInt7);
                    }
                }
                jve.m(parcel, z13);
                return new ep(arrayList4, z4, str12, str13);
            case 7:
                int z14 = jve.z(parcel);
                int i11 = 0;
                int i12 = 0;
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z14) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        strArr = jve.i(parcel, readInt8);
                    } else if (c6 == 2) {
                        cursorWindowArr = (CursorWindow[]) jve.k(parcel, readInt8, CursorWindow.CREATOR);
                    } else if (c6 == 3) {
                        i12 = jve.u(parcel, readInt8);
                    } else if (c6 == 4) {
                        bundle = jve.a(parcel, readInt8);
                    } else if (c6 != 1000) {
                        jve.y(parcel, readInt8);
                    } else {
                        i11 = jve.u(parcel, readInt8);
                    }
                }
                jve.m(parcel, z14);
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
                int z15 = jve.z(parcel);
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
                            i16 = jve.u(parcel, readInt9);
                            break;
                        case 2:
                            arrayList6 = jve.l(parcel, readInt9, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) jve.g(parcel, readInt9, Account.CREATOR);
                            break;
                        case 4:
                            z16 = jve.n(parcel, readInt9);
                            break;
                        case 5:
                            z17 = jve.n(parcel, readInt9);
                            break;
                        case 6:
                            z18 = jve.n(parcel, readInt9);
                            break;
                        case 7:
                            str14 = jve.h(parcel, readInt9);
                            break;
                        case '\b':
                            str15 = jve.h(parcel, readInt9);
                            break;
                        case '\t':
                            arrayList3 = jve.l(parcel, readInt9, z05.CREATOR);
                            break;
                        case '\n':
                            str16 = jve.h(parcel, readInt9);
                            break;
                        default:
                            jve.y(parcel, readInt9);
                            break;
                    }
                }
                jve.m(parcel, z15);
                return new GoogleSignInOptions(i16, arrayList6, account2, z16, z17, z18, str14, str15, GoogleSignInOptions.c(arrayList3), str16);
            case 9:
                int z19 = jve.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        i5 = jve.u(parcel, readInt10);
                    } else if (c7 == 2) {
                        uri = (Uri) jve.g(parcel, readInt10, Uri.CREATOR);
                    } else if (c7 == 3) {
                        i17 = jve.u(parcel, readInt10);
                    } else if (c7 != 4) {
                        jve.y(parcel, readInt10);
                    } else {
                        i18 = jve.u(parcel, readInt10);
                    }
                }
                jve.m(parcel, z19);
                return new wuc(i5, uri, i17, i18);
            case 10:
                int z20 = jve.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        arrayList2 = jve.j(parcel, readInt11);
                    } else if (c8 != 2) {
                        jve.y(parcel, readInt11);
                    } else {
                        str17 = jve.h(parcel, readInt11);
                    }
                }
                jve.m(parcel, z20);
                return new w4d(str17, arrayList2);
            case 11:
                int z21 = jve.z(parcel);
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i4 = jve.u(parcel, readInt12);
                    } else if (c9 != 2) {
                        jve.y(parcel, readInt12);
                    } else {
                        l5dVar = (l5d) jve.g(parcel, readInt12, l5d.CREATOR);
                    }
                }
                jve.m(parcel, z21);
                return new y4d(i4, l5dVar);
            case 12:
                int z22 = jve.z(parcel);
                n5d n5dVar = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i3 = jve.u(parcel, readInt13);
                    } else if (c10 == 2) {
                        ot2Var = (ot2) jve.g(parcel, readInt13, ot2.CREATOR);
                    } else if (c10 != 3) {
                        jve.y(parcel, readInt13);
                    } else {
                        n5dVar = (n5d) jve.g(parcel, readInt13, n5d.CREATOR);
                    }
                }
                jve.m(parcel, z22);
                return new e5d(i3, ot2Var, n5dVar);
            case 13:
                int z23 = jve.z(parcel);
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
                            i20 = jve.u(parcel, readInt14);
                            break;
                        case 2:
                            i21 = jve.u(parcel, readInt14);
                            break;
                        case 3:
                            i22 = jve.u(parcel, readInt14);
                            break;
                        case 4:
                            j3 = jve.w(parcel, readInt14);
                            break;
                        case 5:
                            j4 = jve.w(parcel, readInt14);
                            break;
                        case 6:
                            str18 = jve.h(parcel, readInt14);
                            break;
                        case 7:
                            str19 = jve.h(parcel, readInt14);
                            break;
                        case '\b':
                            i23 = jve.u(parcel, readInt14);
                            break;
                        case '\t':
                            i19 = jve.u(parcel, readInt14);
                            break;
                        default:
                            jve.y(parcel, readInt14);
                            break;
                    }
                }
                jve.m(parcel, z23);
                return new uf7(i20, i21, i22, j3, j4, str18, str19, i23, i19);
            case 14:
                int z24 = jve.z(parcel);
                int i24 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 1) {
                        i2 = jve.u(parcel, readInt15);
                    } else if (c11 == 2) {
                        account = (Account) jve.g(parcel, readInt15, Account.CREATOR);
                    } else if (c11 == 3) {
                        i24 = jve.u(parcel, readInt15);
                    } else if (c11 != 4) {
                        jve.y(parcel, readInt15);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) jve.g(parcel, readInt15, GoogleSignInAccount.CREATOR);
                    }
                }
                jve.m(parcel, z24);
                return new l5d(i2, account, i24, googleSignInAccount2);
            case 15:
                int z25 = jve.z(parcel);
                int i25 = 0;
                boolean z26 = false;
                boolean z27 = false;
                IBinder iBinder = null;
                ot2 ot2Var2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 1) {
                        i25 = jve.u(parcel, readInt16);
                    } else if (c12 == 2) {
                        iBinder = jve.t(parcel, readInt16);
                    } else if (c12 == 3) {
                        ot2Var2 = (ot2) jve.g(parcel, readInt16, ot2.CREATOR);
                    } else if (c12 == 4) {
                        z26 = jve.n(parcel, readInt16);
                    } else if (c12 != 5) {
                        jve.y(parcel, readInt16);
                    } else {
                        z27 = jve.n(parcel, readInt16);
                    }
                }
                jve.m(parcel, z25);
                return new n5d(i25, iBinder, ot2Var2, z26, z27);
            case 16:
                int z28 = jve.z(parcel);
                String str20 = "";
                String str21 = "";
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 4) {
                        str20 = jve.h(parcel, readInt17);
                    } else if (c13 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) jve.g(parcel, readInt17, GoogleSignInAccount.CREATOR);
                    } else if (c13 != '\b') {
                        jve.y(parcel, readInt17);
                    } else {
                        str21 = jve.h(parcel, readInt17);
                    }
                }
                jve.m(parcel, z28);
                return new SignInAccount(str20, googleSignInAccount, str21);
            case 17:
                int z29 = jve.z(parcel);
                boolean z30 = false;
                int i26 = 0;
                boolean z31 = false;
                gi0 gi0Var = null;
                di0 di0Var = null;
                String str22 = null;
                fi0 fi0Var = null;
                ei0 ei0Var = null;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            gi0Var = (gi0) jve.g(parcel, readInt18, gi0.CREATOR);
                            break;
                        case 2:
                            di0Var = (di0) jve.g(parcel, readInt18, di0.CREATOR);
                            break;
                        case 3:
                            str22 = jve.h(parcel, readInt18);
                            break;
                        case 4:
                            z30 = jve.n(parcel, readInt18);
                            break;
                        case 5:
                            i26 = jve.u(parcel, readInt18);
                            break;
                        case 6:
                            fi0Var = (fi0) jve.g(parcel, readInt18, fi0.CREATOR);
                            break;
                        case 7:
                            ei0Var = (ei0) jve.g(parcel, readInt18, ei0.CREATOR);
                            break;
                        case '\b':
                            z31 = jve.n(parcel, readInt18);
                            break;
                        default:
                            jve.y(parcel, readInt18);
                            break;
                    }
                }
                jve.m(parcel, z29);
                return new hi0(gi0Var, di0Var, str22, z30, i26, fi0Var, ei0Var, z31);
            case 18:
                int z32 = jve.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        jve.y(parcel, readInt19);
                    } else {
                        pendingIntent = (PendingIntent) jve.g(parcel, readInt19, PendingIntent.CREATOR);
                    }
                }
                jve.m(parcel, z32);
                return new ii0(pendingIntent);
            case 19:
                int z33 = jve.z(parcel);
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
                            z34 = jve.n(parcel, readInt20);
                            break;
                        case 2:
                            str23 = jve.h(parcel, readInt20);
                            break;
                        case 3:
                            str24 = jve.h(parcel, readInt20);
                            break;
                        case 4:
                            z35 = jve.n(parcel, readInt20);
                            break;
                        case 5:
                            str25 = jve.h(parcel, readInt20);
                            break;
                        case 6:
                            arrayList7 = jve.j(parcel, readInt20);
                            break;
                        case 7:
                            z36 = jve.n(parcel, readInt20);
                            break;
                        default:
                            jve.y(parcel, readInt20);
                            break;
                    }
                }
                jve.m(parcel, z33);
                return new di0(z34, str23, str24, z35, str25, arrayList7, z36);
            case 20:
                int z37 = jve.z(parcel);
                while (parcel.dataPosition() < z37) {
                    int readInt21 = parcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        z3 = jve.n(parcel, readInt21);
                    } else if (c14 != 2) {
                        jve.y(parcel, readInt21);
                    } else {
                        str2 = jve.h(parcel, readInt21);
                    }
                }
                jve.m(parcel, z37);
                return new ei0(str2, z3);
            case 21:
                int z38 = jve.z(parcel);
                String str26 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    char c15 = (char) readInt22;
                    if (c15 == 1) {
                        z2 = jve.n(parcel, readInt22);
                    } else if (c15 == 2) {
                        bArr = jve.b(parcel, readInt22);
                    } else if (c15 != 3) {
                        jve.y(parcel, readInt22);
                    } else {
                        str26 = jve.h(parcel, readInt22);
                    }
                }
                jve.m(parcel, z38);
                return new fi0(z2, bArr, str26);
            case 22:
                int z39 = jve.z(parcel);
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        jve.y(parcel, readInt23);
                    } else {
                        z = jve.n(parcel, readInt23);
                    }
                }
                jve.m(parcel, z39);
                return new gi0(z);
            case 23:
                int z40 = jve.z(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < z40) {
                    int readInt24 = parcel.readInt();
                    char c16 = (char) readInt24;
                    if (c16 == 2) {
                        str = jve.h(parcel, readInt24);
                    } else if (c16 != 5) {
                        jve.y(parcel, readInt24);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) jve.g(parcel, readInt24, GoogleSignInOptions.CREATOR);
                    }
                }
                jve.m(parcel, z40);
                return new SignInConfiguration(str, googleSignInOptions);
            case 24:
                int z41 = jve.z(parcel);
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                Uri uri3 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                lw8 lw8Var = null;
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str27 = jve.h(parcel, readInt25);
                            break;
                        case 2:
                            str28 = jve.h(parcel, readInt25);
                            break;
                        case 3:
                            str29 = jve.h(parcel, readInt25);
                            break;
                        case 4:
                            str30 = jve.h(parcel, readInt25);
                            break;
                        case 5:
                            uri3 = (Uri) jve.g(parcel, readInt25, Uri.CREATOR);
                            break;
                        case 6:
                            str31 = jve.h(parcel, readInt25);
                            break;
                        case 7:
                            str32 = jve.h(parcel, readInt25);
                            break;
                        case '\b':
                            str33 = jve.h(parcel, readInt25);
                            break;
                        case '\t':
                            lw8Var = (lw8) jve.g(parcel, readInt25, lw8.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt25);
                            break;
                    }
                }
                jve.m(parcel, z41);
                return new hja(str27, str28, str29, str30, uri3, str31, str32, str33, lw8Var);
            case 25:
                try {
                    return Transport.a(parcel.readString());
                } catch (c3c e) {
                    rjb.m(e);
                    return null;
                }
            case 26:
                try {
                    return bz.a(parcel.readString());
                } catch (az e2) {
                    rjb.m(e2);
                    return null;
                }
            case 27:
                int z42 = jve.z(parcel);
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
                ebc ebcVar = null;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            str34 = jve.h(parcel, readInt26);
                            break;
                        case 3:
                            str35 = jve.h(parcel, readInt26);
                            break;
                        case 4:
                            j5 = jve.w(parcel, readInt26);
                            break;
                        case 5:
                            str36 = jve.h(parcel, readInt26);
                            break;
                        case 6:
                            str37 = jve.h(parcel, readInt26);
                            break;
                        case 7:
                            str38 = jve.h(parcel, readInt26);
                            break;
                        case '\b':
                            str39 = jve.h(parcel, readInt26);
                            break;
                        case '\t':
                            str40 = jve.h(parcel, readInt26);
                            break;
                        case '\n':
                            str41 = jve.h(parcel, readInt26);
                            break;
                        case 11:
                            j6 = jve.w(parcel, readInt26);
                            break;
                        case '\f':
                            str42 = jve.h(parcel, readInt26);
                            break;
                        case '\r':
                            ebcVar = (ebc) jve.g(parcel, readInt26, ebc.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt26);
                            break;
                    }
                }
                jve.m(parcel, z42);
                return new y9(str34, str35, j5, str36, str37, str38, str39, str40, str41, j6, str42, ebcVar);
            case 28:
                int z43 = jve.z(parcel);
                boolean z44 = false;
                boolean z45 = false;
                String str43 = null;
                String str44 = null;
                IBinder iBinder2 = null;
                tn7 tn7Var = null;
                while (parcel.dataPosition() < z43) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            str43 = jve.h(parcel, readInt27);
                            break;
                        case 3:
                            str44 = jve.h(parcel, readInt27);
                            break;
                        case 4:
                            iBinder2 = jve.t(parcel, readInt27);
                            break;
                        case 5:
                            tn7Var = (tn7) jve.g(parcel, readInt27, tn7.CREATOR);
                            break;
                        case 6:
                            z44 = jve.n(parcel, readInt27);
                            break;
                        case 7:
                            z45 = jve.n(parcel, readInt27);
                            break;
                        default:
                            jve.y(parcel, readInt27);
                            break;
                    }
                }
                jve.m(parcel, z43);
                return new je1(str43, str44, iBinder2, tn7Var, z44, z45);
            default:
                int z46 = jve.z(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < z46) {
                    int readInt28 = parcel.readInt();
                    char c17 = (char) readInt28;
                    if (c17 == 2) {
                        latLng = (LatLng) jve.g(parcel, readInt28, LatLng.CREATOR);
                    } else if (c17 == 3) {
                        f = jve.r(parcel, readInt28);
                    } else if (c17 == 4) {
                        f2 = jve.r(parcel, readInt28);
                    } else if (c17 != 5) {
                        jve.y(parcel, readInt28);
                    } else {
                        f3 = jve.r(parcel, readInt28);
                    }
                }
                jve.m(parcel, z46);
                return new CameraPosition(latLng, f, f2, f3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nib[i];
            case 1:
                return new pg7[i];
            case 2:
                return new c3d[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new p3d[i];
            case 5:
                return new qg7[i];
            case 6:
                return new ep[i];
            case 7:
                return new DataHolder[i];
            case 8:
                return new GoogleSignInOptions[i];
            case 9:
                return new wuc[i];
            case 10:
                return new w4d[i];
            case 11:
                return new y4d[i];
            case 12:
                return new e5d[i];
            case 13:
                return new uf7[i];
            case 14:
                return new l5d[i];
            case 15:
                return new n5d[i];
            case 16:
                return new SignInAccount[i];
            case 17:
                return new hi0[i];
            case 18:
                return new ii0[i];
            case 19:
                return new di0[i];
            case 20:
                return new ei0[i];
            case 21:
                return new fi0[i];
            case 22:
                return new gi0[i];
            case 23:
                return new SignInConfiguration[i];
            case 24:
                return new hja[i];
            case 25:
                return new Transport[i];
            case 26:
                return new bz[i];
            case 27:
                return new y9[i];
            case 28:
                return new je1[i];
            default:
                return new CameraPosition[i];
        }
    }
}
