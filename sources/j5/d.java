package j5;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import h7.q8;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = q8.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j10 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = q8.u(parcel, readInt);
                            break;
                        case 2:
                            str = q8.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = q8.h(parcel, readInt);
                            break;
                        case 4:
                            str3 = q8.h(parcel, readInt);
                            break;
                        case 5:
                            str4 = q8.h(parcel, readInt);
                            break;
                        case 6:
                            uri = (Uri) q8.g(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = q8.h(parcel, readInt);
                            break;
                        case '\b':
                            j10 = q8.w(parcel, readInt);
                            break;
                        case '\t':
                            str6 = q8.h(parcel, readInt);
                            break;
                        case '\n':
                            arrayList = q8.l(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = q8.h(parcel, readInt);
                            break;
                        case '\f':
                            str8 = q8.h(parcel, readInt);
                            break;
                        default:
                            q8.y(parcel, readInt);
                            break;
                    }
                }
                q8.m(parcel, z10);
                return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
            case 1:
                int z11 = q8.z(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i11 = 0;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = q8.u(parcel, readInt2);
                            break;
                        case 2:
                            arrayList3 = q8.l(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) q8.g(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z12 = q8.n(parcel, readInt2);
                            break;
                        case 5:
                            z13 = q8.n(parcel, readInt2);
                            break;
                        case 6:
                            z14 = q8.n(parcel, readInt2);
                            break;
                        case 7:
                            str9 = q8.h(parcel, readInt2);
                            break;
                        case '\b':
                            str10 = q8.h(parcel, readInt2);
                            break;
                        case '\t':
                            arrayList2 = q8.l(parcel, readInt2, k5.a.CREATOR);
                            break;
                        case '\n':
                            str11 = q8.h(parcel, readInt2);
                            break;
                        default:
                            q8.y(parcel, readInt2);
                            break;
                    }
                }
                q8.m(parcel, z11);
                return new GoogleSignInOptions(i11, arrayList3, account, z12, z13, z14, str9, str10, GoogleSignInOptions.c(arrayList2), str11);
            default:
                int z15 = q8.z(parcel);
                String str12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = "";
                while (parcel.dataPosition() < z15) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 4) {
                        str12 = q8.h(parcel, readInt3);
                    } else if (c10 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) q8.g(parcel, readInt3, GoogleSignInAccount.CREATOR);
                    } else if (c10 != '\b') {
                        q8.y(parcel, readInt3);
                    } else {
                        str13 = q8.h(parcel, readInt3);
                    }
                }
                q8.m(parcel, z15);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
