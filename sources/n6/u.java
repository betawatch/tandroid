package n6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new m8.h(15);
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
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.e0.k(parcel, 2, this.b, i10);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.e0.k(parcel, 4, this.d, i10);
        w7.e0.r(parcel, q6);
    }
}
