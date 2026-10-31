package n6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new m8.i(12);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public u(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.a = i10;
        this.b = account;
        this.c = i11;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.h0.k(parcel, 2, this.b, i10);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.h0.k(parcel, 4, this.d, i10);
        w7.h0.r(parcel, q6);
    }
}
