package f8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends y5.a {
    public static final Parcelable.Creator<l> CREATOR = new r(0);
    public int a;
    public Bundle b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.b(parcel, 3, this.b);
        p8.r(parcel, q10);
    }
}
