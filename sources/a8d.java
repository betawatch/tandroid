// default package

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class a8d extends c4 {
    public static final Parcelable.Creator<a8d> CREATOR = new s5d((byte) 14);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public a8d(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 2, this.b, i);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.k(parcel, 4, this.d, i);
        bye.s(parcel, r);
    }
}
