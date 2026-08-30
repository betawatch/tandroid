package b6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new w.a(22);
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
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.k(parcel, 2, this.b, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        f5.k(parcel, 4, this.d, i10);
        f5.r(parcel, q10);
    }
}
