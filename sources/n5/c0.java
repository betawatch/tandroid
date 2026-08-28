package n5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import m6.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c0 extends y5.a {
    public static final Parcelable.Creator<c0> CREATOR = new r0(26);
    public final int a;

    public c0(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.r(parcel, q10);
    }
}
