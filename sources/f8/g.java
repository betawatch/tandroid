package f8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new r(13);
    public final int a;
    public final String b;
    public final CommonWalletObject c;

    public g(int i9, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i9;
        this.b = str2;
        if (i9 >= 3) {
            this.c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.a = str;
        this.c = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.l(parcel, 3, this.b);
        p8.k(parcel, 4, this.c, i9);
        p8.r(parcel, q10);
    }
}
