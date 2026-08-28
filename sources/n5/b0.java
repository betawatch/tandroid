package n5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import m6.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 extends y5.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(25);
    public final boolean a;

    public b0(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
