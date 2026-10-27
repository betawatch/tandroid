package o6;

import a8.df;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u extends p6.a {
    public static final Parcelable.Creator<u> CREATOR = new n4.x(13);
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
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.k(parcel, 2, this.b, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
