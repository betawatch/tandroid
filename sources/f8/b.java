package f8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new r(6);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.l(parcel, 2, this.b);
        p8.l(parcel, 3, this.c);
        int i10 = this.d;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.k(parcel, 5, this.e, i9);
        p8.r(parcel, q10);
    }
}
