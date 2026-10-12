package n6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(13);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public v(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.a = i10;
        this.b = account;
        this.c = i11;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.g0.k(parcel, 2, this.b, i10);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.g0.k(parcel, 4, this.d, i10);
        w7.g0.r(parcel, q6);
    }
}
